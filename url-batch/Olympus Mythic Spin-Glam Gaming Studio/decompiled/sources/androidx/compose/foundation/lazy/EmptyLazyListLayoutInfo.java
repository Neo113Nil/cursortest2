package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntSize;
import com.ironsource.X3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: LazyListState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/EmptyLazyListLayoutInfo;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "<init>", "()V", "", "Landroidx/compose/foundation/lazy/LazyListItemInfo;", "visibleItemsInfo", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "", "totalItemsCount", "I", "getTotalItemsCount", "()I", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "J", "getViewportSize-YbymL2g", "()J", "Landroidx/compose/foundation/gestures/Orientation;", X3.i.n, "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EmptyLazyListLayoutInfo implements LazyListLayoutInfo {
    private static final int totalItemsCount = 0;
    public static final EmptyLazyListLayoutInfo INSTANCE = new EmptyLazyListLayoutInfo();
    private static final List visibleItemsInfo = CollectionsKt.emptyList();
    private static final long viewportSize = IntSize.INSTANCE.m2571getZeroYbymL2g();
    private static final Orientation orientation = Orientation.Vertical;

    private EmptyLazyListLayoutInfo() {
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List getVisibleItemsInfo() {
        return visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return totalItemsCount;
    }
}
