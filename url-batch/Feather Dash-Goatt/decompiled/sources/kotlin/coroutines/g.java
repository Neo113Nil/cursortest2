package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class g implements CoroutineContext, Serializable {
    public static final g d = new g();

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element d(f fVar) {
        fVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext i(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(f fVar) {
        fVar.getClass();
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object p(Object obj, Function2 function2) {
        return obj;
    }
}
