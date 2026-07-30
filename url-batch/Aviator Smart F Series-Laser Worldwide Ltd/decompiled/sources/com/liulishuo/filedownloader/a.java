package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.z;

/* loaded from: classes4.dex */
public interface a {
    public static final int DEFAULT_CALLBACK_PROGRESS_MIN_INTERVAL_MILLIS = 10;

    /* renamed from: com.liulishuo.filedownloader.a$a, reason: collision with other inner class name */
    public interface InterfaceC0289a {
        void over(a aVar);
    }

    public interface b {
        void free();

        int getAttachKey();

        z.a getMessageHandler();

        a getOrigin();

        Object getPauseLock();

        boolean is(int i8);

        boolean is(k kVar);

        boolean isContainFinishListener();

        boolean isMarkedAdded2List();

        boolean isOver();

        void markAdded2List();

        void setAttachKeyByQueue(int i8);

        void setAttachKeyDefault();

        void startTaskByQueue();

        void startTaskByRescue();
    }

    public interface c {
        int enqueue();
    }

    public interface d {
        void onBegin();

        void onIng();

        void onOver();
    }

    a addFinishListener(InterfaceC0289a interfaceC0289a);

    a addHeader(String str);

    a addHeader(String str, String str2);

    c asInQueueTask();

    boolean cancel();

    int getAutoRetryTimes();

    int getCallbackProgressMinInterval();

    int getCallbackProgressTimes();

    int getDownloadId();

    Throwable getErrorCause();

    String getEtag();

    Throwable getEx();

    String getFilename();

    int getId();

    long getLargeFileSoFarBytes();

    long getLargeFileTotalBytes();

    k getListener();

    String getPath();

    int getRetryingTimes();

    int getSmallFileSoFarBytes();

    int getSmallFileTotalBytes();

    int getSoFarBytes();

    int getSpeed();

    byte getStatus();

    Object getTag();

    Object getTag(int i8);

    String getTargetFilePath();

    int getTotalBytes();

    String getUrl();

    boolean isAttached();

    boolean isContinue();

    boolean isForceReDownload();

    boolean isLargeFile();

    boolean isPathAsDirectory();

    boolean isResuming();

    boolean isReusedOldFile();

    boolean isRunning();

    boolean isSyncCallback();

    boolean isUsing();

    boolean isWifiRequired();

    boolean pause();

    int ready();

    a removeAllHeaders(String str);

    boolean removeFinishListener(InterfaceC0289a interfaceC0289a);

    boolean reuse();

    a setAutoRetryTimes(int i8);

    a setCallbackProgressIgnored();

    a setCallbackProgressMinInterval(int i8);

    a setCallbackProgressTimes(int i8);

    a setFinishListener(InterfaceC0289a interfaceC0289a);

    a setForceReDownload(boolean z7);

    a setListener(k kVar);

    a setMinIntervalUpdateSpeed(int i8);

    a setPath(String str);

    a setPath(String str, boolean z7);

    a setSyncCallback(boolean z7);

    a setTag(int i8, Object obj);

    a setTag(Object obj);

    a setWifiRequired(boolean z7);

    int start();
}
