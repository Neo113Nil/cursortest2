package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fk0 {
    public final h03 a;

    public fk0(h03 h03Var) {
        this.a = h03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fk0) {
            return Float.compare(0.0f, 0.0f) == 0 && this.a.equals(((fk0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
