package n0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface s0 extends CoroutineContext.Element {
    @Override // kotlin.coroutines.CoroutineContext.Element
    default kotlin.coroutines.f getKey() {
        return e.f6659i;
    }

    Object s(Function1 function1, nd.c cVar);
}
