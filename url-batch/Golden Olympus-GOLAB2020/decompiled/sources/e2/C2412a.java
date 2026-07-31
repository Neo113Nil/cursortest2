package e2;

import d2.C2403a;
import k2.C3210a;
import kotlin.random.e;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2412a extends C2403a {

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    private static final class C0213a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0213a f36605a = new C0213a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f36606b;

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
                f36606b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f36606b = num2;
        }

        private C0213a() {
        }
    }

    private final boolean c(int i4) {
        Integer num = C0213a.f36606b;
        return num == null || num.intValue() >= i4;
    }

    @Override // c2.C1378a
    public e b() {
        return c(34) ? new C3210a() : super.b();
    }
}
