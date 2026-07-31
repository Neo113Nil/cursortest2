package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: LazyListScopeImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScopeImpl;", "Landroidx/compose/foundation/lazy/LazyListScope;", "<init>", "()V", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "_intervals", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "getIntervals", "()Landroidx/compose/foundation/lazy/layout/IntervalList;", "", "", "_headerIndexes", "Ljava/util/List;", "", "getHeaderIndexes", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LazyListScopeImpl implements LazyListScope {
    private List _headerIndexes;
    private final MutableIntervalList _intervals;
    private final IntervalList intervals;

    public LazyListScopeImpl() {
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        this._intervals = mutableIntervalList;
        this.intervals = mutableIntervalList;
    }

    public final IntervalList getIntervals() {
        return this.intervals;
    }

    public final List getHeaderIndexes() {
        List list = this._headerIndexes;
        return list == null ? CollectionsKt.emptyList() : list;
    }
}
