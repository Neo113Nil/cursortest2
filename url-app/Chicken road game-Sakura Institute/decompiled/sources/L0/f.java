package L0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3500a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f3501b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3502c;

    static {
        a(0.0f);
        a(0.5f);
        f3500a = 0.5f;
        a(-1.0f);
        f3501b = -1.0f;
        a(1.0f);
        f3502c = 1.0f;
    }

    public static void a(float f4) {
        if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
