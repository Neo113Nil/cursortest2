package k6;

import java.lang.reflect.Method;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f4198a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f4199b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i = 0;
        int i8 = 0;
        while (true) {
            method = null;
            if (i8 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i8];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i8++;
        }
        f4198a = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (i.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        f4199b = method;
    }
}
