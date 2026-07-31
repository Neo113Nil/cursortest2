package androidx.compose.animation;

import q.d0;
import q.l0;
import q.m0;
import q.n0;
import q6.i;
import r.f1;
import r.l1;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f448a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f449b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f450c;

    /* renamed from: d, reason: collision with root package name */
    public final m0 f451d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f452e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.a f453f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f454g;

    public EnterExitTransitionElement(l1 l1Var, f1 f1Var, f1 f1Var2, m0 m0Var, n0 n0Var, p6.a aVar, d0 d0Var) {
        this.f448a = l1Var;
        this.f449b = f1Var;
        this.f450c = f1Var2;
        this.f451d = m0Var;
        this.f452e = n0Var;
        this.f453f = aVar;
        this.f454g = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f448a.equals(enterExitTransitionElement.f448a) && i.a(this.f449b, enterExitTransitionElement.f449b) && i.a(this.f450c, enterExitTransitionElement.f450c) && this.f451d.equals(enterExitTransitionElement.f451d) && i.a(this.f452e, enterExitTransitionElement.f452e) && i.a(this.f453f, enterExitTransitionElement.f453f) && i.a(this.f454g, enterExitTransitionElement.f454g);
    }

    @Override // w1.x0
    public final l f() {
        return new l0(this.f448a, this.f449b, this.f450c, this.f451d, this.f452e, this.f453f, this.f454g);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        l0 l0Var = (l0) lVar;
        l0Var.f5861r = this.f448a;
        l0Var.f5862s = this.f449b;
        l0Var.f5863t = this.f450c;
        l0Var.f5864u = this.f451d;
        l0Var.f5865v = this.f452e;
        l0Var.f5866w = this.f453f;
        l0Var.f5867x = this.f454g;
    }

    public final int hashCode() {
        int hashCode = this.f448a.hashCode() * 31;
        f1 f1Var = this.f449b;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        f1 f1Var2 = this.f450c;
        return this.f454g.hashCode() + ((this.f453f.hashCode() + ((this.f452e.f5880a.hashCode() + ((this.f451d.f5874a.hashCode() + ((hashCode2 + (f1Var2 != null ? f1Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f448a + ", sizeAnimation=" + this.f449b + ", offsetAnimation=" + this.f450c + ", slideAnimation=null, enter=" + this.f451d + ", exit=" + this.f452e + ", isEnabled=" + this.f453f + ", graphicsLayerBlock=" + this.f454g + ')';
    }
}
