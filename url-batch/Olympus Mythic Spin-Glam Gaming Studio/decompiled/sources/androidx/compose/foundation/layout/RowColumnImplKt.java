package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aa\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002*\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0018\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001a5\u0010\u0019\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u0017\u001a5\u0010\u001a\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u0017\u001aq\u0010#\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0000H\u0002¢\u0006\u0004\b#\u0010$\u001aG\u0010&\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'\u001aa\u0010)\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010(\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010*\"\u001a\u0010.\u001a\u0004\u0018\u00010+*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u001a\u00102\u001a\u00020/*\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u001a\u00106\u001a\u000203*\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108\"\u001a\u00109\u001a\u000203*\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00105\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", X3.i.n, "Lkotlin/Function5;", "", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "", "arrangement", "Landroidx/compose/ui/unit/Dp;", "arrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy-TDGSqEk", "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/ui/layout/MeasurePolicy;", "rowColumnMeasurePolicy", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "MinIntrinsicWidthMeasureBlock", "(Landroidx/compose/foundation/layout/LayoutOrientation;)Lkotlin/jvm/functions/Function3;", "MinIntrinsicHeightMeasureBlock", "MaxIntrinsicWidthMeasureBlock", "MaxIntrinsicHeightMeasureBlock", "children", "Lkotlin/Function2;", "intrinsicMainSize", "intrinsicCrossSize", "crossAxisAvailable", "mainAxisSpacing", "layoutOrientation", "intrinsicOrientation", "intrinsicSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IILandroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/LayoutOrientation;)I", "mainAxisSize", "intrinsicMainAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;II)I", "mainAxisAvailable", "intrinsicCrossAxisSize", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)I", "Landroidx/compose/foundation/layout/RowColumnParentData;", "getData", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;", "data", "", "getWeight", "(Landroidx/compose/foundation/layout/RowColumnParentData;)F", "weight", "", "getFill", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Z", "fill", "getCrossAxisAlignment", "(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RowColumnImplKt {
    private static final int intrinsicMainAxisSize(List list, Function2 function2, int i, int i2) {
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i5);
            float weight = getWeight(getData(intrinsicMeasurable));
            int intValue = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
            if (weight == 0.0f) {
                i4 += intValue;
            } else if (weight > 0.0f) {
                f += weight;
                i3 = Math.max(i3, MathKt.roundToInt(intValue / weight));
            }
        }
        return MathKt.roundToInt(i3 * f) + i4 + ((list.size() - 1) * i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getWidth() : placeable.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(Placeable placeable, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: rowColumnMeasurePolicy-TDGSqEk, reason: not valid java name */
    public static final MeasurePolicy m341rowColumnMeasurePolicyTDGSqEk(final LayoutOrientation orientation, final Function5 arrangement, final float f, final SizeMode crossAxisSize, final CrossAxisAlignment crossAxisAlignment) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(arrangement, "arrangement");
        Intrinsics.checkNotNullParameter(crossAxisSize, "crossAxisSize");
        Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
        return new MeasurePolicy() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo37measure3p2s80s(final MeasureScope measure, final List list, long j) {
                int mainAxisMin;
                int i;
                int coerceAtMost;
                float f2;
                int i2;
                float weight;
                boolean fill;
                int i3;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize;
                boolean z;
                boolean isRelative;
                float weight2;
                int i4;
                int max;
                CrossAxisAlignment crossAxisAlignment2;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2;
                float weight3;
                int i5;
                int i6;
                RowColumnParentData[] rowColumnParentDataArr;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2;
                int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3;
                int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3;
                boolean z2;
                boolean isRelative2;
                RowColumnParentData data;
                List measurables = list;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j, LayoutOrientation.this, null);
                int mo265roundToPx0680j_4 = measure.mo265roundToPx0680j_4(f);
                int size = list.size();
                final Placeable[] placeableArr = new Placeable[size];
                int size2 = list.size();
                RowColumnParentData[] rowColumnParentDataArr2 = new RowColumnParentData[size2];
                for (int i7 = 0; i7 < size2; i7++) {
                    data = RowColumnImplKt.getData((IntrinsicMeasurable) measurables.get(i7));
                    rowColumnParentDataArr2[i7] = data;
                }
                int size3 = list.size();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                boolean z3 = false;
                float f3 = 0.0f;
                while (true) {
                    if (i10 >= size3) {
                        break;
                    }
                    Measurable measurable = (Measurable) measurables.get(i10);
                    RowColumnParentData rowColumnParentData = rowColumnParentDataArr2[i10];
                    weight3 = RowColumnImplKt.getWeight(rowColumnParentData);
                    if (weight3 > 0.0f) {
                        f3 += weight3;
                        i11++;
                        i5 = i10;
                        i6 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                    } else {
                        int mainAxisMax = orientationIndependentConstraints.getMainAxisMax();
                        int i13 = i9;
                        i5 = i10;
                        i6 = size3;
                        rowColumnParentDataArr = rowColumnParentDataArr2;
                        Placeable mo1944measureBRTryo0 = measurable.mo1944measureBRTryo0(OrientationIndependentConstraints.copy$default(orientationIndependentConstraints, 0, mainAxisMax != Integer.MAX_VALUE ? mainAxisMax - i12 : Integer.MAX_VALUE, 0, 0, 8, null).m328toBoxConstraintsOenEA2s(LayoutOrientation.this));
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo1944measureBRTryo0, LayoutOrientation.this);
                        int min = Math.min(mo265roundToPx0680j_4, (mainAxisMax - i12) - rowColumnMeasurePolicy_TDGSqEk$mainAxisSize2);
                        rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo1944measureBRTryo0, LayoutOrientation.this);
                        i12 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize3 + min;
                        rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo1944measureBRTryo0, LayoutOrientation.this);
                        i9 = Math.max(i13, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize3);
                        if (!z3) {
                            isRelative2 = RowColumnImplKt.isRelative(rowColumnParentData);
                            if (!isRelative2) {
                                z2 = false;
                                placeableArr[i5] = mo1944measureBRTryo0;
                                i8 = min;
                                z3 = z2;
                            }
                        }
                        z2 = true;
                        placeableArr[i5] = mo1944measureBRTryo0;
                        i8 = min;
                        z3 = z2;
                    }
                    i10 = i5 + 1;
                    rowColumnParentDataArr2 = rowColumnParentDataArr;
                    size3 = i6;
                }
                int i14 = i9;
                final RowColumnParentData[] rowColumnParentDataArr3 = rowColumnParentDataArr2;
                if (i11 == 0) {
                    i12 -= i8;
                    i = i14;
                    coerceAtMost = 0;
                } else {
                    if (f3 > 0.0f && orientationIndependentConstraints.getMainAxisMax() != Integer.MAX_VALUE) {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMax();
                    } else {
                        mainAxisMin = orientationIndependentConstraints.getMainAxisMin();
                    }
                    int i15 = mo265roundToPx0680j_4 * (i11 - 1);
                    int i16 = (mainAxisMin - i12) - i15;
                    float f4 = f3 > 0.0f ? i16 / f3 : 0.0f;
                    int i17 = 0;
                    for (int i18 = 0; i18 < size2; i18++) {
                        weight2 = RowColumnImplKt.getWeight(rowColumnParentDataArr3[i18]);
                        i17 += MathKt.roundToInt(weight2 * f4);
                    }
                    int size4 = list.size();
                    int i19 = i16 - i17;
                    i = i14;
                    int i20 = 0;
                    int i21 = 0;
                    while (i20 < size4) {
                        if (placeableArr[i20] == null) {
                            Measurable measurable2 = (Measurable) measurables.get(i20);
                            RowColumnParentData rowColumnParentData2 = rowColumnParentDataArr3[i20];
                            weight = RowColumnImplKt.getWeight(rowColumnParentData2);
                            if (weight <= 0.0f) {
                                throw new IllegalStateException("All weights <= 0 should have placeables");
                            }
                            int sign = MathKt.getSign(i19);
                            int i22 = i19 - sign;
                            int max2 = Math.max(0, MathKt.roundToInt(weight * f4) + sign);
                            fill = RowColumnImplKt.getFill(rowColumnParentData2);
                            f2 = f4;
                            if (!fill || max2 == Integer.MAX_VALUE) {
                                i2 = size4;
                                i3 = 0;
                            } else {
                                i3 = max2;
                                i2 = size4;
                            }
                            Placeable mo1944measureBRTryo02 = measurable2.mo1944measureBRTryo0(new OrientationIndependentConstraints(i3, max2, 0, orientationIndependentConstraints.getCrossAxisMax()).m328toBoxConstraintsOenEA2s(LayoutOrientation.this));
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(mo1944measureBRTryo02, LayoutOrientation.this);
                            i21 += rowColumnMeasurePolicy_TDGSqEk$mainAxisSize;
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(mo1944measureBRTryo02, LayoutOrientation.this);
                            int max3 = Math.max(i, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize);
                            if (!z3) {
                                isRelative = RowColumnImplKt.isRelative(rowColumnParentData2);
                                if (!isRelative) {
                                    z = false;
                                    placeableArr[i20] = mo1944measureBRTryo02;
                                    i = max3;
                                    z3 = z;
                                    i19 = i22;
                                }
                            }
                            z = true;
                            placeableArr[i20] = mo1944measureBRTryo02;
                            i = max3;
                            z3 = z;
                            i19 = i22;
                        } else {
                            f2 = f4;
                            i2 = size4;
                        }
                        i20++;
                        measurables = list;
                        f4 = f2;
                        size4 = i2;
                    }
                    coerceAtMost = RangesKt.coerceAtMost(i21 + i15, orientationIndependentConstraints.getMainAxisMax() - i12);
                }
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                if (z3) {
                    i4 = 0;
                    for (int i23 = 0; i23 < size; i23++) {
                        Placeable placeable = placeableArr[i23];
                        Intrinsics.checkNotNull(placeable);
                        crossAxisAlignment2 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr3[i23]);
                        Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment2 != null ? crossAxisAlignment2.calculateAlignmentLinePosition$foundation_layout_release(placeable) : null;
                        if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                            int i24 = ref$IntRef.element;
                            int intValue = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue == Integer.MIN_VALUE) {
                                intValue = 0;
                            }
                            ref$IntRef.element = Math.max(i24, intValue);
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, LayoutOrientation.this);
                            LayoutOrientation layoutOrientation = LayoutOrientation.this;
                            int intValue2 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                            if (intValue2 == Integer.MIN_VALUE) {
                                intValue2 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable, layoutOrientation);
                            }
                            i4 = Math.max(i4, rowColumnMeasurePolicy_TDGSqEk$crossAxisSize2 - intValue2);
                        }
                    }
                } else {
                    i4 = 0;
                }
                final int max4 = Math.max(i12 + coerceAtMost, orientationIndependentConstraints.getMainAxisMin());
                if (orientationIndependentConstraints.getCrossAxisMax() != Integer.MAX_VALUE && crossAxisSize == SizeMode.Expand) {
                    max = orientationIndependentConstraints.getCrossAxisMax();
                } else {
                    max = Math.max(i, Math.max(orientationIndependentConstraints.getCrossAxisMin(), ref$IntRef.element + i4));
                }
                final int i25 = max;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.this;
                LayoutOrientation layoutOrientation3 = LayoutOrientation.Horizontal;
                int i26 = layoutOrientation2 == layoutOrientation3 ? max4 : i25;
                int i27 = layoutOrientation2 == layoutOrientation3 ? i25 : max4;
                int size5 = list.size();
                final int[] iArr = new int[size5];
                for (int i28 = 0; i28 < size5; i28++) {
                    iArr[i28] = 0;
                }
                final Function5 function5 = arrangement;
                final LayoutOrientation layoutOrientation4 = LayoutOrientation.this;
                final CrossAxisAlignment crossAxisAlignment3 = crossAxisAlignment;
                return MeasureScope.layout$default(measure, i26, i27, null, new Function1() { // from class: androidx.compose.foundation.layout.RowColumnImplKt$rowColumnMeasurePolicy$1$measure$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Placeable.PlacementScope) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Placeable.PlacementScope layout) {
                        CrossAxisAlignment crossAxisAlignment4;
                        int rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4;
                        LayoutDirection layoutDirection;
                        int[] iArr2;
                        int i29;
                        int rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        int size6 = list.size();
                        int[] iArr3 = new int[size6];
                        int i30 = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            Placeable placeable2 = placeableArr[i31];
                            Intrinsics.checkNotNull(placeable2);
                            rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(placeable2, layoutOrientation4);
                            iArr3[i31] = rowColumnMeasurePolicy_TDGSqEk$mainAxisSize4;
                        }
                        function5.invoke(Integer.valueOf(max4), iArr3, measure.getLayoutDirection(), measure, iArr);
                        Placeable[] placeableArr2 = placeableArr;
                        RowColumnParentData[] rowColumnParentDataArr4 = rowColumnParentDataArr3;
                        CrossAxisAlignment crossAxisAlignment5 = crossAxisAlignment3;
                        int i32 = i25;
                        LayoutOrientation layoutOrientation5 = layoutOrientation4;
                        MeasureScope measureScope = measure;
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int[] iArr4 = iArr;
                        int length = placeableArr2.length;
                        int i33 = 0;
                        while (i30 < length) {
                            Placeable placeable3 = placeableArr2[i30];
                            int i34 = i33 + 1;
                            Intrinsics.checkNotNull(placeable3);
                            crossAxisAlignment4 = RowColumnImplKt.getCrossAxisAlignment(rowColumnParentDataArr4[i33]);
                            if (crossAxisAlignment4 == null) {
                                crossAxisAlignment4 = crossAxisAlignment5;
                            }
                            rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4 = RowColumnImplKt.rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(placeable3, layoutOrientation5);
                            int i35 = i32 - rowColumnMeasurePolicy_TDGSqEk$crossAxisSize4;
                            LayoutOrientation layoutOrientation6 = LayoutOrientation.Horizontal;
                            if (layoutOrientation5 == layoutOrientation6) {
                                layoutDirection = LayoutDirection.Ltr;
                            } else {
                                layoutDirection = measureScope.getLayoutDirection();
                            }
                            Placeable[] placeableArr3 = placeableArr2;
                            LayoutDirection layoutDirection2 = layoutDirection;
                            int i36 = length;
                            int align$foundation_layout_release = crossAxisAlignment4.align$foundation_layout_release(i35, layoutDirection2, placeable3, ref$IntRef2.element);
                            if (layoutOrientation5 == layoutOrientation6) {
                                iArr2 = iArr4;
                                i29 = i30;
                                Placeable.PlacementScope.place$default(layout, placeable3, iArr4[i33], align$foundation_layout_release, 0.0f, 4, null);
                            } else {
                                iArr2 = iArr4;
                                i29 = i30;
                                Placeable.PlacementScope.place$default(layout, placeable3, align$foundation_layout_release, iArr2[i33], 0.0f, 4, null);
                            }
                            i30 = i29 + 1;
                            i33 = i34;
                            length = i36;
                            placeableArr2 = placeableArr3;
                            iArr4 = iArr2;
                        }
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Function3 MinIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo265roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Function3 MinIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MinIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo265roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Function3 MaxIntrinsicWidthMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo265roundToPx0680j_4(f)))).intValue();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
                Function3 MaxIntrinsicHeightMeasureBlock;
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(LayoutOrientation.this);
                return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(measurables, Integer.valueOf(i), Integer.valueOf(intrinsicMeasureScope.mo265roundToPx0680j_4(f)))).intValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowColumnParentData getData(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        if (parentData instanceof RowColumnParentData) {
            return (RowColumnParentData) parentData;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getWeight(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFill(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrossAxisAlignment getCrossAxisAlignment(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelative(RowColumnParentData rowColumnParentData) {
        CrossAxisAlignment crossAxisAlignment = getCrossAxisAlignment(rowColumnParentData);
        if (crossAxisAlignment != null) {
            return crossAxisAlignment.isRelative$foundation_layout_release();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 MinIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 MinIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMinHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMinHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 MaxIntrinsicWidthMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxWidth();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 MaxIntrinsicHeightMeasureBlock(LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return IntrinsicMeasureBlocks.INSTANCE.getHorizontalMaxHeight();
        }
        return IntrinsicMeasureBlocks.INSTANCE.getVerticalMaxHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int intrinsicSize(List list, Function2 function2, Function2 function22, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        if (layoutOrientation == layoutOrientation2) {
            return intrinsicMainAxisSize(list, function2, i, i2);
        }
        return intrinsicCrossAxisSize(list, function22, function2, i, i2);
    }

    private static final int intrinsicCrossAxisSize(List list, Function2 function2, Function2 function22, int i, int i2) {
        int roundToInt;
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i4);
            float weight = getWeight(getData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int min2 = Math.min(((Number) function2.invoke(intrinsicMeasurable, Integer.MAX_VALUE)).intValue(), i - min);
                min += min2;
                i3 = Math.max(i3, ((Number) function22.invoke(intrinsicMeasurable, Integer.valueOf(min2))).intValue());
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            roundToInt = 0;
        } else {
            roundToInt = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : MathKt.roundToInt(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i5);
            float weight2 = getWeight(getData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                i3 = Math.max(i3, ((Number) function22.invoke(intrinsicMeasurable2, Integer.valueOf(roundToInt != Integer.MAX_VALUE ? MathKt.roundToInt(roundToInt * weight2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i3;
    }
}
