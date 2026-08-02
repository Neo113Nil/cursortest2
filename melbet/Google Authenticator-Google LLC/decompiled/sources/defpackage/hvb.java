package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvb {
    public static final /* synthetic */ int a = 0;
    private static final hin b;
    private static final hin c;

    static {
        hih hihVar = hih.a;
        hje hjeVar = new hje(new hcq(new hbu(new gxw(5), hihVar), new hbu(new gxw(6), hihVar)));
        b = hjeVar;
        c = new hbu(new gxw(7), hjeVar);
    }

    public static Exception a(Class cls, Throwable th) {
        List asList = Arrays.asList(cls.getConstructors());
        hin hinVar = c;
        Object[] aa = hnu.aa(asList);
        Arrays.sort(aa, hinVar);
        Iterator it = new ArrayList(Arrays.asList(aa)).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) b((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException(a.aa(cls, "No appropriate constructor for exception of type ", " in response to chained exception"), th);
    }

    private static Object b(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }
}
