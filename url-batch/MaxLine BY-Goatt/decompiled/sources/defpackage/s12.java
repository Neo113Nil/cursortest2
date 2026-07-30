package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class s12 {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public static final a a = new a();
        public static final Method b;
        public static final Method c;

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
                if (Intrinsics.b(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    parameterTypes.getClass();
                    if (Intrinsics.b(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (Intrinsics.b(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List b(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = a.c;
        if (method == null || (invoke = method.invoke(th, null)) == null) {
            return ah0.m;
        }
        List asList = Arrays.asList((Throwable[]) invoke);
        asList.getClass();
        return asList;
    }
}
