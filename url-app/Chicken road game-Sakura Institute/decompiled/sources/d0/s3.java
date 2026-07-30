package d0;

import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class s3 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0.z f2393a = new g0.z(r0.f2353q);

    public static final void a(s0.o oVar, z0.p0 p0Var, long j8, long j9, float f9, float f10, o0.a aVar, g0.p pVar, int i7, int i8) {
        if ((i8 & 1) != 0) {
            oVar = s0.l.f8103a;
        }
        s0.o oVar2 = oVar;
        if ((i8 & 2) != 0) {
            p0Var = z0.l0.f10006a;
        }
        z0.p0 p0Var2 = p0Var;
        long b9 = (i8 & 8) != 0 ? s0.b(j8, pVar) : j9;
        float f11 = (i8 & 16) != 0 ? 0 : f9;
        float f12 = (i8 & 32) != 0 ? 0 : f10;
        g0.z zVar = f2393a;
        float f13 = ((m2.e) pVar.k(zVar)).f6312f + f11;
        g0.d.b(new g0.n1[]{y0.f2529a.a(new z0.u(b9)), zVar.a(new m2.e(f13))}, o0.f.b(-70914509, new q3(oVar2, p0Var2, j8, f13, null, f12, aVar), pVar), pVar, 56);
    }

    public static final void b(q6.a aVar, s0.o oVar, boolean z8, z0.p0 p0Var, long j8, long j9, float f9, float f10, p.j jVar, o0.a aVar2, g0.p pVar, int i7, int i8) {
        boolean z9 = (i8 & 4) != 0 ? true : z8;
        float f11 = (i8 & 64) != 0 ? 0 : f9;
        g0.z zVar = f2393a;
        float f12 = ((m2.e) pVar.k(zVar)).f6312f + f11;
        g0.d.b(new g0.n1[]{y0.f2529a.a(new z0.u(j9)), zVar.a(new m2.e(f12))}, o0.f.b(1279702876, new r3(oVar, p0Var, j8, f12, null, jVar, z9, aVar, f10, aVar2), pVar), pVar, 56);
    }

    public static final s0.o c(s0.o oVar, z0.p0 p0Var, long j8, m.n nVar, float f9) {
        z0.p0 p0Var2;
        s0.o oVar2;
        s0.o oVar3 = s0.l.f8103a;
        if (f9 > 0.0f) {
            p0Var2 = p0Var;
            oVar2 = androidx.compose.ui.graphics.a.b(oVar3, 0.0f, f9, p0Var2, false, 124895);
        } else {
            p0Var2 = p0Var;
            oVar2 = oVar3;
        }
        s0.o j9 = oVar.j(oVar2);
        if (nVar != null) {
            oVar3 = new BorderModifierNodeElement(nVar.f6209a, nVar.f6210b, p0Var2);
        }
        return v0.d.d(androidx.compose.foundation.a.a(j9.j(oVar3), j8, p0Var2), p0Var2);
    }

    public static final long d(long j8, float f9, g0.p pVar) {
        q0 q0Var = (q0) pVar.k(s0.f2378a);
        boolean booleanValue = ((Boolean) pVar.k(s0.f2379b)).booleanValue();
        long j9 = q0Var.f2315p;
        if (!z0.u.c(j8, j9) || !booleanValue) {
            return j8;
        }
        if (m2.e.a(f9, 0)) {
            return j9;
        }
        return z0.l0.l(z0.u.b(q0Var.f2319t, ((((float) Math.log(f9 + 1)) * 4.5f) + 2.0f) / 100.0f), j9);
    }
}
