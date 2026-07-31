package androidx.compose.ui.semantics;

import d2.j;
import d2.k;
import p6.c;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ClearAndSetSemanticsElement extends x0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f567a;

    public ClearAndSetSemanticsElement(c cVar) {
        this.f567a = cVar;
    }

    @Override // d2.k
    public final j e() {
        j jVar = new j();
        jVar.f2152f = false;
        jVar.f2153g = true;
        this.f567a.i(jVar);
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClearAndSetSemanticsElement) {
            return this.f567a == ((ClearAndSetSemanticsElement) obj).f567a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        return new d2.c(false, true, this.f567a);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((d2.c) lVar).f2114t = this.f567a;
    }

    public final int hashCode() {
        return this.f567a.hashCode();
    }
}
