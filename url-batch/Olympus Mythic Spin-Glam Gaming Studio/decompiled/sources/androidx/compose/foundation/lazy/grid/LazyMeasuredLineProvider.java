package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyMeasuredLineProvider.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR/\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e0\u001d8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider;", "", "", "isVertical", "", "", "slotSizesSums", "crossAxisSpacing", "gridItemsCount", "spaceBetweenLines", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "spanLayoutProvider", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "measuredLineFactory", "<init>", "(ZLjava/util/List;IIILandroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;)V", "Landroidx/compose/foundation/lazy/grid/LineIndex;", "lineIndex", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "getAndMeasure-bKFJvoY", "(I)Landroidx/compose/foundation/lazy/grid/LazyMeasuredLine;", "getAndMeasure", "Z", "I", "Landroidx/compose/foundation/lazy/grid/LazyMeasuredItemProvider;", "Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "Landroidx/compose/foundation/lazy/grid/MeasuredLineFactory;", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "Lkotlin/jvm/functions/Function2;", "getChildConstraints$foundation_release", "()Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LazyMeasuredLineProvider {
    private final Function2 childConstraints;
    private final int gridItemsCount;
    private final boolean isVertical;
    private final LazyMeasuredItemProvider measuredItemProvider;
    private final MeasuredLineFactory measuredLineFactory;
    private final int spaceBetweenLines;
    private final LazyGridSpanLayoutProvider spanLayoutProvider;

    public LazyMeasuredLineProvider(boolean z, final List slotSizesSums, final int i, int i2, int i3, LazyMeasuredItemProvider measuredItemProvider, LazyGridSpanLayoutProvider spanLayoutProvider, MeasuredLineFactory measuredLineFactory) {
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(measuredItemProvider, "measuredItemProvider");
        Intrinsics.checkNotNullParameter(spanLayoutProvider, "spanLayoutProvider");
        Intrinsics.checkNotNullParameter(measuredLineFactory, "measuredLineFactory");
        this.isVertical = z;
        this.gridItemsCount = i2;
        this.spaceBetweenLines = i3;
        this.measuredItemProvider = measuredItemProvider;
        this.spanLayoutProvider = spanLayoutProvider;
        this.measuredLineFactory = measuredLineFactory;
        this.childConstraints = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyMeasuredLineProvider$childConstraints$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return Constraints.m2475boximpl(m482invokeJhjzzOo(((Number) obj).intValue(), ((Number) obj2).intValue()));
            }

            /* renamed from: invoke-JhjzzOo, reason: not valid java name */
            public final long m482invokeJhjzzOo(int i4, int i5) {
                boolean z2;
                int intValue = (slotSizesSums.get((i4 + i5) - 1).intValue() - (i4 == 0 ? 0 : slotSizesSums.get(i4 - 1).intValue())) + (i * (i5 - 1));
                z2 = this.isVertical;
                if (z2) {
                    return Constraints.INSTANCE.m2497fixedWidthOenEA2s(intValue);
                }
                return Constraints.INSTANCE.m2496fixedHeightOenEA2s(intValue);
            }
        };
    }

    /* renamed from: getChildConstraints$foundation_release, reason: from getter */
    public final Function2 getChildConstraints() {
        return this.childConstraints;
    }

    /* renamed from: getAndMeasure-bKFJvoY, reason: not valid java name */
    public final LazyMeasuredLine m481getAndMeasurebKFJvoY(int lineIndex) {
        LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = this.spanLayoutProvider.getLineConfiguration(lineIndex);
        int size = lineConfiguration.getSpans().size();
        int i = (size == 0 || lineConfiguration.getFirstItemIndex() + size == this.gridItemsCount) ? 0 : this.spaceBetweenLines;
        LazyMeasuredItem[] lazyMeasuredItemArr = new LazyMeasuredItem[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int m434getCurrentLineSpanimpl = GridItemSpan.m434getCurrentLineSpanimpl(((GridItemSpan) lineConfiguration.getSpans().get(i3)).getPackedValue());
            LazyMeasuredItem m479getAndMeasureednRnyU = this.measuredItemProvider.m479getAndMeasureednRnyU(ItemIndex.m439constructorimpl(lineConfiguration.getFirstItemIndex() + i3), i, ((Constraints) this.childConstraints.invoke(Integer.valueOf(i2), Integer.valueOf(m434getCurrentLineSpanimpl))).getValue());
            i2 += m434getCurrentLineSpanimpl;
            Unit unit = Unit.INSTANCE;
            lazyMeasuredItemArr[i3] = m479getAndMeasureednRnyU;
        }
        return this.measuredLineFactory.mo463createLineH9FfpSk(lineIndex, lazyMeasuredItemArr, lineConfiguration.getSpans(), i);
    }
}
