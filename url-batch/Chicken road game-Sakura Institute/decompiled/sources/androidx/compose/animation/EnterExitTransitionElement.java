package androidx.compose.animation;

import k.g0;
import k.h0;
import k.i0;
import k.x;
import l.k1;
import l.p1;
import r1.s0;
import r6.k;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f572a;

    /* renamed from: b, reason: collision with root package name */
    public final k1 f573b;

    /* renamed from: c, reason: collision with root package name */
    public final k1 f574c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f575d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f576e;

    /* renamed from: f, reason: collision with root package name */
    public final q6.a f577f;

    /* renamed from: g, reason: collision with root package name */
    public final x f578g;

    public EnterExitTransitionElement(p1 p1Var, k1 k1Var, k1 k1Var2, h0 h0Var, i0 i0Var, q6.a aVar, x xVar) {
        this.f572a = p1Var;
        this.f573b = k1Var;
        this.f574c = k1Var2;
        this.f575d = h0Var;
        this.f576e = i0Var;
        this.f577f = aVar;
        this.f578g = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f572a.equals(enterExitTransitionElement.f572a) && k.a(this.f573b, enterExitTransitionElement.f573b) && k.a(this.f574c, enterExitTransitionElement.f574c) && this.f575d.equals(enterExitTransitionElement.f575d) && k.a(this.f576e, enterExitTransitionElement.f576e) && k.a(this.f577f, enterExitTransitionElement.f577f) && k.a(this.f578g, enterExitTransitionElement.f578g);
    }

    public final int hashCode() {
        int hashCode = this.f572a.hashCode() * 31;
        k1 k1Var = this.f573b;
        int hashCode2 = (hashCode + (k1Var == null ? 0 : k1Var.hashCode())) * 31;
        k1 k1Var2 = this.f574c;
        return this.f578g.hashCode() + ((this.f577f.hashCode() + ((this.f576e.f5225a.hashCode() + ((this.f575d.f5222a.hashCode() + ((hashCode2 + (k1Var2 != null ? k1Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // r1.s0
    public final n l() {
        return new g0(this.f572a, this.f573b, this.f574c, this.f575d, this.f576e, this.f577f, this.f578g);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        g0 g0Var = (g0) nVar;
        g0Var.f5212s = this.f572a;
        g0Var.f5213t = this.f573b;
        g0Var.f5214u = this.f574c;
        g0Var.f5215v = this.f575d;
        g0Var.f5216w = this.f576e;
        g0Var.f5217x = this.f577f;
        g0Var.f5218y = this.f578g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f572a + ", sizeAnimation=" + this.f573b + ", offsetAnimation=" + this.f574c + ", slideAnimation=null, enter=" + this.f575d + ", exit=" + this.f576e + ", isEnabled=" + this.f577f + ", graphicsLayerBlock=" + this.f578g + ')';
    }
}
