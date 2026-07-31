package androidx.datastore.preferences.protobuf;

import a.AbstractC0086a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101m extends AbstractC0086a {

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f1560j = Logger.getLogger(C0101m.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f1561k = j0.f1552e;

    /* renamed from: e, reason: collision with root package name */
    public F f1562e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1563f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1564g;

    /* renamed from: h, reason: collision with root package name */
    public int f1565h;

    /* renamed from: i, reason: collision with root package name */
    public final F.n0 f1566i;

    public C0101m(F.n0 n0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f1563f = new byte[max];
        this.f1564g = max;
        this.f1566i = n0Var;
    }

    public static int T(int i2, C0095g c0095g) {
        int V = V(i2);
        int size = c0095g.size();
        return W(size) + size + V;
    }

    public static int U(String str) {
        int length;
        try {
            length = n0.a(str);
        } catch (m0 unused) {
            length = str.getBytes(AbstractC0112y.f1602a).length;
        }
        return W(length) + length;
    }

    public static int V(int i2) {
        return W(i2 << 3);
    }

    public static int W(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int X(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Override // a.AbstractC0086a
    public final void N(byte[] bArr, int i2, int i3) {
        b0(bArr, i2, i3);
    }

    public final void O(int i2) {
        int i3 = this.f1565h;
        int i4 = i3 + 1;
        this.f1565h = i4;
        byte[] bArr = this.f1563f;
        bArr[i3] = (byte) (i2 & 255);
        int i5 = i3 + 2;
        this.f1565h = i5;
        bArr[i4] = (byte) ((i2 >> 8) & 255);
        int i6 = i3 + 3;
        this.f1565h = i6;
        bArr[i5] = (byte) ((i2 >> 16) & 255);
        this.f1565h = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & 255);
    }

    public final void P(long j2) {
        int i2 = this.f1565h;
        int i3 = i2 + 1;
        this.f1565h = i3;
        byte[] bArr = this.f1563f;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f1565h = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f1565h = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f1565h = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f1565h = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
        int i8 = i2 + 6;
        this.f1565h = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
        int i9 = i2 + 7;
        this.f1565h = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
        this.f1565h = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
    }

    public final void Q(int i2, int i3) {
        R((i2 << 3) | i3);
    }

    public final void R(int i2) {
        boolean z2 = f1561k;
        byte[] bArr = this.f1563f;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f1565h;
                this.f1565h = i3 + 1;
                j0.j(bArr, i3, (byte) ((i2 | 128) & 255));
                i2 >>>= 7;
            }
            int i4 = this.f1565h;
            this.f1565h = i4 + 1;
            j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f1565h;
            this.f1565h = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & 255);
            i2 >>>= 7;
        }
        int i6 = this.f1565h;
        this.f1565h = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void S(long j2) {
        boolean z2 = f1561k;
        byte[] bArr = this.f1563f;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f1565h;
                this.f1565h = i2 + 1;
                j0.j(bArr, i2, (byte) ((((int) j2) | 128) & 255));
                j2 >>>= 7;
            }
            int i3 = this.f1565h;
            this.f1565h = i3 + 1;
            j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f1565h;
            this.f1565h = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & 255);
            j2 >>>= 7;
        }
        int i5 = this.f1565h;
        this.f1565h = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void Y() {
        this.f1566i.write(this.f1563f, 0, this.f1565h);
        this.f1565h = 0;
    }

    public final void Z(int i2) {
        if (this.f1564g - this.f1565h < i2) {
            Y();
        }
    }

    public final void a0(byte b2) {
        if (this.f1565h == this.f1564g) {
            Y();
        }
        int i2 = this.f1565h;
        this.f1565h = i2 + 1;
        this.f1563f[i2] = b2;
    }

    public final void b0(byte[] bArr, int i2, int i3) {
        int i4 = this.f1565h;
        int i5 = this.f1564g;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f1563f;
        if (i6 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f1565h += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f1565h = i5;
        Y();
        if (i8 > i5) {
            this.f1566i.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f1565h = i8;
        }
    }

    public final void c0(int i2, boolean z2) {
        Z(11);
        Q(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f1565h;
        this.f1565h = i3 + 1;
        this.f1563f[i3] = b2;
    }

    public final void d0(int i2, C0095g c0095g) {
        o0(i2, 2);
        e0(c0095g);
    }

    public final void e0(C0095g c0095g) {
        q0(c0095g.size());
        N(c0095g.f1528f, c0095g.e(), c0095g.size());
    }

    public final void f0(int i2, int i3) {
        Z(14);
        Q(i2, 5);
        O(i3);
    }

    public final void g0(int i2) {
        Z(4);
        O(i2);
    }

    public final void h0(long j2, int i2) {
        Z(18);
        Q(i2, 1);
        P(j2);
    }

    public final void i0(long j2) {
        Z(8);
        P(j2);
    }

    public final void j0(int i2, int i3) {
        Z(20);
        Q(i2, 0);
        if (i3 >= 0) {
            R(i3);
        } else {
            S(i3);
        }
    }

    public final void k0(int i2) {
        if (i2 >= 0) {
            q0(i2);
        } else {
            s0(i2);
        }
    }

    public final void l0(int i2, AbstractC0089a abstractC0089a, W w2) {
        o0(i2, 2);
        q0(abstractC0089a.a(w2));
        w2.b(abstractC0089a, this.f1562e);
    }

    public final void m0(String str, int i2) {
        o0(i2, 2);
        n0(str);
    }

    public final void n0(String str) {
        try {
            int length = str.length() * 3;
            int W2 = W(length);
            int i2 = W2 + length;
            int i3 = this.f1564g;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int q2 = n0.f1568a.q(str, bArr, 0, length);
                q0(q2);
                b0(bArr, 0, q2);
                return;
            }
            if (i2 > i3 - this.f1565h) {
                Y();
            }
            int W3 = W(str.length());
            int i4 = this.f1565h;
            byte[] bArr2 = this.f1563f;
            try {
                if (W3 == W2) {
                    int i5 = i4 + W3;
                    this.f1565h = i5;
                    int q3 = n0.f1568a.q(str, bArr2, i5, i3 - i5);
                    this.f1565h = i4;
                    R((q3 - i4) - W3);
                    this.f1565h = q3;
                } else {
                    int a2 = n0.a(str);
                    R(a2);
                    this.f1565h = n0.f1568a.q(str, bArr2, this.f1565h, a2);
                }
            } catch (m0 e2) {
                this.f1565h = i4;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new C0100l(e3);
            }
        } catch (m0 e4) {
            f1560j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0112y.f1602a);
            try {
                q0(bytes.length);
                N(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0100l(e5);
            }
        }
    }

    public final void o0(int i2, int i3) {
        q0((i2 << 3) | i3);
    }

    public final void p0(int i2, int i3) {
        Z(20);
        Q(i2, 0);
        R(i3);
    }

    public final void q0(int i2) {
        Z(5);
        R(i2);
    }

    public final void r0(long j2, int i2) {
        Z(20);
        Q(i2, 0);
        S(j2);
    }

    public final void s0(long j2) {
        Z(10);
        S(j2);
    }
}
