package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Er {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f24829a;

    /* renamed from: b, reason: collision with root package name */
    public int f24830b;

    /* renamed from: c, reason: collision with root package name */
    public int f24831c;

    /* renamed from: d, reason: collision with root package name */
    public int f24832d;

    public Er(byte[] bArr, int i) {
        this.f24829a = bArr;
        this.f24832d = i;
    }

    public final void a(Lr lr) {
        byte[] bArr = lr.f26233a;
        int i = lr.f26235c;
        this.f24829a = bArr;
        this.f24830b = 0;
        this.f24831c = 0;
        this.f24832d = i;
        d(lr.f26234b * 8);
    }

    public final int b() {
        return ((this.f24832d - this.f24830b) * 8) - this.f24831c;
    }

    public final int c() {
        PA.T(this.f24831c == 0);
        return this.f24830b;
    }

    public final void d(int i) {
        int i4 = i / 8;
        this.f24830b = i4;
        this.f24831c = i - (i4 * 8);
        m();
    }

    public final void e() {
        int i = this.f24831c + 1;
        this.f24831c = i;
        if (i == 8) {
            this.f24831c = 0;
            this.f24830b++;
        }
        m();
    }

    public final void f(int i) {
        int i4 = i / 8;
        int i9 = this.f24830b + i4;
        this.f24830b = i9;
        int i10 = (i - (i4 * 8)) + this.f24831c;
        this.f24831c = i10;
        if (i10 > 7) {
            this.f24830b = i9 + 1;
            this.f24831c = i10 - 8;
        }
        m();
    }

    public final boolean g() {
        int i = this.f24829a[this.f24830b] & (128 >> this.f24831c);
        e();
        return i != 0;
    }

    public final int h(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
        this.f24831c += i;
        int i9 = 0;
        while (true) {
            i4 = this.f24831c;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.f24831c = i10;
            byte[] bArr = this.f24829a;
            int i11 = this.f24830b;
            this.f24830b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f24829a;
        int i12 = this.f24830b;
        int i13 = i9 | ((bArr2[i12] & 255) >> (8 - i4));
        int i14 = 32 - i;
        if (i4 == 8) {
            this.f24831c = 0;
            this.f24830b = i12 + 1;
        }
        int i15 = ((-1) >>> i14) & i13;
        m();
        return i15;
    }

    public final long i(int i) {
        if (i <= 32) {
            int h9 = h(i);
            String str = AbstractC3548lu.f32613a;
            return 4294967295L & h9;
        }
        int h10 = h(i - 32);
        int h11 = h(32);
        String str2 = AbstractC3548lu.f32613a;
        return (4294967295L & h11) | ((h10 & 4294967295L) << 32);
    }

    public final void j(int i, byte[] bArr) {
        int i4;
        int i9 = 0;
        while (true) {
            i4 = i >> 3;
            if (i9 >= i4) {
                break;
            }
            byte[] bArr2 = this.f24829a;
            int i10 = this.f24830b;
            int i11 = i10 + 1;
            this.f24830b = i11;
            byte b9 = bArr2[i10];
            int i12 = this.f24831c;
            byte b10 = (byte) (b9 << i12);
            bArr[i9] = b10;
            bArr[i9] = (byte) (((bArr2[i11] & 255) >> (8 - i12)) | b10);
            i9++;
        }
        int i13 = i & 7;
        if (i13 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i4] & (com.anythink.basead.exoplayer.k.p.f8630b >> i13));
        bArr[i4] = b11;
        int i14 = this.f24831c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f24829a;
            int i15 = this.f24830b;
            this.f24830b = i15 + 1;
            b11 = (byte) (b11 | ((bArr3[i15] & 255) << i14));
            bArr[i4] = b11;
            i14 -= 8;
        }
        int i16 = i14 + i13;
        this.f24831c = i16;
        byte[] bArr4 = this.f24829a;
        int i17 = this.f24830b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | b11);
        if (i16 == 8) {
            this.f24831c = 0;
            this.f24830b = i17 + 1;
        }
        m();
    }

    public final void k() {
        if (this.f24831c == 0) {
            return;
        }
        this.f24831c = 0;
        this.f24830b++;
        m();
    }

    public final void l(int i) {
        PA.T(this.f24831c == 0);
        this.f24830b += i;
        m();
    }

    public final void m() {
        int i;
        int i4 = this.f24830b;
        boolean z8 = false;
        if (i4 >= 0 && (i4 < (i = this.f24832d) || (i4 == i && this.f24831c == 0))) {
            z8 = true;
        }
        PA.T(z8);
    }

    public Er() {
        this.f24829a = AbstractC3548lu.f32614b;
    }
}
