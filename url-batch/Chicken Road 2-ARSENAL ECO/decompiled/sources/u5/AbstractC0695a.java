package u5;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0695a {

    /* renamed from: a, reason: collision with root package name */
    public static final Integer f6040a;

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
            f6040a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f6040a = num2;
    }
}
