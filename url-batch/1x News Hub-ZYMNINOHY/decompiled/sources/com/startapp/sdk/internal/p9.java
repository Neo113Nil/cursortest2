package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class p9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f4306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g9 f4307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f4308c;

    public p9(t9 t9Var, d9 d9Var, g9 g9Var) {
        this.f4308c = t9Var;
        this.f4306a = d9Var;
        this.f4307b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 t9Var = this.f4308c;
        d9 d9Var = this.f4306a;
        g9 g9Var = this.f4307b;
        t9Var.getClass();
        try {
            t9Var.f4465a.a(d9Var, g9Var);
        } catch (Throwable unused) {
        }
    }
}
