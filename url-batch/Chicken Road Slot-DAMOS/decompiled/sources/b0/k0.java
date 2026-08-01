package b0;

import kotlin.Metadata;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb0/k0;", "Lc2/x0;", "Lb0/m0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class k0 extends c2.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f860a;

    /* renamed from: b, reason: collision with root package name */
    public final float f861b;

    public k0(float f3, float f10, a1.f fVar) {
        this.f860a = f3;
        this.f861b = f10;
    }

    @Override // c2.x0
    public final d1.k d() {
        m0 m0Var = new m0();
        m0Var.C = this.f860a;
        m0Var.D = this.f861b;
        m0Var.E = true;
        return m0Var;
    }

    @Override // c2.x0
    public final void e(d1.k kVar) {
        m0 m0Var = (m0) kVar;
        float f3 = m0Var.C;
        float f10 = this.f860a;
        boolean b10 = x2.f.b(f3, f10);
        float f11 = this.f861b;
        if (!b10 || !x2.f.b(m0Var.D, f11) || !m0Var.E) {
            c2.k.u(m0Var).Q(false);
        }
        m0Var.C = f10;
        m0Var.D = f11;
        m0Var.E = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        return k0Var != null && x2.f.b(this.f860a, k0Var.f860a) && x2.f.b(this.f861b, k0Var.f861b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + n0.l.b(this.f861b, Float.hashCode(this.f860a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) x2.f.c(this.f860a)) + ", y=" + ((Object) x2.f.c(this.f861b)) + ", rtlAware=true)";
    }
}
