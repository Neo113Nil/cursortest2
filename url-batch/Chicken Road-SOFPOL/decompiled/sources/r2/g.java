package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f6521a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f6521a == ((g) obj).f6521a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6521a);
    }

    public final String toString() {
        long j7 = this.f6521a;
        if (j7 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) f.b(Float.intBitsToFloat((int) (j7 >> 32)))) + ", " + ((Object) f.b(Float.intBitsToFloat((int) (j7 & 4294967295L)))) + ')';
    }
}
