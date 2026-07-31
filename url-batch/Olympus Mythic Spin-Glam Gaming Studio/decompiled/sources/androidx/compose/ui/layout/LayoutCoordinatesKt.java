package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "positionInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInWindow", "Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "boundsInParent", "findRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo1948localToRootMKHz9U(Offset.INSTANCE.m1308getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return layoutCoordinates.mo1949localToWindowMKHz9U(Offset.INSTANCE.m1308getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return LayoutCoordinates.localBoundingBoxOf$default(findRoot(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates findRoot = findRoot(layoutCoordinates);
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        long mo1949localToWindowMKHz9U = findRoot.mo1949localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getTop()));
        long mo1949localToWindowMKHz9U2 = findRoot.mo1949localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getTop()));
        long mo1949localToWindowMKHz9U3 = findRoot.mo1949localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getRight(), boundsInRoot.getBottom()));
        long mo1949localToWindowMKHz9U4 = findRoot.mo1949localToWindowMKHz9U(OffsetKt.Offset(boundsInRoot.getLeft(), boundsInRoot.getBottom()));
        return new Rect(ComparisonsKt.minOf(Offset.m1297getXimpl(mo1949localToWindowMKHz9U), Offset.m1297getXimpl(mo1949localToWindowMKHz9U2), Offset.m1297getXimpl(mo1949localToWindowMKHz9U4), Offset.m1297getXimpl(mo1949localToWindowMKHz9U3)), ComparisonsKt.minOf(Offset.m1298getYimpl(mo1949localToWindowMKHz9U), Offset.m1298getYimpl(mo1949localToWindowMKHz9U2), Offset.m1298getYimpl(mo1949localToWindowMKHz9U4), Offset.m1298getYimpl(mo1949localToWindowMKHz9U3)), ComparisonsKt.maxOf(Offset.m1297getXimpl(mo1949localToWindowMKHz9U), Offset.m1297getXimpl(mo1949localToWindowMKHz9U2), Offset.m1297getXimpl(mo1949localToWindowMKHz9U4), Offset.m1297getXimpl(mo1949localToWindowMKHz9U3)), ComparisonsKt.maxOf(Offset.m1298getYimpl(mo1949localToWindowMKHz9U), Offset.m1298getYimpl(mo1949localToWindowMKHz9U2), Offset.m1298getYimpl(mo1949localToWindowMKHz9U4), Offset.m1298getYimpl(mo1949localToWindowMKHz9U3)));
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m2567getWidthimpl(layoutCoordinates.mo1946getSizeYbymL2g()), IntSize.m2566getHeightimpl(layoutCoordinates.mo1946getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        LayoutNodeWrapper layoutNodeWrapper = layoutCoordinates2 instanceof LayoutNodeWrapper ? (LayoutNodeWrapper) layoutCoordinates2 : null;
        if (layoutNodeWrapper == null) {
            return layoutCoordinates2;
        }
        LayoutNodeWrapper wrappedBy = layoutNodeWrapper.getWrappedBy();
        while (true) {
            LayoutNodeWrapper layoutNodeWrapper2 = wrappedBy;
            LayoutNodeWrapper layoutNodeWrapper3 = layoutNodeWrapper;
            layoutNodeWrapper = layoutNodeWrapper2;
            if (layoutNodeWrapper == null) {
                return layoutNodeWrapper3;
            }
            wrappedBy = layoutNodeWrapper.getWrappedBy();
        }
    }
}
