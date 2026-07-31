package androidx.compose.animation;

import I2.l;
import U.k;
import Z1.i;
import l.D;
import l.E;
import l.F;
import l.G;
import l.u;
import l.y;
import m.s0;
import t0.T;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f3579a;

    /* renamed from: b, reason: collision with root package name */
    public final F f3580b;

    /* renamed from: c, reason: collision with root package name */
    public final G f3581c;

    /* renamed from: d, reason: collision with root package name */
    public final Y1.a f3582d;

    /* renamed from: e, reason: collision with root package name */
    public final y f3583e;

    public EnterExitTransitionElement(s0 s0Var, F f3, G g3, Y1.a aVar, y yVar) {
        this.f3579a = s0Var;
        this.f3580b = f3;
        this.f3581c = g3;
        this.f3582d = aVar;
        this.f3583e = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f3579a.equals(enterExitTransitionElement.f3579a) && i.a(null, null) && i.a(null, null) && i.a(null, null) && this.f3580b.equals(enterExitTransitionElement.f3580b) && i.a(this.f3581c, enterExitTransitionElement.f3581c) && i.a(this.f3582d, enterExitTransitionElement.f3582d) && i.a(this.f3583e, enterExitTransitionElement.f3583e);
    }

    @Override // t0.T
    public final k h() {
        F f3 = this.f3580b;
        G g3 = this.f3581c;
        s0 s0Var = this.f3579a;
        Y1.a aVar = this.f3582d;
        y yVar = this.f3583e;
        E e3 = new E();
        e3.f5424q = s0Var;
        e3.f5425r = f3;
        e3.f5426s = g3;
        e3.f5427t = aVar;
        e3.f5428u = yVar;
        e3.f5429v = u.f5504a;
        l.b(0, 0, 15);
        new D(e3, 0);
        new D(e3, 1);
        return e3;
    }

    public final int hashCode() {
        return this.f3583e.hashCode() + ((this.f3582d.hashCode() + ((this.f3581c.f5435a.hashCode() + ((this.f3580b.f5432a.hashCode() + (this.f3579a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        E e3 = (E) kVar;
        e3.f5424q = this.f3579a;
        e3.f5425r = this.f3580b;
        e3.f5426s = this.f3581c;
        e3.f5427t = this.f3582d;
        e3.f5428u = this.f3583e;
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f3579a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f3580b + ", exit=" + this.f3581c + ", isEnabled=" + this.f3582d + ", graphicsLayerBlock=" + this.f3583e + ')';
    }
}
