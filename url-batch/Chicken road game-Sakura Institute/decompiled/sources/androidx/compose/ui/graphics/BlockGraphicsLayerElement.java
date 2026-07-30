package androidx.compose.ui.graphics;

import q6.c;
import r1.a1;
import r1.f;
import r1.s0;
import r6.k;
import s0.n;
import z0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f721a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f721a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && k.a(this.f721a, ((BlockGraphicsLayerElement) obj).f721a);
    }

    public final int hashCode() {
        return this.f721a.hashCode();
    }

    @Override // r1.s0
    public final n l() {
        return new o(this.f721a);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        o oVar = (o) nVar;
        oVar.f10029s = this.f721a;
        a1 a1Var = f.r(oVar, 2).f7701r;
        if (a1Var != null) {
            a1Var.h1(oVar.f10029s, true);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f721a + ')';
    }
}
