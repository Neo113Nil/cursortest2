package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface CallAdapter {

    public abstract class Factory {
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return Utils.getParameterUpperBound(i, parameterizedType);
        }

        public static Class<?> getRawType(Type type2) {
            return Utils.getRawType(type2);
        }

        public abstract CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit);
    }

    Object adapt(Call call);

    Type responseType();
}
