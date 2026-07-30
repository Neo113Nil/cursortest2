package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.ResponseBody;
import retrofit2.i;

/* loaded from: classes5.dex */
final class p extends i.a {
    static final i.a INSTANCE = new p();

    static final class a implements i {
        final i delegate;

        a(i iVar) {
            this.delegate = iVar;
        }

        @Override // retrofit2.i
        public Optional<Object> convert(ResponseBody responseBody) {
            Optional<Object> ofNullable;
            ofNullable = Optional.ofNullable(this.delegate.convert(responseBody));
            return ofNullable;
        }
    }

    p() {
    }

    @Override // retrofit2.i.a
    @Nullable
    public i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
        if (i.a.getRawType(type) != cn.hutool.core.convert.j.a()) {
            return null;
        }
        return new a(vVar.responseBodyConverter(i.a.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
