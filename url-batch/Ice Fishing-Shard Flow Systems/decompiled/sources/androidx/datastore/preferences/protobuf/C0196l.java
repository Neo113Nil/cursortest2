package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import z1.AbstractC1053a;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196l extends AbstractC1053a {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f3529h = Logger.getLogger(C0196l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f3530i = i0.f3521e;

    /* renamed from: c, reason: collision with root package name */
    public E f3531c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3532d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3533e;

    /* renamed from: f, reason: collision with root package name */
    public int f3534f;

    /* renamed from: g, reason: collision with root package name */
    public final P.o0 f3535g;

    public C0196l(P.o0 o0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f3532d = new byte[max];
        this.f3533e = max;
        this.f3535g = o0Var;
    }

    public static int Y(int i2, C0191g c0191g) {
        int a02 = a0(i2);
        int size = c0191g.size();
        return b0(size) + size + a02;
    }

    public static int Z(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0207x.f3571a).length;
        }
        return b0(length) + length;
    }

    public static int a0(int i2) {
        return b0(i2 << 3);
    }

    public static int b0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int c0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Override // z1.AbstractC1053a
    public final void I(byte[] bArr, int i2, int i5) {
        g0(bArr, i2, i5);
    }

    public final void T(int i2) {
        int i5 = this.f3534f;
        int i7 = i5 + 1;
        this.f3534f = i7;
        byte[] bArr = this.f3532d;
        bArr[i5] = (byte) (i2 & 255);
        int i8 = i5 + 2;
        this.f3534f = i8;
        bArr[i7] = (byte) ((i2 >> 8) & 255);
        int i9 = i5 + 3;
        this.f3534f = i9;
        bArr[i8] = (byte) ((i2 >> 16) & 255);
        this.f3534f = i5 + 4;
        bArr[i9] = (byte) ((i2 >> 24) & 255);
    }

    public final void U(long j) {
        int i2 = this.f3534f;
        int i5 = i2 + 1;
        this.f3534f = i5;
        byte[] bArr = this.f3532d;
        bArr[i2] = (byte) (j & 255);
        int i7 = i2 + 2;
        this.f3534f = i7;
        bArr[i5] = (byte) ((j >> 8) & 255);
        int i8 = i2 + 3;
        this.f3534f = i8;
        bArr[i7] = (byte) ((j >> 16) & 255);
        int i9 = i2 + 4;
        this.f3534f = i9;
        bArr[i8] = (byte) (255 & (j >> 24));
        int i10 = i2 + 5;
        this.f3534f = i10;
        bArr[i9] = (byte) (((int) (j >> 32)) & 255);
        int i11 = i2 + 6;
        this.f3534f = i11;
        bArr[i10] = (byte) (((int) (j >> 40)) & 255);
        int i12 = i2 + 7;
        this.f3534f = i12;
        bArr[i11] = (byte) (((int) (j >> 48)) & 255);
        this.f3534f = i2 + 8;
        bArr[i12] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void V(int i2, int i5) {
        W((i2 << 3) | i5);
    }

    public final void W(int i2) {
        boolean z7 = f3530i;
        byte[] bArr = this.f3532d;
        if (!z7) {
            while ((i2 & (-128)) != 0) {
                int i5 = this.f3534f;
                this.f3534f = i5 + 1;
                bArr[i5] = (byte) ((i2 | 128) & 255);
                i2 >>>= 7;
            }
            int i7 = this.f3534f;
            this.f3534f = i7 + 1;
            bArr[i7] = (byte) i2;
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i8 = this.f3534f;
            this.f3534f = i8 + 1;
            i0.j(bArr, (byte) ((i2 | 128) & 255), i8);
            i2 >>>= 7;
        }
        int i9 = this.f3534f;
        this.f3534f = i9 + 1;
        i0.j(bArr, (byte) i2, i9);
    }

    public final void X(long j) {
        boolean z7 = f3530i;
        byte[] bArr = this.f3532d;
        if (!z7) {
            while ((j & (-128)) != 0) {
                int i2 = this.f3534f;
                this.f3534f = i2 + 1;
                bArr[i2] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
            int i5 = this.f3534f;
            this.f3534f = i5 + 1;
            bArr[i5] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i7 = this.f3534f;
            this.f3534f = i7 + 1;
            i0.j(bArr, (byte) ((((int) j) | 128) & 255), i7);
            j >>>= 7;
        }
        int i8 = this.f3534f;
        this.f3534f = i8 + 1;
        i0.j(bArr, (byte) j, i8);
    }

    public final void d0() {
        this.f3535g.write(this.f3532d, 0, this.f3534f);
        this.f3534f = 0;
    }

    public final void e0(int i2) {
        if (this.f3533e - this.f3534f < i2) {
            d0();
        }
    }

    public final void f0(byte b7) {
        if (this.f3534f == this.f3533e) {
            d0();
        }
        int i2 = this.f3534f;
        this.f3534f = i2 + 1;
        this.f3532d[i2] = b7;
    }

    public final void g0(byte[] bArr, int i2, int i5) {
        int i7 = this.f3534f;
        int i8 = this.f3533e;
        int i9 = i8 - i7;
        byte[] bArr2 = this.f3532d;
        if (i9 >= i5) {
            System.arraycopy(bArr, i2, bArr2, i7, i5);
            this.f3534f += i5;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i7, i9);
        int i10 = i2 + i9;
        int i11 = i5 - i9;
        this.f3534f = i8;
        d0();
        if (i11 > i8) {
            this.f3535g.write(bArr, i10, i11);
        } else {
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            this.f3534f = i11;
        }
    }

    public final void h0(int i2, boolean z7) {
        e0(11);
        V(i2, 0);
        byte b7 = z7 ? (byte) 1 : (byte) 0;
        int i5 = this.f3534f;
        this.f3534f = i5 + 1;
        this.f3532d[i5] = b7;
    }

    public final void i0(int i2, C0191g c0191g) {
        t0(i2, 2);
        j0(c0191g);
    }

    public final void j0(C0191g c0191g) {
        v0(c0191g.size());
        I(c0191g.f3501e, c0191g.e(), c0191g.size());
    }

    public final void k0(int i2, int i5) {
        e0(14);
        V(i2, 5);
        T(i5);
    }

    public final void l0(int i2) {
        e0(4);
        T(i2);
    }

    public final void m0(long j, int i2) {
        e0(18);
        V(i2, 1);
        U(j);
    }

    public final void n0(long j) {
        e0(8);
        U(j);
    }

    public final void o0(int i2, int i5) {
        e0(20);
        V(i2, 0);
        if (i5 >= 0) {
            W(i5);
        } else {
            X(i5);
        }
    }

    public final void p0(int i2) {
        if (i2 >= 0) {
            v0(i2);
        } else {
            x0(i2);
        }
    }

    public final void q0(int i2, AbstractC0185a abstractC0185a, V v7) {
        t0(i2, 2);
        v0(abstractC0185a.a(v7));
        v7.b(abstractC0185a, this.f3531c);
    }

    public final void r0(int i2, String str) {
        t0(i2, 2);
        s0(str);
    }

    public final void s0(String str) {
        try {
            int length = str.length() * 3;
            int b02 = b0(length);
            int i2 = b02 + length;
            int i5 = this.f3533e;
            if (i2 > i5) {
                byte[] bArr = new byte[length];
                int y7 = l0.f3536a.y(str, bArr, 0, length);
                v0(y7);
                g0(bArr, 0, y7);
                return;
            }
            if (i2 > i5 - this.f3534f) {
                d0();
            }
            int b03 = b0(str.length());
            int i7 = this.f3534f;
            byte[] bArr2 = this.f3532d;
            try {
                if (b03 == b02) {
                    int i8 = i7 + b03;
                    this.f3534f = i8;
                    int y8 = l0.f3536a.y(str, bArr2, i8, i5 - i8);
                    this.f3534f = i7;
                    W((y8 - i7) - b03);
                    this.f3534f = y8;
                } else {
                    int a7 = l0.a(str);
                    W(a7);
                    this.f3534f = l0.f3536a.y(str, bArr2, this.f3534f, a7);
                }
            } catch (k0 e7) {
                this.f3534f = i7;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new C0195k(e8);
            }
        } catch (k0 e9) {
            f3529h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
            byte[] bytes = str.getBytes(AbstractC0207x.f3571a);
            try {
                v0(bytes.length);
                I(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new C0195k(e10);
            }
        }
    }

    public final void t0(int i2, int i5) {
        v0((i2 << 3) | i5);
    }

    public final void u0(int i2, int i5) {
        e0(20);
        V(i2, 0);
        W(i5);
    }

    public final void v0(int i2) {
        e0(5);
        W(i2);
    }

    public final void w0(long j, int i2) {
        e0(20);
        V(i2, 0);
        X(j);
    }

    public final void x0(long j) {
        e0(10);
        X(j);
    }
}
