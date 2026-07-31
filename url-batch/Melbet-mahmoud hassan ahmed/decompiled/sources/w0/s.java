package w0;

import c4.w0;
import o2.m0;
import r0.n2;

/* loaded from: classes.dex */
public final class s {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f22962a;
    }

    private static boolean a(o2.a0 a0Var, v vVar, int i7) {
        int j7 = j(a0Var, i7);
        return j7 != -1 && j7 <= vVar.f22967b;
    }

    private static boolean b(o2.a0 a0Var, int i7) {
        return a0Var.C() == m0.u(a0Var.d(), i7, a0Var.e() - 1, 0);
    }

    private static boolean c(o2.a0 a0Var, v vVar, boolean z6, a aVar) {
        try {
            long J = a0Var.J();
            if (!z6) {
                J *= vVar.f22967b;
            }
            aVar.f22962a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(o2.a0 a0Var, v vVar, int i7, a aVar) {
        int e7 = a0Var.e();
        long E = a0Var.E();
        long j7 = E >>> 16;
        if (j7 != i7) {
            return false;
        }
        return g((int) (15 & (E >> 4)), vVar) && f((int) ((E >> 1) & 7), vVar) && !(((E & 1) > 1L ? 1 : ((E & 1) == 1L ? 0 : -1)) == 0) && c(a0Var, vVar, ((j7 & 1) > 1L ? 1 : ((j7 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(a0Var, vVar, (int) ((E >> 12) & 15)) && e(a0Var, vVar, (int) ((E >> 8) & 15)) && b(a0Var, e7);
    }

    private static boolean e(o2.a0 a0Var, v vVar, int i7) {
        int i8 = vVar.f22970e;
        if (i7 == 0) {
            return true;
        }
        if (i7 <= 11) {
            return i7 == vVar.f22971f;
        }
        if (i7 == 12) {
            return a0Var.C() * 1000 == i8;
        }
        if (i7 > 14) {
            return false;
        }
        int I = a0Var.I();
        if (i7 == 14) {
            I *= 10;
        }
        return I == i8;
    }

    private static boolean f(int i7, v vVar) {
        return i7 == 0 || i7 == vVar.f22974i;
    }

    private static boolean g(int i7, v vVar) {
        return i7 <= 7 ? i7 == vVar.f22972g - 1 : i7 <= 10 && vVar.f22972g == 2;
    }

    public static boolean h(m mVar, v vVar, int i7, a aVar) {
        long m7 = mVar.m();
        byte[] bArr = new byte[2];
        mVar.n(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i7) {
            mVar.h();
            mVar.o((int) (m7 - mVar.p()));
            return false;
        }
        o2.a0 a0Var = new o2.a0(16);
        System.arraycopy(bArr, 0, a0Var.d(), 0, 2);
        a0Var.N(o.c(mVar, a0Var.d(), 2, 14));
        mVar.h();
        mVar.o((int) (m7 - mVar.p()));
        return d(a0Var, vVar, i7, aVar);
    }

    public static long i(m mVar, v vVar) {
        mVar.h();
        mVar.o(1);
        byte[] bArr = new byte[1];
        mVar.n(bArr, 0, 1);
        boolean z6 = (bArr[0] & 1) == 1;
        mVar.o(2);
        int i7 = z6 ? 7 : 6;
        o2.a0 a0Var = new o2.a0(i7);
        a0Var.N(o.c(mVar, a0Var.d(), 0, i7));
        mVar.h();
        a aVar = new a();
        if (c(a0Var, vVar, z6, aVar)) {
            return aVar.f22962a;
        }
        throw n2.a(null, null);
    }

    public static int j(o2.a0 a0Var, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return a0Var.C() + 1;
            case w0.f2149o /* 7 */:
                return a0Var.I() + 1;
            case w0.f2150p /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }
}
