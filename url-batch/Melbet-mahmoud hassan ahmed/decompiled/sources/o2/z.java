package o2;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f19836a;

    /* renamed from: b, reason: collision with root package name */
    private int f19837b;

    /* renamed from: c, reason: collision with root package name */
    private int f19838c;

    /* renamed from: d, reason: collision with root package name */
    private int f19839d;

    public z() {
        this.f19836a = m0.f19757f;
    }

    public z(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public z(byte[] bArr, int i7) {
        this.f19836a = bArr;
        this.f19839d = i7;
    }

    private void a() {
        int i7;
        int i8 = this.f19837b;
        a.f(i8 >= 0 && (i8 < (i7 = this.f19839d) || (i8 == i7 && this.f19838c == 0)));
    }

    public int b() {
        return ((this.f19839d - this.f19837b) * 8) - this.f19838c;
    }

    public void c() {
        if (this.f19838c == 0) {
            return;
        }
        this.f19838c = 0;
        this.f19837b++;
        a();
    }

    public int d() {
        a.f(this.f19838c == 0);
        return this.f19837b;
    }

    public int e() {
        return (this.f19837b * 8) + this.f19838c;
    }

    public void f(int i7, int i8) {
        if (i8 < 32) {
            i7 &= (1 << i8) - 1;
        }
        int min = Math.min(8 - this.f19838c, i8);
        int i9 = this.f19838c;
        int i10 = (8 - i9) - min;
        byte[] bArr = this.f19836a;
        int i11 = this.f19837b;
        bArr[i11] = (byte) (((65280 >> i9) | ((1 << i10) - 1)) & bArr[i11]);
        int i12 = i8 - min;
        bArr[i11] = (byte) (((i7 >>> i12) << i10) | bArr[i11]);
        int i13 = i11 + 1;
        while (i12 > 8) {
            this.f19836a[i13] = (byte) (i7 >>> (i12 - 8));
            i12 -= 8;
            i13++;
        }
        int i14 = 8 - i12;
        byte[] bArr2 = this.f19836a;
        bArr2[i13] = (byte) (bArr2[i13] & ((1 << i14) - 1));
        bArr2[i13] = (byte) (((i7 & ((1 << i12) - 1)) << i14) | bArr2[i13]);
        r(i8);
        a();
    }

    public boolean g() {
        boolean z6 = (this.f19836a[this.f19837b] & (128 >> this.f19838c)) != 0;
        q();
        return z6;
    }

    public int h(int i7) {
        int i8;
        if (i7 == 0) {
            return 0;
        }
        this.f19838c += i7;
        int i9 = 0;
        while (true) {
            i8 = this.f19838c;
            if (i8 <= 8) {
                break;
            }
            int i10 = i8 - 8;
            this.f19838c = i10;
            byte[] bArr = this.f19836a;
            int i11 = this.f19837b;
            this.f19837b = i11 + 1;
            i9 |= (bArr[i11] & 255) << i10;
        }
        byte[] bArr2 = this.f19836a;
        int i12 = this.f19837b;
        int i13 = ((-1) >>> (32 - i7)) & (i9 | ((bArr2[i12] & 255) >> (8 - i8)));
        if (i8 == 8) {
            this.f19838c = 0;
            this.f19837b = i12 + 1;
        }
        a();
        return i13;
    }

    public void i(byte[] bArr, int i7, int i8) {
        int i9 = (i8 >> 3) + i7;
        while (i7 < i9) {
            byte[] bArr2 = this.f19836a;
            int i10 = this.f19837b;
            int i11 = i10 + 1;
            this.f19837b = i11;
            byte b7 = bArr2[i10];
            int i12 = this.f19838c;
            bArr[i7] = (byte) (b7 << i12);
            bArr[i7] = (byte) (((255 & bArr2[i11]) >> (8 - i12)) | bArr[i7]);
            i7++;
        }
        int i13 = i8 & 7;
        if (i13 == 0) {
            return;
        }
        bArr[i9] = (byte) (bArr[i9] & (255 >> i13));
        int i14 = this.f19838c;
        if (i14 + i13 > 8) {
            int i15 = bArr[i9];
            byte[] bArr3 = this.f19836a;
            int i16 = this.f19837b;
            this.f19837b = i16 + 1;
            bArr[i9] = (byte) (i15 | ((bArr3[i16] & 255) << i14));
            this.f19838c = i14 - 8;
        }
        int i17 = this.f19838c + i13;
        this.f19838c = i17;
        byte[] bArr4 = this.f19836a;
        int i18 = this.f19837b;
        bArr[i9] = (byte) (((byte) (((255 & bArr4[i18]) >> (8 - i17)) << (8 - i13))) | bArr[i9]);
        if (i17 == 8) {
            this.f19838c = 0;
            this.f19837b = i18 + 1;
        }
        a();
    }

    public long j(int i7) {
        return i7 <= 32 ? m0.W0(h(i7)) : m0.V0(h(i7 - 32), h(32));
    }

    public void k(byte[] bArr, int i7, int i8) {
        a.f(this.f19838c == 0);
        System.arraycopy(this.f19836a, this.f19837b, bArr, i7, i8);
        this.f19837b += i8;
        a();
    }

    public String l(int i7, Charset charset) {
        byte[] bArr = new byte[i7];
        k(bArr, 0, i7);
        return new String(bArr, charset);
    }

    public void m(a0 a0Var) {
        o(a0Var.d(), a0Var.f());
        p(a0Var.e() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i7) {
        this.f19836a = bArr;
        this.f19837b = 0;
        this.f19838c = 0;
        this.f19839d = i7;
    }

    public void p(int i7) {
        int i8 = i7 / 8;
        this.f19837b = i8;
        this.f19838c = i7 - (i8 * 8);
        a();
    }

    public void q() {
        int i7 = this.f19838c + 1;
        this.f19838c = i7;
        if (i7 == 8) {
            this.f19838c = 0;
            this.f19837b++;
        }
        a();
    }

    public void r(int i7) {
        int i8 = i7 / 8;
        int i9 = this.f19837b + i8;
        this.f19837b = i9;
        int i10 = this.f19838c + (i7 - (i8 * 8));
        this.f19838c = i10;
        if (i10 > 7) {
            this.f19837b = i9 + 1;
            this.f19838c = i10 - 8;
        }
        a();
    }

    public void s(int i7) {
        a.f(this.f19838c == 0);
        this.f19837b += i7;
        a();
    }
}
