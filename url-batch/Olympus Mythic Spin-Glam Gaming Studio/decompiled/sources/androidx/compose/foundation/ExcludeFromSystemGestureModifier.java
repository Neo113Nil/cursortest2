package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import com.ironsource.Y3;
import java.util.List;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: SystemGestureExclusion.kt */
@RequiresApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "exclusion", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "layoutCoordinates", "rect", "Landroid/graphics/Rect;", "calcBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "findRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", Y3.f, "", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "removeRect", "()V", "newRect", "replaceRect", "(Landroid/graphics/Rect;)V", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "getExclusion", "()Lkotlin/jvm/functions/Function1;", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExcludeFromSystemGestureModifier implements OnGloballyPositionedModifier {
    private final Function1 exclusion;
    private Rect rect;
    private final View view;

    public ExcludeFromSystemGestureModifier(View view, Function1 function1) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.exclusion = function1;
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates coordinates) {
        Rect calcBounds;
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        Function1 function1 = this.exclusion;
        if (function1 == null) {
            calcBounds = RectHelper_androidKt.toAndroidRect(LayoutCoordinatesKt.boundsInRoot(coordinates));
        } else {
            calcBounds = calcBounds(coordinates, (androidx.compose.ui.geometry.Rect) function1.invoke(coordinates));
        }
        replaceRect(calcBounds);
    }

    public final void removeRect() {
        replaceRect(null);
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        long mo1947localPositionOfR5De75A = findRoot.mo1947localPositionOfR5De75A(layoutCoordinates, rect.m1318getTopLeftF1C5BW0());
        long mo1947localPositionOfR5De75A2 = findRoot.mo1947localPositionOfR5De75A(layoutCoordinates, rect.m1319getTopRightF1C5BW0());
        long mo1947localPositionOfR5De75A3 = findRoot.mo1947localPositionOfR5De75A(layoutCoordinates, rect.m1314getBottomLeftF1C5BW0());
        long mo1947localPositionOfR5De75A4 = findRoot.mo1947localPositionOfR5De75A(layoutCoordinates, rect.m1315getBottomRightF1C5BW0());
        return new Rect(MathKt.roundToInt(ComparisonsKt.minOf(Offset.m1297getXimpl(mo1947localPositionOfR5De75A), Offset.m1297getXimpl(mo1947localPositionOfR5De75A2), Offset.m1297getXimpl(mo1947localPositionOfR5De75A3), Offset.m1297getXimpl(mo1947localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.minOf(Offset.m1298getYimpl(mo1947localPositionOfR5De75A), Offset.m1298getYimpl(mo1947localPositionOfR5De75A2), Offset.m1298getYimpl(mo1947localPositionOfR5De75A3), Offset.m1298getYimpl(mo1947localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m1297getXimpl(mo1947localPositionOfR5De75A), Offset.m1297getXimpl(mo1947localPositionOfR5De75A2), Offset.m1297getXimpl(mo1947localPositionOfR5De75A3), Offset.m1297getXimpl(mo1947localPositionOfR5De75A4))), MathKt.roundToInt(ComparisonsKt.maxOf(Offset.m1298getYimpl(mo1947localPositionOfR5De75A), Offset.m1298getYimpl(mo1947localPositionOfR5De75A2), Offset.m1298getYimpl(mo1947localPositionOfR5De75A3), Offset.m1298getYimpl(mo1947localPositionOfR5De75A4))));
    }

    private final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            LayoutCoordinates layoutCoordinates3 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates2;
            if (layoutCoordinates == null) {
                return layoutCoordinates3;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
    }

    public final void replaceRect(Rect newRect) {
        List systemGestureExclusionRects;
        MutableVector mutableVector = new MutableVector(new Rect[16], 0);
        systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        Intrinsics.checkNotNullExpressionValue(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        mutableVector.addAll(mutableVector.getSize(), systemGestureExclusionRects);
        Rect rect = this.rect;
        if (rect != null) {
            mutableVector.remove(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            mutableVector.add(newRect);
        }
        this.view.setSystemGestureExclusionRects(mutableVector.asMutableList());
        this.rect = newRect;
    }
}
