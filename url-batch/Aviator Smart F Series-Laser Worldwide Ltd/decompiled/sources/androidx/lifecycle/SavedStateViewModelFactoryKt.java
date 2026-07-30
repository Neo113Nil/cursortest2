package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.s;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class SavedStateViewModelFactoryKt {
    private static final List<Class<?>> ANDROID_VIEWMODEL_SIGNATURE;
    private static final List<Class<?>> VIEWMODEL_SIGNATURE;

    static {
        List<Class<?>> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Application.class, SavedStateHandle.class});
        ANDROID_VIEWMODEL_SIGNATURE = listOf;
        VIEWMODEL_SIGNATURE = q.listOf(SavedStateHandle.class);
    }

    public static final <T> Constructor<T> findMatchingConstructor(Class<T> modelClass, List<? extends Class<?>> signature) {
        s.checkNotNullParameter(modelClass, "modelClass");
        s.checkNotNullParameter(signature, "signature");
        Object[] constructors = modelClass.getConstructors();
        s.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            s.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            List list = ArraysKt___ArraysKt.toList(parameterTypes);
            if (s.areEqual(signature, list)) {
                s.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final <T extends ViewModel> T newInstance(Class<T> modelClass, Constructor<T> constructor, Object... params) {
        s.checkNotNullParameter(modelClass, "modelClass");
        s.checkNotNullParameter(constructor, "constructor");
        s.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + modelClass, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e10.getCause());
        }
    }
}
