package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class dt {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof dt) {
            return this.a == ((dt) obj).a;
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
        return "(" + ((Object) bt.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) bt.b(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
