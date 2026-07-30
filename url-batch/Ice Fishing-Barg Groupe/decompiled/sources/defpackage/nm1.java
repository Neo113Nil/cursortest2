package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class nm1 {
    public static final Method PxuCJdSBwIXG;
    public static final Method lS5Rgt96tfkO;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i2];
            if (cs0.wdg6QnbFHrFF(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (cs0.wdg6QnbFHrFF(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i2++;
        }
        PxuCJdSBwIXG = method2;
        int length2 = methods.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            Method method3 = methods[i];
            if (cs0.wdg6QnbFHrFF(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i++;
        }
        lS5Rgt96tfkO = method;
    }
}
