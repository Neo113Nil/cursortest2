package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f724a = kotlin.collections.y.f(Application.class, l0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f725b = kotlin.collections.x.c(l0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List v10 = kotlin.collections.w.v(parameterTypes);
            if (list.equals(v10)) {
                return constructor;
            }
            if (list.size() == v10.size() && v10.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final u0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (u0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            a2.r.l("Failed to access ", cls, e2);
            return null;
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
