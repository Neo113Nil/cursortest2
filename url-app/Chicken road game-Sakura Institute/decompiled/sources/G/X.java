package G;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface X extends CoroutineContext.Element {
    Object f(Function1 function1, C2.a aVar);

    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.g getKey() {
        return W.f2775e;
    }
}
