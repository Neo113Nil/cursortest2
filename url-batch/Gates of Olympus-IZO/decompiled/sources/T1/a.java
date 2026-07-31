package T1;

import Z1.i;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3279a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.c(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                break;
            }
            Method method2 = methods[i3];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.e(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i3++;
        }
        f3279a = method;
        int length2 = methods.length;
        for (int i4 = 0; i4 < length2 && !i.a(methods[i4].getName(), "getSuppressed"); i4++) {
        }
    }
}
