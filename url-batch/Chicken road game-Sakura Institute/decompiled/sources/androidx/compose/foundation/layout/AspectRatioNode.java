package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010\u0018\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001c\u0010$\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010%\u001a\u00020\u0016*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J \u0010&\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010)J \u0010,\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010)J \u0010.\u001a\u00020\u0011*\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u0010)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {
    private float aspectRatio;
    private boolean matchHeightConstraintsFirst;

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.matchHeightConstraintsFirst = z;
    }

    public AspectRatioNode(float f, boolean z) {
        this.aspectRatio = f;
        this.matchHeightConstraintsFirst = z;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo91measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m578findSizeToXhtMw = m578findSizeToXhtMw(j);
        if (!IntSize.m6467equalsimpl0(m578findSizeToXhtMw, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m6262fixedJhjzzOo(IntSize.m6469getWidthimpl(m578findSizeToXhtMw), IntSize.m6468getHeightimpl(m578findSizeToXhtMw));
        }
        final Placeable mo5175measureBRTryo0 = measurable.mo5175measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo5175measureBRTryo0.getWidth(), mo5175measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
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
    private final long m578findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m582tryMaxWidthJN0ABg$default = m582tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m582tryMaxWidthJN0ABg$default, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m582tryMaxWidthJN0ABg$default;
            }
            long m580tryMaxHeightJN0ABg$default = m580tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m580tryMaxHeightJN0ABg$default, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m580tryMaxHeightJN0ABg$default;
            }
            long m586tryMinWidthJN0ABg$default = m586tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m586tryMinWidthJN0ABg$default, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m586tryMinWidthJN0ABg$default;
            }
            long m584tryMinHeightJN0ABg$default = m584tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m584tryMinHeightJN0ABg$default, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m584tryMinHeightJN0ABg$default;
            }
            long m581tryMaxWidthJN0ABg = m581tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m581tryMaxWidthJN0ABg, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m581tryMaxWidthJN0ABg;
            }
            long m579tryMaxHeightJN0ABg = m579tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m579tryMaxHeightJN0ABg, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m579tryMaxHeightJN0ABg;
            }
            long m585tryMinWidthJN0ABg = m585tryMinWidthJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m585tryMinWidthJN0ABg, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m585tryMinWidthJN0ABg;
            }
            long m583tryMinHeightJN0ABg = m583tryMinHeightJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m583tryMinHeightJN0ABg, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m583tryMinHeightJN0ABg;
            }
        } else {
            long m580tryMaxHeightJN0ABg$default2 = m580tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m580tryMaxHeightJN0ABg$default2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m580tryMaxHeightJN0ABg$default2;
            }
            long m582tryMaxWidthJN0ABg$default2 = m582tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m582tryMaxWidthJN0ABg$default2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m582tryMaxWidthJN0ABg$default2;
            }
            long m584tryMinHeightJN0ABg$default2 = m584tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m584tryMinHeightJN0ABg$default2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m584tryMinHeightJN0ABg$default2;
            }
            long m586tryMinWidthJN0ABg$default2 = m586tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6467equalsimpl0(m586tryMinWidthJN0ABg$default2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m586tryMinWidthJN0ABg$default2;
            }
            long m579tryMaxHeightJN0ABg2 = m579tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m579tryMaxHeightJN0ABg2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m579tryMaxHeightJN0ABg2;
            }
            long m581tryMaxWidthJN0ABg2 = m581tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m581tryMaxWidthJN0ABg2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m581tryMaxWidthJN0ABg2;
            }
            long m583tryMinHeightJN0ABg2 = m583tryMinHeightJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m583tryMinHeightJN0ABg2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m583tryMinHeightJN0ABg2;
            }
            long m585tryMinWidthJN0ABg2 = m585tryMinWidthJN0ABg(j, false);
            if (!IntSize.m6467equalsimpl0(m585tryMinWidthJN0ABg2, IntSize.INSTANCE.m6474getZeroYbymL2g())) {
                return m585tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m6474getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m582tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m581tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m581tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m6252getMaxWidthimpl = Constraints.m6252getMaxWidthimpl(j);
        if (m6252getMaxWidthimpl != Integer.MAX_VALUE && (round = Math.round(m6252getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m6252getMaxWidthimpl, round);
            if (!z || ConstraintsKt.m6270isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6474getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m580tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m579tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m579tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m6251getMaxHeightimpl = Constraints.m6251getMaxHeightimpl(j);
        if (m6251getMaxHeightimpl != Integer.MAX_VALUE && (round = Math.round(m6251getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6251getMaxHeightimpl);
            if (!z || ConstraintsKt.m6270isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6474getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m586tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m585tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m585tryMinWidthJN0ABg(long j, boolean z) {
        int m6254getMinWidthimpl = Constraints.m6254getMinWidthimpl(j);
        int round = Math.round(m6254getMinWidthimpl / this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(m6254getMinWidthimpl, round);
            if (!z || ConstraintsKt.m6270isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6474getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m584tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m583tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m583tryMinHeightJN0ABg(long j, boolean z) {
        int m6253getMinHeightimpl = Constraints.m6253getMinHeightimpl(j);
        int round = Math.round(m6253getMinHeightimpl * this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6253getMinHeightimpl);
            if (!z || ConstraintsKt.m6270isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6474getZeroYbymL2g();
    }
}
