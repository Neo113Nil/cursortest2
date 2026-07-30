package androidx.compose.foundation.gestures;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: Scrollable.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final /* synthetic */ class ScrollableNode$ensureMouseWheelScrollNodeInitialized$1 extends AdaptedFunctionReference implements Function2<Velocity, Continuation<? super Unit>, Object>, SuspendFunction {
    ScrollableNode$ensureMouseWheelScrollNodeInitialized$1(Object obj) {
        super(2, obj, ScrollableNode.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Unit> continuation) {
        return m577invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m577invokesFctU(long j, Continuation<? super Unit> continuation) {
        Object ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
        ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped = ScrollableNode.ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped((ScrollableNode) this.receiver, j, continuation);
        return ensureMouseWheelScrollNodeInitialized$onWheelScrollStopped;
    }
}
