package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface CoroutineContext {

    @Metadata
    public interface Element extends CoroutineContext {

        public static final class a {
            public static Object a(Element element, Object obj, Function2 operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(obj, element);
            }

            public static Element b(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext c(Element element, b key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual(element.getKey(), key) ? g.f41113b : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return a.a(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        Object fold(Object obj, Function2 function2);

        @Override // kotlin.coroutines.CoroutineContext
        Element get(b bVar);

        b getKey();

        @Override // kotlin.coroutines.CoroutineContext
        CoroutineContext minusKey(b bVar);
    }

    public static final class a {

        /* renamed from: kotlin.coroutines.CoroutineContext$a$a, reason: collision with other inner class name */
        static final class C0230a extends s implements Function2 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0230a f41104i = new C0230a();

            C0230a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext invoke(@NotNull CoroutineContext acc, @NotNull Element element) {
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                CoroutineContext minusKey = acc.minusKey(element.getKey());
                g gVar = g.f41113b;
                if (minusKey == gVar) {
                    return element;
                }
                e.b bVar = e.f41111K2;
                e eVar = (e) minusKey.get(bVar);
                if (eVar == null) {
                    return new c(minusKey, element);
                }
                CoroutineContext minusKey2 = minusKey.minusKey(bVar);
                return minusKey2 == gVar ? new c(element, eVar) : new c(new c(minusKey2, element), eVar);
            }
        }

        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == g.f41113b ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, C0230a.f41104i);
        }
    }

    public interface b {
    }

    Object fold(Object obj, Function2 function2);

    Element get(b bVar);

    CoroutineContext minusKey(b bVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
