package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1038a = e6.m.X(Application.class, n0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f1039b = t6.a.F(n0.class);

    public static final Constructor a(Class cls, List list) {
        r6.k.f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        r6.k.e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            r6.k.e(parameterTypes, "constructor.parameterTypes");
            List i02 = e6.k.i0(parameterTypes);
            if (list.equals(i02)) {
                return constructor;
            }
            if (list.size() == i02.size() && i02.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final w0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (w0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Failed to access " + cls, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
