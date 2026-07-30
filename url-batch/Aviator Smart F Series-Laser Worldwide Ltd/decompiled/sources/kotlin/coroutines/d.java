package kotlin.coroutines;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public interface d extends CoroutineContext.a {
    public static final b Key = b.$$INSTANCE;

    public static final class a {
        public static <R> R fold(d dVar, R r8, p operation) {
            s.checkNotNullParameter(operation, "operation");
            return (R) CoroutineContext.a.C0363a.fold(dVar, r8, operation);
        }

        public static <E extends CoroutineContext.a> E get(d dVar, CoroutineContext.b key) {
            s.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (d.Key != key) {
                    return null;
                }
                s.checkNotNull(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.isSubKey$kotlin_stdlib(dVar.getKey())) {
                return null;
            }
            E e8 = (E) bVar.tryCast$kotlin_stdlib(dVar);
            if (e8 instanceof CoroutineContext.a) {
                return e8;
            }
            return null;
        }

        public static CoroutineContext minusKey(d dVar, CoroutineContext.b key) {
            s.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return d.Key == key ? EmptyCoroutineContext.INSTANCE : dVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.isSubKey$kotlin_stdlib(dVar.getKey()) || bVar.tryCast$kotlin_stdlib(dVar) == null) ? dVar : EmptyCoroutineContext.INSTANCE;
        }

        public static CoroutineContext plus(d dVar, CoroutineContext context) {
            s.checkNotNullParameter(context, "context");
            return CoroutineContext.a.C0363a.plus(dVar, context);
        }

        public static void releaseInterceptedContinuation(d dVar, c continuation) {
            s.checkNotNullParameter(continuation, "continuation");
        }
    }

    public static final class b implements CoroutineContext.b {
        static final /* synthetic */ b $$INSTANCE = new b();

        private b() {
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, p pVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    <E extends CoroutineContext.a> E get(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    <T> c interceptContinuation(c cVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    void releaseInterceptedContinuation(c cVar);
}
