package androidx.compose.foundation;

import U.p;
import n.Y;
import n.Z;
import q.j;
import t0.InterfaceC0999l;
import t0.U;

/* loaded from: classes.dex */
final class IndicationModifierElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final j f4765a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f4766b;

    public IndicationModifierElement(j jVar, Z z3) {
        this.f4765a = jVar;
        this.f4766b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return f2.j.a(this.f4765a, indicationModifierElement.f4765a) && f2.j.a(this.f4766b, indicationModifierElement.f4766b);
    }

    public final int hashCode() {
        return this.f4766b.hashCode() + (this.f4765a.hashCode() * 31);
    }

    @Override // t0.U
    public final p l() {
        InterfaceC0999l b3 = this.f4766b.b(this.f4765a);
        Y y3 = new Y();
        y3.f7079s = b3;
        y3.y0(b3);
        return y3;
    }

    @Override // t0.U
    public final void m(p pVar) {
        Y y3 = (Y) pVar;
        InterfaceC0999l b3 = this.f4766b.b(this.f4765a);
        y3.z0(y3.f7079s);
        y3.f7079s = b3;
        y3.y0(b3);
    }
}
