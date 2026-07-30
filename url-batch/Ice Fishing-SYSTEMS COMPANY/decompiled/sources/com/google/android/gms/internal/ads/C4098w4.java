package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4098w4 {

    /* renamed from: a, reason: collision with root package name */
    public final It f34920a;

    /* renamed from: b, reason: collision with root package name */
    public final Lr f34921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34923d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34924e;

    /* renamed from: f, reason: collision with root package name */
    public long f34925f;

    /* renamed from: g, reason: collision with root package name */
    public long f34926g;

    /* renamed from: h, reason: collision with root package name */
    public long f34927h;

    public C4098w4(int i) {
        switch (i) {
            case 1:
                this.f34920a = new It();
                this.f34925f = com.anythink.basead.exoplayer.b.f6539b;
                this.f34926g = com.anythink.basead.exoplayer.b.f6539b;
                this.f34927h = com.anythink.basead.exoplayer.b.f6539b;
                this.f34921b = new Lr();
                break;
            default:
                this.f34920a = new It();
                this.f34925f = com.anythink.basead.exoplayer.b.f6539b;
                this.f34926g = com.anythink.basead.exoplayer.b.f6539b;
                this.f34927h = com.anythink.basead.exoplayer.b.f6539b;
                this.f34921b = new Lr();
                break;
        }
    }

    public static long a(Lr lr) {
        int i = lr.f26234b;
        if (lr.B() < 9) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        byte[] bArr = new byte[9];
        lr.H(bArr, 0, 9);
        lr.E(i);
        byte b9 = bArr[0];
        if ((b9 & 196) != 68) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        byte b10 = bArr[2];
        if ((b10 & 4) != 4) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        byte b11 = bArr[4];
        if ((b11 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return com.anythink.basead.exoplayer.b.f6539b;
        }
        long j9 = b9;
        long j10 = b10;
        long j11 = (248 & j10) >> 3;
        long j12 = (j10 & 3) << 13;
        return j12 | ((bArr[1] & 255) << 20) | ((j9 & 3) << 28) | (((j9 & 56) >> 3) << 30) | (j11 << 15) | ((bArr[3] & 255) << 5) | ((b11 & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public void b(J0 j02) {
        byte[] bArr = AbstractC3548lu.f32614b;
        int length = bArr.length;
        this.f34921b.z(0, bArr);
        this.f34922c = true;
        j02.f25677y = 0;
    }
}
