package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends a.a {

    /* renamed from: p, reason: collision with root package name */
    public static final Logger f725p = Logger.getLogger(m.class.getName());

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f726q = k1.f719e;

    /* renamed from: k, reason: collision with root package name */
    public g0 f727k;

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f728l;

    /* renamed from: m, reason: collision with root package name */
    public final int f729m;

    /* renamed from: n, reason: collision with root package name */
    public int f730n;

    /* renamed from: o, reason: collision with root package name */
    public final y3.u0 f731o;

    public m(y3.u0 u0Var, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i, 20);
        this.f728l = new byte[max];
        this.f729m = max;
        this.f731o = u0Var;
    }

    public static int J(int i, g gVar) {
        int L = L(i);
        int size = gVar.size();
        return M(size) + size + L;
    }

    public static int K(String str) {
        int length;
        try {
            length = n1.a(str);
        } catch (m1 unused) {
            length = str.getBytes(y.f794a).length;
        }
        return M(length) + length;
    }

    public static int L(int i) {
        return M(i << 3);
    }

    public static int M(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int N(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    @Override // a.a
    public final void D(byte[] bArr, int i, int i8) {
        R(bArr, i, i8);
    }

    public final void E(int i) {
        int i8 = this.f730n;
        int i9 = i8 + 1;
        this.f730n = i9;
        byte[] bArr = this.f728l;
        bArr[i8] = (byte) (i & 255);
        int i10 = i8 + 2;
        this.f730n = i10;
        bArr[i9] = (byte) ((i >> 8) & 255);
        int i11 = i8 + 3;
        this.f730n = i11;
        bArr[i10] = (byte) ((i >> 16) & 255);
        this.f730n = i8 + 4;
        bArr[i11] = (byte) ((i >> 24) & 255);
    }

    public final void F(long j7) {
        int i = this.f730n;
        int i8 = i + 1;
        this.f730n = i8;
        byte[] bArr = this.f728l;
        bArr[i] = (byte) (j7 & 255);
        int i9 = i + 2;
        this.f730n = i9;
        bArr[i8] = (byte) ((j7 >> 8) & 255);
        int i10 = i + 3;
        this.f730n = i10;
        bArr[i9] = (byte) ((j7 >> 16) & 255);
        int i11 = i + 4;
        this.f730n = i11;
        bArr[i10] = (byte) (255 & (j7 >> 24));
        int i12 = i + 5;
        this.f730n = i12;
        bArr[i11] = (byte) (((int) (j7 >> 32)) & 255);
        int i13 = i + 6;
        this.f730n = i13;
        bArr[i12] = (byte) (((int) (j7 >> 40)) & 255);
        int i14 = i + 7;
        this.f730n = i14;
        bArr[i13] = (byte) (((int) (j7 >> 48)) & 255);
        this.f730n = i + 8;
        bArr[i14] = (byte) (((int) (j7 >> 56)) & 255);
    }

    public final void G(int i, int i8) {
        H((i << 3) | i8);
    }

    public final void H(int i) {
        boolean z3 = f726q;
        byte[] bArr = this.f728l;
        if (z3) {
            while ((i & (-128)) != 0) {
                int i8 = this.f730n;
                this.f730n = i8 + 1;
                k1.j(bArr, i8, (byte) ((i | 128) & 255));
                i >>>= 7;
            }
            int i9 = this.f730n;
            this.f730n = i9 + 1;
            k1.j(bArr, i9, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i10 = this.f730n;
            this.f730n = i10 + 1;
            bArr[i10] = (byte) ((i | 128) & 255);
            i >>>= 7;
        }
        int i11 = this.f730n;
        this.f730n = i11 + 1;
        bArr[i11] = (byte) i;
    }

    public final void I(long j7) {
        boolean z3 = f726q;
        byte[] bArr = this.f728l;
        if (z3) {
            while ((j7 & (-128)) != 0) {
                int i = this.f730n;
                this.f730n = i + 1;
                k1.j(bArr, i, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            int i8 = this.f730n;
            this.f730n = i8 + 1;
            k1.j(bArr, i8, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            int i9 = this.f730n;
            this.f730n = i9 + 1;
            bArr[i9] = (byte) ((((int) j7) | 128) & 255);
            j7 >>>= 7;
        }
        int i10 = this.f730n;
        this.f730n = i10 + 1;
        bArr[i10] = (byte) j7;
    }

    public final void O() {
        this.f731o.write(this.f728l, 0, this.f730n);
        this.f730n = 0;
    }

    public final void P(int i) {
        if (this.f729m - this.f730n < i) {
            O();
        }
    }

    public final void Q(byte b8) {
        if (this.f730n == this.f729m) {
            O();
        }
        int i = this.f730n;
        this.f730n = i + 1;
        this.f728l[i] = b8;
    }

    public final void R(byte[] bArr, int i, int i8) {
        int i9 = this.f730n;
        int i10 = this.f729m;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f728l;
        if (i11 >= i8) {
            System.arraycopy(bArr, i, bArr2, i9, i8);
            this.f730n += i8;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i9, i11);
        int i12 = i + i11;
        int i13 = i8 - i11;
        this.f730n = i10;
        O();
        if (i13 > i10) {
            this.f731o.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f730n = i13;
        }
    }

    public final void S(int i, boolean z3) {
        P(11);
        G(i, 0);
        byte b8 = z3 ? (byte) 1 : (byte) 0;
        int i8 = this.f730n;
        this.f730n = i8 + 1;
        this.f728l[i8] = b8;
    }

    public final void T(int i, g gVar) {
        e0(i, 2);
        U(gVar);
    }

    public final void U(g gVar) {
        g0(gVar.size());
        D(gVar.f685e, gVar.f(), gVar.size());
    }

    public final void V(int i, int i8) {
        P(14);
        G(i, 5);
        E(i8);
    }

    public final void W(int i) {
        P(4);
        E(i);
    }

    public final void X(int i, long j7) {
        P(18);
        G(i, 1);
        F(j7);
    }

    public final void Y(long j7) {
        P(8);
        F(j7);
    }

    public final void Z(int i, int i8) {
        P(20);
        G(i, 0);
        if (i8 >= 0) {
            H(i8);
        } else {
            I(i8);
        }
    }

    public final void a0(int i) {
        if (i >= 0) {
            g0(i);
        } else {
            i0(i);
        }
    }

    public final void b0(int i, a aVar, x0 x0Var) {
        e0(i, 2);
        g0(aVar.a(x0Var));
        x0Var.b(aVar, this.f727k);
    }

    public final void c0(String str, int i) {
        e0(i, 2);
        d0(str);
    }

    public final void d0(String str) {
        try {
            int length = str.length() * 3;
            int M = M(length);
            int i = M + length;
            int i8 = this.f729m;
            if (i > i8) {
                byte[] bArr = new byte[length];
                int n6 = n1.f734a.n(str, bArr, 0, length);
                g0(n6);
                R(bArr, 0, n6);
                return;
            }
            if (i > i8 - this.f730n) {
                O();
            }
            int M2 = M(str.length());
            int i9 = this.f730n;
            byte[] bArr2 = this.f728l;
            try {
                try {
                    if (M2 == M) {
                        int i10 = i9 + M2;
                        this.f730n = i10;
                        int n7 = n1.f734a.n(str, bArr2, i10, i8 - i10);
                        this.f730n = i9;
                        H((n7 - i9) - M2);
                        this.f730n = n7;
                    } else {
                        int a8 = n1.a(str);
                        H(a8);
                        this.f730n = n1.f734a.n(str, bArr2, this.f730n, a8);
                    }
                } catch (ArrayIndexOutOfBoundsException e8) {
                    throw new l(e8);
                }
            } catch (m1 e9) {
                this.f730n = i9;
                throw e9;
            }
        } catch (m1 e10) {
            f725p.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(y.f794a);
            try {
                g0(bytes.length);
                D(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new l(e11);
            }
        }
    }

    public final void e0(int i, int i8) {
        g0((i << 3) | i8);
    }

    public final void f0(int i, int i8) {
        P(20);
        G(i, 0);
        H(i8);
    }

    public final void g0(int i) {
        P(5);
        H(i);
    }

    public final void h0(int i, long j7) {
        P(20);
        G(i, 0);
        I(j7);
    }

    public final void i0(long j7) {
        P(10);
        I(j7);
    }
}
