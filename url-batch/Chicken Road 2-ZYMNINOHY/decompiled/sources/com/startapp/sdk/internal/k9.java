package com.startapp.sdk.internal;

/* loaded from: classes.dex */
public final class k9 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f7182a;

    public k9(t9 t9Var) {
        this.f7182a = t9Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        try {
            t9 t9Var = this.f7182a;
            k8 k8Var = t9Var.f7604b;
            k8Var.f7181a.post(new r9(t9Var));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
