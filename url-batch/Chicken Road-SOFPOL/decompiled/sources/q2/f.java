package q2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f6044b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6045c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6046d;

    /* renamed from: a, reason: collision with root package name */
    public final float f6047a;

    static {
        a(0.0f);
        a(0.5f);
        f6044b = 0.5f;
        a(-1.0f);
        f6045c = -1.0f;
        a(1.0f);
        f6046d = 1.0f;
    }

    public static void a(float f6) {
        if ((0.0f > f6 || f6 > 1.0f) && f6 != -1.0f) {
            l2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f6) {
        if (f6 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f6 == f6044b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f6 == f6045c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f6 == f6046d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f6 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6047a, ((f) obj).f6047a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6047a);
    }

    public final String toString() {
        return b(this.f6047a);
    }
}
