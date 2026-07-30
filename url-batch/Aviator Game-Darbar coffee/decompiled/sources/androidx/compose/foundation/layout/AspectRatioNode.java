package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u001c\u0010\u001f\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u001c\u0010 \u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0016J\u001c\u0010\"\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001bH\u0016J\u0013\u0010#\u001a\u00020$*\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020$*\u00020\u00172\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*J\u001b\u0010+\u001a\u00020$*\u00020\u00172\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010*J\u001b\u0010-\u001a\u00020$*\u00020\u00172\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010*J\u001b\u0010/\u001a\u00020$*\u00020\u00172\u0006\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u00061"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "<init>", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "maxIntrinsicWidth", "minIntrinsicHeight", "width", "maxIntrinsicHeight", "findSize", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "tryMaxWidth", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxHeight", "tryMaxHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo71measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m708findSizeToXhtMw = m708findSizeToXhtMw(j);
        if (!IntSize.m7691equalsimpl0(m708findSizeToXhtMw, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m7485fixedJhjzzOo((int) (m708findSizeToXhtMw >> 32), (int) (m708findSizeToXhtMw & 4294967295L));
        }
        final Placeable mo6183measureBRTryo0 = measurable.mo6183measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo6183measureBRTryo0.getWidth(), mo6183measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.AspectRatioNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AspectRatioNode.measure_3p2s80s$lambda$0(Placeable.this, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    static final Unit measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        return Math.round(i * this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (i == Integer.MAX_VALUE) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        return Math.round(i / this.aspectRatio);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m708findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m710tryMaxWidthJN0ABg = m710tryMaxWidthJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m710tryMaxWidthJN0ABg, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m710tryMaxWidthJN0ABg;
            }
            long m709tryMaxHeightJN0ABg = m709tryMaxHeightJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m709tryMaxHeightJN0ABg, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m709tryMaxHeightJN0ABg;
            }
            long m712tryMinWidthJN0ABg = m712tryMinWidthJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m712tryMinWidthJN0ABg, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m712tryMinWidthJN0ABg;
            }
            long m711tryMinHeightJN0ABg = m711tryMinHeightJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m711tryMinHeightJN0ABg, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m711tryMinHeightJN0ABg;
            }
            long m710tryMaxWidthJN0ABg2 = m710tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m710tryMaxWidthJN0ABg2, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m710tryMaxWidthJN0ABg2;
            }
            long m709tryMaxHeightJN0ABg2 = m709tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m709tryMaxHeightJN0ABg2, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m709tryMaxHeightJN0ABg2;
            }
            long m712tryMinWidthJN0ABg2 = m712tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m712tryMinWidthJN0ABg2, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m712tryMinWidthJN0ABg2;
            }
            long m711tryMinHeightJN0ABg2 = m711tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m711tryMinHeightJN0ABg2, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m711tryMinHeightJN0ABg2;
            }
        } else {
            long m709tryMaxHeightJN0ABg3 = m709tryMaxHeightJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m709tryMaxHeightJN0ABg3, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m709tryMaxHeightJN0ABg3;
            }
            long m710tryMaxWidthJN0ABg3 = m710tryMaxWidthJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m710tryMaxWidthJN0ABg3, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m710tryMaxWidthJN0ABg3;
            }
            long m711tryMinHeightJN0ABg3 = m711tryMinHeightJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m711tryMinHeightJN0ABg3, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m711tryMinHeightJN0ABg3;
            }
            long m712tryMinWidthJN0ABg3 = m712tryMinWidthJN0ABg(j, true);
            if (!IntSize.m7691equalsimpl0(m712tryMinWidthJN0ABg3, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m712tryMinWidthJN0ABg3;
            }
            long m709tryMaxHeightJN0ABg4 = m709tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m709tryMaxHeightJN0ABg4, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m709tryMaxHeightJN0ABg4;
            }
            long m710tryMaxWidthJN0ABg4 = m710tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m710tryMaxWidthJN0ABg4, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m710tryMaxWidthJN0ABg4;
            }
            long m711tryMinHeightJN0ABg4 = m711tryMinHeightJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m711tryMinHeightJN0ABg4, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m711tryMinHeightJN0ABg4;
            }
            long m712tryMinWidthJN0ABg4 = m712tryMinWidthJN0ABg(j, false);
            if (!IntSize.m7691equalsimpl0(m712tryMinWidthJN0ABg4, IntSize.INSTANCE.m7698getZeroYbymL2g())) {
                return m712tryMinWidthJN0ABg4;
            }
        }
        return IntSize.INSTANCE.m7698getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m710tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m7475getMaxWidthimpl = Constraints.m7475getMaxWidthimpl(j);
        if (m7475getMaxWidthimpl == Integer.MAX_VALUE || (round = Math.round(m7475getMaxWidthimpl / this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m707isSatisfiedByNN6EwU(j, m7475getMaxWidthimpl, round))) {
            return IntSize.INSTANCE.m7698getZeroYbymL2g();
        }
        return IntSize.m7688constructorimpl((m7475getMaxWidthimpl << 32) | (round & 4294967295L));
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m709tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m7474getMaxHeightimpl = Constraints.m7474getMaxHeightimpl(j);
        if (m7474getMaxHeightimpl == Integer.MAX_VALUE || (round = Math.round(m7474getMaxHeightimpl * this.aspectRatio)) <= 0 || (z && !AspectRatioKt.m707isSatisfiedByNN6EwU(j, round, m7474getMaxHeightimpl))) {
            return IntSize.INSTANCE.m7698getZeroYbymL2g();
        }
        return IntSize.m7688constructorimpl((round << 32) | (m7474getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m712tryMinWidthJN0ABg(long j, boolean z) {
        int m7477getMinWidthimpl = Constraints.m7477getMinWidthimpl(j);
        int round = Math.round(m7477getMinWidthimpl / this.aspectRatio);
        if (round <= 0 || (z && !AspectRatioKt.m707isSatisfiedByNN6EwU(j, m7477getMinWidthimpl, round))) {
            return IntSize.INSTANCE.m7698getZeroYbymL2g();
        }
        return IntSize.m7688constructorimpl((m7477getMinWidthimpl << 32) | (round & 4294967295L));
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m711tryMinHeightJN0ABg(long j, boolean z) {
        int m7476getMinHeightimpl = Constraints.m7476getMinHeightimpl(j);
        int round = Math.round(m7476getMinHeightimpl * this.aspectRatio);
        if (round <= 0 || (z && !AspectRatioKt.m707isSatisfiedByNN6EwU(j, round, m7476getMinHeightimpl))) {
            return IntSize.INSTANCE.m7698getZeroYbymL2g();
        }
        return IntSize.m7688constructorimpl((round << 32) | (m7476getMinHeightimpl & 4294967295L));
    }
}
