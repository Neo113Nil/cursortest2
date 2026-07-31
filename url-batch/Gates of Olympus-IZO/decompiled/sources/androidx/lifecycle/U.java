package androidx.lifecycle;

import a.AbstractC0157a;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4000a = M1.m.c0(Application.class, M.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f4001b = AbstractC0157a.M(M.class);

    public static final Constructor a(Class cls, List list) {
        Z1.i.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        Z1.i.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Z1.i.e(parameterTypes, "constructor.parameterTypes");
            List i02 = M1.k.i0(parameterTypes);
            if (list.equals(i02)) {
                return constructor;
            }
            if (list.size() == i02.size() && i02.containsAll(list)) {
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
