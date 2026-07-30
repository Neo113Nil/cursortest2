package com.anythink.basead.exoplayer.k;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8655a;

    /* renamed from: b, reason: collision with root package name */
    private int f8656b;

    /* renamed from: c, reason: collision with root package name */
    private int f8657c;

    /* renamed from: d, reason: collision with root package name */
    private int f8658d;

    public r() {
    }

    private void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    private int f() {
        C0544a.b(this.f8657c == 0);
        return this.f8656b;
    }

    private void g() {
        int i;
        int i4 = this.f8656b;
        C0544a.b(i4 >= 0 && (i4 < (i = this.f8658d) || (i4 == i && this.f8657c == 0)));
    }

    public final int b() {
        return (this.f8656b * 8) + this.f8657c;
    }

    public final void c() {
        int i = this.f8657c + 1;
        this.f8657c = i;
        if (i == 8) {
            this.f8657c = 0;
            this.f8656b++;
        }
        g();
    }

    public final boolean d() {
        boolean z8 = (this.f8655a[this.f8656b] & (128 >> this.f8657c)) != 0;
        c();
        return z8;
    }

    public final void e() {
        if (this.f8657c == 0) {
            return;
        }
        this.f8657c = 0;
        this.f8656b++;
        g();
    }

    public r(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private void a(s sVar) {
        a(sVar.f8659a, sVar.b());
        a(sVar.c() * 8);
    }

    public final void b(int i) {
        int i4 = i / 8;
        int i9 = this.f8656b + i4;
        this.f8656b = i9;
        int i10 = (i - (i4 * 8)) + this.f8657c;
        this.f8657c = i10;
        if (i10 > 7) {
            this.f8656b = i9 + 1;
            this.f8657c = i10 - 8;
        }
        g();
    }

    private r(byte[] bArr, int i) {
        this.f8655a = bArr;
        this.f8658d = i;
    }

    public final void d(int i) {
        int i4 = i & 16383;
        int min = Math.min(8 - this.f8657c, 14);
        int i9 = this.f8657c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f8655a;
        int i11 = this.f8656b;
        byte b9 = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        bArr[i11] = b9;
        int i12 = 14 - min;
        bArr[i11] = (byte) (b9 | ((i4 >>> i12) << i10));
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.f8655a[i13] = (byte) (i4 >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.f8655a;
        byte b10 = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = b10;
        bArr2[i13] = (byte) (((i4 & ((1 << i12) - 1)) << i14) | b10);
        b(14);
        g();
    }

    public final void a(byte[] bArr, int i) {
        this.f8655a = bArr;
        this.f8656b = 0;
        this.f8657c = 0;
        this.f8658d = i;
    }

    private void e(int i) {
        C0544a.b(this.f8657c == 0);
        this.f8656b += i;
        g();
    }

    public final int c(int i) {
        int i4;
        if (i == 0) {
            return 0;
        }
        this.f8657c += i;
        int i9 = 0;
        while (true) {
            i4 = this.f8657c;
            if (i4 <= 8) {
                break;
            }
            int i10 = i4 - 8;
            this.f8657c = i10;
            byte[] bArr = this.f8655a;
            int i11 = this.f8656b;
            this.f8656b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f8655a;
        int i12 = this.f8656b;
        int i13 = ((-1) >>> (32 - i)) & (i9 | ((bArr2[i12] & 255) >> (8 - i4)));
        if (i4 == 8) {
            this.f8657c = 0;
            this.f8656b = i12 + 1;
        }
        g();
        return i13;
    }

    private void b(byte[] bArr, int i, int i4) {
        C0544a.b(this.f8657c == 0);
        System.arraycopy(this.f8655a, this.f8656b, bArr, i, i4);
        this.f8656b += i4;
        g();
    }

    public final int a() {
        return ((this.f8658d - this.f8656b) * 8) - this.f8657c;
    }

    public final void a(int i) {
        int i4 = i / 8;
        this.f8656b = i4;
        this.f8657c = i - (i4 * 8);
        g();
    }

    private void a(byte[] bArr, int i, int i4) {
        int i9 = (i4 >> 3) + i;
        while (i < i9) {
            byte[] bArr2 = this.f8655a;
            int i10 = this.f8656b;
            int i11 = i10 + 1;
            this.f8656b = i11;
            byte b9 = bArr2[i10];
            int i12 = this.f8657c;
            byte b10 = (byte) (b9 << i12);
            bArr[i] = b10;
            bArr[i] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | b10);
            i++;
        }
        int i13 = i4 & 7;
        if (i13 == 0) {
            return;
        }
        byte b11 = (byte) (bArr[i9] & (p.f8630b >> i13));
        bArr[i9] = b11;
        int i14 = this.f8657c;
        if (i14 + i13 > 8) {
            byte[] bArr3 = this.f8655a;
            int i15 = this.f8656b;
            this.f8656b = i15 + 1;
            bArr[i9] = (byte) (b11 | ((bArr3[i15] & 255) << i14));
            this.f8657c = i14 - 8;
        }
        int i16 = this.f8657c + i13;
        this.f8657c = i16;
        byte[] bArr4 = this.f8655a;
        int i17 = this.f8656b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i17]) >> (8 - i16)) << (8 - i13))) | bArr[i9]);
        if (i16 == 8) {
            this.f8657c = 0;
            this.f8656b = i17 + 1;
        }
        g();
    }
}
