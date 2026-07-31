package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e72;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class c40 implements q40 {

    /* renamed from: b, reason: collision with root package name */
    private final String f24041b;

    /* renamed from: c, reason: collision with root package name */
    private String f24042c;

    /* renamed from: d, reason: collision with root package name */
    private p52 f24043d;

    /* renamed from: f, reason: collision with root package name */
    private int f24045f;

    /* renamed from: g, reason: collision with root package name */
    private int f24046g;

    /* renamed from: h, reason: collision with root package name */
    private long f24047h;

    /* renamed from: i, reason: collision with root package name */
    private yb0 f24048i;

    /* renamed from: j, reason: collision with root package name */
    private int f24049j;

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f24040a = new sf1(new byte[18]);

    /* renamed from: e, reason: collision with root package name */
    private int f24044e = 0;

    /* renamed from: k, reason: collision with root package name */
    private long f24050k = -9223372036854775807L;

    public c40(String str) {
        this.f24041b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    @Override // com.yandex.mobile.ads.impl.q40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(sf1 sf1Var) {
        int i4;
        byte b4;
        boolean z4;
        int i5;
        int i6;
        byte b5;
        int i7;
        byte b6;
        int i8;
        byte b7;
        if (this.f24043d == null) {
            throw new IllegalStateException();
        }
        while (sf1Var.a() > 0) {
            int i9 = this.f24044e;
            if (i9 == 0) {
                while (sf1Var.a() > 0) {
                    int i10 = this.f24046g << 8;
                    this.f24046g = i10;
                    int t4 = i10 | sf1Var.t();
                    this.f24046g = t4;
                    if (t4 == 2147385345 || t4 == -25230976 || t4 == 536864768 || t4 == -14745368) {
                        byte[] c4 = this.f24040a.c();
                        int i11 = this.f24046g;
                        c4[0] = (byte) ((i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                        c4[1] = (byte) ((i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                        c4[2] = (byte) ((i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        c4[3] = (byte) (i11 & KotlinVersion.MAX_COMPONENT_VALUE);
                        this.f24045f = 4;
                        this.f24046g = 0;
                        this.f24044e = 1;
                        break;
                    }
                }
            } else if (i9 == 1) {
                byte[] c5 = this.f24040a.c();
                int min = Math.min(sf1Var.a(), 18 - this.f24045f);
                sf1Var.a(c5, this.f24045f, min);
                int i12 = this.f24045f + min;
                this.f24045f = i12;
                if (i12 == 18) {
                    byte[] c6 = this.f24040a.c();
                    if (this.f24048i == null) {
                        yb0 a4 = d40.a(c6, this.f24042c, this.f24041b);
                        this.f24048i = a4;
                        this.f24043d.a(a4);
                    }
                    byte b8 = c6[0];
                    if (b8 != -2) {
                        if (b8 == -1) {
                            i8 = ((c6[7] & 3) << 12) | ((c6[6] & 255) << 4);
                            b7 = c6[9];
                        } else if (b8 != 31) {
                            i4 = ((c6[5] & 3) << 12) | ((c6[6] & 255) << 4);
                            b4 = c6[7];
                        } else {
                            i8 = ((c6[7] & 255) << 4) | ((c6[6] & 3) << 12);
                            b7 = c6[8];
                        }
                        i5 = (i8 | ((b7 & 60) >> 2)) + 1;
                        z4 = true;
                        if (z4) {
                            i5 = (i5 * 16) / 14;
                        }
                        this.f24049j = i5;
                        if (b8 == -2) {
                            if (b8 == -1) {
                                i6 = (c6[4] & 7) << 4;
                                b6 = c6[7];
                            } else if (b8 != 31) {
                                i6 = (c6[4] & 1) << 6;
                                b5 = c6[5];
                            } else {
                                i6 = (c6[5] & 7) << 4;
                                b6 = c6[6];
                            }
                            i7 = b6 & 60;
                            this.f24047h = (int) ((((((i7 >> 2) | i6) + 1) * 32) * 1000000) / this.f24048i.f34973A);
                            this.f24040a.e(0);
                            this.f24043d.a(18, this.f24040a);
                            this.f24044e = 2;
                        } else {
                            i6 = (c6[5] & 1) << 6;
                            b5 = c6[4];
                        }
                        i7 = b5 & 252;
                        this.f24047h = (int) ((((((i7 >> 2) | i6) + 1) * 32) * 1000000) / this.f24048i.f34973A);
                        this.f24040a.e(0);
                        this.f24043d.a(18, this.f24040a);
                        this.f24044e = 2;
                    } else {
                        i4 = ((c6[4] & 3) << 12) | ((c6[7] & 255) << 4);
                        b4 = c6[6];
                    }
                    i5 = (i4 | ((b4 & 240) >> 4)) + 1;
                    z4 = false;
                    if (z4) {
                    }
                    this.f24049j = i5;
                    if (b8 == -2) {
                    }
                    i7 = b5 & 252;
                    this.f24047h = (int) ((((((i7 >> 2) | i6) + 1) * 32) * 1000000) / this.f24048i.f34973A);
                    this.f24040a.e(0);
                    this.f24043d.a(18, this.f24040a);
                    this.f24044e = 2;
                }
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(sf1Var.a(), this.f24049j - this.f24045f);
                this.f24043d.a(min2, sf1Var);
                int i13 = this.f24045f + min2;
                this.f24045f = i13;
                int i14 = this.f24049j;
                if (i13 == i14) {
                    long j4 = this.f24050k;
                    if (j4 != -9223372036854775807L) {
                        this.f24043d.a(j4, 1, i14, 0, null);
                        this.f24050k += this.f24047h;
                    }
                    this.f24044e = 0;
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
        this.f24042c = dVar.b();
        this.f24043d = r70Var.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a(int i4, long j4) {
        if (j4 != -9223372036854775807L) {
            this.f24050k = j4;
        }
    }

    @Override // com.yandex.mobile.ads.impl.q40
    public final void a() {
        this.f24044e = 0;
        this.f24045f = 0;
        this.f24046g = 0;
        this.f24050k = -9223372036854775807L;
    }
}
