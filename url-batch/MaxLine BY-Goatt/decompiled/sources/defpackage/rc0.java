package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rc0 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof rc0) {
            return this.a == ((rc0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) pc0.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) pc0.b(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
