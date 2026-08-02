package retrofit2;

import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.Unit;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okio.Buffer;
import retrofit2.Converter;
import retrofit2.converter.wire.WireRequestBodyConverter;
import retrofit2.http.Streaming;

/* loaded from: classes3.dex */
public final class BuiltInConverters extends Converter.Factory {
    public final /* synthetic */ int $r8$classId;

    /* loaded from: classes9.dex */
    public final class RequestBodyConverter implements Converter {
        public final /* synthetic */ int $r8$classId;
        public static final RequestBodyConverter INSTANCE$1 = new RequestBodyConverter(1);
        public static final RequestBodyConverter INSTANCE = new RequestBodyConverter(0);
        public static final RequestBodyConverter INSTANCE$2 = new RequestBodyConverter(2);
        public static final RequestBodyConverter INSTANCE$3 = new RequestBodyConverter(3);

        public /* synthetic */ RequestBodyConverter(int i) {
            this.$r8$classId = i;
        }

        /* JADX WARN: Finally extract failed */
        @Override // retrofit2.Converter
        public final Object convert(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return (RequestBody) obj;
                case 1:
                    ResponseBody responseBody = (ResponseBody) obj;
                    try {
                        Buffer buffer = new Buffer();
                        responseBody.source().readAll(buffer);
                        MediaType contentType = responseBody.contentType();
                        long contentLength = responseBody.contentLength();
                        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.EMPTY;
                        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$12 = new ResponseBody$Companion$asResponseBody$1(contentType, contentLength, buffer);
                        responseBody.close();
                        return responseBody$Companion$asResponseBody$12;
                    } catch (Throwable th) {
                        responseBody.close();
                        throw th;
                    }
                case 2:
                    return (ResponseBody) obj;
                default:
                    ((ResponseBody) obj).close();
                    return null;
            }
        }
    }

    public /* synthetic */ BuiltInConverters(int i) {
        this.$r8$classId = i;
    }

    @Override // retrofit2.Converter.Factory
    public Converter requestBodyConverter(Type type2, Annotation[] annotationArr) {
        switch (this.$r8$classId) {
            case 0:
                if (RequestBody.class.isAssignableFrom(Utils.getRawType(type2))) {
                    return RequestBodyConverter.INSTANCE;
                }
                return null;
            case 1:
            default:
                return super.requestBodyConverter(type2, annotationArr);
            case 2:
                if (!(type2 instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type2;
                if (Message.class.isAssignableFrom(cls)) {
                    return new WireRequestBodyConverter(ProtoAdapter.get(cls));
                }
                return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public final Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        switch (this.$r8$classId) {
            case 0:
                if (type2 == ResponseBody.class) {
                    return Utils.isAnnotationPresent(annotationArr, Streaming.class) ? RequestBodyConverter.INSTANCE$2 : RequestBodyConverter.INSTANCE$1;
                }
                if (type2 == Void.class) {
                    return RequestBodyConverter.INSTANCE$3;
                }
                if (Utils.checkForKotlinUnit && type2 == Unit.class) {
                    return Reflection.INSTANCE$1;
                }
                return null;
            case 1:
                if (Utils.getRawType(type2) != Optional.class) {
                    return null;
                }
                return new o0(retrofit.nextResponseBodyConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type2), annotationArr), 22);
            default:
                if (!(type2 instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type2;
                if (Message.class.isAssignableFrom(cls)) {
                    return new WireRepeatedAdapter(ProtoAdapter.get(cls), 1);
                }
                return null;
        }
    }
}
