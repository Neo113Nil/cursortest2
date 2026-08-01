package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements CoroutineContext, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final g f5592d = new g();

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext F(f fVar) {
        fVar.getClass();
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element m(f fVar) {
        fVar.getClass();
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext p(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object z(Object obj, Function2 function2) {
        return obj;
    }
}
