package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.layout.AlignmentLineKt;
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
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextField.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J/\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
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
        int i;
        Object obj4;
        final int m1049calculateWidthVsPV1Ek;
        final int m1048calculateHeightO3s9Psw;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        final int mo265roundToPx0680j_4 = measure.mo265roundToPx0680j_4(this.paddingValues.getTop());
        int mo265roundToPx0680j_42 = measure.mo265roundToPx0680j_4(this.paddingValues.getBottom());
        final int mo265roundToPx0680j_43 = measure.mo265roundToPx0680j_4(TextFieldKt.getTextFieldTopPadding());
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
        final Placeable mo1944measureBRTryo0 = measurable != null ? measurable.mo1944measureBRTryo0(m2478copyZbe2FdA$default) : null;
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
        final Placeable mo1944measureBRTryo02 = measurable2 != null ? measurable2.mo1944measureBRTryo0(ConstraintsKt.m2504offsetNN6EwU$default(m2478copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int i2 = -mo265roundToPx0680j_42;
        int i3 = -(widthOrZero + TextFieldImplKt.widthOrZero(mo1944measureBRTryo02));
        long m2503offsetNN6EwU = ConstraintsKt.m2503offsetNN6EwU(m2478copyZbe2FdA$default, i3, i2);
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
            i = mo1944measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
            if (i == Integer.MIN_VALUE) {
                i = mo1944measureBRTryo03.getHeight();
            }
        } else {
            i = 0;
        }
        final int max = Math.max(i, mo265roundToPx0680j_4);
        long m2503offsetNN6EwU2 = ConstraintsKt.m2503offsetNN6EwU(Constraints.m2478copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), i3, mo1944measureBRTryo03 != null ? (i2 - mo265roundToPx0680j_43) - max : (-mo265roundToPx0680j_4) - mo265roundToPx0680j_42);
        for (Measurable measurable4 : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "TextField")) {
                final Placeable mo1944measureBRTryo04 = measurable4.mo1944measureBRTryo0(m2503offsetNN6EwU2);
                long m2478copyZbe2FdA$default2 = Constraints.m2478copyZbe2FdA$default(m2503offsetNN6EwU2, 0, 0, 0, 0, 14, null);
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
                Placeable mo1944measureBRTryo05 = measurable5 != null ? measurable5.mo1944measureBRTryo0(m2478copyZbe2FdA$default2) : null;
                m1049calculateWidthVsPV1Ek = TextFieldKt.m1049calculateWidthVsPV1Ek(TextFieldImplKt.widthOrZero(mo1944measureBRTryo0), TextFieldImplKt.widthOrZero(mo1944measureBRTryo02), mo1944measureBRTryo04.getWidth(), TextFieldImplKt.widthOrZero(mo1944measureBRTryo03), TextFieldImplKt.widthOrZero(mo1944measureBRTryo05), j);
                m1048calculateHeightO3s9Psw = TextFieldKt.m1048calculateHeightO3s9Psw(mo1944measureBRTryo04.getHeight(), mo1944measureBRTryo03 != null, max, TextFieldImplKt.heightOrZero(mo1944measureBRTryo0), TextFieldImplKt.heightOrZero(mo1944measureBRTryo02), TextFieldImplKt.heightOrZero(mo1944measureBRTryo05), j, measure.getDensity(), this.paddingValues);
                final Placeable placeable = mo1944measureBRTryo03;
                final int i4 = i;
                final Placeable placeable2 = mo1944measureBRTryo05;
                return MeasureScope.layout$default(measure, m1049calculateWidthVsPV1Ek, m1048calculateHeightO3s9Psw, null, new Function1() { // from class: androidx.compose.material.TextFieldMeasurePolicy$measure$1
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
                        boolean z;
                        PaddingValues paddingValues;
                        boolean z2;
                        float f;
                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        if (Placeable.this != null) {
                            int coerceAtLeast = RangesKt.coerceAtLeast(mo265roundToPx0680j_4 - i4, 0);
                            int i5 = m1049calculateWidthVsPV1Ek;
                            int i6 = m1048calculateHeightO3s9Psw;
                            Placeable placeable3 = mo1944measureBRTryo04;
                            Placeable placeable4 = Placeable.this;
                            Placeable placeable5 = placeable2;
                            Placeable placeable6 = mo1944measureBRTryo0;
                            Placeable placeable7 = mo1944measureBRTryo02;
                            z2 = this.singleLine;
                            int i7 = mo265roundToPx0680j_43 + max;
                            f = this.animationProgress;
                            TextFieldKt.placeWithLabel(layout, i5, i6, placeable3, placeable4, placeable5, placeable6, placeable7, z2, coerceAtLeast, i7, f, measure.getDensity());
                            return;
                        }
                        int i8 = m1049calculateWidthVsPV1Ek;
                        int i9 = m1048calculateHeightO3s9Psw;
                        Placeable placeable8 = mo1944measureBRTryo04;
                        Placeable placeable9 = placeable2;
                        Placeable placeable10 = mo1944measureBRTryo0;
                        Placeable placeable11 = mo1944measureBRTryo02;
                        z = this.singleLine;
                        float density = measure.getDensity();
                        paddingValues = this.paddingValues;
                        TextFieldKt.placeWithoutLabel(layout, i8, i9, placeable8, placeable9, placeable10, placeable11, z, density, paddingValues);
                    }
                }, 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicHeight$1
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
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicHeight$1
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
        return intrinsicWidth(measurables, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$maxIntrinsicWidth$1
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
        return intrinsicWidth(measurables, i, new Function2() { // from class: androidx.compose.material.TextFieldMeasurePolicy$minIntrinsicWidth$1
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
        int m1049calculateWidthVsPV1Ek;
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
                m1049calculateWidthVsPV1Ek = TextFieldKt.m1049calculateWidthVsPV1Ek(intValue4, intValue3, intValue, intValue2, intrinsicMeasurable4 != null ? ((Number) intrinsicMeasurer.invoke(intrinsicMeasurable4, Integer.valueOf(height))).intValue() : 0, TextFieldImplKt.getZeroConstraints());
                return m1049calculateWidthVsPV1Ek;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int m1048calculateHeightO3s9Psw;
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
                m1048calculateHeightO3s9Psw = TextFieldKt.m1048calculateHeightO3s9Psw(intValue, intValue2 > 0, intValue2, intValue4, intValue3, intrinsicMeasurable4 != null ? ((Number) function2.invoke(intrinsicMeasurable4, Integer.valueOf(i))).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1048calculateHeightO3s9Psw;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
