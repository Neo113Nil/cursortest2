package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeasureScope.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MeasureScope extends IntrinsicMeasureScope {

    /* compiled from: MeasureScope.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return measureScope.layout(i, i2, map, function1);
    }

    default MeasureResult layout(final int width, final int height, final Map alignmentLines, final Function1 placementBlock) {
        Intrinsics.checkNotNullParameter(alignmentLines, "alignmentLines");
        Intrinsics.checkNotNullParameter(placementBlock, "placementBlock");
        return new MeasureResult(width, height, alignmentLines, this, placementBlock) { // from class: androidx.compose.ui.layout.MeasureScope$layout$1
            final /* synthetic */ Function1 $placementBlock;
            final /* synthetic */ int $width;
            private final Map alignmentLines;
            private final int height;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            {
                this.$width = width;
                this.this$0 = this;
                this.$placementBlock = placementBlock;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                int parentWidth;
                LayoutDirection parentLayoutDirection;
                Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.INSTANCE;
                int i = this.$width;
                LayoutDirection layoutDirection = this.this$0.getLayoutDirection();
                Function1 function1 = this.$placementBlock;
                parentWidth = companion.getParentWidth();
                parentLayoutDirection = companion.getParentLayoutDirection();
                Placeable.PlacementScope.parentWidth = i;
                Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
                function1.invoke(companion);
                Placeable.PlacementScope.parentWidth = parentWidth;
                Placeable.PlacementScope.parentLayoutDirection = parentLayoutDirection;
            }
        };
    }
}
