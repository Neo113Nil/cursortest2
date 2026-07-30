package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import retrofit2.c;

/* loaded from: classes5.dex */
final class h extends c.a {
    static final c.a INSTANCE = new h();

    private static final class a implements retrofit2.c {
        private final Type responseType;

        /* renamed from: retrofit2.h$a$a, reason: collision with other inner class name */
        private class C0405a implements d {
            private final CompletableFuture<Object> future;

            public C0405a(CompletableFuture<Object> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b bVar, Throwable th) {
                this.future.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b bVar, u uVar) {
                if (uVar.isSuccessful()) {
                    this.future.complete(uVar.body());
                } else {
                    this.future.completeExceptionally(new HttpException(uVar));
                }
            }
        }

        a(Type type) {
            this.responseType = type;
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.c
        public CompletableFuture<Object> adapt(retrofit2.b bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new C0405a(bVar2));
            return bVar2;
        }
    }

    private static final class b extends CompletableFuture {
        private final retrofit2.b call;

        b(retrofit2.b bVar) {
            this.call = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            if (z7) {
                this.call.cancel();
            }
            return super.cancel(z7);
        }
    }

    private static final class c implements retrofit2.c {
        private final Type responseType;

        private class a implements d {
            private final CompletableFuture<u> future;

            public a(CompletableFuture<u> completableFuture) {
                this.future = completableFuture;
            }

            @Override // retrofit2.d
            public void onFailure(retrofit2.b bVar, Throwable th) {
                this.future.completeExceptionally(th);
            }

            @Override // retrofit2.d
            public void onResponse(retrofit2.b bVar, u uVar) {
                this.future.complete(uVar);
            }
        }

        c(Type type) {
            this.responseType = type;
        }

        @Override // retrofit2.c
        public Type responseType() {
            return this.responseType;
        }

        @Override // retrofit2.c
        public CompletableFuture<u> adapt(retrofit2.b bVar) {
            b bVar2 = new b(bVar);
            bVar.enqueue(new a(bVar2));
            return bVar2;
        }
    }

    h() {
    }

    @Override // retrofit2.c.a
    @Nullable
    public retrofit2.c get(Type type, Annotation[] annotationArr, v vVar) {
        if (c.a.getRawType(type) != e.a()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (c.a.getRawType(parameterUpperBound) != u.class) {
            return new a(parameterUpperBound);
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new c(c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
