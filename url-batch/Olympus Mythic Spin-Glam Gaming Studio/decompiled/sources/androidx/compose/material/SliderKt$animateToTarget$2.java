package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.DragScope;
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

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", l = {927}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SliderKt$animateToTarget$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ float $current;
    final /* synthetic */ float $target;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$animateToTarget$2(float f, float f2, float f3, Continuation continuation) {
        super(2, continuation);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, continuation);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
        return ((SliderKt$animateToTarget$2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TweenSpec tweenSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final DragScope dragScope = (DragScope) this.L$0;
            final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            float f = this.$current;
            ref$FloatRef.element = f;
            Animatable Animatable$default = AnimatableKt.Animatable$default(f, 0.0f, 2, null);
            Float boxFloat = Boxing.boxFloat(this.$target);
            tweenSpec = SliderKt.SliderToTickAnimation;
            Float boxFloat2 = Boxing.boxFloat(this.$velocity);
            Function1 function1 = new Function1() { // from class: androidx.compose.material.SliderKt$animateToTarget$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Animatable<Float, AnimationVector1D>) obj2);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Animatable<Float, AnimationVector1D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    DragScope.this.dragBy(((Number) animateTo.getValue()).floatValue() - ref$FloatRef.element);
                    ref$FloatRef.element = ((Number) animateTo.getValue()).floatValue();
                }
            };
            this.label = 1;
            if (Animatable$default.animateTo(boxFloat, tweenSpec, boxFloat2, function1, this) == coroutine_suspended) {
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
