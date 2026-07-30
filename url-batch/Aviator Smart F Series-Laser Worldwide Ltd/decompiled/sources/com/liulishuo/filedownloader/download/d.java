package com.liulishuo.filedownloader.download;

import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes4.dex */
public class d implements Handler.Callback {
    private static final String ALREADY_DEAD_MESSAGE = "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.";
    private static final int CALLBACK_SAFE_MIN_INTERVAL_BYTES = 1;
    private static final int CALLBACK_SAFE_MIN_INTERVAL_MILLIS = 5;
    private static final int NO_ANY_PROGRESS_CALLBACK = -1;
    private long callbackMinIntervalBytes;
    private final int callbackProgressMaxCount;
    private final int callbackProgressMinInterval;
    private Handler handler;
    private HandlerThread handlerThread;
    private final int maxRetryTimes;
    private final FileDownloadModel model;
    private volatile Thread parkThread;
    private final a processParams;
    private volatile boolean handlingMessage = false;
    private volatile long lastCallbackTimestamp = 0;
    private final AtomicLong callbackIncreaseBuffer = new AtomicLong();
    private final AtomicBoolean needCallbackProgressToUser = new AtomicBoolean(false);
    private final AtomicBoolean needSetProcess = new AtomicBoolean(false);
    private final AtomicBoolean isFirstCallback = new AtomicBoolean(true);
    private final com.liulishuo.filedownloader.database.a database = b.getImpl().getDatabaseInstance();

    public static class a {
        private Exception exception;
        private boolean isResuming;
        private int retryingTimes;

        public Exception getException() {
            return this.exception;
        }

        public int getRetryingTimes() {
            return this.retryingTimes;
        }

        public boolean isResuming() {
            return this.isResuming;
        }

        void setException(Exception exc) {
            this.exception = exc;
        }

        void setResuming(boolean z7) {
            this.isResuming = z7;
        }

        void setRetryingTimes(int i8) {
            this.retryingTimes = i8;
        }
    }

    d(FileDownloadModel fileDownloadModel, int i8, int i9, int i10) {
        this.model = fileDownloadModel;
        this.callbackProgressMinInterval = i9 < 5 ? 5 : i9;
        this.callbackProgressMaxCount = i10;
        this.processParams = new a();
        this.maxRetryTimes = i8;
    }

    private static long calculateCallbackMinIntervalBytes(long j8, long j9) {
        if (j9 <= 0) {
            return -1L;
        }
        if (j8 == -1) {
            return 1L;
        }
        long j10 = j8 / j9;
        if (j10 <= 0) {
            return 1L;
        }
        return j10;
    }

