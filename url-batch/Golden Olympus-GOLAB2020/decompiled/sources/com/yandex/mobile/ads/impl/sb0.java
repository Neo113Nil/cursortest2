package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class sb0 implements p70 {

    /* renamed from: f, reason: collision with root package name */
    private r70 f31663f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f31665h;

    /* renamed from: i, reason: collision with root package name */
    private long f31666i;

    /* renamed from: j, reason: collision with root package name */
    private int f31667j;

    /* renamed from: k, reason: collision with root package name */
    private int f31668k;

    /* renamed from: l, reason: collision with root package name */
    private int f31669l;

    /* renamed from: m, reason: collision with root package name */
    private long f31670m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f31671n;

    /* renamed from: o, reason: collision with root package name */
    private C2047kh f31672o;

    /* renamed from: p, reason: collision with root package name */
    private xf2 f31673p;

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f31658a = new sf1(4);

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f31659b = new sf1(9);

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f31660c = new sf1(11);

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f31661d = new sf1();

    /* renamed from: e, reason: collision with root package name */
    private final mt1 f31662e = new mt1();

    /* renamed from: g, reason: collision with root package name */
    private int f31664g = 1;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Fd
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = sb0.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f31663f = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    private sf1 a(lz lzVar) {
        if (this.f31669l > this.f31661d.b()) {
            sf1 sf1Var = this.f31661d;
            sf1Var.a(0, new byte[Math.max(sf1Var.b() * 2, this.f31669l)]);
        } else {
            this.f31661d.e(0);
        }
        this.f31661d.d(this.f31669l);
        lzVar.a(this.f31661d.c(), 0, this.f31669l, false);
        return this.f31661d;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0006 A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        boolean z4;
        boolean z5;
        if (this.f31663f == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i4 = this.f31664g;
            if (i4 == 1) {
                if (!((lz) q70Var).a(this.f31659b.c(), 0, 9, true)) {
                    return -1;
                }
                this.f31659b.e(0);
                this.f31659b.f(4);
                int t4 = this.f31659b.t();
                boolean z6 = (t4 & 4) != 0;
                boolean z7 = (t4 & 1) != 0;
                if (z6 && this.f31672o == null) {
                    this.f31672o = new C2047kh(this.f31663f.a(8, 1));
                }
                if (z7 && this.f31673p == null) {
                    this.f31673p = new xf2(this.f31663f.a(9, 2));
                }
                this.f31663f.a();
                this.f31667j = this.f31659b.h() - 5;
                this.f31664g = 2;
            } else if (i4 == 2) {
                ((lz) q70Var).a(this.f31667j);
                this.f31667j = 0;
                this.f31664g = 3;
            } else if (i4 == 3) {
                if (!((lz) q70Var).a(this.f31660c.c(), 0, 11, true)) {
                    return -1;
                }
                this.f31660c.e(0);
                this.f31668k = this.f31660c.t();
                this.f31669l = this.f31660c.w();
                this.f31670m = this.f31660c.w();
                this.f31670m = ((this.f31660c.t() << 24) | this.f31670m) * 1000;
                this.f31660c.f(3);
                this.f31664g = 4;
            } else if (i4 == 4) {
                if (this.f31665h) {
                    j4 = this.f31666i + this.f31670m;
                } else {
                    j4 = this.f31662e.a() == -9223372036854775807L ? 0L : this.f31670m;
                }
                int i5 = this.f31668k;
                if (i5 == 8 && this.f31672o != null) {
                    if (!this.f31671n) {
                        this.f31663f.a(new tw1.b(-9223372036854775807L, 0L));
                        this.f31671n = true;
                    }
                    C2047kh c2047kh = this.f31672o;
                    sf1 a4 = a((lz) q70Var);
                    c2047kh.a(a4);
                    z4 = c2047kh.a(j4, a4);
                } else {
                    if (i5 == 9 && this.f31673p != null) {
                        if (!this.f31671n) {
                            this.f31663f.a(new tw1.b(-9223372036854775807L, 0L));
                            this.f31671n = true;
                        }
                        xf2 xf2Var = this.f31673p;
                        sf1 a5 = a((lz) q70Var);
                        if (xf2Var.a(a5) && xf2Var.a(j4, a5)) {
                            z4 = true;
                            z5 = z4;
                        } else {
                            z4 = false;
                        }
                    } else if (i5 == 18 && !this.f31671n) {
                        mt1 mt1Var = this.f31662e;
                        sf1 a6 = a((lz) q70Var);
                        mt1Var.getClass();
                        z4 = mt1Var.a(j4, a6);
                        long a7 = this.f31662e.a();
                        if (a7 != -9223372036854775807L) {
                            this.f31663f.a(new hk0(a7, this.f31662e.b(), this.f31662e.c()));
                            this.f31671n = true;
                        }
                    } else {
                        ((lz) q70Var).a(this.f31669l);
                        z4 = false;
                        z5 = z4;
                    }
                    if (!this.f31665h && z4) {
                        this.f31665h = true;
                        this.f31666i = this.f31662e.a() == -9223372036854775807L ? -this.f31670m : 0L;
                    }
                    this.f31667j = 4;
                    this.f31664g = 2;
                    if (!z5) {
                        return 0;
                    }
                }
                z5 = true;
                if (!this.f31665h) {
                    this.f31665h = true;
                    this.f31666i = this.f31662e.a() == -9223372036854775807L ? -this.f31670m : 0L;
                }
                this.f31667j = 4;
                this.f31664g = 2;
                if (!z5) {
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f31664g = 1;
            this.f31665h = false;
        } else {
            this.f31664g = 3;
        }
        this.f31667j = 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar = (lz) q70Var;
        lzVar.b(this.f31658a.c(), 0, 3, false);
        this.f31658a.e(0);
        if (this.f31658a.w() != 4607062) {
            return false;
        }
        lzVar.b(this.f31658a.c(), 0, 2, false);
        this.f31658a.e(0);
        if ((this.f31658a.z() & IronSourceConstants.INTERSTITIAL_DAILY_CAPPED) != 0) {
            return false;
        }
        lzVar.b(this.f31658a.c(), 0, 4, false);
        this.f31658a.e(0);
        int h4 = this.f31658a.h();
        lzVar.c();
        lzVar.a(false, h4);
        lzVar.b(this.f31658a.c(), 0, 4, false);
        this.f31658a.e(0);
        return this.f31658a.h() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] a() {
        return new p70[]{new sb0()};
    }
}
