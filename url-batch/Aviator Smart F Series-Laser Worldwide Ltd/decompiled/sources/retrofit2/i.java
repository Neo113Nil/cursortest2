package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public interface i {

    public static abstract class a {
        protected static Type getParameterUpperBound(int i8, ParameterizedType parameterizedType) {
            return z.getParameterUpperBound(i8, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return z.getRawType(type);
        }

        @Nullable
        public i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
            return null;
        }

        @Nullable
        public i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
            return null;
        }

        @Nullable
        public i stringConverter(Type type, Annotation[] annotationArr, v vVar) {
            return null;
        }
    }

    @Nullable
    Object convert(Object obj);
}
