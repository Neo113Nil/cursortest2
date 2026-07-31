package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridScrolling.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "visibleItems", "", "isVertical", "", "calculateLineAverageMainAxisSize", "(Ljava/util/List;Z)I", "Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LazyGridScrollingKt {
    private static final float TargetDistance = Dp.m2507constructorimpl(2500);
    private static final float BoundDistance = Dp.m2507constructorimpl(1500);

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridItemInfo doSmoothScrollToItem$getTargetItem(LazyGridState lazyGridState, int i) {
        Object obj;
        List visibleItemsInfo = lazyGridState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = visibleItemsInfo.get(i2);
            if (((LazyGridItemInfo) obj).getIndex() == i) {
                break;
            }
            i2++;
        }
        return (LazyGridItemInfo) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateLineAverageMainAxisSize(final List list, final boolean z) {
        int m2567getWidthimpl;
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            @NotNull
            public final Integer invoke(int i) {
                return Integer.valueOf(z ? list.get(i).getRow() : list.get(i).getColumn());
            }
        };
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < list.size()) {
            int intValue = ((Number) function1.invoke(Integer.valueOf(i))).intValue();
            if (intValue == -1) {
                i++;
            } else {
                int i4 = 0;
                while (i < list.size() && ((Number) function1.invoke(Integer.valueOf(i))).intValue() == intValue) {
                    if (z) {
                        m2567getWidthimpl = IntSize.m2566getHeightimpl(((LazyGridItemInfo) list.get(i)).getSize());
                    } else {
                        m2567getWidthimpl = IntSize.m2567getWidthimpl(((LazyGridItemInfo) list.get(i)).getSize());
                    }
                    i4 = Math.max(i4, m2567getWidthimpl);
                    i++;
                }
                i2 += i4;
                i3++;
            }
        }
        return i2 / i3;
    }
}
