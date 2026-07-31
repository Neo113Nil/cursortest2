package F;

import E.C0024f;
import I.C0089d;
import I.C0105l;
import I.C0113p;
import I.C0132z;
import I.InterfaceC0088c0;
import b0.C0288u;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I.Y0 f871a = new I.Y0(K.f1037m);

    /* renamed from: b, reason: collision with root package name */
    public static final C0132z f872b = new C0132z(I.X.f2228i, K.f1036l);

    /* renamed from: c, reason: collision with root package name */
    public static final C0 f873c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0 f874d;

    static {
        long j3 = C0288u.f4296f;
        f873c = new C0(true, Float.NaN, j3);
        f874d = new C0(false, Float.NaN, j3);
    }

    public static final n.Q a(float f3, C0113p c0113p, int i3, int i4) {
        n.Q c02;
        boolean z3 = true;
        boolean z4 = (i4 & 1) != 0;
        if ((i4 & 2) != 0) {
            f3 = Float.NaN;
        }
        long j3 = C0288u.f4296f;
        c0113p.Q(-1280632857);
        if (((Boolean) c0113p.k(f871a)).booleanValue()) {
            m.x0 x0Var = E.x.f708a;
            InterfaceC0088c0 M3 = C0089d.M(new C0288u(j3), c0113p);
            boolean z5 = (((i3 & 14) ^ 6) > 4 && c0113p.g(z4)) || (i3 & 6) == 4;
            if ((((i3 & 112) ^ 48) <= 32 || !c0113p.c(f3)) && (i3 & 48) != 32) {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            Object G3 = c0113p.G();
            if (z6 || G3 == C0105l.f2272a) {
                G3 = new C0024f(z4, f3, M3);
                c0113p.a0(G3);
            }
            c02 = (C0024f) G3;
        } else {
            c02 = (M0.e.a(f3, Float.NaN) && C0288u.c(j3, j3)) ? z4 ? f873c : f874d : new C0(z4, f3, j3);
        }
        c0113p.p(false);
        return c02;
    }
}
