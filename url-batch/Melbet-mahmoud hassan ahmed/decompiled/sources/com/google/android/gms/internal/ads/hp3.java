package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class hp3 extends ho3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f6376b = Logger.getLogger(hp3.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f6377c = gt3.a();

    /* renamed from: a, reason: collision with root package name */
    ip3 f6378a;

    private hp3() {
    }

    /* synthetic */ hp3(gp3 gp3Var) {
    }

    public static int A(qq3 qq3Var) {
        int a7 = qq3Var.a();
        return a(a7) + a7;
    }

    static int B(kr3 kr3Var, es3 es3Var) {
        bo3 bo3Var = (bo3) kr3Var;
        int j7 = bo3Var.j();
        if (j7 == -1) {
            j7 = es3Var.c(bo3Var);
            bo3Var.l(j7);
        }
        return a(j7) + j7;
    }

    public static int C(String str) {
        int length;
        try {
            length = lt3.e(str);
        } catch (kt3 unused) {
            length = str.getBytes(kq3.f7586b).length;
        }
        return a(length) + length;
    }

    public static int D(int i7) {
        return a(i7 << 3);
    }

    public static int a(int i7) {
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

    public static int b(long j7) {
        int i7;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i7 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static hp3 c(byte[] bArr) {
        return new ep3(bArr, 0, bArr.length);
    }

    public static int x(uo3 uo3Var) {
        int q7 = uo3Var.q();
        return a(q7) + q7;
    }

    @Deprecated
    static int y(int i7, kr3 kr3Var, es3 es3Var) {
        int a7 = a(i7 << 3);
        int i8 = a7 + a7;
        bo3 bo3Var = (bo3) kr3Var;
        int j7 = bo3Var.j();
        if (j7 == -1) {
            j7 = es3Var.c(bo3Var);
            bo3Var.l(j7);
        }
        return i8 + j7;
    }

    public static int z(int i7) {
        if (i7 >= 0) {
            return a(i7);
        }
        return 10;
    }

    public final void d() {
        if (g() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void e(String str, kt3 kt3Var) {
        f6376b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) kt3Var);
        byte[] bytes = str.getBytes(kq3.f7586b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (fp3 e7) {
            throw e7;
        } catch (IndexOutOfBoundsException e8) {
            throw new fp3(e8);
        }
    }

    public abstract int g();

    public abstract void h(byte b7);

    public abstract void i(int i7, boolean z6);

    public abstract void j(int i7, uo3 uo3Var);

    public abstract void k(int i7, int i8);

    public abstract void l(int i7);

    public abstract void m(int i7, long j7);

    public abstract void n(long j7);

    public abstract void o(int i7, int i8);

    public abstract void p(int i7);

    public abstract void q(byte[] bArr, int i7, int i8);

    public abstract void r(int i7, String str);

    public abstract void s(int i7, int i8);

    public abstract void t(int i7, int i8);

    public abstract void u(int i7);

    public abstract void v(int i7, long j7);

    public abstract void w(long j7);
}
