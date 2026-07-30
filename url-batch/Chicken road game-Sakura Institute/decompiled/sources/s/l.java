package s;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l extends s0.n implements r1.o {

    /* renamed from: s, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f8035s;

    @Override // r1.o
    public final void c(r1.f0 f0Var) {
        ArrayList arrayList = this.f8035s.f658h;
        if (arrayList.size() <= 0) {
            f0Var.b();
        } else {
            r6.i.e(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && r6.k.a(this.f8035s, ((l) obj).f8035s);
    }

    public final int hashCode() {
        return this.f8035s.hashCode();
    }

    @Override // s0.n
    public final void s0() {
        this.f8035s.getClass();
    }

    @Override // s0.n
    public final void t0() {
        this.f8035s.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f8035s + ')';
    }
}
