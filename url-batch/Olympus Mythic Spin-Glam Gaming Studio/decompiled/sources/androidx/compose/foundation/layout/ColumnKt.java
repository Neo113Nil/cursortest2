package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Column.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurePolicy", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultColumnMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "getDefaultColumnMeasurePolicy$annotations", "()V", "foundation-layout_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float spacing = Arrangement.INSTANCE.getTop().getSpacing();
        CrossAxisAlignment horizontal$foundation_layout_release = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(Alignment.INSTANCE.getStart());
        DefaultColumnMeasurePolicy = RowColumnImplKt.m341rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new Function5() { // from class: androidx.compose.foundation.layout.ColumnKt$DefaultColumnMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @NotNull int[] size, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull int[] outPosition) {
                Intrinsics.checkNotNullParameter(size, "size");
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
                Intrinsics.checkNotNullParameter(density, "density");
                Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                Arrangement.INSTANCE.getTop().arrange(density, i, size, outPosition);
            }
        }, spacing, SizeMode.Wrap, horizontal$foundation_layout_release);
    }

    public static final MeasurePolicy columnMeasurePolicy(final Arrangement.Vertical verticalArrangement, Alignment.Horizontal horizontalAlignment, Composer composer, int i) {
        MeasurePolicy m341rowColumnMeasurePolicyTDGSqEk;
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        composer.startReplaceableGroup(1089876336);
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(verticalArrangement) | composer.changed(horizontalAlignment);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            if (Intrinsics.areEqual(verticalArrangement, Arrangement.INSTANCE.getTop()) && Intrinsics.areEqual(horizontalAlignment, Alignment.INSTANCE.getStart())) {
                m341rowColumnMeasurePolicyTDGSqEk = DefaultColumnMeasurePolicy;
            } else {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float spacing = verticalArrangement.getSpacing();
                CrossAxisAlignment horizontal$foundation_layout_release = CrossAxisAlignment.INSTANCE.horizontal$foundation_layout_release(horizontalAlignment);
                m341rowColumnMeasurePolicyTDGSqEk = RowColumnImplKt.m341rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new Function5() { // from class: androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1
                    {
                        super(5);
                    }

                    @Override // kotlin.jvm.functions.Function5
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2, @NotNull int[] size, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull int[] outPosition) {
                        Intrinsics.checkNotNullParameter(size, "size");
                        Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 2>");
                        Intrinsics.checkNotNullParameter(density, "density");
                        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
                        Arrangement.Vertical.this.arrange(density, i2, size, outPosition);
                    }
                }, spacing, SizeMode.Wrap, horizontal$foundation_layout_release);
            }
            rememberedValue = m341rowColumnMeasurePolicyTDGSqEk;
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
