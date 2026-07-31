package com.yandex.mobile.ads.impl;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.yb0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class pb0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30389b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30391d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30392e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30393f;

    /* renamed from: g, reason: collision with root package name */
    public final int f30394g;

    /* renamed from: h, reason: collision with root package name */
    public final int f30395h;

    /* renamed from: i, reason: collision with root package name */
    public final int f30396i;

    /* renamed from: j, reason: collision with root package name */
    public final long f30397j;

    /* renamed from: k, reason: collision with root package name */
    public final a f30398k;

    /* renamed from: l, reason: collision with root package name */
    private final wz0 f30399l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f30400a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f30401b;

        public a(long[] jArr, long[] jArr2) {
            this.f30400a = jArr;
            this.f30401b = jArr2;
        }
    }

    private pb0(int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j4, a aVar, wz0 wz0Var) {
        this.f30388a = i4;
        this.f30389b = i5;
        this.f30390c = i6;
        this.f30391d = i7;
        this.f30392e = i8;
        this.f30393f = b(i8);
        this.f30394g = i9;
        this.f30395h = i10;
        this.f30396i = a(i10);
        this.f30397j = j4;
        this.f30398k = aVar;
        this.f30399l = wz0Var;
    }

    private static int a(int i4) {
        if (i4 == 8) {
            return 1;
        }
        if (i4 == 12) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 != 20) {
            return i4 != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i4) {
        switch (i4) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
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

    public final pb0 a(List<bh1> list) {
        wz0 wz0Var = new wz0(list);
        wz0 wz0Var2 = this.f30399l;
        if (wz0Var2 != null) {
            wz0Var = wz0Var2.a(wz0Var);
        }
        return new pb0(this.f30388a, this.f30389b, this.f30390c, this.f30391d, this.f30392e, this.f30394g, this.f30395h, this.f30397j, this.f30398k, wz0Var);
    }

    public final pb0 b(List<String> list) {
        wz0 a4 = vi2.a(list);
        wz0 wz0Var = this.f30399l;
        if (wz0Var != null) {
            a4 = wz0Var.a(a4);
        }
        return new pb0(this.f30388a, this.f30389b, this.f30390c, this.f30391d, this.f30392e, this.f30394g, this.f30395h, this.f30397j, this.f30398k, a4);
    }

    public final long a() {
        long j4;
        long j5;
        int i4 = this.f30391d;
        if (i4 > 0) {
            j4 = (i4 + this.f30390c) / 2;
            j5 = 1;
        } else {
            int i5 = this.f30388a;
            j4 = ((((i5 != this.f30389b || i5 <= 0) ? 4096L : i5) * this.f30394g) * this.f30395h) / 8;
            j5 = 64;
        }
        return j4 + j5;
    }

    public final long b() {
        long j4 = this.f30397j;
        if (j4 == 0) {
            return -9223372036854775807L;
        }
        return (j4 * 1000000) / this.f30392e;
    }

    public final yb0 a(byte[] bArr, wz0 wz0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i4 = this.f30391d;
        if (i4 <= 0) {
            i4 = -1;
        }
        wz0 wz0Var2 = this.f30399l;
        if (wz0Var2 != null) {
            wz0Var = wz0Var2.a(wz0Var);
        }
        return new yb0.a().e("audio/flac").h(i4).c(this.f30394g).l(this.f30392e).a(Collections.singletonList(bArr)).a(wz0Var).a();
    }

    public pb0(int i4, byte[] bArr) {
        rf1 rf1Var = new rf1(bArr);
        rf1Var.c(i4 * 8);
        this.f30388a = rf1Var.b(16);
        this.f30389b = rf1Var.b(16);
        this.f30390c = rf1Var.b(24);
        this.f30391d = rf1Var.b(24);
        int b4 = rf1Var.b(20);
        this.f30392e = b4;
        this.f30393f = b(b4);
        this.f30394g = rf1Var.b(3) + 1;
        int b5 = rf1Var.b(5) + 1;
        this.f30395h = b5;
        this.f30396i = a(b5);
        this.f30397j = rf1Var.g();
        this.f30398k = null;
        this.f30399l = null;
    }

    public final long a(long j4) {
        long j5 = (j4 * this.f30392e) / 1000000;
        long j6 = this.f30397j - 1;
        int i4 = u82.f32873a;
        return Math.max(0L, Math.min(j5, j6));
    }

    public final pb0 a(a aVar) {
        return new pb0(this.f30388a, this.f30389b, this.f30390c, this.f30391d, this.f30392e, this.f30394g, this.f30395h, this.f30397j, aVar, this.f30399l);
    }
}
