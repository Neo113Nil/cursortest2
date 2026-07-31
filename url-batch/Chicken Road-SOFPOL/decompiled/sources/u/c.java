package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6945a = b.f6931a;

    default float a(float f6, float f8, float f9) {
        f6945a.getClass();
        float f10 = f8 + f6;
        if ((f6 >= 0.0f && f10 <= f9) || (f6 < 0.0f && f10 > f9)) {
            return 0.0f;
        }
        float f11 = f10 - f9;
        return Math.abs(f6) < Math.abs(f11) ? f6 : f11;
    }
}
