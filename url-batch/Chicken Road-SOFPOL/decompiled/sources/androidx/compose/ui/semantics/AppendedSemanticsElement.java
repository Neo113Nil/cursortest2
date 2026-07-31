package androidx.compose.ui.semantics;

import d2.j;
import d2.k;
import p6.c;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class AppendedSemanticsElement extends x0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f565a;

    /* renamed from: b, reason: collision with root package name */
    public final c f566b;

    public AppendedSemanticsElement(c cVar, boolean z3) {
        this.f565a = z3;
        this.f566b = cVar;
    }

    @Override // d2.k
    public final j e() {
        j jVar = new j();
        jVar.f2152f = this.f565a;
        this.f566b.i(jVar);
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f565a == appendedSemanticsElement.f565a && this.f566b == appendedSemanticsElement.f566b;
    }

    @Override // w1.x0
    public final l f() {
        return new d2.c(this.f565a, false, this.f566b);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        d2.c cVar = (d2.c) lVar;
        cVar.f2112r = this.f565a;
        cVar.f2114t = this.f566b;
    }

    public final int hashCode() {
        return this.f566b.hashCode() + (Boolean.hashCode(this.f565a) * 31);
    }
}
