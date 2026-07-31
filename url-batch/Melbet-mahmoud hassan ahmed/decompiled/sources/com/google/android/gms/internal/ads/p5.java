package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class p5 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Handler f10096f;

    p5(r5 r5Var, Handler handler) {
        this.f10096f = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10096f.post(runnable);
    }
}
