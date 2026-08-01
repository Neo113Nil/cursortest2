package d3;

import i3.d;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f1306a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        d.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (d.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                d.d(parameterTypes, "getParameterTypes(...)");
                if (d.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f1306a = method;
        int length2 = methods.length;
        for (int i4 = 0; i4 < length2 && !d.a(methods[i4].getName(), "getSuppressed"); i4++) {
        }
    }
}
