package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.z;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class d implements z, z.b, z.a, a.d {
    private String mEtag;
    private boolean mIsLargeFile;
    private boolean mIsResuming;
    private v mMessenger;
    private final Object mPauseLock;
    private int mRetryingTimes;
    private long mSoFarBytes;
    private final t mSpeedLookup;
    private final u mSpeedMonitor;
    private final a mTask;
    private long mTotalBytes;
    private volatile byte mStatus = 0;
    private Throwable mThrowable = null;
    private boolean mIsReusedOldFile = false;

    interface a {
        ArrayList<a.InterfaceC0289a> getFinishListenerList();

        FileDownloadHeader getHeader();

        a.b getRunningTask();

        void setFileName(String str);
    }

    d(a aVar, Object obj) {
        this.mPauseLock = obj;
        this.mTask = aVar;
        b bVar = new b();
        this.mSpeedMonitor = bVar;
        this.mSpeedLookup = bVar;
        this.mMessenger = new m(aVar.getRunningTask(), this);
    }

    private int getId() {
        return this.mTask.getRunningTask().getOrigin().getId();
    }

    private void prepare() {
        File file;
        com.liulishuo.filedownloader.a origin = this.mTask.getRunningTask().getOrigin();
        if (origin.getPath() == null) {
            origin.setPath(com.liulishuo.filedownloader.util.f.getDefaultSaveFilePath(origin.getUrl()));
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "save Path is null to %s", origin.getPath());
            }
        }
        if (origin.isPathAsDirectory()) {
            file = new File(origin.getPath());
        } else {
            String parent = com.liulishuo.filedownloader.util.f.getParent(origin.getPath());
            if (parent == null) {
                throw new InvalidParameterException(com.liulishuo.filedownloader.util.f.formatString("the provided mPath[%s] is invalid, can't find its directory", origin.getPath()));
            }
            file = new File(parent);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(com.liulishuo.filedownloader.util.f.formatString("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void update(MessageSnapshot messageSnapshot) {
        com.liulishuo.filedownloader.a origin = this.mTask.getRunningTask().getOrigin();
        byte status = messageSnapshot.getStatus();
        this.mStatus = status;
        this.mIsLargeFile = messageSnapshot.isLargeFile();
        if (status == -4) {
            this.mSpeedMonitor.reset();
            int count = j.getImpl().count(origin.getId());
            if (count + ((count > 1 || !origin.isPathAsDirectory()) ? 0 : j.getImpl().count(com.liulishuo.filedownloader.util.f.generateId(origin.getUrl(), origin.getTargetFilePath()))) <= 1) {
                byte status2 = o.getImpl().getStatus(origin.getId());
                com.liulishuo.filedownloader.util.d.w(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(origin.getId()), Integer.valueOf(status2));
                if (com.liulishuo.filedownloader.model.b.isIng(status2)) {
                    this.mStatus = (byte) 1;
                    this.mTotalBytes = messageSnapshot.getLargeTotalBytes();
                    long largeSofarBytes = messageSnapshot.getLargeSofarBytes();
                    this.mSoFarBytes = largeSofarBytes;
                    this.mSpeedMonitor.start(largeSofarBytes);
                    this.mMessenger.notifyPending(((MessageSnapshot.b) messageSnapshot).turnToPending());
                    return;
                }
            }
            j.getImpl().remove(this.mTask.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == -3) {
            this.mIsReusedOldFile = messageSnapshot.isReusedDownloadedFile();
            this.mSoFarBytes = messageSnapshot.getLargeTotalBytes();
            this.mTotalBytes = messageSnapshot.getLargeTotalBytes();
            j.getImpl().remove(this.mTask.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == -1) {
            this.mThrowable = messageSnapshot.getThrowable();
            this.mSoFarBytes = messageSnapshot.getLargeSofarBytes();
            j.getImpl().remove(this.mTask.getRunningTask(), messageSnapshot);
            return;
        }
        if (status == 1) {
            this.mSoFarBytes = messageSnapshot.getLargeSofarBytes();
            this.mTotalBytes = messageSnapshot.getLargeTotalBytes();
            this.mMessenger.notifyPending(messageSnapshot);
            return;
        }
        if (status == 2) {
            this.mTotalBytes = messageSnapshot.getLargeTotalBytes();
            this.mIsResuming = messageSnapshot.isResuming();
            this.mEtag = messageSnapshot.getEtag();
            String fileName = messageSnapshot.getFileName();
            if (fileName != null) {
                if (origin.getFilename() != null) {
                    com.liulishuo.filedownloader.util.d.w(this, "already has mFilename[%s], but assign mFilename[%s] again", origin.getFilename(), fileName);
                }
                this.mTask.setFileName(fileName);
            }
            this.mSpeedMonitor.start(this.mSoFarBytes);
            this.mMessenger.notifyConnected(messageSnapshot);
            return;
        }
        if (status == 3) {
            this.mSoFarBytes = messageSnapshot.getLargeSofarBytes();
            this.mSpeedMonitor.update(messageSnapshot.getLargeSofarBytes());
            this.mMessenger.notifyProgress(messageSnapshot);
        } else if (status != 5) {
            if (status != 6) {
                return;
            }
            this.mMessenger.notifyStarted(messageSnapshot);
        } else {
            this.mSoFarBytes = messageSnapshot.getLargeSofarBytes();
            this.mThrowable = messageSnapshot.getThrowable();
            this.mRetryingTimes = messageSnapshot.getRetryingTimes();
            this.mSpeedMonitor.reset();
            this.mMessenger.notifyRetry(messageSnapshot);
        }
    }

    @Override // com.liulishuo.filedownloader.z.b
    public boolean equalListener(k kVar) {
        return this.mTask.getRunningTask().getOrigin().getListener() == kVar;
    }

    @Override // com.liulishuo.filedownloader.z
    public void free() {
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "free the task %d, when the status is %d", Integer.valueOf(getId()), Byte.valueOf(this.mStatus));
        }
        this.mStatus = (byte) 0;
    }

    @Override // com.liulishuo.filedownloader.z
    public Throwable getErrorCause() {
        return this.mThrowable;
    }

    @Override // com.liulishuo.filedownloader.z
    public String getEtag() {
        return this.mEtag;
    }

    @Override // com.liulishuo.filedownloader.z.a
    public v getMessenger() {
        return this.mMessenger;
    }

    @Override // com.liulishuo.filedownloader.z
    public int getRetryingTimes() {
        return this.mRetryingTimes;
    }

    @Override // com.liulishuo.filedownloader.z
    public long getSofarBytes() {
        return this.mSoFarBytes;
    }

    @Override // com.liulishuo.filedownloader.z, com.liulishuo.filedownloader.t
    public int getSpeed() {
        return this.mSpeedLookup.getSpeed();
    }

    @Override // com.liulishuo.filedownloader.z
    public byte getStatus() {
        return this.mStatus;
    }

    @Override // com.liulishuo.filedownloader.z
    public long getTotalBytes() {
        return this.mTotalBytes;
    }

    @Override // com.liulishuo.filedownloader.z
    public void intoLaunchPool() {
        synchronized (this.mPauseLock) {
            try {
                if (this.mStatus != 0) {
                    com.liulishuo.filedownloader.util.d.w(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(getId()), Byte.valueOf(this.mStatus));
                    return;
                }
                this.mStatus = (byte) 10;
                a.b runningTask = this.mTask.getRunningTask();
                com.liulishuo.filedownloader.a origin = runningTask.getOrigin();
                if (n.isValid()) {
                    n.getMonitor();
                    throw null;
                }
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.v(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", origin.getUrl(), origin.getPath(), origin.getListener(), origin.getTag());
                }
                try {
                    prepare();
                    r.getImpl().launch(this);
                } catch (Throwable th) {
                    j.getImpl().add(runningTask);
                    j.getImpl().remove(runningTask, prepareErrorMessage(th));
                }
                if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                    com.liulishuo.filedownloader.util.d.v(this, "the task[%d] has been into the launch pool.", Integer.valueOf(getId()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.liulishuo.filedownloader.z
    public boolean isLargeFile() {
        return this.mIsLargeFile;
    }

    @Override // com.liulishuo.filedownloader.z
    public boolean isResuming() {
        return this.mIsResuming;
    }

    @Override // com.liulishuo.filedownloader.z
    public boolean isReusedOldFile() {
        return this.mIsReusedOldFile;
    }

    @Override // com.liulishuo.filedownloader.a.d
    public void onBegin() {
        if (n.isValid()) {
            n.getMonitor();
            this.mTask.getRunningTask().getOrigin();
            throw null;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    @Override // com.liulishuo.filedownloader.a.d
    public void onIng() {
        if (n.isValid() && getStatus() == 6) {
            n.getMonitor();
            this.mTask.getRunningTask().getOrigin();
            throw null;
        }
    }

    @Override // com.liulishuo.filedownloader.a.d
    public void onOver() {
        com.liulishuo.filedownloader.a origin = this.mTask.getRunningTask().getOrigin();
        if (n.isValid()) {
            n.getMonitor();
            throw null;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.mSpeedMonitor.end(this.mSoFarBytes);
        if (this.mTask.getFinishListenerList() != null) {
            ArrayList arrayList = (ArrayList) this.mTask.getFinishListenerList().clone();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((a.InterfaceC0289a) arrayList.get(i8)).over(origin);
            }
        }
        s.getImpl().getLostConnectedHandler().taskWorkFine(this.mTask.getRunningTask());
    }

    @Override // com.liulishuo.filedownloader.z
    public boolean pause() {
        if (com.liulishuo.filedownloader.model.b.isOver(getStatus())) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.mTask.getRunningTask().getOrigin().getId()));
            }
            return false;
        }
        this.mStatus = (byte) -2;
        a.b runningTask = this.mTask.getRunningTask();
        com.liulishuo.filedownloader.a origin = runningTask.getOrigin();
        r.getImpl().expire(this);
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.v(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(getId()));
        }
        if (s.getImpl().isServiceConnected()) {
            o.getImpl().pause(origin.getId());
        } else if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(origin.getId()));
        }
        j.getImpl().add(runningTask);
        j.getImpl().remove(runningTask, com.liulishuo.filedownloader.message.d.catchPause(origin));
        s.getImpl().getLostConnectedHandler().taskWorkFine(runningTask);
        return true;
    }

    @Override // com.liulishuo.filedownloader.z.a
    public MessageSnapshot prepareErrorMessage(Throwable th) {
        this.mStatus = (byte) -1;
        this.mThrowable = th;
        return com.liulishuo.filedownloader.message.d.catchException(getId(), getSofarBytes(), th);
    }

    @Override // com.liulishuo.filedownloader.z
    public void reset() {
        this.mThrowable = null;
        this.mEtag = null;
        this.mIsResuming = false;
        this.mRetryingTimes = 0;
        this.mIsReusedOldFile = false;
        this.mIsLargeFile = false;
        this.mSoFarBytes = 0L;
        this.mTotalBytes = 0L;
        this.mSpeedMonitor.reset();
        if (com.liulishuo.filedownloader.model.b.isOver(this.mStatus)) {
            this.mMessenger.discard();
            this.mMessenger = new m(this.mTask.getRunningTask(), this);
        } else {
            this.mMessenger.reAppointment(this.mTask.getRunningTask(), this);
        }
        this.mStatus = (byte) 0;
    }

    @Override // com.liulishuo.filedownloader.z, com.liulishuo.filedownloader.t
    public void setMinIntervalUpdateSpeed(int i8) {
        this.mSpeedLookup.setMinIntervalUpdateSpeed(i8);
    }

    @Override // com.liulishuo.filedownloader.z.b
    public void start() {
        if (this.mStatus != 10) {
            com.liulishuo.filedownloader.util.d.w(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(getId()), Byte.valueOf(this.mStatus));
            return;
        }
        a.b runningTask = this.mTask.getRunningTask();
        com.liulishuo.filedownloader.a origin = runningTask.getOrigin();
        x lostConnectedHandler = s.getImpl().getLostConnectedHandler();
        try {
            if (lostConnectedHandler.dispatchTaskStart(runningTask)) {
                return;
            }
            synchronized (this.mPauseLock) {
                try {
                    if (this.mStatus != 10) {
                        com.liulishuo.filedownloader.util.d.w(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(getId()), Byte.valueOf(this.mStatus));
                        return;
                    }
                    this.mStatus = (byte) 11;
                    j.getImpl().add(runningTask);
                    if (com.liulishuo.filedownloader.util.c.inspectAndInflowDownloaded(origin.getId(), origin.getTargetFilePath(), origin.isForceReDownload(), true)) {
                        return;
                    }
                    boolean start = o.getImpl().start(origin.getUrl(), origin.getPath(), origin.isPathAsDirectory(), origin.getCallbackProgressTimes(), origin.getCallbackProgressMinInterval(), origin.getAutoRetryTimes(), origin.isForceReDownload(), this.mTask.getHeader(), origin.isWifiRequired());
                    if (this.mStatus == -2) {
                        com.liulishuo.filedownloader.util.d.w(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(getId()));
                        if (start) {
                            o.getImpl().pause(getId());
                            return;
                        }
                        return;
                    }
                    if (start) {
                        lostConnectedHandler.taskWorkFine(runningTask);
                        return;
                    }
                    if (lostConnectedHandler.dispatchTaskStart(runningTask)) {
                        return;
                    }
                    MessageSnapshot prepareErrorMessage = prepareErrorMessage(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                    if (j.getImpl().isNotContains(runningTask)) {
                        lostConnectedHandler.taskWorkFine(runningTask);
                        j.getImpl().add(runningTask);
                    }
                    j.getImpl().remove(runningTask, prepareErrorMessage);
                } finally {
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            j.getImpl().remove(runningTask, prepareErrorMessage(th));
        }
    }

    @Override // com.liulishuo.filedownloader.z.a
    public boolean updateKeepAhead(MessageSnapshot messageSnapshot) {
        if (com.liulishuo.filedownloader.model.b.isKeepAhead(getStatus(), messageSnapshot.getStatus())) {
            update(messageSnapshot);
            return true;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.mStatus), Byte.valueOf(getStatus()), Integer.valueOf(getId()));
        }
        return false;
    }

    @Override // com.liulishuo.filedownloader.z.a
    public boolean updateKeepFlow(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte status2 = messageSnapshot.getStatus();
        if (-2 == status && com.liulishuo.filedownloader.model.b.isIng(status2)) {
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(getId()));
            }
            return true;
        }
        if (com.liulishuo.filedownloader.model.b.isKeepFlow(status, status2)) {
            update(messageSnapshot);
            return true;
        }
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.mStatus), Byte.valueOf(getStatus()), Integer.valueOf(getId()));
        }
        return false;
    }

    @Override // com.liulishuo.filedownloader.z.a
    public boolean updateMoreLikelyCompleted(MessageSnapshot messageSnapshot) {
        if (!com.liulishuo.filedownloader.model.b.isMoreLikelyCompleted(this.mTask.getRunningTask().getOrigin())) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }

    @Override // com.liulishuo.filedownloader.z.a
    public boolean updateSameFilePathTaskRunning(MessageSnapshot messageSnapshot) {
        if (!this.mTask.getRunningTask().getOrigin().isPathAsDirectory() || messageSnapshot.getStatus() != -4 || getStatus() != 2) {
            return false;
        }
        update(messageSnapshot);
        return true;
    }
}
