package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyLayoutItemAnimation.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", i = {0}, l = {151, 158}, m = "invokeSuspend", n = {"finalSpec"}, s = {"L$0"})
/* loaded from: classes.dex */
final class LazyLayoutItemAnimation$animatePlacementDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $spec;
    final /* synthetic */ long $totalDelta;
    Object L$0;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animatePlacementDelta$1(LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, long j, Continuation<? super LazyLayoutItemAnimation$animatePlacementDelta$1> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$totalDelta = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyLayoutItemAnimation$animatePlacementDelta$1(this.this$0, this.$spec, this.$totalDelta, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyLayoutItemAnimation$animatePlacementDelta$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1.AnonymousClass1(), r13, 4, null) != r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Animatable animatable;
        SpringSpec springSpec;
        Animatable animatable2;
        Animatable animatable3;
        SpringSpec springSpec2;
        Animatable animatable4;
        Animatable animatable5;
        Function0 function0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            animatable = this.this$0.placementDeltaAnimation;
            boolean isRunning = animatable.isRunning();
            springSpec = this.$spec;
            if (isRunning) {
                if (!(springSpec instanceof SpringSpec)) {
                    springSpec2 = LazyLayoutItemAnimationKt.InterruptionSpec;
                } else {
                    springSpec2 = (SpringSpec) springSpec;
                }
                springSpec = springSpec2;
            }
            animatable2 = this.this$0.placementDeltaAnimation;
            if (!animatable2.isRunning()) {
                animatable3 = this.this$0.placementDeltaAnimation;
                this.L$0 = springSpec;
                this.label = 1;
                if (animatable3.snapTo(IntOffset.m6384boximpl(this.$totalDelta), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            animatable4 = this.this$0.placementDeltaAnimation;
            final long m6396minusqkQi6aY = IntOffset.m6396minusqkQi6aY(((IntOffset) animatable4.getValue()).getPackedValue(), this.$totalDelta);
            animatable5 = this.this$0.placementDeltaAnimation;
            IntOffset m6384boximpl = IntOffset.m6384boximpl(m6396minusqkQi6aY);
            FiniteAnimationSpec<IntOffset> finiteAnimationSpec = springSpec;
            final LazyLayoutItemAnimation lazyLayoutItemAnimation = this.this$0;
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.setPlacementAnimationInProgress(false);
                this.this$0.isRunningMovingAwayAnimation = false;
                return Unit.INSTANCE;
            }
            springSpec = (FiniteAnimationSpec) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        function0 = this.this$0.onLayerPropertyChanged;
        function0.invoke();
        animatable4 = this.this$0.placementDeltaAnimation;
        final long m6396minusqkQi6aY2 = IntOffset.m6396minusqkQi6aY(((IntOffset) animatable4.getValue()).getPackedValue(), this.$totalDelta);
        animatable5 = this.this$0.placementDeltaAnimation;
        IntOffset m6384boximpl2 = IntOffset.m6384boximpl(m6396minusqkQi6aY2);
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = springSpec;
        final LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.this$0;
        this.L$0 = null;
        this.label = 2;
    }
}
