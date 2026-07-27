package n;

import G.C0192d;
import G.C0205j0;
import G.W;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C0205j0 f8540a = C0192d.K(l.f8538a, W.f2779l);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return Intrinsics.a((n) ((o) obj).f8540a.getValue(), (n) this.f8540a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((n) this.f8540a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((n) this.f8540a.getValue()) + ')';
    }
}
