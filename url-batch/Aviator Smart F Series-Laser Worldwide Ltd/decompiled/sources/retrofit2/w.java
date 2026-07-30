package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
abstract class w {
    w() {
    }

    static <T> w parseAnnotations(v vVar, Method method) {
        t parseAnnotations = t.parseAnnotations(vVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (z.hasUnresolvableType(genericReturnType)) {
            throw z.methodError(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return m.parseAnnotations(vVar, method, parseAnnotations);
        }
        throw z.methodError(method, "Service methods cannot return void.", new Object[0]);
    }

    @Nullable
    abstract Object invoke(Object[] objArr);
}
