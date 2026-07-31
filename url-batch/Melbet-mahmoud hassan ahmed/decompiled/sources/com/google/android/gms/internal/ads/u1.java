package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
final class u1 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    private final a2 f12550a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12551b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12552c;

    /* renamed from: d, reason: collision with root package name */
    private final h2 f12553d;

    /* renamed from: e, reason: collision with root package name */
    private int f12554e;

    /* renamed from: f, reason: collision with root package name */
    private long f12555f;

    /* renamed from: g, reason: collision with root package name */
    private long f12556g;

    /* renamed from: h, reason: collision with root package name */
    private long f12557h;

    /* renamed from: i, reason: collision with root package name */
    private long f12558i;

    /* renamed from: j, reason: collision with root package name */
    private long f12559j;

    /* renamed from: k, reason: collision with root package name */
    private long f12560k;

    /* renamed from: l, reason: collision with root package name */
    private long f12561l;

    public u1(h2 h2Var, long j7, long j8, long j9, long j10, boolean z6) {
        wu1.d(j7 >= 0 && j8 > j7);
        this.f12553d = h2Var;
        this.f12551b = j7;
        this.f12552c = j8;
        if (j9 == j8 - j7 || z6) {
            this.f12555f = j10;
            this.f12554e = 4;
        } else {
            this.f12554e = 0;
        }
        this.f12550a = new a2();
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final /* bridge */ /* synthetic */ pd4 b() {
        s1 s1Var = null;
        if (this.f12555f != 0) {
            return new t1(this, s1Var);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    @Override // com.google.android.gms.internal.ads.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(pc4 pc4Var) {
        long j7;
        a2 a2Var;
        long j8;
        long U;
        int i7 = this.f12554e;
        if (i7 == 0) {
            long b7 = pc4Var.b();
            this.f12556g = b7;
            this.f12554e = 1;
            long j9 = this.f12552c - 65307;
            if (j9 > b7) {
                return j9;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                if (this.f12558i != this.f12559j) {
                    long b8 = pc4Var.b();
                    if (this.f12550a.c(pc4Var, this.f12559j)) {
                        this.f12550a.b(pc4Var, false);
                        pc4Var.i();
                        long j10 = this.f12557h;
                        a2 a2Var2 = this.f12550a;
                        long j11 = a2Var2.f2556b;
                        long j12 = j10 - j11;
                        int i8 = a2Var2.f2558d + a2Var2.f2559e;
                        if (j12 < 0 || j12 >= 72000) {
                            if (j12 < 0) {
                                this.f12559j = b8;
                                this.f12561l = j11;
                            } else {
                                this.f12558i = pc4Var.b() + i8;
                                this.f12560k = this.f12550a.f2556b;
                            }
                            long j13 = this.f12559j;
                            long j14 = this.f12558i;
                            if (j13 - j14 < 100000) {
                                this.f12559j = j14;
                                j8 = -1;
                                U = j14;
                            } else {
                                long j15 = i8;
                                long j16 = j12 <= 0 ? 2L : 1L;
                                long b9 = pc4Var.b();
                                long j17 = this.f12559j;
                                long j18 = this.f12558i;
                                long j19 = (b9 - (j15 * j16)) + ((j12 * (j17 - j18)) / (this.f12561l - this.f12560k));
                                j8 = -1;
                                U = n13.U(j19, j18, j17 - 1);
                            }
                        }
                    } else {
                        U = this.f12558i;
                        if (U == b8) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j8 = -1;
                    }
                    if (U == j8) {
                        return U;
                    }
                    this.f12554e = 3;
                }
                j8 = -1;
                U = -1;
                if (U == j8) {
                }
            } else {
                if (i7 != 3) {
                    return -1L;
                }
                j8 = -1;
            }
            while (true) {
                this.f12550a.c(pc4Var, j8);
                this.f12550a.b(pc4Var, false);
                a2 a2Var3 = this.f12550a;
                if (a2Var3.f2556b > this.f12557h) {
                    pc4Var.i();
                    this.f12554e = 4;
                    return -(this.f12560k + 2);
                }
                ((jc4) pc4Var).p(a2Var3.f2558d + a2Var3.f2559e, false);
                this.f12558i = pc4Var.b();
                this.f12560k = this.f12550a.f2556b;
                j8 = -1;
            }
        }
        this.f12550a.a();
        if (!this.f12550a.c(pc4Var, -1L)) {
            throw new EOFException();
        }
        this.f12550a.b(pc4Var, false);
        a2 a2Var4 = this.f12550a;
        ((jc4) pc4Var).p(a2Var4.f2558d + a2Var4.f2559e, false);
        do {
            j7 = this.f12550a.f2556b;
            a2 a2Var5 = this.f12550a;
            if ((a2Var5.f2555a & 4) == 4 || !a2Var5.c(pc4Var, -1L) || pc4Var.b() >= this.f12552c || !this.f12550a.b(pc4Var, true)) {
                break;
            }
            a2Var = this.f12550a;
        } while (sc4.e(pc4Var, a2Var.f2558d + a2Var.f2559e));
        this.f12555f = j7;
        this.f12554e = 4;
        return this.f12556g;
    }

    @Override // com.google.android.gms.internal.ads.b2
    public final void d(long j7) {
        this.f12557h = n13.U(j7, 0L, this.f12555f - 1);
        this.f12554e = 2;
        this.f12558i = this.f12551b;
        this.f12559j = this.f12552c;
        this.f12560k = 0L;
        this.f12561l = this.f12555f;
    }
}
