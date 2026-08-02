package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkg implements khx {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(kkg.class.getName());
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;

    static {
        Throwable th;
        Method method;
        Method method2;
        Constructor<?> constructor;
        Class<?> cls;
        try {
            cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method2 = cls.getMethod("add", Long.TYPE);
        } catch (Throwable th2) {
            th = th2;
            method = null;
        }
        try {
            cls.getMethod("sum", null);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            th = null;
        } catch (Throwable th3) {
            th = th3;
            method = method2;
            b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
            method2 = method;
            constructor = null;
            if (th == null) {
            }
            c = null;
            d = null;
            a = new RuntimeException(th);
            e = new Object[]{1L};
        }
        if (th == null || constructor == null) {
            c = null;
            d = null;
            a = new RuntimeException(th);
        } else {
            c = constructor;
            d = method2;
            a = null;
        }
        e = new Object[]{1L};
    }

    public kkg() {
        RuntimeException runtimeException = a;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // defpackage.khx
    public final void a() {
        try {
            d.invoke(this.f, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
