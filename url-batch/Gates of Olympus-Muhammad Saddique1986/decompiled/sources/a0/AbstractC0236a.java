package a0;

import a.AbstractC0235a;
import h2.AbstractC0508a;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0236a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f4716a = AbstractC0235a.b(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4717b = 0;

    public static final boolean a(long j3, long j4) {
        return j3 == j4;
    }

    public static final float b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    public static final float c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    public static String d(long j3) {
        if (b(j3) == c(j3)) {
            return "CornerRadius.circular(" + AbstractC0508a.Y(b(j3)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC0508a.Y(b(j3)) + ", " + AbstractC0508a.Y(c(j3)) + ')';
    }
}
