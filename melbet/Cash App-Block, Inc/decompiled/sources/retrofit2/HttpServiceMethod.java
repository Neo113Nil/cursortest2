package retrofit2;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.UnsignedKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.text.Regex;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.AppUpdateData;
import retrofit2.RequestFactory;
import retrofit2.Utils;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* loaded from: classes3.dex */
public abstract class HttpServiceMethod {
    public final Call.Factory callFactory;
    public final RequestFactory requestFactory;
    public final Converter responseConverter;

    public final class CallAdapted extends HttpServiceMethod {
        public final CallAdapter callAdapter;

        public CallAdapted(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object adapt(OkHttpCall okHttpCall, Object[] objArr) {
            return this.callAdapter.adapt(okHttpCall);
        }
    }

    public final class SuspendForBody extends HttpServiceMethod {
        public final CallAdapter callAdapter;
        public final boolean isUnit;

        public SuspendForBody(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter, boolean z) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
            this.isUnit = z;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object adapt(OkHttpCall okHttpCall, Object[] objArr) {
            Call call = (Call) this.callAdapter.adapt(okHttpCall);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                if (!this.isUnit) {
                    return Utils.await(call, continuation);
                }
                call.getClass();
                return Utils.awaitNullable(call, continuation);
            } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
                throw e;
            } catch (Throwable th) {
                Utils.suspendAndThrow(th, continuation);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class SuspendForResponse extends HttpServiceMethod {
        public final CallAdapter callAdapter;

        public SuspendForResponse(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.callAdapter = callAdapter;
        }

        @Override // retrofit2.HttpServiceMethod
        public final Object adapt(OkHttpCall okHttpCall, Object[] objArr) {
            Call call = (Call) this.callAdapter.adapt(okHttpCall);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
                cancellableContinuationImpl.initCancellability();
                cancellableContinuationImpl.invokeOnCancellation(new KotlinExtensions$await$4$1(call, 1));
                call.enqueue(new KotlinExtensions$awaitResponse$2$2(cancellableContinuationImpl, 0));
                Object result = cancellableContinuationImpl.getResult();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                return result;
            } catch (Exception e) {
                Utils.suspendAndThrow(e, continuation);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, Call.Factory factory, Converter converter) {
        this.requestFactory = requestFactory;
        this.callFactory = factory;
        this.responseConverter = converter;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HttpServiceMethod parseAnnotations(Retrofit retrofit, Class cls, final Method method) {
        DefaultCallAdapterFactory defaultCallAdapterFactory;
        Type genericReturnType;
        boolean z;
        boolean z2;
        Utils utils2;
        int i;
        int i2;
        Utils[] utilsArr;
        int i3;
        int i4;
        String str;
        Utils utils3;
        Utils parameterHandler$Part;
        Utils utils4;
        Utils utils5;
        String str2;
        RequestFactory.Builder builder = new RequestFactory.Builder(retrofit, cls, method);
        Annotation[] annotationArr = builder.methodAnnotations;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            boolean z3 = true;
            Utils utils6 = null;
            if (i6 >= length) {
                if (builder.httpMethod == null) {
                    throw Utils.methodError(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!builder.hasBody) {
                    if (builder.isMultipart) {
                        throw Utils.methodError(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (builder.isFormEncoded) {
                        throw Utils.methodError(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = builder.parameterAnnotationsArray;
                int length2 = annotationArr2.length;
                builder.parameterHandlers = new Utils[length2];
                int i7 = length2 - 1;
                final int i8 = 0;
                while (i8 < length2) {
                    Utils[] utilsArr2 = builder.parameterHandlers;
                    Type type2 = builder.parameterTypes[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        utils2 = utils6;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof Url) {
                                builder.validateResolvableType(i8, type2);
                                if (builder.gotUrl) {
                                    throw Utils.parameterError(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (builder.gotPath) {
                                    throw Utils.parameterError(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (builder.gotQuery) {
                                    throw Utils.parameterError(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (builder.gotQueryName) {
                                    throw Utils.parameterError(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (builder.gotQueryMap) {
                                    throw Utils.parameterError(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (builder.relativeUrl != null) {
                                    throw Utils.parameterError(method, i8, "@Url cannot be used with @%s URL", builder.httpMethod);
                                }
                                builder.gotUrl = true;
                                if (type2 != HttpUrl.class && type2 != String.class && type2 != URI.class && (!(type2 instanceof Class) || !"android.net.Uri".equals(((Class) type2).getName()))) {
                                    throw Utils.parameterError(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                final int i12 = 1;
                                utils3 = new Utils(method, i8, i12) { // from class: retrofit2.ParameterHandler$Headers
                                    public final /* synthetic */ int $r8$classId;
                                    public final Method method;
                                    public final int p;

                                    {
                                        this.$r8$classId = i12;
                                        this.method = method;
                                        this.p = i8;
                                    }

                                    @Override // retrofit2.Utils
                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                        int i13 = this.$r8$classId;
                                        int i14 = this.p;
                                        Method method2 = this.method;
                                        switch (i13) {
                                            case 0:
                                                Headers headers = (Headers) obj;
                                                if (headers == null) {
                                                    throw Utils.parameterError(method2, i14, "Headers parameter must not be null.", new Object[0]);
                                                }
                                                Headers.Builder builder2 = requestBuilder.headersBuilder;
                                                builder2.getClass();
                                                int size = headers.size();
                                                for (int i15 = 0; i15 < size; i15++) {
                                                    AppUpdateData.commonAddLenient(builder2, headers.name(i15), headers.value(i15));
                                                }
                                                return;
                                            default:
                                                if (obj == null) {
                                                    throw Utils.parameterError(method2, i14, "@Url parameter is null.", new Object[0]);
                                                }
                                                requestBuilder.relativeUrl = obj.toString();
                                                return;
                                        }
                                    }
                                };
                                str = str3;
                                i = i7;
                            } else {
                                i = i7;
                                boolean z4 = annotation instanceof Path;
                                Retrofit retrofit3 = builder.retrofit;
                                if (z4) {
                                    builder.validateResolvableType(i8, type2);
                                    if (builder.gotQuery) {
                                        throw Utils.parameterError(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (builder.gotQueryName) {
                                        throw Utils.parameterError(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (builder.gotQueryMap) {
                                        throw Utils.parameterError(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (builder.gotUrl) {
                                        throw Utils.parameterError(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (builder.relativeUrl == null) {
                                        throw Utils.parameterError(method, i8, "@Path can only be used with relative url on @%s", builder.httpMethod);
                                    }
                                    builder.gotPath = true;
                                    Path path = (Path) annotation;
                                    final String value = path.value();
                                    if (!RequestFactory.Builder.PARAM_NAME_REGEX.matcher(value).matches()) {
                                        throw Utils.parameterError(method, i8, "@Path parameter name must match %s. Found: %s", RequestFactory.Builder.PARAM_URL_REGEX.pattern(), value);
                                    }
                                    if (!builder.relativeUrlParamNames.contains(value)) {
                                        throw Utils.parameterError(method, i8, "URL \"%s\" does not contain \"{%s}\".", builder.relativeUrl, value);
                                    }
                                    retrofit3.stringConverter(type2, annotationArr3);
                                    final Method method2 = builder.method;
                                    final boolean encoded = path.encoded();
                                    utils3 = new Utils(method2, i8, value, encoded) { // from class: retrofit2.ParameterHandler$Path
                                        public final boolean encoded;
                                        public final Method method;
                                        public final String name;
                                        public final int p;
                                        public final Reflection valueConverter;

                                        {
                                            Reflection reflection = Reflection.INSTANCE;
                                            this.method = method2;
                                            this.p = i8;
                                            Objects.requireNonNull(value, "name == null");
                                            this.name = value;
                                            this.valueConverter = reflection;
                                            this.encoded = encoded;
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
                                        /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
                                        @Override // retrofit2.Utils
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                            String str4;
                                            String replace;
                                            String str5 = this.name;
                                            if (obj == null) {
                                                throw Utils.parameterError(this.method, this.p, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Path parameter \"", str5, "\" value must not be null."), new Object[0]);
                                            }
                                            this.valueConverter.getClass();
                                            String obj2 = obj.toString();
                                            if (requestBuilder.relativeUrl == null) {
                                                Path$$ExternalSyntheticBUOutline0.m$2();
                                                return;
                                            }
                                            int length4 = obj2.length();
                                            int i13 = 0;
                                            while (i13 < length4) {
                                                int codePointAt = obj2.codePointAt(i13);
                                                boolean z5 = this.encoded;
                                                int i14 = 47;
                                                int i15 = -1;
                                                int i16 = 127;
                                                int i17 = 32;
                                                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z5 && (codePointAt == 47 || codePointAt == 37))) {
                                                    Buffer buffer = new Buffer();
                                                    buffer.m4338writeUtf8(0, i13, obj2);
                                                    Buffer buffer2 = null;
                                                    while (i13 < length4) {
                                                        int codePointAt2 = obj2.codePointAt(i13);
                                                        if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                                                            if (codePointAt2 < i17 || codePointAt2 >= i16 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i15 || (!z5 && (codePointAt2 == i14 || codePointAt2 == 37))) {
                                                                if (buffer2 == null) {
                                                                    buffer2 = new Buffer();
                                                                }
                                                                buffer2.writeUtf8CodePoint(codePointAt2);
                                                                long j = buffer2.size;
                                                                long j2 = 0;
                                                                while (j2 < j) {
                                                                    byte b = buffer2.getByte(j2);
                                                                    buffer.m4335writeByte(37);
                                                                    char[] cArr = RequestBuilder.HEX_DIGITS;
                                                                    buffer.m4335writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                                                    buffer.m4335writeByte((int) cArr[b & 15]);
                                                                    j2++;
                                                                    buffer2 = buffer2;
                                                                }
                                                                buffer2.clear();
                                                            } else {
                                                                buffer.writeUtf8CodePoint(codePointAt2);
                                                            }
                                                        }
                                                        i13 += Character.charCount(codePointAt2);
                                                        i14 = 47;
                                                        i15 = -1;
                                                        i16 = 127;
                                                        i17 = 32;
                                                    }
                                                    str4 = buffer.readUtf8();
                                                    replace = requestBuilder.relativeUrl.replace("{" + str5 + "}", str4);
                                                    if (RequestBuilder.PATH_TRAVERSAL.matcher(replace).matches()) {
                                                        requestBuilder.relativeUrl = replace;
                                                        return;
                                                    } else {
                                                        a$$ExternalSyntheticBUOutline0.m$3("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                                                        return;
                                                    }
                                                }
                                                i13 += Character.charCount(codePointAt);
                                            }
                                            str4 = obj2;
                                            replace = requestBuilder.relativeUrl.replace("{" + str5 + "}", str4);
                                            if (RequestBuilder.PATH_TRAVERSAL.matcher(replace).matches()) {
                                            }
                                        }
                                    };
                                    str = str3;
                                } else {
                                    i2 = i10;
                                    utilsArr = utilsArr2;
                                    if (annotation instanceof Query) {
                                        builder.validateResolvableType(i8, type2);
                                        Query query = (Query) annotation;
                                        final String value2 = query.value();
                                        final boolean encoded2 = query.encoded();
                                        i3 = i9;
                                        Class rawType = Utils.getRawType(type2);
                                        i4 = length3;
                                        final int i13 = 1;
                                        builder.gotQuery = true;
                                        if (Iterable.class.isAssignableFrom(rawType)) {
                                            if (!(type2 instanceof ParameterizedType)) {
                                                throw Utils.parameterError(method, i8, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            final int i14 = 0;
                                            retrofit3.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type2), annotationArr3);
                                            final Utils utils7 = new Utils(value2, encoded2, i13) { // from class: retrofit2.ParameterHandler$Field
                                                public final /* synthetic */ int $r8$classId;
                                                public final boolean encoded;
                                                public final String name;
                                                public final Reflection valueConverter;

                                                {
                                                    this.$r8$classId = i13;
                                                    switch (i13) {
                                                        case 1:
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection;
                                                            this.encoded = encoded2;
                                                            break;
                                                        default:
                                                            Reflection reflection2 = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection2;
                                                            this.encoded = encoded2;
                                                            break;
                                                    }
                                                }

                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i15 = this.$r8$classId;
                                                    boolean z5 = this.encoded;
                                                    String str4 = this.name;
                                                    Reflection reflection = this.valueConverter;
                                                    switch (i15) {
                                                        case 0:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj2 = obj.toString();
                                                                if (obj2 != null) {
                                                                    FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                    if (!z5) {
                                                                        builder2.add(str4, obj2);
                                                                        break;
                                                                    } else {
                                                                        builder2.addEncoded(str4, obj2);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj3 = obj.toString();
                                                                if (obj3 != null) {
                                                                    requestBuilder.addQueryParam(str4, obj3, z5);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            utils5 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i15 = i14;
                                                    Utils utils8 = utils7;
                                                    switch (i15) {
                                                        case 0:
                                                            Iterable iterable = (Iterable) obj;
                                                            if (iterable != null) {
                                                                Iterator it = iterable.iterator();
                                                                while (it.hasNext()) {
                                                                    utils8.apply(requestBuilder, it.next());
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (obj != null) {
                                                                int length4 = Array.getLength(obj);
                                                                for (int i16 = 0; i16 < length4; i16++) {
                                                                    utils8.apply(requestBuilder, Array.get(obj, i16));
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                        } else if (rawType.isArray()) {
                                            retrofit3.stringConverter(RequestFactory.Builder.boxIfPrimitive(rawType.getComponentType()), annotationArr3);
                                            final int i15 = 1;
                                            final Utils utils8 = new Utils(value2, encoded2, i15) { // from class: retrofit2.ParameterHandler$Field
                                                public final /* synthetic */ int $r8$classId;
                                                public final boolean encoded;
                                                public final String name;
                                                public final Reflection valueConverter;

                                                {
                                                    this.$r8$classId = i15;
                                                    switch (i15) {
                                                        case 1:
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection;
                                                            this.encoded = encoded2;
                                                            break;
                                                        default:
                                                            Reflection reflection2 = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection2;
                                                            this.encoded = encoded2;
                                                            break;
                                                    }
                                                }

                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i152 = this.$r8$classId;
                                                    boolean z5 = this.encoded;
                                                    String str4 = this.name;
                                                    Reflection reflection = this.valueConverter;
                                                    switch (i152) {
                                                        case 0:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj2 = obj.toString();
                                                                if (obj2 != null) {
                                                                    FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                    if (!z5) {
                                                                        builder2.add(str4, obj2);
                                                                        break;
                                                                    } else {
                                                                        builder2.addEncoded(str4, obj2);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj3 = obj.toString();
                                                                if (obj3 != null) {
                                                                    requestBuilder.addQueryParam(str4, obj3, z5);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            utils5 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i152 = i15;
                                                    Utils utils82 = utils8;
                                                    switch (i152) {
                                                        case 0:
                                                            Iterable iterable = (Iterable) obj;
                                                            if (iterable != null) {
                                                                Iterator it = iterable.iterator();
                                                                while (it.hasNext()) {
                                                                    utils82.apply(requestBuilder, it.next());
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            if (obj != null) {
                                                                int length4 = Array.getLength(obj);
                                                                for (int i16 = 0; i16 < length4; i16++) {
                                                                    utils82.apply(requestBuilder, Array.get(obj, i16));
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                        } else {
                                            final int i16 = 1;
                                            retrofit3.stringConverter(type2, annotationArr3);
                                            utils3 = new Utils(value2, encoded2, i16) { // from class: retrofit2.ParameterHandler$Field
                                                public final /* synthetic */ int $r8$classId;
                                                public final boolean encoded;
                                                public final String name;
                                                public final Reflection valueConverter;

                                                {
                                                    this.$r8$classId = i16;
                                                    switch (i16) {
                                                        case 1:
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection;
                                                            this.encoded = encoded2;
                                                            break;
                                                        default:
                                                            Reflection reflection2 = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value2, "name == null");
                                                            this.name = value2;
                                                            this.valueConverter = reflection2;
                                                            this.encoded = encoded2;
                                                            break;
                                                    }
                                                }

                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i152 = this.$r8$classId;
                                                    boolean z5 = this.encoded;
                                                    String str4 = this.name;
                                                    Reflection reflection = this.valueConverter;
                                                    switch (i152) {
                                                        case 0:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj2 = obj.toString();
                                                                if (obj2 != null) {
                                                                    FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                    if (!z5) {
                                                                        builder2.add(str4, obj2);
                                                                        break;
                                                                    } else {
                                                                        builder2.addEncoded(str4, obj2);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        default:
                                                            if (obj != null) {
                                                                reflection.getClass();
                                                                String obj3 = obj.toString();
                                                                if (obj3 != null) {
                                                                    requestBuilder.addQueryParam(str4, obj3, z5);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }
                                            };
                                            str = str3;
                                        }
                                        utils3 = utils5;
                                        str = str3;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof QueryName) {
                                            builder.validateResolvableType(i8, type2);
                                            final boolean encoded3 = ((QueryName) annotation).encoded();
                                            Class rawType2 = Utils.getRawType(type2);
                                            builder.gotQueryName = true;
                                            if (Iterable.class.isAssignableFrom(rawType2)) {
                                                if (!(type2 instanceof ParameterizedType)) {
                                                    throw Utils.parameterError(method, i8, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                final int i17 = 0;
                                                retrofit3.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type2), annotationArr3);
                                                final Utils utils9 = new Utils(encoded3) { // from class: retrofit2.ParameterHandler$QueryName
                                                    public final boolean encoded;

                                                    {
                                                        this.encoded = encoded3;
                                                    }

                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        if (obj == null) {
                                                            return;
                                                        }
                                                        requestBuilder.addQueryParam(obj.toString(), null, this.encoded);
                                                    }
                                                };
                                                utils5 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        int i152 = i17;
                                                        Utils utils82 = utils9;
                                                        switch (i152) {
                                                            case 0:
                                                                Iterable iterable = (Iterable) obj;
                                                                if (iterable != null) {
                                                                    Iterator it = iterable.iterator();
                                                                    while (it.hasNext()) {
                                                                        utils82.apply(requestBuilder, it.next());
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                if (obj != null) {
                                                                    int length4 = Array.getLength(obj);
                                                                    for (int i162 = 0; i162 < length4; i162++) {
                                                                        utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                };
                                            } else if (rawType2.isArray()) {
                                                retrofit3.stringConverter(RequestFactory.Builder.boxIfPrimitive(rawType2.getComponentType()), annotationArr3);
                                                final Utils utils10 = new Utils(encoded3) { // from class: retrofit2.ParameterHandler$QueryName
                                                    public final boolean encoded;

                                                    {
                                                        this.encoded = encoded3;
                                                    }

                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        if (obj == null) {
                                                            return;
                                                        }
                                                        requestBuilder.addQueryParam(obj.toString(), null, this.encoded);
                                                    }
                                                };
                                                final int i18 = 1;
                                                utils5 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        int i152 = i18;
                                                        Utils utils82 = utils10;
                                                        switch (i152) {
                                                            case 0:
                                                                Iterable iterable = (Iterable) obj;
                                                                if (iterable != null) {
                                                                    Iterator it = iterable.iterator();
                                                                    while (it.hasNext()) {
                                                                        utils82.apply(requestBuilder, it.next());
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                if (obj != null) {
                                                                    int length4 = Array.getLength(obj);
                                                                    for (int i162 = 0; i162 < length4; i162++) {
                                                                        utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                    }
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                };
                                            } else {
                                                retrofit3.stringConverter(type2, annotationArr3);
                                                utils3 = new Utils(encoded3) { // from class: retrofit2.ParameterHandler$QueryName
                                                    public final boolean encoded;

                                                    {
                                                        this.encoded = encoded3;
                                                    }

                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        if (obj == null) {
                                                            return;
                                                        }
                                                        requestBuilder.addQueryParam(obj.toString(), null, this.encoded);
                                                    }
                                                };
                                            }
                                            utils3 = utils5;
                                        } else if (annotation instanceof QueryMap) {
                                            builder.validateResolvableType(i8, type2);
                                            Class rawType3 = Utils.getRawType(type2);
                                            builder.gotQueryMap = true;
                                            if (!Map.class.isAssignableFrom(rawType3)) {
                                                throw Utils.parameterError(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type supertype = Utils.getSupertype(type2, rawType3);
                                            if (!(supertype instanceof ParameterizedType)) {
                                                throw Utils.parameterError(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) supertype;
                                            Type parameterUpperBound = Utils.getParameterUpperBound(0, parameterizedType);
                                            if (String.class != parameterUpperBound) {
                                                throw Utils.parameterError(method, i8, "@QueryMap keys must be of type String: " + parameterUpperBound, new Object[0]);
                                            }
                                            retrofit3.stringConverter(Utils.getParameterUpperBound(1, parameterizedType), annotationArr3);
                                            final boolean encoded4 = ((QueryMap) annotation).encoded();
                                            final int i19 = 2;
                                            utils3 = new Utils(i8, i19, method, encoded4) { // from class: retrofit2.ParameterHandler$FieldMap
                                                public final /* synthetic */ int $r8$classId;
                                                public final boolean encoded;
                                                public final Method method;
                                                public final int p;

                                                {
                                                    this.$r8$classId = i19;
                                                    this.method = method;
                                                    this.p = i8;
                                                    this.encoded = encoded4;
                                                }

                                                @Override // retrofit2.Utils
                                                public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                    int i20 = this.$r8$classId;
                                                    boolean z5 = this.encoded;
                                                    Method method3 = this.method;
                                                    int i21 = this.p;
                                                    switch (i20) {
                                                        case 0:
                                                            Map map = (Map) obj;
                                                            if (map == null) {
                                                                throw Utils.parameterError(method3, i21, "Field map was null.", new Object[0]);
                                                            }
                                                            for (Map.Entry entry : map.entrySet()) {
                                                                String str4 = (String) entry.getKey();
                                                                if (str4 == null) {
                                                                    throw Utils.parameterError(method3, i21, "Field map contained null key.", new Object[0]);
                                                                }
                                                                Object value3 = entry.getValue();
                                                                if (value3 == null) {
                                                                    throw Utils.parameterError(method3, i21, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Field map contained null value for key '", str4, "'."), new Object[0]);
                                                                }
                                                                String obj2 = value3.toString();
                                                                if (obj2 == null) {
                                                                    throw Utils.parameterError(method3, i21, "Field map value '" + value3 + "' converted to null by " + Reflection.class.getName() + " for key '" + str4 + "'.", new Object[0]);
                                                                }
                                                                FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                if (z5) {
                                                                    builder2.addEncoded(str4, obj2);
                                                                } else {
                                                                    builder2.add(str4, obj2);
                                                                }
                                                            }
                                                            return;
                                                        case 1:
                                                            Map map2 = (Map) obj;
                                                            if (map2 == null) {
                                                                throw Utils.parameterError(method3, i21, "Header map was null.", new Object[0]);
                                                            }
                                                            for (Map.Entry entry2 : map2.entrySet()) {
                                                                String str5 = (String) entry2.getKey();
                                                                if (str5 == null) {
                                                                    throw Utils.parameterError(method3, i21, "Header map contained null key.", new Object[0]);
                                                                }
                                                                Object value4 = entry2.getValue();
                                                                if (value4 == null) {
                                                                    throw Utils.parameterError(method3, i21, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header map contained null value for key '", str5, "'."), new Object[0]);
                                                                }
                                                                requestBuilder.addHeader(str5, value4.toString(), z5);
                                                            }
                                                            return;
                                                        default:
                                                            Map map3 = (Map) obj;
                                                            if (map3 == null) {
                                                                throw Utils.parameterError(method3, i21, "Query map was null", new Object[0]);
                                                            }
                                                            for (Map.Entry entry3 : map3.entrySet()) {
                                                                String str6 = (String) entry3.getKey();
                                                                if (str6 == null) {
                                                                    throw Utils.parameterError(method3, i21, "Query map contained null key.", new Object[0]);
                                                                }
                                                                Object value5 = entry3.getValue();
                                                                if (value5 == null) {
                                                                    throw Utils.parameterError(method3, i21, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Query map contained null value for key '", str6, "'."), new Object[0]);
                                                                }
                                                                String obj3 = value5.toString();
                                                                if (obj3 == null) {
                                                                    throw Utils.parameterError(method3, i21, "Query map value '" + value5 + "' converted to null by " + Reflection.class.getName() + " for key '" + str6 + "'.", new Object[0]);
                                                                }
                                                                requestBuilder.addQueryParam(str6, obj3, z5);
                                                            }
                                                            return;
                                                    }
                                                }
                                            };
                                        } else {
                                            str = str3;
                                            if (annotation instanceof Header) {
                                                builder.validateResolvableType(i8, type2);
                                                Header header = (Header) annotation;
                                                final String value3 = header.value();
                                                Class rawType4 = Utils.getRawType(type2);
                                                if (Iterable.class.isAssignableFrom(rawType4)) {
                                                    if (!(type2 instanceof ParameterizedType)) {
                                                        throw Utils.parameterError(method, i8, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    final int i20 = 0;
                                                    retrofit3.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type2), annotationArr3);
                                                    final boolean allowUnsafeNonAsciiValues = header.allowUnsafeNonAsciiValues();
                                                    final Utils utils11 = new Utils(value3, allowUnsafeNonAsciiValues) { // from class: retrofit2.ParameterHandler$Header
                                                        public final boolean allowUnsafeNonAsciiValues;
                                                        public final String name;
                                                        public final Reflection valueConverter;

                                                        {
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value3, "name == null");
                                                            this.name = value3;
                                                            this.valueConverter = reflection;
                                                            this.allowUnsafeNonAsciiValues = allowUnsafeNonAsciiValues;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            if (obj == null) {
                                                                return;
                                                            }
                                                            this.valueConverter.getClass();
                                                            String obj2 = obj.toString();
                                                            if (obj2 == null) {
                                                                return;
                                                            }
                                                            requestBuilder.addHeader(this.name, obj2, this.allowUnsafeNonAsciiValues);
                                                        }
                                                    };
                                                    parameterHandler$Part = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i152 = i20;
                                                            Utils utils82 = utils11;
                                                            switch (i152) {
                                                                case 0:
                                                                    Iterable iterable = (Iterable) obj;
                                                                    if (iterable != null) {
                                                                        Iterator it = iterable.iterator();
                                                                        while (it.hasNext()) {
                                                                            utils82.apply(requestBuilder, it.next());
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (obj != null) {
                                                                        int length4 = Array.getLength(obj);
                                                                        for (int i162 = 0; i162 < length4; i162++) {
                                                                            utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                } else if (rawType4.isArray()) {
                                                    retrofit3.stringConverter(RequestFactory.Builder.boxIfPrimitive(rawType4.getComponentType()), annotationArr3);
                                                    final boolean allowUnsafeNonAsciiValues2 = header.allowUnsafeNonAsciiValues();
                                                    final Utils utils12 = new Utils(value3, allowUnsafeNonAsciiValues2) { // from class: retrofit2.ParameterHandler$Header
                                                        public final boolean allowUnsafeNonAsciiValues;
                                                        public final String name;
                                                        public final Reflection valueConverter;

                                                        {
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value3, "name == null");
                                                            this.name = value3;
                                                            this.valueConverter = reflection;
                                                            this.allowUnsafeNonAsciiValues = allowUnsafeNonAsciiValues2;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            if (obj == null) {
                                                                return;
                                                            }
                                                            this.valueConverter.getClass();
                                                            String obj2 = obj.toString();
                                                            if (obj2 == null) {
                                                                return;
                                                            }
                                                            requestBuilder.addHeader(this.name, obj2, this.allowUnsafeNonAsciiValues);
                                                        }
                                                    };
                                                    final int i21 = 1;
                                                    parameterHandler$Part = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i152 = i21;
                                                            Utils utils82 = utils12;
                                                            switch (i152) {
                                                                case 0:
                                                                    Iterable iterable = (Iterable) obj;
                                                                    if (iterable != null) {
                                                                        Iterator it = iterable.iterator();
                                                                        while (it.hasNext()) {
                                                                            utils82.apply(requestBuilder, it.next());
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (obj != null) {
                                                                        int length4 = Array.getLength(obj);
                                                                        for (int i162 = 0; i162 < length4; i162++) {
                                                                            utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                } else {
                                                    retrofit3.stringConverter(type2, annotationArr3);
                                                    final boolean allowUnsafeNonAsciiValues3 = header.allowUnsafeNonAsciiValues();
                                                    utils3 = new Utils(value3, allowUnsafeNonAsciiValues3) { // from class: retrofit2.ParameterHandler$Header
                                                        public final boolean allowUnsafeNonAsciiValues;
                                                        public final String name;
                                                        public final Reflection valueConverter;

                                                        {
                                                            Reflection reflection = Reflection.INSTANCE;
                                                            Objects.requireNonNull(value3, "name == null");
                                                            this.name = value3;
                                                            this.valueConverter = reflection;
                                                            this.allowUnsafeNonAsciiValues = allowUnsafeNonAsciiValues3;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            if (obj == null) {
                                                                return;
                                                            }
                                                            this.valueConverter.getClass();
                                                            String obj2 = obj.toString();
                                                            if (obj2 == null) {
                                                                return;
                                                            }
                                                            requestBuilder.addHeader(this.name, obj2, this.allowUnsafeNonAsciiValues);
                                                        }
                                                    };
                                                }
                                                utils3 = parameterHandler$Part;
                                            } else if (annotation instanceof HeaderMap) {
                                                if (type2 == Headers.class) {
                                                    final int i22 = 0;
                                                    utils3 = new Utils(method, i8, i22) { // from class: retrofit2.ParameterHandler$Headers
                                                        public final /* synthetic */ int $r8$classId;
                                                        public final Method method;
                                                        public final int p;

                                                        {
                                                            this.$r8$classId = i22;
                                                            this.method = method;
                                                            this.p = i8;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i132 = this.$r8$classId;
                                                            int i142 = this.p;
                                                            Method method22 = this.method;
                                                            switch (i132) {
                                                                case 0:
                                                                    Headers headers = (Headers) obj;
                                                                    if (headers == null) {
                                                                        throw Utils.parameterError(method22, i142, "Headers parameter must not be null.", new Object[0]);
                                                                    }
                                                                    Headers.Builder builder2 = requestBuilder.headersBuilder;
                                                                    builder2.getClass();
                                                                    int size = headers.size();
                                                                    for (int i152 = 0; i152 < size; i152++) {
                                                                        AppUpdateData.commonAddLenient(builder2, headers.name(i152), headers.value(i152));
                                                                    }
                                                                    return;
                                                                default:
                                                                    if (obj == null) {
                                                                        throw Utils.parameterError(method22, i142, "@Url parameter is null.", new Object[0]);
                                                                    }
                                                                    requestBuilder.relativeUrl = obj.toString();
                                                                    return;
                                                            }
                                                        }
                                                    };
                                                } else {
                                                    builder.validateResolvableType(i8, type2);
                                                    Class rawType5 = Utils.getRawType(type2);
                                                    if (!Map.class.isAssignableFrom(rawType5)) {
                                                        throw Utils.parameterError(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type supertype2 = Utils.getSupertype(type2, rawType5);
                                                    if (!(supertype2 instanceof ParameterizedType)) {
                                                        throw Utils.parameterError(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                                                    Type parameterUpperBound2 = Utils.getParameterUpperBound(0, parameterizedType2);
                                                    if (String.class != parameterUpperBound2) {
                                                        throw Utils.parameterError(method, i8, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new Object[0]);
                                                    }
                                                    final int i23 = 1;
                                                    retrofit3.stringConverter(Utils.getParameterUpperBound(1, parameterizedType2), annotationArr3);
                                                    final boolean allowUnsafeNonAsciiValues4 = ((HeaderMap) annotation).allowUnsafeNonAsciiValues();
                                                    utils3 = new Utils(i8, i23, method, allowUnsafeNonAsciiValues4) { // from class: retrofit2.ParameterHandler$FieldMap
                                                        public final /* synthetic */ int $r8$classId;
                                                        public final boolean encoded;
                                                        public final Method method;
                                                        public final int p;

                                                        {
                                                            this.$r8$classId = i23;
                                                            this.method = method;
                                                            this.p = i8;
                                                            this.encoded = allowUnsafeNonAsciiValues4;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i202 = this.$r8$classId;
                                                            boolean z5 = this.encoded;
                                                            Method method3 = this.method;
                                                            int i212 = this.p;
                                                            switch (i202) {
                                                                case 0:
                                                                    Map map = (Map) obj;
                                                                    if (map == null) {
                                                                        throw Utils.parameterError(method3, i212, "Field map was null.", new Object[0]);
                                                                    }
                                                                    for (Map.Entry entry : map.entrySet()) {
                                                                        String str4 = (String) entry.getKey();
                                                                        if (str4 == null) {
                                                                            throw Utils.parameterError(method3, i212, "Field map contained null key.", new Object[0]);
                                                                        }
                                                                        Object value32 = entry.getValue();
                                                                        if (value32 == null) {
                                                                            throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Field map contained null value for key '", str4, "'."), new Object[0]);
                                                                        }
                                                                        String obj2 = value32.toString();
                                                                        if (obj2 == null) {
                                                                            throw Utils.parameterError(method3, i212, "Field map value '" + value32 + "' converted to null by " + Reflection.class.getName() + " for key '" + str4 + "'.", new Object[0]);
                                                                        }
                                                                        FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                        if (z5) {
                                                                            builder2.addEncoded(str4, obj2);
                                                                        } else {
                                                                            builder2.add(str4, obj2);
                                                                        }
                                                                    }
                                                                    return;
                                                                case 1:
                                                                    Map map2 = (Map) obj;
                                                                    if (map2 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Header map was null.", new Object[0]);
                                                                    }
                                                                    for (Map.Entry entry2 : map2.entrySet()) {
                                                                        String str5 = (String) entry2.getKey();
                                                                        if (str5 == null) {
                                                                            throw Utils.parameterError(method3, i212, "Header map contained null key.", new Object[0]);
                                                                        }
                                                                        Object value4 = entry2.getValue();
                                                                        if (value4 == null) {
                                                                            throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header map contained null value for key '", str5, "'."), new Object[0]);
                                                                        }
                                                                        requestBuilder.addHeader(str5, value4.toString(), z5);
                                                                    }
                                                                    return;
                                                                default:
                                                                    Map map3 = (Map) obj;
                                                                    if (map3 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Query map was null", new Object[0]);
                                                                    }
                                                                    for (Map.Entry entry3 : map3.entrySet()) {
                                                                        String str6 = (String) entry3.getKey();
                                                                        if (str6 == null) {
                                                                            throw Utils.parameterError(method3, i212, "Query map contained null key.", new Object[0]);
                                                                        }
                                                                        Object value5 = entry3.getValue();
                                                                        if (value5 == null) {
                                                                            throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Query map contained null value for key '", str6, "'."), new Object[0]);
                                                                        }
                                                                        String obj3 = value5.toString();
                                                                        if (obj3 == null) {
                                                                            throw Utils.parameterError(method3, i212, "Query map value '" + value5 + "' converted to null by " + Reflection.class.getName() + " for key '" + str6 + "'.", new Object[0]);
                                                                        }
                                                                        requestBuilder.addQueryParam(str6, obj3, z5);
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    };
                                                }
                                            } else if (annotation instanceof Field) {
                                                builder.validateResolvableType(i8, type2);
                                                if (!builder.isFormEncoded) {
                                                    throw Utils.parameterError(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Field field = (Field) annotation;
                                                final String value4 = field.value();
                                                final boolean encoded5 = field.encoded();
                                                builder.gotField = true;
                                                Class rawType6 = Utils.getRawType(type2);
                                                if (!Iterable.class.isAssignableFrom(rawType6)) {
                                                    final int i24 = 0;
                                                    if (rawType6.isArray()) {
                                                        retrofit3.stringConverter(RequestFactory.Builder.boxIfPrimitive(rawType6.getComponentType()), annotationArr3);
                                                        final Utils utils13 = new Utils(value4, encoded5, i24) { // from class: retrofit2.ParameterHandler$Field
                                                            public final /* synthetic */ int $r8$classId;
                                                            public final boolean encoded;
                                                            public final String name;
                                                            public final Reflection valueConverter;

                                                            {
                                                                this.$r8$classId = i24;
                                                                switch (i24) {
                                                                    case 1:
                                                                        Reflection reflection = Reflection.INSTANCE;
                                                                        Objects.requireNonNull(value4, "name == null");
                                                                        this.name = value4;
                                                                        this.valueConverter = reflection;
                                                                        this.encoded = encoded5;
                                                                        break;
                                                                    default:
                                                                        Reflection reflection2 = Reflection.INSTANCE;
                                                                        Objects.requireNonNull(value4, "name == null");
                                                                        this.name = value4;
                                                                        this.valueConverter = reflection2;
                                                                        this.encoded = encoded5;
                                                                        break;
                                                                }
                                                            }

                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = this.$r8$classId;
                                                                boolean z5 = this.encoded;
                                                                String str4 = this.name;
                                                                Reflection reflection = this.valueConverter;
                                                                switch (i152) {
                                                                    case 0:
                                                                        if (obj != null) {
                                                                            reflection.getClass();
                                                                            String obj2 = obj.toString();
                                                                            if (obj2 != null) {
                                                                                FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                                if (!z5) {
                                                                                    builder2.add(str4, obj2);
                                                                                    break;
                                                                                } else {
                                                                                    builder2.addEncoded(str4, obj2);
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            reflection.getClass();
                                                                            String obj3 = obj.toString();
                                                                            if (obj3 != null) {
                                                                                requestBuilder.addQueryParam(str4, obj3, z5);
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                        final int i25 = 1;
                                                        parameterHandler$Part = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = i25;
                                                                Utils utils82 = utils13;
                                                                switch (i152) {
                                                                    case 0:
                                                                        Iterable iterable = (Iterable) obj;
                                                                        if (iterable != null) {
                                                                            Iterator it = iterable.iterator();
                                                                            while (it.hasNext()) {
                                                                                utils82.apply(requestBuilder, it.next());
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            int length4 = Array.getLength(obj);
                                                                            for (int i162 = 0; i162 < length4; i162++) {
                                                                                utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    } else {
                                                        retrofit3.stringConverter(type2, annotationArr3);
                                                        utils3 = new Utils(value4, encoded5, i24) { // from class: retrofit2.ParameterHandler$Field
                                                            public final /* synthetic */ int $r8$classId;
                                                            public final boolean encoded;
                                                            public final String name;
                                                            public final Reflection valueConverter;

                                                            {
                                                                this.$r8$classId = i24;
                                                                switch (i24) {
                                                                    case 1:
                                                                        Reflection reflection = Reflection.INSTANCE;
                                                                        Objects.requireNonNull(value4, "name == null");
                                                                        this.name = value4;
                                                                        this.valueConverter = reflection;
                                                                        this.encoded = encoded5;
                                                                        break;
                                                                    default:
                                                                        Reflection reflection2 = Reflection.INSTANCE;
                                                                        Objects.requireNonNull(value4, "name == null");
                                                                        this.name = value4;
                                                                        this.valueConverter = reflection2;
                                                                        this.encoded = encoded5;
                                                                        break;
                                                                }
                                                            }

                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = this.$r8$classId;
                                                                boolean z5 = this.encoded;
                                                                String str4 = this.name;
                                                                Reflection reflection = this.valueConverter;
                                                                switch (i152) {
                                                                    case 0:
                                                                        if (obj != null) {
                                                                            reflection.getClass();
                                                                            String obj2 = obj.toString();
                                                                            if (obj2 != null) {
                                                                                FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                                if (!z5) {
                                                                                    builder2.add(str4, obj2);
                                                                                    break;
                                                                                } else {
                                                                                    builder2.addEncoded(str4, obj2);
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            reflection.getClass();
                                                                            String obj3 = obj.toString();
                                                                            if (obj3 != null) {
                                                                                requestBuilder.addQueryParam(str4, obj3, z5);
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    }
                                                } else {
                                                    if (!(type2 instanceof ParameterizedType)) {
                                                        throw Utils.parameterError(method, i8, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    final int i26 = 0;
                                                    retrofit3.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type2), annotationArr3);
                                                    final Utils utils14 = new Utils(value4, encoded5, i26) { // from class: retrofit2.ParameterHandler$Field
                                                        public final /* synthetic */ int $r8$classId;
                                                        public final boolean encoded;
                                                        public final String name;
                                                        public final Reflection valueConverter;

                                                        {
                                                            this.$r8$classId = i26;
                                                            switch (i26) {
                                                                case 1:
                                                                    Reflection reflection = Reflection.INSTANCE;
                                                                    Objects.requireNonNull(value4, "name == null");
                                                                    this.name = value4;
                                                                    this.valueConverter = reflection;
                                                                    this.encoded = encoded5;
                                                                    break;
                                                                default:
                                                                    Reflection reflection2 = Reflection.INSTANCE;
                                                                    Objects.requireNonNull(value4, "name == null");
                                                                    this.name = value4;
                                                                    this.valueConverter = reflection2;
                                                                    this.encoded = encoded5;
                                                                    break;
                                                            }
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i152 = this.$r8$classId;
                                                            boolean z5 = this.encoded;
                                                            String str4 = this.name;
                                                            Reflection reflection = this.valueConverter;
                                                            switch (i152) {
                                                                case 0:
                                                                    if (obj != null) {
                                                                        reflection.getClass();
                                                                        String obj2 = obj.toString();
                                                                        if (obj2 != null) {
                                                                            FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                            if (!z5) {
                                                                                builder2.add(str4, obj2);
                                                                                break;
                                                                            } else {
                                                                                builder2.addEncoded(str4, obj2);
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (obj != null) {
                                                                        reflection.getClass();
                                                                        String obj3 = obj.toString();
                                                                        if (obj3 != null) {
                                                                            requestBuilder.addQueryParam(str4, obj3, z5);
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                    parameterHandler$Part = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i152 = i26;
                                                            Utils utils82 = utils14;
                                                            switch (i152) {
                                                                case 0:
                                                                    Iterable iterable = (Iterable) obj;
                                                                    if (iterable != null) {
                                                                        Iterator it = iterable.iterator();
                                                                        while (it.hasNext()) {
                                                                            utils82.apply(requestBuilder, it.next());
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (obj != null) {
                                                                        int length4 = Array.getLength(obj);
                                                                        for (int i162 = 0; i162 < length4; i162++) {
                                                                            utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    };
                                                }
                                                utils3 = parameterHandler$Part;
                                            } else if (annotation instanceof FieldMap) {
                                                builder.validateResolvableType(i8, type2);
                                                if (!builder.isFormEncoded) {
                                                    throw Utils.parameterError(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class rawType7 = Utils.getRawType(type2);
                                                if (!Map.class.isAssignableFrom(rawType7)) {
                                                    throw Utils.parameterError(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type supertype3 = Utils.getSupertype(type2, rawType7);
                                                if (!(supertype3 instanceof ParameterizedType)) {
                                                    throw Utils.parameterError(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                                                final int i27 = 0;
                                                Type parameterUpperBound3 = Utils.getParameterUpperBound(0, parameterizedType3);
                                                if (String.class != parameterUpperBound3) {
                                                    throw Utils.parameterError(method, i8, "@FieldMap keys must be of type String: " + parameterUpperBound3, new Object[0]);
                                                }
                                                retrofit3.stringConverter(Utils.getParameterUpperBound(1, parameterizedType3), annotationArr3);
                                                builder.gotField = true;
                                                final boolean encoded6 = ((FieldMap) annotation).encoded();
                                                utils3 = new Utils(i8, i27, method, encoded6) { // from class: retrofit2.ParameterHandler$FieldMap
                                                    public final /* synthetic */ int $r8$classId;
                                                    public final boolean encoded;
                                                    public final Method method;
                                                    public final int p;

                                                    {
                                                        this.$r8$classId = i27;
                                                        this.method = method;
                                                        this.p = i8;
                                                        this.encoded = encoded6;
                                                    }

                                                    @Override // retrofit2.Utils
                                                    public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                        int i202 = this.$r8$classId;
                                                        boolean z5 = this.encoded;
                                                        Method method3 = this.method;
                                                        int i212 = this.p;
                                                        switch (i202) {
                                                            case 0:
                                                                Map map = (Map) obj;
                                                                if (map == null) {
                                                                    throw Utils.parameterError(method3, i212, "Field map was null.", new Object[0]);
                                                                }
                                                                for (Map.Entry entry : map.entrySet()) {
                                                                    String str4 = (String) entry.getKey();
                                                                    if (str4 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Field map contained null key.", new Object[0]);
                                                                    }
                                                                    Object value32 = entry.getValue();
                                                                    if (value32 == null) {
                                                                        throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Field map contained null value for key '", str4, "'."), new Object[0]);
                                                                    }
                                                                    String obj2 = value32.toString();
                                                                    if (obj2 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Field map value '" + value32 + "' converted to null by " + Reflection.class.getName() + " for key '" + str4 + "'.", new Object[0]);
                                                                    }
                                                                    FormBody.Builder builder2 = requestBuilder.formBuilder;
                                                                    if (z5) {
                                                                        builder2.addEncoded(str4, obj2);
                                                                    } else {
                                                                        builder2.add(str4, obj2);
                                                                    }
                                                                }
                                                                return;
                                                            case 1:
                                                                Map map2 = (Map) obj;
                                                                if (map2 == null) {
                                                                    throw Utils.parameterError(method3, i212, "Header map was null.", new Object[0]);
                                                                }
                                                                for (Map.Entry entry2 : map2.entrySet()) {
                                                                    String str5 = (String) entry2.getKey();
                                                                    if (str5 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Header map contained null key.", new Object[0]);
                                                                    }
                                                                    Object value42 = entry2.getValue();
                                                                    if (value42 == null) {
                                                                        throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Header map contained null value for key '", str5, "'."), new Object[0]);
                                                                    }
                                                                    requestBuilder.addHeader(str5, value42.toString(), z5);
                                                                }
                                                                return;
                                                            default:
                                                                Map map3 = (Map) obj;
                                                                if (map3 == null) {
                                                                    throw Utils.parameterError(method3, i212, "Query map was null", new Object[0]);
                                                                }
                                                                for (Map.Entry entry3 : map3.entrySet()) {
                                                                    String str6 = (String) entry3.getKey();
                                                                    if (str6 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Query map contained null key.", new Object[0]);
                                                                    }
                                                                    Object value5 = entry3.getValue();
                                                                    if (value5 == null) {
                                                                        throw Utils.parameterError(method3, i212, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Query map contained null value for key '", str6, "'."), new Object[0]);
                                                                    }
                                                                    String obj3 = value5.toString();
                                                                    if (obj3 == null) {
                                                                        throw Utils.parameterError(method3, i212, "Query map value '" + value5 + "' converted to null by " + Reflection.class.getName() + " for key '" + str6 + "'.", new Object[0]);
                                                                    }
                                                                    requestBuilder.addQueryParam(str6, obj3, z5);
                                                                }
                                                                return;
                                                        }
                                                    }
                                                };
                                            } else if (annotation instanceof Part) {
                                                builder.validateResolvableType(i8, type2);
                                                if (!builder.isMultipart) {
                                                    throw Utils.parameterError(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                Part part = (Part) annotation;
                                                builder.gotPart = true;
                                                String value5 = part.value();
                                                Class rawType8 = Utils.getRawType(type2);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(rawType8);
                                                    final ParameterHandler$RawPart parameterHandler$RawPart = ParameterHandler$RawPart.INSTANCE;
                                                    if (isAssignableFrom) {
                                                        if (!(type2 instanceof ParameterizedType)) {
                                                            throw Utils.parameterError(method, i8, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        final int i28 = 0;
                                                        if (!MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) type2)))) {
                                                            throw Utils.parameterError(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        utils3 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = i28;
                                                                Utils utils82 = parameterHandler$RawPart;
                                                                switch (i152) {
                                                                    case 0:
                                                                        Iterable iterable = (Iterable) obj;
                                                                        if (iterable != null) {
                                                                            Iterator it = iterable.iterator();
                                                                            while (it.hasNext()) {
                                                                                utils82.apply(requestBuilder, it.next());
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            int length4 = Array.getLength(obj);
                                                                            for (int i162 = 0; i162 < length4; i162++) {
                                                                                utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    } else if (rawType8.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(rawType8.getComponentType())) {
                                                            throw Utils.parameterError(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        final int i29 = 1;
                                                        utils3 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = i29;
                                                                Utils utils82 = parameterHandler$RawPart;
                                                                switch (i152) {
                                                                    case 0:
                                                                        Iterable iterable = (Iterable) obj;
                                                                        if (iterable != null) {
                                                                            Iterator it = iterable.iterator();
                                                                            while (it.hasNext()) {
                                                                                utils82.apply(requestBuilder, it.next());
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            int length4 = Array.getLength(obj);
                                                                            for (int i162 = 0; i162 < length4; i162++) {
                                                                                utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                                                            throw Utils.parameterError(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        utils3 = parameterHandler$RawPart;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", part.encoding()};
                                                    Headers headers = Headers.EMPTY;
                                                    Headers of = TuplesKt.of(strArr);
                                                    if (Iterable.class.isAssignableFrom(rawType8)) {
                                                        if (!(type2 instanceof ParameterizedType)) {
                                                            throw Utils.parameterError(method, i8, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        final int i30 = 0;
                                                        Type parameterUpperBound4 = Utils.getParameterUpperBound(0, (ParameterizedType) type2);
                                                        if (MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound4))) {
                                                            throw Utils.parameterError(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        final ParameterHandler$Part parameterHandler$Part2 = new ParameterHandler$Part(method, i8, of, retrofit3.requestBodyConverter(parameterUpperBound4, annotationArr3, annotationArr));
                                                        utils4 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = i30;
                                                                Utils utils82 = parameterHandler$Part2;
                                                                switch (i152) {
                                                                    case 0:
                                                                        Iterable iterable = (Iterable) obj;
                                                                        if (iterable != null) {
                                                                            Iterator it = iterable.iterator();
                                                                            while (it.hasNext()) {
                                                                                utils82.apply(requestBuilder, it.next());
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            int length4 = Array.getLength(obj);
                                                                            for (int i162 = 0; i162 < length4; i162++) {
                                                                                utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    } else if (rawType8.isArray()) {
                                                        Class boxIfPrimitive = RequestFactory.Builder.boxIfPrimitive(rawType8.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(boxIfPrimitive)) {
                                                            throw Utils.parameterError(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        final ParameterHandler$Part parameterHandler$Part3 = new ParameterHandler$Part(method, i8, of, retrofit3.requestBodyConverter(boxIfPrimitive, annotationArr3, annotationArr));
                                                        final int i31 = 1;
                                                        utils4 = new Utils() { // from class: retrofit2.ParameterHandler$1
                                                            @Override // retrofit2.Utils
                                                            public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                                int i152 = i31;
                                                                Utils utils82 = parameterHandler$Part3;
                                                                switch (i152) {
                                                                    case 0:
                                                                        Iterable iterable = (Iterable) obj;
                                                                        if (iterable != null) {
                                                                            Iterator it = iterable.iterator();
                                                                            while (it.hasNext()) {
                                                                                utils82.apply(requestBuilder, it.next());
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        if (obj != null) {
                                                                            int length4 = Array.getLength(obj);
                                                                            for (int i162 = 0; i162 < length4; i162++) {
                                                                                utils82.apply(requestBuilder, Array.get(obj, i162));
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        };
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                                                            throw Utils.parameterError(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        parameterHandler$Part = new ParameterHandler$Part(method, i8, of, retrofit3.requestBodyConverter(type2, annotationArr3, annotationArr));
                                                        utils3 = parameterHandler$Part;
                                                    }
                                                    utils3 = utils4;
                                                }
                                            } else if (annotation instanceof PartMap) {
                                                builder.validateResolvableType(i8, type2);
                                                if (!builder.isMultipart) {
                                                    throw Utils.parameterError(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                builder.gotPart = true;
                                                Class rawType9 = Utils.getRawType(type2);
                                                if (!Map.class.isAssignableFrom(rawType9)) {
                                                    throw Utils.parameterError(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type supertype4 = Utils.getSupertype(type2, rawType9);
                                                if (!(supertype4 instanceof ParameterizedType)) {
                                                    throw Utils.parameterError(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                                                Type parameterUpperBound5 = Utils.getParameterUpperBound(0, parameterizedType4);
                                                if (String.class != parameterUpperBound5) {
                                                    throw Utils.parameterError(method, i8, "@PartMap keys must be of type String: " + parameterUpperBound5, new Object[0]);
                                                }
                                                Type parameterUpperBound6 = Utils.getParameterUpperBound(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(Utils.getRawType(parameterUpperBound6))) {
                                                    throw Utils.parameterError(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                utils3 = new ParameterHandler$Part(method, i8, retrofit3.requestBodyConverter(parameterUpperBound6, annotationArr3, annotationArr), ((PartMap) annotation).encoding());
                                            } else if (annotation instanceof Body) {
                                                builder.validateResolvableType(i8, type2);
                                                if (builder.isFormEncoded || builder.isMultipart) {
                                                    throw Utils.parameterError(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (builder.gotBody) {
                                                    throw Utils.parameterError(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    final Converter requestBodyConverter = retrofit3.requestBodyConverter(type2, annotationArr3, annotationArr);
                                                    builder.gotBody = true;
                                                    utils3 = new Utils(method, i8, requestBodyConverter) { // from class: retrofit2.ParameterHandler$Body
                                                        public final Converter converter;
                                                        public final Method method;
                                                        public final int p;

                                                        {
                                                            this.method = method;
                                                            this.p = i8;
                                                            this.converter = requestBodyConverter;
                                                        }

                                                        @Override // retrofit2.Utils
                                                        public final void apply(RequestBuilder requestBuilder, Object obj) {
                                                            int i32 = this.p;
                                                            Method method3 = this.method;
                                                            if (obj == null) {
                                                                throw Utils.parameterError(method3, i32, "Body parameter value must not be null.", new Object[0]);
                                                            }
                                                            try {
                                                                requestBuilder.body = (RequestBody) this.converter.convert(obj);
                                                            } catch (IOException e) {
                                                                throw Utils.parameterError(method3, e, i32, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unable to convert ", " to RequestBody", obj), new Object[0]);
                                                            }
                                                        }
                                                    };
                                                } catch (RuntimeException e) {
                                                    throw Utils.parameterError(method, e, i8, "Unable to create @Body converter for %s", type2);
                                                }
                                            } else if (annotation instanceof Tag) {
                                                builder.validateResolvableType(i8, type2);
                                                Class boxIfPrimitive2 = RequestFactory.Builder.boxIfPrimitive(Utils.getRawType(type2));
                                                for (int i32 = i8 - 1; i32 >= 0; i32--) {
                                                    Utils utils15 = builder.parameterHandlers[i32];
                                                    if ((utils15 instanceof ParameterHandler$Tag) && ((ParameterHandler$Tag) utils15).cls.equals(boxIfPrimitive2)) {
                                                        StringBuilder sb = new StringBuilder("@Tag type ");
                                                        Boxes$$ExternalSyntheticOutline1.m(boxIfPrimitive2, sb, " is duplicate of ");
                                                        sb.append(Platform.reflection.describeMethodParameter(method, i32));
                                                        sb.append(" and would always overwrite its value.");
                                                        throw Utils.parameterError(method, i8, sb.toString(), new Object[0]);
                                                    }
                                                }
                                                utils3 = new ParameterHandler$Tag(boxIfPrimitive2);
                                            } else {
                                                utils3 = null;
                                            }
                                        }
                                        str = str3;
                                    }
                                    if (utils3 != null) {
                                        if (utils2 != null) {
                                            throw Utils.parameterError(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        utils2 = utils3;
                                    }
                                    i10 = i2 + 1;
                                    annotationArr2 = annotationArr4;
                                    i7 = i;
                                    length2 = i11;
                                    i9 = i3;
                                    utilsArr2 = utilsArr;
                                    length3 = i4;
                                    str3 = str;
                                }
                            }
                            i2 = i10;
                            utilsArr = utilsArr2;
                            i3 = i9;
                            i4 = length3;
                            if (utils3 != null) {
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            utilsArr2 = utilsArr;
                            length3 = i4;
                            str3 = str;
                        }
                    } else {
                        utils2 = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i33 = length2;
                    String str4 = str3;
                    int i34 = i7;
                    Utils[] utilsArr3 = utilsArr2;
                    int i35 = i9;
                    if (utils2 == null) {
                        if (i35 != 0) {
                            try {
                                if (Utils.getRawType(type2) == Continuation.class) {
                                    builder.isKotlinSuspendFunction = true;
                                    utils2 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw Utils.parameterError(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    utilsArr3[i8] = utils2;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i34;
                    length2 = i33;
                    str3 = str4;
                    i5 = 0;
                    utils6 = null;
                }
                String str5 = str3;
                if (builder.relativeUrl == null && !builder.gotUrl) {
                    throw Utils.methodError(method, null, "Missing either @%s URL or @Url parameter.", builder.httpMethod);
                }
                boolean z5 = builder.isFormEncoded;
                if (!z5 && !builder.isMultipart && !builder.hasBody && builder.gotBody) {
                    throw Utils.methodError(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z5 && !builder.gotField) {
                    throw Utils.methodError(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (builder.isMultipart && !builder.gotPart) {
                    throw Utils.methodError(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                RequestFactory requestFactory = new RequestFactory(builder);
                Type genericReturnType2 = method.getGenericReturnType();
                if (Utils.hasUnresolvableType(genericReturnType2)) {
                    throw Utils.methodError(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw Utils.methodError(method, null, "Service methods cannot return void.", new Object[0]);
                }
                boolean z6 = requestFactory.isKotlinSuspendFunction;
                Annotation[] annotations = method.getAnnotations();
                if (z6) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type3 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getLowerBounds()[0];
                    }
                    if (Utils.getRawType(type3) == Response.class && (type3 instanceof ParameterizedType)) {
                        type3 = Utils.getParameterUpperBound(0, (ParameterizedType) type3);
                        z = true;
                        z2 = false;
                    } else {
                        if (Utils.getRawType(type3) == Call.class) {
                            throw Utils.methodError(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Utils.getParameterUpperBound(0, (ParameterizedType) type3));
                        }
                        z2 = Utils.checkForKotlinUnit && type3 == Unit.class;
                        z = false;
                    }
                    genericReturnType = new Utils.ParameterizedTypeImpl(null, Call.class, type3);
                    if (!Utils.isAnnotationPresent(annotations, SkipCallbackExecutor.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = SkipCallbackExecutorImpl.INSTANCE;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    defaultCallAdapterFactory = null;
                } else {
                    defaultCallAdapterFactory = null;
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    CallAdapter nextCallAdapter = retrofit.nextCallAdapter(defaultCallAdapterFactory, genericReturnType, annotations);
                    Type responseType = nextCallAdapter.responseType();
                    if (responseType == okhttp3.Response.class) {
                        throw Utils.methodError(method, null, "'" + Utils.getRawType(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (responseType == Response.class) {
                        throw Utils.methodError(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (((String) requestFactory.httpMethod).equals(str5) && !Void.class.equals(responseType) && (!Utils.checkForKotlinUnit || responseType != Unit.class)) {
                        throw Utils.methodError(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        Converter nextResponseBodyConverter = retrofit.nextResponseBodyConverter(responseType, method.getAnnotations());
                        Call.Factory factory = retrofit.callFactory;
                        return !z6 ? new CallAdapted(requestFactory, factory, nextResponseBodyConverter, nextCallAdapter) : z ? new SuspendForResponse(requestFactory, factory, nextResponseBodyConverter, nextCallAdapter) : new SuspendForBody(requestFactory, factory, nextResponseBodyConverter, nextCallAdapter, z2);
                    } catch (RuntimeException e2) {
                        throw Utils.methodError(method, e2, "Unable to create converter for %s", responseType);
                    }
                } catch (RuntimeException e3) {
                    throw Utils.methodError(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof DELETE) {
                builder.parseHttpMethodAndPath("DELETE", ((DELETE) annotation2).value(), false);
            } else if (annotation2 instanceof GET) {
                builder.parseHttpMethodAndPath("GET", ((GET) annotation2).value(), false);
            } else if (annotation2 instanceof HEAD) {
                builder.parseHttpMethodAndPath("HEAD", ((HEAD) annotation2).value(), false);
            } else if (annotation2 instanceof PATCH) {
                builder.parseHttpMethodAndPath("PATCH", ((PATCH) annotation2).value(), true);
            } else if (annotation2 instanceof POST) {
                builder.parseHttpMethodAndPath("POST", ((POST) annotation2).value(), true);
            } else if (annotation2 instanceof PUT) {
                builder.parseHttpMethodAndPath("PUT", ((PUT) annotation2).value(), true);
            } else if (annotation2 instanceof OPTIONS) {
                builder.parseHttpMethodAndPath("OPTIONS", ((OPTIONS) annotation2).value(), false);
            } else if (annotation2 instanceof HTTP) {
                HTTP http = (HTTP) annotation2;
                builder.parseHttpMethodAndPath(http.method(), http.path(), http.hasBody());
            } else if (annotation2 instanceof retrofit2.http.Headers) {
                retrofit2.http.Headers headers2 = (retrofit2.http.Headers) annotation2;
                String[] value6 = headers2.value();
                if (value6.length == 0) {
                    throw Utils.methodError(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean allowUnsafeNonAsciiValues5 = headers2.allowUnsafeNonAsciiValues();
                Headers.Builder builder2 = new Headers.Builder();
                int length4 = value6.length;
                int i36 = 0;
                while (i36 < length4) {
                    str2 = value6[i36];
                    int indexOf = str2.indexOf(58);
                    boolean z7 = z3;
                    if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                        break loop0;
                    }
                    String substring = str2.substring(0, indexOf);
                    String trim = str2.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            Regex regex = MediaType.TYPE_SUBTYPE;
                            builder.contentType = UnsignedKt.get(trim);
                        } catch (IllegalArgumentException e4) {
                            throw Utils.methodError(method, e4, "Malformed content type: %s", trim);
                        }
                    } else if (allowUnsafeNonAsciiValues5) {
                        builder2.addUnsafeNonAscii(substring, trim);
                    } else {
                        builder2.add(substring, trim);
                    }
                    i36++;
                    z3 = z7;
                }
                builder.headers = builder2.build();
            } else if (annotation2 instanceof Multipart) {
                if (builder.isFormEncoded) {
                    throw Utils.methodError(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                builder.isMultipart = true;
            } else if (!(annotation2 instanceof FormUrlEncoded)) {
                continue;
            } else {
                if (builder.isMultipart) {
                    throw Utils.methodError(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                builder.isFormEncoded = true;
            }
            i6++;
        }
        throw Utils.methodError(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object adapt(OkHttpCall okHttpCall, Object[] objArr);
}
