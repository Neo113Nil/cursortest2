package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1469a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f1470b;

    static {
        List asList = Arrays.asList(Application.class, G.class);
        X0.f.d(asList, "asList(...)");
        f1469a = asList;
        f1470b = q1.d.M(G.class);
    }

    public static final Constructor a(Class cls, List list) {
        X0.f.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        X0.f.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            X0.f.d(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new O0.e(parameterTypes, false)) : q1.d.M(parameterTypes[0]) : O0.q.f695a;
            if (list.equals(arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final P b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (P) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
        }
    }
}
