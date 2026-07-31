package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bc4 {

    /* renamed from: a, reason: collision with root package name */
    private final long f3349a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3350b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3351c;

    /* renamed from: d, reason: collision with root package name */
    private long f3352d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f3353e;

    /* renamed from: f, reason: collision with root package name */
    private long f3354f;

    /* renamed from: g, reason: collision with root package name */
    private long f3355g;

    /* renamed from: h, reason: collision with root package name */
    private long f3356h;

    protected bc4(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.f3349a = j7;
        this.f3350b = j8;
        this.f3353e = j10;
        this.f3354f = j11;
        this.f3355g = j12;
        this.f3351c = j13;
        this.f3356h = f(j8, 0L, j10, j11, j12, j13);
    }

    protected static long f(long j7, long j8, long j9, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || 1 + j8 >= j9) {
            return j10;
        }
        long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
        return n13.U(((j10 + j13) - j12) - (j13 / 20), j10, (-1) + j11);
    }

    static /* bridge */ /* synthetic */ void g(bc4 bc4Var, long j7, long j8) {
        bc4Var.f3353e = j7;
        bc4Var.f3355g = j8;
        bc4Var.i();
    }

    static /* bridge */ /* synthetic */ void h(bc4 bc4Var, long j7, long j8) {
        bc4Var.f3352d = j7;
        bc4Var.f3354f = j8;
        bc4Var.i();
    }

    private final void i() {
        this.f3356h = f(this.f3350b, this.f3352d, this.f3353e, this.f3354f, this.f3355g, this.f3351c);
    }
}
