package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wq0 {
    public static final vq0 Companion = new vq0();
    public final long PxuCJdSBwIXG;

    public /* synthetic */ wq0(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static final boolean PxuCJdSBwIXG(long j, long j2) {
        return j == j2;
    }

    public static final long TSizfFm2Yiuu(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static String Y1f8riQaR6yg(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return o0.r3s1LDPKFs1S(sb, (int) (j & 4294967295L), ')');
    }

    public static final long lS5Rgt96tfkO(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wq0) {
            return this.PxuCJdSBwIXG == ((wq0) obj).PxuCJdSBwIXG;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return Y1f8riQaR6yg(this.PxuCJdSBwIXG);
    }
}
