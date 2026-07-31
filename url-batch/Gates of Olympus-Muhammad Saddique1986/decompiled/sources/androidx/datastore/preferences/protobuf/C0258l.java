package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258l extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f5097h = Logger.getLogger(C0258l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f5098i = s0.f5128e;

    /* renamed from: c, reason: collision with root package name */
    public H f5099c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5100d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5101e;

    /* renamed from: f, reason: collision with root package name */
    public int f5102f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f5103g;

    public C0258l(OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f5100d = new byte[max];
        this.f5101e = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5103g = outputStream;
    }

    public static int A(long j3, int i3) {
        return H((j3 >> 63) ^ (j3 << 1)) + D(i3);
    }

    public static int B(String str, int i3) {
        return C(str) + D(i3);
    }

    public static int C(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(AbstractC0269x.f5135a).length;
        }
        return F(length) + length;
    }

    public static int D(int i3) {
        return F(i3 << 3);
    }

    public static int E(int i3, int i4) {
        return F(i4) + D(i3);
    }

    public static int F(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int G(long j3, int i3) {
        return H(j3) + D(i3);
    }

    public static int H(long j3) {
        int i3;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i3 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public static int l(int i3) {
        return D(i3) + 1;
    }

    public static int m(int i3, C0253g c0253g) {
        return n(c0253g) + D(i3);
    }

    public static int n(C0253g c0253g) {
        int size = c0253g.size();
        return F(size) + size;
    }

    public static int o(int i3) {
        return D(i3) + 8;
    }

    public static int p(int i3, int i4) {
        return v(i4) + D(i3);
    }

    public static int q(int i3) {
        return D(i3) + 4;
    }

    public static int r(int i3) {
        return D(i3) + 8;
    }

    public static int s(int i3) {
        return D(i3) + 4;
    }

    public static int t(int i3, AbstractC0245a abstractC0245a, Z z3) {
        return abstractC0245a.a(z3) + (D(i3) * 2);
    }

    public static int u(int i3, int i4) {
        return v(i4) + D(i3);
    }

    public static int v(int i3) {
        if (i3 >= 0) {
            return F(i3);
        }
        return 10;
    }

    public static int w(long j3, int i3) {
        return H(j3) + D(i3);
    }

    public static int x(int i3) {
        return D(i3) + 4;
    }

    public static int y(int i3) {
        return D(i3) + 8;
    }

    public static int z(int i3, int i4) {
        return F((i4 >> 31) ^ (i4 << 1)) + D(i3);
    }

    public final void I() {
        this.f5103g.write(this.f5100d, 0, this.f5102f);
        this.f5102f = 0;
    }

    public final void J(int i3) {
        if (this.f5101e - this.f5102f < i3) {
            I();
        }
    }

    public final void K(byte b3) {
        if (this.f5102f == this.f5101e) {
            I();
        }
        int i3 = this.f5102f;
        this.f5102f = i3 + 1;
        this.f5100d[i3] = b3;
    }

    public final void L(byte[] bArr, int i3, int i4) {
        int i5 = this.f5102f;
        int i6 = this.f5101e;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f5100d;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f5102f += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f5102f = i6;
        I();
        if (i9 > i6) {
            this.f5103g.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f5102f = i9;
        }
    }

    public final void M(int i3, boolean z3) {
        J(11);
        i(i3, 0);
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        int i4 = this.f5102f;
        this.f5102f = i4 + 1;
        this.f5100d[i4] = b3;
    }

    public final void N(int i3, C0253g c0253g) {
        X(i3, 2);
        O(c0253g);
    }

    public final void O(C0253g c0253g) {
        Z(c0253g.size());
        f(c0253g.f5067e, c0253g.j(), c0253g.size());
    }

    public final void P(int i3, int i4) {
        J(14);
        i(i3, 5);
        g(i4);
    }

    public final void Q(int i3) {
        J(4);
        g(i3);
    }

    public final void R(long j3, int i3) {
        J(18);
        i(i3, 1);
        h(j3);
    }

    public final void S(long j3) {
        J(8);
        h(j3);
    }

    public final void T(int i3, int i4) {
        J(20);
        i(i3, 0);
        if (i4 >= 0) {
            j(i4);
        } else {
            k(i4);
        }
    }

    public final void U(int i3) {
        if (i3 >= 0) {
            Z(i3);
        } else {
            b0(i3);
        }
    }

    public final void V(String str, int i3) {
        X(i3, 2);
        W(str);
    }

    public final void W(String str) {
        try {
            int length = str.length() * 3;
            int F3 = F(length);
            int i3 = F3 + length;
            int i4 = this.f5101e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int b3 = v0.f5134a.b(str, bArr, 0, length);
                Z(b3);
                L(bArr, 0, b3);
                return;
            }
            if (i3 > i4 - this.f5102f) {
                I();
            }
            int F4 = F(str.length());
            int i5 = this.f5102f;
            byte[] bArr2 = this.f5100d;
            try {
                if (F4 == F3) {
                    int i6 = i5 + F4;
                    this.f5102f = i6;
                    int b4 = v0.f5134a.b(str, bArr2, i6, i4 - i6);
                    this.f5102f = i5;
                    j((b4 - i5) - F4);
                    this.f5102f = b4;
                } else {
                    int b5 = v0.b(str);
                    j(b5);
                    this.f5102f = v0.f5134a.b(str, bArr2, this.f5102f, b5);
                }
            } catch (u0 e3) {
                this.f5102f = i5;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new C0257k(e4);
            }
        } catch (u0 e5) {
            f5097h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC0269x.f5135a);
            try {
                Z(bytes.length);
                f(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e6) {
                throw new C0257k(e6);
            }
        }
    }

    public final void X(int i3, int i4) {
        Z((i3 << 3) | i4);
    }

    public final void Y(int i3, int i4) {
        J(20);
        i(i3, 0);
        j(i4);
    }

    public final void Z(int i3) {
        J(5);
        j(i3);
    }

    public final void a0(long j3, int i3) {
        J(20);
        i(i3, 0);
        k(j3);
    }

    public final void b0(long j3) {
        J(10);
        k(j3);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void f(byte[] bArr, int i3, int i4) {
        L(bArr, i3, i4);
    }

    public final void g(int i3) {
        int i4 = this.f5102f;
        int i5 = i4 + 1;
        this.f5102f = i5;
        byte[] bArr = this.f5100d;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f5102f = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f5102f = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f5102f = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void h(long j3) {
        int i3 = this.f5102f;
        int i4 = i3 + 1;
        this.f5102f = i4;
        byte[] bArr = this.f5100d;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f5102f = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f5102f = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f5102f = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f5102f = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f5102f = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f5102f = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f5102f = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void i(int i3, int i4) {
        j((i3 << 3) | i4);
    }

    public final void j(int i3) {
        boolean z3 = f5098i;
        byte[] bArr = this.f5100d;
        if (z3) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f5102f;
                this.f5102f = i4 + 1;
                s0.n(bArr, i4, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            int i5 = this.f5102f;
            this.f5102f = i5 + 1;
            s0.n(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f5102f;
            this.f5102f = i6 + 1;
            bArr[i6] = (byte) ((i3 & 127) | 128);
            i3 >>>= 7;
        }
        int i7 = this.f5102f;
        this.f5102f = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void k(long j3) {
        boolean z3 = f5098i;
        byte[] bArr = this.f5100d;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f5102f;
                this.f5102f = i3 + 1;
                s0.n(bArr, i3, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            int i4 = this.f5102f;
            this.f5102f = i4 + 1;
            s0.n(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f5102f;
            this.f5102f = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        int i6 = this.f5102f;
        this.f5102f = i6 + 1;
        bArr[i6] = (byte) j3;
    }
}
