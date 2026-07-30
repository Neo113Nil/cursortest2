package c6;

import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public class a extends b6.a {

    /* renamed from: c6.a$a, reason: collision with other inner class name */
    private static final class C0006a {
        public static final C0006a INSTANCE = new C0006a();
        public static final Integer sdkVersion;

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
                sdkVersion = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            sdkVersion = num2;
        }

        private C0006a() {
        }
    }

    private final boolean sdkIsNullOrAtLeast(int i8) {
        Integer num = C0006a.sdkVersion;
        return num == null || num.intValue() >= i8;
    }

    @Override // b6.a
    public void addSuppressed(Throwable cause, Throwable exception) {
        s.checkNotNullParameter(cause, "cause");
        s.checkNotNullParameter(exception, "exception");
        if (sdkIsNullOrAtLeast(19)) {
            cause.addSuppressed(exception);
        } else {
            super.addSuppressed(cause, exception);
        }
    }

    @Override // b6.a
    public List<Throwable> getSuppressed(Throwable exception) {
        s.checkNotNullParameter(exception, "exception");
        if (!sdkIsNullOrAtLeast(19)) {
            return super.getSuppressed(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        s.checkNotNullExpressionValue(suppressed, "exception.suppressed");
        return k.asList(suppressed);
    }
}
