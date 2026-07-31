package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class a74 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2660a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2661b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2662c;

    /* renamed from: d, reason: collision with root package name */
    public s84 f2663d;

    /* renamed from: e, reason: collision with root package name */
    public a74 f2664e;

    public a74(long j7, int i7) {
        this.f2660a = j7;
        this.f2661b = j7 + 65536;
    }

    public final int a(long j7) {
        long j8 = this.f2660a;
        int i7 = this.f2663d.f11735b;
        return (int) (j7 - j8);
    }

    public final a74 b() {
        this.f2663d = null;
        a74 a74Var = this.f2664e;
        this.f2664e = null;
        return a74Var;
    }
}
