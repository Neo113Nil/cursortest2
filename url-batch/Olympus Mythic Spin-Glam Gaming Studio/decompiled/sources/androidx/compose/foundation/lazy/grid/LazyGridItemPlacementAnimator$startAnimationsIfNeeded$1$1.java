package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", l = {420}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $animationSpec;
    final /* synthetic */ PlaceableInfo $placeableInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(PlaceableInfo placeableInfo, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.$placeableInfo = placeableInfo;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.$placeableInfo, this.$animationSpec, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AnimationSpec animationSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$placeableInfo.getAnimatedOffset().isRunning()) {
                    FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.$animationSpec;
                    animationSpec = finiteAnimationSpec instanceof SpringSpec ? (SpringSpec) finiteAnimationSpec : LazyGridItemPlacementAnimatorKt.InterruptionSpec;
                } else {
                    animationSpec = this.$animationSpec;
                }
                AnimationSpec animationSpec2 = animationSpec;
                Animatable animatedOffset = this.$placeableInfo.getAnimatedOffset();
                IntOffset m2545boximpl = IntOffset.m2545boximpl(this.$placeableInfo.getTargetOffset());
                this.label = 1;
                if (Animatable.animateTo$default(animatedOffset, m2545boximpl, animationSpec2, null, null, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$placeableInfo.setInProgress(false);
        } catch (CancellationException unused) {
        }
        return Unit.INSTANCE;
    }
}
