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
    public MeasureResult mo85measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        long m570findSizeToXhtMw = m570findSizeToXhtMw(j);
        if (!IntSize.m6433equalsimpl0(m570findSizeToXhtMw, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m6228fixedJhjzzOo(IntSize.m6435getWidthimpl(m570findSizeToXhtMw), IntSize.m6434getHeightimpl(m570findSizeToXhtMw));
        }
        final Placeable mo5152measureBRTryo0 = measurable.mo5152measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo5152measureBRTryo0.getWidth(), mo5152measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioNode$measure$1
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
    private final long m570findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m574tryMaxWidthJN0ABg$default = m574tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m574tryMaxWidthJN0ABg$default, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m574tryMaxWidthJN0ABg$default;
            }
            long m572tryMaxHeightJN0ABg$default = m572tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m572tryMaxHeightJN0ABg$default, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m572tryMaxHeightJN0ABg$default;
            }
            long m578tryMinWidthJN0ABg$default = m578tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m578tryMinWidthJN0ABg$default, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m578tryMinWidthJN0ABg$default;
            }
            long m576tryMinHeightJN0ABg$default = m576tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m576tryMinHeightJN0ABg$default, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m576tryMinHeightJN0ABg$default;
            }
            long m573tryMaxWidthJN0ABg = m573tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m573tryMaxWidthJN0ABg, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m573tryMaxWidthJN0ABg;
            }
            long m571tryMaxHeightJN0ABg = m571tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m571tryMaxHeightJN0ABg, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m571tryMaxHeightJN0ABg;
            }
            long m577tryMinWidthJN0ABg = m577tryMinWidthJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m577tryMinWidthJN0ABg, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m577tryMinWidthJN0ABg;
            }
            long m575tryMinHeightJN0ABg = m575tryMinHeightJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m575tryMinHeightJN0ABg, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m575tryMinHeightJN0ABg;
            }
        } else {
            long m572tryMaxHeightJN0ABg$default2 = m572tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m572tryMaxHeightJN0ABg$default2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m572tryMaxHeightJN0ABg$default2;
            }
            long m574tryMaxWidthJN0ABg$default2 = m574tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m574tryMaxWidthJN0ABg$default2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m574tryMaxWidthJN0ABg$default2;
            }
            long m576tryMinHeightJN0ABg$default2 = m576tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m576tryMinHeightJN0ABg$default2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m576tryMinHeightJN0ABg$default2;
            }
            long m578tryMinWidthJN0ABg$default2 = m578tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m6433equalsimpl0(m578tryMinWidthJN0ABg$default2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m578tryMinWidthJN0ABg$default2;
            }
            long m571tryMaxHeightJN0ABg2 = m571tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m571tryMaxHeightJN0ABg2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m571tryMaxHeightJN0ABg2;
            }
            long m573tryMaxWidthJN0ABg2 = m573tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m573tryMaxWidthJN0ABg2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m573tryMaxWidthJN0ABg2;
            }
            long m575tryMinHeightJN0ABg2 = m575tryMinHeightJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m575tryMinHeightJN0ABg2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m575tryMinHeightJN0ABg2;
            }
            long m577tryMinWidthJN0ABg2 = m577tryMinWidthJN0ABg(j, false);
            if (!IntSize.m6433equalsimpl0(m577tryMinWidthJN0ABg2, IntSize.INSTANCE.m6440getZeroYbymL2g())) {
                return m577tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m6440getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m574tryMaxWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m573tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m573tryMaxWidthJN0ABg(long j, boolean z) {
        int round;
        int m6218getMaxWidthimpl = Constraints.m6218getMaxWidthimpl(j);
        if (m6218getMaxWidthimpl != Integer.MAX_VALUE && (round = Math.round(m6218getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m6218getMaxWidthimpl, round);
            if (!z || ConstraintsKt.m6236isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6440getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m572tryMaxHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m571tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m571tryMaxHeightJN0ABg(long j, boolean z) {
        int round;
        int m6217getMaxHeightimpl = Constraints.m6217getMaxHeightimpl(j);
        if (m6217getMaxHeightimpl != Integer.MAX_VALUE && (round = Math.round(m6217getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6217getMaxHeightimpl);
            if (!z || ConstraintsKt.m6236isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6440getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m578tryMinWidthJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m577tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m577tryMinWidthJN0ABg(long j, boolean z) {
        int m6220getMinWidthimpl = Constraints.m6220getMinWidthimpl(j);
        int round = Math.round(m6220getMinWidthimpl / this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(m6220getMinWidthimpl, round);
            if (!z || ConstraintsKt.m6236isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6440getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m576tryMinHeightJN0ABg$default(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m575tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m575tryMinHeightJN0ABg(long j, boolean z) {
        int m6219getMinHeightimpl = Constraints.m6219getMinHeightimpl(j);
        int round = Math.round(m6219getMinHeightimpl * this.aspectRatio);
        if (round > 0) {
            long IntSize = IntSizeKt.IntSize(round, m6219getMinHeightimpl);
            if (!z || ConstraintsKt.m6236isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m6440getZeroYbymL2g();
    }
}
