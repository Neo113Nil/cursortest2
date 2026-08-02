package androidx.lifecycle;

import a.AbstractC0124a;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5027a = d3.j.W(Application.class, B.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f5028b = AbstractC0124a.H(B.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.i.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.i.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.i.d(parameterTypes, "constructor.parameterTypes");
            List Y2 = d3.g.Y(parameterTypes);
            if (signature.equals(Y2)) {
                return constructor;
            }
            if (signature.size() == Y2.size() && Y2.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final J b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (J) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Failed to access " + cls, e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e6.getCause());
        }
    }
}
