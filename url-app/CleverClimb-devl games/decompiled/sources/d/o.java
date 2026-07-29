package d;

import b.aa;
import b.ab;
import b.ac;
import b.ad;
import b.e;
import b.s;
import b.t;
import b.v;
import b.w;
import com.aiming.mdt.utils.Constants;
import com.mopub.volley.toolbox.HttpClientStack;
import d.b.q;
import d.b.r;
import d.b.u;
import d.b.x;
import d.j;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: ServiceMethod.java */
/* loaded from: classes2.dex */
final class o<R, T> {

    /* renamed from: a, reason: collision with root package name */
    static final Pattern f9621a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    static final Pattern f9622b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c, reason: collision with root package name */
    final e.a f9623c;

    /* renamed from: d, reason: collision with root package name */
    final c<R, T> f9624d;
    private final t e;
    private final e<ad, R> f;
    private final String g;
    private final String h;
    private final s i;
    private final v j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final j<?>[] n;

    o(a<R, T> aVar) {
        this.f9623c = aVar.f9625a.a();
        this.f9624d = aVar.w;
        this.e = aVar.f9625a.b();
        this.f = aVar.v;
        this.g = aVar.m;
        this.h = aVar.q;
        this.i = aVar.r;
        this.j = aVar.s;
        this.k = aVar.n;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.u;
    }

