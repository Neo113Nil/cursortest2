package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function3 $block;
    final /* synthetic */ MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$recompositionRunner$2(Recomposer recomposer, Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
        super(2, continuation);
        this.this$0 = recomposer;
        this.$block = function3;
        this.$parentFrameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, continuation);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Recomposer$recompositionRunner$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job job;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl;
        ObserverHandle observerHandle;
        Throwable th;
        List knownCompositions;
        Object obj2;
        Job job2;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl2;
        Job job3;
        Recomposer.RecomposerInfoImpl recomposerInfoImpl3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
            this.this$0.registerRunnerJob(job);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            final Recomposer recomposer = this.this$0;
            ObserverHandle registerApplyObserver = companion.registerApplyObserver(new Function2() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Unit invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = Recomposer$recompositionRunner$2.invokeSuspend$lambda$2(Recomposer.this, (Set) obj3, (Snapshot) obj4);
                    return invokeSuspend$lambda$2;
                }
            });
            Recomposer.Companion companion2 = Recomposer.INSTANCE;
            recomposerInfoImpl = this.this$0.recomposerInfo;
            companion2.addRunning(recomposerInfoImpl);
            try {
                knownCompositions = this.this$0.knownCompositions();
                int size = knownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ControlledComposition) knownCompositions.get(i2)).invalidateAll();
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, null);
                this.L$0 = job;
                this.L$1 = registerApplyObserver;
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = registerApplyObserver;
            } catch (Throwable th2) {
                observerHandle = registerApplyObserver;
                th = th2;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer2 = this.this$0;
                synchronized (obj2) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observerHandle = (ObserverHandle) this.L$1;
            job = (Job) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                Recomposer recomposer22 = this.this$0;
                synchronized (obj2) {
                    try {
                        job2 = recomposer22.runnerJob;
                        if (job2 == job) {
                            recomposer22.runnerJob = null;
                        }
                        recomposer22.deriveStateLocked();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Recomposer.Companion companion3 = Recomposer.INSTANCE;
                recomposerInfoImpl2 = this.this$0.recomposerInfo;
                companion3.removeRunning(recomposerInfoImpl2);
                throw th;
            }
        }
        observerHandle.dispose();
        Object obj3 = this.this$0.stateLock;
        Recomposer recomposer3 = this.this$0;
        synchronized (obj3) {
            try {
                job3 = recomposer3.runnerJob;
                if (job3 == job) {
                    recomposer3.runnerJob = null;
                }
                recomposer3.deriveStateLocked();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        Recomposer.Companion companion4 = Recomposer.INSTANCE;
        recomposerInfoImpl3 = this.this$0.recomposerInfo;
        companion4.removeRunning(recomposerInfoImpl3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Recomposer recomposer, Set set, Snapshot snapshot) {
        MutableStateFlow mutableStateFlow;
        CancellableContinuation cancellableContinuation;
        MutableScatterSet mutableScatterSet;
        synchronized (recomposer.stateLock) {
            try {
                mutableStateFlow = recomposer._state;
                if (((Recomposer.State) mutableStateFlow.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                    mutableScatterSet = recomposer.snapshotInvalidations;
                    if (set instanceof ScatterSetWrapper) {
                        ScatterSet set2 = ((ScatterSetWrapper) set).getSet();
                        Object[] objArr = set2.elements;
                        long[] jArr = set2.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i << 3) + i3];
                                            if (!(obj instanceof StateObjectImpl) || ((StateObjectImpl) obj).m1225isReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(1))) {
                                                mutableScatterSet.add(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof StateObjectImpl) || ((StateObjectImpl) obj2).m1225isReadInh_f27i8$runtime(ReaderKind.m1215constructorimpl(1))) {
                                mutableScatterSet.add(obj2);
                            }
                        }
                    }
                    cancellableContinuation = recomposer.deriveStateLocked();
                } else {
                    cancellableContinuation = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", f = "Recomposer.kt", l = {1160}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2 {
        final /* synthetic */ Function3 $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function3 function3, MonotonicFrameClock monotonicFrameClock, Continuation continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$parentFrameClock, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Function3 function3 = this.$block;
                MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
