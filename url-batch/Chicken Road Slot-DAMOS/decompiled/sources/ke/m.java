package ke;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements CoroutineContext {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f5537d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5538e;

    public m(Throwable th, CoroutineContext coroutineContext) {
        this.f5537d = coroutineContext;
        this.f5538e = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(kotlin.coroutines.f fVar) {
        return this.f5537d.F(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return this.f5537d.m(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return this.f5537d.p(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return this.f5537d.z(obj, function2);
    }
}
