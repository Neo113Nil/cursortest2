package androidx.compose.ui.semantics;

import A0.c;
import A0.i;
import A0.j;
import U.p;
import e2.InterfaceC0424c;
import t0.U;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends U implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4944a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0424c f4945b;

    public AppendedSemanticsElement(InterfaceC0424c interfaceC0424c, boolean z3) {
        this.f4944a = z3;
        this.f4945b = interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f4944a == appendedSemanticsElement.f4944a && f2.j.a(this.f4945b, appendedSemanticsElement.f4945b);
    }

    public final int hashCode() {
        return this.f4945b.hashCode() + (Boolean.hashCode(this.f4944a) * 31);
    }

    @Override // A0.j
    public final i k() {
        i iVar = new i();
        iVar.f130e = this.f4944a;
        this.f4945b.n(iVar);
        return iVar;
    }

    @Override // t0.U
    public final p l() {
        return new c(this.f4944a, false, this.f4945b);
    }

    @Override // t0.U
    public final void m(p pVar) {
        c cVar = (c) pVar;
        cVar.f92q = this.f4944a;
        cVar.f94s = this.f4945b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f4944a + ", properties=" + this.f4945b + ')';
    }
}
