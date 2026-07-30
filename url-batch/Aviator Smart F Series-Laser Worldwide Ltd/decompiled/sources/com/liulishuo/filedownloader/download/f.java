package com.liulishuo.filedownloader.download;

/* loaded from: classes4.dex */
public interface f {
    boolean isRetry(Exception exc);

    void onCompleted(c cVar, long j8, long j9);

    void onError(Exception exc);

    void onProgress(long j8);

    void onRetry(Exception exc);

    void syncProgressFromCache();
}
