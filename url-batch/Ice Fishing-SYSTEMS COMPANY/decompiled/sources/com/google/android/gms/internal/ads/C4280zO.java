package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zO, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4280zO {

    /* renamed from: t, reason: collision with root package name */
    public static final BQ f35529t = new BQ(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3832r8 f35530a;

    /* renamed from: b, reason: collision with root package name */
    public final BQ f35531b;

    /* renamed from: c, reason: collision with root package name */
    public final long f35532c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35533d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35534e;

    /* renamed from: f, reason: collision with root package name */
    public final RN f35535f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f35536g;

    /* renamed from: h, reason: collision with root package name */
    public final C3041cR f35537h;
    public final C3877s i;

    /* renamed from: j, reason: collision with root package name */
    public final List f35538j;

    /* renamed from: k, reason: collision with root package name */
    public final BQ f35539k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f35540l;

    /* renamed from: m, reason: collision with root package name */
    public final int f35541m;

    /* renamed from: n, reason: collision with root package name */
    public final int f35542n;

    /* renamed from: o, reason: collision with root package name */
    public final C4045v5 f35543o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f35544p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f35545q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f35546r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f35547s;

    public C4280zO(AbstractC3832r8 abstractC3832r8, BQ bq, long j9, long j10, int i, RN rn, boolean z8, C3041cR c3041cR, C3877s c3877s, List list, BQ bq2, boolean z9, int i4, int i9, C4045v5 c4045v5, long j11, long j12, long j13, long j14) {
        this.f35530a = abstractC3832r8;
        this.f35531b = bq;
        this.f35532c = j9;
        this.f35533d = j10;
        this.f35534e = i;
        this.f35535f = rn;
        this.f35536g = z8;
        this.f35537h = c3041cR;
        this.i = c3877s;
        this.f35538j = list;
        this.f35539k = bq2;
        this.f35540l = z9;
        this.f35541m = i4;
        this.f35542n = i9;
        this.f35543o = c4045v5;
        this.f35544p = j11;
        this.f35545q = j12;
        this.f35546r = j13;
        this.f35547s = j14;
    }

    public static C4280zO a(C3877s c3877s) {
        C4155x7 c4155x7 = AbstractC3832r8.f33969a;
        BQ bq = f35529t;
        return new C4280zO(c4155x7, bq, com.anythink.basead.exoplayer.b.f6539b, 0L, 1, null, false, C3041cR.f29709d, c3877s, C3675oC.f33115x, bq, false, 1, 0, C4045v5.f34711d, 0L, 0L, 0L, 0L);
    }

    public final C4280zO b(BQ bq, long j9, long j10, long j11, long j12, C3041cR c3041cR, C3877s c3877s, List list) {
        BQ bq2 = this.f35539k;
        boolean z8 = this.f35540l;
        int i = this.f35541m;
        int i4 = this.f35542n;
        C4045v5 c4045v5 = this.f35543o;
        long j13 = this.f35544p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new C4280zO(this.f35530a, bq, j10, j11, this.f35534e, this.f35535f, this.f35536g, c3041cR, c3877s, list, bq2, z8, i, i4, c4045v5, j13, j12, j9, elapsedRealtime);
    }

    public final C4280zO c(AbstractC3832r8 abstractC3832r8) {
        return new C4280zO(abstractC3832r8, this.f35531b, this.f35532c, this.f35533d, this.f35534e, this.f35535f, this.f35536g, this.f35537h, this.i, this.f35538j, this.f35539k, this.f35540l, this.f35541m, this.f35542n, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final C4280zO d(int i) {
        return new C4280zO(this.f35530a, this.f35531b, this.f35532c, this.f35533d, i, this.f35535f, this.f35536g, this.f35537h, this.i, this.f35538j, this.f35539k, this.f35540l, this.f35541m, this.f35542n, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final C4280zO e(RN rn) {
        return new C4280zO(this.f35530a, this.f35531b, this.f35532c, this.f35533d, this.f35534e, rn, this.f35536g, this.f35537h, this.i, this.f35538j, this.f35539k, this.f35540l, this.f35541m, this.f35542n, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final C4280zO f(boolean z8) {
        return new C4280zO(this.f35530a, this.f35531b, this.f35532c, this.f35533d, this.f35534e, this.f35535f, z8, this.f35537h, this.i, this.f35538j, this.f35539k, this.f35540l, this.f35541m, this.f35542n, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final C4280zO g(BQ bq) {
        return new C4280zO(this.f35530a, this.f35531b, this.f35532c, this.f35533d, this.f35534e, this.f35535f, this.f35536g, this.f35537h, this.i, this.f35538j, bq, this.f35540l, this.f35541m, this.f35542n, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final C4280zO h(int i, int i4, boolean z8) {
        return new C4280zO(this.f35530a, this.f35531b, this.f35532c, this.f35533d, this.f35534e, this.f35535f, this.f35536g, this.f35537h, this.i, this.f35538j, this.f35539k, z8, i, i4, this.f35543o, this.f35544p, this.f35545q, this.f35546r, this.f35547s);
    }

    public final boolean i() {
        return this.f35534e == 3 && this.f35540l && this.f35542n == 0;
    }
}
