package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class AbstractCoroutineContextKey implements CoroutineContext.Key {
    public final Function1 safeCast;
    public final CoroutineContext.Key topmostKey;

    public AbstractCoroutineContextKey(CoroutineContext.Key key, Function1 function1) {
        key.getClass();
        this.safeCast = function1;
        this.topmostKey = key instanceof AbstractCoroutineContextKey ? ((AbstractCoroutineContextKey) key).topmostKey : key;
    }
}
