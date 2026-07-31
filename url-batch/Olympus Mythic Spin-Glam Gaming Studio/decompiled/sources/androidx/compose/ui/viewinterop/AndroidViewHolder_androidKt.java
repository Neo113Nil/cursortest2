package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.math.MathKt;

/* compiled from: AndroidViewHolder.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "layoutAccordingTo", "(Landroid/view/View;Landroidx/compose/ui/node/LayoutNode;)V", "", "", "toComposeOffset", "(I)F", "toComposeVelocity", "(F)F", "type", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "toNestedScrollSource", "(I)I", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidViewHolder_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i) {
        return i * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(View view, LayoutNode layoutNode) {
        long positionInRoot = LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int roundToInt = MathKt.roundToInt(Offset.m1297getXimpl(positionInRoot));
        int roundToInt2 = MathKt.roundToInt(Offset.m1298getYimpl(positionInRoot));
        view.layout(roundToInt, roundToInt2, view.getMeasuredWidth() + roundToInt, view.getMeasuredHeight() + roundToInt2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i) {
        if (i == 0) {
            return NestedScrollSource.INSTANCE.m1831getDragWNlRxjI();
        }
        return NestedScrollSource.INSTANCE.m1832getFlingWNlRxjI();
    }
}
