package x2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f10322d;

    public static int a(float f3, float f10) {
        if (Float.isNaN(f3) || Float.isNaN(f10)) {
            return 0;
        }
        return Float.compare(f3, f10);
    }

    public static final boolean b(float f3, float f10) {
        return Float.compare(f3, f10) == 0;
    }

    public static String c(float f3) {
        if (Float.isNaN(f3)) {
            return "Dp.Unspecified";
        }
        return f3 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f10322d, ((f) obj).f10322d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f10322d, ((f) obj).f10322d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10322d);
    }

    public final String toString() {
        return c(this.f10322d);
    }
}
