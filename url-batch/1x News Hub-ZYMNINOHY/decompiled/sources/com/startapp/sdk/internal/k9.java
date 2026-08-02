package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class k9 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f4054a;

    public k9(t9 t9Var) {
        this.f4054a = t9Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        try {
            t9 t9Var = this.f4054a;
            k8 k8Var = t9Var.f4466b;
            k8Var.f4053a.post(new r9(t9Var));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
