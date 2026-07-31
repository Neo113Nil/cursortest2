package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.yb0;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* loaded from: classes3.dex */
public final class r11 implements q40 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f30984a;

    /* renamed from: b, reason: collision with root package name */
    private final s11.a f30985b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30986c;

    /* renamed from: d, reason: collision with root package name */
    private p52 f30987d;

    /* renamed from: e, reason: collision with root package name */
    private String f30988e;

    /* renamed from: f, reason: collision with root package name */
    private int f30989f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f30990g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30991h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30992i;

    /* renamed from: j, reason: collision with root package name */
    private long f30993j;

    /* renamed from: k, reason: collision with root package name */
    private int f30994k;

    /* renamed from: l, reason: collision with root package name */
    private long f30995l;

    public r11(String str) {
        sf1 sf1Var = new sf1(4);
        this.f30984a = sf1Var;
        sf1Var.c()[0] = -1;
        this.f30985b = new s11.a();
        this.f30995l = -9223372036854775807L;
        this.f30986c = str;
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(sf1 sf1Var) {
        if (this.f30987d == null) {
            throw new IllegalStateException();
        }
        while (sf1Var.a() > 0) {
            int i4 = this.f30989f;
            if (i4 == 0) {
                byte[] c4 = sf1Var.c();
                int d4 = sf1Var.d();
                int e4 = sf1Var.e();
                while (true) {
                    if (d4 >= e4) {
                        sf1Var.e(e4);
                        break;
                    }
                    byte b4 = c4[d4];
                    boolean z4 = (b4 & 255) == 255;
                    boolean z5 = this.f30992i && (b4 & 224) == 224;
                    this.f30992i = z4;
                    if (z5) {
                        sf1Var.e(d4 + 1);
                        this.f30992i = false;
                        this.f30984a.c()[1] = c4[d4];
                        this.f30990g = 2;
                        this.f30989f = 1;
                        break;
                    }
                    d4++;
                }
            } else if (i4 == 1) {
                int min = Math.min(sf1Var.a(), 4 - this.f30990g);
                sf1Var.a(this.f30984a.c(), this.f30990g, min);
                int i5 = this.f30990g + min;
                this.f30990g = i5;
                if (i5 >= 4) {
                    this.f30984a.e(0);
                    if (this.f30985b.a(this.f30984a.h())) {
                        this.f30994k = this.f30985b.f31531c;
                        if (!this.f30991h) {
                            this.f30993j = (r0.f31535g * 1000000) / r0.f31532d;
                            this.f30987d.a(new yb0.a().b(this.f30988e).e(this.f30985b.f31530b).h(Base64Utils.IO_BUFFER_SIZE).c(this.f30985b.f31533e).l(this.f30985b.f31532d).d(this.f30986c).a());
                            this.f30991h = true;
                        }
                        this.f30984a.e(0);
                        this.f30987d.a(4, this.f30984a);
                        this.f30989f = 2;
                    } else {
                        this.f30990g = 0;
                        this.f30989f = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(sf1Var.a(), this.f30994k - this.f30990g);
                this.f30987d.a(min2, sf1Var);
                int i6 = this.f30990g + min2;
                this.f30990g = i6;
                int i7 = this.f30994k;
                if (i6 >= i7) {
                    long j4 = this.f30995l;
                    if (j4 != -9223372036854775807L) {
                        this.f30987d.a(j4, 1, i7, 0, null);
                        this.f30995l += this.f30993j;
                    }
                    this.f30990g = 0;
                    this.f30989f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(r70 r70Var, e72.d dVar) {
        dVar.a();
        this.f30988e = dVar.b();
        this.f30987d = r70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f30995l = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f30989f = 0;
        this.f30990g = 0;
        this.f30992i = false;
        this.f30995l = -9223372036854775807L;
    }
}
