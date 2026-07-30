package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
abstract class q {

    class a extends q {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Iterable<Object> iterable) {
            if (iterable == null) {
                return;
            }
            Iterator<Object> it = iterable.iterator();
            while (it.hasNext()) {
                q.this.apply(sVar, it.next());
            }
        }
    }

    class b extends q {
        b() {
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i8 = 0; i8 < length; i8++) {
                q.this.apply(sVar, Array.get(obj, i8));
            }
        }
    }

    static final class c extends q {
        private final retrofit2.i converter;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17230p;

        c(Method method, int i8, retrofit2.i iVar) {
            this.method = method;
            this.f17230p = i8;
            this.converter = iVar;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj == null) {
                throw z.parameterError(this.method, this.f17230p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                sVar.setBody((RequestBody) this.converter.convert(obj));
            } catch (IOException e8) {
                throw z.parameterError(this.method, e8, this.f17230p, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    static final class d extends q {
        private final boolean encoded;
        private final String name;
        private final retrofit2.i valueConverter;

        d(String str, retrofit2.i iVar, boolean z7) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = iVar;
            this.encoded = z7;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            String str;
            if (obj == null || (str = (String) this.valueConverter.convert(obj)) == null) {
                return;
            }
            sVar.addFormField(this.name, str, this.encoded);
        }
    }

    static final class e extends q {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17231p;
        private final retrofit2.i valueConverter;

        e(Method method, int i8, retrofit2.i iVar, boolean z7) {
            this.method = method;
            this.f17231p = i8;
            this.valueConverter = iVar;
            this.encoded = z7;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Map<String, Object> map) {
            if (map == null) {
                throw z.parameterError(this.method, this.f17231p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw z.parameterError(this.method, this.f17231p, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw z.parameterError(this.method, this.f17231p, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String str = (String) this.valueConverter.convert(value);
                if (str == null) {
                    throw z.parameterError(this.method, this.f17231p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                sVar.addFormField(key, str, this.encoded);
            }
        }
    }

    static final class f extends q {
        private final String name;
        private final retrofit2.i valueConverter;

        f(String str, retrofit2.i iVar) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = iVar;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            String str;
            if (obj == null || (str = (String) this.valueConverter.convert(obj)) == null) {
                return;
            }
            sVar.addHeader(this.name, str);
        }
    }

    static final class g extends q {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17232p;
        private final retrofit2.i valueConverter;

        g(Method method, int i8, retrofit2.i iVar) {
            this.method = method;
            this.f17232p = i8;
            this.valueConverter = iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Map<String, Object> map) {
            if (map == null) {
                throw z.parameterError(this.method, this.f17232p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw z.parameterError(this.method, this.f17232p, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw z.parameterError(this.method, this.f17232p, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                sVar.addHeader(key, (String) this.valueConverter.convert(value));
            }
        }
    }

    static final class h extends q {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17233p;

        h(Method method, int i8) {
            this.method = method;
            this.f17233p = i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Headers headers) {
            if (headers == null) {
                throw z.parameterError(this.method, this.f17233p, "Headers parameter must not be null.", new Object[0]);
            }
            sVar.addHeaders(headers);
        }
    }

    static final class i extends q {
        private final retrofit2.i converter;
        private final Headers headers;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17234p;

        i(Method method, int i8, Headers headers, retrofit2.i iVar) {
            this.method = method;
            this.f17234p = i8;
            this.headers = headers;
            this.converter = iVar;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            try {
                sVar.addPart(this.headers, (RequestBody) this.converter.convert(obj));
            } catch (IOException e8) {
                throw z.parameterError(this.method, this.f17234p, "Unable to convert " + obj + " to RequestBody", e8);
            }
        }
    }

    static final class j extends q {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17235p;
        private final String transferEncoding;
        private final retrofit2.i valueConverter;

        j(Method method, int i8, retrofit2.i iVar, String str) {
            this.method = method;
            this.f17235p = i8;
            this.valueConverter = iVar;
            this.transferEncoding = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Map<String, Object> map) {
            if (map == null) {
                throw z.parameterError(this.method, this.f17235p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw z.parameterError(this.method, this.f17235p, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw z.parameterError(this.method, this.f17235p, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                sVar.addPart(Headers.of("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), (RequestBody) this.valueConverter.convert(value));
            }
        }
    }

    static final class k extends q {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p, reason: collision with root package name */
        private final int f17236p;
        private final retrofit2.i valueConverter;

        k(Method method, int i8, String str, retrofit2.i iVar, boolean z7) {
            this.method = method;
            this.f17236p = i8;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = iVar;
            this.encoded = z7;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj != null) {
                sVar.addPathParam(this.name, (String) this.valueConverter.convert(obj), this.encoded);
                return;
            }
            throw z.parameterError(this.method, this.f17236p, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    static final class l extends q {
        private final boolean encoded;
        private final String name;
        private final retrofit2.i valueConverter;

        l(String str, retrofit2.i iVar, boolean z7) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = iVar;
            this.encoded = z7;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            String str;
            if (obj == null || (str = (String) this.valueConverter.convert(obj)) == null) {
                return;
            }
            sVar.addQueryParam(this.name, str, this.encoded);
        }
    }

    static final class m extends q {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17237p;
        private final retrofit2.i valueConverter;

        m(Method method, int i8, retrofit2.i iVar, boolean z7) {
            this.method = method;
            this.f17237p = i8;
            this.valueConverter = iVar;
            this.encoded = z7;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable Map<String, Object> map) {
            if (map == null) {
                throw z.parameterError(this.method, this.f17237p, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw z.parameterError(this.method, this.f17237p, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw z.parameterError(this.method, this.f17237p, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String str = (String) this.valueConverter.convert(value);
                if (str == null) {
                    throw z.parameterError(this.method, this.f17237p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                sVar.addQueryParam(key, str, this.encoded);
            }
        }
    }

    static final class n extends q {
        private final boolean encoded;
        private final retrofit2.i nameConverter;

        n(retrofit2.i iVar, boolean z7) {
            this.nameConverter = iVar;
            this.encoded = z7;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            sVar.addQueryParam((String) this.nameConverter.convert(obj), null, this.encoded);
        }
    }

    static final class o extends q {
        static final o INSTANCE = new o();

        private o() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.q
        public void apply(s sVar, @Nullable MultipartBody.Part part) {
            if (part != null) {
                sVar.addPart(part);
            }
        }
    }

    static final class p extends q {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f17238p;

        p(Method method, int i8) {
            this.method = method;
            this.f17238p = i8;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            if (obj == null) {
                throw z.parameterError(this.method, this.f17238p, "@Url parameter is null.", new Object[0]);
            }
            sVar.setRelativeUrl(obj);
        }
    }

    /* renamed from: retrofit2.q$q, reason: collision with other inner class name */
    static final class C0406q extends q {
        final Class<Object> cls;

        C0406q(Class<Object> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.q
        void apply(s sVar, @Nullable Object obj) {
            sVar.addTag(this.cls, obj);
        }
    }

    q() {
    }

    abstract void apply(s sVar, @Nullable Object obj);

    final q array() {
        return new b();
    }

    final q iterable() {
        return new a();
    }
}
