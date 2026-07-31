package androidx.compose.ui.draw;

import c1.d;
import p6.c;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class DrawBehindElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f540a;

    public DrawBehindElement(c cVar) {
        this.f540a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f540a == ((DrawBehindElement) obj).f540a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        d dVar = new d();
        dVar.f1563r = this.f540a;
        return dVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((d) lVar).f1563r = this.f540a;
    }

    public final int hashCode() {
        return this.f540a.hashCode();
    }
}
