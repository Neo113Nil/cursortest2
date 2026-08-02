package kotlinx.coroutines;

import com.datadog.trace.api.ConfigCollectorAtomicFieldUpdaterHelper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes9.dex */
public final class AwaitAll {
    public static final /* synthetic */ AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");
    public final Deferred[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public final class AwaitAllNode extends JobNode {
        public static final /* synthetic */ AtomicReferenceFieldUpdater _disposer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        public static final /* synthetic */ long _disposer$volatile$FU$offset = ConfigCollectorAtomicFieldUpdaterHelper.unsafe.objectFieldOffset(AwaitAllNode.class.getDeclaredField("_disposer$volatile"));
        private volatile /* synthetic */ Object _disposer$volatile;
        public final CancellableContinuationImpl continuation;
        public DisposableHandle handle;

        public AwaitAllNode(CancellableContinuationImpl cancellableContinuationImpl) {
            this.continuation = cancellableContinuationImpl;
        }

        public final DisposeHandlersOnCancel getDisposer() {
            _disposer$volatile$FU.getClass();
            return (DisposeHandlersOnCancel) ConfigCollectorAtomicFieldUpdaterHelper.unsafe.getObjectVolatile(this, _disposer$volatile$FU$offset);
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(Throwable th) {
            CancellableContinuationImpl cancellableContinuationImpl = this.continuation;
            if (th != null) {
                Symbol tryResumeImpl = cancellableContinuationImpl.tryResumeImpl(new CompletedExceptionally(th, false), null);
                if (tryResumeImpl != null) {
                    cancellableContinuationImpl.completeResume(tryResumeImpl);
                    DisposeHandlersOnCancel disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AwaitAll.notCompletedCount$volatile$FU;
            AwaitAll awaitAll = AwaitAll.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(awaitAll) == 0) {
                Deferred[] deferredArr = awaitAll.deferreds;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(arrayList);
            }
        }

        public final void setDisposer(DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$volatile$FU.getClass();
            ConfigCollectorAtomicFieldUpdaterHelper.unsafe.putObjectVolatile(this, _disposer$volatile$FU$offset, disposeHandlersOnCancel);
        }
    }

    public final class DisposeHandlersOnCancel implements CancelHandler {
        public final AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (AwaitAllNode awaitAllNode : this.nodes) {
                DisposableHandle disposableHandle = awaitAllNode.handle;
                if (disposableHandle == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("handle");
                    throw null;
                }
                disposableHandle.dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void invoke(Throwable th) {
            disposeAll();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }
}
