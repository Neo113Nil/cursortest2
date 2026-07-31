package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class b74 {

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f3274a = new dr2(32);

    /* renamed from: b, reason: collision with root package name */
    private a74 f3275b;

    /* renamed from: c, reason: collision with root package name */
    private a74 f3276c;

    /* renamed from: d, reason: collision with root package name */
    private a74 f3277d;

    /* renamed from: e, reason: collision with root package name */
    private long f3278e;

    /* renamed from: f, reason: collision with root package name */
    private final g94 f3279f;

    public b74(g94 g94Var, byte[] bArr) {
        this.f3279f = g94Var;
        a74 a74Var = new a74(0L, 65536);
        this.f3275b = a74Var;
        this.f3276c = a74Var;
        this.f3277d = a74Var;
    }

    private final int i(int i7) {
        a74 a74Var = this.f3277d;
        if (!a74Var.f2662c) {
            s84 b7 = this.f3279f.b();
            a74 a74Var2 = new a74(this.f3277d.f2661b, 65536);
            a74Var.f2663d = b7;
            a74Var.f2664e = a74Var2;
            a74Var.f2662c = true;
        }
        return Math.min(i7, (int) (this.f3277d.f2661b - this.f3278e));
    }

    private static a74 j(a74 a74Var, long j7) {
        while (j7 >= a74Var.f2661b) {
            a74Var = a74Var.f2664e;
        }
        return a74Var;
    }

    private static a74 k(a74 a74Var, long j7, ByteBuffer byteBuffer, int i7) {
        a74 j8 = j(a74Var, j7);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (j8.f2661b - j7));
            byteBuffer.put(j8.f2663d.f11734a, j8.a(j7), min);
            i7 -= min;
            j7 += min;
            if (j7 == j8.f2661b) {
                j8 = j8.f2664e;
            }
        }
        return j8;
    }

    private static a74 l(a74 a74Var, long j7, byte[] bArr, int i7) {
        a74 j8 = j(a74Var, j7);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (j8.f2661b - j7));
            System.arraycopy(j8.f2663d.f11734a, j8.a(j7), bArr, i7 - i8, min);
            i8 -= min;
            j7 += min;
            if (j7 == j8.f2661b) {
                j8 = j8.f2664e;
            }
        }
        return j8;
    }

    private static a74 m(a74 a74Var, z51 z51Var, d74 d74Var, dr2 dr2Var) {
        a74 a74Var2;
        int i7;
        if (z51Var.k()) {
            long j7 = d74Var.f4106b;
            dr2Var.c(1);
            a74 l7 = l(a74Var, j7, dr2Var.h(), 1);
            long j8 = j7 + 1;
            byte b7 = dr2Var.h()[0];
            int i8 = b7 & 128;
            int i9 = b7 & Byte.MAX_VALUE;
            v21 v21Var = z51Var.f14951b;
            byte[] bArr = v21Var.f13081a;
            if (bArr == null) {
                v21Var.f13081a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            a74Var2 = l(l7, j8, v21Var.f13081a, i9);
            long j9 = j8 + i9;
            if (i8 != 0) {
                dr2Var.c(2);
                a74Var2 = l(a74Var2, j9, dr2Var.h(), 2);
                j9 += 2;
                i7 = dr2Var.w();
            } else {
                i7 = 1;
            }
            int[] iArr = v21Var.f13084d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = v21Var.f13085e;
            if (iArr3 == null || iArr3.length < i7) {
                iArr3 = new int[i7];
            }
            int[] iArr4 = iArr3;
            if (i8 != 0) {
                int i10 = i7 * 6;
                dr2Var.c(i10);
                a74Var2 = l(a74Var2, j9, dr2Var.h(), i10);
                j9 += i10;
                dr2Var.f(0);
                for (int i11 = 0; i11 < i7; i11++) {
                    iArr2[i11] = dr2Var.w();
                    iArr4[i11] = dr2Var.v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = d74Var.f4105a - ((int) (j9 - d74Var.f4106b));
            }
            sd4 sd4Var = d74Var.f4107c;
            int i12 = n13.f8865a;
            v21Var.c(i7, iArr2, iArr4, sd4Var.f11791b, v21Var.f13081a, sd4Var.f11790a, sd4Var.f11792c, sd4Var.f11793d);
            long j10 = d74Var.f4106b;
            int i13 = (int) (j9 - j10);
            d74Var.f4106b = j10 + i13;
            d74Var.f4105a -= i13;
        } else {
            a74Var2 = a74Var;
        }
        if (!z51Var.e()) {
            z51Var.i(d74Var.f4105a);
            return k(a74Var2, d74Var.f4106b, z51Var.f14952c, d74Var.f4105a);
        }
        dr2Var.c(4);
        a74 l8 = l(a74Var2, d74Var.f4106b, dr2Var.h(), 4);
        int v6 = dr2Var.v();
        d74Var.f4106b += 4;
        d74Var.f4105a -= 4;
        z51Var.i(v6);
        a74 k7 = k(l8, d74Var.f4106b, z51Var.f14952c, v6);
        d74Var.f4106b += v6;
        int i14 = d74Var.f4105a - v6;
        d74Var.f4105a = i14;
        ByteBuffer byteBuffer = z51Var.f14955f;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            z51Var.f14955f = ByteBuffer.allocate(i14);
        } else {
            z51Var.f14955f.clear();
        }
        return k(k7, d74Var.f4106b, z51Var.f14955f, d74Var.f4105a);
    }

    private final void n(int i7) {
        long j7 = this.f3278e + i7;
        this.f3278e = j7;
        a74 a74Var = this.f3277d;
        if (j7 == a74Var.f2661b) {
            this.f3277d = a74Var.f2664e;
        }
    }

    public final int a(fc1 fc1Var, int i7, boolean z6) {
        int i8 = i(i7);
        a74 a74Var = this.f3277d;
        int a7 = fc1Var.a(a74Var.f2663d.f11734a, a74Var.a(this.f3278e), i8);
        if (a7 != -1) {
            n(a7);
            return a7;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.f3278e;
    }

    public final void c(long j7) {
        a74 a74Var;
        if (j7 != -1) {
            while (true) {
                a74Var = this.f3275b;
                if (j7 < a74Var.f2661b) {
                    break;
                }
                this.f3279f.c(a74Var.f2663d);
                this.f3275b = this.f3275b.b();
            }
            if (this.f3276c.f2660a < a74Var.f2660a) {
                this.f3276c = a74Var;
            }
        }
    }

    public final void d(z51 z51Var, d74 d74Var) {
        m(this.f3276c, z51Var, d74Var, this.f3274a);
    }

    public final void e(z51 z51Var, d74 d74Var) {
        this.f3276c = m(this.f3276c, z51Var, d74Var, this.f3274a);
    }

    public final void f() {
        a74 a74Var = this.f3275b;
        if (a74Var.f2662c) {
            a74 a74Var2 = this.f3277d;
            boolean z6 = a74Var2.f2662c;
            int i7 = (z6 ? 1 : 0) + (((int) (a74Var2.f2660a - a74Var.f2660a)) / 65536);
            s84[] s84VarArr = new s84[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                s84VarArr[i8] = a74Var.f2663d;
                a74Var = a74Var.b();
            }
            this.f3279f.d(s84VarArr);
        }
        a74 a74Var3 = new a74(0L, 65536);
        this.f3275b = a74Var3;
        this.f3276c = a74Var3;
        this.f3277d = a74Var3;
        this.f3278e = 0L;
        this.f3279f.g();
    }

    public final void g() {
        this.f3276c = this.f3275b;
    }

    public final void h(dr2 dr2Var, int i7) {
        while (i7 > 0) {
            int i8 = i(i7);
            a74 a74Var = this.f3277d;
            dr2Var.b(a74Var.f2663d.f11734a, a74Var.a(this.f3278e), i8);
            i7 -= i8;
            n(i8);
        }
    }
}
