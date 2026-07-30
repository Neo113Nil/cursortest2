package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {890, 910, 911}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01c6, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r2, r19) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        if (r10 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b8, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(kotlinx.coroutines.JobKt.getJob(r9.getCoroutineContext()), r19) == r1) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00c7 -> B:17:0x00cb). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        CoroutineScope coroutineScope;
        ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        MutableScatterSet mutableScatterSet;
        boolean hasConcurrentFrameWorkLocked;
        Continuation<Unit> requestFrameLocked;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
            boolean z = this.$recomposeCoroutineContext.get(Job.INSTANCE) == null;
            CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            if (!z) {
                PreconditionsKt.throwIllegalArgumentException("recomposeCoroutineContext may not contain a Job; found " + coroutineContext.get(Job.INSTANCE));
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope2.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (shouldKeepRecomposing) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            launch$default = (Job) this.L$2;
            produceFrameSignal = (ProduceFrameSignal) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            Recomposer recomposer = this.this$0;
            synchronized (recomposer.stateLock) {
                mutableScatterSet = recomposer.snapshotInvalidations;
                if (mutableScatterSet.isNotEmpty()) {
                    recomposer.snapshotInvalidations = new MutableScatterSet(i3, 1, null);
                }
            }
            Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            if (!wrapIntoSet.isEmpty()) {
                List knownCompositions = recomposer.getKnownCompositions();
                int size = knownCompositions.size();
                for (int i4 = i3; i4 < size; i4++) {
                    ((ControlledComposition) knownCompositions.get(i4)).recordModificationsOf(wrapIntoSet);
                }
            }
            MutableVector mutableVector = recomposer.compositionInvalidations;
            int size2 = mutableVector.getSize();
            if (size2 > 0) {
                Object[] content = mutableVector.getContent();
                int i5 = i3;
                while (true) {
                    ControlledComposition controlledComposition = (ControlledComposition) content[i5];
                    synchronized (recomposer.stateLock) {
                        i = recomposer.concurrentCompositionsOutstanding;
                        recomposer.concurrentCompositionsOutstanding = i + 1;
                    }
                    int i6 = size2;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                    int i7 = i5 + 1;
                    if (i7 >= i6) {
                        break;
                    }
                    size2 = i6;
                    i5 = i7;
                }
            }
            recomposer.compositionInvalidations.clear();
            synchronized (recomposer.stateLock) {
                if (recomposer.deriveStateLocked() != null) {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                }
                Unit unit = Unit.INSTANCE;
            }
            Object obj2 = this.this$0.stateLock;
            Recomposer recomposer2 = this.this$0;
            synchronized (obj2) {
                hasConcurrentFrameWorkLocked = recomposer2.getHasConcurrentFrameWorkLocked();
                requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
            }
            if (requestFrameLocked != null) {
                Result.Companion companion = Result.INSTANCE;
                requestFrameLocked.resumeWith(Result.m6577constructorimpl(Unit.INSTANCE));
            }
            i3 = 0;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (shouldKeepRecomposing) {
                this.L$0 = launch$default;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } else {
                this.L$0 = coroutineScope;
                this.L$1 = produceFrameSignal;
                this.L$2 = launch$default;
                this.label = 1;
                awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
            }
            return coroutine_suspended;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        launch$default = (Job) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 3;
    }
}
