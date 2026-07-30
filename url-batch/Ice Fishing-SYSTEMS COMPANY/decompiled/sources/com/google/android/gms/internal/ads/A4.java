package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class A4 implements E4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4260z4 f23814a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f23815b = new Lr(32);

    /* renamed from: c, reason: collision with root package name */
    public int f23816c;

    /* renamed from: d, reason: collision with root package name */
    public int f23817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23818e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23819f;

    public A4(InterfaceC4260z4 interfaceC4260z4) {
        this.f23814a = interfaceC4260z4;
    }

    @Override // com.google.android.gms.internal.ads.E4
    public final void a(int i, Lr lr) {
        int i4 = i & 1;
        int K8 = i4 != 0 ? lr.f26234b + lr.K() : -1;
        if (this.f23819f) {
            if (i4 == 0) {
                return;
            }
            this.f23819f = false;
            lr.E(K8);
            this.f23817d = 0;
        }
        while (lr.B() > 0) {
            int i9 = this.f23817d;
            Lr lr2 = this.f23815b;
            if (i9 < 3) {
                if (i9 == 0) {
                    int K9 = lr.K();
                    lr.E(lr.f26234b - 1);
                    if (K9 == 255) {
                        this.f23819f = true;
                        return;
                    }
                }
                int min = Math.min(lr.B(), 3 - this.f23817d);
                lr.H(lr2.f26233a, this.f23817d, min);
                int i10 = this.f23817d + min;
                this.f23817d = i10;
                if (i10 == 3) {
                    lr2.E(0);
                    lr2.C(3);
                    lr2.G(1);
                    int K10 = lr2.K();
                    boolean z8 = (K10 & 128) != 0;
                    int K11 = lr2.K();
                    this.f23818e = z8;
                    int i11 = (((K10 & 15) << 8) | K11) + 3;
                    this.f23816c = i11;
                    byte[] bArr = lr2.f26233a;
                    if (bArr.length < i11) {
                        int length = bArr.length;
                        lr2.A(Math.min(4098, Math.max(i11, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(lr.B(), this.f23816c - this.f23817d);
                lr.H(lr2.f26233a, this.f23817d, min2);
                int i12 = this.f23817d + min2;
                this.f23817d = i12;
                int i13 = this.f23816c;
                if (i12 != i13) {
                    continue;
                } else {
                    if (!this.f23818e) {
                        lr2.C(i13);
                    } else {
                        if (AbstractC3548lu.h(0, i13, -1, lr2.f26233a) != 0) {
                            this.f23819f = true;
                            return;
                        }
                        lr2.C(this.f23816c - 4);
                    }
                    lr2.E(0);
                    this.f23814a.m(lr2);
                    this.f23817d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.E4
    public final void c(It it, Q0 q02, D4 d42) {
        this.f23814a.c(it, q02, d42);
        this.f23819f = true;
    }

    @Override // com.google.android.gms.internal.ads.E4
    public final void d() {
        this.f23819f = true;
    }
}
