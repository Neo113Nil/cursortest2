package androidx.compose.foundation;

import a0.c1;
import a0.d1;
import a0.m;
import android.view.View;
import m.n0;
import m.o0;
import m.y0;
import r1.f;
import r1.s0;
import r6.k;
import s0.n;
import y1.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class MagnifierElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f594a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f595b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f596c;

    public MagnifierElement(c1 c1Var, d1 d1Var, y0 y0Var) {
        this.f594a = c1Var;
        this.f595b = d1Var;
        this.f596c = y0Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.f596c.hashCode() + ((this.f595b.hashCode() + m.e(m.a(Float.NaN, m.a(Float.NaN, m.d(m.e(m.a(Float.NaN, this.f594a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new n0(this.f594a, this.f595b, this.f596c);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        n0 n0Var = (n0) nVar;
        n0Var.getClass();
        y0 y0Var = n0Var.f6213u;
        View view = n0Var.f6214v;
        m2.b bVar = n0Var.f6215w;
        n0Var.f6211s = this.f594a;
        n0Var.f6212t = this.f595b;
        y0 y0Var2 = this.f596c;
        n0Var.f6213u = y0Var2;
        View v5 = f.v(n0Var);
        m2.b bVar2 = f.t(n0Var).f7735v;
        if (n0Var.f6216x != null) {
            s sVar = o0.f6223a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !y0Var2.a()) || !m2.e.a(Float.NaN, Float.NaN) || !m2.e.a(Float.NaN, Float.NaN) || !y0Var2.equals(y0Var) || !v5.equals(view) || !k.a(bVar2, bVar)) {
                n0Var.B0();
            }
        }
        n0Var.C0();
    }
}
