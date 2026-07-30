package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.a;
import retrofit2.c;
import retrofit2.i;

/* loaded from: classes5.dex */
public final class v {
    final HttpUrl baseUrl;
    final List<c.a> callAdapterFactories;
    final Call.Factory callFactory;

    @Nullable
    final Executor callbackExecutor;
    final List<i.a> converterFactories;
    private final Map<Method, w> serviceMethodCache = new ConcurrentHashMap();
    final boolean validateEagerly;

    class a implements InvocationHandler {
        final /* synthetic */ Class val$service;
        private final r platform = r.get();
        private final Object[] emptyArgs = new Object[0];

        a(Class cls) {
            this.val$service = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.emptyArgs;
            }
            return this.platform.isDefaultMethod(method) ? this.platform.invokeDefaultMethod(method, this.val$service, obj, objArr) : v.this.loadServiceMethod(method).invoke(objArr);
        }
    }

    v(Call.Factory factory, HttpUrl httpUrl, List<i.a> list, List<c.a> list2, @Nullable Executor executor, boolean z7) {
        this.callFactory = factory;
        this.baseUrl = httpUrl;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z7;
    }

    private void validateServiceInterface(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.validateEagerly) {
            r rVar = r.get();
            for (Method method : cls.getDeclaredMethods()) {
                if (!rVar.isDefaultMethod(method) && !Modifier.isStatic(method.getModifiers())) {
                    loadServiceMethod(method);
                }
            }
        }
    }

    public HttpUrl baseUrl() {
        return this.baseUrl;
    }

    public c callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public List<c.a> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public Call.Factory callFactory() {
        return this.callFactory;
    }

    @Nullable
    public Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public List<i.a> converterFactories() {
        return this.converterFactories;
    }

    public <T> T create(Class<T> cls) {
        validateServiceInterface(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    w loadServiceMethod(Method method) {
        w wVar;
        w wVar2 = this.serviceMethodCache.get(method);
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (this.serviceMethodCache) {
            try {
                wVar = this.serviceMethodCache.get(method);
                if (wVar == null) {
                    wVar = w.parseAnnotations(this, method);
                    this.serviceMethodCache.put(method, wVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    public b newBuilder() {
        return new b(this);
    }

    public c nextCallAdapter(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.callAdapterFactories.indexOf(aVar) + 1;
        int size = this.callAdapterFactories.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            c cVar = this.callAdapterFactories.get(i8).get(type, annotationArr, this);
            if (cVar != null) {
                return cVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < indexOf; i9++) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(i9).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.callAdapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> i nextRequestBodyConverter(@Nullable i.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(aVar) + 1;
        int size = this.converterFactories.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            i requestBodyConverter = this.converterFactories.get(i8).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (requestBodyConverter != null) {
                return requestBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < indexOf; i9++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i9).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> i nextResponseBodyConverter(@Nullable i.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(aVar) + 1;
        int size = this.converterFactories.size();
        for (int i8 = indexOf; i8 < size; i8++) {
            i responseBodyConverter = this.converterFactories.get(i8).responseBodyConverter(type, annotationArr, this);
            if (responseBodyConverter != null) {
                return responseBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i9 = 0; i9 < indexOf; i9++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i9).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> i responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> i stringConverter(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i8 = 0; i8 < size; i8++) {
            i stringConverter = this.converterFactories.get(i8).stringConverter(type, annotationArr, this);
            if (stringConverter != null) {
                return stringConverter;
            }
        }
        return a.d.INSTANCE;
    }

    public static final class b {

        @Nullable
        private HttpUrl baseUrl;
        private final List<c.a> callAdapterFactories;

        @Nullable
        private Call.Factory callFactory;

        @Nullable
        private Executor callbackExecutor;
        private final List<i.a> converterFactories;
        private final r platform;
        private boolean validateEagerly;

        b(r rVar) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = rVar;
        }

        public b addCallAdapterFactory(c.a aVar) {
            List<c.a> list = this.callAdapterFactories;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b addConverterFactory(i.a aVar) {
            List<i.a> list = this.converterFactories;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b baseUrl(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return baseUrl(HttpUrl.get(url.toString()));
        }

        public v build() {
            if (this.baseUrl == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory factory = this.callFactory;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Call.Factory factory2 = factory;
            Executor executor = this.callbackExecutor;
            if (executor == null) {
                executor = this.platform.defaultCallbackExecutor();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.callAdapterFactories);
            arrayList.addAll(this.platform.defaultCallAdapterFactories(executor2));
            ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1 + this.platform.defaultConverterFactoriesSize());
            arrayList2.add(new retrofit2.a());
            arrayList2.addAll(this.converterFactories);
            arrayList2.addAll(this.platform.defaultConverterFactories());
            return new v(factory2, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.validateEagerly);
        }

        public List<c.a> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public b callFactory(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.callFactory = factory;
            return this;
        }

        public b callbackExecutor(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.callbackExecutor = executor;
            return this;
        }

        public b client(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return callFactory(okHttpClient);
        }

        public List<i.a> converterFactories() {
            return this.converterFactories;
        }

        public b validateEagerly(boolean z7) {
            this.validateEagerly = z7;
            return this;
        }

        public b baseUrl(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return baseUrl(HttpUrl.get(str));
        }

        public b() {
            this(r.get());
        }

        b(v vVar) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            r rVar = r.get();
            this.platform = rVar;
            this.callFactory = vVar.callFactory;
            this.baseUrl = vVar.baseUrl;
            int size = vVar.converterFactories.size() - rVar.defaultConverterFactoriesSize();
            for (int i8 = 1; i8 < size; i8++) {
                this.converterFactories.add(vVar.converterFactories.get(i8));
            }
            int size2 = vVar.callAdapterFactories.size() - this.platform.defaultCallAdapterFactoriesSize();
            for (int i9 = 0; i9 < size2; i9++) {
                this.callAdapterFactories.add(vVar.callAdapterFactories.get(i9));
            }
            this.callbackExecutor = vVar.callbackExecutor;
            this.validateEagerly = vVar.validateEagerly;
        }

        public b baseUrl(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            if ("".equals(httpUrl.pathSegments().get(r0.size() - 1))) {
                this.baseUrl = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }
    }
}
