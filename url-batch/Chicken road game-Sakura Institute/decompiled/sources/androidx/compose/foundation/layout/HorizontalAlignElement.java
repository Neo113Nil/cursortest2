package androidx.compose.foundation.layout;

import q.z;
import r1.s0;
import s0.e;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f619a;

    public HorizontalAlignElement(e eVar) {
        this.f619a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.f619a.equals(horizontalAlignElement.f619a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f619a.f8094a);
    }

    @Override // r1.s0
    public final n l() {
        z zVar = new z();
        zVar.f7382s = this.f619a;
        return zVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((z) nVar).f7382s = this.f619a;
    }
}
