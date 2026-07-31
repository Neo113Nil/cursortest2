package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;

/* loaded from: classes3.dex */
public final class ng1 implements e72 {

    /* renamed from: a, reason: collision with root package name */
    private final q40 f29629a;

    /* renamed from: b, reason: collision with root package name */
    private final rf1 f29630b = new rf1(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f29631c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f29632d;

    /* renamed from: e, reason: collision with root package name */
    private e52 f29633e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29634f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29635g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29636h;

    /* renamed from: i, reason: collision with root package name */
    private int f29637i;

    /* renamed from: j, reason: collision with root package name */
    private int f29638j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29639k;

    /* renamed from: l, reason: collision with root package name */
    private long f29640l;

    public ng1(q40 q40Var) {
        this.f29629a = q40Var;
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a(int i4, sf1 sf1Var) {
        int i5;
        int i6;
        int i7;
        if (this.f29633e == null) {
            throw new IllegalStateException();
        }
        int i8 = -1;
        int i9 = 0;
        if ((i4 & 1) != 0) {
            int i10 = this.f29631c;
            if (i10 != 0 && i10 != 1) {
                if (i10 == 2) {
                    ms0.d("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f29638j != -1) {
                        ms0.d("PesReader", "Unexpected start indicator: expected " + this.f29638j + " more bytes");
                    }
                    this.f29629a.b();
                }
            }
            this.f29631c = 1;
            this.f29632d = 0;
        }
        int i11 = i4;
        while (sf1Var.a() > 0) {
            int i12 = this.f29631c;
            if (i12 == 0) {
                i5 = i8;
                i6 = i9;
                sf1Var.f(sf1Var.a());
            } else if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int a4 = sf1Var.a();
                    int i13 = this.f29638j;
                    int i14 = i13 == i8 ? i9 : a4 - i13;
                    if (i14 > 0) {
                        a4 -= i14;
                        sf1Var.d(sf1Var.d() + a4);
                    }
                    this.f29629a.a(sf1Var);
                    int i15 = this.f29638j;
                    if (i15 != i8) {
                        int i16 = i15 - a4;
                        this.f29638j = i16;
                        if (i16 == 0) {
                            this.f29629a.b();
                            this.f29631c = 1;
                            this.f29632d = i9;
                        }
                    }
                } else if (a(Math.min(10, this.f29637i), sf1Var, this.f29630b.f31172a) && a(this.f29637i, sf1Var, (byte[]) null)) {
                    this.f29630b.c(i9);
                    this.f29640l = -9223372036854775807L;
                    if (this.f29634f) {
                        this.f29630b.d(4);
                        this.f29630b.d(1);
                        this.f29630b.d(1);
                        long b4 = (this.f29630b.b(15) << 15) | (this.f29630b.b(3) << 30) | this.f29630b.b(15);
                        this.f29630b.d(1);
                        if (!this.f29636h && this.f29635g) {
                            this.f29630b.d(4);
                            this.f29630b.d(1);
                            this.f29630b.d(1);
                            this.f29630b.d(1);
                            this.f29633e.b((this.f29630b.b(3) << 30) | (this.f29630b.b(15) << 15) | this.f29630b.b(15));
                            this.f29636h = true;
                        }
                        this.f29640l = this.f29633e.b(b4);
                    }
                    i11 |= this.f29639k ? 4 : 0;
                    this.f29629a.a(i11, this.f29640l);
                    this.f29631c = 3;
                    this.f29632d = 0;
                    i9 = 0;
                    i8 = -1;
                }
                i5 = i8;
                i6 = i9;
            } else {
                i6 = i9;
                if (a(9, sf1Var, this.f29630b.f31172a)) {
                    this.f29630b.c(i6);
                    int b5 = this.f29630b.b(24);
                    if (b5 != 1) {
                        fr0.a("Unexpected start code prefix: ", b5, "PesReader");
                        this.f29638j = -1;
                        i7 = 0;
                        i5 = -1;
                    } else {
                        this.f29630b.d(8);
                        int b6 = this.f29630b.b(16);
                        this.f29630b.d(5);
                        this.f29639k = this.f29630b.f();
                        this.f29630b.d(2);
                        this.f29634f = this.f29630b.f();
                        this.f29635g = this.f29630b.f();
                        this.f29630b.d(6);
                        int b7 = this.f29630b.b(8);
                        this.f29637i = b7;
                        if (b6 == 0) {
                            this.f29638j = -1;
                        } else {
                            int i17 = (b6 - 3) - b7;
                            this.f29638j = i17;
                            if (i17 < 0) {
                                ms0.d("PesReader", "Found negative packet payload size: " + this.f29638j);
                                i5 = -1;
                                this.f29638j = -1;
                                i7 = 2;
                            }
                        }
                        i5 = -1;
                        i7 = 2;
                    }
                    this.f29631c = i7;
                    i6 = 0;
                    this.f29632d = 0;
                } else {
                    i5 = -1;
                }
            }
            i9 = i6;
            i8 = i5;
        }
    }

    private boolean a(int i4, sf1 sf1Var, byte[] bArr) {
        int min = Math.min(sf1Var.a(), i4 - this.f29632d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            sf1Var.f(min);
        } else {
            sf1Var.a(bArr, this.f29632d, min);
        }
        int i5 = this.f29632d + min;
        this.f29632d = i5;
        return i5 == i4;
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a(e52 e52Var, r70 r70Var, e72.d dVar) {
        this.f29633e = e52Var;
        this.f29629a.a(r70Var, dVar);
    }

    @Override // com.yandex.mobile.ads.impl.e72
    public final void a() {
        this.f29631c = 0;
        this.f29632d = 0;
        this.f29636h = false;
        this.f29629a.a();
    }
}
