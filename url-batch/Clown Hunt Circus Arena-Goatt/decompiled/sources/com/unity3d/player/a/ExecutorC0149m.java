package com.unity3d.player.a;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.unity3d.player.a.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0149m implements Executor {
    public final Handler a;

    public ExecutorC0149m(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.a.post(runnable)) {
            throw new RejectedExecutionException(this.a + " is shutting down");
        }
    }
}
