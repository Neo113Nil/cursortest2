package retrofit2.converter.moshi;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.Moshi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    public final Moshi moshi;

    public MoshiConverterFactory(Moshi moshi) {
        this.moshi = moshi;
    }

    public static MoshiConverterFactory create(Moshi moshi) {
        if (moshi != null) {
            return new MoshiConverterFactory(moshi);
        }
        a$$ExternalSyntheticBUOutline0.m$2("moshi == null");
        return null;
    }

    public static Set jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter requestBodyConverter(Type type2, Annotation[] annotationArr) {
        return new MoshiRequestBodyConverter(this.moshi.adapter(type2, jsonAnnotations(annotationArr), null));
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        return new MoshiResponseBodyConverter(this.moshi.adapter(type2, jsonAnnotations(annotationArr), null));
    }
}
