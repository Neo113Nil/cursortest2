package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6587a = c.f6570a;

    default float a(float f9, float f10, float f11) {
        f6587a.getClass();
        float f12 = f10 + f9;
        if ((f9 >= 0.0f && f12 <= f11) || (f9 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f9) < Math.abs(f13) ? f9 : f13;
    }

    default l.k b() {
        f6587a.getClass();
        return c.f6571b;
    }
}
