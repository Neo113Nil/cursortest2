package I2;

import P2.b;
import P2.c;
import kotlin.Metadata;

/* loaded from: classes.dex */
public class a extends H2.a {

    @Metadata
    /* renamed from: I2.a$a, reason: collision with other inner class name */
    public static final class C0002a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0002a f3375a = new C0002a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f3376b;

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
                f3376b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f3376b = num2;
        }
    }

    public final c b() {
        Integer num = C0002a.f3376b;
        return (num == null || num.intValue() >= 34) ? new Q2.a() : new b();
    }
}
