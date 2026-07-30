package androidx.compose.ui.semantics;

import q6.c;
import r1.s0;
import r6.k;
import s0.n;
import y1.i;
import y1.j;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends s0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f745a;

    /* renamed from: b, reason: collision with root package name */
    public final c f746b;

    public AppendedSemanticsElement(c cVar, boolean z8) {
        this.f745a = z8;
        this.f746b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f745a == appendedSemanticsElement.f745a && k.a(this.f746b, appendedSemanticsElement.f746b);
    }

    public final int hashCode() {
        return this.f746b.hashCode() + (Boolean.hashCode(this.f745a) * 31);
    }

    @Override // y1.j
    public final i k() {
        i iVar = new i();
        iVar.f9833g = this.f745a;
        this.f746b.f(iVar);
        return iVar;
    }

    @Override // r1.s0
    public final n l() {
        return new y1.c(this.f745a, false, this.f746b);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        y1.c cVar = (y1.c) nVar;
        cVar.f9797s = this.f745a;
        cVar.f9799u = this.f746b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f745a + ", properties=" + this.f746b + ')';
    }
}
