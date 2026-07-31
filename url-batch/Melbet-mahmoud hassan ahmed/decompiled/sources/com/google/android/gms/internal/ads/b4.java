package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class b4 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f3196c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3197d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3198e;

    /* renamed from: a, reason: collision with root package name */
    private final ky2 f3194a = new ky2(0);

    /* renamed from: f, reason: collision with root package name */
    private long f3199f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f3200g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f3201h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f3195b = new dr2();

    b4(int i7) {
    }

    private final int e(pc4 pc4Var) {
        dr2 dr2Var = this.f3195b;
        byte[] bArr = n13.f8870f;
        int length = bArr.length;
        dr2Var.d(bArr, 0);
        this.f3196c = true;
        pc4Var.i();
        return 0;
    }

    public final int a(pc4 pc4Var, md4 md4Var, int i7) {
        if (i7 <= 0) {
            e(pc4Var);
            return 0;
        }
        long j7 = -9223372036854775807L;
        if (!this.f3198e) {
            long c7 = pc4Var.c();
            int min = (int) Math.min(112800L, c7);
            long j8 = c7 - min;
            if (pc4Var.b() != j8) {
                md4Var.f8503a = j8;
                return 1;
            }
            this.f3195b.c(min);
            pc4Var.i();
            ((jc4) pc4Var).n(this.f3195b.h(), 0, min, false);
            dr2 dr2Var = this.f3195b;
            int k7 = dr2Var.k();
            int l7 = dr2Var.l();
            int i8 = l7 - 188;
            while (true) {
                if (i8 < k7) {
                    break;
                }
                byte[] h7 = dr2Var.h();
                int i9 = -4;
                int i10 = 0;
                while (true) {
                    if (i9 > 4) {
                        break;
                    }
                    int i11 = (i9 * 188) + i8;
                    if (i11 < k7 || i11 >= l7 || h7[i11] != 71) {
                        i10 = 0;
                    } else {
                        i10++;
                        if (i10 == 5) {
                            long b7 = m4.b(dr2Var, i8, i7);
                            if (b7 != -9223372036854775807L) {
                                j7 = b7;
                                break;
                            }
                        }
                    }
                    i9++;
                }
                i8--;
            }
            this.f3200g = j7;
            this.f3198e = true;
            return 0;
        }
        if (this.f3200g == -9223372036854775807L) {
            e(pc4Var);
            return 0;
        }
        if (this.f3197d) {
            long j9 = this.f3199f;
            if (j9 == -9223372036854775807L) {
                e(pc4Var);
                return 0;
            }
            long b8 = this.f3194a.b(this.f3200g) - this.f3194a.b(j9);
            this.f3201h = b8;
            if (b8 < 0) {
                StringBuilder sb = new StringBuilder(65);
                sb.append("Invalid duration: ");
                sb.append(b8);
                sb.append(". Using TIME_UNSET instead.");
                Log.w("TsDurationReader", sb.toString());
                this.f3201h = -9223372036854775807L;
            }
            e(pc4Var);
            return 0;
        }
        int min2 = (int) Math.min(112800L, pc4Var.c());
        if (pc4Var.b() != 0) {
            md4Var.f8503a = 0L;
            return 1;
        }
        this.f3195b.c(min2);
        pc4Var.i();
        ((jc4) pc4Var).n(this.f3195b.h(), 0, min2, false);
        dr2 dr2Var2 = this.f3195b;
        int k8 = dr2Var2.k();
        int l8 = dr2Var2.l();
        while (true) {
            if (k8 >= l8) {
                break;
            }
            if (dr2Var2.h()[k8] == 71) {
                long b9 = m4.b(dr2Var2, k8, i7);
                if (b9 != -9223372036854775807L) {
                    j7 = b9;
                    break;
                }
            }
            k8++;
        }
        this.f3199f = j7;
        this.f3197d = true;
        return 0;
    }

    public final long b() {
        return this.f3201h;
    }

    public final ky2 c() {
        return this.f3194a;
    }

    public final boolean d() {
        return this.f3196c;
    }
}
