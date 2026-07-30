package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: DataStoreImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u0005H¤@¢\u0006\u0002\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "()V", "didRun", "Lkotlinx/coroutines/CompletableDeferred;", "", "runMutex", "Lkotlinx/coroutines/sync/Mutex;", "awaitComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRun", "runIfNeeded", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RunOnce {
    private final Mutex runMutex = MutexKt.Mutex$default(false, 1, null);
    private final CompletableDeferred<Unit> didRun = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);

    protected abstract Object doRun(Continuation<? super Unit> continuation);

    public final Object awaitComplete(Continuation<? super Unit> continuation) {
        Object await = this.didRun.await(continuation);
        return await == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? await : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
    
        if (r8.lock(null, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:25:0x006b, B:27:0x0073, B:30:0x0079), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:25:0x006b, B:27:0x0073, B:30:0x0079), top: B:24:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runIfNeeded(Continuation<? super Unit> continuation) {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        RunOnce runOnce;
        try {
            if (continuation instanceof RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuation;
                if ((runOnce$runIfNeeded$1.label & Integer.MIN_VALUE) != 0) {
                    runOnce$runIfNeeded$1.label -= Integer.MIN_VALUE;
                    Object obj = runOnce$runIfNeeded$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = runOnce$runIfNeeded$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.didRun.isCompleted()) {
                            return Unit.INSTANCE;
                        }
                        mutex = this.runMutex;
                        runOnce$runIfNeeded$1.L$0 = this;
                        runOnce$runIfNeeded$1.L$1 = mutex;
                        runOnce$runIfNeeded$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) runOnce$runIfNeeded$1.L$1;
                            runOnce = (RunOnce) runOnce$runIfNeeded$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                runOnce.didRun.complete(Unit.INSTANCE);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) runOnce$runIfNeeded$1.L$1;
                        RunOnce runOnce2 = (RunOnce) runOnce$runIfNeeded$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        this = runOnce2;
                    }
                    if (this.didRun.isCompleted()) {
                        runOnce$runIfNeeded$1.L$0 = this;
                        runOnce$runIfNeeded$1.L$1 = mutex;
                        runOnce$runIfNeeded$1.label = 2;
                        if (this.doRun(runOnce$runIfNeeded$1) != coroutine_suspended) {
                            runOnce = this;
                            mutex2 = mutex;
                            runOnce.didRun.complete(Unit.INSTANCE);
                            mutex2.unlock(null);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return unit;
                }
            }
            if (this.didRun.isCompleted()) {
            }
        } catch (Throwable th3) {
            Mutex mutex4 = mutex;
            th = th3;
            mutex2 = mutex4;
            mutex2.unlock(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuation);
        Object obj2 = runOnce$runIfNeeded$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = runOnce$runIfNeeded$1.label;
        if (i != 0) {
        }
    }
}
