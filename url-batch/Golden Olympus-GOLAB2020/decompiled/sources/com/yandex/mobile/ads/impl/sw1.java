package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.yandex.mobile.ads.impl.e72;

/* loaded from: classes3.dex */
public final class sw1 implements e72 {

    /* renamed from: a, reason: collision with root package name */
    private final rw1 f32059a;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f32060b = new sf1(32);

    /* renamed from: c, reason: collision with root package name */
    private int f32061c;

    /* renamed from: d, reason: collision with root package name */
    private int f32062d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32063e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f32064f;

    public sw1(rw1 rw1Var) {
        this.f32059a = rw1Var;
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a(int i4, sf1 sf1Var) {
        boolean z4 = (i4 & 1) != 0;
        int d4 = z4 ? sf1Var.d() + sf1Var.t() : -1;
        if (this.f32064f) {
            if (!z4) {
                return;
            }
            this.f32064f = false;
            sf1Var.e(d4);
            this.f32062d = 0;
        }
        while (sf1Var.a() > 0) {
            int i5 = this.f32062d;
            if (i5 < 3) {
                if (i5 == 0) {
                    int t4 = sf1Var.t();
                    sf1Var.e(sf1Var.d() - 1);
                    if (t4 == 255) {
                        this.f32064f = true;
                        return;
                    }
                }
                int min = Math.min(sf1Var.a(), 3 - this.f32062d);
                sf1Var.a(this.f32060b.c(), this.f32062d, min);
                int i6 = this.f32062d + min;
                this.f32062d = i6;
                if (i6 == 3) {
                    this.f32060b.e(0);
                    this.f32060b.d(3);
                    this.f32060b.f(1);
                    int t5 = this.f32060b.t();
                    int t6 = this.f32060b.t();
                    this.f32063e = (t5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    this.f32061c = (((t5 & 15) << 8) | t6) + 3;
                    int b4 = this.f32060b.b();
                    int i7 = this.f32061c;
                    if (b4 < i7) {
                        this.f32060b.a(Math.min(4098, Math.max(i7, this.f32060b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(sf1Var.a(), this.f32061c - this.f32062d);
                sf1Var.a(this.f32060b.c(), this.f32062d, min2);
                int i8 = this.f32062d + min2;
                this.f32062d = i8;
                int i9 = this.f32061c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (this.f32063e) {
                        if (u82.a(this.f32061c, this.f32060b.c()) != 0) {
                            this.f32064f = true;
                            return;
                        }
                        this.f32060b.d(this.f32061c - 4);
                    } else {
                        this.f32060b.d(i9);
                    }
                    this.f32060b.e(0);
                    this.f32059a.a(this.f32060b);
                    this.f32062d = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a(e52 e52Var, r70 r70Var, e72.d dVar) {
        this.f32059a.a(e52Var, r70Var, dVar);
        this.f32064f = true;
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a() {
        this.f32064f = true;
    }
}
