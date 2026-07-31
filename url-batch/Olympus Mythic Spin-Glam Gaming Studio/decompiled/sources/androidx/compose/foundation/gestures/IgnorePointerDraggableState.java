package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Draggable.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/gestures/IgnorePointerDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "Landroidx/compose/foundation/gestures/DraggableState;", "origin", "<init>", "(Landroidx/compose/foundation/gestures/DraggableState;)V", "", "pixels", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "dragBy-Uv8p0NA", "(FJ)V", "dragBy", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/DraggableState;", "getOrigin", "()Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/foundation/gestures/DragScope;", "latestConsumptionScope", "Landroidx/compose/foundation/gestures/DragScope;", "getLatestConsumptionScope", "()Landroidx/compose/foundation/gestures/DragScope;", "setLatestConsumptionScope", "(Landroidx/compose/foundation/gestures/DragScope;)V", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class IgnorePointerDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    private DragScope latestConsumptionScope;
    private final DraggableState origin;

    public IgnorePointerDraggableState(DraggableState origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    public final void setLatestConsumptionScope(DragScope dragScope) {
        this.latestConsumptionScope = dragScope;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    /* renamed from: dragBy-Uv8p0NA, reason: not valid java name */
    public void mo263dragByUv8p0NA(float pixels, long pointerPosition) {
        DragScope dragScope = this.latestConsumptionScope;
        if (dragScope != null) {
            dragScope.dragBy(pixels);
        }
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object drag = this.origin.drag(mutatePriority, new IgnorePointerDraggableState$drag$2(this, function2, null), continuation);
        return drag == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag : Unit.INSTANCE;
    }
}
