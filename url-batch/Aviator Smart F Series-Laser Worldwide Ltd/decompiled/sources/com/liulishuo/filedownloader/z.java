package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes4.dex */
public interface z extends t {

    public interface a {
        v getMessenger();

        MessageSnapshot prepareErrorMessage(Throwable th);

        boolean updateKeepAhead(MessageSnapshot messageSnapshot);

        boolean updateKeepFlow(MessageSnapshot messageSnapshot);

        boolean updateMoreLikelyCompleted(MessageSnapshot messageSnapshot);

        boolean updateSameFilePathTaskRunning(MessageSnapshot messageSnapshot);
    }

    public interface b {
        boolean equalListener(k kVar);

        void start();
    }

    void free();

    Throwable getErrorCause();

    String getEtag();

    int getRetryingTimes();

    long getSofarBytes();

    @Override // com.liulishuo.filedownloader.t
    /* synthetic */ int getSpeed();

    byte getStatus();

    long getTotalBytes();

    void intoLaunchPool();

    boolean isLargeFile();

    boolean isResuming();

    boolean isReusedOldFile();

    boolean pause();

    void reset();

    @Override // com.liulishuo.filedownloader.t
    /* synthetic */ void setMinIntervalUpdateSpeed(int i8);
}
