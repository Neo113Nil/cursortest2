package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class z8 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f521a;
    public final /* synthetic */ q8 b;
    public final /* synthetic */ d9 c;

    public z8(d9 d9Var, n8 n8Var, q8 q8Var) {
        this.c = d9Var;
        this.f521a = n8Var;
        this.b = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d9 d9Var = this.c;
        try {
            d9Var.f213a.a(this.f521a, this.b);
        } catch (Throwable unused) {
        }
    }
}
