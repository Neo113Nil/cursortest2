package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {
    public final f d;

    public a(f fVar) {
        fVar.getClass();
        this.d = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element d(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return function2.b(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext w(f fVar) {
        return e.b(this, fVar);
    }
}
