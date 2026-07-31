package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
final class rk2 implements ww1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f31262a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31263b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31264c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31265d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31266e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f31267f;

    private rk2(long j4, int i4, long j5, long j6, long[] jArr) {
        this.f31262a = j4;
        this.f31263b = i4;
        this.f31264c = j5;
        this.f31267f = jArr;
        this.f31265d = j6;
        this.f31266e = j6 != -1 ? j4 + j6 : -1L;
    }

    public static rk2 a(long j4, long j5, s11.a aVar, sf1 sf1Var) {
        int x4;
        int i4 = aVar.f31535g;
        int i5 = aVar.f31532d;
        int h4 = sf1Var.h();
        if ((h4 & 1) != 1 || (x4 = sf1Var.x()) == 0) {
            return null;
        }
        long a4 = u82.a(x4, i4 * 1000000, i5);
        if ((h4 & 6) != 6) {
            return new rk2(j5, aVar.f31531c, a4, -1L, null);
        }
        long v4 = sf1Var.v();
        long[] jArr = new long[100];
        for (int i6 = 0; i6 < 100; i6++) {
            jArr[i6] = sf1Var.t();
        }
        if (j4 != -1) {
            long j6 = j5 + v4;
            if (j4 != j6) {
                ms0.d("XingSeeker", "XING data size mismatch: " + j4 + ", " + j6);
            }
        }
        return new rk2(j5, aVar.f31531c, a4, v4, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        if (!b()) {
            vw1 vw1Var = new vw1(0L, this.f31262a + this.f31263b);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j5 = this.f31264c;
        int i4 = u82.f32873a;
        long max = Math.max(0L, Math.min(j4, j5));
        double d4 = (max * 100.0d) / this.f31264c;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i5 = (int) d4;
                long[] jArr = this.f31267f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d6 = jArr[i5];
                d5 = d6 + (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d6) * (d4 - i5));
            }
        }
        vw1 vw1Var2 = new vw1(max, this.f31262a + Math.max(this.f31263b, Math.min(Math.round((d5 / 256.0d) * this.f31265d), this.f31265d - 1)));
        return new tw1.a(vw1Var2, vw1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f31264c;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a() {
        return this.f31266e;
    }

    @Override // com.yandex.mobile.ads.impl.ww1
    public final long a(long j4) {
        long j5 = j4 - this.f31262a;
        if (!b() || j5 <= this.f31263b) {
            return 0L;
        }
        long[] jArr = this.f31267f;
        if (jArr != null) {
            double d4 = (j5 * 256.0d) / this.f31265d;
            int b4 = u82.b(jArr, (long) d4, true);
            long j6 = this.f31264c;
            long j7 = (b4 * j6) / 100;
            long j8 = jArr[b4];
            int i4 = b4 + 1;
            long j9 = (j6 * i4) / 100;
            return Math.round((j8 == (b4 == 99 ? 256L : jArr[i4]) ? 0.0d : (d4 - j8) / (r0 - j8)) * (j9 - j7)) + j7;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f31267f != null;
    }
}
