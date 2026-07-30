package androidx.compose.ui.semantics;

import q6.c;
import r1.s0;
import r6.l;
import s0.n;
import y1.i;
import y1.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends s0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final l f747a;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(c cVar) {
        this.f747a = (l) cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.f747a.equals(((ClearAndSetSemanticsElement) obj).f747a);
    }

    public final int hashCode() {
        return this.f747a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q6.c, r6.l] */
    @Override // y1.j
    public final i k() {
        i iVar = new i();
        iVar.f9833g = false;
        iVar.f9834h = true;
        this.f747a.f(iVar);
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q6.c, r6.l] */
    @Override // r1.s0
    public final n l() {
        return new y1.c(false, true, this.f747a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q6.c, r6.l] */
    @Override // r1.s0
    public final void m(n nVar) {
        ((y1.c) nVar).f9799u = this.f747a;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f747a + ')';
    }
}
