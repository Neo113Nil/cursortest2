package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/foundation/gestures/ScrollDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDraggableState;", "Landroidx/compose/foundation/gestures/PointerAwareDragScope;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollLogic", "<init>", "(Landroidx/compose/runtime/State;)V", "", "pixels", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "", "dragBy-Uv8p0NA", "(FJ)V", "dragBy", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/State;", "getScrollLogic", "()Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/gestures/ScrollScope;", "latestScrollScope", "Landroidx/compose/foundation/gestures/ScrollScope;", "getLatestScrollScope", "()Landroidx/compose/foundation/gestures/ScrollScope;", "setLatestScrollScope", "(Landroidx/compose/foundation/gestures/ScrollScope;)V", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ScrollDraggableState implements PointerAwareDraggableState, PointerAwareDragScope {
    private ScrollScope latestScrollScope;
    private final State scrollLogic;

    public ScrollDraggableState(State scrollLogic) {
        ScrollScope scrollScope;
        Intrinsics.checkNotNullParameter(scrollLogic, "scrollLogic");
        this.scrollLogic = scrollLogic;
        scrollScope = ScrollableKt.NoOpScrollScope;
        this.latestScrollScope = scrollScope;
    }

    public final void setLatestScrollScope(ScrollScope scrollScope) {
        Intrinsics.checkNotNullParameter(scrollScope, "<set-?>");
        this.latestScrollScope = scrollScope;
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDragScope
    /* renamed from: dragBy-Uv8p0NA */
    public void mo263dragByUv8p0NA(float pixels, long pointerPosition) {
        ScrollingLogic scrollingLogic = (ScrollingLogic) this.scrollLogic.getValue();
        scrollingLogic.m278dispatchScrollf0eR0lY(this.latestScrollScope, scrollingLogic.m284toOffsettuRUvjQ(pixels), Offset.m1288boximpl(pointerPosition), NestedScrollSource.INSTANCE.m1831getDragWNlRxjI());
    }

    @Override // androidx.compose.foundation.gestures.PointerAwareDraggableState
    public Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object scroll = ((ScrollingLogic) this.scrollLogic.getValue()).getScrollableState().scroll(mutatePriority, new ScrollDraggableState$drag$2(this, function2, null), continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }
}
