package d2;

import c2.C1378a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2403a extends C1378a {

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    private static final class C0212a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0212a f36172a = new C0212a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f36173b;

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
                f36173b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f36173b = num2;
        }

        private C0212a() {
        }
    }

    private final boolean c(int i4) {
        Integer num = C0212a.f36173b;
        return num == null || num.intValue() >= i4;
    }

    @Override // c2.C1378a
    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
