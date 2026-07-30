package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public interface w extends n0 {
    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ t attachChild(v vVar);

    @Override // kotlinx.coroutines.n0
    /* synthetic */ Object await(kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ void cancel();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ void cancel(CancellationException cancellationException);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ boolean cancel(Throwable th);

    boolean complete(Object obj);

    boolean completeExceptionally(Throwable th);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, f6.p pVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.a get(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ CancellationException getCancellationException();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ kotlin.sequences.m getChildren();

    @Override // kotlinx.coroutines.n0
    /* synthetic */ Object getCompleted();

    @Override // kotlinx.coroutines.n0
    /* synthetic */ Throwable getCompletionExceptionOrNull();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a
    /* synthetic */ CoroutineContext.b getKey();

    @Override // kotlinx.coroutines.n0
    /* synthetic */ kotlinx.coroutines.selects.e getOnAwait();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ kotlinx.coroutines.selects.c getOnJoin();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ l1 getParent();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ u0 invokeOnCompletion(f6.l lVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ u0 invokeOnCompletion(boolean z7, boolean z8, f6.l lVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ boolean isActive();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ boolean isCancelled();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ boolean isCompleted();

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ Object join(kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.b bVar);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1, kotlin.coroutines.CoroutineContext.a, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ l1 plus(l1 l1Var);

    @Override // kotlinx.coroutines.n0, kotlinx.coroutines.l1
    /* synthetic */ boolean start();
}
