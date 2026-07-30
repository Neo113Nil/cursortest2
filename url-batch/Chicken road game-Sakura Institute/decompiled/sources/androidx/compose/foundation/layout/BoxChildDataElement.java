package androidx.compose.foundation.layout;

import q.k;
import r1.s0;
import s0.g;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class BoxChildDataElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f616a;

    public BoxChildDataElement(g gVar) {
        this.f616a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f616a.equals(boxChildDataElement.f616a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f616a.hashCode() * 31);
    }

    @Override // r1.s0
    public final n l() {
        k kVar = new k();
        kVar.f7296s = this.f616a;
        return kVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((k) nVar).f7296s = this.f616a;
    }
}
