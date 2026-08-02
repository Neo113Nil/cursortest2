package kotlinx.coroutines.internal;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ThreadContextElement;

/* loaded from: classes3.dex */
public abstract class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS", 0);
    public static final SaversKt$$ExternalSyntheticLambda5 countAll = new SaversKt$$ExternalSyntheticLambda5(16);
    public static final SaversKt$$ExternalSyntheticLambda5 findOne = new SaversKt$$ExternalSyntheticLambda5(17);
    public static final SaversKt$$ExternalSyntheticLambda5 updateState = new SaversKt$$ExternalSyntheticLambda5(18);

    public static final void restoreThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == NO_THREAD_ELEMENTS) {
            return;
        }
        if (obj instanceof ThreadState) {
            ((ThreadState) obj).restore(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, findOne);
        fold.getClass();
        ((ThreadContextElement) fold).restoreThreadContext(obj);
    }

    public static final Object threadContextElements(CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, countAll);
        fold.getClass();
        return fold;
    }

    public static final Object updateThreadContext(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = threadContextElements(coroutineContext);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? coroutineContext.fold(new ThreadState(((Number) obj).intValue(), coroutineContext), updateState) : ((ThreadContextElement) obj).updateThreadContext();
    }
}
