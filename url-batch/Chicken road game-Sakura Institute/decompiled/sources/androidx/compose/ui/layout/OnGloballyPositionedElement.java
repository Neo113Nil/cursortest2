package androidx.compose.ui.layout;

import p1.j0;
import q6.c;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f736a;

    public OnGloballyPositionedElement(c cVar) {
        this.f736a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f736a == ((OnGloballyPositionedElement) obj).f736a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f736a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        j0 j0Var = new j0();
        j0Var.f7053s = this.f736a;
        return j0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((j0) nVar).f7053s = this.f736a;
    }
}
