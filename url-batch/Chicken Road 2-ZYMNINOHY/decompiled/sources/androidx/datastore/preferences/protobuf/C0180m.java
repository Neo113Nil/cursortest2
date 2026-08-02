package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180m extends O3.d {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f4670f = Logger.getLogger(C0180m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f4671g = j0.f4662e;

    /* renamed from: a, reason: collision with root package name */
    public F f4672a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4674c;

    /* renamed from: d, reason: collision with root package name */
    public int f4675d;

    /* renamed from: e, reason: collision with root package name */
    public final K.j0 f4676e;

    public C0180m(K.j0 j0Var, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i4, 20);
        this.f4673b = new byte[max];
        this.f4674c = max;
        this.f4676e = j0Var;
    }

    public static int Y(int i4, C0174g c0174g) {
        int a02 = a0(i4);
        int size = c0174g.size();
        return b0(size) + size + a02;
    }

    public static int Z(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0191y.f4712a).length;
        }
        return b0(length) + length;
    }

    public static int a0(int i4) {
        return b0(i4 << 3);
    }

    public static int b0(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int c0(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Override // O3.d
    public final void J(byte[] bArr, int i4, int i5) {
        g0(bArr, i4, i5);
    }

    public final void T(int i4) {
        int i5 = this.f4675d;
        int i6 = i5 + 1;
        this.f4675d = i6;
        byte b4 = (byte) (i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f4673b;
        bArr[i5] = b4;
        int i7 = i5 + 2;
        this.f4675d = i7;
        bArr[i6] = (byte) ((i4 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i5 + 3;
        this.f4675d = i8;
        bArr[i7] = (byte) ((i4 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f4675d = i5 + 4;
        bArr[i8] = (byte) ((i4 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void U(long j4) {
        int i4 = this.f4675d;
        int i5 = i4 + 1;
        this.f4675d = i5;
        byte[] bArr = this.f4673b;
        bArr[i4] = (byte) (j4 & 255);
        int i6 = i4 + 2;
        this.f4675d = i6;
        bArr[i5] = (byte) ((j4 >> 8) & 255);
        int i7 = i4 + 3;
        this.f4675d = i7;
        bArr[i6] = (byte) ((j4 >> 16) & 255);
        int i8 = i4 + 4;
        this.f4675d = i8;
        bArr[i7] = (byte) (255 & (j4 >> 24));
        int i9 = i4 + 5;
        this.f4675d = i9;
        bArr[i8] = (byte) (((int) (j4 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i4 + 6;
        this.f4675d = i10;
        bArr[i9] = (byte) (((int) (j4 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i11 = i4 + 7;
        this.f4675d = i11;
        bArr[i10] = (byte) (((int) (j4 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f4675d = i4 + 8;
        bArr[i11] = (byte) (((int) (j4 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void V(int i4, int i5) {
        W((i4 << 3) | i5);
    }

    public final void W(int i4) {
        boolean z = f4671g;
        byte[] bArr = this.f4673b;
        if (z) {
            while ((i4 & (-128)) != 0) {
                int i5 = this.f4675d;
                this.f4675d = i5 + 1;
                j0.j(bArr, i5, (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i4 >>>= 7;
            }
            int i6 = this.f4675d;
            this.f4675d = i6 + 1;
            j0.j(bArr, i6, (byte) i4);
            return;
        }
        while ((i4 & (-128)) != 0) {
            int i7 = this.f4675d;
            this.f4675d = i7 + 1;
            bArr[i7] = (byte) ((i4 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i4 >>>= 7;
        }
        int i8 = this.f4675d;
        this.f4675d = i8 + 1;
        bArr[i8] = (byte) i4;
    }

    public final void X(long j4) {
        boolean z = f4671g;
        byte[] bArr = this.f4673b;
        if (z) {
            while ((j4 & (-128)) != 0) {
                int i4 = this.f4675d;
                this.f4675d = i4 + 1;
                j0.j(bArr, i4, (byte) ((((int) j4) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j4 >>>= 7;
            }
            int i5 = this.f4675d;
            this.f4675d = i5 + 1;
            j0.j(bArr, i5, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            int i6 = this.f4675d;
            this.f4675d = i6 + 1;
            bArr[i6] = (byte) ((((int) j4) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j4 >>>= 7;
        }
        int i7 = this.f4675d;
        this.f4675d = i7 + 1;
        bArr[i7] = (byte) j4;
    }

    public final void d0() {
        this.f4676e.write(this.f4673b, 0, this.f4675d);
        this.f4675d = 0;
    }

    public final void e0(int i4) {
        if (this.f4674c - this.f4675d < i4) {
            d0();
        }
    }

    public final void f0(byte b4) {
        if (this.f4675d == this.f4674c) {
            d0();
        }
        int i4 = this.f4675d;
        this.f4675d = i4 + 1;
        this.f4673b[i4] = b4;
    }

    public final void g0(byte[] bArr, int i4, int i5) {
        int i6 = this.f4675d;
        int i7 = this.f4674c;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4673b;
        if (i8 >= i5) {
            System.arraycopy(bArr, i4, bArr2, i6, i5);
            this.f4675d += i5;
            return;
        }
        System.arraycopy(bArr, i4, bArr2, i6, i8);
        int i9 = i4 + i8;
        int i10 = i5 - i8;
        this.f4675d = i7;
        d0();
        if (i10 > i7) {
            this.f4676e.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4675d = i10;
        }
    }

    public final void h0(int i4, boolean z) {
        e0(11);
        V(i4, 0);
        byte b4 = z ? (byte) 1 : (byte) 0;
        int i5 = this.f4675d;
        this.f4675d = i5 + 1;
        this.f4673b[i5] = b4;
    }

    public final void i0(int i4, C0174g c0174g) {
        t0(i4, 2);
        j0(c0174g);
    }

    public final void j0(C0174g c0174g) {
        v0(c0174g.size());
        J(c0174g.f4638b, c0174g.f(), c0174g.size());
    }

    public final void k0(int i4, int i5) {
        e0(14);
        V(i4, 5);
        T(i5);
    }

    public final void l0(int i4) {
        e0(4);
        T(i4);
    }

    public final void m0(int i4, long j4) {
        e0(18);
        V(i4, 1);
        U(j4);
    }

    public final void n0(long j4) {
        e0(8);
        U(j4);
    }

    public final void o0(int i4, int i5) {
        e0(20);
        V(i4, 0);
        if (i5 >= 0) {
            W(i5);
        } else {
            X(i5);
        }
    }

    public final void p0(int i4) {
        if (i4 >= 0) {
            v0(i4);
        } else {
            x0(i4);
        }
    }

    public final void q0(int i4, AbstractC0168a abstractC0168a, W w4) {
        t0(i4, 2);
        v0(abstractC0168a.a(w4));
        w4.b(abstractC0168a, this.f4672a);
    }

    public final void r0(int i4, String str) {
        t0(i4, 2);
        s0(str);
    }

    public final void s0(String str) {
        try {
            int length = str.length() * 3;
            int b02 = b0(length);
            int i4 = b02 + length;
            int i5 = this.f4674c;
            if (i4 > i5) {
                byte[] bArr = new byte[length];
                int m4 = m0.f4677a.m(str, bArr, 0, length);
                v0(m4);
                g0(bArr, 0, m4);
                return;
            }
            if (i4 > i5 - this.f4675d) {
                d0();
            }
            int b03 = b0(str.length());
            int i6 = this.f4675d;
            byte[] bArr2 = this.f4673b;
            try {
                try {
                    if (b03 == b02) {
                        int i7 = i6 + b03;
                        this.f4675d = i7;
                        int m5 = m0.f4677a.m(str, bArr2, i7, i5 - i7);
                        this.f4675d = i6;
                        W((m5 - i6) - b03);
                        this.f4675d = m5;
                    } else {
                        int a3 = m0.a(str);
                        W(a3);
                        this.f4675d = m0.f4677a.m(str, bArr2, this.f4675d, a3);
                    }
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new C0179l(e4);
                }
            } catch (l0 e5) {
                this.f4675d = i6;
                throw e5;
            }
        } catch (l0 e6) {
            f4670f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
            byte[] bytes = str.getBytes(AbstractC0191y.f4712a);
            try {
                v0(bytes.length);
                J(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e7) {
                throw new C0179l(e7);
            }
        }
    }

    public final void t0(int i4, int i5) {
        v0((i4 << 3) | i5);
    }

    public final void u0(int i4, int i5) {
        e0(20);
        V(i4, 0);
        W(i5);
    }

    public final void v0(int i4) {
        e0(5);
        W(i4);
    }

    public final void w0(int i4, long j4) {
        e0(20);
        V(i4, 0);
        X(j4);
    }

    public final void x0(long j4) {
        e0(10);
        X(j4);
    }
}
