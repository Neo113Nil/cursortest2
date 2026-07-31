package androidx.compose.ui.semantics;

import U.k;
import Y1.c;
import t0.T;
import z0.i;
import z0.j;

/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends T implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Z1.j f3746a;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(c cVar) {
        this.f3746a = (Z1.j) cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.f3746a.equals(((ClearAndSetSemanticsElement) obj).f3746a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Y1.c, Z1.j] */
    @Override // z0.j
    public final i g() {
        i iVar = new i();
        iVar.f8983e = false;
        iVar.f8984f = true;
        this.f3746a.j(iVar);
        return iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y1.c, Z1.j] */
    @Override // t0.T
    public final k h() {
        return new z0.c(false, true, this.f3746a);
    }

    public final int hashCode() {
        return this.f3746a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.c, Z1.j] */
    @Override // t0.T
    public final void i(k kVar) {
        ((z0.c) kVar).f8948s = this.f3746a;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f3746a + ')';
    }
}
