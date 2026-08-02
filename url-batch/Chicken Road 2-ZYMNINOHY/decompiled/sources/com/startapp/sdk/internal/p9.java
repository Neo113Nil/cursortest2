package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f7441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f7442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f7443c;

    public p9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f7443c = t9Var;
        this.f7441a = d9Var;
        this.f7442b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f7443c;
        d9 d9Var = this.f7441a;
        g9 g9Var = this.f7442b;
        t9Var.getClass();
        try {
            t9Var.f7603a.a(d9Var, g9Var);
        } catch (Throwable unused) {
        }
    }
}
