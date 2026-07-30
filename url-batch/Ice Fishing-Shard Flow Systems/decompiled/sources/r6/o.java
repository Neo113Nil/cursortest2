package r6;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class o implements CoroutineContext {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f7577d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f7578e;

    public o(Throwable th, CoroutineContext coroutineContext) {
        this.f7577d = coroutineContext;
        this.f7578e = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return this.f7577d.B(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.f fVar) {
        return this.f7577d.g(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext j(CoroutineContext coroutineContext) {
        return this.f7577d.j(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object t(Object obj, Function2 function2) {
        return this.f7577d.t(obj, function2);
    }
}