    aa a(Object... objArr) throws IOException {
        l lVar = new l(this.g, this.e, this.h, this.i, this.j, this.k, this.l, this.m);
        j<?>[] jVarArr = this.n;
        int length = objArr != null ? objArr.length : 0;
        if (length != jVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + jVarArr.length + ")");
        }
        for (int i = 0; i < length; i++) {
            jVarArr[i].a(lVar, objArr[i]);
        }
        return lVar.a();
    }

    R a(ad adVar) throws IOException {
        return this.f.a(adVar);
    }

    /* compiled from: ServiceMethod.java */
    static final class a<T, R> {

        /* renamed from: a, reason: collision with root package name */
        final n f9625a;

        /* renamed from: b, reason: collision with root package name */
        final Method f9626b;

        /* renamed from: c, reason: collision with root package name */
        final Annotation[] f9627c;

        /* renamed from: d, reason: collision with root package name */
        final Annotation[][] f9628d;
        final Type[] e;
        Type f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        String m;
        boolean n;
        boolean o;
        boolean p;
        String q;
        s r;
        v s;
        Set<String> t;
        j<?>[] u;
        e<ad, T> v;
        c<T, R> w;

        a(n nVar, Method method) {
            this.f9625a = nVar;
            this.f9626b = method;
            this.f9627c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.f9628d = method.getParameterAnnotations();
        }

        public o a() {
            this.w = b();
            this.f = this.w.a();
            if (this.f == m.class || this.f == ac.class) {
                throw a("'" + p.a(this.f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.v = c();
            for (Annotation annotation : this.f9627c) {
                a(annotation);
            }
            if (this.m == null) {
                throw a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.n) {
                if (this.p) {
                    throw a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.o) {
                    throw a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f9628d.length;
            this.u = new j[length];
            for (int i = 0; i < length; i++) {
                Type type = this.e[i];
                if (p.d(type)) {
                    throw a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                }
                Annotation[] annotationArr = this.f9628d[i];
                if (annotationArr == null) {
                    throw a(i, "No Retrofit annotation found.", new Object[0]);
                }
                this.u[i] = a(i, type, annotationArr);
            }
            if (this.q == null && !this.l) {
                throw a("Missing either @%s URL or @Url parameter.", this.m);
            }
            if (!this.o && !this.p && !this.n && this.i) {
                throw a("Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (this.o && !this.g) {
                throw a("Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (this.p && !this.h) {
                throw a("Multipart method must contain at least one @Part.", new Object[0]);
            }
            return new o(this);
        }

        private c<T, R> b() {
            Type genericReturnType = this.f9626b.getGenericReturnType();
            if (p.d(genericReturnType)) {
                throw a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw a("Service methods cannot return void.", new Object[0]);
            }
            try {
                return (c<T, R>) this.f9625a.a(genericReturnType, this.f9626b.getAnnotations());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create call adapter for %s", genericReturnType);
            }
        }

        private void a(Annotation annotation) {
            if (annotation instanceof d.b.b) {
                a("DELETE", ((d.b.b) annotation).a(), false);
                return;
            }
            if (annotation instanceof d.b.f) {
                a("GET", ((d.b.f) annotation).a(), false);
                return;
            }
            if (annotation instanceof d.b.g) {
                a("HEAD", ((d.b.g) annotation).a(), false);
                if (!Void.class.equals(this.f)) {
                    throw a("HEAD method must use Void as response type.", new Object[0]);
                }
                return;
            }
            if (annotation instanceof d.b.n) {
                a(HttpClientStack.HttpPatch.METHOD_NAME, ((d.b.n) annotation).a(), true);
                return;
            }
            if (annotation instanceof d.b.o) {
                a("POST", ((d.b.o) annotation).a(), true);
                return;
            }
            if (annotation instanceof d.b.p) {
                a("PUT", ((d.b.p) annotation).a(), true);
                return;
            }
            if (annotation instanceof d.b.m) {
                a("OPTIONS", ((d.b.m) annotation).a(), false);
                return;
            }
            if (annotation instanceof d.b.h) {
                d.b.h hVar = (d.b.h) annotation;
                a(hVar.a(), hVar.b(), hVar.c());
                return;
            }
            if (annotation instanceof d.b.k) {
                String[] a2 = ((d.b.k) annotation).a();
                if (a2.length == 0) {
                    throw a("@Headers annotation is empty.", new Object[0]);
                }
                this.r = a(a2);
                return;
            }
            if (annotation instanceof d.b.l) {
                if (this.o) {
                    throw a("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            } else if (annotation instanceof d.b.e) {
                if (this.p) {
                    throw a("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.o = true;
            }
        }

        private void a(String str, String str2, boolean z) {
            if (this.m != null) {
                throw a("Only one HTTP method is allowed. Found: %s and %s.", this.m, str);
            }
            this.m = str;
            this.n = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (o.f9621a.matcher(substring).find()) {
                    throw a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.q = str2;
            this.t = o.a(str2);
        }

        private s a(String[] strArr) {
            s.a aVar = new s.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (Constants.KEY_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    v a2 = v.a(trim);
                    if (a2 == null) {
                        throw a("Malformed content type: %s", trim);
                    }
                    this.s = a2;
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.a();
        }

        private j<?> a(int i, Type type, Annotation[] annotationArr) {
            j<?> jVar = null;
            for (Annotation annotation : annotationArr) {
                j<?> a2 = a(i, type, annotationArr, annotation);
                if (a2 != null) {
                    if (jVar != null) {
                        throw a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    jVar = a2;
                }
            }
            if (jVar != null) {
                return jVar;
            }
            throw a(i, "No Retrofit annotation found.", new Object[0]);
        }

        private j<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof x) {
                if (this.l) {
                    throw a(i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.j) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.k) {
                    throw a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                }
                if (this.q != null) {
                    throw a(i, "@Url cannot be used with @%s URL", this.m);
                }
                this.l = true;
                if (type == t.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new j.m();
                }
                throw a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof d.b.s) {
                if (this.k) {
                    throw a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.l) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.q == null) {
                    throw a(i, "@Path can only be used with relative url on @%s", this.m);
                }
                this.j = true;
                d.b.s sVar = (d.b.s) annotation;
                String a2 = sVar.a();
                a(i, a2);
                return new j.h(a2, this.f9625a.c(type, annotationArr), sVar.b());
            }
            if (annotation instanceof d.b.t) {
                d.b.t tVar = (d.b.t) annotation;
                String a3 = tVar.a();
                boolean b2 = tVar.b();
                Class<?> a4 = p.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new j.i(a3, this.f9625a.c(p.a(0, (ParameterizedType) type), annotationArr), b2).a();
                }
                if (a4.isArray()) {
                    return new j.i(a3, this.f9625a.c(o.a(a4.getComponentType()), annotationArr), b2).b();
                }
                return new j.i(a3, this.f9625a.c(type, annotationArr), b2);
            }
            if (annotation instanceof d.b.v) {
                boolean a5 = ((d.b.v) annotation).a();
                Class<?> a6 = p.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new j.k(this.f9625a.c(p.a(0, (ParameterizedType) type), annotationArr), a5).a();
                }
                if (a6.isArray()) {
                    return new j.k(this.f9625a.c(o.a(a6.getComponentType()), annotationArr), a5).b();
                }
                return new j.k(this.f9625a.c(type, annotationArr), a5);
            }
            if (annotation instanceof u) {
                Class<?> a7 = p.a(type);
                if (!Map.class.isAssignableFrom(a7)) {
                    throw a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type b3 = p.b(type, a7, Map.class);
                if (!(b3 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) b3;
                Type a8 = p.a(0, parameterizedType);
                if (String.class != a8) {
                    throw a(i, "@QueryMap keys must be of type String: " + a8, new Object[0]);
                }
                return new j.C0418j(this.f9625a.c(p.a(1, parameterizedType), annotationArr), ((u) annotation).a());
            }
            if (annotation instanceof d.b.i) {
                String a9 = ((d.b.i) annotation).a();
                Class<?> a10 = p.a(type);
                if (Iterable.class.isAssignableFrom(a10)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a10.getSimpleName() + " must include generic type (e.g., " + a10.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new j.d(a9, this.f9625a.c(p.a(0, (ParameterizedType) type), annotationArr)).a();
                }
                if (a10.isArray()) {
                    return new j.d(a9, this.f9625a.c(o.a(a10.getComponentType()), annotationArr)).b();
                }
                return new j.d(a9, this.f9625a.c(type, annotationArr));
            }
            if (annotation instanceof d.b.j) {
                Class<?> a11 = p.a(type);
                if (!Map.class.isAssignableFrom(a11)) {
                    throw a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type b4 = p.b(type, a11, Map.class);
                if (!(b4 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) b4;
                Type a12 = p.a(0, parameterizedType2);
                if (String.class != a12) {
                    throw a(i, "@HeaderMap keys must be of type String: " + a12, new Object[0]);
                }
                return new j.e(this.f9625a.c(p.a(1, parameterizedType2), annotationArr));
            }
            if (annotation instanceof d.b.c) {
                if (!this.o) {
                    throw a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                d.b.c cVar = (d.b.c) annotation;
                String a13 = cVar.a();
                boolean b5 = cVar.b();
                this.g = true;
                Class<?> a14 = p.a(type);
                if (Iterable.class.isAssignableFrom(a14)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a14.getSimpleName() + " must include generic type (e.g., " + a14.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new j.b(a13, this.f9625a.c(p.a(0, (ParameterizedType) type), annotationArr), b5).a();
                }
                if (a14.isArray()) {
                    return new j.b(a13, this.f9625a.c(o.a(a14.getComponentType()), annotationArr), b5).b();
                }
                return new j.b(a13, this.f9625a.c(type, annotationArr), b5);
            }
            if (annotation instanceof d.b.d) {
                if (!this.o) {
                    throw a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> a15 = p.a(type);
                if (!Map.class.isAssignableFrom(a15)) {
                    throw a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type b6 = p.b(type, a15, Map.class);
                if (!(b6 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) b6;
                Type a16 = p.a(0, parameterizedType3);
                if (String.class != a16) {
                    throw a(i, "@FieldMap keys must be of type String: " + a16, new Object[0]);
                }
                e<T, String> c2 = this.f9625a.c(p.a(1, parameterizedType3), annotationArr);
                this.g = true;
                return new j.c(c2, ((d.b.d) annotation).a());
            }
            if (annotation instanceof q) {
                if (!this.p) {
                    throw a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                q qVar = (q) annotation;
                this.h = true;
                String a17 = qVar.a();
                Class<?> a18 = p.a(type);
                if (a17.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(a18)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw a(i, a18.getSimpleName() + " must include generic type (e.g., " + a18.getSimpleName() + "<String>)", new Object[0]);
                        }
                        if (!w.b.class.isAssignableFrom(p.a(p.a(0, (ParameterizedType) type)))) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return j.l.f9598a.a();
                    }
                    if (a18.isArray()) {
                        if (!w.b.class.isAssignableFrom(a18.getComponentType())) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return j.l.f9598a.b();
                    }
                    if (w.b.class.isAssignableFrom(a18)) {
                        return j.l.f9598a;
                    }
                    throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                s a19 = s.a("Content-Disposition", "form-data; name=\"" + a17 + "\"", "Content-Transfer-Encoding", qVar.b());
                if (Iterable.class.isAssignableFrom(a18)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a18.getSimpleName() + " must include generic type (e.g., " + a18.getSimpleName() + "<String>)", new Object[0]);
                    }
                    Type a20 = p.a(0, (ParameterizedType) type);
                    if (w.b.class.isAssignableFrom(p.a(a20))) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new j.f(a19, this.f9625a.a(a20, annotationArr, this.f9627c)).a();
                }
                if (a18.isArray()) {
                    Class<?> a21 = o.a(a18.getComponentType());
                    if (w.b.class.isAssignableFrom(a21)) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new j.f(a19, this.f9625a.a(a21, annotationArr, this.f9627c)).b();
                }
                if (w.b.class.isAssignableFrom(a18)) {
                    throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new j.f(a19, this.f9625a.a(type, annotationArr, this.f9627c));
            }
            if (annotation instanceof r) {
                if (!this.p) {
                    throw a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.h = true;
                Class<?> a22 = p.a(type);
                if (!Map.class.isAssignableFrom(a22)) {
                    throw a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type b7 = p.b(type, a22, Map.class);
                if (!(b7 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) b7;
                Type a23 = p.a(0, parameterizedType4);
                if (String.class != a23) {
                    throw a(i, "@PartMap keys must be of type String: " + a23, new Object[0]);
                }
                Type a24 = p.a(1, parameterizedType4);
                if (w.b.class.isAssignableFrom(p.a(a24))) {
                    throw a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new j.g(this.f9625a.a(a24, annotationArr, this.f9627c), ((r) annotation).a());
            }
            if (!(annotation instanceof d.b.a)) {
                return null;
            }
            if (this.o || this.p) {
                throw a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (this.i) {
                throw a(i, "Multiple @Body method annotations found.", new Object[0]);
            }
            try {
                e<T, ab> a25 = this.f9625a.a(type, annotationArr, this.f9627c);
                this.i = true;
                return new j.a(a25);
            } catch (RuntimeException e) {
                throw a(e, i, "Unable to create @Body converter for %s", type);
            }
        }

        private void a(int i, String str) {
            if (!o.f9622b.matcher(str).matches()) {
                throw a(i, "@Path parameter name must match %s. Found: %s", o.f9621a.pattern(), str);
            }
            if (!this.t.contains(str)) {
                throw a(i, "URL \"%s\" does not contain \"{%s}\".", this.q, str);
            }
        }

        private e<ad, T> c() {
            try {
                return this.f9625a.b(this.f, this.f9626b.getAnnotations());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create converter for %s", this.f);
            }
        }

        private RuntimeException a(String str, Object... objArr) {
            return a((Throwable) null, str, objArr);
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + this.f9626b.getDeclaringClass().getSimpleName() + "." + this.f9626b.getName(), th);
        }

        private RuntimeException a(Throwable th, int i, String str, Object... objArr) {
            return a(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        private RuntimeException a(int i, String str, Object... objArr) {
            return a(str + " (parameter #" + (i + 1) + ")", objArr);
        }
    }

    static Set<String> a(String str) {
        Matcher matcher = f9621a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static Class<?> a(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }
}
