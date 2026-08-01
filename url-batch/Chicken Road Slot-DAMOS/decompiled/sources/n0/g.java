package n0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements CoroutineContext.Element {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6681d = new e(6);

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext F(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return f6681d;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext.Element m(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ CoroutineContext p(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }
}
