package r2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final float f6520d;

    public static final boolean a(float f6, float f8) {
        return Float.compare(f6, f8) == 0;
    }

    public static String b(float f6) {
        if (Float.isNaN(f6)) {
            return "Dp.Unspecified";
        }
        return f6 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f6520d, ((f) obj).f6520d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6520d, ((f) obj).f6520d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6520d);
    }

    public final String toString() {
        return b(this.f6520d);
    }
}
