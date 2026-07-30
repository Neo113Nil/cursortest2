package c0;

import a0.a0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import g0.z0;
import m.g0;
import m.h0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1452b;

    /* renamed from: c, reason: collision with root package name */
    public final z0 f1453c;

    public e(boolean z8, float f9, z0 z0Var) {
        this.f1451a = z8;
        this.f1452b = f9;
        this.f1453c = z0Var;
    }

    @Override // m.g0
    public final h0 b(p.i iVar, g0.p pVar) {
        long a3;
        pVar.Q(988743187);
        r rVar = (r) pVar.k(t.f1504a);
        z0 z0Var = this.f1453c;
        if (((z0.u) z0Var.getValue()).f10059a != 16) {
            pVar.Q(-303571590);
            pVar.p(false);
            a3 = ((z0.u) z0Var.getValue()).f10059a;
        } else {
            pVar.Q(-303521246);
            a3 = rVar.a(pVar);
            pVar.p(false);
        }
        z0 M = g0.d.M(new z0.u(a3), pVar);
        z0 M2 = g0.d.M(rVar.b(pVar), pVar);
        pVar.Q(331259447);
        ViewGroup b9 = u.b((View) pVar.k(AndroidCompositionLocals_androidKt.f743f));
        boolean f9 = pVar.f(iVar) | pVar.f(this) | pVar.f(b9);
        Object G = pVar.G();
        Object obj = g0.l.f3784a;
        if (f9 || G == obj) {
            Object aVar = new a(this.f1451a, this.f1452b, M, M2, b9);
            pVar.a0(aVar);
            G = aVar;
        }
        a aVar2 = (a) G;
        pVar.p(false);
        boolean f10 = pVar.f(iVar) | pVar.h(aVar2);
        Object G2 = pVar.G();
        if (f10 || G2 == obj) {
            G2 = new a0(iVar, aVar2, (h6.d) null, 3);
            pVar.a0(G2);
        }
        g0.d.f(aVar2, iVar, (q6.e) G2, pVar);
        pVar.p(false);
        return aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1451a == eVar.f1451a && m2.e.a(this.f1452b, eVar.f1452b) && this.f1453c.equals(eVar.f1453c);
    }

    public final int hashCode() {
        return this.f1453c.hashCode() + a0.m.a(this.f1452b, Boolean.hashCode(this.f1451a) * 31, 31);
    }
}
