package d;

import b.ab;
import b.ad;
import b.e;
import b.t;
import b.x;
import d.a;
import d.c;
import d.e;
import d.o;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: Retrofit.java */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    final e.a f9610a;

    /* renamed from: b, reason: collision with root package name */
    final t f9611b;

    /* renamed from: c, reason: collision with root package name */
    final List<e.a> f9612c;

    /* renamed from: d, reason: collision with root package name */
    final List<c.a> f9613d;
    final Executor e;
    final boolean f;
    private final Map<Method, o<?, ?>> g = new ConcurrentHashMap();

    n(e.a aVar, t tVar, List<e.a> list, List<c.a> list2, Executor executor, boolean z) {
        this.f9610a = aVar;
        this.f9611b = tVar;
        this.f9612c = Collections.unmodifiableList(list);
        this.f9613d = Collections.unmodifiableList(list2);
        this.e = executor;
        this.f = z;
    }

    public <T> T a(final Class<T> cls) {
        p.a((Class) cls);
        if (this.f) {
            b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: d.n.1

            /* renamed from: c, reason: collision with root package name */
            private final k f9616c = k.a();

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f9616c.a(method)) {
                    return this.f9616c.a(method, cls, obj, objArr);
                }
                o<?, ?> a2 = n.this.a(method);
                return a2.f9624d.a(new i(a2, objArr));
            }
        });
    }

    private void b(Class<?> cls) {
        k a2 = k.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a2.a(method)) {
                a(method);
            }
        }
    }

    o<?, ?> a(Method method) {
        o oVar;
        o<?, ?> oVar2 = this.g.get(method);
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (this.g) {
            oVar = this.g.get(method);
            if (oVar == null) {
                oVar = new o.a(this, method).a();
                this.g.put(method, oVar);
            }
        }
        return oVar;
    }

    public e.a a() {
        return this.f9610a;
    }

    public t b() {
        return this.f9611b;
    }

    public c<?, ?> a(Type type, Annotation[] annotationArr) {
        return a((c.a) null, type, annotationArr);
    }

    public c<?, ?> a(c.a aVar, Type type, Annotation[] annotationArr) {
        p.a(type, "returnType == null");
        p.a(annotationArr, "annotations == null");
        int indexOf = this.f9613d.indexOf(aVar) + 1;
        int size = this.f9613d.size();
        for (int i = indexOf; i < size; i++) {
            c<?, ?> a2 = this.f9613d.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f9613d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f9613d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9613d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<T, ab> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return a(null, type, annotationArr, annotationArr2);
    }

    public <T> e<T, ab> a(e.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        p.a(type, "type == null");
        p.a(annotationArr, "parameterAnnotations == null");
        p.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f9612c.indexOf(aVar) + 1;
        int size = this.f9612c.size();
        for (int i = indexOf; i < size; i++) {
            e<T, ab> eVar = (e<T, ab>) this.f9612c.get(i).a(type, annotationArr, annotationArr2, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f9612c.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f9612c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9612c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<ad, T> b(Type type, Annotation[] annotationArr) {
        return a((e.a) null, type, annotationArr);
    }

    public <T> e<ad, T> a(e.a aVar, Type type, Annotation[] annotationArr) {
        p.a(type, "type == null");
        p.a(annotationArr, "annotations == null");
        int indexOf = this.f9612c.indexOf(aVar) + 1;
        int size = this.f9612c.size();
        for (int i = indexOf; i < size; i++) {
            e<ad, T> eVar = (e<ad, T>) this.f9612c.get(i).a(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f9612c.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f9612c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f9612c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> e<T, String> c(Type type, Annotation[] annotationArr) {
        p.a(type, "type == null");
        p.a(annotationArr, "annotations == null");
        int size = this.f9612c.size();
        for (int i = 0; i < size; i++) {
            e<T, String> eVar = (e<T, String>) this.f9612c.get(i).b(type, annotationArr, this);
            if (eVar != null) {
                return eVar;
            }
        }
        return a.d.f9546a;
    }

    /* compiled from: Retrofit.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final k f9617a;

        /* renamed from: b, reason: collision with root package name */
        private e.a f9618b;

        /* renamed from: c, reason: collision with root package name */
        private t f9619c;

        /* renamed from: d, reason: collision with root package name */
        private final List<e.a> f9620d;
        private final List<c.a> e;
        private Executor f;
        private boolean g;

        a(k kVar) {
            this.f9620d = new ArrayList();
            this.e = new ArrayList();
            this.f9617a = kVar;
            this.f9620d.add(new d.a());
        }

        public a() {
            this(k.a());
        }

        public a a(x xVar) {
            return a((e.a) p.a(xVar, "client == null"));
        }

        public a a(e.a aVar) {
            this.f9618b = (e.a) p.a(aVar, "factory == null");
            return this;
        }

        public a a(String str) {
            p.a(str, "baseUrl == null");
            t e = t.e(str);
            if (e == null) {
                throw new IllegalArgumentException("Illegal URL: " + str);
            }
            return a(e);
        }

        public a a(t tVar) {
            p.a(tVar, "baseUrl == null");
            if (!"".equals(tVar.j().get(r0.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
            }
            this.f9619c = tVar;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a a(e.a aVar) {
            this.f9620d.add(p.a(aVar, "factory == null"));
            return this;
        }

        public n a() {
            if (this.f9619c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            e.a aVar = this.f9618b;
            if (aVar == null) {
                aVar = new x();
            }
            e.a aVar2 = aVar;
            Executor executor = this.f;
            if (executor == null) {
                executor = this.f9617a.b();
            }
            Executor executor2 = executor;
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.add(this.f9617a.a(executor2));
            return new n(aVar2, this.f9619c, new ArrayList(this.f9620d), arrayList, executor2, this.g);
        }
    }
}
