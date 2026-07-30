package l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5867a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5868b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5869c;

    static {
        a(0.0f);
        a(0.5f);
        f5867a = 0.5f;
        a(-1.0f);
        f5868b = -1.0f;
        a(1.0f);
        f5869c = 1.0f;
    }

    public static void a(float f9) {
        if ((0.0f > f9 || f9 > 1.0f) && f9 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
