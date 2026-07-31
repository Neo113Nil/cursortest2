package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import com.vungle.ads.internal.protos.Sdk;
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

/* compiled from: FloatingActionButton.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2", f = "FloatingActionButton.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DefaultFloatingActionButtonElevation$elevation$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ DefaultFloatingActionButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$2(Animatable<Dp, AnimationVector1D> animatable, DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, float f, Interaction interaction, Continuation continuation) {
        super(2, continuation);
        this.$animatable = animatable;
        this.this$0 = defaultFloatingActionButtonElevation;
        this.$target = f;
        this.$interaction = interaction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DefaultFloatingActionButtonElevation$elevation$2(this.$animatable, this.this$0, this.$target, this.$interaction, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DefaultFloatingActionButtonElevation$elevation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        float f;
        float f2;
        float f3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float value = ((Dp) this.$animatable.getTargetValue()).getValue();
            f = this.this$0.pressedElevation;
            Interaction interaction = null;
            if (Dp.m2509equalsimpl0(value, f)) {
                interaction = new PressInteraction.Press(Offset.INSTANCE.m1308getZeroF1C5BW0(), null);
            } else {
                f2 = this.this$0.hoveredElevation;
                if (Dp.m2509equalsimpl0(value, f2)) {
                    interaction = new HoverInteraction.Enter();
                } else {
                    f3 = this.this$0.focusedElevation;
                    if (Dp.m2509equalsimpl0(value, f3)) {
                        interaction = new FocusInteraction.Focus();
                    }
                }
            }
            Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
            float f4 = this.$target;
            Interaction interaction2 = this.$interaction;
            this.label = 1;
            if (ElevationKt.m858animateElevationrAjV9yQ(animatable, f4, interaction, interaction2, this) == coroutine_suspended) {
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
