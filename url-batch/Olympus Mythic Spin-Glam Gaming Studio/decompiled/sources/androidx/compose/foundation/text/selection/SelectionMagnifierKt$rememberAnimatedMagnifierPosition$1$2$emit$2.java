package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.geometry.Offset;
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

/* compiled from: SelectionMagnifier.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2", f = "SelectionMagnifier.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Animatable<Offset, AnimationVector2D> $animatable;
    final /* synthetic */ long $targetValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(Animatable<Offset, AnimationVector2D> animatable, long j, Continuation continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.$targetValue = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2(this.$animatable, this.$targetValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SpringSpec springSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Offset, AnimationVector2D> animatable = this.$animatable;
            Offset m1288boximpl = Offset.m1288boximpl(this.$targetValue);
            springSpec = SelectionMagnifierKt.MagnifierSpringSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, m1288boximpl, springSpec, null, null, this, 12, null) == coroutine_suspended) {
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
