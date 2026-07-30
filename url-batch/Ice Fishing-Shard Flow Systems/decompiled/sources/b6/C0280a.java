package b6;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0280a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0280a f4161a = new C0280a();

    /* renamed from: b, reason: collision with root package name */
    public static final Integer f4162b;

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
            f4162b = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f4162b = num2;
    }
}
