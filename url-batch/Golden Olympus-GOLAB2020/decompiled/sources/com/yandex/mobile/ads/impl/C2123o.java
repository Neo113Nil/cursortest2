package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.C2146p;
import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.yb0;

/* renamed from: com.yandex.mobile.ads.impl.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2123o implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final rf1 f29813a;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f29814b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29815c;

    /* renamed from: d, reason: collision with root package name */
    private String f29816d;

    /* renamed from: e, reason: collision with root package name */
    private p52 f29817e;

    /* renamed from: f, reason: collision with root package name */
    private int f29818f;

    /* renamed from: g, reason: collision with root package name */
    private int f29819g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29820h;

    /* renamed from: i, reason: collision with root package name */
    private long f29821i;

    /* renamed from: j, reason: collision with root package name */
    private yb0 f29822j;

    /* renamed from: k, reason: collision with root package name */
    private int f29823k;

    /* renamed from: l, reason: collision with root package name */
    private long f29824l;

    public C2123o() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(sf1 sf1Var) {
        if (this.f29817e == null) {
            throw new IllegalStateException();
        }
        while (sf1Var.a() > 0) {
            int i4 = this.f29818f;
            if (i4 == 0) {
                while (true) {
                    if (sf1Var.a() <= 0) {
                        break;
                    }
                    if (this.f29820h) {
                        int t4 = sf1Var.t();
                        if (t4 == 119) {
                            this.f29820h = false;
                            this.f29818f = 1;
                            this.f29814b.c()[0] = 11;
                            this.f29814b.c()[1] = 119;
                            this.f29819g = 2;
                            break;
                        }
                        this.f29820h = t4 == 11;
                    } else {
                        this.f29820h = sf1Var.t() == 11;
                    }
                }
            } else if (i4 == 1) {
                byte[] c4 = this.f29814b.c();
                int min = Math.min(sf1Var.a(), 128 - this.f29819g);
                sf1Var.a(c4, this.f29819g, min);
                int i5 = this.f29819g + min;
                this.f29819g = i5;
                if (i5 == 128) {
                    this.f29813a.c(0);
                    C2146p.a a4 = C2146p.a(this.f29813a);
                    yb0 yb0Var = this.f29822j;
                    if (yb0Var == null || a4.f30248c != yb0Var.f35004z || a4.f30247b != yb0Var.f34973A || !u82.a(a4.f30246a, yb0Var.f34991m)) {
                        yb0 a5 = new yb0.a().b(this.f29816d).e(a4.f30246a).c(a4.f30248c).l(a4.f30247b).d(this.f29815c).a();
                        this.f29822j = a5;
                        this.f29817e.a(a5);
                    }
                    this.f29823k = a4.f30249d;
                    this.f29821i = (a4.f30250e * 1000000) / this.f29822j.f34973A;
                    this.f29814b.e(0);
                    this.f29817e.a(UserVerificationMethods.USER_VERIFY_PATTERN, this.f29814b);
                    this.f29818f = 2;
                }
            } else if (i4 == 2) {
                int min2 = Math.min(sf1Var.a(), this.f29823k - this.f29819g);
                this.f29817e.a(min2, sf1Var);
                int i6 = this.f29819g + min2;
                this.f29819g = i6;
                int i7 = this.f29823k;
                if (i6 == i7) {
                    long j4 = this.f29824l;
                    if (j4 != -9223372036854775807L) {
                        this.f29817e.a(j4, 1, i7, 0, null);
                        this.f29824l += this.f29821i;
                    }
                    this.f29818f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    public C2123o(String str) {
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.f29813a = new rf1(bArr);
        this.f29814b = new sf1(bArr);
        this.f29818f = 0;
        this.f29824l = -9223372036854775807L;
        this.f29815c = str;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f29816d = dVar.b();
        this.f29817e = r70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f29824l = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f29818f = 0;
        this.f29819g = 0;
        this.f29820h = false;
        this.f29824l = -9223372036854775807L;
    }
}
