package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C2214s;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
public final class r implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final rf1 f30963a;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f30964b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30965c;

    /* renamed from: d, reason: collision with root package name */
    private String f30966d;

    /* renamed from: e, reason: collision with root package name */
    private p52 f30967e;

    /* renamed from: f, reason: collision with root package name */
    private int f30968f;

    /* renamed from: g, reason: collision with root package name */
    private int f30969g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30970h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30971i;

    /* renamed from: j, reason: collision with root package name */
    private long f30972j;

    /* renamed from: k, reason: collision with root package name */
    private yb0 f30973k;

    /* renamed from: l, reason: collision with root package name */
    private int f30974l;

    /* renamed from: m, reason: collision with root package name */
    private long f30975m;

    public r() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(sf1 sf1Var) {
        if (this.f30967e == null) {
            throw new IllegalStateException();
        }
        while (sf1Var.a() > 0) {
            int i4 = this.f30968f;
            if (i4 == 0) {
                while (sf1Var.a() > 0) {
                    if (this.f30970h) {
                        int t4 = sf1Var.t();
                        this.f30970h = t4 == 172;
                        if (t4 == 64 || t4 == 65) {
                            this.f30971i = t4 == 65;
                            this.f30968f = 1;
                            this.f30964b.c()[0] = -84;
                            this.f30964b.c()[1] = (byte) (this.f30971i ? 65 : 64);
                            this.f30969g = 2;
                        }
                    } else {
                        this.f30970h = sf1Var.t() == 172;
                    }
                }
            } else if (i4 == 1) {
                byte[] c4 = this.f30964b.c();
                int min = Math.min(sf1Var.a(), 16 - this.f30969g);
                sf1Var.a(c4, this.f30969g, min);
                int i5 = this.f30969g + min;
                this.f30969g = i5;
                if (i5 == 16) {
                    this.f30963a.c(0);
                    C2214s.a a4 = C2214s.a(this.f30963a);
                    yb0 yb0Var = this.f30973k;
                    if (yb0Var == null || 2 != yb0Var.f35004z || a4.f31501a != yb0Var.f34973A || !"audio/ac4".equals(yb0Var.f34991m)) {
                        yb0 a5 = new yb0.a().b(this.f30966d).e("audio/ac4").c(2).l(a4.f31501a).d(this.f30965c).a();
                        this.f30973k = a5;
                        this.f30967e.a(a5);
                    }
                    this.f30974l = a4.f31502b;
                    this.f30972j = (a4.f31503c * 1000000) / this.f30973k.f34973A;
                    this.f30964b.e(0);
                    this.f30967e.a(16, this.f30964b);
                    this.f30968f = 2;
                }
            } else if (i4 == 2) {
                int min2 = Math.min(sf1Var.a(), this.f30974l - this.f30969g);
                this.f30967e.a(min2, sf1Var);
                int i6 = this.f30969g + min2;
                this.f30969g = i6;
                int i7 = this.f30974l;
                if (i6 == i7) {
                    long j4 = this.f30975m;
                    if (j4 != -9223372036854775807L) {
                        this.f30967e.a(j4, 1, i7, 0, null);
                        this.f30975m += this.f30972j;
                    }
                    this.f30968f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    public r(String str) {
        byte[] bArr = new byte[16];
        this.f30963a = new rf1(bArr);
        this.f30964b = new sf1(bArr);
        this.f30968f = 0;
        this.f30969g = 0;
        this.f30970h = false;
        this.f30971i = false;
        this.f30975m = -9223372036854775807L;
        this.f30965c = str;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f30966d = dVar.b();
        this.f30967e = r70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f30975m = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f30968f = 0;
        this.f30969g = 0;
        this.f30970h = false;
        this.f30971i = false;
        this.f30975m = -9223372036854775807L;
    }
}
