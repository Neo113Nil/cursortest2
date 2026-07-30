package androidx.compose.foundation.relocation;

import r1.s0;
import r6.k;
import s0.n;
import t.c;
import t.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f664a;

    public BringIntoViewRequesterElement(c cVar) {
        this.f664a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return k.a(this.f664a, ((BringIntoViewRequesterElement) obj).f664a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f664a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        d dVar = new d();
        dVar.f8716s = this.f664a;
        return dVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        d dVar = (d) nVar;
        c cVar = dVar.f8716s;
        if (cVar != null) {
            cVar.f8715a.n(dVar);
        }
        c cVar2 = this.f664a;
        if (cVar2 != null) {
            cVar2.f8715a.b(dVar);
        }
        dVar.f8716s = cVar2;
    }
}
