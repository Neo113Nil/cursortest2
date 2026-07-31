package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class u2 implements w2 {

    /* renamed from: b, reason: collision with root package name */
    private final String f12575b;

    /* renamed from: c, reason: collision with root package name */
    private String f12576c;

    /* renamed from: d, reason: collision with root package name */
    private td4 f12577d;

    /* renamed from: f, reason: collision with root package name */
    private int f12579f;

    /* renamed from: g, reason: collision with root package name */
    private int f12580g;

    /* renamed from: h, reason: collision with root package name */
    private long f12581h;

    /* renamed from: i, reason: collision with root package name */
    private c0 f12582i;

    /* renamed from: j, reason: collision with root package name */
    private int f12583j;

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f12574a = new dr2(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f12578e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f12584k = -9223372036854775807L;

    public u2(String str) {
        this.f12575b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0112  */
    @Override // com.google.android.gms.internal.ads.w2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(dr2 dr2Var) {
        int i7;
        byte b7;
        boolean z6;
        int i8;
        byte b8;
        int i9;
        byte b9;
        int i10;
        byte b10;
        int i11;
        wu1.b(this.f12577d);
        while (dr2Var.i() > 0) {
            int i12 = this.f12578e;
            if (i12 == 0) {
                while (dr2Var.i() > 0) {
                    int i13 = this.f12580g << 8;
                    this.f12580g = i13;
                    int s7 = i13 | dr2Var.s();
                    this.f12580g = s7;
                    int i14 = mc4.f8496d;
                    if (s7 == 2147385345 || s7 == -25230976 || s7 == 536864768 || s7 == -14745368) {
                        byte[] h7 = this.f12574a.h();
                        int i15 = this.f12580g;
                        h7[0] = (byte) ((i15 >> 24) & 255);
                        h7[1] = (byte) ((i15 >> 16) & 255);
                        h7[2] = (byte) ((i15 >> 8) & 255);
                        h7[3] = (byte) (i15 & 255);
                        this.f12579f = 4;
                        this.f12580g = 0;
                        this.f12578e = 1;
                        break;
                    }
                }
            } else if (i12 != 1) {
                int min = Math.min(dr2Var.i(), this.f12583j - this.f12579f);
                rd4.b(this.f12577d, dr2Var, min);
                int i16 = this.f12579f + min;
                this.f12579f = i16;
                int i17 = this.f12583j;
                if (i16 == i17) {
                    long j7 = this.f12584k;
                    if (j7 != -9223372036854775807L) {
                        this.f12577d.a(j7, 1, i17, 0, null);
                        this.f12584k += this.f12581h;
                    }
                    this.f12578e = 0;
                }
            } else {
                byte[] h8 = this.f12574a.h();
                int min2 = Math.min(dr2Var.i(), 18 - this.f12579f);
                dr2Var.b(h8, this.f12579f, min2);
                int i18 = this.f12579f + min2;
                this.f12579f = i18;
                if (i18 == 18) {
                    byte[] h9 = this.f12574a.h();
                    if (this.f12582i == null) {
                        c0 a7 = mc4.a(h9, this.f12576c, this.f12575b, null);
                        this.f12582i = a7;
                        this.f12577d.b(a7);
                    }
                    int i19 = mc4.f8496d;
                    byte b11 = h9[0];
                    if (b11 != -2) {
                        if (b11 == -1) {
                            i11 = ((h9[7] & 3) << 12) | ((h9[6] & 255) << 4) | ((h9[9] & 60) >> 2);
                        } else if (b11 != 31) {
                            i7 = ((h9[5] & 3) << 12) | ((h9[6] & 255) << 4);
                            b7 = h9[7];
                        } else {
                            i11 = ((h9[8] & 60) >> 2) | ((3 & h9[6]) << 12) | ((h9[7] & 255) << 4);
                        }
                        i8 = i11 + 1;
                        z6 = true;
                        if (z6) {
                            i8 = (i8 * 16) / 14;
                        }
                        this.f12583j = i8;
                        b8 = h9[0];
                        if (b8 == -2) {
                            if (b8 == -1) {
                                i9 = (h9[4] & 7) << 4;
                                b10 = h9[7];
                            } else if (b8 != 31) {
                                i9 = (h9[4] & 1) << 6;
                                b9 = h9[5];
                            } else {
                                i9 = (h9[5] & 7) << 4;
                                b10 = h9[6];
                            }
                            i10 = b10 & 60;
                            this.f12581h = (int) ((((((i10 >> 2) | i9) + 1) * 32) * 1000000) / this.f12582i.f3674z);
                            this.f12574a.f(0);
                            rd4.b(this.f12577d, this.f12574a, 18);
                            this.f12578e = 2;
                        } else {
                            i9 = (h9[5] & 1) << 6;
                            b9 = h9[4];
                        }
                        i10 = b9 & 252;
                        this.f12581h = (int) ((((((i10 >> 2) | i9) + 1) * 32) * 1000000) / this.f12582i.f3674z);
                        this.f12574a.f(0);
                        rd4.b(this.f12577d, this.f12574a, 18);
                        this.f12578e = 2;
                    } else {
                        i7 = ((h9[4] & 3) << 12) | ((h9[7] & 255) << 4);
                        b7 = h9[6];
                    }
                    i8 = (i7 | ((b7 & 240) >> 4)) + 1;
                    z6 = false;
                    if (z6) {
                    }
                    this.f12583j = i8;
                    b8 = h9[0];
                    if (b8 == -2) {
                    }
                    i10 = b9 & 252;
                    this.f12581h = (int) ((((((i10 >> 2) | i9) + 1) * 32) * 1000000) / this.f12582i.f3674z);
                    this.f12574a.f(0);
                    rd4.b(this.f12577d, this.f12574a, 18);
                    this.f12578e = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void b() {
        this.f12578e = 0;
        this.f12579f = 0;
        this.f12580g = 0;
        this.f12584k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void d(rc4 rc4Var, k4 k4Var) {
        k4Var.c();
        this.f12576c = k4Var.b();
        this.f12577d = rc4Var.r(k4Var.a(), 1);
    }

    @Override // com.google.android.gms.internal.ads.w2
    public final void e(long j7, int i7) {
        if (j7 != -9223372036854775807L) {
            this.f12584k = j7;
        }
    }
}
