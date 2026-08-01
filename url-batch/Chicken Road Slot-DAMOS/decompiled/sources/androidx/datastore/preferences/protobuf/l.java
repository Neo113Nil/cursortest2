package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f577f = Logger.getLogger(l.class.getName());
    public static final boolean g = j1.f572e;

    /* renamed from: a, reason: collision with root package name */
    public f0 f578a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f580c;

    /* renamed from: d, reason: collision with root package name */
    public int f581d;

    /* renamed from: e, reason: collision with root package name */
    public final x3.v0 f582e;

    public l(x3.v0 v0Var, int i3) {
        if (i3 < 0) {
            te.a1.e("bufferSize must be >= 0");
            throw null;
        }
        int max = Math.max(i3, 20);
        this.f579b = new byte[max];
        this.f580c = max;
        this.f582e = v0Var;
    }

    public static int f(int i3, f fVar) {
        int h10 = h(i3);
        int size = fVar.size();
        return i(size) + size + h10;
    }

    public static int g(String str) {
        int length;
        try {
            length = m1.a(str);
        } catch (l1 unused) {
            length = str.getBytes(x.f647a).length;
        }
        return i(length) + length;
    }

    public static int h(int i3) {
        return i(i3 << 3);
    }

    public static int i(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public final void A(String str) {
        try {
            int length = str.length() * 3;
            int i3 = i(length);
            int i10 = i3 + length;
            int i11 = this.f580c;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int w6 = m1.f585a.w(str, bArr, 0, length);
                D(w6);
                n(bArr, 0, w6);
                return;
            }
            if (i10 > i11 - this.f581d) {
                k();
            }
            int i12 = i(str.length());
            int i13 = this.f581d;
            byte[] bArr2 = this.f579b;
            try {
                if (i12 == i3) {
                    int i14 = i13 + i12;
                    this.f581d = i14;
                    int w10 = m1.f585a.w(str, bArr2, i14, i11 - i14);
                    this.f581d = i13;
                    d((w10 - i13) - i12);
                    this.f581d = w10;
                } else {
                    int a9 = m1.a(str);
                    d(a9);
                    this.f581d = m1.f585a.w(str, bArr2, this.f581d, a9);
                }
            } catch (l1 e2) {
                this.f581d = i13;
                throw e2;
            } catch (ArrayIndexOutOfBoundsException e9) {
                throw new k(e9);
            }
        } catch (l1 e10) {
            f577f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(x.f647a);
            try {
                D(bytes.length);
                x(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e11) {
                throw new k(e11);
            }
        }
    }

    public final void B(int i3, int i10) {
        D((i3 << 3) | i10);
    }

    public final void C(int i3, int i10) {
        l(20);
        c(i3, 0);
        d(i10);
    }

    public final void D(int i3) {
        l(5);
        d(i3);
    }

    public final void E(int i3, long j) {
        l(20);
        c(i3, 0);
        e(j);
    }

    public final void F(long j) {
        l(10);
        e(j);
    }

    public final void a(int i3) {
        int i10 = this.f581d;
        int i11 = i10 + 1;
        this.f581d = i11;
        byte[] bArr = this.f579b;
        bArr[i10] = (byte) (i3 & 255);
        int i12 = i10 + 2;
        this.f581d = i12;
        bArr[i11] = (byte) ((i3 >> 8) & 255);
        int i13 = i10 + 3;
        this.f581d = i13;
        bArr[i12] = (byte) ((i3 >> 16) & 255);
        this.f581d = i10 + 4;
        bArr[i13] = (byte) ((i3 >> 24) & 255);
    }

    public final void b(long j) {
        int i3 = this.f581d;
        int i10 = i3 + 1;
        this.f581d = i10;
        byte[] bArr = this.f579b;
        bArr[i3] = (byte) (j & 255);
        int i11 = i3 + 2;
        this.f581d = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i3 + 3;
        this.f581d = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i3 + 4;
        this.f581d = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i3 + 5;
        this.f581d = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i3 + 6;
        this.f581d = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i3 + 7;
        this.f581d = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f581d = i3 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void c(int i3, int i10) {
        d((i3 << 3) | i10);
    }

    public final void d(int i3) {
        boolean z10 = g;
        byte[] bArr = this.f579b;
        if (z10) {
            while (true) {
                int i10 = i3 & (-128);
                int i11 = this.f581d;
                if (i10 == 0) {
                    this.f581d = i11 + 1;
                    j1.j(bArr, i11, (byte) i3);
                    return;
                } else {
                    this.f581d = i11 + 1;
                    j1.j(bArr, i11, (byte) ((i3 | 128) & 255));
                    i3 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i12 = i3 & (-128);
                int i13 = this.f581d;
                if (i12 == 0) {
                    this.f581d = i13 + 1;
                    bArr[i13] = (byte) i3;
                    return;
                } else {
                    this.f581d = i13 + 1;
                    bArr[i13] = (byte) ((i3 | 128) & 255);
                    i3 >>>= 7;
                }
            }
        }
    }

    public final void e(long j) {
        boolean z10 = g;
        byte[] bArr = this.f579b;
        if (z10) {
            while (true) {
                long j3 = j & (-128);
                int i3 = this.f581d;
                if (j3 == 0) {
                    this.f581d = i3 + 1;
                    j1.j(bArr, i3, (byte) j);
                    return;
                } else {
                    this.f581d = i3 + 1;
                    j1.j(bArr, i3, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
            }
        } else {
            while (true) {
                long j10 = j & (-128);
                int i10 = this.f581d;
                if (j10 == 0) {
                    this.f581d = i10 + 1;
                    bArr[i10] = (byte) j;
                    return;
                } else {
                    this.f581d = i10 + 1;
                    bArr[i10] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                }
            }
        }
    }

    public final void k() {
        this.f582e.write(this.f579b, 0, this.f581d);
        this.f581d = 0;
    }

    public final void l(int i3) {
        if (this.f580c - this.f581d < i3) {
            k();
        }
    }

    public final void m(byte b10) {
        if (this.f581d == this.f580c) {
            k();
        }
        int i3 = this.f581d;
        this.f581d = i3 + 1;
        this.f579b[i3] = b10;
    }

    public final void n(byte[] bArr, int i3, int i10) {
        int i11 = this.f581d;
        int i12 = this.f580c;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f579b;
        if (i13 >= i10) {
            System.arraycopy(bArr, i3, bArr2, i11, i10);
            this.f581d += i10;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i11, i13);
        int i14 = i3 + i13;
        int i15 = i10 - i13;
        this.f581d = i12;
        k();
        if (i15 > i12) {
            this.f582e.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f581d = i15;
        }
    }

    public final void o(int i3, boolean z10) {
        l(11);
        c(i3, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        int i10 = this.f581d;
        this.f581d = i10 + 1;
        this.f579b[i10] = b10;
    }

    public final void p(int i3, f fVar) {
        B(i3, 2);
        q(fVar);
    }

    public final void q(f fVar) {
        D(fVar.size());
        x(fVar.f536e, fVar.g(), fVar.size());
    }

    public final void r(int i3, int i10) {
        l(14);
        c(i3, 5);
        a(i10);
    }

    public final void s(int i3) {
        l(4);
        a(i3);
    }

    public final void t(int i3, long j) {
        l(18);
        c(i3, 1);
        b(j);
    }

    public final void u(long j) {
        l(8);
        b(j);
    }

    public final void v(int i3, int i10) {
        l(20);
        c(i3, 0);
        if (i10 >= 0) {
            d(i10);
        } else {
            e(i10);
        }
    }

    public final void w(int i3) {
        if (i3 >= 0) {
            D(i3);
        } else {
            F(i3);
        }
    }

    public final void x(byte[] bArr, int i3, int i10) {
        n(bArr, i3, i10);
    }

    public final void y(int i3, a aVar, w0 w0Var) {
        B(i3, 2);
        D(aVar.a(w0Var));
        w0Var.b(aVar, this.f578a);
    }

    public final void z(int i3, String str) {
        B(i3, 2);
        A(str);
    }
}
