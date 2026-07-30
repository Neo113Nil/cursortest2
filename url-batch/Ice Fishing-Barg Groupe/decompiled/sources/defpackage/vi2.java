package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vi2 {
    public static final ui2 Companion = new ui2();
    public static final long lS5Rgt96tfkO = jh0.rtx2ld2ELZv4(0, 0);
    public final long PxuCJdSBwIXG;

    public /* synthetic */ vi2(long j) {
        this.PxuCJdSBwIXG = j;
    }

    public static boolean PxuCJdSBwIXG(long j, Object obj) {
        return (obj instanceof vi2) && j == ((vi2) obj).PxuCJdSBwIXG;
    }

    public static final boolean RAsUl2FVSrh6(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static final boolean TSizfFm2Yiuu(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int Y1f8riQaR6yg(long j) {
        return e9gEMXR7LXtO(j) - a92UlCVFR9N8(j);
    }

    public static final int a92UlCVFR9N8(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int e9gEMXR7LXtO(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean lS5Rgt96tfkO(long j, long j2) {
        return j == j2;
    }

    public static String rtx2ld2ELZv4(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return o0.r3s1LDPKFs1S(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return PxuCJdSBwIXG(this.PxuCJdSBwIXG, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return rtx2ld2ELZv4(this.PxuCJdSBwIXG);
    }
}
