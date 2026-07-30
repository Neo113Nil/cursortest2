package y0;

import u3.q;
import v1.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9772a = g.a(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9773b = 0;

    public static final boolean a(long j8, long j9) {
        return j8 == j9;
    }

    public static final float b(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static String d(long j8) {
        if (b(j8) == c(j8)) {
            return "CornerRadius.circular(" + q.k(b(j8)) + ')';
        }
        return "CornerRadius.elliptical(" + q.k(b(j8)) + ", " + q.k(c(j8)) + ')';
    }
}
