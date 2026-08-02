package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f7330a;

    public n9(t9 t9Var) {
        this.f7330a = t9Var;
    }

    public final void a(d9 d9Var, int i4) {
        try {
            t9 t9Var = this.f7330a;
            t9Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            k8 k8Var = t9Var.f7604b;
            k8Var.f7181a.post(new o9(t9Var, d9Var, i4, currentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
