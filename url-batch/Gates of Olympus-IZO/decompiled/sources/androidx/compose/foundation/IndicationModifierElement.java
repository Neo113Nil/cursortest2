package androidx.compose.foundation;

import U.k;
import n.V;
import n.W;
import q.i;
import t0.InterfaceC0904l;
import t0.T;

/* loaded from: classes.dex */
final class IndicationModifierElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final i f3597a;

    /* renamed from: b, reason: collision with root package name */
    public final W f3598b;

    public IndicationModifierElement(i iVar, W w3) {
        this.f3597a = iVar;
        this.f3598b = w3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return Z1.i.a(this.f3597a, indicationModifierElement.f3597a) && Z1.i.a(this.f3598b, indicationModifierElement.f3598b);
    }

    @Override // t0.T
    public final k h() {
        InterfaceC0904l b2 = this.f3598b.b(this.f3597a);
        V v3 = new V();
        v3.f6035s = b2;
        v3.v0(b2);
        return v3;
    }

    public final int hashCode() {
        return this.f3598b.hashCode() + (this.f3597a.hashCode() * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        V v3 = (V) kVar;
        InterfaceC0904l b2 = this.f3598b.b(this.f3597a);
        v3.w0(v3.f6035s);
        v3.f6035s = b2;
        v3.v0(b2);
    }
}
