package com.adjust.sdk.scheduler;

/* loaded from: classes6.dex */
public interface ThreadExecutor {
    void submit(Runnable runnable);

    void teardown();
}
