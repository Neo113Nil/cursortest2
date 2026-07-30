package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oc0 implements CoroutineContext {
    public final /* synthetic */ CoroutineContext m;
    public final Throwable n;

    public oc0(Throwable th, CoroutineContext coroutineContext) {
        this.m = coroutineContext;
        this.n = th;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext H(g gVar) {
        return this.m.H(gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(g gVar) {
        return this.m.m(gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return this.m.p(coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return this.m.y(obj, function2);
    }
}
