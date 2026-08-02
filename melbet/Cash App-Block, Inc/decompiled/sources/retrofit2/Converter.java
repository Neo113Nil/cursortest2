package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public interface Converter {

    public abstract class Factory {
        public Converter requestBodyConverter(Type type2, Annotation[] annotationArr) {
            return null;
        }

        public abstract Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit);
    }

    Object convert(Object obj);
}
