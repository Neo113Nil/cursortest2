package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k8 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4053a;

    public k8(Handler handler) {
        this.f4053a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4053a.post(runnable);
    }
}
