package pd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7702a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Method f7703b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f7704c;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i10];
            if (Intrinsics.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                parameterTypes.getClass();
                if (Intrinsics.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i10++;
        }
        f7703b = method2;
        int length2 = methods.length;
        while (true) {
            if (i3 >= length2) {
                break;
            }
            Method method3 = methods[i3];
            if (Intrinsics.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
            i3++;
        }
        f7704c = method;
    }
}
