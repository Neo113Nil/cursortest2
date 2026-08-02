package retrofit2.converter.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import dev.chrisbanes.haze.Pool;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class ProtoConverterFactory extends Converter.Factory {
    @Override // retrofit2.Converter.Factory
    public final Converter requestBodyConverter(Type type2, Annotation[] annotationArr) {
        if ((type2 instanceof Class) && MessageLite.class.isAssignableFrom((Class) type2)) {
            return new ProtoRequestBodyConverter();
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        Parser parser;
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            if (MessageLite.class.isAssignableFrom(cls)) {
                try {
                    try {
                        parser = (Parser) cls.getDeclaredMethod("parser", null).invoke(null, null);
                    } catch (IllegalAccessException | NoSuchFieldException e) {
                        Handlers$$ExternalSyntheticBUOutline0.m(re$$ExternalSyntheticOutline0.m(cls, new StringBuilder("Found a protobuf message but "), " had no parser() method or PARSER field."), e);
                        return null;
                    }
                } catch (IllegalAccessException | NoSuchMethodException unused) {
                    parser = (Parser) cls.getDeclaredField("PARSER").get(null);
                } catch (InvocationTargetException e2) {
                    a$$ExternalSyntheticBUOutline0.m(e2.getCause());
                    return null;
                }
                return new Pool(parser);
            }
        }
        return null;
    }
}
