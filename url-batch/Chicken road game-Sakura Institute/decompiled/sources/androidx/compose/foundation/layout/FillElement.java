package androidx.compose.foundation.layout;

import l.h;
import q.x;
import r1.s0;
import s0.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class FillElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f617a;

    /* renamed from: b, reason: collision with root package name */
    public final float f618b;

    public FillElement(float f9, int i7) {
        this.f617a = i7;
        this.f618b = f9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f617a == fillElement.f617a && this.f618b == fillElement.f618b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f618b) + (h.d(this.f617a) * 31);
    }

    @Override // r1.s0
    public final n l() {
        x xVar = new x();
        xVar.f7373s = this.f617a;
        xVar.f7374t = this.f618b;
        return xVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        x xVar = (x) nVar;
        xVar.f7373s = this.f617a;
        xVar.f7374t = this.f618b;
    }
}
