package com.startapp.sdk.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class v7 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f464a;

    public v7(Handler handler) {
        this.f464a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f464a.post(runnable);
    }
}
