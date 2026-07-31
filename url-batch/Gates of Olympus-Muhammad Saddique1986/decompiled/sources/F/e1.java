package F;

import E.C0078f;
import I.C0143d;
import I.C0159l;
import I.C0167p;
import I.C0186z;
import I.InterfaceC0142c0;
import b0.C0352v;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.X0 f1524a = new I.X0(N.f1280m);

    /* renamed from: b, reason: collision with root package name */
    public static final C0186z f1525b = new C0186z(I.W.f2783i, N.f1279l);

    /* renamed from: c, reason: collision with root package name */
    public static final f1 f1526c;

    /* renamed from: d, reason: collision with root package name */
    public static final f1 f1527d;

    static {
        long j3 = C0352v.f5439g;
        f1526c = new f1(true, Float.NaN, j3);
        f1527d = new f1(false, Float.NaN, j3);
    }

    public static final n.U a(boolean z3, float f3, C0167p c0167p, int i3, int i4) {
        n.U f1Var;
        boolean z4 = true;
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        if ((i4 & 2) != 0) {
            f3 = Float.NaN;
        }
        long j3 = C0352v.f5439g;
        c0167p.Q(-1280632857);
        if (((Boolean) c0167p.k(f1524a)).booleanValue()) {
            m.t0 t0Var = E.w.f1008a;
            InterfaceC0142c0 N3 = C0143d.N(new C0352v(j3), c0167p);
            boolean z5 = (((i3 & 14) ^ 6) > 4 && c0167p.g(z3)) || (i3 & 6) == 4;
            if ((((i3 & 112) ^ 48) <= 32 || !c0167p.c(f3)) && (i3 & 48) != 32) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object G3 = c0167p.G();
            if (z6 || G3 == C0159l.f2829a) {
                G3 = new C0078f(z3, f3, N3);
                c0167p.a0(G3);
            }
            f1Var = (C0078f) G3;
        } else {
            f1Var = (O0.e.a(f3, Float.NaN) && C0352v.c(j3, j3)) ? z3 ? f1526c : f1527d : new f1(z3, f3, j3);
        }
        c0167p.p(false);
        return f1Var;
    }
}
