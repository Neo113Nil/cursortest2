package androidx.compose.ui.draw;

import q6.c;
import r1.s0;
import r6.k;
import s0.n;
import w0.d;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class DrawBehindElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f695a;

    public DrawBehindElement(c cVar) {
        this.f695a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && k.a(this.f695a, ((DrawBehindElement) obj).f695a);
    }

    public final int hashCode() {
        return this.f695a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        d dVar = new d();
        dVar.f9479s = this.f695a;
        return dVar;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        ((d) nVar).f9479s = this.f695a;
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f695a + ')';
    }
}
