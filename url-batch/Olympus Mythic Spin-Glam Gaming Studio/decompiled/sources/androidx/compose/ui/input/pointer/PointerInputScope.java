package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: SuspendingPointerInputFilter.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J=\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PointerInputScope extends Density {

    /* compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    Object awaitPointerEventScope(Function2 function2, Continuation continuation);

    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z) {
    }
}
