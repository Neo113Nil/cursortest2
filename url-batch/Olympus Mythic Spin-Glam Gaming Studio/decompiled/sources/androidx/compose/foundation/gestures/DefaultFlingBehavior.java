package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "(Landroidx/compose/animation/core/DecayAnimationSpec;)V", "performFling", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DefaultFlingBehavior implements FlingBehavior {
    private final DecayAnimationSpec flingDecay;

    public DefaultFlingBehavior(DecayAnimationSpec flingDecay) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        this.flingDecay = flingDecay;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(final ScrollScope scrollScope, float f, Continuation continuation) {
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$1;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuation instanceof DefaultFlingBehavior$performFling$1) {
            defaultFlingBehavior$performFling$1 = (DefaultFlingBehavior$performFling$1) continuation;
            int i2 = defaultFlingBehavior$performFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultFlingBehavior$performFling$1.label = i2 - Integer.MIN_VALUE;
                DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$12 = defaultFlingBehavior$performFling$1;
                Object obj = defaultFlingBehavior$performFling$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultFlingBehavior$performFling$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Math.abs(f) > 1.0f) {
                        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        ref$FloatRef2.element = f;
                        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        AnimationState AnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                        DecayAnimationSpec decayAnimationSpec = this.flingDecay;
                        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((AnimationScope<Float, AnimationVector1D>) obj2);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull AnimationScope<Float, AnimationVector1D> animateDecay) {
                                Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                                float floatValue = ((Number) animateDecay.getValue()).floatValue() - Ref$FloatRef.this.element;
                                float scrollBy = scrollScope.scrollBy(floatValue);
                                Ref$FloatRef.this.element = ((Number) animateDecay.getValue()).floatValue();
                                ref$FloatRef2.element = ((Number) animateDecay.getVelocity()).floatValue();
                                if (Math.abs(floatValue - scrollBy) > 0.5f) {
                                    animateDecay.cancelAnimation();
                                }
                            }
                        };
                        defaultFlingBehavior$performFling$12.L$0 = ref$FloatRef2;
                        defaultFlingBehavior$performFling$12.label = 1;
                        if (SuspendAnimationKt.animateDecay$default(AnimationState$default, decayAnimationSpec, false, function1, defaultFlingBehavior$performFling$12, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$FloatRef = ref$FloatRef2;
                    } else {
                        f2 = f;
                        return Boxing.boxFloat(f2);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$FloatRef = (Ref$FloatRef) defaultFlingBehavior$performFling$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                f2 = ref$FloatRef.element;
                return Boxing.boxFloat(f2);
            }
        }
        defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, continuation);
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$122 = defaultFlingBehavior$performFling$1;
        Object obj2 = defaultFlingBehavior$performFling$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultFlingBehavior$performFling$122.label;
        if (i != 0) {
        }
        f2 = ref$FloatRef.element;
        return Boxing.boxFloat(f2);
    }
}
