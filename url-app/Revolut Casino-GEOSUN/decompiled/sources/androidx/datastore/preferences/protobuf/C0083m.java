package androidx.datastore.preferences.protobuf;

import a.AbstractC0069a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083m extends AbstractC0069a {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f1471n = Logger.getLogger(C0083m.class.getName());

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f1472o = j0.f1463d;

    /* renamed from: i, reason: collision with root package name */
    public F f1473i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f1474j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1475k;

    /* renamed from: l, reason: collision with root package name */
    public int f1476l;

    /* renamed from: m, reason: collision with root package name */
    public final D.o0 f1477m;

    public C0083m(D.o0 o0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f1474j = new byte[max];
        this.f1475k = max;
        this.f1477m = o0Var;
    }

    public static int U(int i2) {
        return k0(i2) + 1;
    }

    public static int V(int i2, C0077g c0077g) {
        int k02 = k0(i2);
        int size = c0077g.size();
        return m0(size) + size + k02;
    }

    public static int W(int i2) {
        return k0(i2) + 8;
    }

    public static int X(int i2, int i3) {
        return o0(i3) + k0(i2);
    }

    public static int Y(int i2) {
        return k0(i2) + 4;
    }

    public static int Z(int i2) {
        return k0(i2) + 8;
    }

    public static int a0(int i2) {
        return k0(i2) + 4;
    }

    public static int b0(int i2, AbstractC0071a abstractC0071a, W w2) {
        return abstractC0071a.a(w2) + (k0(i2) * 2);
    }

    public static int c0(int i2, int i3) {
        return o0(i3) + k0(i2);
    }

    public static int d0(long j2, int i2) {
        return o0(j2) + k0(i2);
    }

    public static int e0(int i2) {
        return k0(i2) + 4;
    }

    public static int f0(int i2) {
        return k0(i2) + 8;
    }

    public static int g0(int i2, int i3) {
        return m0((i3 >> 31) ^ (i3 << 1)) + k0(i2);
    }

    public static int h0(long j2, int i2) {
        return o0((j2 >> 63) ^ (j2 << 1)) + k0(i2);
    }

    public static int i0(String str, int i2) {
        return j0(str) + k0(i2);
    }

    public static int j0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0094y.f1512a).length;
        }
        return m0(length) + length;
    }

    public static int k0(int i2) {
        return m0(i2 << 3);
    }

    public static int l0(int i2, int i3) {
        return m0(i3) + k0(i2);
    }

    public static int m0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int n0(long j2, int i2) {
        return o0(j2) + k0(i2);
    }

    public static int o0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public final void A0(int i2, int i3) {
        q0(20);
        R(i2, 0);
        if (i3 >= 0) {
            S(i3);
        } else {
            T(i3);
        }
    }

    public final void B0(int i2) {
        if (i2 >= 0) {
            G0(i2);
        } else {
            I0(i2);
        }
    }

    public final void C0(String str, int i2) {
        E0(i2, 2);
        D0(str);
    }

    public final void D0(String str) {
        try {
            int length = str.length() * 3;
            int m02 = m0(length);
            int i2 = m02 + length;
            int i3 = this.f1475k;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int m2 = m0.f1478a.m(str, bArr, 0, length);
                G0(m2);
                s0(bArr, 0, m2);
                return;
            }
            if (i2 > i3 - this.f1476l) {
                p0();
            }
            int m03 = m0(str.length());
            int i4 = this.f1476l;
            byte[] bArr2 = this.f1474j;
            try {
                try {
                    if (m03 == m02) {
                        int i5 = i4 + m03;
                        this.f1476l = i5;
                        int m3 = m0.f1478a.m(str, bArr2, i5, i3 - i5);
                        this.f1476l = i4;
                        S((m3 - i4) - m03);
                        this.f1476l = m3;
                    } else {
                        int a2 = m0.a(str);
                        S(a2);
                        this.f1476l = m0.f1478a.m(str, bArr2, this.f1476l, a2);
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new C0082l(e2);
                }
            } catch (l0 e3) {
                this.f1476l = i4;
                throw e3;
            }
        } catch (l0 e4) {
            f1471n.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0094y.f1512a);
            try {
                G0(bytes.length);
                O(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0082l(e5);
            }
        }
    }

    public final void E0(int i2, int i3) {
        G0((i2 << 3) | i3);
    }

    public final void F0(int i2, int i3) {
        q0(20);
        R(i2, 0);
        S(i3);
    }

    public final void G0(int i2) {
        q0(5);
        S(i2);
    }

    public final void H0(long j2, int i2) {
        q0(20);
        R(i2, 0);
        T(j2);
    }

    public final void I0(long j2) {
        q0(10);
        T(j2);
    }

    @Override // a.AbstractC0069a
    public final void O(byte[] bArr, int i2, int i3) {
        s0(bArr, i2, i3);
    }

    public final void P(int i2) {
        int i3 = this.f1476l;
        int i4 = i3 + 1;
        this.f1476l = i4;
        byte[] bArr = this.f1474j;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f1476l = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f1476l = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f1476l = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void Q(long j2) {
        int i2 = this.f1476l;
        int i3 = i2 + 1;
        this.f1476l = i3;
        byte[] bArr = this.f1474j;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f1476l = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f1476l = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f1476l = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f1476l = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i2 + 6;
        this.f1476l = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i2 + 7;
        this.f1476l = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f1476l = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void R(int i2, int i3) {
        S((i2 << 3) | i3);
    }

    public final void S(int i2) {
        boolean z2 = f1472o;
        byte[] bArr = this.f1474j;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f1476l;
                this.f1476l = i3 + 1;
                j0.j(bArr, i3, (byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            int i4 = this.f1476l;
            this.f1476l = i4 + 1;
            j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f1476l;
            this.f1476l = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        int i6 = this.f1476l;
        this.f1476l = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void T(long j2) {
        boolean z2 = f1472o;
        byte[] bArr = this.f1474j;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f1476l;
                this.f1476l = i2 + 1;
                j0.j(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i3 = this.f1476l;
            this.f1476l = i3 + 1;
            j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f1476l;
            this.f1476l = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & 255);
            j2 >>>= 7;
        }
        int i5 = this.f1476l;
        this.f1476l = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void p0() {
        this.f1477m.write(this.f1474j, 0, this.f1476l);
        this.f1476l = 0;
    }

    public final void q0(int i2) {
        if (this.f1475k - this.f1476l < i2) {
            p0();
        }
    }

    public final void r0(byte b2) {
        if (this.f1476l == this.f1475k) {
            p0();
        }
        int i2 = this.f1476l;
        this.f1476l = i2 + 1;
        this.f1474j[i2] = b2;
    }

    public final void s0(byte[] bArr, int i2, int i3) {
        int i4 = this.f1476l;
        int i5 = this.f1475k;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f1474j;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f1476l += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f1476l = i5;
        p0();
        if (i8 > i5) {
            this.f1477m.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f1476l = i8;
        }
    }

    public final void t0(int i2, boolean z2) {
        q0(11);
        R(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f1476l;
        this.f1476l = i3 + 1;
        this.f1474j[i3] = b2;
    }

    public final void u0(int i2, C0077g c0077g) {
        E0(i2, 2);
        v0(c0077g);
    }

    public final void v0(C0077g c0077g) {
        G0(c0077g.size());
        O(c0077g.f1440f, c0077g.e(), c0077g.size());
    }

    public final void w0(int i2, int i3) {
        q0(14);
        R(i2, 5);
        P(i3);
    }

    public final void x0(int i2) {
        q0(4);
        P(i2);
    }

    public final void y0(long j2, int i2) {
        q0(18);
        R(i2, 1);
        Q(j2);
    }

    public final void z0(long j2) {
        q0(8);
        Q(j2);
    }
}
