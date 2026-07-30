package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s22 {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s22) {
            return this.a == ((s22) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
