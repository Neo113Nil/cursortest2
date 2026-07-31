package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ScrollExtensions.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f, AnimationSpec<Float> animationSpec, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.$value = f;
        this.$animationSpec = animationSpec;
        this.$previousValue = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, continuation);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull ScrollScope scrollScope, @Nullable Continuation continuation) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            Function2 function2 = new Function2() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2, float f3) {
                    Ref$FloatRef ref$FloatRef2 = Ref$FloatRef.this;
                    float f4 = ref$FloatRef2.element;
                    ref$FloatRef2.element = f4 + scrollScope.scrollBy(f2 - f4);
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, function2, this, 4, null) == coroutine_suspended) {
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
