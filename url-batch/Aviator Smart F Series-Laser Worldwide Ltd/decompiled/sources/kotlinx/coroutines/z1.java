package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface z1 extends l1 {
    @Override // kotlinx.coroutines.l1
    /* synthetic */ t attachChild(v vVar);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ void cancel();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ void cancel(CancellationException cancellationException);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, f6.p pVar);

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ CancellationException getCancellationException();

    CancellationException getChildJobCancellationCause();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ kotlin.sequences.m getChildren();

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ kotlinx.coroutines.selects.c getOnJoin();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ l1 getParent();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ u0 invokeOnCompletion(f6.l lVar);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ u0 invokeOnCompletion(boolean z7, boolean z8, f6.l lVar);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ boolean isActive();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ boolean isCancelled();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ boolean isCompleted();

    @Override // kotlinx.coroutines.l1
    /* synthetic */ Object join(kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ l1 plus(l1 l1Var);

    @Override // kotlinx.coroutines.l1
    /* synthetic */ boolean start();
}
