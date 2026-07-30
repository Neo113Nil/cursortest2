package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public interface c {

    public static abstract class a {
        protected static Type getParameterUpperBound(int i8, ParameterizedType parameterizedType) {
            return z.getParameterUpperBound(i8, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return z.getRawType(type);
        }

        @Nullable
        public abstract c get(Type type, Annotation[] annotationArr, v vVar);
    }

    Object adapt(b bVar);

    Type responseType();
}
