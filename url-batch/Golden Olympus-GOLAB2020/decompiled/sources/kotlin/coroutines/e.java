package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface e extends CoroutineContext.Element {

    /* renamed from: K2, reason: collision with root package name */
    @NotNull
    public static final b f41111K2 = b.f41112b;

    public static final class a {
        public static CoroutineContext.Element a(e eVar, CoroutineContext.b key) {
            CoroutineContext.Element b4;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                if (e.f41111K2 != key) {
                    return null;
                }
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            if (!bVar.a(eVar.getKey()) || (b4 = bVar.b(eVar)) == null) {
                return null;
            }
            return b4;
        }

        public static CoroutineContext b(e eVar, CoroutineContext.b key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof kotlin.coroutines.b)) {
                return e.f41111K2 == key ? g.f41113b : eVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : g.f41113b;
        }
    }

    public static final class b implements CoroutineContext.b {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f41112b = new b();

        private b() {
        }
    }

    void a(d dVar);

    d b(d dVar);
}
