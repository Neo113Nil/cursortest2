package o;

import I.C0143d;
import I.C0156j0;
import I.W;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C0156j0 f7419a = C0143d.K(k.f7417a, W.f2783i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return f2.j.a((m) ((n) obj).f7419a.getValue(), (m) this.f7419a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((m) this.f7419a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((m) this.f7419a.getValue()) + ')';
    }
}
