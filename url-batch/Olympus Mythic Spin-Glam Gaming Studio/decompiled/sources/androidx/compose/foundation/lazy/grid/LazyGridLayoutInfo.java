package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridLayoutInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000b\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "visibleItemsInfo", "", "getTotalItemsCount", "()I", "totalItemsCount", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/EmptyLazyGridLayoutInfo;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LazyGridLayoutInfo {
    int getTotalItemsCount();

    List getVisibleItemsInfo();
}
