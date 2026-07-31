package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9425a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9427c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9428d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9429e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f9430f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9431g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f9432h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f9433i;

    /* renamed from: j, reason: collision with root package name */
    public final int f9434j;

    /* renamed from: k, reason: collision with root package name */
    private final p1[] f9435k;

    public o1(int i7, int i8, long j7, long j8, long j9, c0 c0Var, int i9, p1[] p1VarArr, int i10, long[] jArr, long[] jArr2) {
        this.f9425a = i7;
        this.f9426b = i8;
        this.f9427c = j7;
        this.f9428d = j8;
        this.f9429e = j9;
        this.f9430f = c0Var;
        this.f9431g = i9;
        this.f9435k = p1VarArr;
        this.f9434j = i10;
        this.f9432h = jArr;
        this.f9433i = jArr2;
    }

    public final p1 a(int i7) {
        p1[] p1VarArr = this.f9435k;
        if (p1VarArr == null) {
            return null;
        }
        return p1VarArr[i7];
    }
}
