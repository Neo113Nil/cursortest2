package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f11031a;

    public r5(Handler handler) {
        this.f11031a = new p5(this, handler);
    }

    public final void a(a6<?> a6Var, k6 k6Var) {
        a6Var.n("post-error");
        g6 a7 = g6.a(k6Var);
        Executor executor = this.f11031a;
        ((p5) executor).f10096f.post(new q5(a6Var, a7, null));
    }

    public final void b(a6<?> a6Var, g6<?> g6Var, Runnable runnable) {
        a6Var.r();
        a6Var.n("post-response");
        Executor executor = this.f11031a;
        ((p5) executor).f10096f.post(new q5(a6Var, g6Var, runnable));
    }
}
