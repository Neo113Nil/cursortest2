package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
/* loaded from: classes.dex */
public interface CoroutineContext {

    @Metadata
    public interface Element extends CoroutineContext {
        f getKey();
    }

    CoroutineContext B(f fVar);

    Element g(f fVar);

    CoroutineContext j(CoroutineContext coroutineContext);

    Object t(Object obj, Function2 function2);
}
