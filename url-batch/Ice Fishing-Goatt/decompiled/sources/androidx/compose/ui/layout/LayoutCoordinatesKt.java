package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

/* compiled from: LayoutCoordinates.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5163localToRootMKHz9U(Offset.INSTANCE.m3598getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5165localToWindowMKHz9U(Offset.INSTANCE.m3598getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5164localToScreenMKHz9U(Offset.INSTANCE.m3598getZeroF1C5BW0());
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float m6435getWidthimpl = IntSize.m6435getWidthimpl(findRootCoordinates.mo5160getSizeYbymL2g());
        float m6434getHeightimpl = IntSize.m6434getHeightimpl(findRootCoordinates.mo5160getSizeYbymL2g());
        Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float left = boundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > m6435getWidthimpl) {
            left = m6435getWidthimpl;
        }
        float top = boundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > m6434getHeightimpl) {
            top = m6434getHeightimpl;
        }
        float right = boundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= m6435getWidthimpl) {
            m6435getWidthimpl = right;
        }
        float bottom = boundsInRoot.getBottom();
        float f = bottom >= 0.0f ? bottom : 0.0f;
        if (f <= m6434getHeightimpl) {
            m6434getHeightimpl = f;
        }
        if (left == m6435getWidthimpl || top == m6434getHeightimpl) {
            return Rect.INSTANCE.getZero();
        }
        long mo5165localToWindowMKHz9U = findRootCoordinates.mo5165localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long mo5165localToWindowMKHz9U2 = findRootCoordinates.mo5165localToWindowMKHz9U(OffsetKt.Offset(m6435getWidthimpl, top));
        long mo5165localToWindowMKHz9U3 = findRootCoordinates.mo5165localToWindowMKHz9U(OffsetKt.Offset(m6435getWidthimpl, m6434getHeightimpl));
        long mo5165localToWindowMKHz9U4 = findRootCoordinates.mo5165localToWindowMKHz9U(OffsetKt.Offset(left, m6434getHeightimpl));
        float m3582getXimpl = Offset.m3582getXimpl(mo5165localToWindowMKHz9U);
        float m3582getXimpl2 = Offset.m3582getXimpl(mo5165localToWindowMKHz9U2);
        float m3582getXimpl3 = Offset.m3582getXimpl(mo5165localToWindowMKHz9U4);
        float m3582getXimpl4 = Offset.m3582getXimpl(mo5165localToWindowMKHz9U3);
        float min = Math.min(m3582getXimpl, Math.min(m3582getXimpl2, Math.min(m3582getXimpl3, m3582getXimpl4)));
        float max = Math.max(m3582getXimpl, Math.max(m3582getXimpl2, Math.max(m3582getXimpl3, m3582getXimpl4)));
        float m3583getYimpl = Offset.m3583getYimpl(mo5165localToWindowMKHz9U);
        float m3583getYimpl2 = Offset.m3583getYimpl(mo5165localToWindowMKHz9U2);
        float m3583getYimpl3 = Offset.m3583getYimpl(mo5165localToWindowMKHz9U4);
        float m3583getYimpl4 = Offset.m3583getYimpl(mo5165localToWindowMKHz9U3);
        return new Rect(min, Math.min(m3583getYimpl, Math.min(m3583getYimpl2, Math.min(m3583getYimpl3, m3583getYimpl4))), max, Math.max(m3583getYimpl, Math.max(m3583getYimpl2, Math.max(m3583getYimpl3, m3583getYimpl4))));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5161localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3598getZeroF1C5BW0()) : Offset.INSTANCE.m3598getZeroF1C5BW0();
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect localBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m6435getWidthimpl(layoutCoordinates.mo5160getSizeYbymL2g()), IntSize.m6434getHeightimpl(layoutCoordinates.mo5160getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
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
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }
}
