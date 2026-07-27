package M0;

/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f3545d;

    public static final boolean a(float f4, float f5) {
        return Float.compare(f4, f5) == 0;
    }

    public static String c(float f4) {
        if (Float.isNaN(f4)) {
            return "Dp.Unspecified";
        }
        return f4 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f3545d, ((e) obj).f3545d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f3545d, ((e) obj).f3545d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3545d);
    }

    public final String toString() {
        return c(this.f3545d);
    }
}
