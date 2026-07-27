package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata
    public interface Element extends CoroutineContext {
        g getKey();
    }

    Object i(Object obj, Function2 function2);

    Element k(g gVar);

    CoroutineContext s(CoroutineContext coroutineContext);

    CoroutineContext w(g gVar);
}
