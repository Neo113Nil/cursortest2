package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pc0 implements Comparable {
    public final float m;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.m, ((pc0) obj).m);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pc0) {
            return Float.compare(this.m, ((pc0) obj).m) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.m);
    }

    public final String toString() {
        return b(this.m);
    }
}
