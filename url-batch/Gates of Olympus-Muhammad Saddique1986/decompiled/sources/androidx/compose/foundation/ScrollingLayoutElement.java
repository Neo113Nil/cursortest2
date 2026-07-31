package androidx.compose.foundation;

import A.k;
import U.p;
import f2.j;
import n.A0;
import n.y0;
import t0.U;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f4781a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4782b;

    public ScrollingLayoutElement(y0 y0Var, boolean z3) {
        this.f4781a = y0Var;
        this.f4782b = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return j.a(this.f4781a, scrollingLayoutElement.f4781a) && this.f4782b == scrollingLayoutElement.f4782b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + k.e(this.f4781a.hashCode() * 31, 31, this.f4782b);
    }

    @Override // t0.U
    public final p l() {
        A0 a02 = new A0();
        a02.f7016q = this.f4781a;
        a02.f7017r = this.f4782b;
        a02.f7018s = true;
        return a02;
    }

    @Override // t0.U
    public final void m(p pVar) {
        A0 a02 = (A0) pVar;
        a02.f7016q = this.f4781a;
        a02.f7017r = this.f4782b;
        a02.f7018s = true;
    }
}
