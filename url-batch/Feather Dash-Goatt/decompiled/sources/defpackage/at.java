package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class at implements CoroutineContext {
    public final /* synthetic */ CoroutineContext d;
    public final Throwable e;

    public at(Throwable th, CoroutineContext coroutineContext) {
        this.d = coroutineContext;
        this.e = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        return this.d.d(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return this.d.i(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return this.d.p(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        return this.d.w(fVar);
    }
}
