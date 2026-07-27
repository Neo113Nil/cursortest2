package Y;

import u3.l;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4366a = l.I(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4367b = 0;

    public static final boolean a(long j4, long j5) {
        return j4 == j5;
    }

    public static final float b(long j4) {
        return Float.intBitsToFloat((int) (j4 >> 32));
    }

    public static final float c(long j4) {
        return Float.intBitsToFloat((int) (j4 & 4294967295L));
    }

    public static String d(long j4) {
        if (b(j4) == c(j4)) {
            return "CornerRadius.circular(" + M1.a.W(b(j4)) + ')';
        }
        return "CornerRadius.elliptical(" + M1.a.W(b(j4)) + ", " + M1.a.W(c(j4)) + ')';
    }
}
