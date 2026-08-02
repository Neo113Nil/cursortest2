package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LimitedDispatcher;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes3.dex */
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final Key Key = new Key(ContinuationInterceptor.Key, new Perfs$$ExternalSyntheticLambda4(18));

    public final class Key extends AbstractCoroutineContextKey {
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        InlineList.safeDispatch(this, coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        CoroutineContext.Element element;
        key.getClass();
        if (key instanceof AbstractCoroutineContextKey) {
            AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
            CoroutineContext.Key key2 = getKey();
            key2.getClass();
            if ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.topmostKey == key2) && (element = (CoroutineContext.Element) abstractCoroutineContextKey.safeCast.invoke(this)) != null) {
                return element;
            }
        } else if (ContinuationInterceptor.Key == key) {
            return this;
        }
        return null;
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined);
    }

    public CoroutineDispatcher limitedParallelism(int i) {
        InlineList.checkParallelism(i);
        return new LimitedDispatcher(this, i);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        key.getClass();
        if (!(key instanceof AbstractCoroutineContextKey)) {
            return ContinuationInterceptor.Key == key ? EmptyCoroutineContext.INSTANCE : this;
        }
        AbstractCoroutineContextKey abstractCoroutineContextKey = (AbstractCoroutineContextKey) key;
        CoroutineContext.Key key2 = getKey();
        key2.getClass();
        return ((key2 == abstractCoroutineContextKey || abstractCoroutineContextKey.topmostKey == key2) && ((CoroutineContext.Element) abstractCoroutineContextKey.safeCast.invoke(this)) != null) ? EmptyCoroutineContext.INSTANCE : this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + JobKt.getHexAddress(this);
    }
}
