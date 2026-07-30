package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@Deprecated
/* loaded from: classes3.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final Requirements DEFAULT_REQUIREMENTS = new Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 6;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 10;
    private static final int MSG_DOWNLOAD_UPDATE = 2;
    private static final int MSG_INITIALIZE = 0;
    private static final int MSG_INITIALIZED = 0;
    private static final int MSG_PROCESSED = 1;
    private static final int MSG_RELEASE = 12;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 8;
    private static final int MSG_REMOVE_DOWNLOAD = 7;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 1;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 4;
    private static final int MSG_SET_MIN_RETRY_COUNT = 5;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 2;
    private static final int MSG_SET_STOP_REASON = 3;
    private static final int MSG_TASK_STOPPED = 9;
    private static final int MSG_UPDATE_PROGRESS = 11;
    private static final String TAG = "DownloadManager";
    private int activeTaskCount;
    private final Handler applicationHandler;
    private final Context context;
    private final WritableDownloadIndex downloadIndex;
    private List<Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final InternalHandler internalHandler;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final RequirementsWatcher.Listener requirementsListener;
    private RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    private static final class DownloadUpdate {
        public final Download download;
        public final List<Download> downloads;

        @Nullable
        public final Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(Download download, boolean z7, List<Download> list, @Nullable Exception exc) {
            this.download = download;
            this.isRemove = z7;
            this.downloads = list;
            this.finalException = exc;
        }
    }

    public interface Listener {
        void onDownloadChanged(DownloadManager downloadManager, Download download, @Nullable Exception exc);

        void onDownloadRemoved(DownloadManager downloadManager, Download download);

        void onDownloadsPausedChanged(DownloadManager downloadManager, boolean z7);

        void onIdle(DownloadManager downloadManager);

        void onInitialized(DownloadManager downloadManager);

        void onRequirementsStateChanged(DownloadManager downloadManager, Requirements requirements, int i8);

        void onWaitingForRequirementsChanged(DownloadManager downloadManager, boolean z7);
    }

    private static class Task extends Thread implements Downloader.ProgressListener {
        private long contentLength;
        private final DownloadProgress downloadProgress;
        private final Downloader downloader;

        @Nullable
        private Exception finalException;

        @Nullable
        private volatile InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final DownloadRequest request;

        private static int getRetryDelayMillis(int i8) {
            return Math.min((i8 - 1) * 1000, 5000);
        }

        public void cancel(boolean z7) {
            if (z7) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.Downloader.ProgressListener
        public void onProgress(long j8, long j9, float f8) {
            this.downloadProgress.bytesDownloaded = j9;
            this.downloadProgress.percentDownloaded = f8;
            if (j8 != this.contentLength) {
                this.contentLength = j8;
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(10, (int) (j8 >> 32), (int) j8, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j8 = -1;
                    int i8 = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (IOException e8) {
                            if (!this.isCanceled) {
                                long j9 = this.downloadProgress.bytesDownloaded;
                                if (j9 != j8) {
                                    j8 = j9;
                                    i8 = 0;
                                }
                                i8++;
                                if (i8 > this.minRetryCount) {
                                    throw e8;
                                }
                                Thread.sleep(getRetryDelayMillis(i8));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e9) {
                this.finalException = e9;
            }
            InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(9, this).sendToTarget();
            }
        }

        private Task(DownloadRequest downloadRequest, Downloader downloader, DownloadProgress downloadProgress, boolean z7, int i8, InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z7;
            this.minRetryCount = i8;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }
    }

    public DownloadManager(Context context, DatabaseProvider databaseProvider, Cache cache, DataSource.Factory factory, Executor executor) {
        this(context, new DefaultDownloadIndex(databaseProvider), new DefaultDownloaderFactory(new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(Message message) {
        int i8 = message.what;
        if (i8 == 0) {
            onInitialized((List) message.obj);
        } else if (i8 == 1) {
            onMessageProcessed(message.arg1, message.arg2);
        } else {
            if (i8 != 2) {
                throw new IllegalStateException();
            }
            onDownloadUpdate((DownloadUpdate) message.obj);
        }
        return true;
    }

    static Download mergeRequest(Download download, DownloadRequest downloadRequest, int i8, long j8) {
        int i9 = download.state;
        return new Download(download.request.copyWithMergedRequest(downloadRequest), (i9 == 5 || i9 == 7) ? 7 : i8 != 0 ? 1 : 0, (i9 == 5 || download.isTerminalState()) ? j8 : download.startTimeMs, j8, -1L, i8, 0);
    }

    private void notifyWaitingForRequirementsChanged() {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    private void onDownloadUpdate(DownloadUpdate downloadUpdate) {
        this.downloads = Collections.unmodifiableList(downloadUpdate.downloads);
        Download download = downloadUpdate.download;
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            Iterator<Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onInitialized(List<Download> list) {
        this.initialized = true;
        this.downloads = Collections.unmodifiableList(list);
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i8, int i9) {
        this.pendingMessages -= i8;
        this.activeTaskCount = i9;
        if (isIdle()) {
            Iterator<Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i8) {
        Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i8) {
            this.notMetRequirements = i8;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(2, i8, 0).sendToTarget();
        }
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i8);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void setDownloadsPaused(boolean z7) {
        if (this.downloadsPaused == z7) {
            return;
        }
        this.downloadsPaused = z7;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(1, z7 ? 1 : 0, 0).sendToTarget();
        boolean updateWaitingForRequirements = updateWaitingForRequirements();
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z7);
        }
        if (updateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z7;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            for (int i8 = 0; i8 < this.downloads.size(); i8++) {
                if (this.downloads.get(i8).state == 0) {
                    z7 = true;
                    break;
                }
            }
        }
        z7 = false;
        boolean z8 = this.waitingForRequirements != z7;
        this.waitingForRequirements = z7;
        return z8;
    }

    public void addDownload(DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addListener(Listener listener) {
        Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public List<Download> getCurrentDownloads() {
        return this.downloads;
    }

    public DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void release() {
        synchronized (this.internalHandler) {
            try {
                InternalHandler internalHandler = this.internalHandler;
                if (internalHandler.released) {
                    return;
                }
                internalHandler.sendEmptyMessage(12);
                boolean z7 = false;
                while (true) {
                    InternalHandler internalHandler2 = this.internalHandler;
                    if (internalHandler2.released) {
                        break;
                    }
                    try {
                        internalHandler2.wait();
                    } catch (InterruptedException unused) {
                        z7 = true;
                    }
                }
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                this.applicationHandler.removeCallbacksAndMessages(null);
                this.requirementsWatcher.stop();
                this.downloads = Collections.emptyList();
                this.pendingMessages = 0;
                this.activeTaskCount = 0;
                this.initialized = false;
                this.notMetRequirements = 0;
                this.waitingForRequirements = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8).sendToTarget();
    }

    public void removeDownload(String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, str).sendToTarget();
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void setMaxParallelDownloads(@IntRange(from = 1) int i8) {
        Assertions.checkArgument(i8 > 0);
        if (this.maxParallelDownloads == i8) {
            return;
        }
        this.maxParallelDownloads = i8;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i8, 0).sendToTarget();
    }

    public void setMinRetryCount(int i8) {
        Assertions.checkArgument(i8 >= 0);
        if (this.minRetryCount == i8) {
            return;
        }
        this.minRetryCount = i8;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i8, 0).sendToTarget();
    }

    public void setRequirements(Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public void setStopReason(@Nullable String str, int i8) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(3, i8, 0, str).sendToTarget();
    }

    public void addDownload(DownloadRequest downloadRequest, int i8) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i8, 0, downloadRequest).sendToTarget();
    }

    public DownloadManager(Context context, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = Collections.emptyList();
        this.listeners = new CopyOnWriteArraySet<>();
        Handler createHandlerForCurrentOrMainLooper = Util.createHandlerForCurrentOrMainLooper(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean handleMainMessage;
                handleMainMessage = DownloadManager.this.handleMainMessage(message);
                return handleMainMessage;
            }
        });
        this.applicationHandler = createHandlerForCurrentOrMainLooper;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        InternalHandler internalHandler = new InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, createHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        RequirementsWatcher.Listener listener = new RequirementsWatcher.Listener() { // from class: com.google.android.exoplayer2.offline.k
            @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i8) {
                DownloadManager.this.onRequirementsStateChanged(requirementsWatcher, i8);
            }
        };
        this.requirementsListener = listener;
        RequirementsWatcher requirementsWatcher = new RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int start = requirementsWatcher.start();
        this.notMetRequirements = start;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(0, start, 0).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InternalHandler extends Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final HashMap<String, Task> activeTasks;
        private final WritableDownloadIndex downloadIndex;
        private final DownloaderFactory downloaderFactory;
        private final ArrayList<Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final HandlerThread thread;

        public InternalHandler(HandlerThread handlerThread, WritableDownloadIndex writableDownloadIndex, DownloaderFactory downloaderFactory, Handler handler, int i8, int i9, boolean z7) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i8;
            this.minRetryCount = i9;
            this.downloadsPaused = z7;
            this.downloads = new ArrayList<>();
            this.activeTasks = new HashMap<>();
        }

        private void addDownload(DownloadRequest downloadRequest, int i8) {
            Download download = getDownload(downloadRequest.id, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (download != null) {
                putDownload(DownloadManager.mergeRequest(download, downloadRequest, i8, currentTimeMillis));
            } else {
                putDownload(new Download(downloadRequest, i8 != 0 ? 1 : 0, currentTimeMillis, currentTimeMillis, -1L, i8, 0));
            }
            syncTasks();
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(Download download, Download download2) {
            return Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }

        private static Download copyDownloadWithState(Download download, int i8, int i9) {
            return new Download(download.request, i8, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i9, 0, download.progress);
        }

        @Nullable
        private Download getDownload(String str, boolean z7) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z7) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (IOException e8) {
                Log.e(DownloadManager.TAG, "Failed to load download: " + str, e8);
                return null;
            }
        }

        private int getDownloadIndex(String str) {
            for (int i8 = 0; i8 < this.downloads.size(); i8++) {
                if (this.downloads.get(i8).request.id.equals(str)) {
                    return i8;
                }
            }
            return -1;
        }

        private void initialize(int i8) {
            this.notMetRequirements = i8;
            DownloadCursor downloadCursor = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloadCursor = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloadCursor.moveToNext()) {
                        this.downloads.add(downloadCursor.getDownload());
                    }
                } catch (IOException e8) {
                    Log.e(DownloadManager.TAG, "Failed to load index.", e8);
                    this.downloads.clear();
                }
                this.mainHandler.obtainMessage(0, new ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } finally {
                Util.closeQuietly(downloadCursor);
            }
        }

        private void onContentLengthChanged(Task task, long j8) {
            Download download = (Download) Assertions.checkNotNull(getDownload(task.request.id, false));
            if (j8 == download.contentLength || j8 == -1) {
                return;
            }
            putDownload(new Download(download.request, download.state, download.startTimeMs, System.currentTimeMillis(), j8, download.stopReason, download.failureReason, download.progress));
        }

        private void onDownloadTaskStopped(Download download, @Nullable Exception exc) {
            Download download2 = new Download(download.request, exc == null ? 3 : 4, download.startTimeMs, System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (IOException e8) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e8);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download2, false, new ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(Download download) {
            if (download.state == 7) {
                int i8 = download.stopReason;
                putDownloadWithState(download, i8 == 0 ? 0 : 1, i8);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.id));
                try {
                    this.downloadIndex.removeDownload(download.request.id);
                } catch (IOException unused) {
                    Log.e(DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(2, new DownloadUpdate(download, true, new ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void onTaskStopped(Task task) {
            String str = task.request.id;
            this.activeTasks.remove(str);
            boolean z7 = task.isRemove;
            if (z7) {
                this.hasActiveRemoveTask = false;
            } else {
                int i8 = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i8;
                if (i8 == 0) {
                    removeMessages(11);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            Exception exc = task.finalException;
            if (exc != null) {
                Log.e(DownloadManager.TAG, "Task failed: " + task.request + ", " + z7, exc);
            }
            Download download = (Download) Assertions.checkNotNull(getDownload(str, false));
            int i9 = download.state;
            if (i9 == 2) {
                Assertions.checkState(!z7);
                onDownloadTaskStopped(download, exc);
            } else {
                if (i9 != 5 && i9 != 7) {
                    throw new IllegalStateException();
                }
                Assertions.checkState(z7);
                onRemoveTaskStopped(download);
            }
            syncTasks();
        }

        private Download putDownload(Download download) {
            int i8 = download.state;
            Assertions.checkState((i8 == 3 || i8 == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                Collections.sort(this.downloads, new l());
            } else {
                boolean z7 = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z7) {
                    Collections.sort(this.downloads, new l());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (IOException e8) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e8);
            }
            this.mainHandler.obtainMessage(2, new DownloadUpdate(download, false, new ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private Download putDownloadWithState(Download download, int i8, int i9) {
            Assertions.checkState((i8 == 3 || i8 == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i8, i9));
        }

        private void release() {
            Iterator<Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (IOException e8) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e8);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void removeAllDownloads() {
            ArrayList arrayList = new ArrayList();
            try {
                DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } finally {
                    }
                }
                downloads.close();
            } catch (IOException unused) {
                Log.e(DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i8 = 0; i8 < this.downloads.size(); i8++) {
                ArrayList<Download> arrayList2 = this.downloads;
                arrayList2.set(i8, copyDownloadWithState(arrayList2.get(i8), 5, 0));
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                this.downloads.add(copyDownloadWithState((Download) arrayList.get(i9), 5, 0));
            }
            Collections.sort(this.downloads, new l());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (IOException e8) {
                Log.e(DownloadManager.TAG, "Failed to update index.", e8);
            }
            ArrayList arrayList3 = new ArrayList(this.downloads);
            for (int i10 = 0; i10 < this.downloads.size(); i10++) {
                this.mainHandler.obtainMessage(2, new DownloadUpdate(this.downloads.get(i10), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void removeDownload(String str) {
            Download download = getDownload(str, true);
            if (download != null) {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            } else {
                Log.e(DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
            }
        }

        private void setDownloadsPaused(boolean z7) {
            this.downloadsPaused = z7;
            syncTasks();
        }

        private void setMaxParallelDownloads(int i8) {
            this.maxParallelDownloads = i8;
            syncTasks();
        }

        private void setMinRetryCount(int i8) {
            this.minRetryCount = i8;
        }

        private void setNotMetRequirements(int i8) {
            this.notMetRequirements = i8;
            syncTasks();
        }

        private void setStopReason(@Nullable String str, int i8) {
            if (str == null) {
                for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                    setStopReason(this.downloads.get(i9), i8);
                }
                try {
                    this.downloadIndex.setStopReason(i8);
                } catch (IOException e8) {
                    Log.e(DownloadManager.TAG, "Failed to set manual stop reason", e8);
                }
            } else {
                Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i8);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i8);
                    } catch (IOException e9) {
                        Log.e(DownloadManager.TAG, "Failed to set manual stop reason: " + str, e9);
                    }
                }
            }
            syncTasks();
        }

        private void syncDownloadingDownload(Task task, Download download, int i8) {
            Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i8 >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        @Nullable
        @CheckResult
        private Task syncQueuedDownload(@Nullable Task task, Download download) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
                return task;
            }
            if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                return null;
            }
            Download putDownloadWithState = putDownloadWithState(download, 2, 0);
            Task task2 = new Task(putDownloadWithState.request, this.downloaderFactory.createDownloader(putDownloadWithState.request), putDownloadWithState.progress, false, this.minRetryCount, this);
            this.activeTasks.put(putDownloadWithState.request.id, task2);
            int i8 = this.activeDownloadTaskCount;
            this.activeDownloadTaskCount = i8 + 1;
            if (i8 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            task2.start();
            return task2;
        }

        private void syncRemovingDownload(@Nullable Task task, Download download) {
            if (task != null) {
                if (task.isRemove) {
                    return;
                }
                task.cancel(false);
            } else {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                Task task2 = new Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
            }
        }

        private void syncStoppedDownload(@Nullable Task task) {
            if (task != null) {
                Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        private void syncTasks() {
            int i8 = 0;
            for (int i9 = 0; i9 < this.downloads.size(); i9++) {
                Download download = this.downloads.get(i9);
                Task task = this.activeTasks.get(download.request.id);
                int i10 = download.state;
                if (i10 == 0) {
                    task = syncQueuedDownload(task, download);
                } else if (i10 == 1) {
                    syncStoppedDownload(task);
                } else if (i10 == 2) {
                    Assertions.checkNotNull(task);
                    syncDownloadingDownload(task, download, i8);
                } else {
                    if (i10 != 5 && i10 != 7) {
                        throw new IllegalStateException();
                    }
                    syncRemovingDownload(task, download);
                }
                if (task != null && !task.isRemove) {
                    i8++;
                }
            }
        }

        private void updateProgress() {
            for (int i8 = 0; i8 < this.downloads.size(); i8++) {
                Download download = this.downloads.get(i8);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (IOException e8) {
                        Log.e(DownloadManager.TAG, "Failed to update index.", e8);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = 0;
            switch (message.what) {
                case 0:
                    initialize(message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 1:
                    setDownloadsPaused(message.arg1 != 0);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 2:
                    setNotMetRequirements(message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 3:
                    setStopReason((String) message.obj, message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 4:
                    setMaxParallelDownloads(message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 5:
                    setMinRetryCount(message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 6:
                    addDownload((DownloadRequest) message.obj, message.arg1);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 7:
                    removeDownload((String) message.obj);
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeAllDownloads();
                    i8 = 1;
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    onTaskStopped((Task) message.obj);
                    this.mainHandler.obtainMessage(1, i8, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onContentLengthChanged((Task) message.obj, Util.toLong(message.arg1, message.arg2));
                    return;
                case 11:
                    updateProgress();
                    return;
                case 12:
                    release();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        private void setStopReason(Download download, int i8) {
            if (i8 == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i8 != download.stopReason) {
                int i9 = download.state;
                if (i9 == 0 || i9 == 2) {
                    i9 = 1;
                }
                putDownload(new Download(download.request, i9, download.startTimeMs, System.currentTimeMillis(), download.contentLength, i8, 0, download.progress));
            }
        }
    }
}
