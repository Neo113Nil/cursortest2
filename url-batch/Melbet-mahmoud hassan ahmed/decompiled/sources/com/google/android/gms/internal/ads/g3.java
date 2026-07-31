package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g3 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    private final y3 f5424a;

    /* renamed from: e, reason: collision with root package name */
    private long f5428e;

    /* renamed from: g, reason: collision with root package name */
    private String f5430g;

    /* renamed from: h, reason: collision with root package name */
    private td4 f5431h;

    /* renamed from: i, reason: collision with root package name */
    private e3 f5432i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5433j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5435l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f5429f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final m3 f5425b = new m3(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final m3 f5426c = new m3(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final m3 f5427d = new m3(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f5434k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final dr2 f5436m = new dr2();

    public g3(y3 y3Var, boolean z6, boolean z7) {
        this.f5424a = y3Var;
    }

    private final void f(byte[] bArr, int i7, int i8) {
        if (!this.f5433j) {
            this.f5425b.a(bArr, i7, i8);
            this.f5426c.a(bArr, i7, i8);
        }
        this.f5427d.a(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void a(dr2 dr2Var) {
        m3 m3Var;
        wu1.b(this.f5431h);
        int i7 = n13.f8865a;
        int k7 = dr2Var.k();
        int l7 = dr2Var.l();
        byte[] h7 = dr2Var.h();
        this.f5428e += dr2Var.i();
        rd4.b(this.f5431h, dr2Var, dr2Var.i());
        while (true) {
            int a7 = th2.a(h7, k7, l7, this.f5429f);
            if (a7 == l7) {
                f(h7, k7, l7);
                return;
            }
            int i8 = a7 + 3;
            int i9 = h7[i8] & 31;
            int i10 = a7 - k7;
            if (i10 > 0) {
                f(h7, k7, a7);
            }
            int i11 = l7 - a7;
            long j7 = this.f5428e - i11;
            int i12 = i10 < 0 ? -i10 : 0;
            long j8 = this.f5434k;
            if (!this.f5433j) {
                this.f5425b.d(i12);
                this.f5426c.d(i12);
                if (this.f5433j) {
                    if (this.f5425b.e()) {
                        m3 m3Var2 = this.f5425b;
                        this.f5432i.b(th2.d(m3Var2.f8389d, 4, m3Var2.f8390e));
                        m3Var = this.f5425b;
                    } else if (this.f5426c.e()) {
                        m3 m3Var3 = this.f5426c;
                        this.f5432i.a(th2.c(m3Var3.f8389d, 4, m3Var3.f8390e));
                        m3Var = this.f5426c;
                    }
                } else if (this.f5425b.e() && this.f5426c.e()) {
                    ArrayList arrayList = new ArrayList();
                    m3 m3Var4 = this.f5425b;
                    arrayList.add(Arrays.copyOf(m3Var4.f8389d, m3Var4.f8390e));
                    m3 m3Var5 = this.f5426c;
                    arrayList.add(Arrays.copyOf(m3Var5.f8389d, m3Var5.f8390e));
                    m3 m3Var6 = this.f5425b;
                    sg2 d7 = th2.d(m3Var6.f8389d, 4, m3Var6.f8390e);
                    m3 m3Var7 = this.f5426c;
                    rf2 c7 = th2.c(m3Var7.f8389d, 4, m3Var7.f8390e);
                    String a8 = zw1.a(d7.f11816a, d7.f11817b, d7.f11818c);
                    td4 td4Var = this.f5431h;
                    bf4 bf4Var = new bf4();
                    bf4Var.h(this.f5430g);
                    bf4Var.s("video/avc");
                    bf4Var.f0(a8);
                    bf4Var.x(d7.f11820e);
                    bf4Var.f(d7.f11821f);
                    bf4Var.p(d7.f11822g);
                    bf4Var.i(arrayList);
                    td4Var.b(bf4Var.y());
                    this.f5433j = true;
                    this.f5432i.b(d7);
                    this.f5432i.a(c7);
                    this.f5425b.b();
                    m3Var = this.f5426c;
                }
                m3Var.b();
            }
            if (this.f5427d.d(i12)) {
                m3 m3Var8 = this.f5427d;
                this.f5436m.d(this.f5427d.f8389d, th2.b(m3Var8.f8389d, m3Var8.f8390e));
                this.f5436m.f(4);
                this.f5424a.a(j8, this.f5436m);
            }
            if (this.f5432i.e(j7, i11, this.f5433j, this.f5435l)) {
                this.f5435l = false;
            }
            long j9 = this.f5434k;
            if (!this.f5433j) {
                this.f5425b.c(i9);
                this.f5426c.c(i9);
            }
            this.f5427d.c(i9);
            this.f5432i.d(j7, i9, j9);
            k7 = i8;
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f5428e = 0L;
        this.f5435l = false;
        this.f5434k = -9223372036854775807L;
        th2.e(this.f5429f);
        this.f5425b.b();
        this.f5426c.b();
        this.f5427d.b();
        e3 e3Var = this.f5432i;
        if (e3Var != null) {
            e3Var.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f5430g = k4Var.b();
        td4 r7 = rc4Var.r(k4Var.a(), 2);
        this.f5431h = r7;
        this.f5432i = new e3(r7, false, false);
        this.f5424a.b(rc4Var, k4Var);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f5434k = j7;
        }
        this.f5435l |= (i7 & 2) != 0;
    }
}
