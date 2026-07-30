package androidx.compose.ui.draw;

import q6.c;
import r1.s0;
import r6.k;
import s0.n;
import w0.f;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class DrawWithContentElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f697a;

    public DrawWithContentElement(c cVar) {
        this.f697a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithContentElement) && k.a(this.f697a, ((DrawWithContentElement) obj).f697a);
    }

    public final int hashCode() {
        return this.f697a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        f fVar = new f();
        fVar.f9480s = this.f697a;
        return fVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((f) nVar).f9480s = this.f697a;
    }

    public final String toString() {
        return "DrawWithContentElement(onDraw=" + this.f697a + ')';
    }
}
