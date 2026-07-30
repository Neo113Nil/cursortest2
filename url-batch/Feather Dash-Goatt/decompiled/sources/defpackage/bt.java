package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bt implements Comparable {
    public final float d;

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
        float f = ((bt) obj).d;
        float f2 = this.d;
        if (Float.isNaN(f2) || Float.isNaN(f)) {
            return 0;
        }
        return Float.compare(f2, f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt) {
            return Float.compare(this.d, ((bt) obj).d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d);
    }

    public final String toString() {
        return b(this.d);
    }
}
