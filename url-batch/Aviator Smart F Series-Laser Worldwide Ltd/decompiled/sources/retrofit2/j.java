package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Request;
import okio.y0;
import retrofit2.c;
import retrofit2.j;

/* loaded from: classes5.dex */
final class j extends c.a {

    @Nullable
    private final Executor callbackExecutor;

    class a implements c {
        final /* synthetic */ Executor val$executor;
        final /* synthetic */ Type val$responseType;

        a(Type type, Executor executor) {
            this.val$responseType = type;
            this.val$executor = executor;
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.val$responseType;
        }

        @Override // retrofit2.c
        public retrofit2.b adapt(retrofit2.b bVar) {
            Executor executor = this.val$executor;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    static final class b implements retrofit2.b {
        final Executor callbackExecutor;
        final retrofit2.b delegate;

        class a implements d {
            final /* synthetic */ d val$callback;

            a(d dVar) {
                this.val$callback = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onFailure$1(d dVar, Throwable th) {
                dVar.onFailure(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onResponse$0(d dVar, u uVar) {
                if (b.this.delegate.isCanceled()) {
                    dVar.onFailure(b.this, new IOException("Canceled"));
                } else {
                    dVar.onResponse(b.this, uVar);
                }
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b bVar, final Throwable th) {
                Executor executor = b.this.callbackExecutor;
                final d dVar = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.a.this.lambda$onFailure$1(dVar, th);
                    }
                });
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b bVar, final u uVar) {
                Executor executor = b.this.callbackExecutor;
                final d dVar = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.b.a.this.lambda$onResponse$0(dVar, uVar);
                    }
                });
            }
        }

        b(Executor executor, retrofit2.b bVar) {
            this.callbackExecutor = executor;
            this.delegate = bVar;
        }

        @Override // retrofit2.b
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.b
        public void enqueue(d dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.delegate.enqueue(new a(dVar));
        }

        @Override // retrofit2.b
        public u execute() {
            return this.delegate.execute();
        }

        @Override // retrofit2.b
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.b
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.b
        public Request request() {
            return this.delegate.request();
        }

        @Override // retrofit2.b
        public y0 timeout() {
            return this.delegate.timeout();
        }

        @Override // retrofit2.b
        public retrofit2.b clone() {
            return new b(this.callbackExecutor, this.delegate.clone());
        }
    }

    j(@Nullable Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.c.a
    @Nullable
    public c get(Type type, Annotation[] annotationArr, v vVar) {
        if (c.a.getRawType(type) != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(z.getParameterUpperBound(0, (ParameterizedType) type), z.isAnnotationPresent(annotationArr, x.class) ? null : this.callbackExecutor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
