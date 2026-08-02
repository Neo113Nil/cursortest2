package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agb {
    public static final List a = ixc.D(new Class[]{Application.class, afr.class});
    public static final List b = ixc.b(afr.class);

    public static final agd a(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (agd) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.ab(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            Objects.toString(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    public static final Constructor b(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List L = ixc.L(parameterTypes);
            if (ksp.b(list, L)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == L.size() && L.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
