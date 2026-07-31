package androidx.compose.animation;

import U.p;
import e2.InterfaceC0422a;
import f2.j;
import l.F;
import l.G;
import l.H;
import l.y;
import m.f0;
import m.l0;
import t0.U;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final G f4747d;

    /* renamed from: e, reason: collision with root package name */
    public final H f4748e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0422a f4749f;

    /* renamed from: g, reason: collision with root package name */
    public final y f4750g;

    public EnterExitTransitionElement(l0 l0Var, f0 f0Var, f0 f0Var2, G g3, H h3, InterfaceC0422a interfaceC0422a, y yVar) {
        this.f4744a = l0Var;
        this.f4745b = f0Var;
        this.f4746c = f0Var2;
        this.f4747d = g3;
        this.f4748e = h3;
        this.f4749f = interfaceC0422a;
        this.f4750g = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f4744a.equals(enterExitTransitionElement.f4744a) && j.a(this.f4745b, enterExitTransitionElement.f4745b) && j.a(this.f4746c, enterExitTransitionElement.f4746c) && j.a(null, null) && this.f4747d.equals(enterExitTransitionElement.f4747d) && j.a(this.f4748e, enterExitTransitionElement.f4748e) && j.a(this.f4749f, enterExitTransitionElement.f4749f) && j.a(this.f4750g, enterExitTransitionElement.f4750g);
    }

    public final int hashCode() {
        int hashCode = this.f4744a.hashCode() * 31;
        f0 f0Var = this.f4745b;
        int hashCode2 = (hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        f0 f0Var2 = this.f4746c;
        return this.f4750g.hashCode() + ((this.f4749f.hashCode() + ((this.f4748e.f6456a.hashCode() + ((this.f4747d.f6453a.hashCode() + ((hashCode2 + (f0Var2 != null ? f0Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    @Override // t0.U
    public final p l() {
        return new F(this.f4744a, this.f4745b, this.f4746c, this.f4747d, this.f4748e, this.f4749f, this.f4750g);
    }

    @Override // t0.U
    public final void m(p pVar) {
        F f3 = (F) pVar;
        f3.f6442q = this.f4744a;
        f3.f6443r = this.f4745b;
        f3.f6444s = this.f4746c;
        f3.f6445t = this.f4747d;
        f3.f6446u = this.f4748e;
        f3.f6447v = this.f4749f;
        f3.f6448w = this.f4750g;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f4744a + ", sizeAnimation=" + this.f4745b + ", offsetAnimation=" + this.f4746c + ", slideAnimation=null, enter=" + this.f4747d + ", exit=" + this.f4748e + ", isEnabled=" + this.f4749f + ", graphicsLayerBlock=" + this.f4750g + ')';
    }
}
