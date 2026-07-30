package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e30 extends f30 {
    public final long a;

    public e30(long j) {
        this.a = j;
        if (ap.D(j)) {
            return;
        }
        lh.g("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e30)) {
            return false;
        }
        return au1.b(this.a, ((e30) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) au1.i(this.a)) + ')';
    }
}
