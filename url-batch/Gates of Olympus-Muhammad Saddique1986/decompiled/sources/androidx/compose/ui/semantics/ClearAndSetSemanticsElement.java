package androidx.compose.ui.semantics;

import A0.c;
import A0.i;
import A0.j;
import U.p;
import e2.InterfaceC0424c;
import f2.k;
import t0.U;

/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends U implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f4946a;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(InterfaceC0424c interfaceC0424c) {
        this.f4946a = (k) interfaceC0424c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.f4946a.equals(((ClearAndSetSemanticsElement) obj).f4946a);
    }

    public final int hashCode() {
        return this.f4946a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [e2.c, f2.k] */
    @Override // A0.j
    public final i k() {
        i iVar = new i();
        iVar.f130e = false;
        iVar.f131f = true;
        this.f4946a.n(iVar);
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e2.c, f2.k] */
    @Override // t0.U
    public final p l() {
        return new c(false, true, this.f4946a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.c, f2.k] */
    @Override // t0.U
    public final void m(p pVar) {
        ((c) pVar).f94s = this.f4946a;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f4946a + ')';
    }
}
