package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5201a = S1.m.A0(Application.class, M.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f5202b = O2.l.l0(M.class);

    public static final Constructor a(Class cls, List list) {
        f2.j.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        f2.j.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            f2.j.e(parameterTypes, "constructor.parameterTypes");
            List w02 = S1.k.w0(parameterTypes);
            if (list.equals(w02)) {
                return constructor;
            }
            if (list.size() == w02.size() && w02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final V b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (V) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Failed to access " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e5.getCause());
        }
    }
}
