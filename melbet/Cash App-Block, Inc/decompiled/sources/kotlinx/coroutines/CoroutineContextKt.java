package kotlinx.coroutines;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public abstract class CoroutineContextKt {
    public static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 11;
        boolean booleanValue = ((Boolean) coroutineContext.fold(bool, new SaversKt$$ExternalSyntheticLambda5(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) coroutineContext2.fold(bool, new SaversKt$$ExternalSyntheticLambda5(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new SaversKt$$ExternalSyntheticLambda5(12));
        if (booleanValue2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new SaversKt$$ExternalSyntheticLambda5(13));
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineScope coroutineScope) {
        CoroutineContext foldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return (foldCopies == defaultScheduler || foldCopies.get(ContinuationInterceptor.Key) != null) ? foldCopies : foldCopies.plus(defaultScheduler);
    }

    public static final UndispatchedCoroutine updateUndispatchedCompletion(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        UndispatchedCoroutine undispatchedCoroutine = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.get(UndispatchedMarker.INSTANCE) != null) {
            CoroutineStackFrame coroutineStackFrame = (CoroutineStackFrame) continuation;
            while (true) {
                if ((coroutineStackFrame instanceof DispatchedCoroutine) || (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) == null) {
                    break;
                }
                if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                    undispatchedCoroutine = (UndispatchedCoroutine) coroutineStackFrame;
                    break;
                }
            }
            if (undispatchedCoroutine != null) {
                undispatchedCoroutine.saveThreadContext(coroutineContext, obj);
            }
        }
        return undispatchedCoroutine;
    }
}
