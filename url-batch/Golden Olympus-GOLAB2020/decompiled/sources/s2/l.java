package s2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class l implements CoroutineContext {

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f46014b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f46015c;

    public l(Throwable th, CoroutineContext coroutineContext) {
        this.f46014b = th;
        this.f46015c = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return this.f46015c.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return this.f46015c.get(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return this.f46015c.minusKey(bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f46015c.plus(coroutineContext);
    }
}
