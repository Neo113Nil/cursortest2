package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kre {
    public static final Method a;

    static {
        int length;
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int i = 0;
        while (true) {
            length = methods.length;
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ksp.b(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (ksp.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        for (int i2 = 0; i2 < length && !ksp.b(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
