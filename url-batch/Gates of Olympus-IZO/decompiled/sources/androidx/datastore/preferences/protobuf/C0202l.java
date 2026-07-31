package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202l extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f3896h = Logger.getLogger(C0202l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f3897i = s0.f3927e;

    /* renamed from: c, reason: collision with root package name */
    public H f3898c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3900e;

    /* renamed from: f, reason: collision with root package name */
    public int f3901f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f3902g;

    public C0202l(OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f3899d = new byte[max];
        this.f3900e = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f3902g = outputStream;
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
            length = str.getBytes(AbstractC0213x.f3934a).length;
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

    public static int m(int i3, C0197g c0197g) {
        return n(c0197g) + D(i3);
    }

    public static int n(C0197g c0197g) {
        int size = c0197g.size();
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

    public static int t(int i3, AbstractC0189a abstractC0189a, Z z3) {
        return abstractC0189a.a(z3) + (D(i3) * 2);
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
        this.f3902g.write(this.f3899d, 0, this.f3901f);
        this.f3901f = 0;
    }

    public final void J(int i3) {
        if (this.f3900e - this.f3901f < i3) {
            I();
        }
    }

    public final void K(byte b2) {
        if (this.f3901f == this.f3900e) {
            I();
        }
        int i3 = this.f3901f;
        this.f3901f = i3 + 1;
        this.f3899d[i3] = b2;
    }

    public final void L(byte[] bArr, int i3, int i4) {
        int i5 = this.f3901f;
        int i6 = this.f3900e;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f3899d;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f3901f += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f3901f = i6;
        I();
        if (i9 > i6) {
            this.f3902g.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f3901f = i9;
        }
    }

    public final void M(int i3, boolean z3) {
        J(11);
        i(i3, 0);
        byte b2 = z3 ? (byte) 1 : (byte) 0;
        int i4 = this.f3901f;
        this.f3901f = i4 + 1;
        this.f3899d[i4] = b2;
    }

    public final void N(int i3, C0197g c0197g) {
        X(i3, 2);
        O(c0197g);
    }

    public final void O(C0197g c0197g) {
        Z(c0197g.size());
        f(c0197g.f3866e, c0197g.j(), c0197g.size());
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
            int i4 = this.f3900e;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int b2 = v0.f3933a.b(str, bArr, 0, length);
                Z(b2);
                L(bArr, 0, b2);
                return;
            }
            if (i3 > i4 - this.f3901f) {
                I();
            }
            int F4 = F(str.length());
            int i5 = this.f3901f;
            byte[] bArr2 = this.f3899d;
            try {
                if (F4 == F3) {
                    int i6 = i5 + F4;
                    this.f3901f = i6;
                    int b3 = v0.f3933a.b(str, bArr2, i6, i4 - i6);
                    this.f3901f = i5;
                    j((b3 - i5) - F4);
                    this.f3901f = b3;
                } else {
                    int b4 = v0.b(str);
                    j(b4);
                    this.f3901f = v0.f3933a.b(str, bArr2, this.f3901f, b4);
                }
            } catch (u0 e3) {
                this.f3901f = i5;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e4) {
                throw new C0201k(e4);
            }
        } catch (u0 e5) {
            f3896h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC0213x.f3934a);
            try {
                Z(bytes.length);
                f(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e6) {
                throw new C0201k(e6);
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
        int i4 = this.f3901f;
        int i5 = i4 + 1;
        this.f3901f = i5;
        byte[] bArr = this.f3899d;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f3901f = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f3901f = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f3901f = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void h(long j3) {
        int i3 = this.f3901f;
        int i4 = i3 + 1;
        this.f3901f = i4;
        byte[] bArr = this.f3899d;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f3901f = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f3901f = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f3901f = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f3901f = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f3901f = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f3901f = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f3901f = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void i(int i3, int i4) {
        j((i3 << 3) | i4);
    }

    public final void j(int i3) {
        boolean z3 = f3897i;
        byte[] bArr = this.f3899d;
        if (z3) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f3901f;
                this.f3901f = i4 + 1;
                s0.n(bArr, i4, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            int i5 = this.f3901f;
            this.f3901f = i5 + 1;
            s0.n(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f3901f;
            this.f3901f = i6 + 1;
            bArr[i6] = (byte) ((i3 & 127) | 128);
            i3 >>>= 7;
        }
        int i7 = this.f3901f;
        this.f3901f = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void k(long j3) {
        boolean z3 = f3897i;
        byte[] bArr = this.f3899d;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f3901f;
                this.f3901f = i3 + 1;
                s0.n(bArr, i3, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            int i4 = this.f3901f;
            this.f3901f = i4 + 1;
            s0.n(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f3901f;
            this.f3901f = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        int i6 = this.f3901f;
        this.f3901f = i6 + 1;
        bArr[i6] = (byte) j3;
    }
}
