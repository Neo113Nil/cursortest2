package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BU\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0019\u0010!\u001a\u00020\u0006*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u0006*\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J)\u0010*\u001a\u00020'*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)J#\u0010/\u001a\u00020-*\u00020+2\u0006\u0010&\u001a\u00020,2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020-*\u00020+2\u0006\u0010&\u001a\u00020,2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J#\u00103\u001a\u00020-*\u00020+2\u0006\u0010&\u001a\u00020,2\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b3\u00100J#\u00104\u001a\u00020-*\u00020+2\u0006\u0010&\u001a\u00020,2\u0006\u00102\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00100J\u0013\u00106\u001a\u00020\u0012*\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020-H\u0016¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010F\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "", "sizeToIntrinsics", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "inspectorInfo", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "calculateScaledSize", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "modifyConstraints", "hasSpecifiedAndFiniteWidth-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteHeight-uvyYCjk", "hasSpecifiedAndFiniteHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "Z", "getSizeToIntrinsics", "()Z", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getUseIntrinsicSize", "useIntrinsicSize", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
final class PainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PainterModifier(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Function1 inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != Size.INSTANCE.m1340getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(m1240modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.ui.draw.PainterModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1240modifyConstraintsZezNO4M = m1240modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m2489getMinWidthimpl(m1240modifyConstraintsZezNO4M), measurable.minIntrinsicWidth(i));
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1240modifyConstraintsZezNO4M = m1240modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m2489getMinWidthimpl(m1240modifyConstraintsZezNO4M), measurable.maxIntrinsicWidth(i));
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1240modifyConstraintsZezNO4M = m1240modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m2488getMinHeightimpl(m1240modifyConstraintsZezNO4M), measurable.minIntrinsicHeight(i));
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m1240modifyConstraintsZezNO4M = m1240modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m2488getMinHeightimpl(m1240modifyConstraintsZezNO4M), measurable.maxIntrinsicHeight(i));
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m1237calculateScaledSizeE7KxVPU(long dstSize) {
        float m1335getWidthimpl;
        float m1333getHeightimpl;
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        if (!m1239hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize())) {
            m1335getWidthimpl = Size.m1335getWidthimpl(dstSize);
        } else {
            m1335getWidthimpl = Size.m1335getWidthimpl(this.painter.getIntrinsicSize());
        }
        if (!m1238hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize())) {
            m1333getHeightimpl = Size.m1333getHeightimpl(dstSize);
        } else {
            m1333getHeightimpl = Size.m1333getHeightimpl(this.painter.getIntrinsicSize());
        }
        long Size = SizeKt.Size(m1335getWidthimpl, m1333getHeightimpl);
        if (Size.m1335getWidthimpl(dstSize) != 0.0f && Size.m1333getHeightimpl(dstSize) != 0.0f) {
            return ScaleFactorKt.m1976timesUQTWf7w(Size, this.contentScale.mo1935computeScaleFactorH7hwNQA(Size, dstSize));
        }
        return Size.INSTANCE.m1341getZeroNHjbRc();
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m1240modifyConstraintsZezNO4M(long constraints) {
        int m2489getMinWidthimpl;
        int m2488getMinHeightimpl;
        boolean z = false;
        boolean z2 = Constraints.m2483getHasBoundedWidthimpl(constraints) && Constraints.m2482getHasBoundedHeightimpl(constraints);
        if (Constraints.m2485getHasFixedWidthimpl(constraints) && Constraints.m2484getHasFixedHeightimpl(constraints)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m2478copyZbe2FdA$default(constraints, Constraints.m2487getMaxWidthimpl(constraints), 0, Constraints.m2486getMaxHeightimpl(constraints), 0, 10, null);
        }
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1239hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m2489getMinWidthimpl = MathKt.roundToInt(Size.m1335getWidthimpl(intrinsicSize));
        } else {
            m2489getMinWidthimpl = Constraints.m2489getMinWidthimpl(constraints);
        }
        if (m1238hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m2488getMinHeightimpl = MathKt.roundToInt(Size.m1333getHeightimpl(intrinsicSize));
        } else {
            m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(constraints);
        }
        long m1237calculateScaledSizeE7KxVPU = m1237calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m2501constrainWidthK40F9xA(constraints, m2489getMinWidthimpl), ConstraintsKt.m2500constrainHeightK40F9xA(constraints, m2488getMinHeightimpl)));
        return Constraints.m2478copyZbe2FdA$default(constraints, ConstraintsKt.m2501constrainWidthK40F9xA(constraints, MathKt.roundToInt(Size.m1335getWidthimpl(m1237calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m2500constrainHeightK40F9xA(constraints, MathKt.roundToInt(Size.m1333getHeightimpl(m1237calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        float m1335getWidthimpl;
        float m1333getHeightimpl;
        long m1341getZeroNHjbRc;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long intrinsicSize = this.painter.getIntrinsicSize();
        if (m1239hasSpecifiedAndFiniteWidthuvyYCjk(intrinsicSize)) {
            m1335getWidthimpl = Size.m1335getWidthimpl(intrinsicSize);
        } else {
            m1335getWidthimpl = Size.m1335getWidthimpl(contentDrawScope.mo1708getSizeNHjbRc());
        }
        if (m1238hasSpecifiedAndFiniteHeightuvyYCjk(intrinsicSize)) {
            m1333getHeightimpl = Size.m1333getHeightimpl(intrinsicSize);
        } else {
            m1333getHeightimpl = Size.m1333getHeightimpl(contentDrawScope.mo1708getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m1335getWidthimpl, m1333getHeightimpl);
        if (Size.m1335getWidthimpl(contentDrawScope.mo1708getSizeNHjbRc()) != 0.0f && Size.m1333getHeightimpl(contentDrawScope.mo1708getSizeNHjbRc()) != 0.0f) {
            m1341getZeroNHjbRc = ScaleFactorKt.m1976timesUQTWf7w(Size, this.contentScale.mo1935computeScaleFactorH7hwNQA(Size, contentDrawScope.mo1708getSizeNHjbRc()));
        } else {
            m1341getZeroNHjbRc = Size.INSTANCE.m1341getZeroNHjbRc();
        }
        long j = m1341getZeroNHjbRc;
        long mo1228alignKFBX0sM = this.alignment.mo1228alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m1335getWidthimpl(j)), MathKt.roundToInt(Size.m1333getHeightimpl(j))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m1335getWidthimpl(contentDrawScope.mo1708getSizeNHjbRc())), MathKt.roundToInt(Size.m1333getHeightimpl(contentDrawScope.mo1708getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m2553getXimpl = IntOffset.m2553getXimpl(mo1228alignKFBX0sM);
        float m2554getYimpl = IntOffset.m2554getYimpl(mo1228alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m2553getXimpl, m2554getYimpl);
        this.painter.m1721drawx_KDEd0(contentDrawScope, j, this.alpha, this.colorFilter);
        contentDrawScope.getDrawContext().getTransform().translate(-m2553getXimpl, -m2554getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m1239hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!Size.m1332equalsimpl0(j, Size.INSTANCE.m1340getUnspecifiedNHjbRc())) {
            float m1335getWidthimpl = Size.m1335getWidthimpl(j);
            if (!Float.isInfinite(m1335getWidthimpl) && !Float.isNaN(m1335getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m1238hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!Size.m1332equalsimpl0(j, Size.INSTANCE.m1340getUnspecifiedNHjbRc())) {
            float m1333getHeightimpl = Size.m1333getHeightimpl(j);
            if (!Float.isInfinite(m1333getHeightimpl) && !Float.isNaN(m1333getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    public boolean equals(Object other) {
        PainterModifier painterModifier = other instanceof PainterModifier ? (PainterModifier) other : null;
        return painterModifier != null && Intrinsics.areEqual(this.painter, painterModifier.painter) && this.sizeToIntrinsics == painterModifier.sizeToIntrinsics && Intrinsics.areEqual(this.alignment, painterModifier.alignment) && Intrinsics.areEqual(this.contentScale, painterModifier.contentScale) && this.alpha == painterModifier.alpha && Intrinsics.areEqual(this.colorFilter, painterModifier.colorFilter);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
