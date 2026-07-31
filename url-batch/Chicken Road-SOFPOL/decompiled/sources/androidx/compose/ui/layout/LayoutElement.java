package androidx.compose.ui.layout;

import p6.f;
import u1.r;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class LayoutElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f557a;

    public LayoutElement(f fVar) {
        this.f557a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f557a == ((LayoutElement) obj).f557a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        r rVar = new r();
        rVar.f7259r = this.f557a;
        return rVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((r) lVar).f7259r = this.f557a;
    }

    public final int hashCode() {
        return this.f557a.hashCode();
    }
}
