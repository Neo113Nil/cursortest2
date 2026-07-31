package androidx.compose.foundation;

import a0.q;
import q6.i;
import t.s0;
import t.u0;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f479a;

    public ScrollingLayoutElement(u0 u0Var) {
        this.f479a = u0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return i.a(this.f479a, ((ScrollingLayoutElement) obj).f479a);
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        s0 s0Var = new s0();
        s0Var.f6854r = this.f479a;
        s0Var.f6855s = true;
        return s0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        s0 s0Var = (s0) lVar;
        s0Var.f6854r = this.f479a;
        s0Var.f6855s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + q.d(this.f479a.hashCode() * 31, 31, false);
    }
}
