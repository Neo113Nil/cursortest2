package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AspectRatio.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ#\u0010\u0012\u001a\u00020\u0004*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ)\u0010\u001a\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J#\u0010#\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010 J#\u0010$\u001a\u00020\u001d*\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001dH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00067"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/IntSize;", "findSize-ToXhtMw", "(J)J", "findSize", "", "enforceConstraints", "tryMaxWidth-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxHeight-JN-0ABg", "tryMaxHeight", "tryMinWidth-JN-0ABg", "tryMinWidth", "tryMinHeight-JN-0ABg", "tryMinHeight", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "aspectRatio", "F", "getAspectRatio", "()F", "matchHeightConstraintsFirst", "Z", "getMatchHeightConstraintsFirst", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo46measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m308findSizeToXhtMw = m308findSizeToXhtMw(j);
        if (!IntSize.m2565equalsimpl0(m308findSizeToXhtMw, IntSize.INSTANCE.m2571getZeroYbymL2g())) {
            j = Constraints.INSTANCE.m2495fixedJhjzzOo(IntSize.m2567getWidthimpl(m308findSizeToXhtMw), IntSize.m2566getHeightimpl(m308findSizeToXhtMw));
        }
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(j);
        return MeasureScope.layout$default(measure, mo1944measureBRTryo0.getWidth(), mo1944measureBRTryo0.getHeight(), null, new Function1() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i * this.aspectRatio);
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return MathKt.roundToInt(i / this.aspectRatio);
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m308findSizeToXhtMw(long j) {
        if (!this.matchHeightConstraintsFirst) {
            long m312tryMaxWidthJN0ABg$default = m312tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m2565equalsimpl0(m312tryMaxWidthJN0ABg$default, companion.m2571getZeroYbymL2g())) {
                return m312tryMaxWidthJN0ABg$default;
            }
            long m310tryMaxHeightJN0ABg$default = m310tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m310tryMaxHeightJN0ABg$default, companion.m2571getZeroYbymL2g())) {
                return m310tryMaxHeightJN0ABg$default;
            }
            long m316tryMinWidthJN0ABg$default = m316tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m316tryMinWidthJN0ABg$default, companion.m2571getZeroYbymL2g())) {
                return m316tryMinWidthJN0ABg$default;
            }
            long m314tryMinHeightJN0ABg$default = m314tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m314tryMinHeightJN0ABg$default, companion.m2571getZeroYbymL2g())) {
                return m314tryMinHeightJN0ABg$default;
            }
            long m311tryMaxWidthJN0ABg = m311tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m311tryMaxWidthJN0ABg, companion.m2571getZeroYbymL2g())) {
                return m311tryMaxWidthJN0ABg;
            }
            long m309tryMaxHeightJN0ABg = m309tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m309tryMaxHeightJN0ABg, companion.m2571getZeroYbymL2g())) {
                return m309tryMaxHeightJN0ABg;
            }
            long m315tryMinWidthJN0ABg = m315tryMinWidthJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m315tryMinWidthJN0ABg, companion.m2571getZeroYbymL2g())) {
                return m315tryMinWidthJN0ABg;
            }
            long m313tryMinHeightJN0ABg = m313tryMinHeightJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m313tryMinHeightJN0ABg, companion.m2571getZeroYbymL2g())) {
                return m313tryMinHeightJN0ABg;
            }
        } else {
            long m310tryMaxHeightJN0ABg$default2 = m310tryMaxHeightJN0ABg$default(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m2565equalsimpl0(m310tryMaxHeightJN0ABg$default2, companion2.m2571getZeroYbymL2g())) {
                return m310tryMaxHeightJN0ABg$default2;
            }
            long m312tryMaxWidthJN0ABg$default2 = m312tryMaxWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m312tryMaxWidthJN0ABg$default2, companion2.m2571getZeroYbymL2g())) {
                return m312tryMaxWidthJN0ABg$default2;
            }
            long m314tryMinHeightJN0ABg$default2 = m314tryMinHeightJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m314tryMinHeightJN0ABg$default2, companion2.m2571getZeroYbymL2g())) {
                return m314tryMinHeightJN0ABg$default2;
            }
            long m316tryMinWidthJN0ABg$default2 = m316tryMinWidthJN0ABg$default(this, j, false, 1, null);
            if (!IntSize.m2565equalsimpl0(m316tryMinWidthJN0ABg$default2, companion2.m2571getZeroYbymL2g())) {
                return m316tryMinWidthJN0ABg$default2;
            }
            long m309tryMaxHeightJN0ABg2 = m309tryMaxHeightJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m309tryMaxHeightJN0ABg2, companion2.m2571getZeroYbymL2g())) {
                return m309tryMaxHeightJN0ABg2;
            }
            long m311tryMaxWidthJN0ABg2 = m311tryMaxWidthJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m311tryMaxWidthJN0ABg2, companion2.m2571getZeroYbymL2g())) {
                return m311tryMaxWidthJN0ABg2;
            }
            long m313tryMinHeightJN0ABg2 = m313tryMinHeightJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m313tryMinHeightJN0ABg2, companion2.m2571getZeroYbymL2g())) {
                return m313tryMinHeightJN0ABg2;
            }
            long m315tryMinWidthJN0ABg2 = m315tryMinWidthJN0ABg(j, false);
            if (!IntSize.m2565equalsimpl0(m315tryMinWidthJN0ABg2, companion2.m2571getZeroYbymL2g())) {
                return m315tryMinWidthJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m312tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m311tryMaxWidthJN0ABg(j, z);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m311tryMaxWidthJN0ABg(long j, boolean z) {
        int roundToInt;
        int m2487getMaxWidthimpl = Constraints.m2487getMaxWidthimpl(j);
        if (m2487getMaxWidthimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m2487getMaxWidthimpl / this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(m2487getMaxWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m2502isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m310tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m309tryMaxHeightJN0ABg(j, z);
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m309tryMaxHeightJN0ABg(long j, boolean z) {
        int roundToInt;
        int m2486getMaxHeightimpl = Constraints.m2486getMaxHeightimpl(j);
        if (m2486getMaxHeightimpl != Integer.MAX_VALUE && (roundToInt = MathKt.roundToInt(m2486getMaxHeightimpl * this.aspectRatio)) > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m2486getMaxHeightimpl);
            if (!z || ConstraintsKt.m2502isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m316tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m315tryMinWidthJN0ABg(j, z);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m315tryMinWidthJN0ABg(long j, boolean z) {
        int m2489getMinWidthimpl = Constraints.m2489getMinWidthimpl(j);
        int roundToInt = MathKt.roundToInt(m2489getMinWidthimpl / this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m2489getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m2502isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    static /* synthetic */ long m314tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioModifier.m313tryMinHeightJN0ABg(j, z);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m313tryMinHeightJN0ABg(long j, boolean z) {
        int m2488getMinHeightimpl = Constraints.m2488getMinHeightimpl(j);
        int roundToInt = MathKt.roundToInt(m2488getMinHeightimpl * this.aspectRatio);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m2488getMinHeightimpl);
            if (!z || ConstraintsKt.m2502isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.INSTANCE.m2571getZeroYbymL2g();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return this.aspectRatio == aspectRatioModifier.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
