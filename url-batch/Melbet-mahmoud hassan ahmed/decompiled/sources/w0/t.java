package w0;

import java.util.Arrays;
import java.util.List;
import r0.n2;
import w0.v;

/* loaded from: classes.dex */
public final class t {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public v f22963a;

        public a(v vVar) {
            this.f22963a = vVar;
        }
    }

    public static boolean a(m mVar) {
        o2.a0 a0Var = new o2.a0(4);
        mVar.n(a0Var.d(), 0, 4);
        return a0Var.E() == 1716281667;
    }

    public static int b(m mVar) {
        mVar.h();
        o2.a0 a0Var = new o2.a0(2);
        mVar.n(a0Var.d(), 0, 2);
        int I = a0Var.I();
        int i7 = I >> 2;
        mVar.h();
        if (i7 == 16382) {
            return I;
        }
        throw n2.a("First frame does not start with sync code.", null);
    }

    public static j1.a c(m mVar, boolean z6) {
        j1.a a7 = new y().a(mVar, z6 ? null : o1.h.f19668b);
        if (a7 == null || a7.h() == 0) {
            return null;
        }
        return a7;
    }

    public static j1.a d(m mVar, boolean z6) {
        mVar.h();
        long m7 = mVar.m();
        j1.a c7 = c(mVar, z6);
        mVar.i((int) (mVar.m() - m7));
        return c7;
    }

    public static boolean e(m mVar, a aVar) {
        v a7;
        mVar.h();
        o2.z zVar = new o2.z(new byte[4]);
        mVar.n(zVar.f19836a, 0, 4);
        boolean g7 = zVar.g();
        int h7 = zVar.h(7);
        int h8 = zVar.h(24) + 4;
        if (h7 == 0) {
            a7 = h(mVar);
        } else {
            v vVar = aVar.f22963a;
            if (vVar == null) {
                throw new IllegalArgumentException();
            }
            if (h7 == 3) {
                a7 = vVar.b(g(mVar, h8));
            } else if (h7 == 4) {
                a7 = vVar.c(j(mVar, h8));
            } else {
                if (h7 != 6) {
                    mVar.i(h8);
                    return g7;
                }
                o2.a0 a0Var = new o2.a0(h8);
                mVar.readFully(a0Var.d(), 0, h8);
                a0Var.P(4);
                a7 = vVar.a(m4.q.y(m1.a.a(a0Var)));
            }
        }
        aVar.f22963a = a7;
        return g7;
    }

    public static v.a f(o2.a0 a0Var) {
        a0Var.P(1);
        int F = a0Var.F();
        long e7 = a0Var.e() + F;
        int i7 = F / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long v6 = a0Var.v();
            if (v6 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = v6;
            jArr2[i8] = a0Var.v();
            a0Var.P(2);
            i8++;
        }
        a0Var.P((int) (e7 - a0Var.e()));
        return new v.a(jArr, jArr2);
    }

    private static v.a g(m mVar, int i7) {
        o2.a0 a0Var = new o2.a0(i7);
        mVar.readFully(a0Var.d(), 0, i7);
        return f(a0Var);
    }

    private static v h(m mVar) {
        byte[] bArr = new byte[38];
        mVar.readFully(bArr, 0, 38);
        return new v(bArr, 4);
    }

    public static void i(m mVar) {
        o2.a0 a0Var = new o2.a0(4);
        mVar.readFully(a0Var.d(), 0, 4);
        if (a0Var.E() != 1716281667) {
            throw n2.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(m mVar, int i7) {
        o2.a0 a0Var = new o2.a0(i7);
        mVar.readFully(a0Var.d(), 0, i7);
        a0Var.P(4);
        return Arrays.asList(h0.j(a0Var, false, false).f22924b);
    }
}
