package androidx.compose.ui.layout;

import p1.s;
import q6.f;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class LayoutElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f734a;

    public LayoutElement(f fVar) {
        this.f734a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && k.a(this.f734a, ((LayoutElement) obj).f734a);
    }

    public final int hashCode() {
        return this.f734a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        s sVar = new s();
        sVar.f7079s = this.f734a;
        return sVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((s) nVar).f7079s = this.f734a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.f734a + ')';
    }
}
