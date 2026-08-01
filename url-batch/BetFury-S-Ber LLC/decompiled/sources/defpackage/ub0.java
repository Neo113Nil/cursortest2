package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class ub0 {
    public static final List a = vc.f0(Application.class, lb0.class);
    public static final List b = bi.K(lb0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        int i = 0;
        while (true) {
            if (!(i < constructors.length)) {
                return null;
            }
            int i2 = i + 1;
            try {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                parameterTypes.getClass();
                int length = parameterTypes.length;
                List arrayList = length != 0 ? length != 1 ? new ArrayList(new y6(parameterTypes, false)) : bi.K(parameterTypes[0]) : wm.f;
                if (list.equals(arrayList)) {
                    return constructor;
                }
                if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
    }

    public static final om0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (om0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            s9.q("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
