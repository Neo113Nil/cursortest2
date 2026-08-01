package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class a00 {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (kr.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (kr.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !kr.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
