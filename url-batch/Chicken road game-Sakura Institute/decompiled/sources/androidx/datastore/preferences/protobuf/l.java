package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends d1 {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f855h = Logger.getLogger(l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f856i = r1.f905e;

    /* renamed from: c, reason: collision with root package name */
    public h0 f857c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f858d;

    /* renamed from: e, reason: collision with root package name */
    public final int f859e;

    /* renamed from: f, reason: collision with root package name */
    public int f860f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f861g;

    public l(OutputStream outputStream, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i7, 20);
        this.f858d = new byte[max];
        this.f859e = max;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f861g = outputStream;
    }

    public static int l(int i7, g gVar) {
        return m(gVar) + s(i7);
    }

    public static int m(g gVar) {
        int size = gVar.size();
        return t(size) + size;
    }

    public static int n(int i7) {
        return s(i7) + 4;
    }

    public static int o(int i7) {
        return s(i7) + 8;
    }

    public static int p(int i7, a aVar, y0 y0Var) {
        return aVar.a(y0Var) + (s(i7) * 2);
    }

    public static int q(int i7) {
        if (i7 >= 0) {
            return t(i7);
        }
        return 10;
    }

    public static int r(String str) {
        int length;
        try {
            length = u1.b(str);
        } catch (t1 unused) {
            length = str.getBytes(x.f922a).length;
        }
        return t(length) + length;
    }

    public static int s(int i7) {
        return t(i7 << 3);
    }

    public static int t(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int u(long j8) {
        int i7;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j8) != 0) {
            i7 += 2;
            j8 >>>= 14;
        }
        return (j8 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public final void A(int i7, g gVar) {
        L(i7, 2);
        B(gVar);
    }

    public final void B(g gVar) {
        N(gVar.size());
        f(gVar.f819g, gVar.x(), gVar.size());
    }

    public final void C(int i7, int i8) {
        w(14);
        i(i7, 5);
        g(i8);
    }

    public final void D(int i7) {
        w(4);
        g(i7);
    }

    public final void E(long j8, int i7) {
        w(18);
        i(i7, 1);
        h(j8);
    }

    public final void F(long j8) {
        w(8);
        h(j8);
    }

    public final void G(int i7, int i8) {
        w(20);
        i(i7, 0);
        if (i8 >= 0) {
            j(i8);
        } else {
            k(i8);
        }
    }

    public final void H(int i7) {
        if (i7 >= 0) {
            N(i7);
        } else {
            P(i7);
        }
    }

    public final void I(int i7, a aVar, y0 y0Var) {
        L(i7, 2);
        N(aVar.a(y0Var));
        y0Var.c(aVar, this.f857c);
    }

    public final void J(String str, int i7) {
        L(i7, 2);
        K(str);
    }

    public final void K(String str) {
        try {
            int length = str.length() * 3;
            int t2 = t(length);
            int i7 = t2 + length;
            int i8 = this.f859e;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int b9 = u1.f915a.b(str, bArr, 0, length);
                N(b9);
                y(bArr, 0, b9);
                return;
            }
            if (i7 > i8 - this.f860f) {
                v();
            }
            int t8 = t(str.length());
            int i9 = this.f860f;
            byte[] bArr2 = this.f858d;
            try {
                if (t8 == t2) {
                    int i10 = i9 + t8;
                    this.f860f = i10;
                    int b10 = u1.f915a.b(str, bArr2, i10, i8 - i10);
                    this.f860f = i9;
                    j((b10 - i9) - t8);
                    this.f860f = b10;
                } else {
                    int b11 = u1.b(str);
                    j(b11);
                    this.f860f = u1.f915a.b(str, bArr2, this.f860f, b11);
                }
            } catch (t1 e9) {
                this.f860f = i9;
                throw e9;
            } catch (ArrayIndexOutOfBoundsException e10) {
                throw new k(e10);
            }
        } catch (t1 e11) {
            f855h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e11);
            byte[] bytes = str.getBytes(x.f922a);
            try {
                N(bytes.length);
                f(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e12) {
                throw new k(e12);
            }
        }
    }

    public final void L(int i7, int i8) {
        N((i7 << 3) | i8);
    }

    public final void M(int i7, int i8) {
        w(20);
        i(i7, 0);
        j(i8);
    }

    public final void N(int i7) {
        w(5);
        j(i7);
    }

    public final void O(long j8, int i7) {
        w(20);
        i(i7, 0);
        k(j8);
    }

    public final void P(long j8) {
        w(10);
        k(j8);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void f(byte[] bArr, int i7, int i8) {
        y(bArr, i7, i8);
    }

    public final void g(int i7) {
        int i8 = this.f860f;
        int i9 = i8 + 1;
        this.f860f = i9;
        byte[] bArr = this.f858d;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f860f = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f860f = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f860f = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void h(long j8) {
        int i7 = this.f860f;
        int i8 = i7 + 1;
        this.f860f = i8;
        byte[] bArr = this.f858d;
        bArr[i7] = (byte) (j8 & 255);
        int i9 = i7 + 2;
        this.f860f = i9;
        bArr[i8] = (byte) ((j8 >> 8) & 255);
        int i10 = i7 + 3;
        this.f860f = i10;
        bArr[i9] = (byte) ((j8 >> 16) & 255);
        int i11 = i7 + 4;
        this.f860f = i11;
        bArr[i10] = (byte) (255 & (j8 >> 24));
        int i12 = i7 + 5;
        this.f860f = i12;
        bArr[i11] = (byte) (((int) (j8 >> 32)) & 255);
        int i13 = i7 + 6;
        this.f860f = i13;
        bArr[i12] = (byte) (((int) (j8 >> 40)) & 255);
        int i14 = i7 + 7;
        this.f860f = i14;
        bArr[i13] = (byte) (((int) (j8 >> 48)) & 255);
        this.f860f = i7 + 8;
        bArr[i14] = (byte) (((int) (j8 >> 56)) & 255);
    }

    public final void i(int i7, int i8) {
        j((i7 << 3) | i8);
    }

    public final void j(int i7) {
        boolean z8 = f856i;
        byte[] bArr = this.f858d;
        if (z8) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f860f;
                this.f860f = i8 + 1;
                r1.k(bArr, i8, (byte) ((i7 & 127) | 128));
                i7 >>>= 7;
            }
            int i9 = this.f860f;
            this.f860f = i9 + 1;
            r1.k(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f860f;
            this.f860f = i10 + 1;
            bArr[i10] = (byte) ((i7 & 127) | 128);
            i7 >>>= 7;
        }
        int i11 = this.f860f;
        this.f860f = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void k(long j8) {
        boolean z8 = f856i;
        byte[] bArr = this.f858d;
        if (z8) {
            while ((j8 & (-128)) != 0) {
                int i7 = this.f860f;
                this.f860f = i7 + 1;
                r1.k(bArr, i7, (byte) ((((int) j8) & 127) | 128));
                j8 >>>= 7;
            }
            int i8 = this.f860f;
            this.f860f = i8 + 1;
            r1.k(bArr, i8, (byte) j8);
            return;
        }
        while ((j8 & (-128)) != 0) {
            int i9 = this.f860f;
            this.f860f = i9 + 1;
            bArr[i9] = (byte) ((((int) j8) & 127) | 128);
            j8 >>>= 7;
        }
        int i10 = this.f860f;
        this.f860f = i10 + 1;
        bArr[i10] = (byte) j8;
    }

    public final void v() {
        this.f861g.write(this.f858d, 0, this.f860f);
        this.f860f = 0;
    }

    public final void w(int i7) {
        if (this.f859e - this.f860f < i7) {
            v();
        }
    }

    public final void x(byte b9) {
        if (this.f860f == this.f859e) {
            v();
        }
        int i7 = this.f860f;
        this.f860f = i7 + 1;
        this.f858d[i7] = b9;
    }

    public final void y(byte[] bArr, int i7, int i8) {
        int i9 = this.f860f;
        int i10 = this.f859e;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f858d;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f860f += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f860f = i10;
        v();
        if (i13 > i10) {
            this.f861g.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f860f = i13;
        }
    }

    public final void z(int i7, boolean z8) {
        w(11);
        i(i7, 0);
        byte b9 = z8 ? (byte) 1 : (byte) 0;
        int i8 = this.f860f;
        this.f860f = i8 + 1;
        this.f858d[i8] = b9;
    }
}
