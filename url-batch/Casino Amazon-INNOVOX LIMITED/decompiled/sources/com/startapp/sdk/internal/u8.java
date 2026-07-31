package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u8 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f450a;

    public u8(d9 d9Var) {
        this.f450a = d9Var;
    }

    @Override // com.startapp.sdk.internal.c7
    public final Object call() {
        try {
            d9 d9Var = this.f450a;
            v7 v7Var = d9Var.b;
            v7Var.f464a.post(new b9(d9Var));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
