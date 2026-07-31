package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Button.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1", f = "Button.kt", l = {506}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DefaultButtonElevation$elevation$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultButtonElevation$elevation$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DefaultButtonElevation$elevation$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((DefaultButtonElevation$elevation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material.DefaultButtonElevation$elevation$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Interaction interaction, Continuation continuation) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        SnapshotStateList.this.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        SnapshotStateList.this.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        SnapshotStateList.this.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        SnapshotStateList.this.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        SnapshotStateList.this.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        SnapshotStateList.this.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        SnapshotStateList.this.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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