    private Exception exFiltrate(Exception exc) {
        long length;
        String tempFilePath = this.model.getTempFilePath();
        if ((!this.model.isChunked() && !com.liulishuo.filedownloader.util.e.getImpl().fileNonPreAllocation) || !(exc instanceof IOException) || !new File(tempFilePath).exists()) {
            return exc;
        }
        long freeSpaceBytes = com.liulishuo.filedownloader.util.f.getFreeSpaceBytes(tempFilePath);
        if (freeSpaceBytes > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return exc;
        }
        File file = new File(tempFilePath);
        if (file.exists()) {
            length = file.length();
        } else {
            com.liulishuo.filedownloader.util.d.e(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        }
        return new FileDownloadOutOfSpaceException(freeSpaceBytes, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, length, exc);
    }

    private void handleCompleted() {
        renameTempFile();
        this.model.setStatus((byte) -3);
        this.database.updateCompleted(this.model.getId(), this.model.getTotal());
        this.database.removeConnections(this.model.getId());
        onStatusChanged((byte) -3);
        if (com.liulishuo.filedownloader.util.e.getImpl().broadcastCompleted) {
            com.liulishuo.filedownloader.services.f.sendCompletedBroadcast(this.model);
        }
    }

    private void handleError(Exception exc) {
        Exception exc2;
        Exception exFiltrate = exFiltrate(exc);
        if (exFiltrate instanceof SQLiteFullException) {
            handleSQLiteFullException((SQLiteFullException) exFiltrate);
            exc2 = exFiltrate;
        } else {
            try {
                this.model.setStatus((byte) -1);
                this.model.setErrMsg(exc.toString());
                this.database.updateError(this.model.getId(), exFiltrate, this.model.getSoFar());
                exc2 = exFiltrate;
            } catch (SQLiteFullException e8) {
                SQLiteFullException sQLiteFullException = e8;
                handleSQLiteFullException(sQLiteFullException);
                exc2 = sQLiteFullException;
            }
        }
        this.processParams.setException(exc2);
        onStatusChanged((byte) -1);
    }

    private void handlePaused() {
        this.model.setStatus((byte) -2);
        this.database.updatePause(this.model.getId(), this.model.getSoFar());
        onStatusChanged((byte) -2);
    }

    private void handleProgress() {
        if (this.model.getSoFar() == this.model.getTotal()) {
            this.database.updateProgress(this.model.getId(), this.model.getSoFar());
            return;
        }
        if (this.needSetProcess.compareAndSet(true, false)) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.i(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.model.setStatus((byte) 3);
        }
        if (this.needCallbackProgressToUser.compareAndSet(true, false)) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.i(this, "handleProgress notify user progress status", new Object[0]);
            }
            onStatusChanged((byte) 3);
        }
    }

    private void handleRetry(Exception exc, int i8) {
        Exception exFiltrate = exFiltrate(exc);
        this.processParams.setException(exFiltrate);
        this.processParams.setRetryingTimes(this.maxRetryTimes - i8);
        this.model.setStatus((byte) 5);
        this.model.setErrMsg(exFiltrate.toString());
        this.database.updateRetry(this.model.getId(), exFiltrate);
        onStatusChanged((byte) 5);
    }

    private void handleSQLiteFullException(SQLiteFullException sQLiteFullException) {
        int id = this.model.getId();
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(id), sQLiteFullException.toString());
        }
        this.model.setErrMsg(sQLiteFullException.toString());
        this.model.setStatus((byte) -1);
        this.database.remove(id);
        this.database.removeConnections(id);
    }

    private void inspectNeedCallbackToUser(long j8) {
        if (!this.isFirstCallback.compareAndSet(true, false)) {
            long j9 = j8 - this.lastCallbackTimestamp;
            if (this.callbackMinIntervalBytes == -1 || this.callbackIncreaseBuffer.get() < this.callbackMinIntervalBytes || j9 < this.callbackProgressMinInterval) {
                return;
            }
        }
        if (this.needCallbackProgressToUser.compareAndSet(false, true)) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.i(this, "inspectNeedCallbackToUser need callback to user", new Object[0]);
            }
            this.lastCallbackTimestamp = j8;
            this.callbackIncreaseBuffer.set(0L);
        }
    }

    private boolean interceptBeforeCompleted() {
        if (this.model.isChunked()) {
            FileDownloadModel fileDownloadModel = this.model;
            fileDownloadModel.setTotal(fileDownloadModel.getSoFar());
        } else if (this.model.getSoFar() != this.model.getTotal()) {
            onErrorDirectly(new FileDownloadGiveUpRetryException(com.liulishuo.filedownloader.util.f.formatString("sofar[%d] not equal total[%d]", Long.valueOf(this.model.getSoFar()), Long.valueOf(this.model.getTotal()))));
            return true;
        }
        return false;
    }

    private void onStatusChanged(byte b8) {
        if (b8 != -2) {
            com.liulishuo.filedownloader.message.c.getImpl().inflow(com.liulishuo.filedownloader.message.d.take(b8, this.model, this.processParams));
        } else if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.model.getId()));
        }
    }

    private void renameTempFile() {
        boolean z7;
        String tempFilePath = this.model.getTempFilePath();
        String targetFilePath = this.model.getTargetFilePath();
        File file = new File(tempFilePath);
        try {
            File file2 = new File(targetFilePath);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(com.liulishuo.filedownloader.util.f.formatString("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", targetFilePath, Long.valueOf(length)));
                }
                com.liulishuo.filedownloader.util.d.w(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", targetFilePath, Long.valueOf(length), Long.valueOf(file.length()));
            }
            z7 = !file.renameTo(file2);
            if (!z7) {
                if (z7 && file.exists() && !file.delete()) {
                    com.liulishuo.filedownloader.util.d.w(this, "delete the temp file(%s) failed, on completed downloading.", tempFilePath);
                    return;
                }
                return;
            }
            try {
                throw new IOException(com.liulishuo.filedownloader.util.f.formatString("Can't rename the  temp downloaded file(%s) to the target file(%s)", tempFilePath, targetFilePath));
            } catch (Throwable th) {
                th = th;
                if (z7 && file.exists() && !file.delete()) {
                    com.liulishuo.filedownloader.util.d.w(this, "delete the temp file(%s) failed, on completed downloading.", tempFilePath);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z7 = true;
        }
    }

    private synchronized void sendMessage(Message message) {
        if (!this.handlerThread.isAlive()) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, ALREADY_DEAD_MESSAGE, Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.handler.sendMessage(message);
        } catch (IllegalStateException e8) {
            if (this.handlerThread.isAlive()) {
                throw e8;
            }
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, ALREADY_DEAD_MESSAGE, Integer.valueOf(message.what));
            }
        }
    }

    void discardAllMessage() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handlerThread.quit();
            this.parkThread = Thread.currentThread();
            while (this.handlingMessage) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.parkThread = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleMessage(Message message) {
        this.handlingMessage = true;
        int i8 = message.what;
        try {
            if (i8 != 3) {
                if (i8 == 5) {
                    handleRetry((Exception) message.obj, message.arg1);
                }
                this.handlingMessage = false;
                if (this.parkThread != null) {
                    LockSupport.unpark(this.parkThread);
                }
                return true;
            }
            handleProgress();
            this.handlingMessage = false;
            if (this.parkThread != null) {
            }
            return true;
        } catch (Throwable th) {
            this.handlingMessage = false;
            if (this.parkThread != null) {
                LockSupport.unpark(this.parkThread);
            }
            throw th;
        }
    }

    public boolean isAlive() {
        HandlerThread handlerThread = this.handlerThread;
        return handlerThread != null && handlerThread.isAlive();
    }

    void onCompletedDirectly() {
        if (interceptBeforeCompleted()) {
            return;
        }
        handleCompleted();
    }

    void onConnected(boolean z7, long j8, String str, String str2) {
        String eTag = this.model.getETag();
        if (eTag != null && !eTag.equals(str)) {
            throw new IllegalArgumentException(com.liulishuo.filedownloader.util.f.formatString("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, eTag));
        }
        this.processParams.setResuming(z7);
        this.model.setStatus((byte) 2);
        this.model.setTotal(j8);
        this.model.setETag(str);
        this.model.setFilename(str2);
        this.database.updateConnected(this.model.getId(), j8, str, str2);
        onStatusChanged((byte) 2);
        this.callbackMinIntervalBytes = calculateCallbackMinIntervalBytes(j8, this.callbackProgressMaxCount);
        this.needSetProcess.compareAndSet(false, true);
    }

    void onErrorDirectly(Exception exc) {
        handleError(exc);
    }

    void onMultiConnection() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper(), this);
    }

    void onPausedDirectly() {
        handlePaused();
    }

    public void onPending() {
        this.model.setStatus((byte) 1);
        this.database.updatePending(this.model.getId());
        onStatusChanged((byte) 1);
    }

    void onProgress(long j8) {
        this.callbackIncreaseBuffer.addAndGet(j8);
        this.model.increaseSoFar(j8);
        inspectNeedCallbackToUser(SystemClock.elapsedRealtime());
        if (this.handler == null) {
            handleProgress();
        } else if (this.needCallbackProgressToUser.get()) {
            sendMessage(this.handler.obtainMessage(3));
        }
    }

    void onRetry(Exception exc, int i8) {
        this.callbackIncreaseBuffer.set(0L);
        Handler handler = this.handler;
        if (handler == null) {
            handleRetry(exc, i8);
        } else {
            sendMessage(handler.obtainMessage(5, i8, 0, exc));
        }
    }

    void onStartThread() {
        this.model.setStatus((byte) 6);
        onStatusChanged((byte) 6);
        this.database.onTaskStart(this.model.getId());
    }
}
