package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import com.liulishuo.filedownloader.download.DownloadLaunchRunnable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes4.dex */
class h {
    private int mMaxThreadCount;
    private ThreadPoolExecutor mThreadPool;
    private SparseArray<DownloadLaunchRunnable> runnablePool = new SparseArray<>();
    private final String threadPrefix = "Network";
    private int mIgnoreCheckTimes = 0;

    h(int i8) {
        this.mThreadPool = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(i8, "Network");
        this.mMaxThreadCount = i8;
    }

    private synchronized void filterOutNoExist() {
        try {
            SparseArray<DownloadLaunchRunnable> sparseArray = new SparseArray<>();
            int size = this.runnablePool.size();
            for (int i8 = 0; i8 < size; i8++) {
                int keyAt = this.runnablePool.keyAt(i8);
                DownloadLaunchRunnable downloadLaunchRunnable = this.runnablePool.get(keyAt);
                if (downloadLaunchRunnable != null && downloadLaunchRunnable.isAlive()) {
                    sparseArray.put(keyAt, downloadLaunchRunnable);
                }
            }
            this.runnablePool = sparseArray;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void cancel(int i8) {
        filterOutNoExist();
        synchronized (this) {
            try {
                DownloadLaunchRunnable downloadLaunchRunnable = this.runnablePool.get(i8);
                if (downloadLaunchRunnable != null) {
                    downloadLaunchRunnable.pause();
                    boolean remove = this.mThreadPool.remove(downloadLaunchRunnable);
                    if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                        com.liulishuo.filedownloader.util.d.d(this, "successful cancel %d %B", Integer.valueOf(i8), Boolean.valueOf(remove));
                    }
                }
                this.runnablePool.remove(i8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized int exactSize() {
        filterOutNoExist();
        return this.runnablePool.size();
    }

    public void execute(DownloadLaunchRunnable downloadLaunchRunnable) {
        downloadLaunchRunnable.pending();
        synchronized (this) {
            this.runnablePool.put(downloadLaunchRunnable.getId(), downloadLaunchRunnable);
        }
        this.mThreadPool.execute(downloadLaunchRunnable);
        int i8 = this.mIgnoreCheckTimes;
        if (i8 < 600) {
            this.mIgnoreCheckTimes = i8 + 1;
        } else {
            filterOutNoExist();
            this.mIgnoreCheckTimes = 0;
        }
    }

    public synchronized int findRunningTaskIdBySameTempPath(String str, int i8) {
        if (str == null) {
            return 0;
        }
        int size = this.runnablePool.size();
        for (int i9 = 0; i9 < size; i9++) {
            DownloadLaunchRunnable valueAt = this.runnablePool.valueAt(i9);
            if (valueAt != null && valueAt.isAlive() && valueAt.getId() != i8 && str.equals(valueAt.getTempFilePath())) {
                return valueAt.getId();
            }
        }
        return 0;
    }

    public synchronized List<Integer> getAllExactRunningDownloadIds() {
        ArrayList arrayList;
        filterOutNoExist();
        arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.runnablePool.size(); i8++) {
            SparseArray<DownloadLaunchRunnable> sparseArray = this.runnablePool;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i8)).getId()));
        }
        return arrayList;
    }

    public synchronized boolean isInThreadPool(int i8) {
        boolean z7;
        DownloadLaunchRunnable downloadLaunchRunnable = this.runnablePool.get(i8);
        if (downloadLaunchRunnable != null) {
            z7 = downloadLaunchRunnable.isAlive();
        }
        return z7;
    }

    public synchronized boolean setMaxNetworkThreadCount(int i8) {
        if (exactSize() > 0) {
            com.liulishuo.filedownloader.util.d.w(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int validNetworkThreadCount = com.liulishuo.filedownloader.util.e.getValidNetworkThreadCount(i8);
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.mMaxThreadCount), Integer.valueOf(validNetworkThreadCount));
        }
        List<Runnable> shutdownNow = this.mThreadPool.shutdownNow();
        this.mThreadPool = com.liulishuo.filedownloader.util.b.newDefaultThreadPool(validNetworkThreadCount, "Network");
        if (shutdownNow.size() > 0) {
            com.liulishuo.filedownloader.util.d.w(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.mMaxThreadCount = validNetworkThreadCount;
        return true;
    }
}
