package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cq2 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f3919a;

    /* renamed from: b, reason: collision with root package name */
    private int f3920b;

    /* renamed from: c, reason: collision with root package name */
    private int f3921c;

    /* renamed from: d, reason: collision with root package name */
    private int f3922d;

    public cq2() {
        this.f3919a = n13.f8870f;
    }

    public cq2(byte[] bArr, int i7) {
        this.f3919a = bArr;
        this.f3922d = i7;
    }

    private final void m() {
        int i7;
        int i8 = this.f3920b;
        boolean z6 = true;
        if (i8 < 0 || (i8 >= (i7 = this.f3922d) && (i8 != i7 || this.f3921c != 0))) {
            z6 = false;
        }
        wu1.f(z6);
    }

    public final int a() {
        return ((this.f3922d - this.f3920b) * 8) - this.f3921c;
    }

    public final int b() {
        return (this.f3920b * 8) + this.f3921c;
    }

    public final int c(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.f3921c += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f3921c;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f3921c = i10;
            byte[] bArr = this.f3919a;
            int i11 = this.f3920b;
            this.f3920b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f3919a;
        int i12 = this.f3920b;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f3921c = 0;
            this.f3920b = i12 + 1;
        }
        m();
        return i13;
    }

    public final void d() {
        if (this.f3921c == 0) {
            return;
        }
        this.f3921c = 0;
        this.f3920b++;
        m();
    }

    public final void e(int i7, int i8) {
        int i9 = i7 & 16383;
        int min = Math.min(8 - this.f3921c, 14);
        int i10 = this.f3921c;
        int i11 = (8 - i10) - min;
        byte[] bArr = this.f3919a;
        int i12 = this.f3920b;
        byte b7 = (byte) (((65280 >> i10) | ((1 << i11) - 1)) & bArr[i12]);
        bArr[i12] = b7;
        int i13 = 14 - min;
        bArr[i12] = (byte) (b7 | ((i9 >>> i13) << i11));
        int i14 = i12 + 1;
        while (i13 > 8) {
            i13 -= 8;
            this.f3919a[i14] = (byte) (i9 >>> i13);
            i14++;
        }
        byte[] bArr2 = this.f3919a;
        byte b8 = (byte) (bArr2[i14] & ((1 << r0) - 1));
        bArr2[i14] = b8;
        bArr2[i14] = (byte) (((i9 & ((1 << i13) - 1)) << (8 - i13)) | b8);
        j(14);
        m();
    }

    public final void f(byte[] bArr, int i7, int i8) {
        int i9 = i8 >> 3;
        for (int i10 = 0; i10 < i9; i10++) {
            byte[] bArr2 = this.f3919a;
            int i11 = this.f3920b;
            int i12 = i11 + 1;
            this.f3920b = i12;
            byte b7 = bArr2[i11];
            int i13 = this.f3921c;
            byte b8 = (byte) (b7 << i13);
            bArr[i10] = b8;
            bArr[i10] = (byte) (((255 & bArr2[i12]) >> (8 - i13)) | b8);
        }
        int i14 = i8 & 7;
        if (i14 == 0) {
            return;
        }
        byte b9 = (byte) (bArr[i9] & (255 >> i14));
        bArr[i9] = b9;
        int i15 = this.f3921c;
        if (i15 + i14 > 8) {
            byte[] bArr3 = this.f3919a;
            int i16 = this.f3920b;
            this.f3920b = i16 + 1;
            b9 = (byte) (b9 | ((bArr3[i16] & 255) << i15));
            bArr[i9] = b9;
            i15 -= 8;
        }
        int i17 = i15 + i14;
        this.f3921c = i17;
        byte[] bArr4 = this.f3919a;
        int i18 = this.f3920b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i14))) | b9);
        if (i17 == 8) {
            this.f3921c = 0;
            this.f3920b = i18 + 1;
        }
        m();
    }

    public final void g(byte[] bArr, int i7) {
        this.f3919a = bArr;
        this.f3920b = 0;
        this.f3921c = 0;
        this.f3922d = i7;
    }

    public final void h(int i7) {
        int i8 = i7 / 8;
        this.f3920b = i8;
        this.f3921c = i7 - (i8 * 8);
        m();
    }

    public final void i() {
        int i7 = this.f3921c + 1;
        this.f3921c = i7;
        if (i7 == 8) {
            this.f3921c = 0;
            this.f3920b++;
        }
        m();
    }

    public final void j(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f3920b + i8;
        this.f3920b = i9;
        int i10 = this.f3921c + (i7 - (i8 * 8));
        this.f3921c = i10;
        if (i10 > 7) {
            this.f3920b = i9 + 1;
            this.f3921c = i10 - 8;
        }
        m();
    }

    public final void k(int i7) {
        wu1.f(this.f3921c == 0);
        this.f3920b += i7;
        m();
    }

    public final boolean l() {
        boolean z6 = (this.f3919a[this.f3920b] & (128 >> this.f3921c)) != 0;
        i();
        return z6;
    }
}
