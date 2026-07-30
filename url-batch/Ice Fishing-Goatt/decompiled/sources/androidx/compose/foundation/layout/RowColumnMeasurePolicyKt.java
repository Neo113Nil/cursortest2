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
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029b A[Catch: IllegalArgumentException -> 0x0337, TRY_LEAVE, TryCatch #3 {IllegalArgumentException -> 0x0337, blocks: (B:92:0x0288, B:98:0x029b), top: B:91:0x0288 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult measure(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i, int i2, int i3, int i4, int i5, MeasureScope measureScope, List<? extends Measurable> list, Placeable[] placeableArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        float f;
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        long j2;
        String str6;
        int i12;
        int coerceIn;
        int i13;
        int i14;
        String str7;
        int i15;
        String str8;
        int i16;
        String str9;
        int i17;
        String str10;
        String str11;
        FlowLayoutData flowLayoutData;
        String str12;
        int i18;
        String str13;
        int i19;
        String str14;
        float f2;
        long j3;
        String str15;
        long j4;
        Integer num;
        float f3;
        int i20;
        char c;
        int i21;
        String str16;
        int i22;
        int intValue;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        RowColumnMeasurePolicy rowColumnMeasurePolicy2;
        int i30;
        FlowLayoutData flowLayoutData2;
        int i31 = i4;
        List<? extends Measurable> list2 = list;
        int i32 = i7;
        long j5 = i5;
        int i33 = i32 - i6;
        int[] iArr2 = new int[i33];
        int i34 = 0;
        int i35 = i6;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        float f4 = 0.0f;
        while (true) {
            Integer num2 = null;
            i9 = i37;
            if (i35 >= i32) {
                break;
            }
            float f5 = f4;
            Measurable measurable = list2.get(i35);
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            float weight = RowColumnImplKt.getWeight(rowColumnParentData);
            int i41 = (i38 != 0 || RowColumnImplKt.isRelative(rowColumnParentData)) ? 1 : i34;
            if (weight > 0.0f) {
                f4 = f5 + weight;
                i36++;
                i26 = i33;
                i27 = i35;
                i37 = i9;
            } else {
                if (i31 != Integer.MAX_VALUE && rowColumnParentData != null && (flowLayoutData2 = rowColumnParentData.getFlowLayoutData()) != null) {
                    num2 = Integer.valueOf(Math.round(flowLayoutData2.getFillCrossAxisFraction() * i31));
                }
                int i42 = i3 - i9;
                Placeable placeable = placeableArr[i35];
                if (placeable == null) {
                    i28 = i42;
                    i27 = i35;
                    i26 = i33;
                    i29 = i9;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i30 = i36;
                    placeable = measurable.mo5152measureBRTryo0(RowColumnMeasurePolicy.m698createConstraintsxF2OJ5Q$default(rowColumnMeasurePolicy2, 0, num2 != null ? num2.intValue() : i34, i3 != Integer.MAX_VALUE ? RangesKt.coerceAtLeast(i42, i34) : Integer.MAX_VALUE, num2 != null ? num2.intValue() : i31, false, 16, null));
                } else {
                    i26 = i33;
                    i27 = i35;
                    i28 = i42;
                    i29 = i9;
                    rowColumnMeasurePolicy2 = rowColumnMeasurePolicy;
                    i30 = i36;
                }
                int mainAxisSize = rowColumnMeasurePolicy2.mainAxisSize(placeable);
                int crossAxisSize = rowColumnMeasurePolicy2.crossAxisSize(placeable);
                iArr2[i27 - i6] = mainAxisSize;
                int min = Math.min(i5, RangesKt.coerceAtLeast(i28 - mainAxisSize, 0));
                i37 = i29 + mainAxisSize + min;
                int max = Math.max(i40, crossAxisSize);
                placeableArr[i27] = placeable;
                i40 = max;
                i39 = min;
                i36 = i30;
                f4 = f5;
            }
            i35 = i27 + 1;
            i31 = i4;
            i38 = i41;
            i33 = i26;
            i34 = 0;
        }
        int i43 = i33;
        float f6 = f4;
        int i44 = i40;
        int i45 = i9;
        RowColumnMeasurePolicy rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
        int i46 = i36;
        if (i46 == 0) {
            i13 = i45 - i39;
            i12 = i44;
            i10 = i38;
            coerceIn = 0;
        } else {
            int i47 = i3 != Integer.MAX_VALUE ? i3 : i;
            long j6 = (i46 - 1) * j5;
            int i48 = i44;
            long coerceAtLeast = RangesKt.coerceAtLeast((i47 - i45) - j6, 0L);
            float f7 = coerceAtLeast / f6;
            int i49 = i6;
            long j7 = coerceAtLeast;
            i10 = i38;
            while (true) {
                i11 = i48;
                f = f7;
                str = "weightUnitSpace ";
                str2 = "arrangementSpacingTotal ";
                str3 = "fixedSpace ";
                j = coerceAtLeast;
                str4 = "remainingToTarget ";
                str5 = "targetSpace ";
                j2 = j6;
                str6 = "mainAxisMin ";
                if (i49 >= i32) {
                    break;
                }
                float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(list2.get(i49)));
                float f8 = f * weight2;
                try {
                    j7 -= Math.round(f8);
                    i49++;
                    list2 = list;
                    i48 = i11;
                    f7 = f;
                    coerceAtLeast = j;
                    j6 = j2;
                } catch (IllegalArgumentException e) {
                    StringBuilder sb = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax ");
                    sb.append(i3).append("mainAxisMin ").append(i).append("targetSpace ").append(i47).append("arrangementSpacingPx ").append(j5).append("weightChildrenCount ").append(i46).append("fixedSpace ").append(i45).append("arrangementSpacingTotal ").append(j2).append(str4).append(j).append("totalWeight ").append(f6).append(str).append(f).append("itemWeight ").append(weight2).append("weightedSize ");
                    sb.append(f8);
                    throw new IllegalArgumentException(sb.toString()).initCause(e);
                }
            }
            int i50 = i46;
            String str17 = "weightedSize ";
            String str18 = "weightChildrenCount ";
            int i51 = i11;
            int i52 = 0;
            int i53 = i6;
            while (i53 < i32) {
                if (placeableArr[i53] == null) {
                    i16 = i53;
                    Measurable measurable2 = list.get(i53);
                    RowColumnParentData rowColumnParentData2 = RowColumnImplKt.getRowColumnParentData(measurable2);
                    float weight3 = RowColumnImplKt.getWeight(rowColumnParentData2);
                    int i54 = i52;
                    Integer valueOf = (i4 == Integer.MAX_VALUE || rowColumnParentData2 == null || (flowLayoutData = rowColumnParentData2.getFlowLayoutData()) == null) ? null : Integer.valueOf(Math.round(i4 * flowLayoutData.getFillCrossAxisFraction()));
                    if (weight3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                    Integer num3 = valueOf;
                    int sign = MathKt.getSign(j7);
                    String str19 = str5;
                    j7 -= sign;
                    float f9 = f * weight3;
                    String str20 = str6;
                    int max2 = Math.max(0, Math.round(f9) + sign);
                    try {
                        try {
                            if (RowColumnImplKt.getFill(rowColumnParentData2)) {
                                c = CharCompanionObject.MAX_VALUE;
                                if (max2 != Integer.MAX_VALUE) {
                                    i21 = max2;
                                    if (num3 == null) {
                                        String str21 = str17;
                                        i20 = max2;
                                        i22 = num3.intValue();
                                        str16 = str21;
                                    } else {
                                        str16 = str17;
                                        i20 = max2;
                                        i22 = 0;
                                    }
                                    if (num3 == null) {
                                        try {
                                            intValue = num3.intValue();
                                        } catch (IllegalArgumentException e2) {
                                            e = e2;
                                            String str22 = str18;
                                            i14 = i45;
                                            str7 = str22;
                                            str8 = str2;
                                            i18 = sign;
                                            i19 = i50;
                                            str12 = str16;
                                            str14 = str;
                                            f2 = weight3;
                                            j3 = j;
                                            str15 = str4;
                                            j4 = j2;
                                            num = num3;
                                            f3 = f9;
                                            str11 = str20;
                                            str13 = str3;
                                            str10 = str19;
                                            StringBuilder sb2 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                                            sb2.append(i3).append(str11).append(i).append(str10).append(i47).append("arrangementSpacingPx ").append(j5).append(str7).append(i19).append(str13).append(i14).append(str8).append(j4).append(str15).append(j3).append("totalWeight ").append(f6).append(str14).append(f).append("weight ").append(f2).append(str12);
                                            sb2.append(f3).append("crossAxisDesiredSize ").append(num).append("remainderUnit ").append(i18).append("childMainAxisSize ").append(i20);
                                            throw new IllegalArgumentException(sb2.toString()).initCause(e);
                                        }
                                    } else {
                                        intValue = i4;
                                    }
                                    String str23 = str18;
                                    i14 = i45;
                                    str7 = str23;
                                    str8 = str2;
                                    str12 = str16;
                                    int i55 = intValue;
                                    str14 = str;
                                    f2 = weight3;
                                    j3 = j;
                                    str15 = str4;
                                    j4 = j2;
                                    num = num3;
                                    f3 = f9;
                                    i18 = sign;
                                    str13 = str3;
                                    i19 = i50;
                                    str10 = str19;
                                    str11 = str20;
                                    Placeable mo5152measureBRTryo0 = measurable2.mo5152measureBRTryo0(rowColumnMeasurePolicy.mo588createConstraintsxF2OJ5Q(i21, i22, i20, i55, true));
                                    int mainAxisSize2 = rowColumnMeasurePolicy.mainAxisSize(mo5152measureBRTryo0);
                                    int crossAxisSize2 = rowColumnMeasurePolicy.crossAxisSize(mo5152measureBRTryo0);
                                    iArr2[i16 - i6] = mainAxisSize2;
                                    i51 = Math.max(i51, crossAxisSize2);
                                    placeableArr[i16] = mo5152measureBRTryo0;
                                    i15 = i54 + mainAxisSize2;
                                    str9 = str13;
                                    i17 = i19;
                                    j2 = j4;
                                    j = j3;
                                    str17 = str12;
                                    str = str14;
                                    str4 = str15;
                                }
                            } else {
                                c = CharCompanionObject.MAX_VALUE;
                            }
                            Placeable mo5152measureBRTryo02 = measurable2.mo5152measureBRTryo0(rowColumnMeasurePolicy.mo588createConstraintsxF2OJ5Q(i21, i22, i20, i55, true));
                            int mainAxisSize22 = rowColumnMeasurePolicy.mainAxisSize(mo5152measureBRTryo02);
                            int crossAxisSize22 = rowColumnMeasurePolicy.crossAxisSize(mo5152measureBRTryo02);
                            iArr2[i16 - i6] = mainAxisSize22;
                            i51 = Math.max(i51, crossAxisSize22);
                            placeableArr[i16] = mo5152measureBRTryo02;
                            i15 = i54 + mainAxisSize22;
                            str9 = str13;
                            i17 = i19;
                            j2 = j4;
                            j = j3;
                            str17 = str12;
                            str = str14;
                            str4 = str15;
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            StringBuilder sb22 = new StringBuilder("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax ");
                            sb22.append(i3).append(str11).append(i).append(str10).append(i47).append("arrangementSpacingPx ").append(j5).append(str7).append(i19).append(str13).append(i14).append(str8).append(j4).append(str15).append(j3).append("totalWeight ").append(f6).append(str14).append(f).append("weight ").append(f2).append(str12);
                            sb22.append(f3).append("crossAxisDesiredSize ").append(num).append("remainderUnit ").append(i18).append("childMainAxisSize ").append(i20);
                            throw new IllegalArgumentException(sb22.toString()).initCause(e);
                        }
                        i21 = 0;
                        if (num3 == null) {
                        }
                        if (num3 == null) {
                        }
                        String str232 = str18;
                        i14 = i45;
                        str7 = str232;
                        str8 = str2;
                        str12 = str16;
                        int i552 = intValue;
                        str14 = str;
                        f2 = weight3;
                        j3 = j;
                        str15 = str4;
                        j4 = j2;
                        num = num3;
                        f3 = f9;
                        i18 = sign;
                        str13 = str3;
                        i19 = i50;
                        str10 = str19;
                        str11 = str20;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        String str24 = str18;
                        i14 = i45;
                        str7 = str24;
                        str12 = str17;
                        str8 = str2;
                        i18 = sign;
                        str13 = str3;
                        i19 = i50;
                        str14 = str;
                        f2 = weight3;
                        j3 = j;
                        str15 = str4;
                        j4 = j2;
                        num = num3;
                        str10 = str19;
                        f3 = f9;
                        str11 = str20;
                        i20 = max2;
                    }
                } else {
                    String str25 = str18;
                    i14 = i45;
                    str7 = str25;
                    i15 = i52;
                    str8 = str2;
                    i16 = i53;
                    str9 = str3;
                    i17 = i50;
                    str10 = str5;
                    str11 = str6;
                }
                int i56 = i14;
                str18 = str7;
                i45 = i56;
                str6 = str11;
                i52 = i15;
                str2 = str8;
                i50 = i17;
                i53 = i16 + 1;
                str5 = str10;
                str3 = str9;
                i32 = i7;
            }
            int i57 = i52;
            int i58 = i45;
            i12 = i51;
            rowColumnMeasurePolicy3 = rowColumnMeasurePolicy;
            coerceIn = RangesKt.coerceIn((int) (i57 + j2), 0, i3 - i58);
            i13 = i58;
        }
        if (i10 != 0) {
            i23 = i7;
            int i59 = 0;
            int i60 = 0;
            for (int i61 = i6; i61 < i23; i61++) {
                Placeable placeable2 = placeableArr[i61];
                Intrinsics.checkNotNull(placeable2);
                CrossAxisAlignment crossAxisAlignment = RowColumnImplKt.getCrossAxisAlignment(RowColumnImplKt.getRowColumnParentData(placeable2));
                Integer calculateAlignmentLinePosition$foundation_layout_release = crossAxisAlignment != null ? crossAxisAlignment.calculateAlignmentLinePosition$foundation_layout_release(placeable2) : null;
                if (calculateAlignmentLinePosition$foundation_layout_release != null) {
                    int intValue2 = calculateAlignmentLinePosition$foundation_layout_release.intValue();
                    int crossAxisSize3 = rowColumnMeasurePolicy3.crossAxisSize(placeable2);
                    i59 = Math.max(i59, intValue2 != Integer.MIN_VALUE ? calculateAlignmentLinePosition$foundation_layout_release.intValue() : 0);
                    if (intValue2 == Integer.MIN_VALUE) {
                        intValue2 = crossAxisSize3;
                    }
                    i60 = Math.max(i60, crossAxisSize3 - intValue2);
                }
            }
            int i62 = i60;
            i25 = i59;
            i24 = i62;
        } else {
            i23 = i7;
            i24 = 0;
            i25 = 0;
        }
        int max3 = Math.max(RangesKt.coerceAtLeast(i13 + coerceIn, 0), i);
        int max4 = Math.max(i12, Math.max(i2, i24 + i25));
        int[] iArr3 = new int[i43];
        for (int i63 = 0; i63 < i43; i63++) {
            iArr3[i63] = 0;
        }
        rowColumnMeasurePolicy3.populateMainAxisPositions(max3, iArr2, iArr3, measureScope);
        return rowColumnMeasurePolicy3.placeHelper(placeableArr, measureScope, i25, iArr3, max3, max4, iArr, i8, i6, i23);
    }
}
