package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k10 implements Comparable {
    public static final j10 Companion = new j10();
    public final float rtx2ld2ELZv4;

    public static int PxuCJdSBwIXG(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String TSizfFm2Yiuu(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean lS5Rgt96tfkO(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return PxuCJdSBwIXG(this.rtx2ld2ELZv4, ((k10) obj).rtx2ld2ELZv4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k10) {
            return Float.compare(this.rtx2ld2ELZv4, ((k10) obj).rtx2ld2ELZv4) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.rtx2ld2ELZv4);
    }

    public final String toString() {
        return TSizfFm2Yiuu(this.rtx2ld2ELZv4);
    }
}
