package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hw2 {
    public static final hw2 c = new hw2(2, false);
    public static final hw2 d = new hw2(1, true);
    public final int a;
    public final boolean b;

    public hw2(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw2)) {
            return false;
        }
        hw2 hw2Var = (hw2) obj;
        return this.a == hw2Var.a && this.b == hw2Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return equals(c) ? "TextMotion.Static" : equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
