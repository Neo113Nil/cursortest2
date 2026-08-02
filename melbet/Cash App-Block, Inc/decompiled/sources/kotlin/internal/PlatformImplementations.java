package kotlin.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class PlatformImplementations {

    /* loaded from: classes9.dex */
    public final class ReflectThrowable {
        public static final ReflectThrowable INSTANCE = new ReflectThrowable();
        public static final Method addSuppressed;
        public static final Method getSuppressed;

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
                if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    parameterTypes.getClass();
                    if (Intrinsics.areEqual(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            getSuppressed = method;
        }
    }

    public void addSuppressed(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        Method method = ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List getSuppressed(Throwable th) {
        Object invoke;
        th.getClass();
        Method method = ReflectThrowable.getSuppressed;
        if (method == null || (invoke = method.invoke(th, null)) == null) {
            return EmptyList.INSTANCE;
        }
        List asList = Arrays.asList((Throwable[]) invoke);
        asList.getClass();
        return asList;
    }
}
