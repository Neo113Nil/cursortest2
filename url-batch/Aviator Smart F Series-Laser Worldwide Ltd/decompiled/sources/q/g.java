package q;

import cn.hutool.core.exceptions.UtilException;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g {
    private static final int ALLOWED_MODES = 15;
    private static Constructor<MethodHandles.Lookup> java8LookupConstructor;
    private static Method privateLookupInMethod;

    static {
        try {
            privateLookupInMethod = c.a().getMethod("privateLookupIn", Class.class, d.a());
        } catch (NoSuchMethodException unused) {
        }
        if (privateLookupInMethod == null) {
            try {
                Constructor<MethodHandles.Lookup> declaredConstructor = d.a().getDeclaredConstructor(Class.class, Integer.TYPE);
                java8LookupConstructor = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException("There is neither 'privateLookupIn(Class, Lookup)' nor 'Lookup(Class, int)' method in java.lang.invoke.MethodHandles.", e8);
            }
        }
    }

    public static MethodHandles.Lookup lookup(Class<?> cls) {
        MethodHandles.Lookup lookup;
        Method method = privateLookupInMethod;
        if (method == null) {
            try {
                return f.a(java8LookupConstructor.newInstance(cls, 15));
            } catch (Exception e8) {
                throw new IllegalStateException("no 'Lookup(Class, int)' method in java.lang.invoke.MethodHandles.", e8);
            }
        }
        try {
            Class a8 = c.a();
            lookup = MethodHandles.lookup();
            return f.a(method.invoke(a8, cls, lookup));
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new UtilException(e9);
        }
    }
}
