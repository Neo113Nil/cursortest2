package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {412, TTAdConstant.VIDEO_URL_CODE, 421, 422, 431}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ State<Function0> $delayPressInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends Function0> state, Continuation continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
        this.$delayPressInteraction = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, continuation);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ClickableKt$handlePressInteraction$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Job launch$default;
        Object tryAwaitRelease;
        Interaction cancel;
        boolean z;
        PressInteraction.Release release;
        MutableInteractionSource mutableInteractionSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            launch$default = BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, null), 3, null);
            PressGestureScope pressGestureScope = this.$this_handlePressInteraction;
            this.L$0 = launch$default;
            this.label = 1;
            tryAwaitRelease = pressGestureScope.tryAwaitRelease(this);
            if (tryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 || i == 5) {
                            ResultKt.throwOnFailure(obj);
                            this.$pressedInteraction.setValue(null);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    release = (PressInteraction.Release) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$pressedInteraction.setValue(null);
                    return Unit.INSTANCE;
                }
                z = this.Z$0;
                ResultKt.throwOnFailure(obj);
                if (z) {
                    PressInteraction.Press press = new PressInteraction.Press(this.$pressPoint, null);
                    PressInteraction.Release release2 = new PressInteraction.Release(press);
                    MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
                    this.L$0 = release2;
                    this.label = 3;
                    if (mutableInteractionSource2.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release = release2;
                    mutableInteractionSource = this.$interactionSource;
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableInteractionSource.emit(release, this) == coroutine_suspended) {
                    }
                }
                this.$pressedInteraction.setValue(null);
                return Unit.INSTANCE;
            }
            launch$default = (Job) this.L$0;
            ResultKt.throwOnFailure(obj);
            tryAwaitRelease = obj;
        }
        boolean booleanValue = ((Boolean) tryAwaitRelease).booleanValue();
        if (launch$default.isActive()) {
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 2;
            if (JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = booleanValue;
            if (z) {
            }
            this.$pressedInteraction.setValue(null);
            return Unit.INSTANCE;
        }
        PressInteraction.Press press2 = (PressInteraction.Press) this.$pressedInteraction.getValue();
        if (press2 != null) {
            MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
            if (booleanValue) {
                cancel = new PressInteraction.Release(press2);
            } else {
                cancel = new PressInteraction.Cancel(press2);
            }
            this.L$0 = null;
            this.label = 5;
            if (mutableInteractionSource3.emit(cancel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$pressedInteraction.setValue(null);
        return Unit.INSTANCE;
    }
}
