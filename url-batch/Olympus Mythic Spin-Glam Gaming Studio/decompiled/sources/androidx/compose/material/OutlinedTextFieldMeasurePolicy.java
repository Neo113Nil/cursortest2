package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ8\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J<\u0010\u0015\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J/\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u00162\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1 onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public OutlinedTextFieldMeasurePolicy(Function1 onLabelMeasured, boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo37measure3p2s80s(final MeasureScope measure, List measurables, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        final int m923calculateWidthVsPV1Ek;
        final int m922calculateHeightzUg2_y0;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int mo265roundToPx0680j_4 = measure.mo265roundToPx0680j_4(this.paddingValues.getBottom());
        long m2478copyZbe2FdA$default = Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<Measurable> list = measurables;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo1944measureBRTryo0 = measurable != null ? measurable.mo1944measureBRTryo0(m2478copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo1944measureBRTryo0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo1944measureBRTryo02 = measurable2 != null ? measurable2.mo1944measureBRTryo0(ConstraintsKt.m2504offsetNN6EwU$default(m2478copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i = -(widthOrZero + TextFieldImplKt.widthOrZero(mo1944measureBRTryo02));
        int i2 = -mo265roundToPx0680j_4;
        long m2503offsetNN6EwU = ConstraintsKt.m2503offsetNN6EwU(m2478copyZbe2FdA$default, (i - measure.mo265roundToPx0680j_4(this.paddingValues.mo320calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()))) - measure.mo265roundToPx0680j_4(this.paddingValues.mo321calculateRightPaddingu2uoSUM(measure.getLayoutDirection())), i2);
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), "Label")) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo1944measureBRTryo03 = measurable3 != null ? measurable3.mo1944measureBRTryo0(m2503offsetNN6EwU) : null;
        if (mo1944measureBRTryo03 != null) {
            this.onLabelMeasured.invoke(Size.m1329boximpl(SizeKt.Size(mo1944measureBRTryo03.getWidth(), mo1944measureBRTryo03.getHeight())));
        }
        long m2478copyZbe2FdA$default2 = Constraints.m2478copyZbe2FdA$default(ConstraintsKt.m2503offsetNN6EwU(j, i, i2 - Math.max(TextFieldImplKt.heightOrZero(mo1944measureBRTryo03) / 2, measure.mo265roundToPx0680j_4(this.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                final Placeable mo1944measureBRTryo04 = measurable4.mo1944measureBRTryo0(m2478copyZbe2FdA$default2);
                long m2478copyZbe2FdA$default3 = Constraints.m2478copyZbe2FdA$default(m2478copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), "Hint")) {
                        break;
                    }
                }
                Measurable measurable5 = (Measurable) obj4;
                Placeable mo1944measureBRTryo05 = measurable5 != null ? measurable5.mo1944measureBRTryo0(m2478copyZbe2FdA$default3) : null;
                m923calculateWidthVsPV1Ek = OutlinedTextFieldKt.m923calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo1944measureBRTryo0), TextFieldImplKt.widthOrZero(mo1944measureBRTryo02), mo1944measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo1944measureBRTryo03), TextFieldImplKt.widthOrZero(mo1944measureBRTryo05), j);
                m922calculateHeightzUg2_y0 = OutlinedTextFieldKt.m922calculateHeightzUg2_y0(TextFieldImplKt.heightOrZero(mo1944measureBRTryo0), TextFieldImplKt.heightOrZero(mo1944measureBRTryo02), mo1944measureBRTryo04.getHeight(), TextFieldImplKt.heightOrZero(mo1944measureBRTryo03), TextFieldImplKt.heightOrZero(mo1944measureBRTryo05), j, measure.getDensity(), this.paddingValues);
                for (Measurable measurable6 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "border")) {
                        final Placeable mo1944measureBRTryo06 = measurable6.mo1944measureBRTryo0(ConstraintsKt.Constraints(m923calculateWidthVsPV1Ek != Integer.MAX_VALUE ? m923calculateWidthVsPV1Ek : 0, m923calculateWidthVsPV1Ek, m922calculateHeightzUg2_y0 != Integer.MAX_VALUE ? m922calculateHeightzUg2_y0 : 0, m922calculateHeightzUg2_y0));
                        final Placeable placeable = mo1944measureBRTryo0;
                        final Placeable placeable2 = mo1944measureBRTryo02;
                        final Placeable placeable3 = mo1944measureBRTryo03;
                        final Placeable placeable4 = mo1944measureBRTryo05;
                        return MeasureScope.layout$default(measure, m923calculateWidthVsPV1Ek, m922calculateHeightzUg2_y0, null, new Function1() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$measure$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj5) {
                                invoke((Placeable.PlacementScope) obj5);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Placeable.PlacementScope layout) {
                                float f;
                                boolean z;
                                PaddingValues paddingValues;
                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                int i3 = m922calculateHeightzUg2_y0;
                                int i4 = m923calculateWidthVsPV1Ek;
                                Placeable placeable5 = placeable;
                                Placeable placeable6 = placeable2;
                                Placeable placeable7 = mo1944measureBRTryo04;
                                Placeable placeable8 = placeable3;
                                Placeable placeable9 = placeable4;
                                Placeable placeable10 = mo1944measureBRTryo06;
                                f = this.animationProgress;
                                z = this.singleLine;
                                float density = measure.getDensity();
                                LayoutDirection layoutDirection = measure.getLayoutDirection();
                                paddingValues = this.paddingValues;
                                OutlinedTextFieldKt.place(layout, i3, i4, placeable5, placeable6, placeable7, placeable8, placeable9, placeable10, f, z, density, layoutDirection, paddingValues);
                            }
                        }, 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(measurables, i, new Function2() { // from class: androidx.compose.material.OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
            }

            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
            }
        });
    }

    private final int intrinsicWidth(List measurables, int height, Function2 intrinsicMeasurer) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int m923calculateWidthVsPV1Ek;
        List list = measurables;
        for (Object obj5 : list) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) intrinsicMeasurer.invoke(obj5, Integer.valueOf(height))).intValue();
                Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable, Integer.valueOf(height))).intValue() : 0;
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable2, Integer.valueOf(height))).intValue() : 0;
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable3, Integer.valueOf(height))).intValue() : 0;
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                m923calculateWidthVsPV1Ek = OutlinedTextFieldKt.m923calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
                return m923calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int m922calculateHeightzUg2_y0;
        List list2 = list;
        for (Object obj5 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), "TextField")) {
                int intValue = ((Number) function2.invoke(obj5, Integer.valueOf(i))).intValue();
                Iterator it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? ((Number) function2.invoke(intrinsicMeasurable, Integer.valueOf(i))).intValue() : 0;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? ((Number) function2.invoke(intrinsicMeasurable2, Integer.valueOf(i))).intValue() : 0;
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? ((Number) function2.invoke(intrinsicMeasurable3, Integer.valueOf(i))).intValue() : 0;
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj;
                m922calculateHeightzUg2_y0 = OutlinedTextFieldKt.m922calculateHeightzUg2_y0(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m922calculateHeightzUg2_y0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
