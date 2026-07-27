package a3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p implements CoroutineContext {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f4981d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f4982e;

    public p(Throwable th, CoroutineContext coroutineContext) {
        this.f4981d = coroutineContext;
        this.f4982e = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 function2) {
        return this.f4981d.i(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g gVar) {
        return this.f4981d.k(gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return this.f4981d.s(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return this.f4981d.w(gVar);
    }
}
