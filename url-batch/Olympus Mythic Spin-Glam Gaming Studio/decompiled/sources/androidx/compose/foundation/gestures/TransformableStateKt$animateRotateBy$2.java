package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TransformableStateKt$animateRotateBy$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ float $degrees;
    final /* synthetic */ Ref$FloatRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateRotateBy$2(Ref$FloatRef ref$FloatRef, float f, AnimationSpec<Float> animationSpec, Continuation continuation) {
        super(2, continuation);
        this.$previous = ref$FloatRef;
        this.$degrees = f;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new TransformableStateKt$animateRotateBy$2(this.$previous, this.$degrees, this.$animationSpec, continuation);
        transformableStateKt$animateRotateBy$2.L$0 = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
        return ((TransformableStateKt$animateRotateBy$2) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
            Float boxFloat = Boxing.boxFloat(this.$degrees);
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previous;
            Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    TransformScope.m290transformByd4ec7I$default(transformScope, 0.0f, 0L, ((Number) animateTo.getValue()).floatValue() - Ref$FloatRef.this.element, 3, null);
                    Ref$FloatRef.this.element = ((Number) animateTo.getValue()).floatValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, function1, this, 4, null) == coroutine_suspended) {
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
