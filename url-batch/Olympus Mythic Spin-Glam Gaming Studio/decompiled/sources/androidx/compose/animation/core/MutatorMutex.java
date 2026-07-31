package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: InternalMutatorMutex.kt */
@Stable
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex;", "", "<init>", "()V", "Landroidx/compose/animation/core/MutatorMutex$Mutator;", "mutator", "", "tryMutateOrCancel", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)V", "R", "Landroidx/compose/animation/core/MutatePriority;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "mutate", "(Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/animation/core/AtomicReference;", "currentMutator", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Mutator", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MutatorMutex {
    private final AtomicReference currentMutator = new AtomicReference(null);
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InternalMutatorMutex.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/animation/core/MutatorMutex$Mutator;", "", "Landroidx/compose/animation/core/MutatePriority;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/compose/animation/core/MutatePriority;Lkotlinx/coroutines/Job;)V", "other", "", "canInterrupt", "(Landroidx/compose/animation/core/MutatorMutex$Mutator;)Z", "", "cancel", "()V", "Landroidx/compose/animation/core/MutatePriority;", "getPriority", "()Landroidx/compose/animation/core/MutatePriority;", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class Mutator {
        private final Job job;
        private final MutatePriority priority;

        public Mutator(MutatePriority priority, Job job) {
            Intrinsics.checkNotNullParameter(priority, "priority");
            Intrinsics.checkNotNullParameter(job, "job");
            this.priority = priority;
            this.job = job;
        }

        public final boolean canInterrupt(Mutator other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return this.priority.compareTo(other.priority) >= 0;
        }

        public final void cancel() {
            Job.DefaultImpls.cancel$default(this.job, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = (Mutator) this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    public final Object mutate(MutatePriority mutatePriority, Function1 function1, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new MutatorMutex$mutate$2(mutatePriority, this, function1, null), continuation);
    }
}
