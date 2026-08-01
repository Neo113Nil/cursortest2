package p2;

import java.lang.reflect.Method;
import u2.c;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3018a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        c.b(methods);
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            if (i4 >= length) {
                break;
            }
            Method method2 = methods[i4];
            if (c.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                c.d(parameterTypes, "getParameterTypes(...)");
                if (c.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f3018a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !c.a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
