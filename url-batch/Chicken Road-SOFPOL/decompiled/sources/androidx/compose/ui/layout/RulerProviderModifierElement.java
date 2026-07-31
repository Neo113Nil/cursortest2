package androidx.compose.ui.layout;

import u1.o;
import u1.p0;
import w1.f;
import w1.f0;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class RulerProviderModifierElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f560a;

    public RulerProviderModifierElement(o oVar) {
        this.f560a = oVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f560a : null) == this.f560a;
    }

    @Override // w1.x0
    public final l f() {
        return new p0(this.f560a);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        p0 p0Var = (p0) lVar;
        o oVar = p0Var.f7255r;
        o oVar2 = this.f560a;
        if (oVar != oVar2) {
            p0Var.f7255r = oVar2;
            f0.U(f.u(p0Var), false, 7);
        }
    }

    public final int hashCode() {
        return this.f560a.hashCode();
    }
}
