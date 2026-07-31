package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public class jr implements tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f27808a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27809b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27810c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27811d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27812e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27813f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f27814g;

    public jr(int i4, int i5, long j4, long j5, boolean z4) {
        this.f27808a = j4;
        this.f27809b = j5;
        this.f27810c = i5 == -1 ? 1 : i5;
        this.f27812e = i4;
        this.f27814g = z4;
        if (j4 == -1) {
            this.f27811d = -1L;
            this.f27813f = -9223372036854775807L;
        } else {
            this.f27811d = j4 - j5;
            this.f27813f = a(i4, j4, j5);
        }
    }

    public long a(long j4) {
        return c(j4);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j5 = this.f27811d;
        if (j5 == -1 && !this.f27814g) {
            vw1 vw1Var = new vw1(0L, this.f27809b);
            return new tw1.a(vw1Var, vw1Var);
        }
        long j6 = this.f27810c;
        long j7 = (((this.f27812e * j4) / 8000000) / j6) * j6;
        if (j5 != -1) {
            j7 = Math.min(j7, j5 - j6);
        }
        long max = Math.max(j7, 0L);
        long j8 = this.f27809b;
        long j9 = max + j8;
        long a4 = a(this.f27812e, j9, j8);
        vw1 vw1Var2 = new vw1(a4, j9);
        if (this.f27811d != -1 && a4 < j4) {
            long j10 = j9 + this.f27810c;
            if (j10 < this.f27808a) {
                return new tw1.a(vw1Var2, new vw1(a(this.f27812e, j10, this.f27809b), j10));
            }
        }
        return new tw1.a(vw1Var2, vw1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f27813f;
    }

    private static long a(int i4, long j4, long j5) {
        return (Math.max(0L, j4 - j5) * 8000000) / i4;
    }

    public final long c(long j4) {
        return a(this.f27812e, j4, this.f27809b);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return this.f27811d != -1 || this.f27814g;
    }
}
