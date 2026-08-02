package j3;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1176a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f13897a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            if (i4 >= length) {
                break;
            }
            Method method2 = methods[i4];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (i.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f13897a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !i.a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}
