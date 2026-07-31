package com.google.android.gms.internal.ads;

import android.util.Log;

/* loaded from: classes.dex */
final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f8139a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8140b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8141c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8142d;

    private m0(long[] jArr, long[] jArr2, long j7, long j8) {
        this.f8139a = jArr;
        this.f8140b = jArr2;
        this.f8141c = j7;
        this.f8142d = j8;
    }

    public static m0 c(long j7, long j8, jd4 jd4Var, dr2 dr2Var) {
        int s7;
        dr2Var.g(10);
        int m7 = dr2Var.m();
        if (m7 <= 0) {
            return null;
        }
        int i7 = jd4Var.f7098d;
        long Z = n13.Z(m7, (i7 >= 32000 ? 1152 : 576) * 1000000, i7);
        int w6 = dr2Var.w();
        int w7 = dr2Var.w();
        int w8 = dr2Var.w();
        dr2Var.g(2);
        long j9 = j8 + jd4Var.f7097c;
        long[] jArr = new long[w6];
        long[] jArr2 = new long[w6];
        int i8 = 0;
        long j10 = j8;
        while (i8 < w6) {
            int i9 = w7;
            long j11 = j9;
            jArr[i8] = (i8 * Z) / w6;
            jArr2[i8] = Math.max(j10, j11);
            if (w8 == 1) {
                s7 = dr2Var.s();
            } else if (w8 == 2) {
                s7 = dr2Var.w();
            } else if (w8 == 3) {
                s7 = dr2Var.u();
            } else {
                if (w8 != 4) {
                    return null;
                }
                s7 = dr2Var.v();
            }
            j10 += s7 * i9;
            i8++;
            j9 = j11;
            w7 = i9;
        }
        if (j7 != -1 && j7 != j10) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j7);
            sb.append(", ");
            sb.append(j10);
            Log.w("VbriSeeker", sb.toString());
        }
        return new m0(jArr, jArr2, Z, j10);
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long a() {
        return this.f8142d;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f8141c;
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        int J = n13.J(this.f8139a, j7, true, true);
        qd4 qd4Var = new qd4(this.f8139a[J], this.f8140b[J]);
        if (qd4Var.f10661a < j7) {
            long[] jArr = this.f8139a;
            if (J != jArr.length - 1) {
                int i7 = J + 1;
                return new nd4(qd4Var, new qd4(jArr[i7], this.f8140b[i7]));
            }
        }
        return new nd4(qd4Var, qd4Var);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final long i(long j7) {
        return this.f8139a[n13.J(this.f8140b, j7, true, true)];
    }
}
