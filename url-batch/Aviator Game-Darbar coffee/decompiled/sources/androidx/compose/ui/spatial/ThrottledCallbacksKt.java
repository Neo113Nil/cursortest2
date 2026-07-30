package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;

/* compiled from: ThrottledCallbacks.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"rectInfoFor", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "topLeft", "", "bottomRight", "windowOffset", "Landroidx/compose/ui/unit/IntOffset;", "screenOffset", "windowSize", "viewToWindowMatrix", "Landroidx/compose/ui/graphics/Matrix;", "rectInfoFor-Dg36KO4", "(Landroidx/compose/ui/node/DelegatableNode;JJJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "ui"}, k = 2, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final RelativeLayoutBounds m6783rectInfoForDg36KO4(DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        NodeCoordinator m6354requireCoordinator64DMado = DelegatableNodeKt.m6354requireCoordinator64DMado(delegatableNode, NodeKind.m6502constructorimpl(2));
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!requireLayoutNode.isPlaced()) {
            return null;
        }
        if (requireLayoutNode.getOuterCoordinator$ui() != m6354requireCoordinator64DMado) {
            long m7644constructorimpl = IntOffset.m7644constructorimpl(j);
            float m7650getXimpl = IntOffset.m7650getXimpl(m7644constructorimpl);
            float m7651getYimpl = IntOffset.m7651getYimpl(m7644constructorimpl);
            long m4486constructorimpl = Offset.m4486constructorimpl((Float.floatToRawIntBits(m7650getXimpl) << 32) | (Float.floatToRawIntBits(m7651getYimpl) & 4294967295L));
            long mo6191getSizeYbymL2g = m6354requireCoordinator64DMado.getCoordinates().mo6191getSizeYbymL2g();
            return new RelativeLayoutBounds(IntOffsetKt.m7667roundk4lQ0M(requireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo6192localPositionOfR5De75A(m6354requireCoordinator64DMado, m4486constructorimpl)), IntOffset.m7644constructorimpl(((IntOffset.m7650getXimpl(r0) + ((int) (mo6191getSizeYbymL2g >> 32))) << 32) | ((IntOffset.m7651getYimpl(r0) + ((int) (mo6191getSizeYbymL2g & 4294967295L))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
        }
        return new RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
    }
}
