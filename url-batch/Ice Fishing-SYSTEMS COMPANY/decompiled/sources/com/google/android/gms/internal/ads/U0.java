package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f27900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27901b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27902c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27903d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27904e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27905f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27906g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27907h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27908j;

    /* renamed from: k, reason: collision with root package name */
    public final C2881Yl f27909k;

    /* renamed from: l, reason: collision with root package name */
    public final R3 f27910l;

    public U0(int i, int i4, int i9, int i10, int i11, int i12, int i13, long j9, C2881Yl c2881Yl, R3 r32) {
        this.f27900a = i;
        this.f27901b = i4;
        this.f27902c = i9;
        this.f27903d = i10;
        this.f27904e = i11;
        this.f27905f = c(i11);
        this.f27906g = i12;
        this.f27907h = i13;
        this.i = d(i13);
        this.f27908j = j9;
        this.f27909k = c2881Yl;
        this.f27910l = r32;
    }

    public static int c(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j9 = this.f27908j;
        return j9 == 0 ? com.anythink.basead.exoplayer.b.f6539b : (j9 * 1000000) / this.f27904e;
    }

    public final TP b(byte[] bArr, R3 r32) {
        bArr[4] = com.anythink.core.common.s.a.c.f16474a;
        R3 r33 = this.f27910l;
        if (r33 != null) {
            r32 = r33.b(r32);
        }
        C4065vP c4065vP = new C4065vP();
        c4065vP.e(com.anythink.basead.exoplayer.k.o.f8586K);
        int i = this.f27903d;
        if (i <= 0) {
            i = -1;
        }
        c4065vP.f34786o = i;
        c4065vP.f34765F = this.f27906g;
        c4065vP.f34767H = this.f27904e;
        c4065vP.f34768I = AbstractC3548lu.b(this.f27907h, ByteOrder.LITTLE_ENDIAN);
        c4065vP.f34788q = Collections.singletonList(bArr);
        c4065vP.f34782k = r32;
        return new TP(c4065vP);
    }

    public U0(byte[] bArr, int i) {
        Er er = new Er(bArr, bArr.length);
        er.d(i * 8);
        this.f27900a = er.h(16);
        this.f27901b = er.h(16);
        this.f27902c = er.h(24);
        this.f27903d = er.h(24);
        int h9 = er.h(20);
        this.f27904e = h9;
        this.f27905f = c(h9);
        this.f27906g = er.h(3) + 1;
        int h10 = er.h(5) + 1;
        this.f27907h = h10;
        this.i = d(h10);
        this.f27908j = er.i(36);
        this.f27909k = null;
        this.f27910l = null;
    }
}
