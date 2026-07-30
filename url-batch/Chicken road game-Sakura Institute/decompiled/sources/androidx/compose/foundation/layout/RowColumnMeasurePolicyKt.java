package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RowColumnMeasurePolicy.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "arrangementSpacingInt", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "startIndex", "endIndex", "crossAxisOffset", "", "currentLineIndex", "(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RowColumnMeasurePolicyKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02dc A[Catch: IllegalArgumentException -> 0x0352, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0352, blocks: (B:93:0x02be, B:99:0x02d3, B:101:0x02dc), top: B:92:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d3 A[Catch: IllegalArgumentException -> 0x0352, TryCatch #0 {IllegalArgumentException -> 0x0352, blocks: (B:93:0x02be, B:99:0x02d3, B:101:0x02dc), top: B:92:0x02be }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int[] iArr2;
        int[] iArr3;
        float f;
        String str;
        long j;
        String str2;
        String str3;
        long j2;
        String str4;
        String str5;
        int i9;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i10;
        int coerceIn;
        int i11;
        float f2;
        String str6;
        String str7;
        long j3;
        long j4;
        float f3;
        String str8;
        String str9;
        String str10;
        int i12;
        String str11;
        String str12;
        int i13;
        String str13;
        String str14;
        long j5;
        FlowLayoutData flowLayoutData;
        String str15;
        Integer valueOf;
        int i14;
        Integer num;
        int i15;
        float f4;
        float f5;
        String str16;
        String str17;
        String str18;
        long j6;
        String str19;
        int i16;
        float f6;
        String str20;
        char c;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        long j7;
        int[] iArr4;
        int i24;
        int i25;
        float f7;
        int[] iArr5;
        FlowLayoutData flowLayoutData2;
        List<? extends Measurable> list2 = list;
        int i26 = i7;
        int i27 = i26 - i6;
        int[] iArr6 = new int[i27];
        int i28 = i6;
        long j8 = i5;
        float f8 = 0.0f;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        boolean z = false;
        while (true) {
            Integer num2 = null;
            iArr2 = iArr6;
            if (i28 >= i26) {
                break;
            }
            int i33 = i32;
            Measurable measurable = list2.get(i28);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            z = z || RowColumnImplKt.isRelative(rowColumnParentData);
            if (weight > 0.0f) {
                float f9 = f8 + weight;
                i31++;
                i22 = i28;
                j7 = j8;
                iArr5 = iArr2;
                i25 = i27;
                f7 = f9;
            } else {
                if (i4 != Integer.MAX_VALUE && rowColumnParentData != null && (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) != null) {
                    num2 = Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i4));
                }
                int i34 = i3 - i30;
                Placeable placeable = placeableArr[i28];
                if (placeable == null) {
                    i20 = i30;
                    i21 = i31;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    i22 = i28;
                    i23 = i34;
                    iArr4 = iArr2;
                    j7 = j8;
                    i24 = i33;
                    i25 = i27;
                    f7 = f8;
                    placeable = measurable.mo5175measureBRTryo0(RowColumnMeasurePolicy.m706createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy, 0, intValue, i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : RangesKt.coerceAtLeast(i34, 0), num2 != null ? num2.intValue() : i4, false, 16, null));
                } else {
                    i20 = i30;
                    i21 = i31;
                    i22 = i28;
                    i23 = i34;
                    j7 = j8;
                    iArr4 = iArr2;
                    i24 = i33;
                    i25 = i27;
                    f7 = f8;
                }
                int mainAxisSize = rowColumnMeasurePolicy.mainAxisSize(placeable);
                int crossAxisSize = rowColumnMeasurePolicy.crossAxisSize(placeable);
                iArr5 = iArr4;
                iArr5[i22 - i6] = mainAxisSize;
                int min = Math.min(i5, RangesKt.coerceAtLeast(i23 - mainAxisSize, 0));
                i30 = mainAxisSize + min + i20;
                int max = Math.max(i24, crossAxisSize);
                placeableArr[i22] = placeable;
                i33 = max;
                i29 = min;
                i31 = i21;
            }
            i28 = i22 + 1;
            iArr6 = iArr5;
            f8 = f7;
            i27 = i25;
            i32 = i33;
            j8 = j7;
        }
        int i35 = i30;
        int i36 = i31;
        int i37 = i32;
        long j9 = j8;
        int i38 = i27;
        float f10 = f8;
        if (i36 == 0) {
            i10 = i35 - i29;
            iArr3 = iArr2;
            coerceIn = 0;
            i9 = i;
            i11 = i37;
            rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
        } else {
            int i39 = i3 != Integer.MAX_VALUE ? i3 : i;
            iArr3 = iArr2;
            long j10 = j9 * (i36 - 1);
            long coerceAtLeast = RangesKt.coerceAtLeast((i39 - i35) - j10, 0L);
            float f11 = coerceAtLeast / f10;
            int i40 = i6;
            long j11 = coerceAtLeast;
            while (true) {
                f = f10;
                str = "arrangementSpacingTotal ";
                j = coerceAtLeast;
                str2 = "fixedSpace ";
                str3 = "weightChildrenCount ";
                j2 = j10;
                str4 = "targetSpace ";
                str5 = "mainAxisMin ";
                if (i40 >= i26) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list2.get(i40)));
                float f12 = f11 * weight2;
                try {
                    j11 -= Math.round(f12);
                    i40++;
                    list2 = list;
                    i26 = i7;
                    f10 = f;
                    coerceAtLeast = j;
                    j10 = j2;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i3).append("mainAxisMin ").append(i).append("targetSpace ").append(i39).append("arrangementSpacingPx ").append(j9).append("weightChildrenCount ").append(i36).append("fixedSpace ").append(i35).append("arrangementSpacingTotal ").append(j2).append("remainingToTarget ").append(j).append("totalWeight ").append(f).append("weightUnitSpace ").append(f11).append("itemWeight ").append(weight2).append("weightedSize ");
                    sb.append(f12);
                    throw new IllegalArgumentException(sb.toString()).initCause(e);
                }
            }
            i9 = i;
            String str21 = "weightedSize ";
            String str22 = "weightUnitSpace ";
            float f13 = f;
            String str23 = "totalWeight ";
            long j12 = j;
            String str24 = "remainingToTarget ";
            long j13 = j2;
            long j14 = j9;
            int i41 = i37;
            int i42 = 0;
            int i43 = i6;
            int i44 = i7;
            while (i43 < i44) {
                if (placeableArr[i43] == null) {
                    Measurable measurable2 = list.get(i43);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    String str25 = str4;
                    String str26 = str21;
                    if (i4 == Integer.MAX_VALUE || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) {
                        str15 = str5;
                        valueOf = null;
                    } else {
                        str15 = str5;
                        valueOf = Integer.valueOf(Math.round(flowLayoutData.getFillCrossAxisFraction() * i4));
                    }
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    int sign = MathKt.getSign(j11);
                    int i45 = i36;
                    int i46 = i35;
                    j11 -= sign;
                    float f14 = f11 * weight3;
                    float f15 = f11;
                    int max2 = Math.max(0, Math.round(f14) + sign);
                    try {
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                        i14 = sign;
                        num = valueOf;
                        i15 = max2;
                        f4 = f14;
                        f5 = weight3;
                        str16 = str2;
                        str17 = str3;
                        str18 = str25;
                        j6 = j13;
                        str19 = str15;
                        i12 = i46;
                        i16 = i45;
                        f6 = f15;
                        j5 = j14;
                        str20 = str;
                    }
                    try {
                        if (RowColumnImplKt.getFill(rowColumnParentData2)) {
                            c = CharCompanionObject.MAX_VALUE;
                            if (max2 != Integer.MAX_VALUE) {
                                i17 = max2;
                                int intValue2 = valueOf == null ? valueOf.intValue() : 0;
                                int intValue3 = valueOf == null ? valueOf.intValue() : i4;
                                f6 = f15;
                                i14 = sign;
                                str18 = str25;
                                j6 = j13;
                                int i47 = i17;
                                num = valueOf;
                                str19 = str15;
                                int i48 = intValue2;
                                i15 = max2;
                                i16 = i45;
                                f4 = f14;
                                i12 = i46;
                                f5 = weight3;
                                str16 = str2;
                                str20 = str;
                                str17 = str3;
                                j5 = j14;
                                Placeable mo5175measureBRTryo0 = measurable2.mo5175measureBRTryo0(rowColumnMeasurePolicy.mo596createConstraintsxF2OJ5Q(i47, i48, max2, intValue3, true));
                                int mainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(mo5175measureBRTryo0);
                                int crossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(mo5175measureBRTryo0);
                                iArr3[i43 - i6] = mainAxisSize2;
                                i42 += mainAxisSize2;
                                i41 = Math.max(i41, crossAxisSize2);
                                placeableArr[i43] = mo5175measureBRTryo0;
                                str6 = str17;
                                str13 = str16;
                                str14 = str20;
                                j4 = j12;
                                f3 = f13;
                                str8 = str22;
                                str9 = str23;
                                str10 = str24;
                                str7 = str26;
                                f2 = f6;
                                j3 = j6;
                                str11 = str18;
                                str12 = str19;
                                i13 = i16;
                            }
                        } else {
                            c = CharCompanionObject.MAX_VALUE;
                        }
                        Placeable mo5175measureBRTryo02 = measurable2.mo5175measureBRTryo0(rowColumnMeasurePolicy.mo596createConstraintsxF2OJ5Q(i47, i48, max2, intValue3, true));
                        int mainAxisSize22 = rowColumnMeasurePolicy.mainAxisSize(mo5175measureBRTryo02);
                        int crossAxisSize22 = rowColumnMeasurePolicy.crossAxisSize(mo5175measureBRTryo02);
                        iArr3[i43 - i6] = mainAxisSize22;
                        i42 += mainAxisSize22;
                        i41 = Math.max(i41, crossAxisSize22);
                        placeableArr[i43] = mo5175measureBRTryo02;
                        str6 = str17;
                        str13 = str16;
                        str14 = str20;
                        j4 = j12;
                        f3 = f13;
                        str8 = str22;
                        str9 = str23;
                        str10 = str24;
                        str7 = str26;
                        f2 = f6;
                        j3 = j6;
                        str11 = str18;
                        str12 = str19;
                        i13 = i16;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                        sb2.append(i3).append(str19).append(i9).append(str18).append(i39).append("arrangementSpacingPx ").append(j5).append(str17).append(i16).append(str16).append(i12).append(str20).append(j6).append(str24).append(j12).append(str23).append(f13).append(str22).append(f6).append("weight ").append(f5).append(str26);
                        sb2.append(f4).append("crossAxisDesiredSize ").append(num).append("remainderUnit ").append(i14).append("childMainAxisSize ").append(i15);
                        throw new IllegalArgumentException(sb2.toString()).initCause(e);
                    }
                    i17 = 0;
                    if (valueOf == null) {
                    }
                    if (valueOf == null) {
                    }
                    f6 = f15;
                    i14 = sign;
                    str18 = str25;
                    j6 = j13;
                    int i472 = i17;
                    num = valueOf;
                    str19 = str15;
                    int i482 = intValue2;
                    i15 = max2;
                    i16 = i45;
                    f4 = f14;
                    i12 = i46;
                    f5 = weight3;
                    str16 = str2;
                    str20 = str;
                    str17 = str3;
                    j5 = j14;
                } else {
                    f2 = f11;
                    str6 = str3;
                    str7 = str21;
                    j3 = j13;
                    j4 = j12;
                    f3 = f13;
                    str8 = str22;
                    str9 = str23;
                    str10 = str24;
                    i12 = i35;
                    str11 = str4;
                    int i49 = i36;
                    str12 = str5;
                    String str27 = str;
                    i13 = i49;
                    long j15 = j14;
                    str13 = str2;
                    str14 = str27;
                    j5 = j15;
                }
                i43++;
                f13 = f3;
                str5 = str12;
                str4 = str11;
                i36 = i13;
                i35 = i12;
                f11 = f2;
                str21 = str7;
                str22 = str8;
                j13 = j3;
                j12 = j4;
                str23 = str9;
                str24 = str10;
                str = str14;
                String str28 = str6;
                i44 = i7;
                long j16 = j5;
                str3 = str28;
                str2 = str13;
                j14 = j16;
            }
            rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
            i10 = i35;
            coerceIn = RangesKt.coerceIn((int) (i42 + j13), 0, i3 - i10);
            i11 = i41;
        }
        if (z) {
            int i50 = 0;
            i18 = 0;
            for (int i51 = i6; i51 < i7; i51++) {
                Placeable placeable2 = placeableArr[i51];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable2));
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    int intValue4 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int crossAxisSize3 = rowColumnMeasurePolicy2.crossAxisSize(placeable2);
                    i50 = Math.max(i50, intValue4 != Integer.MIN_VALUE ? calculateAlignmentLinePosition$foundation_layout_release.intValue() : 0);
                    if (intValue4 == Integer.MIN_VALUE) {
                        intValue4 = crossAxisSize3;
                    }
                    i18 = Math.max(i18, crossAxisSize3 - intValue4);
                }
            }
            i19 = i50;
        } else {
            i18 = 0;
            i19 = 0;
        }
        int max3 = Math.max(RangesKt.coerceAtLeast(i10 + coerceIn, 0), i9);
        int max4 = Math.max(i11, Math.max(i2, i18 + i19));
        int[] iArr7 = new int[i38];
        for (int i52 = 0; i52 < i38; i52++) {
            iArr7[i52] = 0;
        }
        rowColumnMeasurePolicy2.populateMainAxisPositions(max3, iArr3, iArr7, measureScope);
        return rowColumnMeasurePolicy.placeHelper(placeableArr, measureScope, i19, iArr7, max3, max4, iArr, i8, i6, i7);
    }
}
