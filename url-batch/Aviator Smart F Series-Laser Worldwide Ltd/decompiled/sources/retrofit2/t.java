package retrofit2;

import com.baidu.mapapi.http.wrapper.HttpManager;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.q;

/* loaded from: classes5.dex */
final class t {
    private final HttpUrl baseUrl;

    @Nullable
    private final MediaType contentType;
    private final boolean hasBody;

    @Nullable
    private final Headers headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final q[] parameterHandlers;

    @Nullable
    private final String relativeUrl;

    static final class a {

        @Nullable
        MediaType contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;

        @Nullable
        Headers headers;

        @Nullable
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;

        @Nullable
        q[] parameterHandlers;
        final Type[] parameterTypes;

        @Nullable
        String relativeUrl;

        @Nullable
        Set<String> relativeUrlParamNames;
        final v retrofit;
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);

        a(v vVar, Method method) {
            this.retrofit = vVar;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private Headers parseHeaders(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw z.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.contentType = MediaType.get(trim);
                    } catch (IllegalArgumentException e8) {
                        throw z.methodError(this.method, e8, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z7) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw z.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z7;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (PARAM_URL_REGEX.matcher(substring).find()) {
                    throw z.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof r7.b) {
                parseHttpMethodAndPath(HttpManager.HTTP_DELETE, ((r7.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof r7.f) {
                parseHttpMethodAndPath(HttpManager.HTTP_GET, ((r7.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof r7.g) {
                parseHttpMethodAndPath("HEAD", ((r7.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof r7.n) {
                parseHttpMethodAndPath("PATCH", ((r7.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof r7.o) {
                parseHttpMethodAndPath(HttpManager.HTTP_POST, ((r7.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof r7.p) {
                parseHttpMethodAndPath(HttpManager.HTTP_PUT, ((r7.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof r7.m) {
                parseHttpMethodAndPath("OPTIONS", ((r7.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof r7.h) {
                r7.h hVar = (r7.h) annotation;
                parseHttpMethodAndPath(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof r7.k) {
                String[] value = ((r7.k) annotation).value();
                if (value.length == 0) {
                    throw z.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(value);
                return;
            }
            if (annotation instanceof r7.l) {
                if (this.isFormEncoded) {
                    throw z.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof r7.e) {
                if (this.isMultipart) {
                    throw z.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        @Nullable
        private q parseParameter(int i8, Type type, @Nullable Annotation[] annotationArr, boolean z7) {
            q qVar;
            if (annotationArr != null) {
                qVar = null;
                for (Annotation annotation : annotationArr) {
                    q parseParameterAnnotation = parseParameterAnnotation(i8, type, annotationArr, annotation);
                    if (parseParameterAnnotation != null) {
                        if (qVar != null) {
                            throw z.parameterError(this.method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        qVar = parseParameterAnnotation;
                    }
                }
            } else {
                qVar = null;
            }
            if (qVar != null) {
                return qVar;
            }
            if (z7) {
                try {
                    if (z.getRawType(type) == kotlin.coroutines.c.class) {
                        this.isKotlinSuspendFunction = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw z.parameterError(this.method, i8, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        private q parseParameterAnnotation(int i8, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof r7.y) {
                validateResolvableType(i8, type);
                if (this.gotUrl) {
                    throw z.parameterError(this.method, i8, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.gotPath) {
                    throw z.parameterError(this.method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.gotQuery) {
                    throw z.parameterError(this.method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw z.parameterError(this.method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw z.parameterError(this.method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.relativeUrl != null) {
                    throw z.parameterError(this.method, i8, "@Url cannot be used with @%s URL", this.httpMethod);
                }
                this.gotUrl = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new q.p(this.method, i8);
                }
                throw z.parameterError(this.method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof r7.s) {
                validateResolvableType(i8, type);
                if (this.gotQuery) {
                    throw z.parameterError(this.method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw z.parameterError(this.method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw z.parameterError(this.method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.gotUrl) {
                    throw z.parameterError(this.method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.relativeUrl == null) {
                    throw z.parameterError(this.method, i8, "@Path can only be used with relative url on @%s", this.httpMethod);
                }
                this.gotPath = true;
                r7.s sVar = (r7.s) annotation;
                String value = sVar.value();
                validatePathName(i8, value);
                return new q.k(this.method, i8, value, this.retrofit.stringConverter(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof r7.t) {
                validateResolvableType(i8, type);
                r7.t tVar = (r7.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> rawType = z.getRawType(type);
                this.gotQuery = true;
                if (!Iterable.class.isAssignableFrom(rawType)) {
                    return rawType.isArray() ? new q.l(value2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), encoded).array() : new q.l(value2, this.retrofit.stringConverter(type, annotationArr), encoded);
                }
                if (type instanceof ParameterizedType) {
                    return new q.l(value2, this.retrofit.stringConverter(z.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded).iterable();
                }
                throw z.parameterError(this.method, i8, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof r7.v) {
                validateResolvableType(i8, type);
                boolean encoded2 = ((r7.v) annotation).encoded();
                Class<?> rawType2 = z.getRawType(type);
                this.gotQueryName = true;
                if (!Iterable.class.isAssignableFrom(rawType2)) {
                    return rawType2.isArray() ? new q.n(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), encoded2).array() : new q.n(this.retrofit.stringConverter(type, annotationArr), encoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new q.n(this.retrofit.stringConverter(z.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded2).iterable();
                }
                throw z.parameterError(this.method, i8, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof r7.u) {
                validateResolvableType(i8, type);
                Class<?> rawType3 = z.getRawType(type);
                this.gotQueryMap = true;
                if (!Map.class.isAssignableFrom(rawType3)) {
                    throw z.parameterError(this.method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type supertype = z.getSupertype(type, rawType3, Map.class);
                if (!(supertype instanceof ParameterizedType)) {
                    throw z.parameterError(this.method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                Type parameterUpperBound = z.getParameterUpperBound(0, parameterizedType);
                if (String.class == parameterUpperBound) {
                    return new q.m(this.method, i8, this.retrofit.stringConverter(z.getParameterUpperBound(1, parameterizedType), annotationArr), ((r7.u) annotation).encoded());
                }
                throw z.parameterError(this.method, i8, "@QueryMap keys must be of type String: " + parameterUpperBound, new Object[0]);
            }
            if (annotation instanceof r7.i) {
                validateResolvableType(i8, type);
                String value3 = ((r7.i) annotation).value();
                Class<?> rawType4 = z.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType4)) {
                    return rawType4.isArray() ? new q.f(value3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr)).array() : new q.f(value3, this.retrofit.stringConverter(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new q.f(value3, this.retrofit.stringConverter(z.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).iterable();
                }
                throw z.parameterError(this.method, i8, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof r7.j) {
                if (type == Headers.class) {
                    return new q.h(this.method, i8);
                }
                validateResolvableType(i8, type);
                Class<?> rawType5 = z.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType5)) {
                    throw z.parameterError(this.method, i8, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type supertype2 = z.getSupertype(type, rawType5, Map.class);
                if (!(supertype2 instanceof ParameterizedType)) {
                    throw z.parameterError(this.method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                Type parameterUpperBound2 = z.getParameterUpperBound(0, parameterizedType2);
                if (String.class == parameterUpperBound2) {
                    return new q.g(this.method, i8, this.retrofit.stringConverter(z.getParameterUpperBound(1, parameterizedType2), annotationArr));
                }
                throw z.parameterError(this.method, i8, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new Object[0]);
            }
            if (annotation instanceof r7.c) {
                validateResolvableType(i8, type);
                if (!this.isFormEncoded) {
                    throw z.parameterError(this.method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                r7.c cVar = (r7.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.gotField = true;
                Class<?> rawType6 = z.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType6)) {
                    return rawType6.isArray() ? new q.d(value4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), encoded3).array() : new q.d(value4, this.retrofit.stringConverter(type, annotationArr), encoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new q.d(value4, this.retrofit.stringConverter(z.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), encoded3).iterable();
                }
                throw z.parameterError(this.method, i8, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof r7.d) {
                validateResolvableType(i8, type);
                if (!this.isFormEncoded) {
                    throw z.parameterError(this.method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> rawType7 = z.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType7)) {
                    throw z.parameterError(this.method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type supertype3 = z.getSupertype(type, rawType7, Map.class);
                if (!(supertype3 instanceof ParameterizedType)) {
                    throw z.parameterError(this.method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                Type parameterUpperBound3 = z.getParameterUpperBound(0, parameterizedType3);
                if (String.class == parameterUpperBound3) {
                    i stringConverter = this.retrofit.stringConverter(z.getParameterUpperBound(1, parameterizedType3), annotationArr);
                    this.gotField = true;
                    return new q.e(this.method, i8, stringConverter, ((r7.d) annotation).encoded());
                }
                throw z.parameterError(this.method, i8, "@FieldMap keys must be of type String: " + parameterUpperBound3, new Object[0]);
            }
            if (annotation instanceof r7.q) {
                validateResolvableType(i8, type);
                if (!this.isMultipart) {
                    throw z.parameterError(this.method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                r7.q qVar = (r7.q) annotation;
                this.gotPart = true;
                String value5 = qVar.value();
                Class<?> rawType8 = z.getRawType(type);
                if (value5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(rawType8)) {
                        if (rawType8.isArray()) {
                            if (MultipartBody.Part.class.isAssignableFrom(rawType8.getComponentType())) {
                                return q.o.INSTANCE.array();
                            }
                            throw z.parameterError(this.method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                            return q.o.INSTANCE;
                        }
                        throw z.parameterError(this.method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (MultipartBody.Part.class.isAssignableFrom(z.getRawType(z.getParameterUpperBound(0, (ParameterizedType) type)))) {
                            return q.o.INSTANCE.iterable();
                        }
                        throw z.parameterError(this.method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw z.parameterError(this.method, i8, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
                }
                Headers of = Headers.of("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (!Iterable.class.isAssignableFrom(rawType8)) {
                    if (!rawType8.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(rawType8)) {
                            throw z.parameterError(this.method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new q.i(this.method, i8, of, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
                    }
                    Class<?> boxIfPrimitive = boxIfPrimitive(rawType8.getComponentType());
                    if (MultipartBody.Part.class.isAssignableFrom(boxIfPrimitive)) {
                        throw z.parameterError(this.method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new q.i(this.method, i8, of, this.retrofit.requestBodyConverter(boxIfPrimitive, annotationArr, this.methodAnnotations)).array();
                }
                if (type instanceof ParameterizedType) {
                    Type parameterUpperBound4 = z.getParameterUpperBound(0, (ParameterizedType) type);
                    if (MultipartBody.Part.class.isAssignableFrom(z.getRawType(parameterUpperBound4))) {
                        throw z.parameterError(this.method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new q.i(this.method, i8, of, this.retrofit.requestBodyConverter(parameterUpperBound4, annotationArr, this.methodAnnotations)).iterable();
                }
                throw z.parameterError(this.method, i8, rawType8.getSimpleName() + " must include generic type (e.g., " + rawType8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof r7.r) {
                validateResolvableType(i8, type);
                if (!this.isMultipart) {
                    throw z.parameterError(this.method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.gotPart = true;
                Class<?> rawType9 = z.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType9)) {
                    throw z.parameterError(this.method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type supertype4 = z.getSupertype(type, rawType9, Map.class);
                if (!(supertype4 instanceof ParameterizedType)) {
                    throw z.parameterError(this.method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                Type parameterUpperBound5 = z.getParameterUpperBound(0, parameterizedType4);
                if (String.class == parameterUpperBound5) {
                    Type parameterUpperBound6 = z.getParameterUpperBound(1, parameterizedType4);
                    if (MultipartBody.Part.class.isAssignableFrom(z.getRawType(parameterUpperBound6))) {
                        throw z.parameterError(this.method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new q.j(this.method, i8, this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations), ((r7.r) annotation).encoding());
                }
                throw z.parameterError(this.method, i8, "@PartMap keys must be of type String: " + parameterUpperBound5, new Object[0]);
            }
            if (annotation instanceof r7.a) {
                validateResolvableType(i8, type);
                if (this.isFormEncoded || this.isMultipart) {
                    throw z.parameterError(this.method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.gotBody) {
                    throw z.parameterError(this.method, i8, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    i requestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                    this.gotBody = true;
                    return new q.c(this.method, i8, requestBodyConverter);
                } catch (RuntimeException e8) {
                    throw z.parameterError(this.method, e8, i8, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof r7.x)) {
                return null;
            }
            validateResolvableType(i8, type);
            Class<?> rawType10 = z.getRawType(type);
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                q qVar2 = this.parameterHandlers[i9];
                if ((qVar2 instanceof q.C0406q) && ((q.C0406q) qVar2).cls.equals(rawType10)) {
                    throw z.parameterError(this.method, i8, "@Tag type " + rawType10.getName() + " is duplicate of parameter #" + (i9 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new q.C0406q(rawType10);
        }

        static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i8, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw z.parameterError(this.method, i8, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw z.parameterError(this.method, i8, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        private void validateResolvableType(int i8, Type type) {
            if (z.hasUnresolvableType(type)) {
                throw z.parameterError(this.method, i8, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        t build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw z.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw z.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.isFormEncoded) {
                    throw z.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new q[length];
            int i8 = length - 1;
            int i9 = 0;
            while (true) {
                boolean z7 = true;
                if (i9 >= length) {
                    break;
                }
                q[] qVarArr = this.parameterHandlers;
                Type type = this.parameterTypes[i9];
                Annotation[] annotationArr = this.parameterAnnotationsArray[i9];
                if (i9 != i8) {
                    z7 = false;
                }
                qVarArr[i9] = parseParameter(i9, type, annotationArr, z7);
                i9++;
            }
            if (this.relativeUrl == null && !this.gotUrl) {
                throw z.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
            }
            boolean z8 = this.isFormEncoded;
            if (!z8 && !this.isMultipart && !this.hasBody && this.gotBody) {
                throw z.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z8 && !this.gotField) {
                throw z.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.isMultipart || this.gotPart) {
                return new t(this);
            }
            throw z.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    t(a aVar) {
        this.method = aVar.method;
        this.baseUrl = aVar.retrofit.baseUrl;
        this.httpMethod = aVar.httpMethod;
        this.relativeUrl = aVar.relativeUrl;
        this.headers = aVar.headers;
        this.contentType = aVar.contentType;
        this.hasBody = aVar.hasBody;
        this.isFormEncoded = aVar.isFormEncoded;
        this.isMultipart = aVar.isMultipart;
        this.parameterHandlers = aVar.parameterHandlers;
        this.isKotlinSuspendFunction = aVar.isKotlinSuspendFunction;
    }

    static t parseAnnotations(v vVar, Method method) {
        return new a(vVar, method).build();
    }

    Request create(Object[] objArr) {
        q[] qVarArr = this.parameterHandlers;
        int length = objArr.length;
        if (length != qVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + qVarArr.length + ")");
        }
        s sVar = new s(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        if (this.isKotlinSuspendFunction) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            arrayList.add(objArr[i8]);
            qVarArr[i8].apply(sVar, objArr[i8]);
        }
        return sVar.get().tag(n.class, new n(this.method, arrayList)).build();
    }
}
