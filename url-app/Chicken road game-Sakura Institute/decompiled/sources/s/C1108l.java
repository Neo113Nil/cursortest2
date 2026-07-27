package s;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import r0.InterfaceC1074o;

/* renamed from: s.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108l extends S.n implements InterfaceC1074o {

    /* renamed from: t, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f9944t;

    @Override // r0.InterfaceC1074o
    public final void a(r0.G g4) {
        ArrayList arrayList = this.f9944t.f5101h;
        if (arrayList.size() <= 0) {
            g4.a();
        } else {
            r0.B.c(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1108l) && Intrinsics.a(this.f9944t, ((C1108l) obj).f9944t);
    }

    public final int hashCode() {
        return this.f9944t.hashCode();
    }

    @Override // S.n
    public final void t0() {
        this.f9944t.getClass();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f9944t + ')';
    }

    @Override // S.n
    public final void u0() {
        this.f9944t.c();
    }
}
