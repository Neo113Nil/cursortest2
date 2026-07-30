package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3879s1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3825r1 f34158a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3448k1 f34159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34160c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34161d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34162e;

    /* renamed from: f, reason: collision with root package name */
    public int f34163f;

    /* renamed from: g, reason: collision with root package name */
    public int f34164g;

    /* renamed from: h, reason: collision with root package name */
    public int f34165h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f34166j;

    /* renamed from: k, reason: collision with root package name */
    public int f34167k;

    /* renamed from: l, reason: collision with root package name */
    public long f34168l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f34169m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f34170n;

    public C3879s1(int i, C3825r1 c3825r1, InterfaceC3448k1 interfaceC3448k1) {
        this.f34158a = c3825r1;
        int b9 = c3825r1.b();
        boolean z8 = true;
        if (b9 != 1) {
            if (b9 == 2) {
                b9 = 2;
            } else {
                z8 = false;
            }
        }
        PA.n(z8);
        int i4 = ((i / 10) + 48) | (((i % 10) + 48) << 8);
        this.f34160c = (b9 == 2 ? 1667497984 : 1651965952) | i4;
        long j9 = c3825r1.f33929c;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i9 = c3825r1.f33930d;
        this.f34162e = AbstractC3548lu.w(i9, c3825r1.f33928b * 1000000, j9, roundingMode);
        this.f34159b = interfaceC3448k1;
        this.f34161d = b9 == 2 ? 1650720768 | i4 : -1;
        this.f34168l = -1L;
        this.f34169m = new long[512];
        this.f34170n = new int[512];
        this.f34163f = i9;
    }

    public final C2961b1 a(long j9) {
        if (this.f34167k == 0) {
            C3070d1 c3070d1 = new C3070d1(0L, this.f34168l);
            return new C2961b1(c3070d1, c3070d1);
        }
        int i = (int) (j9 / ((this.f34162e * 1) / this.f34163f));
        int r9 = AbstractC3548lu.r(this.f34170n, i, true, true);
        if (this.f34170n[r9] == i) {
            C3070d1 b9 = b(r9);
            return new C2961b1(b9, b9);
        }
        C3070d1 b10 = b(r9);
        int i4 = r9 + 1;
        return i4 < this.f34169m.length ? new C2961b1(b10, b(i4)) : new C2961b1(b10, b10);
    }

    public final C3070d1 b(int i) {
        return new C3070d1(((this.f34162e * 1) / this.f34163f) * this.f34170n[i], this.f34169m[i]);
    }
}
