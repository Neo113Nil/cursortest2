package androidx.compose.foundation.layout;

import w1.x0;
import x.y;
import y0.c;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f487a;

    public HorizontalAlignElement(c cVar) {
        this.f487a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f487a.equals(horizontalAlignElement.f487a);
    }

    @Override // w1.x0
    public final l f() {
        y yVar = new y();
        yVar.f8311r = this.f487a;
        return yVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((y) lVar).f8311r = this.f487a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f487a.f8696a);
    }
}
