package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
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

/* compiled from: LazyListItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {266}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class LazyListItemPlacementAnimator$getAnimatedOffset$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ PlaceableInfo $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$getAnimatedOffset$1(PlaceableInfo placeableInfo, Continuation continuation) {
        super(2, continuation);
        this.$item = placeableInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyListItemPlacementAnimator$getAnimatedOffset$1(this.$item, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyListItemPlacementAnimator$getAnimatedOffset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable animatedOffset = this.$item.getAnimatedOffset();
            IntOffset m2545boximpl = IntOffset.m2545boximpl(this.$item.getTargetOffset());
            this.label = 1;
            if (animatedOffset.snapTo(m2545boximpl, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$item.setInProgress(false);
        return Unit.INSTANCE;
    }
}
