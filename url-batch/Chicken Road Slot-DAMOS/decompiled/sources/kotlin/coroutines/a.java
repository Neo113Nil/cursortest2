package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public final f f5586d;

    public a(f fVar) {
        fVar.getClass();
        this.f5586d = fVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext F(f fVar) {
        return e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        return this.f5586d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public /* bridge */ CoroutineContext.Element m(f fVar) {
        return e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext p(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
