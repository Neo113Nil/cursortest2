package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class sz1 {
    public static final List PxuCJdSBwIXG = fx1.D0aTLcX6Uhyo(Application.class, ez1.class);
    public static final List lS5Rgt96tfkO = fx1.jJwa0q7P5wHq(ez1.class);

    public static final Constructor PxuCJdSBwIXG(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List OYiFbU3x63rc = na.OYiFbU3x63rc(parameterTypes);
            if (list.equals(OYiFbU3x63rc)) {
                return constructor;
            }
            if (list.size() == OYiFbU3x63rc.size() && OYiFbU3x63rc.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final dr2 lS5Rgt96tfkO(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (dr2) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            rc1.dgRBjINgWbAK("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
