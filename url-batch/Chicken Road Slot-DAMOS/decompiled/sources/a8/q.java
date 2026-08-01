package a8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f367a;

    static {
        Object obj;
        Method method = null;
        try {
            obj = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (Throwable unused) {
            obj = null;
        }
        f367a = obj;
        if (obj != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e9) {
                throw e9;
            } catch (Throwable unused2) {
            }
        }
        if (obj == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (ThreadDeath e10) {
                throw e10;
            } catch (Throwable unused3) {
            }
            if (method == null) {
                return;
            }
            method.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
        }
    }
}
