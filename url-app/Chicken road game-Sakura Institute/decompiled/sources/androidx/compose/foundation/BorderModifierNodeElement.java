package androidx.compose.foundation;

import m.m;
import r1.s0;
import r6.k;
import s0.n;
import z0.p0;
import z0.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f582a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f583b;

    /* renamed from: c, reason: collision with root package name */
    public final p0 f584c;

    public BorderModifierNodeElement(float f9, r0 r0Var, p0 p0Var) {
        this.f582a = f9;
        this.f583b = r0Var;
        this.f584c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return m2.e.a(this.f582a, borderModifierNodeElement.f582a) && this.f583b.equals(borderModifierNodeElement.f583b) && k.a(this.f584c, borderModifierNodeElement.f584c);
    }

    public final int hashCode() {
        return this.f584c.hashCode() + ((this.f583b.hashCode() + (Float.hashCode(this.f582a) * 31)) * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new m(this.f582a, this.f583b, this.f584c);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        m mVar = (m) nVar;
        float f9 = mVar.f6203v;
        w0.b bVar = mVar.f6206y;
        float f10 = this.f582a;
        if (!m2.e.a(f9, f10)) {
            mVar.f6203v = f10;
            bVar.A0();
        }
        r0 r0Var = mVar.f6204w;
        r0 r0Var2 = this.f583b;
        if (!k.a(r0Var, r0Var2)) {
            mVar.f6204w = r0Var2;
            bVar.A0();
        }
        p0 p0Var = mVar.f6205x;
        p0 p0Var2 = this.f584c;
        if (k.a(p0Var, p0Var2)) {
            return;
        }
        mVar.f6205x = p0Var2;
        bVar.A0();
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) m2.e.e(this.f582a)) + ", brush=" + this.f583b + ", shape=" + this.f584c + ')';
    }
}
