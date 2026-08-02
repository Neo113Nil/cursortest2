package com.stripe.android.uicore.elements.compat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.fidesmo.views.ScanningHeartPulseKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes5.dex */
public final class TextFieldMeasurePolicy implements MeasurePolicy {
    public final float animationProgress;
    public final PaddingValuesImpl paddingValues;
    public final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValuesImpl paddingValuesImpl) {
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValuesImpl;
    }

    public static int intrinsicWidth$2(List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = list.get(i2);
            if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    Object obj6 = list.get(i6);
                    if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj6), "Hint")) {
                        obj = obj6;
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                return Math.max(Math.max(intValue, Math.max(intValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0)) + intValue4 + intValue3, Constraints.m1027getMinWidthimpl(CompatConstantsKt.ZeroConstraints));
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    public final int intrinsicHeight$4(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        int i2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= size) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i5);
            if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj2), "Leading")) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
        if (intrinsicMeasurable != null) {
            i2 = i == Integer.MAX_VALUE ? i : i - intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE);
            i3 = ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i6);
            if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
        if (intrinsicMeasurable2 != null) {
            int maxIntrinsicWidth = intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= maxIntrinsicWidth;
            }
            i4 = ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i7);
            if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj4), "Label")) {
                break;
            }
            i7++;
        }
        Object obj5 = (IntrinsicMeasurable) obj4;
        int intValue = obj5 != null ? ((Number) function2.invoke(obj5, Integer.valueOf(i2))).intValue() : 0;
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Object obj6 = list.get(i8);
            if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj6), "TextField")) {
                int intValue2 = ((Number) function2.invoke(obj6, Integer.valueOf(i2))).intValue();
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        break;
                    }
                    Object obj7 = list.get(i9);
                    if (Intrinsics.areEqual(ScanningHeartPulseKt.access$getLayoutId((IntrinsicMeasurable) obj7), "Hint")) {
                        obj = obj7;
                        break;
                    }
                    i9++;
                }
                Object obj8 = (IntrinsicMeasurable) obj;
                return ScanningHeartPulseKt.m3539access$calculateHeightO3s9Psw(intValue2, intValue > 0, intValue, i3, i4, obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0, CompatConstantsKt.ZeroConstraints, intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        intrinsicMeasureScope.getClass();
        return intrinsicHeight$4(intrinsicMeasureScope, list, i, new Equals$$ExternalSyntheticLambda0(1));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        intrinsicMeasureScope.getClass();
        return intrinsicWidth$2(list, i, new Equals$$ExternalSyntheticLambda0(4));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo138measure3p2s80s(MeasureScope measureScope, List list, long j) {
        Object obj;
        List list2;
        Object obj2;
        int i;
        int i2;
        Placeable placeable;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        int i5;
        Placeable placeable2;
        boolean z;
        int i6;
        List list3 = list;
        measureScope.getClass();
        list3.getClass();
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        PaddingValuesImpl paddingValuesImpl = textFieldMeasurePolicy.paddingValues;
        int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(paddingValuesImpl.top);
        int mo230roundToPx0680j_42 = measureScope.mo230roundToPx0680j_4(paddingValuesImpl.bottom);
        final int mo230roundToPx0680j_43 = measureScope.mo230roundToPx0680j_4(4.0f);
        long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 10);
        List list4 = list3;
        int size = list4.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i7);
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
            i7++;
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo833measureBRTryo0 = measurable != null ? measurable.mo833measureBRTryo0(m1018copyZbe2FdA$default) : null;
        int i8 = mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0;
        int size2 = list4.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i9);
            list2 = list4;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
            i9++;
            list4 = list2;
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            i = i8;
            i2 = 0;
            placeable = measurable2.mo833measureBRTryo0(ConstraintsKt.m1035offsetNN6EwU$default(-i8, 0, 2, m1018copyZbe2FdA$default));
        } else {
            i = i8;
            i2 = 0;
            placeable = null;
        }
        int i10 = -mo230roundToPx0680j_42;
        int i11 = -(i + (placeable != null ? placeable.width : i2));
        long m1034offsetNN6EwU = ConstraintsKt.m1034offsetNN6EwU(i11, i10, m1018copyZbe2FdA$default);
        int size3 = list2.size();
        int i12 = i2;
        while (true) {
            if (i12 >= size3) {
                i3 = mo230roundToPx0680j_42;
                obj3 = null;
                break;
            }
            obj3 = list3.get(i12);
            i3 = mo230roundToPx0680j_42;
            if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj3), "Label")) {
                break;
            }
            i12++;
            mo230roundToPx0680j_42 = i3;
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo833measureBRTryo02 = measurable3 != null ? measurable3.mo833measureBRTryo0(m1034offsetNN6EwU) : null;
        if (mo833measureBRTryo02 != null) {
            i4 = mo833measureBRTryo02.get(AlignmentLineKt.LastBaseline);
            if (i4 == Integer.MIN_VALUE) {
                i4 = mo833measureBRTryo02.height;
            }
        } else {
            i4 = 0;
        }
        final int max = Math.max(i4, mo230roundToPx0680j_4);
        int i13 = i4;
        long m1034offsetNN6EwU2 = ConstraintsKt.m1034offsetNN6EwU(i11, mo833measureBRTryo02 != null ? (i10 - mo230roundToPx0680j_43) - max : (-mo230roundToPx0680j_4) - i3, Constraints.m1018copyZbe2FdA$default(j, 0, 0, 0, 0, 11));
        int size4 = list2.size();
        int i14 = 0;
        while (i14 < size4) {
            Measurable measurable4 = (Measurable) list3.get(i14);
            int i15 = size4;
            if (Intrinsics.areEqual(RulerKt.getLayoutId(measurable4), "TextField")) {
                final Placeable mo833measureBRTryo03 = measurable4.mo833measureBRTryo0(m1034offsetNN6EwU2);
                long m1018copyZbe2FdA$default2 = Constraints.m1018copyZbe2FdA$default(m1034offsetNN6EwU2, 0, 0, 0, 0, 14);
                int size5 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list3.get(i16);
                    int i17 = size5;
                    if (Intrinsics.areEqual(RulerKt.getLayoutId((Measurable) obj4), "Hint")) {
                        break;
                    }
                    i16++;
                    list3 = list;
                    size5 = i17;
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable mo833measureBRTryo04 = measurable5 != null ? measurable5.mo833measureBRTryo0(m1018copyZbe2FdA$default2) : null;
                final int max2 = Math.max(Math.max(mo833measureBRTryo03.width, Math.max(mo833measureBRTryo02 != null ? mo833measureBRTryo02.width : 0, mo833measureBRTryo04 != null ? mo833measureBRTryo04.width : 0)) + (mo833measureBRTryo0 != null ? mo833measureBRTryo0.width : 0) + (placeable != null ? placeable.width : 0), Constraints.m1027getMinWidthimpl(j));
                int i18 = mo833measureBRTryo03.height;
                boolean z2 = mo833measureBRTryo02 != null;
                int i19 = mo833measureBRTryo0 != null ? mo833measureBRTryo0.height : 0;
                int i20 = placeable != null ? placeable.height : 0;
                if (mo833measureBRTryo04 != null) {
                    i5 = i18;
                    placeable2 = mo833measureBRTryo02;
                    z = z2;
                    i6 = mo833measureBRTryo04.height;
                } else {
                    i5 = i18;
                    placeable2 = mo833measureBRTryo02;
                    z = z2;
                    i6 = 0;
                }
                final int i21 = i13;
                int i22 = i5;
                final Placeable placeable3 = placeable2;
                final Placeable placeable4 = placeable;
                final Placeable placeable5 = mo833measureBRTryo0;
                final int m3539access$calculateHeightO3s9Psw = ScanningHeartPulseKt.m3539access$calculateHeightO3s9Psw(i22, z, max, i19, i20, i6, j, measureScope.getDensity(), paddingValuesImpl);
                final int i23 = mo230roundToPx0680j_4;
                final Placeable placeable6 = mo833measureBRTryo04;
                return MeasureScope.layout$default(measureScope, max2, m3539access$calculateHeightO3s9Psw, new Function1() { // from class: com.stripe.android.uicore.elements.compat.TextFieldMeasurePolicy$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        float f;
                        float f2;
                        int i24;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        TextFieldMeasurePolicy textFieldMeasurePolicy2 = textFieldMeasurePolicy;
                        boolean z3 = textFieldMeasurePolicy2.singleLine;
                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj5;
                        placementScope.getClass();
                        Placeable placeable7 = Placeable.this;
                        int i25 = max2;
                        int i26 = m3539access$calculateHeightO3s9Psw;
                        Placeable placeable8 = mo833measureBRTryo03;
                        Placeable placeable9 = placeable6;
                        Placeable placeable10 = placeable5;
                        Placeable placeable11 = placeable4;
                        if (placeable7 != null) {
                            int i27 = i23 - i21;
                            if (i27 < 0) {
                                i27 = 0;
                            }
                            int i28 = max + mo230roundToPx0680j_43;
                            float f8 = textFieldMeasurePolicy2.animationProgress;
                            float density = placementScope.getDensity();
                            if (placeable10 != null) {
                                int m = Recorder$$ExternalSyntheticOutline2.m(i26 - placeable10.height, 2.0f, 1.0f);
                                f4 = RecyclerView.DECELERATION_RATE;
                                placementScope.placeRelative(placeable10, 0, m, RecyclerView.DECELERATION_RATE);
                            } else {
                                f4 = RecyclerView.DECELERATION_RATE;
                            }
                            if (placeable11 != null) {
                                f5 = f8;
                                f6 = 1.0f;
                                f7 = 2.0f;
                                placementScope.placeRelative(placeable11, i25 - placeable11.width, Recorder$$ExternalSyntheticOutline2.m(i26 - placeable11.height, 2.0f, 1.0f), f4);
                            } else {
                                f5 = f8;
                                f6 = 1.0f;
                                f7 = 2.0f;
                            }
                            placementScope.placeRelative(placeable7, placeable10 != null ? placeable10.width : 0, (z3 ? Recorder$$ExternalSyntheticOutline2.m(i26 - placeable7.height, f7, f6) : MathKt__MathJVMKt.roundToInt(CompatConstantsKt.TextFieldPadding * density)) - MathKt__MathJVMKt.roundToInt((r0 - i27) * f5), RecyclerView.DECELERATION_RATE);
                            placementScope.placeRelative(placeable8, placeable10 != null ? placeable10.width : 0, i28, RecyclerView.DECELERATION_RATE);
                            if (placeable9 != null) {
                                placementScope.placeRelative(placeable9, placeable10 != null ? placeable10.width : 0, i28, RecyclerView.DECELERATION_RATE);
                            }
                        } else {
                            int roundToInt = MathKt__MathJVMKt.roundToInt(textFieldMeasurePolicy2.paddingValues.top * placementScope.getDensity());
                            if (placeable10 != null) {
                                f = 1.0f;
                                f3 = 2.0f;
                                int m2 = Recorder$$ExternalSyntheticOutline2.m(i26 - placeable10.height, 2.0f, 1.0f);
                                f2 = RecyclerView.DECELERATION_RATE;
                                i24 = 0;
                                placementScope.placeRelative(placeable10, 0, m2, RecyclerView.DECELERATION_RATE);
                            } else {
                                f = 1.0f;
                                f2 = RecyclerView.DECELERATION_RATE;
                                i24 = 0;
                                f3 = 2.0f;
                            }
                            if (placeable11 != null) {
                                placementScope.placeRelative(placeable11, i25 - placeable11.width, Recorder$$ExternalSyntheticOutline2.m(i26 - placeable11.height, f3, f), f2);
                            }
                            placementScope.placeRelative(placeable8, placeable10 != null ? placeable10.width : i24, z3 ? Recorder$$ExternalSyntheticOutline2.m(i26 - placeable8.height, f3, f) : roundToInt, RecyclerView.DECELERATION_RATE);
                            if (placeable9 != null) {
                                if (z3) {
                                    roundToInt = Recorder$$ExternalSyntheticOutline2.m(i26 - placeable9.height, 2.0f, 1.0f);
                                }
                                placementScope.placeRelative(placeable9, placeable10 != null ? placeable10.width : i24, roundToInt, RecyclerView.DECELERATION_RATE);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            i14++;
            i13 = i13;
            mo833measureBRTryo0 = mo833measureBRTryo0;
            textFieldMeasurePolicy = this;
            size4 = i15;
            mo833measureBRTryo02 = mo833measureBRTryo02;
            mo230roundToPx0680j_4 = mo230roundToPx0680j_4;
            placeable = placeable;
            paddingValuesImpl = paddingValuesImpl;
            list3 = list;
        }
        throw Recorder$$ExternalSyntheticOutline1.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        intrinsicMeasureScope.getClass();
        return intrinsicHeight$4(intrinsicMeasureScope, list, i, new Equals$$ExternalSyntheticLambda0(3));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        intrinsicMeasureScope.getClass();
        return intrinsicWidth$2(list, i, new Equals$$ExternalSyntheticLambda0(2));
    }
}
