package a6;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0183a f3104a = new C0183a();

    /* renamed from: b, reason: collision with root package name */
    public static final Integer f3105b;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f3105b = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f3105b = num2;
    }
}
