package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rd1 {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        a(0.0f);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            i21.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rd1) {
            return Float.compare(this.a, ((rd1) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
