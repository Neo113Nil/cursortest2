package m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e implements Comparable {

    /* renamed from: f, reason: collision with root package name */
    public final float f6312f;

    public static final boolean a(float f9, float f10) {
        return Float.compare(f9, f10) == 0;
    }

    public static String e(float f9) {
        if (Float.isNaN(f9)) {
            return "Dp.Unspecified";
        }
        return f9 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f6312f, ((e) obj).f6312f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return Float.compare(this.f6312f, ((e) obj).f6312f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6312f);
    }

    public final String toString() {
        return e(this.f6312f);
    }
}
