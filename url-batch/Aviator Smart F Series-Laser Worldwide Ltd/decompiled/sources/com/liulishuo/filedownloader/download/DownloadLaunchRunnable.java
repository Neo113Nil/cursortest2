package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.a0;
import com.liulishuo.filedownloader.download.ConnectTask;
import com.liulishuo.filedownloader.download.a;
import com.liulishuo.filedownloader.download.c;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class DownloadLaunchRunnable implements Runnable, f {
    private static final ThreadPoolExecutor DOWNLOAD_EXECUTOR = com.liulishuo.filedownloader.util.b.newFixedThreadPool("ConnectionBlock");
    private static final int HTTP_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    private static final int TOTAL_VALUE_IN_CHUNKED_RESOURCE = -1;
    private boolean acceptPartial;
    private final AtomicBoolean alive;
    private final com.liulishuo.filedownloader.database.a database;
    private final int defaultConnectionCount;
    private final ArrayList<c> downloadRunnableList;
    private volatile boolean error;
    private volatile Exception errorException;
    private boolean isChunked;
    private final boolean isForceReDownload;
    private boolean isNeedForceDiscardRange;
    private boolean isResumeAvailableOnDB;
    private boolean isSingleConnection;
    private boolean isTriedFixRangeNotSatisfiable;
    private final boolean isWifiRequired;
    private long lastCallbackBytes;
    private long lastCallbackTimestamp;
    private long lastUpdateBytes;
    private long lastUpdateTimestamp;
    private final FileDownloadModel model;
    private volatile boolean paused;
    private String redirectedUrl;
    private c singleDownloadRunnable;
    private final d statusCallback;
    private final boolean supportSeek;
    private final a0 threadPoolMonitor;
    private final FileDownloadHeader userRequestHeader;
    int validRetryTimes;

    class DiscardSafely extends Throwable {
        DiscardSafely() {
        }
    }

    class RetryDirectly extends Throwable {
        RetryDirectly() {
        }
    }

    public static class b {
        private Integer callbackProgressMaxCount;
        private FileDownloadHeader header;
        private Boolean isForceReDownload;
        private Boolean isWifiRequired;
        private Integer maxRetryTimes;
        private Integer minIntervalMillis;
        private FileDownloadModel model;
        private a0 threadPoolMonitor;

        public DownloadLaunchRunnable build() {
            if (this.model == null || this.threadPoolMonitor == null || this.minIntervalMillis == null || this.callbackProgressMaxCount == null || this.isForceReDownload == null || this.isWifiRequired == null || this.maxRetryTimes == null) {
                throw new IllegalArgumentException();
            }
            return new DownloadLaunchRunnable(this.model, this.header, this.threadPoolMonitor, this.minIntervalMillis.intValue(), this.callbackProgressMaxCount.intValue(), this.isForceReDownload.booleanValue(), this.isWifiRequired.booleanValue(), this.maxRetryTimes.intValue());
        }

        public b setCallbackProgressMaxCount(Integer num) {
            this.callbackProgressMaxCount = num;
            return this;
        }

        public b setForceReDownload(Boolean bool) {
            this.isForceReDownload = bool;
            return this;
        }

        public b setHeader(FileDownloadHeader fileDownloadHeader) {
            this.header = fileDownloadHeader;
            return this;
        }

        public b setMaxRetryTimes(Integer num) {
            this.maxRetryTimes = num;
            return this;
        }

        public b setMinIntervalMillis(Integer num) {
            this.minIntervalMillis = num;
            return this;
        }

        public b setModel(FileDownloadModel fileDownloadModel) {
            this.model = fileDownloadModel;
            return this;
        }

        public b setThreadPoolMonitor(a0 a0Var) {
            this.threadPoolMonitor = a0Var;
            return this;
        }

        public b setWifiRequired(Boolean bool) {
            this.isWifiRequired = bool;
            return this;
        }
    }

    private int calcConnectionCount(long j8) {
        if (isMultiConnectionAvailable()) {
            return this.isResumeAvailableOnDB ? this.model.getConnectionCount() : com.liulishuo.filedownloader.download.b.getImpl().determineConnectionCount(this.model.getId(), this.model.getUrl(), this.model.getPath(), j8);
        }
        return 1;
    }

    private void checkupAfterGetFilename() {
        int id = this.model.getId();
        if (this.model.isPathAsDirectory()) {
            String targetFilePath = this.model.getTargetFilePath();
            int generateId = com.liulishuo.filedownloader.util.f.generateId(this.model.getUrl(), targetFilePath);
            if (com.liulishuo.filedownloader.util.c.inspectAndInflowDownloaded(id, targetFilePath, this.isForceReDownload, false)) {
                this.database.remove(id);
                this.database.removeConnections(id);
                throw new DiscardSafely();
            }
            FileDownloadModel find = this.database.find(generateId);
            if (find != null) {
                if (com.liulishuo.filedownloader.util.c.inspectAndInflowDownloading(id, find, this.threadPoolMonitor, false)) {
                    this.database.remove(id);
                    this.database.removeConnections(id);
                    throw new DiscardSafely();
                }
                List<com.liulishuo.filedownloader.model.a> findConnectionModel = this.database.findConnectionModel(generateId);
                this.database.remove(generateId);
                this.database.removeConnections(generateId);
                com.liulishuo.filedownloader.util.f.deleteTargetFile(this.model.getTargetFilePath());
                if (com.liulishuo.filedownloader.util.f.isBreakpointAvailable(generateId, find)) {
                    this.model.setSoFar(find.getSoFar());
                    this.model.setTotal(find.getTotal());
                    this.model.setETag(find.getETag());
                    this.model.setConnectionCount(find.getConnectionCount());
                    this.database.update(this.model);
                    if (findConnectionModel != null) {
                        for (com.liulishuo.filedownloader.model.a aVar : findConnectionModel) {
                            aVar.setId(id);
                            this.database.insertConnectionModel(aVar);
                        }
                    }
                    throw new RetryDirectly();
                }
            }
            if (com.liulishuo.filedownloader.util.c.inspectAndInflowConflictPath(id, this.model.getSoFar(), this.model.getTempFilePath(), targetFilePath, this.threadPoolMonitor)) {
                this.database.remove(id);
                this.database.removeConnections(id);
                throw new DiscardSafely();
            }
        }
    }

    private void checkupBeforeConnect() {
        if (this.isWifiRequired && !com.liulishuo.filedownloader.util.f.checkPermission("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(com.liulishuo.filedownloader.util.f.formatString("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.model.getId()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.isWifiRequired && com.liulishuo.filedownloader.util.f.isNetworkNotOnWifiType()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    static DownloadLaunchRunnable createForTest(d dVar, FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, a0 a0Var, int i8, int i9, boolean z7, boolean z8, int i10) {
        return new DownloadLaunchRunnable(dVar, fileDownloadModel, fileDownloadHeader, a0Var, i8, i9, z7, z8, i10);
    }

    private int determineConnectionCount() {
        return 5;
    }

    private void fetchWithMultipleConnection(List<com.liulishuo.filedownloader.model.a> list, long j8) {
        int id = this.model.getId();
        String eTag = this.model.getETag();
        String str = this.redirectedUrl;
        if (str == null) {
            str = this.model.getUrl();
        }
        String tempFilePath = this.model.getTempFilePath();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(id), Long.valueOf(j8));
        }
        boolean z7 = this.isResumeAvailableOnDB;
        long j9 = 0;
        long j10 = 0;
        for (com.liulishuo.filedownloader.model.a aVar : list) {
            long currentOffset = aVar.getEndOffset() == -1 ? j8 - aVar.getCurrentOffset() : (aVar.getEndOffset() - aVar.getCurrentOffset()) + 1;
            j10 += aVar.getCurrentOffset() - aVar.getStartOffset();
            if (currentOffset != j9) {
                c build = new c.b().setId(id).setConnectionIndex(Integer.valueOf(aVar.getIndex())).setCallback(this).setUrl(str).setEtag(z7 ? eTag : null).setHeader(this.userRequestHeader).setWifiRequired(this.isWifiRequired).setConnectionModel(a.b.buildConnectionProfile(aVar.getStartOffset(), aVar.getCurrentOffset(), aVar.getEndOffset(), currentOffset)).setPath(tempFilePath).build();
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.d(this, "enable multiple connection: %s", aVar);
                }
                if (build == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.downloadRunnableList.add(build);
            } else if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.getId()), Integer.valueOf(aVar.getIndex()));
            }
            j9 = 0;
        }
        if (j10 != this.model.getSoFar()) {
            com.liulishuo.filedownloader.util.d.w(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.model.getSoFar()), Long.valueOf(j10));
            this.model.setSoFar(j10);
        }
        ArrayList arrayList = new ArrayList(this.downloadRunnableList.size());
        Iterator<c> it = this.downloadRunnableList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (this.paused) {
                next.pause();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.paused) {
            this.model.setStatus((byte) -2);
            return;
        }
        List<Future> invokeAll = DOWNLOAD_EXECUTOR.invokeAll(arrayList);
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            for (Future future : invokeAll) {
                com.liulishuo.filedownloader.util.d.d(this, "finish sub-task for [%d] %B %B", Integer.valueOf(id), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    private void handlePreAllocate(long j8, String str) {
        com.liulishuo.filedownloader.stream.a aVar = null;
        if (j8 != -1) {
            try {
                aVar = com.liulishuo.filedownloader.util.f.createOutputStream(this.model.getTempFilePath());
                long length = new File(str).length();
                long j9 = j8 - length;
                long freeSpaceBytes = com.liulishuo.filedownloader.util.f.getFreeSpaceBytes(str);
                if (freeSpaceBytes < j9) {
                    throw new FileDownloadOutOfSpaceException(freeSpaceBytes, j9, length);
                }
                if (!com.liulishuo.filedownloader.util.e.getImpl().fileNonPreAllocation) {
                    aVar.setLength(j8);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    aVar.close();
                }
                throw th;
            }
        }
        if (aVar != null) {
            aVar.close();
        }
    }

    private void handleTrialConnectResult(Map<String, List<String>> map, ConnectTask connectTask, com.liulishuo.filedownloader.connection.b bVar) {
        int id = this.model.getId();
        int responseCode = bVar.getResponseCode();
        this.acceptPartial = com.liulishuo.filedownloader.util.f.isAcceptRange(responseCode, bVar);
        boolean z7 = responseCode == 200 || responseCode == 201 || responseCode == 0;
        long findInstanceLengthForTrial = com.liulishuo.filedownloader.util.f.findInstanceLengthForTrial(bVar);
        String eTag = this.model.getETag();
        String findEtag = com.liulishuo.filedownloader.util.f.findEtag(id, bVar);
        if (responseCode != 412 && ((eTag == null || eTag.equals(findEtag) || (!z7 && !this.acceptPartial)) && (responseCode != 201 || !connectTask.isRangeNotFromBeginning()))) {
            if (responseCode == 416) {
                if (this.acceptPartial && findInstanceLengthForTrial >= 0) {
                    com.liulishuo.filedownloader.util.d.w(this, "get 416 but the Content-Range is returned, no need to retry", new Object[0]);
                } else if (this.model.getSoFar() > 0) {
                    com.liulishuo.filedownloader.util.d.w(this, "get 416, precondition failed and just retry", new Object[0]);
                } else if (!this.isNeedForceDiscardRange) {
                    this.isNeedForceDiscardRange = true;
                    com.liulishuo.filedownloader.util.d.w(this, "get 416, precondition failed and need to retry with discarding range", new Object[0]);
                }
            }
            this.redirectedUrl = connectTask.getFinalRedirectedUrl();
            if (!this.acceptPartial && !z7) {
                throw new FileDownloadHttpException(responseCode, map, bVar.getResponseHeaderFields());
            }
            String findFilename = this.model.isPathAsDirectory() ? com.liulishuo.filedownloader.util.f.findFilename(bVar, this.model.getUrl()) : null;
            this.isChunked = findInstanceLengthForTrial == -1;
            this.statusCallback.onConnected(this.isResumeAvailableOnDB && this.acceptPartial, findInstanceLengthForTrial, findEtag, findFilename);
            return;
        }
        if (this.isResumeAvailableOnDB) {
            com.liulishuo.filedownloader.util.d.w(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d", Integer.valueOf(id), eTag, findEtag, Integer.valueOf(responseCode));
        }
        this.database.removeConnections(this.model.getId());
        com.liulishuo.filedownloader.util.f.deleteTaskFiles(this.model.getTargetFilePath(), this.model.getTempFilePath());
        this.isResumeAvailableOnDB = false;
        if (eTag != null && eTag.equals(findEtag)) {
            com.liulishuo.filedownloader.util.d.w(this, "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", eTag, findEtag, Integer.valueOf(responseCode), Integer.valueOf(id));
            findEtag = null;
        }
        this.model.setSoFar(0L);
        this.model.setTotal(0L);
        this.model.setETag(findEtag);
        this.model.resetConnectionCount();
        this.database.updateOldEtagOverdue(id, this.model.getETag(), this.model.getSoFar(), this.model.getTotal(), this.model.getConnectionCount());
        throw new RetryDirectly();
    }

    private boolean isMultiConnectionAvailable() {
        return (!this.isResumeAvailableOnDB || this.model.getConnectionCount() > 1) && this.acceptPartial && this.supportSeek && !this.isChunked;
    }

    private void realDownloadWithMultiConnectionFromBeginning(long j8, int i8) {
        long j9 = j8 / i8;
        int id = this.model.getId();
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i9 = 0;
        while (i9 < i8) {
            long j11 = i9 == i8 + (-1) ? -1L : (j10 + j9) - 1;
            com.liulishuo.filedownloader.model.a aVar = new com.liulishuo.filedownloader.model.a();
            aVar.setId(id);
            aVar.setIndex(i9);
            aVar.setStartOffset(j10);
            aVar.setCurrentOffset(j10);
            aVar.setEndOffset(j11);
            arrayList.add(aVar);
            this.database.insertConnectionModel(aVar);
            j10 += j9;
            i9++;
        }
        this.model.setConnectionCount(i8);
        this.database.updateConnectionCount(id, i8);
        fetchWithMultipleConnection(arrayList, j8);
    }

    private void realDownloadWithMultiConnectionFromResume(int i8, List<com.liulishuo.filedownloader.model.a> list) {
        if (i8 <= 1 || list.size() != i8) {
            throw new IllegalArgumentException();
        }
        fetchWithMultipleConnection(list, this.model.getTotal());
    }

    private void realDownloadWithSingleConnection(long j8) {
        com.liulishuo.filedownloader.download.a buildToEndConnectionProfile;
        if (this.acceptPartial) {
            buildToEndConnectionProfile = a.b.buildToEndConnectionProfile(this.model.getSoFar(), this.model.getSoFar(), j8 - this.model.getSoFar());
        } else {
            this.model.setSoFar(0L);
            buildToEndConnectionProfile = a.b.buildBeginToEndConnectionProfile(j8);
        }
        this.singleDownloadRunnable = new c.b().setId(this.model.getId()).setConnectionIndex(-1).setCallback(this).setUrl(this.model.getUrl()).setEtag(this.model.getETag()).setHeader(this.userRequestHeader).setWifiRequired(this.isWifiRequired).setConnectionModel(buildToEndConnectionProfile).setPath(this.model.getTempFilePath()).build();
        this.model.setConnectionCount(1);
        this.database.updateConnectionCount(this.model.getId(), 1);
        if (!this.paused) {
            this.singleDownloadRunnable.run();
        } else {
            this.model.setStatus((byte) -2);
            this.singleDownloadRunnable.pause();
        }
    }

    private void trialConnect() {
        com.liulishuo.filedownloader.connection.b bVar = null;
        try {
            ConnectTask build = new ConnectTask.b().setDownloadId(this.model.getId()).setUrl(this.model.getUrl()).setEtag(this.model.getETag()).setHeader(this.userRequestHeader).setConnectionProfile(this.isNeedForceDiscardRange ? a.b.buildTrialConnectionProfileNoRange() : a.b.buildTrialConnectionProfile()).build();
            bVar = build.connect();
            handleTrialConnectResult(build.getRequestHeader(), build, bVar);
            if (bVar != null) {
                bVar.ending();
            }
        } catch (Throwable th) {
            if (bVar != null) {
                bVar.ending();
            }
            throw th;
        }
    }

    public int getId() {
        return this.model.getId();
    }

    public String getTempFilePath() {
        return this.model.getTempFilePath();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void inspectTaskModelResumeAvailableOnDB(List<com.liulishuo.filedownloader.model.a> list) {
        long soFar;
        boolean z7;
        int connectionCount = this.model.getConnectionCount();
        String tempFilePath = this.model.getTempFilePath();
        String targetFilePath = this.model.getTargetFilePath();
        boolean z8 = connectionCount > 1;
        if (!this.isNeedForceDiscardRange && ((!z8 || this.supportSeek) && com.liulishuo.filedownloader.util.f.isBreakpointAvailable(this.model.getId(), this.model))) {
            if (!this.supportSeek) {
                soFar = new File(tempFilePath).length();
            } else if (!z8) {
                soFar = this.model.getSoFar();
            } else if (connectionCount == list.size()) {
                soFar = com.liulishuo.filedownloader.model.a.getTotalOffset(list);
            }
            this.model.setSoFar(soFar);
            z7 = soFar > 0;
            this.isResumeAvailableOnDB = z7;
            if (z7) {
                this.database.removeConnections(this.model.getId());
                com.liulishuo.filedownloader.util.f.deleteTaskFiles(targetFilePath, tempFilePath);
                return;
            }
            return;
        }
        soFar = 0;
        this.model.setSoFar(soFar);
        if (soFar > 0) {
        }
        this.isResumeAvailableOnDB = z7;
        if (z7) {
        }
    }

    public boolean isAlive() {
        return this.alive.get() || this.statusCallback.isAlive();
    }

    @Override // com.liulishuo.filedownloader.download.f
    public boolean isRetry(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.isSingleConnection && code == 416 && !this.isTriedFixRangeNotSatisfiable) {
                com.liulishuo.filedownloader.util.f.deleteTaskFiles(this.model.getTargetFilePath(), this.model.getTempFilePath());
                this.isTriedFixRangeNotSatisfiable = true;
                return true;
            }
        }
        return this.validRetryTimes > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // com.liulishuo.filedownloader.download.f
    public void onCompleted(c cVar, long j8, long j9) {
        if (this.paused) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.model.getId()));
                return;
            }
            return;
        }
        int i8 = cVar.connectionIndex;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i8), Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(this.model.getTotal()));
        }
        if (!this.isSingleConnection) {
            synchronized (this.downloadRunnableList) {
                this.downloadRunnableList.remove(cVar);
            }
        } else {
            if (j8 == 0 || j9 == this.model.getTotal()) {
                return;
            }
            com.liulishuo.filedownloader.util.d.e(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j8), Long.valueOf(j9), Long.valueOf(this.model.getTotal()), Integer.valueOf(this.model.getId()));
        }
    }

    @Override // com.liulishuo.filedownloader.download.f
    public void onError(Exception exc) {
        this.error = true;
        this.errorException = exc;
        if (this.paused) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.model.getId()));
            }
        } else {
            Iterator it = ((ArrayList) this.downloadRunnableList.clone()).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar != null) {
                    cVar.discard();
                }
            }
        }
    }

    @Override // com.liulishuo.filedownloader.download.f
    public void onProgress(long j8) {
        if (this.paused) {
            return;
        }
        this.statusCallback.onProgress(j8);
    }

    @Override // com.liulishuo.filedownloader.download.f
    public void onRetry(Exception exc) {
        if (this.paused) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.model.getId()));
            }
        } else {
            int i8 = this.validRetryTimes;
            int i9 = i8 - 1;
            this.validRetryTimes = i9;
            if (i8 < 0) {
                com.liulishuo.filedownloader.util.d.e(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i9), Integer.valueOf(this.model.getId()));
            }
            this.statusCallback.onRetry(exc, this.validRetryTimes);
        }
    }

    public void pause() {
        this.paused = true;
        c cVar = this.singleDownloadRunnable;
        if (cVar != null) {
            cVar.pause();
        }
        Iterator it = ((ArrayList) this.downloadRunnableList.clone()).iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2 != null) {
                cVar2.pause();
            }
        }
    }

    public void pending() {
        inspectTaskModelResumeAvailableOnDB(this.database.findConnectionModel(this.model.getId()));
        this.statusCallback.onPending();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd A[Catch: all -> 0x0030, TryCatch #5 {all -> 0x0030, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:25:0x0033, B:26:0x0090, B:28:0x0094, B:30:0x0099, B:117:0x009d, B:119:0x00a1, B:33:0x00c9, B:35:0x00e5, B:44:0x0118, B:56:0x014e, B:58:0x0152, B:69:0x0177, B:71:0x017b, B:85:0x017f, B:87:0x0188, B:88:0x018c, B:90:0x0190, B:91:0x01a3, B:105:0x01c7, B:107:0x01cd, B:110:0x01d2, B:101:0x01a4), top: B:2:0x0003, inners: #14, #14, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        List<com.liulishuo.filedownloader.model.a> findConnectionModel;
        try {
            Process.setThreadPriority(10);
            if (this.model.getStatus() != 1) {
                if (this.model.getStatus() != -2) {
                    onError(new RuntimeException(com.liulishuo.filedownloader.util.f.formatString("Task[%d] can't start the download runnable, because its status is %d not %d", Integer.valueOf(this.model.getId()), Byte.valueOf(this.model.getStatus()), (byte) 1)));
                } else if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.d(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.model.getId()));
                }
                this.statusCallback.discardAllMessage();
                if (!this.paused) {
                    if (!this.error) {
                        try {
                            this.statusCallback.onCompletedDirectly();
                        } catch (IOException e8) {
                            e = e8;
                            this.statusCallback.onErrorDirectly(e);
                            this.alive.set(false);
                        }
                        this.alive.set(false);
                    }
                    this.statusCallback.onErrorDirectly(this.errorException);
                    this.alive.set(false);
                }
                this.statusCallback.onPausedDirectly();
                this.alive.set(false);
            }
            if (!this.paused) {
                this.statusCallback.onStartThread();
            }
            while (!this.paused) {
                try {
                    checkupBeforeConnect();
                    trialConnect();
                    checkupAfterGetFilename();
                    findConnectionModel = this.database.findConnectionModel(this.model.getId());
                    inspectTaskModelResumeAvailableOnDB(findConnectionModel);
                } catch (DiscardSafely unused) {
                    this.statusCallback.discardAllMessage();
                    if (!this.paused) {
                        if (!this.error) {
                            try {
                                this.statusCallback.onCompletedDirectly();
                            } catch (IOException e9) {
                                e = e9;
                                this.statusCallback.onErrorDirectly(e);
                                this.alive.set(false);
                            }
                        }
                    }
                } catch (RetryDirectly unused2) {
                    this.model.setStatus((byte) 5);
                } catch (FileDownloadGiveUpRetryException e10) {
                    e = e10;
                    if (isRetry(e)) {
                        onError(e);
                        this.statusCallback.discardAllMessage();
                        if (!this.paused) {
                        }
                        this.alive.set(false);
                        return;
                    }
                    onRetry(e);
                } catch (FileDownloadSecurityException e11) {
                    e = e11;
                    if (isRetry(e)) {
                    }
                } catch (IOException e12) {
                    e = e12;
                    if (isRetry(e)) {
                    }
                } catch (IllegalAccessException e13) {
                    e = e13;
                    if (isRetry(e)) {
                    }
                } catch (IllegalArgumentException e14) {
                    e = e14;
                    if (isRetry(e)) {
                    }
                } catch (InterruptedException e15) {
                    e = e15;
                    if (isRetry(e)) {
                    }
                }
                if (this.paused) {
                    this.model.setStatus((byte) -2);
                    this.statusCallback.discardAllMessage();
                    if (!this.paused) {
                        if (!this.error) {
                            try {
                                this.statusCallback.onCompletedDirectly();
                            } catch (IOException e16) {
                                e = e16;
                                this.statusCallback.onErrorDirectly(e);
                                this.alive.set(false);
                            }
                            this.alive.set(false);
                        }
                        this.statusCallback.onErrorDirectly(this.errorException);
                        this.alive.set(false);
                    }
                    this.statusCallback.onPausedDirectly();
                    this.alive.set(false);
                }
                long total = this.model.getTotal();
                handlePreAllocate(total, this.model.getTempFilePath());
                int calcConnectionCount = calcConnectionCount(total);
                if (calcConnectionCount <= 0) {
                    throw new IllegalAccessException(com.liulishuo.filedownloader.util.f.formatString("invalid connection count %d, the connection count must be larger than 0", Integer.valueOf(calcConnectionCount)));
                }
                if (total == 0) {
                    this.statusCallback.discardAllMessage();
                    if (!this.paused) {
                        if (!this.error) {
                            try {
                                this.statusCallback.onCompletedDirectly();
                            } catch (IOException e17) {
                                e = e17;
                                this.statusCallback.onErrorDirectly(e);
                                this.alive.set(false);
                            }
                            this.alive.set(false);
                        }
                        this.statusCallback.onErrorDirectly(this.errorException);
                        this.alive.set(false);
                    }
                    this.statusCallback.onPausedDirectly();
                    this.alive.set(false);
                }
                if (this.paused) {
                    this.model.setStatus((byte) -2);
                    this.statusCallback.discardAllMessage();
                    if (!this.paused) {
                        if (!this.error) {
                            try {
                                this.statusCallback.onCompletedDirectly();
                            } catch (IOException e18) {
                                e = e18;
                                this.statusCallback.onErrorDirectly(e);
                                this.alive.set(false);
                            }
                            this.alive.set(false);
                        }
                        this.statusCallback.onErrorDirectly(this.errorException);
                        this.alive.set(false);
                    }
                    this.statusCallback.onPausedDirectly();
                    this.alive.set(false);
                }
                boolean z7 = calcConnectionCount == 1;
                this.isSingleConnection = z7;
                if (z7) {
                    realDownloadWithSingleConnection(total);
                } else {
                    this.statusCallback.onMultiConnection();
                    if (this.isResumeAvailableOnDB) {
                        realDownloadWithMultiConnectionFromResume(calcConnectionCount, findConnectionModel);
                    } else {
                        realDownloadWithMultiConnectionFromBeginning(total, calcConnectionCount);
                    }
                }
                this.statusCallback.discardAllMessage();
                if (!this.paused) {
                    this.statusCallback.onPausedDirectly();
                } else if (this.error) {
                    this.statusCallback.onErrorDirectly(this.errorException);
                } else {
                    try {
                        this.statusCallback.onCompletedDirectly();
                    } catch (IOException e19) {
                        this.statusCallback.onErrorDirectly(e19);
                    }
                }
                this.alive.set(false);
                return;
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.model.getId()));
            }
            this.statusCallback.discardAllMessage();
            if (!this.paused) {
                if (!this.error) {
                    try {
                        this.statusCallback.onCompletedDirectly();
                    } catch (IOException e20) {
                        e = e20;
                        this.statusCallback.onErrorDirectly(e);
                        this.alive.set(false);
                    }
                    this.alive.set(false);
                }
                this.statusCallback.onErrorDirectly(this.errorException);
                this.alive.set(false);
            }
            this.statusCallback.onPausedDirectly();
            this.alive.set(false);
        } catch (Throwable th) {
            this.statusCallback.discardAllMessage();
            if (this.paused) {
                this.statusCallback.onPausedDirectly();
            } else if (this.error) {
                this.statusCallback.onErrorDirectly(this.errorException);
            } else {
                try {
                    this.statusCallback.onCompletedDirectly();
                } catch (IOException e21) {
                    this.statusCallback.onErrorDirectly(e21);
                }
            }
            this.alive.set(false);
            throw th;
        }
    }

    @Override // com.liulishuo.filedownloader.download.f
    public void syncProgressFromCache() {
        this.database.updateProgress(this.model.getId(), this.model.getSoFar());
    }

    private DownloadLaunchRunnable(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, a0 a0Var, int i8, int i9, boolean z7, boolean z8, int i10) {
        this.defaultConnectionCount = 5;
        this.isNeedForceDiscardRange = false;
        this.downloadRunnableList = new ArrayList<>(5);
        this.lastCallbackBytes = 0L;
        this.lastCallbackTimestamp = 0L;
        this.lastUpdateBytes = 0L;
        this.lastUpdateTimestamp = 0L;
        this.alive = new AtomicBoolean(true);
        this.paused = false;
        this.isTriedFixRangeNotSatisfiable = false;
        this.model = fileDownloadModel;
        this.userRequestHeader = fileDownloadHeader;
        this.isForceReDownload = z7;
        this.isWifiRequired = z8;
        this.database = com.liulishuo.filedownloader.download.b.getImpl().getDatabaseInstance();
        this.supportSeek = com.liulishuo.filedownloader.download.b.getImpl().isSupportSeek();
        this.threadPoolMonitor = a0Var;
        this.validRetryTimes = i10;
        this.statusCallback = new d(fileDownloadModel, i10, i8, i9);
    }

    private DownloadLaunchRunnable(d dVar, FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, a0 a0Var, int i8, int i9, boolean z7, boolean z8, int i10) {
        this.defaultConnectionCount = 5;
        this.isNeedForceDiscardRange = false;
        this.downloadRunnableList = new ArrayList<>(5);
        this.lastCallbackBytes = 0L;
        this.lastCallbackTimestamp = 0L;
        this.lastUpdateBytes = 0L;
        this.lastUpdateTimestamp = 0L;
        this.alive = new AtomicBoolean(true);
        this.paused = false;
        this.isTriedFixRangeNotSatisfiable = false;
        this.model = fileDownloadModel;
        this.userRequestHeader = fileDownloadHeader;
        this.isForceReDownload = z7;
        this.isWifiRequired = z8;
        this.database = com.liulishuo.filedownloader.download.b.getImpl().getDatabaseInstance();
        this.supportSeek = com.liulishuo.filedownloader.download.b.getImpl().isSupportSeek();
        this.threadPoolMonitor = a0Var;
        this.validRetryTimes = i10;
        this.statusCallback = dVar;
    }
}
