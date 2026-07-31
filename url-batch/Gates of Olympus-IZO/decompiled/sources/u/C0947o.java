package u;

import H2.AbstractC0080b;
import java.util.ArrayList;
import t0.InterfaceC0907o;

/* renamed from: u.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947o extends U.k implements InterfaceC0907o {

    /* renamed from: q, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f8080q;

    @Override // t0.InterfaceC0907o
    public final void d(t0.F f3) {
        ArrayList arrayList = this.f8080q.f3661h;
        if (arrayList.size() <= 0) {
            f3.b();
        } else {
            AbstractC0080b.r(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0947o) && Z1.i.a(this.f8080q, ((C0947o) obj).f8080q);
    }

    public final int hashCode() {
        return this.f8080q.hashCode();
    }

    @Override // U.k
    public final void n0() {
        this.f8080q.getClass();
    }

    @Override // U.k
    public final void o0() {
        this.f8080q.d();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f8080q + ')';
    }
}
