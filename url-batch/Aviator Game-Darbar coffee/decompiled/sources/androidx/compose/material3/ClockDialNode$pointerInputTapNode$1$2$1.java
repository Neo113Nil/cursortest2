package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TimePicker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", i = {}, l = {1509}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class ClockDialNode$pointerInputTapNode$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Offset $it;
    int label;
    final /* synthetic */ ClockDialNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClockDialNode$pointerInputTapNode$1$2$1(ClockDialNode clockDialNode, Offset offset, Continuation<? super ClockDialNode$pointerInputTapNode$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = clockDialNode;
        this.$it = offset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClockDialNode$pointerInputTapNode$1$2$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClockDialNode$pointerInputTapNode$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalogTimePickerState analogTimePickerState;
        float maxDist;
        boolean z;
        long m1843getCenternOccac;
        AnimationSpec animationSpec;
        Object m2764onTapuYHVD98;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            analogTimePickerState = this.this$0.state;
            float intBitsToFloat = Float.intBitsToFloat((int) (this.$it.m4504unboximpl() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (this.$it.m4504unboximpl() & 4294967295L));
            maxDist = this.this$0.getMaxDist();
            z = this.this$0.autoSwitchToMinute;
            m1843getCenternOccac = this.this$0.m1843getCenternOccac();
            animationSpec = this.this$0.animationSpec;
            this.label = 1;
            m2764onTapuYHVD98 = TimePickerKt.m2764onTapuYHVD98(analogTimePickerState, intBitsToFloat, intBitsToFloat2, maxDist, z, m1843getCenternOccac, animationSpec, this);
            if (m2764onTapuYHVD98 == coroutine_suspended) {
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
