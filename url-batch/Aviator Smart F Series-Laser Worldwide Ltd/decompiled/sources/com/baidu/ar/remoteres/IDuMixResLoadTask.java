package com.baidu.ar.remoteres;

/* loaded from: classes.dex */
public interface IDuMixResLoadTask {
    boolean canRetry();

    String getError();

    void retry();
}
