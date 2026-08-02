package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class q9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f7489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f7490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f7491c;

    public q9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f7491c = t9Var;
        this.f7489a = d9Var;
        this.f7490b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f7491c;
        Runnable runnable = (Runnable) t9Var.f7608f.a(this.f7489a, this.f7490b, null);
        if (runnable != null) {
            t9Var.f7605c.execute(runnable);
        }
    }
}
