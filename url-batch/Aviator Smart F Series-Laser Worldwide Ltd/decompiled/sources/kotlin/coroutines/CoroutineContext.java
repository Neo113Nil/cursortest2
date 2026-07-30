package kotlin.coroutines;

import f6.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public interface CoroutineContext {

    public static final class DefaultImpls {
        public static CoroutineContext plus(CoroutineContext coroutineContext, CoroutineContext context) {
            s.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new p() { // from class: kotlin.coroutines.CoroutineContext$plus$1
                @Override // f6.p
                public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.a element) {
                    CombinedContext combinedContext;
                    s.checkNotNullParameter(acc, "acc");
                    s.checkNotNullParameter(element, "element");
                    CoroutineContext minusKey = acc.minusKey(element.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                    if (minusKey == emptyCoroutineContext) {
                        return element;
                    }
                    d.b bVar = d.Key;
                    d dVar = (d) minusKey.get(bVar);
                    if (dVar == null) {
                        combinedContext = new CombinedContext(minusKey, element);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(bVar);
                        if (minusKey2 == emptyCoroutineContext) {
                            return new CombinedContext(element, dVar);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), dVar);
                    }
                    return combinedContext;
                }
            });
        }
    }

    public interface a extends CoroutineContext {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        public static final class C0363a {
            public static <R> R fold(a aVar, R r8, p operation) {
                s.checkNotNullParameter(operation, "operation");
                return (R) operation.invoke(r8, aVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E get(a aVar, b key) {
                s.checkNotNullParameter(key, "key");
                if (!s.areEqual(aVar.getKey(), key)) {
                    return null;
                }
                s.checkNotNull(aVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return aVar;
            }

            public static CoroutineContext minusKey(a aVar, b key) {
                s.checkNotNullParameter(key, "key");
                return s.areEqual(aVar.getKey(), key) ? EmptyCoroutineContext.INSTANCE : aVar;
            }

            public static CoroutineContext plus(a aVar, CoroutineContext context) {
                s.checkNotNullParameter(context, "context");
                return DefaultImpls.plus(aVar, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <R> R fold(R r8, p pVar);

        @Override // kotlin.coroutines.CoroutineContext
        <E extends a> E get(b bVar);

        b getKey();

        @Override // kotlin.coroutines.CoroutineContext
        CoroutineContext minusKey(b bVar);

        @Override // kotlin.coroutines.CoroutineContext
        /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);
    }

    public interface b {
    }

    <R> R fold(R r8, p pVar);

    <E extends a> E get(b bVar);

    CoroutineContext minusKey(b bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
