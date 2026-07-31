package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContentPainterModifier.kt */
/* loaded from: classes15.dex */
public final class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterModifier)) {
            return false;
        }
        ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
        return Intrinsics.areEqual(this.painter, contentPainterModifier.painter) && Intrinsics.areEqual(this.alignment, contentPainterModifier.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterModifier.contentScale) && Intrinsics.areEqual((Object) Float.valueOf(this.alpha), (Object) Float.valueOf(contentPainterModifier.alpha)) && Intrinsics.areEqual(this.colorFilter, contentPainterModifier.colorFilter);
    }

    public int hashCode() {
        int hashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(m2909modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: coil.compose.ContentPainterModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m2486getMaxHeightimpl(m2909modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m1335getWidthimpl(m2908calculateScaledSizeE7KxVPU(SizeKt.Size(minIntrinsicWidth, i)))), minIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m2486getMaxHeightimpl(m2909modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m1335getWidthimpl(m2908calculateScaledSizeE7KxVPU(SizeKt.Size(maxIntrinsicWidth, i)))), maxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m2487getMaxWidthimpl(m2909modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m1333getHeightimpl(m2908calculateScaledSizeE7KxVPU(SizeKt.Size(i, minIntrinsicHeight)))), minIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.getIntrinsicSize() != Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m2487getMaxWidthimpl(m2909modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m1333getHeightimpl(m2908calculateScaledSizeE7KxVPU(SizeKt.Size(i, maxIntrinsicHeight)))), maxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m2908calculateScaledSizeE7KxVPU(long j) {
        if (Size.m1337isEmptyimpl(j)) {
            return Size.INSTANCE.m1341getZeroNHjbRc();
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            return j;
        }
        float m1335getWidthimpl = Size.m1335getWidthimpl(intrinsicSize);
        if (Float.isInfinite(m1335getWidthimpl) || Float.isNaN(m1335getWidthimpl)) {
            m1335getWidthimpl = Size.m1335getWidthimpl(j);
        }
        float m1333getHeightimpl = Size.m1333getHeightimpl(intrinsicSize);
        if (Float.isInfinite(m1333getHeightimpl) || Float.isNaN(m1333getHeightimpl)) {
            m1333getHeightimpl = Size.m1333getHeightimpl(j);
        }
        long Size = SizeKt.Size(m1335getWidthimpl, m1333getHeightimpl);
        return ScaleFactorKt.m1976timesUQTWf7w(Size, this.contentScale.mo1935computeScaleFactorH7hwNQA(Size, j));
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m2909modifyConstraintsZezNO4M(long j) {
        float m2489getMinWidthimpl;
        int m2488getMinHeightimpl;
        float m2913constrainHeightK40F9xA;
        boolean m2485getHasFixedWidthimpl = Constraints.m2485getHasFixedWidthimpl(j);
        boolean m2484getHasFixedHeightimpl = Constraints.m2484getHasFixedHeightimpl(j);
        if (m2485getHasFixedWidthimpl && m2484getHasFixedHeightimpl) {
            return j;
        }
        boolean z = Constraints.m2483getHasBoundedWidthimpl(j) && Constraints.m2482getHasBoundedHeightimpl(j);
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (intrinsicSize == Size.INSTANCE.m1340getUnspecifiedNHjbRc()) {
            return z ? Constraints.m2478copyZbe2FdA$default(j, Constraints.m2487getMaxWidthimpl(j), 0, Constraints.m2486getMaxHeightimpl(j), 0, 10, null) : j;
        }
        if (!z || (!m2485getHasFixedWidthimpl && !m2484getHasFixedHeightimpl)) {
            float m1335getWidthimpl = Size.m1335getWidthimpl(intrinsicSize);
            float m1333getHeightimpl = Size.m1333getHeightimpl(intrinsicSize);
            m2489getMinWidthimpl = (Float.isInfinite(m1335getWidthimpl) || Float.isNaN(m1335getWidthimpl)) ? Constraints.m2489getMinWidthimpl(j) : UtilsKt.m2914constrainWidthK40F9xA(j, m1335getWidthimpl);
            if (Float.isInfinite(m1333getHeightimpl) || Float.isNaN(m1333getHeightimpl)) {
                m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(j);
            } else {
                m2913constrainHeightK40F9xA = UtilsKt.m2913constrainHeightK40F9xA(j, m1333getHeightimpl);
                long m2908calculateScaledSizeE7KxVPU = m2908calculateScaledSizeE7KxVPU(SizeKt.Size(m2489getMinWidthimpl, m2913constrainHeightK40F9xA));
                return Constraints.m2478copyZbe2FdA$default(j, ConstraintsKt.m2501constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1335getWidthimpl(m2908calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m2500constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1333getHeightimpl(m2908calculateScaledSizeE7KxVPU))), 0, 10, null);
            }
        } else {
            m2489getMinWidthimpl = Constraints.m2487getMaxWidthimpl(j);
            m2488getMinHeightimpl = Constraints.m2486getMaxHeightimpl(j);
        }
        m2913constrainHeightK40F9xA = m2488getMinHeightimpl;
        long m2908calculateScaledSizeE7KxVPU2 = m2908calculateScaledSizeE7KxVPU(SizeKt.Size(m2489getMinWidthimpl, m2913constrainHeightK40F9xA));
        return Constraints.m2478copyZbe2FdA$default(j, ConstraintsKt.m2501constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m1335getWidthimpl(m2908calculateScaledSizeE7KxVPU2))), 0, ConstraintsKt.m2500constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m1333getHeightimpl(m2908calculateScaledSizeE7KxVPU2))), 0, 10, null);
    }

    public ContentPainterModifier(final Painter painter, final Alignment alignment, final ContentScale contentScale, final float f, final ColorFilter colorFilter) {
        super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: coil.compose.ContentPainterModifier$special$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("content");
                inspectorInfo.getProperties().set("painter", Painter.this);
                inspectorInfo.getProperties().set("alignment", alignment);
                inspectorInfo.getProperties().set("contentScale", contentScale);
                inspectorInfo.getProperties().set("alpha", Float.valueOf(f));
                inspectorInfo.getProperties().set("colorFilter", colorFilter);
            }
        } : InspectableValueKt.getNoInspectorInfo());
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        long m2908calculateScaledSizeE7KxVPU = m2908calculateScaledSizeE7KxVPU(contentDrawScope.mo1708getSizeNHjbRc());
        long mo1228alignKFBX0sM = this.alignment.mo1228alignKFBX0sM(UtilsKt.m2915toIntSizeuvyYCjk(m2908calculateScaledSizeE7KxVPU), UtilsKt.m2915toIntSizeuvyYCjk(contentDrawScope.mo1708getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        float m2546component1impl = IntOffset.m2546component1impl(mo1228alignKFBX0sM);
        float m2547component2impl = IntOffset.m2547component2impl(mo1228alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m2546component1impl, m2547component2impl);
        this.painter.m1721drawx_KDEd0(contentDrawScope, m2908calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m2546component1impl, -m2547component2impl);
        contentDrawScope.drawContent();
    }
}
