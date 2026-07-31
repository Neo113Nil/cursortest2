package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f493a;

    public x8(d9 d9Var) {
        this.f493a = d9Var;
    }

    public final void a(n8 n8Var, int i) {
        try {
            d9 d9Var = this.f493a;
            long currentTimeMillis = System.currentTimeMillis();
            v7 v7Var = d9Var.b;
            v7Var.f464a.post(new y8(d9Var, n8Var, i, currentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
