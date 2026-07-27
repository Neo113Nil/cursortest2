package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447l extends e0 {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f5371h = Logger.getLogger(C0447l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f5372i = s0.f5402e;

    /* renamed from: c, reason: collision with root package name */
    public H f5373c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5374d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5375e;

    /* renamed from: f, reason: collision with root package name */
    public int f5376f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f5377g;

    public C0447l(OutputStream outputStream, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f5374d = new byte[max];
        this.f5375e = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5377g = outputStream;
    }

    public static int A(long j4, int i2) {
        return H((j4 >> 63) ^ (j4 << 1)) + D(i2);
    }

    public static int B(int i2, String str) {
        return C(str) + D(i2);
    }

    public static int C(String str) {
        int length;
        try {
            length = v0.b(str);
        } catch (u0 unused) {
            length = str.getBytes(AbstractC0458x.f5409a).length;
        }
        return F(length) + length;
    }

    public static int D(int i2) {
        return F(i2 << 3);
    }

    public static int E(int i2, int i4) {
        return F(i4) + D(i2);
    }

    public static int F(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int G(long j4, int i2) {
        return H(j4) + D(i2);
    }

    public static int H(long j4) {
        int i2;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i2 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int l(int i2) {
        return D(i2) + 1;
    }

    public static int m(int i2, C0442g c0442g) {
        return n(c0442g) + D(i2);
    }

    public static int n(C0442g c0442g) {
        int size = c0442g.size();
        return F(size) + size;
    }

    public static int o(int i2) {
        return D(i2) + 8;
    }

    public static int p(int i2, int i4) {
        return v(i4) + D(i2);
    }

    public static int q(int i2) {
        return D(i2) + 4;
    }

    public static int r(int i2) {
        return D(i2) + 8;
    }

    public static int s(int i2) {
        return D(i2) + 4;
    }

    public static int t(int i2, AbstractC0434a abstractC0434a, Z z4) {
        return abstractC0434a.a(z4) + (D(i2) * 2);
    }

    public static int u(int i2, int i4) {
        return v(i4) + D(i2);
    }

    public static int v(int i2) {
        if (i2 >= 0) {
            return F(i2);
        }
        return 10;
    }

    public static int w(long j4, int i2) {
        return H(j4) + D(i2);
    }

    public static int x(int i2) {
        return D(i2) + 4;
    }

    public static int y(int i2) {
        return D(i2) + 8;
    }

    public static int z(int i2, int i4) {
        return F((i4 >> 31) ^ (i4 << 1)) + D(i2);
    }

    public final void I() {
        this.f5377g.write(this.f5374d, 0, this.f5376f);
        this.f5376f = 0;
    }

    public final void J(int i2) {
        if (this.f5375e - this.f5376f < i2) {
            I();
        }
    }

    public final void K(byte b4) {
        if (this.f5376f == this.f5375e) {
            I();
        }
        int i2 = this.f5376f;
        this.f5376f = i2 + 1;
        this.f5374d[i2] = b4;
    }

    public final void L(byte[] bArr, int i2, int i4) {
        int i5 = this.f5376f;
        int i6 = this.f5375e;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f5374d;
        if (i7 >= i4) {
            System.arraycopy(bArr, i2, bArr2, i5, i4);
            this.f5376f += i4;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i5, i7);
        int i8 = i2 + i7;
        int i9 = i4 - i7;
        this.f5376f = i6;
        I();
        if (i9 > i6) {
            this.f5377g.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f5376f = i9;
        }
    }

    public final void M(int i2, boolean z4) {
        J(11);
        i(i2, 0);
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        int i4 = this.f5376f;
        this.f5376f = i4 + 1;
        this.f5374d[i4] = b4;
    }

    public final void N(int i2, C0442g c0442g) {
        X(i2, 2);
        O(c0442g);
    }

    public final void O(C0442g c0442g) {
        Z(c0442g.size());
        f(c0442g.f5341e, c0442g.w(), c0442g.size());
    }

    public final void P(int i2, int i4) {
        J(14);
        i(i2, 5);
        g(i4);
    }

    public final void Q(int i2) {
        J(4);
        g(i2);
    }

    public final void R(long j4, int i2) {
        J(18);
        i(i2, 1);
        h(j4);
    }

    public final void S(long j4) {
        J(8);
        h(j4);
    }

    public final void T(int i2, int i4) {
        J(20);
        i(i2, 0);
        if (i4 >= 0) {
            j(i4);
        } else {
            k(i4);
        }
    }

    public final void U(int i2) {
        if (i2 >= 0) {
            Z(i2);
        } else {
            b0(i2);
        }
    }

    public final void V(int i2, String str) {
        X(i2, 2);
        W(str);
    }

    public final void W(String str) {
        try {
            int length = str.length() * 3;
            int F3 = F(length);
            int i2 = F3 + length;
            int i4 = this.f5375e;
            if (i2 > i4) {
                byte[] bArr = new byte[length];
                int b4 = v0.f5408a.b(str, bArr, 0, length);
                Z(b4);
                L(bArr, 0, b4);
                return;
            }
            if (i2 > i4 - this.f5376f) {
                I();
            }
            int F4 = F(str.length());
            int i5 = this.f5376f;
            byte[] bArr2 = this.f5374d;
            try {
                if (F4 == F3) {
                    int i6 = i5 + F4;
                    this.f5376f = i6;
                    int b5 = v0.f5408a.b(str, bArr2, i6, i4 - i6);
                    this.f5376f = i5;
                    j((b5 - i5) - F4);
                    this.f5376f = b5;
                } else {
                    int b6 = v0.b(str);
                    j(b6);
                    this.f5376f = v0.f5408a.b(str, bArr2, this.f5376f, b6);
                }
            } catch (u0 e4) {
                this.f5376f = i5;
                throw e4;
            } catch (ArrayIndexOutOfBoundsException e5) {
                throw new C0446k(e5);
            }
        } catch (u0 e6) {
            f5371h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(AbstractC0458x.f5409a);
            try {
                Z(bytes.length);
                f(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new C0446k(e7);
            }
        }
    }

    public final void X(int i2, int i4) {
        Z((i2 << 3) | i4);
    }

    public final void Y(int i2, int i4) {
        J(20);
        i(i2, 0);
        j(i4);
    }

    public final void Z(int i2) {
        J(5);
        j(i2);
    }

    public final void a0(long j4, int i2) {
        J(20);
        i(i2, 0);
        k(j4);
    }

    public final void b0(long j4) {
        J(10);
        k(j4);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final void f(byte[] bArr, int i2, int i4) {
        L(bArr, i2, i4);
    }

    public final void g(int i2) {
        int i4 = this.f5376f;
        int i5 = i4 + 1;
        this.f5376f = i5;
        byte[] bArr = this.f5374d;
        bArr[i4] = (byte) (i2 & 255);
        int i6 = i4 + 2;
        this.f5376f = i6;
        bArr[i5] = (byte) ((i2 >> 8) & 255);
        int i7 = i4 + 3;
        this.f5376f = i7;
        bArr[i6] = (byte) ((i2 >> 16) & 255);
        this.f5376f = i4 + 4;
        bArr[i7] = (byte) ((i2 >> 24) & 255);
    }

    public final void h(long j4) {
        int i2 = this.f5376f;
        int i4 = i2 + 1;
        this.f5376f = i4;
        byte[] bArr = this.f5374d;
        bArr[i2] = (byte) (j4 & 255);
        int i5 = i2 + 2;
        this.f5376f = i5;
        bArr[i4] = (byte) ((j4 >> 8) & 255);
        int i6 = i2 + 3;
        this.f5376f = i6;
        bArr[i5] = (byte) ((j4 >> 16) & 255);
        int i7 = i2 + 4;
        this.f5376f = i7;
        bArr[i6] = (byte) (255 & (j4 >> 24));
        int i8 = i2 + 5;
        this.f5376f = i8;
        bArr[i7] = (byte) (((int) (j4 >> 32)) & 255);
        int i9 = i2 + 6;
        this.f5376f = i9;
        bArr[i8] = (byte) (((int) (j4 >> 40)) & 255);
        int i10 = i2 + 7;
        this.f5376f = i10;
        bArr[i9] = (byte) (((int) (j4 >> 48)) & 255);
        this.f5376f = i2 + 8;
        bArr[i10] = (byte) (((int) (j4 >> 56)) & 255);
    }

    public final void i(int i2, int i4) {
        j((i2 << 3) | i4);
    }

    public final void j(int i2) {
        boolean z4 = f5372i;
        byte[] bArr = this.f5374d;
        if (!z4) {
            while ((i2 & (-128)) != 0) {
                int i4 = this.f5376f;
                this.f5376f = i4 + 1;
                bArr[i4] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            }
            int i5 = this.f5376f;
            this.f5376f = i5 + 1;
            bArr[i5] = (byte) i2;
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i6 = this.f5376f;
            this.f5376f = i6 + 1;
            s0.n(bArr, (byte) ((i2 & 127) | 128), i6);
            i2 >>>= 7;
        }
        int i7 = this.f5376f;
        this.f5376f = i7 + 1;
        s0.n(bArr, (byte) i2, i7);
    }

    public final void k(long j4) {
        boolean z4 = f5372i;
        byte[] bArr = this.f5374d;
        if (!z4) {
            while ((j4 & (-128)) != 0) {
                int i2 = this.f5376f;
                this.f5376f = i2 + 1;
                bArr[i2] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            }
            int i4 = this.f5376f;
            this.f5376f = i4 + 1;
            bArr[i4] = (byte) j4;
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i5 = this.f5376f;
            this.f5376f = i5 + 1;
            s0.n(bArr, (byte) ((((int) j4) & 127) | 128), i5);
            j4 >>>= 7;
        }
        int i6 = this.f5376f;
        this.f5376f = i6 + 1;
        s0.n(bArr, (byte) j4, i6);
    }
}
