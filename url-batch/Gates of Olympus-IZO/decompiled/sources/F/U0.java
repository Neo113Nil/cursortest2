package F;

import I.C0089d;
import I.C0113p;
import I.C0116q0;
import I.C0132z;
import androidx.compose.foundation.BorderModifierNodeElement;
import b0.AbstractC0259J;
import b0.C0288u;
import b0.InterfaceC0263N;
import n.C0665u;

/* loaded from: classes.dex */
public abstract class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0132z f1119a = new C0132z(I.X.f2228i, K.f1039o);

    public static final void a(U.l lVar, InterfaceC0263N interfaceC0263N, long j3, long j4, float f3, float f4, C0665u c0665u, Q.a aVar, C0113p c0113p, int i3, int i4) {
        InterfaceC0263N interfaceC0263N2 = (i4 & 2) != 0 ? AbstractC0259J.f4215a : interfaceC0263N;
        long b2 = (i4 & 8) != 0 ? L.b(j3, c0113p) : j4;
        float f5 = (i4 & 16) != 0 ? 0 : f3;
        float f6 = (i4 & 32) != 0 ? 0 : f4;
        C0665u c0665u2 = (i4 & 64) != 0 ? null : c0665u;
        C0132z c0132z = f1119a;
        float f7 = ((M0.e) c0113p.k(c0132z)).f2766d + f5;
        C0089d.b(new C0116q0[]{P.f1079a.a(new C0288u(b2)), c0132z.a(new M0.e(f7))}, Q.f.b(-70914509, new R0(lVar, interfaceC0263N2, j3, f7, c0665u2, f6, aVar), c0113p), c0113p, 56);
    }

    public static final void b(Y1.a aVar, U.l lVar, boolean z3, InterfaceC0263N interfaceC0263N, long j3, long j4, float f3, C0665u c0665u, q.j jVar, Q.a aVar2, C0113p c0113p, int i3) {
        C0132z c0132z = f1119a;
        float f4 = ((M0.e) c0113p.k(c0132z)).f2766d + 0;
        C0089d.b(new C0116q0[]{P.f1079a.a(new C0288u(j4)), c0132z.a(new M0.e(f4))}, Q.f.b(1279702876, new S0(lVar, interfaceC0263N, j3, f4, c0665u, jVar, z3, aVar, f3, aVar2), c0113p), c0113p, 56);
    }

    public static final U.l c(U.l lVar, InterfaceC0263N interfaceC0263N, long j3, C0665u c0665u, float f3) {
        U.l lVar2 = U.i.f3302a;
        U.l e3 = lVar.e(f3 > 0.0f ? androidx.compose.ui.graphics.a.b(lVar2, 0.0f, f3, interfaceC0263N, false, 124895) : lVar2);
        if (c0665u != null) {
            lVar2 = new BorderModifierNodeElement(c0665u.f6162a, c0665u.f6163b, interfaceC0263N);
        }
        return I2.l.m(androidx.compose.foundation.a.a(e3.e(lVar2), j3, interfaceC0263N), interfaceC0263N);
    }

    public static final long d(long j3, float f3, C0113p c0113p) {
        J j4 = (J) c0113p.k(L.f1045a);
        boolean booleanValue = ((Boolean) c0113p.k(L.f1046b)).booleanValue();
        if (!C0288u.c(j3, j4.p) || !booleanValue) {
            return j3;
        }
        boolean a3 = M0.e.a(f3, 0);
        long j5 = j4.p;
        if (a3) {
            return j5;
        }
        return AbstractC0259J.k(C0288u.b(j4.f1010t, ((((float) Math.log(f3 + 1)) * 4.5f) + 2.0f) / 100.0f), j5);
    }
}
