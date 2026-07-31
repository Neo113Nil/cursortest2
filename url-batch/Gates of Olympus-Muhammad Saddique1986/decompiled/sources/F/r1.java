package F;

import I.C0143d;
import I.C0167p;
import I.C0170q0;
import I.C0186z;
import androidx.compose.foundation.BorderModifierNodeElement;
import b0.C0352v;
import e2.InterfaceC0422a;
import h2.AbstractC0508a;
import n.C0694u;

/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0186z f1765a = new C0186z(I.W.f2783i, N.f1282o);

    public static final void a(U.q qVar, b0.Q q3, long j3, long j4, float f3, float f4, C0694u c0694u, Q.a aVar, C0167p c0167p, int i3, int i4) {
        b0.Q q4 = (i4 & 2) != 0 ? b0.M.f5355a : q3;
        long b3 = (i4 & 8) != 0 ? O.b(j3, c0167p) : j4;
        float f5 = (i4 & 16) != 0 ? 0 : f3;
        float f6 = (i4 & 32) != 0 ? 0 : f4;
        C0694u c0694u2 = (i4 & 64) != 0 ? null : c0694u;
        C0186z c0186z = f1765a;
        float f7 = ((O0.e) c0167p.k(c0186z)).f3731d + f5;
        C0143d.b(new C0170q0[]{V.f1382a.a(new C0352v(b3)), c0186z.a(new O0.e(f7))}, Q.f.b(-70914509, new p1(qVar, q4, j3, f7, c0694u2, f6, aVar), c0167p), c0167p, 56);
    }

    public static final void b(InterfaceC0422a interfaceC0422a, U.q qVar, boolean z3, b0.Q q3, long j3, long j4, float f3, float f4, C0694u c0694u, q.k kVar, Q.a aVar, C0167p c0167p, int i3, int i4) {
        boolean z4 = (i4 & 4) != 0 ? true : z3;
        float f5 = (i4 & 64) != 0 ? 0 : f3;
        C0694u c0694u2 = (i4 & 256) != 0 ? null : c0694u;
        C0186z c0186z = f1765a;
        float f6 = ((O0.e) c0167p.k(c0186z)).f3731d + f5;
        C0143d.b(new C0170q0[]{V.f1382a.a(new C0352v(j4)), c0186z.a(new O0.e(f6))}, Q.f.b(1279702876, new q1(qVar, q3, j3, f6, c0694u2, kVar, z4, interfaceC0422a, f4, aVar), c0167p), c0167p, 56);
    }

    public static final U.q c(U.q qVar, b0.Q q3, long j3, C0694u c0694u, float f3) {
        U.q qVar2 = U.n.f4488a;
        U.q i3 = qVar.i(f3 > 0.0f ? androidx.compose.ui.graphics.a.b(qVar2, 0.0f, f3, q3, false, 124895) : qVar2);
        if (c0694u != null) {
            qVar2 = new BorderModifierNodeElement(c0694u.f7207a, c0694u.f7208b, q3);
        }
        return AbstractC0508a.u(androidx.compose.foundation.a.a(i3.i(qVar2), j3, q3), q3);
    }

    public static final long d(long j3, float f3, C0167p c0167p) {
        M m3 = (M) c0167p.k(O.f1301a);
        boolean booleanValue = ((Boolean) c0167p.k(O.f1302b)).booleanValue();
        if (!C0352v.c(j3, m3.f1253p) || !booleanValue) {
            return j3;
        }
        boolean a3 = O0.e.a(f3, 0);
        long j4 = m3.f1253p;
        if (a3) {
            return j4;
        }
        return b0.M.m(C0352v.b(m3.f1257t, ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f), j4);
    }
}
