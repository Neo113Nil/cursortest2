package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qq0 {
    public final long PxuCJdSBwIXG;

    public static long PxuCJdSBwIXG(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qq0) {
            return this.PxuCJdSBwIXG == ((qq0) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.PxuCJdSBwIXG;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return o0.r3s1LDPKFs1S(sb, (int) (j & 4294967295L), ')');
    }
}
