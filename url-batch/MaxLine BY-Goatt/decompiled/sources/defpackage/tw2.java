package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tw2 {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return a(j, 0L) ? "Unspecified" : a(j, 4294967296L) ? "Sp" : a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tw2) {
            return this.a == ((tw2) obj).a;
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
