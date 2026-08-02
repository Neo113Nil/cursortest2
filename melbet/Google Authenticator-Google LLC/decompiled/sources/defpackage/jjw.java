package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjw extends jjz {
    private final byte[] b;
    private final int c;
    private int d;

    public jjw(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i2 | (length - i3)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        this.b = bArr;
        this.d = i;
        this.c = i3;
    }

    @Override // defpackage.jji
    public final void a(byte[] bArr, int i, int i2) {
        e(bArr, i, i2);
    }

    @Override // defpackage.jjz
    public final int b() {
        return this.c - this.d;
    }

    @Override // defpackage.jjz
    public final void d(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new jjx(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    public final void e(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new jjx(this.d, this.c, i2, e);
        }
    }

    @Override // defpackage.jjz
    public final void f(int i, boolean z) {
        v(i << 3);
        d(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.jjz
    public final void g(int i, jjq jjqVar) {
        v((i << 3) | 2);
        h(jjqVar);
    }

    @Override // defpackage.jjz
    public final void h(jjq jjqVar) {
        v(jjqVar.c());
        jjqVar.i(this);
    }

    @Override // defpackage.jjz
    public final void i(int i, int i2) {
        v((i << 3) | 5);
        j(i2);
    }

    @Override // defpackage.jjz
    public final void j(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new jjx(i2, this.c, 4, e);
        }
    }

    @Override // defpackage.jjz
    public final void k(int i, long j) {
        v((i << 3) | 1);
        l(j);
    }

    @Override // defpackage.jjz
    public final void l(long j) {
        int i = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new jjx(i, this.c, 8, e);
        }
    }

    @Override // defpackage.jjz
    public final void m(int i, int i2) {
        v(i << 3);
        n(i2);
    }

    @Override // defpackage.jjz
    public final void n(int i) {
        if (i >= 0) {
            v(i);
            return;
        }
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.d = i2;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i7;
                        throw new jjx(i2, this.c, 10, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                i2 = i3;
                e = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // defpackage.jjz
    public final void o(jll jllVar) {
        v(jllVar.j());
        jllVar.K(this);
    }

    @Override // defpackage.jjz
    public final void p(int i, jll jllVar) {
        v(11);
        u(2, i);
        v(26);
        o(jllVar);
        v(12);
    }

    @Override // defpackage.jjz
    public final void q(int i, jjq jjqVar) {
        v(11);
        u(2, i);
        g(3, jjqVar);
        v(12);
    }

    @Override // defpackage.jjz
    public final void r(int i, String str) {
        v((i << 3) | 2);
        s(str);
    }

    @Override // defpackage.jjz
    public final void s(String str) {
        int i = this.d;
        try {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int numberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (numberOfLeadingZeros2 != ((352 - numberOfLeadingZeros) >>> 6)) {
                v(ime.b(str));
                byte[] bArr = this.b;
                int i2 = this.d;
                this.d = img.a(str, bArr, i2, bArr.length - i2);
                return;
            }
            int i3 = i + numberOfLeadingZeros2;
            this.d = i3;
            byte[] bArr2 = this.b;
            int a = img.a(str, bArr2, i3, bArr2.length - i3);
            this.d = i;
            v((a - i) - numberOfLeadingZeros2);
            this.d = a;
        } catch (IndexOutOfBoundsException e) {
            throw new jjx(e);
        }
    }

    @Override // defpackage.jjz
    public final void t(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // defpackage.jjz
    public final void u(int i, int i2) {
        v(i << 3);
        v(i2);
    }

    @Override // defpackage.jjz
    public final void v(int i) {
        int i2 = this.d;
        int i3 = i & (-128);
        byte[] bArr = this.b;
        try {
            if (i3 == 0) {
                int i4 = i2 + 1;
                bArr[i2] = (byte) i;
                this.d = i4;
                return;
            }
            int i5 = i2 + 1;
            bArr[i2] = (byte) (i | 128);
            int i6 = i >>> 7;
            try {
                if ((i6 & (-128)) == 0) {
                    int i7 = i2 + 2;
                    bArr[i5] = (byte) i6;
                    this.d = i7;
                    return;
                }
                int i8 = i2 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & (-128)) == 0) {
                        int i10 = i2 + 3;
                        bArr[i8] = (byte) i9;
                        this.d = i10;
                        return;
                    }
                    int i11 = i2 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & (-128)) == 0) {
                            int i13 = i2 + 4;
                            bArr[i11] = (byte) i12;
                            this.d = i13;
                        } else {
                            i8 = i2 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i2 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.d = i14;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i11;
                        throw new jjx(i3, this.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i3 = i8;
                }
            } catch (IndexOutOfBoundsException e3) {
                i3 = i;
                e = e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            e = e4;
        }
    }

    @Override // defpackage.jjz
    public final void w(int i, long j) {
        v(i << 3);
        x(j);
    }

    @Override // defpackage.jjz
    public final void x(long j) {
        long j2 = j & (-128);
        int i = this.d;
        byte[] bArr = this.b;
        try {
            if (j2 == 0) {
                bArr[i] = (byte) j;
                this.d = i + 1;
                return;
            }
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.d = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.d = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.d = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.d = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.d = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.d = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.d = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.d = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.d = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new jjx(i, this.c, 1, e);
        }
    }

    @Override // defpackage.jjz
    public final void y(byte[] bArr, int i) {
        v(i);
        e(bArr, 0, i);
    }

    @Override // defpackage.jjz
    public final void c() {
    }
}
