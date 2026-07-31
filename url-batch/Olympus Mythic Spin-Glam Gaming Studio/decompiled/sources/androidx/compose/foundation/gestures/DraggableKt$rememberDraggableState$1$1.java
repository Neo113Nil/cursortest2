package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: Draggable.kt */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
final class DraggableKt$rememberDraggableState$1$1 extends Lambda implements Function1 {
    final /* synthetic */ State<Function1> $onDeltaState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DraggableKt$rememberDraggableState$1$1(State<? extends Function1> state) {
        super(1);
        this.$onDeltaState = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        ((Function1) this.$onDeltaState.getValue()).invoke(Float.valueOf(f));
    }
}
