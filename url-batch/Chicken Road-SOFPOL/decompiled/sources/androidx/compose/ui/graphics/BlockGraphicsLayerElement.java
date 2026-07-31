package androidx.compose.ui.graphics;

import f1.o;
import p6.c;
import w1.d1;
import w1.f;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f544a;

    public BlockGraphicsLayerElement(c cVar) {
        this.f544a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BlockGraphicsLayerElement) {
            return this.f544a == ((BlockGraphicsLayerElement) obj).f544a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        o oVar = new o();
        oVar.f2692r = this.f544a;
        return oVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        o oVar = (o) lVar;
        oVar.f2692r = this.f544a;
        d1 d1Var = f.s(oVar, 2).f7615s;
        if (d1Var != null) {
            d1Var.b1(oVar.f2692r, true);
        }
    }

    public final int hashCode() {
        return this.f544a.hashCode();
    }
}
