package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BringIntoViewResponder.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/relocation/AndroidBringIntoViewParent;", "Landroidx/compose/foundation/relocation/BringIntoViewParent;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "bringChildIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "childCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class AndroidBringIntoViewParent implements BringIntoViewParent {
    private final View view;

    public AndroidBringIntoViewParent(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public Object bringChildIntoView(Rect rect, LayoutCoordinates layoutCoordinates, Continuation continuation) {
        android.graphics.Rect rect2;
        Rect m1320translatek4lQ0M = rect.m1320translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        View view = this.view;
        rect2 = BringIntoViewResponder_androidKt.toRect(m1320translatek4lQ0M);
        view.requestRectangleOnScreen(rect2, false);
        return Unit.INSTANCE;
    }
}
