package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {
    public final g m;

    public a(g gVar) {
        gVar.getClass();
        this.m = gVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext H(g gVar) {
        return f.b(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final g getKey() {
        return this.m;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element m(g gVar) {
        return f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        return f.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object y(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
