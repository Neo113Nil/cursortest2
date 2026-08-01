package w2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f10030b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10031c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f10032d;

    /* renamed from: a, reason: collision with root package name */
    public final float f10033a;

    static {
        a(0.0f);
        a(0.5f);
        f10030b = 0.5f;
        a(-1.0f);
        f10031c = -1.0f;
        a(1.0f);
        f10032d = 1.0f;
    }

    public static void a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            r2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f3) {
        if (f3 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f3 == f10030b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f3 == f10031c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f3 == f10032d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f10033a, ((f) obj).f10033a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10033a);
    }

    public final String toString() {
        return b(this.f10033a);
    }
}
