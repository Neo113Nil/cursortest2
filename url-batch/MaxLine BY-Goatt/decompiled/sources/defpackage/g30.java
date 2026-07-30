package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g30 {
    public final lz1 a = ij2.j(d30.a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g30) {
            return Intrinsics.b((f30) ((g30) obj).a.getValue(), (f30) this.a.getValue());
        }
        return false;
    }

    public final int hashCode() {
        return ((f30) this.a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((f30) this.a.getValue()) + ')';
    }
}
