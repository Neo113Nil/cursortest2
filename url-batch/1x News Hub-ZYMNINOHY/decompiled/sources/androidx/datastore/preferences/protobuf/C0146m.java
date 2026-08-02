package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146m extends S0.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Logger f2326n = Logger.getLogger(C0146m.class.getName());
    public static final boolean o = j0.f2319e;

    /* renamed from: i, reason: collision with root package name */
    public F f2327i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f2328j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2329k;

    /* renamed from: l, reason: collision with root package name */
    public int f2330l;

    /* renamed from: m, reason: collision with root package name */
    public final K.k0 f2331m;

    public C0146m(K.k0 k0Var, int i3) {
        super(12);
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f2328j = new byte[max];
        this.f2329k = max;
        this.f2331m = k0Var;
    }

    public static int V(int i3, C0140g c0140g) {
        int X2 = X(i3);
        int size = c0140g.size();
        return Y(size) + size + X2;
    }

    public static int W(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0157y.f2364a).length;
        }
        return Y(length) + length;
    }

    public static int X(int i3) {
        return Y(i3 << 3);
    }

    public static int Y(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int Z(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    @Override // S0.a
    public final void P(byte[] bArr, int i3, int i4) {
        d0(bArr, i3, i4);
    }

    public final void Q(int i3) {
        int i4 = this.f2330l;
        int i5 = i4 + 1;
        this.f2330l = i5;
        byte b3 = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f2328j;
        bArr[i4] = b3;
        int i6 = i4 + 2;
        this.f2330l = i6;
        bArr[i5] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i4 + 3;
        this.f2330l = i7;
        bArr[i6] = (byte) ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2330l = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void R(long j3) {
        int i3 = this.f2330l;
        int i4 = i3 + 1;
        this.f2330l = i4;
        byte[] bArr = this.f2328j;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f2330l = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f2330l = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f2330l = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f2330l = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i3 + 6;
        this.f2330l = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i3 + 7;
        this.f2330l = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2330l = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void S(int i3, int i4) {
        T((i3 << 3) | i4);
    }

    public final void T(int i3) {
        boolean z = o;
        byte[] bArr = this.f2328j;
        if (z) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f2330l;
                this.f2330l = i4 + 1;
                j0.j(bArr, i4, (byte) ((i3 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i3 >>>= 7;
            }
            int i5 = this.f2330l;
            this.f2330l = i5 + 1;
            j0.j(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f2330l;
            this.f2330l = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i3 >>>= 7;
        }
        int i7 = this.f2330l;
        this.f2330l = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void U(long j3) {
        boolean z = o;
        byte[] bArr = this.f2328j;
        if (z) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f2330l;
                this.f2330l = i3 + 1;
                j0.j(bArr, i3, (byte) ((((int) j3) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j3 >>>= 7;
            }
            int i4 = this.f2330l;
            this.f2330l = i4 + 1;
            j0.j(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f2330l;
            this.f2330l = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j3 >>>= 7;
        }
        int i6 = this.f2330l;
        this.f2330l = i6 + 1;
        bArr[i6] = (byte) j3;
    }

    public final void a0() {
        this.f2331m.write(this.f2328j, 0, this.f2330l);
        this.f2330l = 0;
    }

    public final void b0(int i3) {
        if (this.f2329k - this.f2330l < i3) {
            a0();
        }
    }

    public final void c0(byte b3) {
        if (this.f2330l == this.f2329k) {
            a0();
        }
        int i3 = this.f2330l;
        this.f2330l = i3 + 1;
        this.f2328j[i3] = b3;
    }

    public final void d0(byte[] bArr, int i3, int i4) {
        int i5 = this.f2330l;
        int i6 = this.f2329k;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f2328j;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f2330l += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f2330l = i6;
        a0();
        if (i9 > i6) {
            this.f2331m.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f2330l = i9;
        }
    }

    public final void e0(int i3, boolean z) {
        b0(11);
        S(i3, 0);
        byte b3 = z ? (byte) 1 : (byte) 0;
        int i4 = this.f2330l;
        this.f2330l = i4 + 1;
        this.f2328j[i4] = b3;
    }

    public final void f0(int i3, C0140g c0140g) {
        q0(i3, 2);
        g0(c0140g);
    }

    public final void g0(C0140g c0140g) {
        s0(c0140g.size());
        P(c0140g.f2297b, c0140g.f(), c0140g.size());
    }

    public final void h0(int i3, int i4) {
        b0(14);
        S(i3, 5);
        Q(i4);
    }

    public final void i0(int i3) {
        b0(4);
        Q(i3);
    }

    public final void j0(int i3, long j3) {
        b0(18);
        S(i3, 1);
        R(j3);
    }

    public final void k0(long j3) {
        b0(8);
        R(j3);
    }

    public final void l0(int i3, int i4) {
        b0(20);
        S(i3, 0);
        if (i4 >= 0) {
            T(i4);
        } else {
            U(i4);
        }
    }

    public final void m0(int i3) {
        if (i3 >= 0) {
            s0(i3);
        } else {
            u0(i3);
        }
    }

    public final void n0(int i3, AbstractC0134a abstractC0134a, W w3) {
        q0(i3, 2);
        s0(abstractC0134a.a(w3));
        w3.b(abstractC0134a, this.f2327i);
    }

    public final void o0(int i3, String str) {
        q0(i3, 2);
        p0(str);
    }

    public final void p0(String str) {
        try {
            int length = str.length() * 3;
            int Y2 = Y(length);
            int i3 = Y2 + length;
            int i4 = this.f2329k;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int m3 = m0.f2332a.m(str, bArr, 0, length);
                s0(m3);
                d0(bArr, 0, m3);
                return;
            }
            if (i3 > i4 - this.f2330l) {
                a0();
            }
            int Y3 = Y(str.length());
            int i5 = this.f2330l;
            byte[] bArr2 = this.f2328j;
            try {
                try {
                    if (Y3 == Y2) {
                        int i6 = i5 + Y3;
                        this.f2330l = i6;
                        int m4 = m0.f2332a.m(str, bArr2, i6, i4 - i6);
                        this.f2330l = i5;
                        T((m4 - i5) - Y3);
                        this.f2330l = m4;
                    } else {
                        int a3 = m0.a(str);
                        T(a3);
                        this.f2330l = m0.f2332a.m(str, bArr2, this.f2330l, a3);
                    }
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new C0145l(e3);
                }
            } catch (l0 e4) {
                this.f2330l = i5;
                throw e4;
            }
        } catch (l0 e5) {
            f2326n.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC0157y.f2364a);
            try {
                s0(bytes.length);
                P(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e6) {
                throw new C0145l(e6);
            }
        }
    }

    public final void q0(int i3, int i4) {
        s0((i3 << 3) | i4);
    }

    public final void r0(int i3, int i4) {
        b0(20);
        S(i3, 0);
        T(i4);
    }

    public final void s0(int i3) {
        b0(5);
        T(i3);
    }

    public final void t0(int i3, long j3) {
        b0(20);
        S(i3, 0);
        U(j3);
    }

    public final void u0(long j3) {
        b0(10);
        U(j3);
    }
}
