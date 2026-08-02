package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f4354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f4355c;

    public q9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f4355c = t9Var;
        this.f4353a = d9Var;
        this.f4354b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f4355c;
        Runnable runnable = (Runnable) t9Var.f.a(this.f4353a, this.f4354b, null);
        if (runnable != null) {
            t9Var.f4467c.execute(runnable);
        }
    }
}
