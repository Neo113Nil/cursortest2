package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f857a = s6.a.y(Application.class, i0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f858b = s6.a.x(i0.class);

    public static final Constructor a(Class cls, List list) {
        q6.i.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        q6.i.d(constructors, "getConstructors(...)");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            q6.i.d(parameterTypes, "getParameterTypes(...)");
            List R = d6.l.R(parameterTypes);
            if (list.equals(R)) {
                return constructor;
            }
            if (list.size() == R.size() && R.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final r0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (r0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + cls, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e10.getCause());
        }
    }
}
