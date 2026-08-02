package retrofit2.converter.gson;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class GsonConverterFactory extends Converter.Factory {
    public final Gson gson;

    public GsonConverterFactory(Gson gson) {
        this.gson = gson;
    }

    public static GsonConverterFactory create(Gson gson) {
        if (gson != null) {
            return new GsonConverterFactory(gson);
        }
        a$$ExternalSyntheticBUOutline0.m$2("gson == null");
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public final Converter requestBodyConverter(Type type2, Annotation[] annotationArr) {
        TypeToken<?> typeToken = TypeToken.get(type2);
        Gson gson = this.gson;
        return new GsonRequestBodyConverter(gson, gson.getAdapter(typeToken));
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        TypeToken<?> typeToken = TypeToken.get(type2);
        Gson gson = this.gson;
        return new RealWebSocket$connect$1(14, gson, gson.getAdapter(typeToken));
    }
}
