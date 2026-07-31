package androidx.compose.ui.input.key;

import o1.d;
import w1.x0;
import x1.p;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class KeyInputElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f553a;

    public KeyInputElement(p pVar) {
        this.f553a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyInputElement) {
            return this.f553a == ((KeyInputElement) obj).f553a;
        }
        return false;
    }

    @Override // w1.x0
    public final l f() {
        d dVar = new d();
        dVar.f5598r = this.f553a;
        return dVar;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        ((d) lVar).f5598r = this.f553a;
    }

    public final int hashCode() {
        return this.f553a.hashCode() * 31;
    }
}
