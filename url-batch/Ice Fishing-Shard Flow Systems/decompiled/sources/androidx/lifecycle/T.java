package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3882a = kotlin.collections.r.d(Application.class, L.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f3883b = kotlin.collections.q.b(L.class);

    public static final Constructor a(Class modelClass, List signature) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List r7 = kotlin.collections.p.r(parameterTypes);
            if (Intrinsics.a(signature, r7)) {
                return constructor;
            }
            if (signature.size() == r7.size() && r7.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final W b(Class modelClass, Constructor constructor, Object... params) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            return (W) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + modelClass, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e9.getCause());
        }
    }
}
