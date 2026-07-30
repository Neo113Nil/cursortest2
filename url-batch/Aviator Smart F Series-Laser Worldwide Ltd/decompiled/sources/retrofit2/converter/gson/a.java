package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.i;
import retrofit2.v;

/* loaded from: classes5.dex */
public final class a extends i.a {
    private final Gson gson;

    private a(Gson gson) {
        this.gson = gson;
    }

    public static a create() {
        return create(new Gson());
    }

    @Override // retrofit2.i.a
    public i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        return new b(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.i.a
    public i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
        return new c(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    public static a create(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }
}
