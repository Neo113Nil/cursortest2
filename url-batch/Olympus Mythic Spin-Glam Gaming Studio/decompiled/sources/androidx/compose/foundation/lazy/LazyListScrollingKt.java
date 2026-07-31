package androidx.compose.foundation.lazy;

import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyListScrolling.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0017\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "TargetDistance", "F", "BoundDistance", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyListScrollingKt {
    private static final float TargetDistance = Dp.m2507constructorimpl(2500);
    private static final float BoundDistance = Dp.m2507constructorimpl(1500);

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListItemInfo doSmoothScrollToItem$getTargetItem(LazyListState lazyListState, int i) {
        Object obj;
        List visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = visibleItemsInfo.get(i2);
            if (((LazyListItemInfo) obj).getIndex() == i) {
                break;
            }
            i2++;
        }
        return (LazyListItemInfo) obj;
    }
}
