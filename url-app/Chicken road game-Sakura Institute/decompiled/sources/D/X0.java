package D;

import C.C0111f;
import G.C0192d;
import G.C0208l;
import G.C0216p;
import G.C0235z;
import G.InterfaceC0191c0;
import Z.C0323u;

/* loaded from: classes.dex */
public abstract class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G.Y0 f1674a = new G.Y0(L.f1469o);

    /* renamed from: b, reason: collision with root package name */
    public static final C0235z f1675b = new C0235z(G.W.f2779l, L.f1468n);

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f1676c;

    /* renamed from: d, reason: collision with root package name */
    public static final Y0 f1677d;

    static {
        long j4 = C0323u.f4547g;
        f1676c = new Y0(true, Float.NaN, j4);
        f1677d = new Y0(false, Float.NaN, j4);
    }

    public static final m.Q a(boolean z4, float f4, long j4, C0216p c0216p, int i2, int i4) {
        m.Q y02;
        boolean z5 = true;
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            f4 = Float.NaN;
        }
        if ((i4 & 4) != 0) {
            j4 = C0323u.f4547g;
        }
        c0216p.S(-1280632857);
        if (((Boolean) c0216p.k(f1674a)).booleanValue()) {
            l.u0 u0Var = C.w.f1137a;
            InterfaceC0191c0 N3 = C0192d.N(new C0323u(j4), c0216p);
            boolean z6 = (((i2 & 14) ^ 6) > 4 && c0216p.g(z4)) || (i2 & 6) == 4;
            if ((((i2 & 112) ^ 48) <= 32 || !c0216p.c(f4)) && (i2 & 48) != 32) {
                z5 = false;
            }
            boolean z7 = z6 | z5;
            Object I3 = c0216p.I();
            if (z7 || I3 == C0208l.f2826a) {
                I3 = new C0111f(z4, f4, N3);
                c0216p.c0(I3);
            }
            y02 = (C0111f) I3;
        } else {
            y02 = (M0.e.a(f4, Float.NaN) && C0323u.c(j4, C0323u.f4547g)) ? z4 ? f1676c : f1677d : new Y0(z4, f4, j4);
        }
        c0216p.q(false);
        return y02;
    }
}
