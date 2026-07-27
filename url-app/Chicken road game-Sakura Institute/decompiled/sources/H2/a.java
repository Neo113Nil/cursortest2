package H2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class a extends G2.a {

    @Metadata
    /* renamed from: H2.a$a, reason: collision with other inner class name */
    public static final class C0001a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0001a f3322a = new C0001a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f3323b;

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
                f3323b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f3323b = num2;
        }
    }

    @Override // G2.a
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = C0001a.f3323b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
