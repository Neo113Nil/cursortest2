package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class s3 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f11635c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11636d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11637e;

    /* renamed from: a, reason: collision with root package name */
    private final ky2 f11633a = new ky2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f11638f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f11639g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f11640h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f11634b = new dr2();

    s3() {
    }

    public static long c(dr2 dr2Var) {
        int k7 = dr2Var.k();
        if (dr2Var.i() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        dr2Var.b(bArr, 0, 9);
        dr2Var.f(k7);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j7 = bArr[0];
        byte b7 = bArr[1];
        long j8 = bArr[2];
        return ((bArr[3] & 255) << 5) | ((j7 & 3) << 28) | (((56 & j7) >> 3) << 30) | ((b7 & 255) << 20) | (((j8 & 248) >> 3) << 15) | ((j8 & 3) << 13) | ((bArr[4] & 248) >> 3);
    }

    private final int f(pc4 pc4Var) {
        dr2 dr2Var = this.f11634b;
        byte[] bArr = n13.f8870f;
        int length = bArr.length;
        dr2Var.d(bArr, 0);
        this.f11635c = true;
        pc4Var.i();
        return 0;
    }

    private static final int g(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public final int a(pc4 pc4Var, md4 md4Var) {
        long j7 = -9223372036854775807L;
        if (!this.f11637e) {
            long c7 = pc4Var.c();
            int min = (int) Math.min(20000L, c7);
            long j8 = c7 - min;
            if (pc4Var.b() != j8) {
                md4Var.f8503a = j8;
                return 1;
            }
            this.f11634b.c(min);
            pc4Var.i();
            ((jc4) pc4Var).n(this.f11634b.h(), 0, min, false);
            dr2 dr2Var = this.f11634b;
            int k7 = dr2Var.k();
            int l7 = dr2Var.l() - 4;
            while (true) {
                if (l7 < k7) {
                    break;
                }
                if (g(dr2Var.h(), l7) == 442) {
                    dr2Var.f(l7 + 4);
                    long c8 = c(dr2Var);
                    if (c8 != -9223372036854775807L) {
                        j7 = c8;
                        break;
                    }
                }
                l7--;
            }
            this.f11639g = j7;
            this.f11637e = true;
            return 0;
        }
        if (this.f11639g == -9223372036854775807L) {
            f(pc4Var);
            return 0;
        }
        if (this.f11636d) {
            long j9 = this.f11638f;
            if (j9 == -9223372036854775807L) {
                f(pc4Var);
                return 0;
            }
            long b7 = this.f11633a.b(this.f11639g) - this.f11633a.b(j9);
            this.f11640h = b7;
            if (b7 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b7);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("PsDurationReader", sb.toString());
                this.f11640h = -9223372036854775807L;
            }
            f(pc4Var);
            return 0;
        }
        int min2 = (int) Math.min(20000L, pc4Var.c());
        if (pc4Var.b() != 0) {
            md4Var.f8503a = 0L;
            return 1;
        }
        this.f11634b.c(min2);
        pc4Var.i();
        ((jc4) pc4Var).n(this.f11634b.h(), 0, min2, false);
        dr2 dr2Var2 = this.f11634b;
        int k8 = dr2Var2.k();
        int l8 = dr2Var2.l();
        while (true) {
            if (k8 >= l8 - 3) {
                break;
            }
            if (g(dr2Var2.h(), k8) == 442) {
                dr2Var2.f(k8 + 4);
                long c9 = c(dr2Var2);
                if (c9 != -9223372036854775807L) {
                    j7 = c9;
                    break;
                }
            }
            k8++;
        }
        this.f11638f = j7;
        this.f11636d = true;
        return 0;
    }

    public final long b() {
        return this.f11640h;
    }

    public final ky2 d() {
        return this.f11633a;
    }

    public final boolean e() {
        return this.f11635c;
    }
}
