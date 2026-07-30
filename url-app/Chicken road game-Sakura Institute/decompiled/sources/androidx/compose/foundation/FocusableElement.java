package androidx.compose.foundation;

import m.z;
import p.j;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class FocusableElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f591a;

    public FocusableElement(j jVar) {
        this.f591a = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return k.a(this.f591a, ((FocusableElement) obj).f591a);
        }
        return false;
    }

    public final int hashCode() {
        j jVar = this.f591a;
        if (jVar != null) {
            return jVar.hashCode();
        }
        return 0;
    }

    @Override // r1.s0
    public final n l() {
        return new z(this.f591a);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((z) nVar).D0(this.f591a);
    }
}
