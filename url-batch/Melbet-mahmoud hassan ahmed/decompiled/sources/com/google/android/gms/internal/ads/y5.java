package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class y5 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f14550f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f14551g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ a6 f14552h;

    y5(a6 a6Var, String str, long j7) {
        this.f14552h = a6Var;
        this.f14550f = str;
        this.f14551g = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 m6Var;
        m6 m6Var2;
        m6Var = this.f14552h.f2632f;
        m6Var.a(this.f14550f, this.f14551g);
        m6Var2 = this.f14552h.f2632f;
        m6Var2.b(this.f14552h.toString());
    }
}
