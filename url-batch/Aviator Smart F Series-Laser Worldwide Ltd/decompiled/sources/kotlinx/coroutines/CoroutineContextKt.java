package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes3.dex */
public abstract class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z7) {
        boolean hasCopyableElements = hasCopyableElements(coroutineContext);
        boolean hasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!hasCopyableElements && !hasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new f6.p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // f6.p
            public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                return coroutineContext4.plus(aVar);
            }
        });
        if (hasCopyableElements2) {
            ref$ObjectRef.element = ((CoroutineContext) ref$ObjectRef.element).fold(emptyCoroutineContext, new f6.p() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // f6.p
                public final CoroutineContext invoke(CoroutineContext coroutineContext4, CoroutineContext.a aVar) {
                    return coroutineContext4.plus(aVar);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.element);
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean hasCopyableElements(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new f6.p() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            public final Boolean invoke(boolean z7, CoroutineContext.a aVar) {
                return Boolean.valueOf(z7);
            }

            @Override // f6.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (CoroutineContext.a) obj2);
            }
        })).booleanValue();
    }

    public static final CoroutineContext newCoroutineContext(i0 i0Var, CoroutineContext coroutineContext) {
        CoroutineContext foldCopies = foldCopies(i0Var.getCoroutineContext(), coroutineContext, true);
        return (foldCopies == t0.getDefault() || foldCopies.get(kotlin.coroutines.d.Key) != null) ? foldCopies : foldCopies.plus(t0.getDefault());
    }

    public static final j2 undispatchedCompletion(kotlin.coroutines.jvm.internal.c cVar) {
        while (!(cVar instanceof q0) && (cVar = cVar.getCallerFrame()) != null) {
            if (cVar instanceof j2) {
                return (j2) cVar;
            }
        }
        return null;
    }

    public static final j2 updateUndispatchedCompletion(kotlin.coroutines.c cVar, CoroutineContext coroutineContext, Object obj) {
        if (!(cVar instanceof kotlin.coroutines.jvm.internal.c) || coroutineContext.get(k2.INSTANCE) == null) {
            return null;
        }
        j2 undispatchedCompletion = undispatchedCompletion((kotlin.coroutines.jvm.internal.c) cVar);
        if (undispatchedCompletion != null) {
            undispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCompletion;
    }

    public static final <T> T withContinuationContext(kotlin.coroutines.c cVar, Object obj, f6.a aVar) {
        CoroutineContext context = cVar.getContext();
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        j2 updateUndispatchedCompletion = updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? updateUndispatchedCompletion(cVar, context, updateThreadContext) : null;
        try {
            return (T) aVar.invoke();
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final <T> T withCoroutineContext(CoroutineContext coroutineContext, Object obj, f6.a aVar) {
        Object updateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return (T) aVar.invoke();
        } finally {
            kotlin.jvm.internal.r.finallyStart(1);
            ThreadContextKt.restoreThreadContext(coroutineContext, updateThreadContext);
            kotlin.jvm.internal.r.finallyEnd(1);
        }
    }

    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }
}
