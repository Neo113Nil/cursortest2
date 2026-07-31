package androidx.compose.ui.semantics;

import U.k;
import Y1.c;
import Z1.i;
import t0.T;
import z0.j;

/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends T implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final c f3745b;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f3744a = z3;
        this.f3745b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f3744a == appendedSemanticsElement.f3744a && i.a(this.f3745b, appendedSemanticsElement.f3745b);
    }

    @Override // z0.j
    public final z0.i g() {
        z0.i iVar = new z0.i();
        iVar.f8983e = this.f3744a;
        this.f3745b.j(iVar);
        return iVar;
    }

    @Override // t0.T
    public final k h() {
        return new z0.c(this.f3744a, false, this.f3745b);
    }

    public final int hashCode() {
        return this.f3745b.hashCode() + (Boolean.hashCode(this.f3744a) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        z0.c cVar = (z0.c) kVar;
        cVar.f8946q = this.f3744a;
        cVar.f8948s = this.f3745b;
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f3744a + ", properties=" + this.f3745b + ')';
    }
}
