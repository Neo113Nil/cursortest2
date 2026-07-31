package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.DragScope;
import androidx.compose.runtime.MutableState;
import com.vungle.ads.internal.protos.Sdk;
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

/* compiled from: Swipeable.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ AnimationSpec<Float> $spec;
    final /* synthetic */ float $target;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f, AnimationSpec<Float> animationSpec, Continuation continuation) {
        super(2, continuation);
        this.this$0 = swipeableState;
        this.$target = f;
        this.$spec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.this$0, this.$target, this.$spec, continuation);
        swipeableState$animateInternalToOffset$2.L$0 = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull DragScope dragScope, @Nullable Continuation continuation) {
        return ((SwipeableState$animateInternalToOffset$2) create(dragScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final DragScope dragScope = (DragScope) this.L$0;
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                mutableState2 = ((SwipeableState) this.this$0).absoluteOffset;
                ref$FloatRef.element = ((Number) mutableState2.getValue()).floatValue();
                mutableState3 = ((SwipeableState) this.this$0).animationTarget;
                mutableState3.setValue(Boxing.boxFloat(this.$target));
                this.this$0.setAnimationRunning(true);
                Animatable Animatable$default = AnimatableKt.Animatable$default(ref$FloatRef.element, 0.0f, 2, null);
                Float boxFloat = Boxing.boxFloat(this.$target);
                AnimationSpec<Float> animationSpec = this.$spec;
                Function1 function1 = new Function1() { // from class: androidx.compose.material.SwipeableState$animateInternalToOffset$2.1
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
                if (Animatable.animateTo$default(Animatable$default, boxFloat, animationSpec, null, function1, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            mutableState4 = ((SwipeableState) this.this$0).animationTarget;
            mutableState4.setValue(null);
            this.this$0.setAnimationRunning(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutableState = ((SwipeableState) this.this$0).animationTarget;
            mutableState.setValue(null);
            this.this$0.setAnimationRunning(false);
            throw th;
        }
    }
}
