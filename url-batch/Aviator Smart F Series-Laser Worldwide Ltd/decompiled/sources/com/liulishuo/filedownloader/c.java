package com.liulishuo.filedownloader;

import android.text.TextUtils;
import android.util.SparseArray;
import com.liulishuo.filedownloader.a;
import com.liulishuo.filedownloader.d;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.z;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class c implements com.liulishuo.filedownloader.a, a.b, d.a {
    public static final int DEFAULT_CALLBACK_PROGRESS_MIN_INTERVAL_MILLIS = 10;
    private String mFilename;
    private ArrayList<a.InterfaceC0289a> mFinishListenerList;
    private FileDownloadHeader mHeader;
    private final z mHunter;
    private int mId;
    private SparseArray<Object> mKeyedTags;
    private k mListener;
    private final z.a mMessageHandler;
    private String mPath;
    private boolean mPathAsDirectory;
    private final Object mPauseLock;
    private Object mTag;
    private final String mUrl;
    private int mAutoRetryTimes = 0;
    private boolean mSyncCallback = false;
    private boolean mIsWifiRequired = false;
    private int mCallbackProgressTimes = 100;
    private int mCallbackProgressMinIntervalMillis = 10;
    private boolean mIsForceReDownload = false;
    volatile int mAttachKey = 0;
    private boolean mIsInQueueTask = false;
    private final Object headerCreateLock = new Object();
    private volatile boolean mIsMarkedAdded2List = false;

    private static final class b implements a.c {
        private final c mTask;

        @Override // com.liulishuo.filedownloader.a.c
        public int enqueue() {
            int id = this.mTask.getId();
            if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
                com.liulishuo.filedownloader.util.d.d(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            j.getImpl().addUnchecked(this.mTask);
            return id;
        }

        private b(c cVar) {
            this.mTask = cVar;
            cVar.mIsInQueueTask = true;
        }
    }

    c(String str) {
        this.mUrl = str;
        Object obj = new Object();
        this.mPauseLock = obj;
        d dVar = new d(this, obj);
        this.mHunter = dVar;
        this.mMessageHandler = dVar;
    }

    private void checkAndCreateHeader() {
        if (this.mHeader == null) {
            synchronized (this.headerCreateLock) {
                try {
                    if (this.mHeader == null) {
                        this.mHeader = new FileDownloadHeader();
                    }
                } finally {
                }
            }
        }
    }

    private int startTaskUnchecked() {
        if (!isUsing()) {
            if (!isAttached()) {
                setAttachKeyDefault();
            }
            this.mHunter.intoLaunchPool();
            return getId();
        }
        if (isRunning()) {
            throw new IllegalStateException(com.liulishuo.filedownloader.util.f.formatString("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        }
        throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.mHunter.toString());
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a addFinishListener(a.InterfaceC0289a interfaceC0289a) {
        if (this.mFinishListenerList == null) {
            this.mFinishListenerList = new ArrayList<>();
        }
        if (!this.mFinishListenerList.contains(interfaceC0289a)) {
            this.mFinishListenerList.add(interfaceC0289a);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a addHeader(String str, String str2) {
        checkAndCreateHeader();
        this.mHeader.add(str, str2);
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public a.c asInQueueTask() {
        return new b();
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean cancel() {
        return pause();
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void free() {
        this.mHunter.free();
        if (j.getImpl().isNotContains(this)) {
            this.mIsMarkedAdded2List = false;
        }
    }

    @Override // com.liulishuo.filedownloader.a.b
    public int getAttachKey() {
        return this.mAttachKey;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getAutoRetryTimes() {
        return this.mAutoRetryTimes;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getCallbackProgressMinInterval() {
        return this.mCallbackProgressMinIntervalMillis;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getCallbackProgressTimes() {
        return this.mCallbackProgressTimes;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getDownloadId() {
        return getId();
    }

    @Override // com.liulishuo.filedownloader.a
    public Throwable getErrorCause() {
        return this.mHunter.getErrorCause();
    }

    @Override // com.liulishuo.filedownloader.a
    public String getEtag() {
        return this.mHunter.getEtag();
    }

    @Override // com.liulishuo.filedownloader.a
    public Throwable getEx() {
        return getErrorCause();
    }

    @Override // com.liulishuo.filedownloader.a
    public String getFilename() {
        return this.mFilename;
    }

    @Override // com.liulishuo.filedownloader.d.a
    public ArrayList<a.InterfaceC0289a> getFinishListenerList() {
        return this.mFinishListenerList;
    }

    @Override // com.liulishuo.filedownloader.d.a
    public FileDownloadHeader getHeader() {
        return this.mHeader;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getId() {
        int i8 = this.mId;
        if (i8 != 0) {
            return i8;
        }
        if (TextUtils.isEmpty(this.mPath) || TextUtils.isEmpty(this.mUrl)) {
            return 0;
        }
        int generateId = com.liulishuo.filedownloader.util.f.generateId(this.mUrl, this.mPath, this.mPathAsDirectory);
        this.mId = generateId;
        return generateId;
    }

    @Override // com.liulishuo.filedownloader.a
    public long getLargeFileSoFarBytes() {
        return this.mHunter.getSofarBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public long getLargeFileTotalBytes() {
        return this.mHunter.getTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public k getListener() {
        return this.mListener;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public z.a getMessageHandler() {
        return this.mMessageHandler;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public com.liulishuo.filedownloader.a getOrigin() {
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public String getPath() {
        return this.mPath;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public Object getPauseLock() {
        return this.mPauseLock;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getRetryingTimes() {
        return this.mHunter.getRetryingTimes();
    }

    @Override // com.liulishuo.filedownloader.d.a
    public a.b getRunningTask() {
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public int getSmallFileSoFarBytes() {
        if (this.mHunter.getSofarBytes() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.mHunter.getSofarBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public int getSmallFileTotalBytes() {
        if (this.mHunter.getTotalBytes() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.mHunter.getTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public int getSoFarBytes() {
        return getSmallFileSoFarBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public int getSpeed() {
        return this.mHunter.getSpeed();
    }

    @Override // com.liulishuo.filedownloader.a
    public byte getStatus() {
        return this.mHunter.getStatus();
    }

    @Override // com.liulishuo.filedownloader.a
    public Object getTag() {
        return this.mTag;
    }

    @Override // com.liulishuo.filedownloader.a
    public String getTargetFilePath() {
        return com.liulishuo.filedownloader.util.f.getTargetFilePath(getPath(), isPathAsDirectory(), getFilename());
    }

    @Override // com.liulishuo.filedownloader.a
    public int getTotalBytes() {
        return getSmallFileTotalBytes();
    }

    @Override // com.liulishuo.filedownloader.a
    public String getUrl() {
        return this.mUrl;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public boolean is(int i8) {
        return getId() == i8;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isAttached() {
        return this.mAttachKey != 0;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public boolean isContainFinishListener() {
        ArrayList<a.InterfaceC0289a> arrayList = this.mFinishListenerList;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isContinue() {
        return isResuming();
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isForceReDownload() {
        return this.mIsForceReDownload;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isLargeFile() {
        return this.mHunter.isLargeFile();
    }

    @Override // com.liulishuo.filedownloader.a.b
    public boolean isMarkedAdded2List() {
        return this.mIsMarkedAdded2List;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public boolean isOver() {
        return com.liulishuo.filedownloader.model.b.isOver(getStatus());
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isPathAsDirectory() {
        return this.mPathAsDirectory;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isResuming() {
        return this.mHunter.isResuming();
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isReusedOldFile() {
        return this.mHunter.isReusedOldFile();
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isRunning() {
        if (s.getImpl().getLostConnectedHandler().isInWaitingList(this)) {
            return true;
        }
        return com.liulishuo.filedownloader.model.b.isIng(getStatus());
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isSyncCallback() {
        return this.mSyncCallback;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isUsing() {
        return this.mHunter.getStatus() != 0;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean isWifiRequired() {
        return this.mIsWifiRequired;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void markAdded2List() {
        this.mIsMarkedAdded2List = true;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean pause() {
        boolean pause;
        synchronized (this.mPauseLock) {
            pause = this.mHunter.pause();
        }
        return pause;
    }

    @Override // com.liulishuo.filedownloader.a
    public int ready() {
        return asInQueueTask().enqueue();
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a removeAllHeaders(String str) {
        if (this.mHeader == null) {
            synchronized (this.headerCreateLock) {
                try {
                    if (this.mHeader == null) {
                        return this;
                    }
                } finally {
                }
            }
        }
        this.mHeader.removeAll(str);
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean removeFinishListener(a.InterfaceC0289a interfaceC0289a) {
        ArrayList<a.InterfaceC0289a> arrayList = this.mFinishListenerList;
        return arrayList != null && arrayList.remove(interfaceC0289a);
    }

    @Override // com.liulishuo.filedownloader.a
    public boolean reuse() {
        if (isRunning()) {
            com.liulishuo.filedownloader.util.d.w(this, "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create", Integer.valueOf(getId()));
            return false;
        }
        this.mAttachKey = 0;
        this.mIsInQueueTask = false;
        this.mIsMarkedAdded2List = false;
        this.mHunter.reset();
        return true;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void setAttachKeyByQueue(int i8) {
        this.mAttachKey = i8;
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void setAttachKeyDefault() {
        this.mAttachKey = getListener() != null ? getListener().hashCode() : hashCode();
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setAutoRetryTimes(int i8) {
        this.mAutoRetryTimes = i8;
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setCallbackProgressIgnored() {
        return setCallbackProgressTimes(-1);
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setCallbackProgressMinInterval(int i8) {
        this.mCallbackProgressMinIntervalMillis = i8;
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setCallbackProgressTimes(int i8) {
        this.mCallbackProgressTimes = i8;
        return this;
    }

    @Override // com.liulishuo.filedownloader.d.a
    public void setFileName(String str) {
        this.mFilename = str;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setFinishListener(a.InterfaceC0289a interfaceC0289a) {
        addFinishListener(interfaceC0289a);
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setForceReDownload(boolean z7) {
        this.mIsForceReDownload = z7;
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setListener(k kVar) {
        this.mListener = kVar;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "setListener %s", kVar);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setMinIntervalUpdateSpeed(int i8) {
        this.mHunter.setMinIntervalUpdateSpeed(i8);
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setPath(String str) {
        return setPath(str, false);
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setSyncCallback(boolean z7) {
        this.mSyncCallback = z7;
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setTag(Object obj) {
        this.mTag = obj;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "setTag %s", obj);
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setWifiRequired(boolean z7) {
        this.mIsWifiRequired = z7;
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public int start() {
        if (this.mIsInQueueTask) {
            throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
        }
        return startTaskUnchecked();
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void startTaskByQueue() {
        startTaskUnchecked();
    }

    @Override // com.liulishuo.filedownloader.a.b
    public void startTaskByRescue() {
        startTaskUnchecked();
    }

    public String toString() {
        return com.liulishuo.filedownloader.util.f.formatString("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // com.liulishuo.filedownloader.a
    public Object getTag(int i8) {
        SparseArray<Object> sparseArray = this.mKeyedTags;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i8);
    }

    @Override // com.liulishuo.filedownloader.a.b
    public boolean is(k kVar) {
        return getListener() == kVar;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setPath(String str, boolean z7) {
        this.mPath = str;
        if (com.liulishuo.filedownloader.util.d.NEED_LOG) {
            com.liulishuo.filedownloader.util.d.d(this, "setPath %s", str);
        }
        this.mPathAsDirectory = z7;
        if (z7) {
            this.mFilename = null;
        } else {
            this.mFilename = new File(str).getName();
        }
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a addHeader(String str) {
        checkAndCreateHeader();
        this.mHeader.add(str);
        return this;
    }

    @Override // com.liulishuo.filedownloader.a
    public com.liulishuo.filedownloader.a setTag(int i8, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i8, obj);
        return this;
    }
}
