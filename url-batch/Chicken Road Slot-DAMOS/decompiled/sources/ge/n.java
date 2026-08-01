package ge;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n extends k1 implements m {
    public final Object f0(ld.a aVar) {
        Object A;
        while (true) {
            Object obj = k1.f4374d.get(this);
            if (obj instanceof z0) {
                if (b0(obj) >= 0) {
                    h1 h1Var = new h1(md.f.b(aVar), this);
                    h1Var.s();
                    h1Var.v(new e(2, a0.p(this, true, new n0(2, h1Var))));
                    A = h1Var.r();
                    md.a aVar2 = md.a.f6622d;
                    break;
                }
            } else {
                if (obj instanceof q) {
                    throw ((q) obj).f4394a;
                }
                A = a0.A(obj);
            }
        }
        md.a aVar3 = md.a.f6622d;
        return A;
    }
}
