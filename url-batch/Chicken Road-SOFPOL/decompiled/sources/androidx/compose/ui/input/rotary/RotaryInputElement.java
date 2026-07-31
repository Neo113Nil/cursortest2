package androidx.compose.ui.input.rotary;

import w1.x0;
import x1.n;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class RotaryInputElement extends x0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    @Override // w1.x0
    public final l f() {
        n nVar = n.f8512h;
        s1.a aVar = new s1.a();
        aVar.f6690r = nVar;
        return aVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((s1.a) lVar).f6690r = n.f8512h;
    }

    public final int hashCode() {
        return n.f8512h.hashCode() * 31;
    }
}
