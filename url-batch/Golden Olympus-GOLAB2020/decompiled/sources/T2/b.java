package T2;

import Y2.g;
import Y2.m;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f9321a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f9322b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        g.a(iArr, iArr2, iArr3);
        if (g.q(iArr3, f9321a)) {
            m(iArr3);
        }
    }

    public static void b(int[] iArr, int[] iArr2) {
        m.r(8, iArr, iArr2);
        if (g.q(iArr2, f9321a)) {
            m(iArr2);
        }
    }

    private static int c(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) - 19;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            j5 = m.l(7, iArr, 1);
        }
        long j6 = j5 + (4294967295L & iArr[7]) + 2147483648L;
        iArr[7] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int[] d(BigInteger bigInteger) {
        int[] m4 = g.m(bigInteger);
        while (true) {
            int[] iArr = f9321a;
            if (!g.q(m4, iArr)) {
                return m4;
            }
            g.G(iArr, m4);
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h4 = g.h();
        g.w(iArr, iArr2, h4);
        h(h4, iArr3);
    }

    public static void f(int[] iArr, int[] iArr2, int[] iArr3) {
        g.A(iArr, iArr2, iArr3);
        if (m.p(16, iArr3, f9322b)) {
            l(iArr3);
        }
    }

    public static void g(int[] iArr, int[] iArr2) {
        if (g.t(iArr)) {
            g.J(iArr2);
        } else {
            g.F(f9321a, iArr, iArr2);
        }
    }

    public static void h(int[] iArr, int[] iArr2) {
        int i4 = iArr[7];
        m.C(8, iArr, 8, i4, iArr2, 0);
        int B4 = g.B(19, iArr, iArr2) << 1;
        int i5 = iArr2[7];
        iArr2[7] = (i5 & Integer.MAX_VALUE) + m.g(7, (B4 + ((i5 >>> 31) - (i4 >>> 31))) * 19, iArr2);
        if (g.q(iArr2, f9321a)) {
            m(iArr2);
        }
    }

    public static void i(int i4, int[] iArr) {
        int i5 = iArr[7];
        iArr[7] = (i5 & Integer.MAX_VALUE) + m.g(7, ((i4 << 1) | (i5 >>> 31)) * 19, iArr);
        if (g.q(iArr, f9321a)) {
            m(iArr);
        }
    }

    public static void j(int[] iArr, int[] iArr2) {
        int[] h4 = g.h();
        g.D(iArr, h4);
        h(h4, iArr2);
    }

    public static void k(int[] iArr, int i4, int[] iArr2) {
        int[] h4 = g.h();
        g.D(iArr, h4);
        h(h4, iArr2);
        while (true) {
            i4--;
            if (i4 <= 0) {
                return;
            }
            g.D(iArr2, h4);
            h(h4, iArr2);
        }
    }

    private static int l(int[] iArr) {
        int[] iArr2 = f9322b;
        long j4 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            j5 = m.l(8, iArr, 1);
        }
        long j6 = j5 + (iArr[8] & 4294967295L) + 19;
        iArr[8] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            j7 = m.s(15, iArr, 9);
        }
        long j8 = j7 + ((iArr[15] & 4294967295L) - (4294967295L & (iArr2[15] + 1)));
        iArr[15] = (int) j8;
        return (int) (j8 >> 32);
    }

    private static int m(int[] iArr) {
        long j4 = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j4;
        long j5 = j4 >> 32;
        if (j5 != 0) {
            j5 = m.s(7, iArr, 1);
        }
        long j6 = j5 + ((4294967295L & iArr[7]) - 2147483648L);
        iArr[7] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static void n(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g.F(iArr, iArr2, iArr3) != 0) {
            c(iArr3);
        }
    }

    public static void o(int[] iArr, int[] iArr2) {
        m.D(8, iArr, 0, iArr2);
        if (g.q(iArr2, f9321a)) {
            m(iArr2);
        }
    }
}
