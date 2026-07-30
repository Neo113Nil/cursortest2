package androidx.compose.ui.draw;

import q6.c;
import r1.s0;
import r6.k;
import s0.n;
import w0.b;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class DrawWithCacheElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f696a;

    public DrawWithCacheElement(c cVar) {
        this.f696a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && k.a(this.f696a, ((DrawWithCacheElement) obj).f696a);
    }

    public final int hashCode() {
        return this.f696a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        return new b(new w0.c(), this.f696a);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        b bVar = (b) nVar;
        bVar.f9476u = this.f696a;
        bVar.A0();
    }

    public final String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.f696a + ')';
    }
}
