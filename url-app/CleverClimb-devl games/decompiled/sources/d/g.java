package d;

import d.c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: ExecutorCallAdapterFactory.java */
/* loaded from: classes2.dex */
final class g extends c.a {

    /* renamed from: a, reason: collision with root package name */
    final Executor f9551a;

    g(Executor executor) {
        this.f9551a = executor;
    }

    @Override // d.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (a(type) != b.class) {
            return null;
        }
        final Type e = p.e(type);
        return new c<Object, b<?>>() { // from class: d.g.1
            @Override // d.c
            public Type a() {
                return e;
            }

            @Override // d.c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b<Object> a(b<Object> bVar) {
                return new a(g.this.f9551a, bVar);
            }
        };
    }

    /* compiled from: ExecutorCallAdapterFactory.java */
    static final class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        final Executor f9554a;

        /* renamed from: b, reason: collision with root package name */
        final b<T> f9555b;

        a(Executor executor, b<T> bVar) {
            this.f9554a = executor;
            this.f9555b = bVar;
        }

        @Override // d.b
        public void a(final d<T> dVar) {
            if (dVar == null) {
                throw new NullPointerException("callback == null");
            }
            this.f9555b.a(new d<T>() { // from class: d.g.a.1
                @Override // d.d
                public void onResponse(b<T> bVar, final m<T> mVar) {
                    a.this.f9554a.execute(new Runnable() { // from class: d.g.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a.this.f9555b.b()) {
                                dVar.onFailure(a.this, new IOException("Canceled"));
                            } else {
                                dVar.onResponse(a.this, mVar);
                            }
                        }
                    });
                }

                @Override // d.d
                public void onFailure(b<T> bVar, final Throwable th) {
                    a.this.f9554a.execute(new Runnable() { // from class: d.g.a.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            dVar.onFailure(a.this, th);
                        }
                    });
                }
            });
        }

        @Override // d.b
        public m<T> a() throws IOException {
            return this.f9555b.a();
        }

        @Override // d.b
        public boolean b() {
            return this.f9555b.b();
        }

        @Override // d.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<T> clone() {
            return new a(this.f9554a, this.f9555b.clone());
        }
    }
}
