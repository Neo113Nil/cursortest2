package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class ka2 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f28140a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f28141b;

    /* renamed from: c, reason: collision with root package name */
    private final long f28142c;

    /* renamed from: d, reason: collision with root package name */
    private final long f28143d;

    private ka2(long[] jArr, long[] jArr2, long j4, long j5) {
        this.f28140a = jArr;
        this.f28141b = jArr2;
        this.f28142c = j4;
        this.f28143d = j5;
    }

    public static ka2 a(long j4, long j5, s11.a aVar, sf1 sf1Var) {
        int t4;
        sf1Var.f(10);
        int h4 = sf1Var.h();
        ka2 ka2Var = null;
        if (h4 <= 0) {
            return null;
        }
        int i4 = aVar.f31532d;
        long a4 = u82.a(h4, (i4 >= 32000 ? 1152 : 576) * 1000000, i4);
        int z4 = sf1Var.z();
        int z5 = sf1Var.z();
        int z6 = sf1Var.z();
        int i5 = 2;
        sf1Var.f(2);
        long j6 = j5 + aVar.f31531c;
        long[] jArr = new long[z4];
        long[] jArr2 = new long[z4];
        int i6 = 0;
        long j7 = j5;
        while (i6 < z4) {
            ka2 ka2Var2 = ka2Var;
            int i7 = z5;
            long[] jArr3 = jArr;
            jArr3[i6] = (i6 * a4) / z4;
            jArr2[i6] = Math.max(j7, j6);
            if (z6 == 1) {
                t4 = sf1Var.t();
            } else if (z6 == i5) {
                t4 = sf1Var.z();
            } else if (z6 == 3) {
                t4 = sf1Var.w();
            } else {
                if (z6 != 4) {
                    return ka2Var2;
                }
                t4 = sf1Var.x();
            }
            j7 += t4 * i7;
            i6++;
            ka2Var = ka2Var2;
            z5 = i7;
            jArr = jArr3;
            j6 = j6;
            i5 = 2;
        }
        long[] jArr4 = jArr;
        if (j4 != -1 && j4 != j7) {
            ms0.d("VbriSeeker", "VBRI data size mismatch: " + j4 + ", " + j7);
        }
        return new ka2(jArr4, jArr2, a4, j7);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f28142c;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        int b4 = u82.b(this.f28140a, j4, true);
        long[] jArr = this.f28140a;
        long j5 = jArr[b4];
        long[] jArr2 = this.f28141b;
        vw1 vw1Var = new vw1(j5, jArr2[b4]);
        if (j5 >= j4 || b4 == jArr.length - 1) {
            return new tw1.a(vw1Var, vw1Var);
        }
        int i4 = b4 + 1;
        return new tw1.a(vw1Var, new vw1(jArr[i4], jArr2[i4]));
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f28143d;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        return this.f28140a[u82.b(this.f28141b, j4, true)];
    }
}
