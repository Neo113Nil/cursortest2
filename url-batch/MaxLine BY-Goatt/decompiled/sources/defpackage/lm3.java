package defpackage;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lm3 {
    public static final Logger e = Logger.getLogger(lm3.class.getName());
    public static final boolean f = sp3.e;
    public ot2 a;
    public final byte[] b;
    public final int c;
    public int d;

    public lm3(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            lh.e(q40.j("Array range is invalid. Buffer.length=", length, i, ", offset=0, length="));
            throw null;
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = wp3.b(str);
        } catch (up3 unused) {
            length = str.getBytes(sn3.a).length;
        }
        return r(length) + length;
    }

    public static int r(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void c(int i, int i2) {
        l((i << 3) | i2);
    }

    public final void d(int i, int i2) {
        l(i << 3);
        k(i2);
    }

    public final void e(int i, int i2) {
        l(i << 3);
        l(i2);
    }

    public final void f(int i, int i2) {
        l((i << 3) | 5);
        m(i2);
    }

    public final void g(long j, int i) {
        l(i << 3);
        n(j);
    }

    public final void h(long j, int i) {
        l((i << 3) | 1);
        o(j);
    }

    public final void i(im3 im3Var) {
        l(im3Var.c());
        p(im3Var.c(), im3Var.n);
    }

    public final void j(byte b) {
        int i = this.d;
        try {
            int i2 = i + 1;
            try {
                this.b[i] = b;
                this.d = i2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                i = i2;
                throw new nm3(i, this.c, 1, e);
            }
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
        }
    }

    public final void k(int i) {
        if (i >= 0) {
            l(i);
        } else {
            n(i);
        }
    }

    public final void l(int i) {
        int i2;
        int i3 = this.d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new nm3(i2, this.c, 1, e2);
                }
            }
            throw new nm3(i2, this.c, 1, e2);
        }
    }

    public final void m(int i) {
        int i2 = this.d;
        try {
            byte[] bArr = this.b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.d = i2 + 4;
        } catch (IndexOutOfBoundsException e2) {
            throw new nm3(i2, this.c, 4, e2);
        }
    }

    public final void n(long j) {
        int i;
        int i2 = this.d;
        byte[] bArr = this.b;
        int i3 = this.c;
        if (!f || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    i = i4;
                    throw new nm3(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                e = e3;
                throw new nm3(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                sp3.c.p(bArr, sp3.f + i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            sp3.c.p(bArr, sp3.f + i2, (byte) j);
        }
        this.d = i;
    }

    public final void o(long j) {
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
        } catch (IndexOutOfBoundsException e2) {
            throw new nm3(i, this.c, 8, e2);
        }
    }

    public final void p(int i, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.b, this.d, i);
            this.d += i;
        } catch (IndexOutOfBoundsException e2) {
            throw new nm3(this.d, this.c, i, e2);
        }
    }

    public final void q(String str) {
        int i = this.d;
        try {
            int r = r(str.length() * 3);
            int r2 = r(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (r2 != r) {
                l(wp3.b(str));
                int i3 = this.d;
                this.d = wp3.c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + r2;
                this.d = i4;
                int c = wp3.c(str, bArr, i4, i2 - i4);
                this.d = i;
                l((c - i) - r2);
                this.d = c;
            }
        } catch (IndexOutOfBoundsException e2) {
            throw new nm3(e2);
        } catch (up3 e3) {
            this.d = i;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(sn3.a);
            try {
                int length = bytes.length;
                l(length);
                p(length, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new nm3(e4);
            }
        }
    }
}
