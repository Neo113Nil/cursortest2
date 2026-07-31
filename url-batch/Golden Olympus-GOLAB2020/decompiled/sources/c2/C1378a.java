package c2;

import java.lang.reflect.Method;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.e;
import org.jetbrains.annotations.NotNull;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1378a {

    /* renamed from: c2.a$a, reason: collision with other inner class name */
    private static final class C0129a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0129a f13346a = new C0129a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f13347b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f13348c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i5];
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (Intrinsics.areEqual(AbstractC3219i.u0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i5++;
            }
            f13347b = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i4++;
            }
            f13348c = method;
        }

        private C0129a() {
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0129a.f13347b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public e b() {
        return new kotlin.random.b();
    }
}
