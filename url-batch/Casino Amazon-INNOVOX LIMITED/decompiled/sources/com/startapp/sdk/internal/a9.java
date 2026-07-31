package com.startapp.sdk.internal;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f167a;
    public final /* synthetic */ q8 b;
    public final /* synthetic */ d9 c;

    public a9(d9 d9Var, n8 n8Var, q8 q8Var) {
        this.c = d9Var;
        this.f167a = n8Var;
        this.b = q8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d9 d9Var = this.c;
        Runnable runnable = (Runnable) d9Var.f.a(this.f167a, this.b, null);
        if (runnable != null) {
            d9Var.c.execute(runnable);
        }
    }
}
