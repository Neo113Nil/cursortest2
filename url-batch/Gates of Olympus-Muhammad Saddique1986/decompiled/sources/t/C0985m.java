package t;

import java.util.ArrayList;
import t0.InterfaceC1002o;

/* renamed from: t.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985m extends U.p implements InterfaceC1002o {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f8492q;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0985m) && f2.j.a(this.f8492q, ((C0985m) obj).f8492q);
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        ArrayList arrayList = this.f8492q.f4846h;
        if (arrayList.size() <= 0) {
            g3.b();
        } else {
            A.k.r(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f8492q.hashCode();
    }

    @Override // U.p
    public final void q0() {
        this.f8492q.getClass();
    }

    @Override // U.p
    public final void r0() {
        this.f8492q.c();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f8492q + ')';
    }
}
