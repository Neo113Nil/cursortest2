package androidx.datastore.preferences.protobuf;

import a.AbstractC0132a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150m extends AbstractC0132a {

    /* renamed from: o, reason: collision with root package name */
    public static final Logger f1720o = Logger.getLogger(C0150m.class.getName());

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f1721p = j0.f1712e;

    /* renamed from: j, reason: collision with root package name */
    public F f1722j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f1723k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1724l;

    /* renamed from: m, reason: collision with root package name */
    public int f1725m;

    /* renamed from: n, reason: collision with root package name */
    public final I.m0 f1726n;

    public C0150m(I.m0 m0Var, int i2) {
        super(21);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f1723k = new byte[max];
        this.f1724l = max;
        this.f1726n = m0Var;
    }

    public static int X(int i2) {
        return n0(i2) + 1;
    }

    public static int Y(int i2, C0144g c0144g) {
        int n02 = n0(i2);
        int size = c0144g.size();
        return p0(size) + size + n02;
    }

    public static int Z(int i2) {
        return n0(i2) + 8;
    }

    public static int a0(int i2, int i3) {
        return r0(i3) + n0(i2);
    }

    public static int b0(int i2) {
        return n0(i2) + 4;
    }

    public static int c0(int i2) {
        return n0(i2) + 8;
    }

    public static int d0(int i2) {
        return n0(i2) + 4;
    }

    public static int e0(int i2, AbstractC0138a abstractC0138a, W w2) {
        return abstractC0138a.a(w2) + (n0(i2) * 2);
    }

    public static int f0(int i2, int i3) {
        return r0(i3) + n0(i2);
    }

    public static int g0(long j2, int i2) {
        return r0(j2) + n0(i2);
    }

    public static int h0(int i2) {
        return n0(i2) + 4;
    }

    public static int i0(int i2) {
        return n0(i2) + 8;
    }

    public static int j0(int i2, int i3) {
        return p0((i3 >> 31) ^ (i3 << 1)) + n0(i2);
    }

    public static int k0(long j2, int i2) {
        return r0((j2 >> 63) ^ (j2 << 1)) + n0(i2);
    }

    public static int l0(String str, int i2) {
        return m0(str) + n0(i2);
    }

    public static int m0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0161y.f1761a).length;
        }
        return p0(length) + length;
    }

    public static int n0(int i2) {
        return p0(i2 << 3);
    }

    public static int o0(int i2, int i3) {
        return p0(i3) + n0(i2);
    }

    public static int p0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int q0(long j2, int i2) {
        return r0(j2) + n0(i2);
    }

    public static int r0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void A0(int i2) {
        t0(4);
        S(i2);
    }

    public final void B0(long j2, int i2) {
        t0(18);
        U(i2, 1);
        T(j2);
    }

    public final void C0(long j2) {
        t0(8);
        T(j2);
    }

    public final void D0(int i2, int i3) {
        t0(20);
        U(i2, 0);
        if (i3 >= 0) {
            V(i3);
        } else {
            W(i3);
        }
    }

    public final void E0(int i2) {
        if (i2 >= 0) {
            J0(i2);
        } else {
            L0(i2);
        }
    }

    public final void F0(String str, int i2) {
        H0(i2, 2);
        G0(str);
    }

    public final void G0(String str) {
        try {
            int length = str.length() * 3;
            int p02 = p0(length);
            int i2 = p02 + length;
            int i3 = this.f1724l;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int i4 = m0.f1727a.i(str, bArr, 0, length);
                J0(i4);
                v0(bArr, 0, i4);
                return;
            }
            if (i2 > i3 - this.f1725m) {
                s0();
            }
            int p03 = p0(str.length());
            int i5 = this.f1725m;
            byte[] bArr2 = this.f1723k;
            try {
                try {
                    if (p03 == p02) {
                        int i6 = i5 + p03;
                        this.f1725m = i6;
                        int i7 = m0.f1727a.i(str, bArr2, i6, i3 - i6);
                        this.f1725m = i5;
                        V((i7 - i5) - p03);
                        this.f1725m = i7;
                    } else {
                        int a2 = m0.a(str);
                        V(a2);
                        this.f1725m = m0.f1727a.i(str, bArr2, this.f1725m, a2);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new C0149l(e2);
                }
            } catch (l0 e3) {
                this.f1725m = i5;
                throw e3;
            }
        } catch (l0 e4) {
            f1720o.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0161y.f1761a);
            try {
                J0(bytes.length);
                Q(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0149l(e5);
            }
        }
    }

    public final void H0(int i2, int i3) {
        J0((i2 << 3) | i3);
    }

    public final void I0(int i2, int i3) {
        t0(20);
        U(i2, 0);
        V(i3);
    }

    public final void J0(int i2) {
        t0(5);
        V(i2);
    }

    public final void K0(long j2, int i2) {
        t0(20);
        U(i2, 0);
        W(j2);
    }

    public final void L0(long j2) {
        t0(10);
        W(j2);
    }

    @Override // a.AbstractC0132a
    public final void Q(byte[] bArr, int i2, int i3) {
        v0(bArr, i2, i3);
    }

    public final void S(int i2) {
        int i3 = this.f1725m;
        int i4 = i3 + 1;
        this.f1725m = i4;
        byte[] bArr = this.f1723k;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f1725m = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f1725m = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f1725m = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void T(long j2) {
        int i2 = this.f1725m;
        int i3 = i2 + 1;
        this.f1725m = i3;
        byte[] bArr = this.f1723k;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f1725m = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f1725m = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f1725m = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f1725m = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i2 + 6;
        this.f1725m = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i2 + 7;
        this.f1725m = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f1725m = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void U(int i2, int i3) {
        V((i2 << 3) | i3);
    }

    public final void V(int i2) {
        boolean z2 = f1721p;
        byte[] bArr = this.f1723k;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f1725m;
                this.f1725m = i3 + 1;
                j0.j(bArr, i3, (byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            int i4 = this.f1725m;
            this.f1725m = i4 + 1;
            j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f1725m;
            this.f1725m = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        int i6 = this.f1725m;
        this.f1725m = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void W(long j2) {
        boolean z2 = f1721p;
        byte[] bArr = this.f1723k;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f1725m;
                this.f1725m = i2 + 1;
                j0.j(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i3 = this.f1725m;
            this.f1725m = i3 + 1;
            j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f1725m;
            this.f1725m = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & 255);
            j2 >>>= 7;
        }
        int i5 = this.f1725m;
        this.f1725m = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void s0() {
        this.f1726n.write(this.f1723k, 0, this.f1725m);
        this.f1725m = 0;
    }

    public final void t0(int i2) {
        if (this.f1724l - this.f1725m < i2) {
            s0();
        }
    }

    public final void u0(byte b2) {
        if (this.f1725m == this.f1724l) {
            s0();
        }
        int i2 = this.f1725m;
        this.f1725m = i2 + 1;
        this.f1723k[i2] = b2;
    }

    public final void v0(byte[] bArr, int i2, int i3) {
        int i4 = this.f1725m;
        int i5 = this.f1724l;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f1723k;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f1725m += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f1725m = i5;
        s0();
        if (i8 > i5) {
            this.f1726n.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f1725m = i8;
        }
    }

    public final void w0(int i2, boolean z2) {
        t0(11);
        U(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f1725m;
        this.f1725m = i3 + 1;
        this.f1723k[i3] = b2;
    }

    public final void x0(int i2, C0144g c0144g) {
        H0(i2, 2);
        y0(c0144g);
    }

    public final void y0(C0144g c0144g) {
        J0(c0144g.size());
        Q(c0144g.f1688f, c0144g.e(), c0144g.size());
    }

    public final void z0(int i2, int i3) {
        t0(14);
        U(i2, 5);
        S(i3);
    }
}
