package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f4197a;

    public n9(t9 t9Var) {
        this.f4197a = t9Var;
    }

    public final void a(d9 d9Var, int i3) {
        try {
            t9 t9Var = this.f4197a;
            t9Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            k8 k8Var = t9Var.f4466b;
            k8Var.f4053a.post(new o9(t9Var, d9Var, i3, currentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
