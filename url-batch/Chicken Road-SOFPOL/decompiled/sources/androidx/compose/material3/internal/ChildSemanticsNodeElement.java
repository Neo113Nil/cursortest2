package androidx.compose.material3.internal;

import j0.l;
import k0.c;
import w1.f;
import w1.x0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ChildSemanticsNodeElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f538a;

    public ChildSemanticsNodeElement(l lVar) {
        this.f538a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChildSemanticsNodeElement) {
            return this.f538a == ((ChildSemanticsNodeElement) obj).f538a;
        }
        return false;
    }

    @Override // w1.x0
    public final y0.l f() {
        c cVar = new c();
        cVar.f4152r = this.f538a;
        return cVar;
    }

    @Override // w1.x0
    public final void g(y0.l lVar) {
        c cVar = (c) lVar;
        cVar.f4152r = this.f538a;
        f.n(cVar);
    }

    public final int hashCode() {
        return this.f538a.hashCode();
    }
}
