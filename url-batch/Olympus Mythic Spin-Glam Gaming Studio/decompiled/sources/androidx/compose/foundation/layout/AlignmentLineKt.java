package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0016\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", ViewHierarchyConstants.DIMENSION_TOP_KEY, "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "alignmentLineOffsetMeasure", "", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AlignmentLineKt {
    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m296paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM();
        }
        return m295paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m295paddingFrom4j6BHR0(Modifier paddingFrom, final AlignmentLine alignmentLine, final float f, final float f2) {
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return paddingFrom.then(new AlignmentLineOffset(alignmentLine, f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("paddingFrom");
                inspectorInfo.getProperties().set("alignmentLine", AlignmentLine.this);
                inspectorInfo.getProperties().set("before", Dp.m2505boximpl(f));
                inspectorInfo.getProperties().set("after", Dp.m2505boximpl(f2));
            }
        } : InspectableValueKt.getNoInspectorInfo(), null));
    }

    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m297paddingFromBaselineVpY3zN4(Modifier paddingFromBaseline, float f, float f2) {
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        Dp.Companion companion = Dp.INSTANCE;
        return paddingFromBaseline.then(!Dp.m2509equalsimpl0(f2, companion.m2515getUnspecifiedD9Ej5fM()) ? m296paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null) : Modifier.INSTANCE).then(!Dp.m2509equalsimpl0(f, companion.m2515getUnspecifiedD9Ej5fM()) ? m296paddingFrom4j6BHR0$default(paddingFromBaseline, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null) : Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m294alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, final AlignmentLine alignmentLine, final float f, float f2, Measurable measurable, long j) {
        int max;
        int height;
        final Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(getHorizontal(alignmentLine) ? Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null) : Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null));
        int i = mo1944measureBRTryo0.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int height2 = getHorizontal(alignmentLine) ? mo1944measureBRTryo0.getHeight() : mo1944measureBRTryo0.getWidth();
        int m2486getMaxHeightimpl = getHorizontal(alignmentLine) ? Constraints.m2486getMaxHeightimpl(j) : Constraints.m2487getMaxWidthimpl(j);
        Dp.Companion companion = Dp.INSTANCE;
        int i2 = m2486getMaxHeightimpl - height2;
        final int coerceIn = RangesKt.coerceIn((!Dp.m2509equalsimpl0(f, companion.m2515getUnspecifiedD9Ej5fM()) ? measureScope.mo265roundToPx0680j_4(f) : 0) - i, 0, i2);
        final int coerceIn2 = RangesKt.coerceIn(((!Dp.m2509equalsimpl0(f2, companion.m2515getUnspecifiedD9Ej5fM()) ? measureScope.mo265roundToPx0680j_4(f2) : 0) - height2) + i, 0, i2 - coerceIn);
        if (getHorizontal(alignmentLine)) {
            max = mo1944measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo1944measureBRTryo0.getWidth() + coerceIn + coerceIn2, Constraints.m2489getMinWidthimpl(j));
        }
        final int i3 = max;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(mo1944measureBRTryo0.getHeight() + coerceIn + coerceIn2, Constraints.m2488getMinHeightimpl(j));
        } else {
            height = mo1944measureBRTryo0.getHeight();
        }
        final int i4 = height;
        return MeasureScope.layout$default(measureScope, i3, i4, null, new Function1() { // from class: androidx.compose.foundation.layout.AlignmentLineKt$alignmentLineOffsetMeasure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                boolean horizontal;
                int width;
                boolean horizontal2;
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                horizontal = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                int i5 = 0;
                if (horizontal) {
                    width = 0;
                } else {
                    width = !Dp.m2509equalsimpl0(f, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? coerceIn : (i3 - coerceIn2) - mo1944measureBRTryo0.getWidth();
                }
                horizontal2 = AlignmentLineKt.getHorizontal(AlignmentLine.this);
                if (horizontal2) {
                    i5 = !Dp.m2509equalsimpl0(f, Dp.INSTANCE.m2515getUnspecifiedD9Ej5fM()) ? coerceIn : (i4 - coerceIn2) - mo1944measureBRTryo0.getHeight();
                }
                Placeable.PlacementScope.placeRelative$default(layout, mo1944measureBRTryo0, width, i5, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }
}
