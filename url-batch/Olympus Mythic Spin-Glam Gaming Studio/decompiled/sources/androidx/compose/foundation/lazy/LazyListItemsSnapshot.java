package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.Lazy_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyListItemProviderImpl.kt */
@ExperimentalFoundationApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemsSnapshot;", "", "intervals", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "headerIndexes", "", "", "nearestItemsRange", "Lkotlin/ranges/IntRange;", "(Landroidx/compose/foundation/lazy/layout/IntervalList;Ljava/util/List;Lkotlin/ranges/IntRange;)V", "getHeaderIndexes", "()Ljava/util/List;", "itemsCount", "getItemsCount", "()I", "keyToIndexMap", "", "getKeyToIndexMap", "()Ljava/util/Map;", "Item", "", "scope", "Landroidx/compose/foundation/lazy/LazyItemScope;", "index", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "getContentType", "getKey", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LazyListItemsSnapshot {
    private final List headerIndexes;
    private final IntervalList intervals;
    private final Map keyToIndexMap;

    public LazyListItemsSnapshot(IntervalList intervals, List headerIndexes, IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(headerIndexes, "headerIndexes");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.intervals = intervals;
        this.headerIndexes = headerIndexes;
        this.keyToIndexMap = LazyListItemProviderImplKt.generateKeyToIndexMap(nearestItemsRange, intervals);
    }

    public final List getHeaderIndexes() {
        return this.headerIndexes;
    }

    public final int getItemsCount() {
        return this.intervals.getSize();
    }

    public final Object getKey(int index) {
        IntervalList.Interval interval = this.intervals.get(index);
        int startIndex = index - interval.getStartIndex();
        Function1 key = ((LazyListIntervalContent) interval.getValue()).getKey();
        Object invoke = key != null ? key.invoke(Integer.valueOf(startIndex)) : null;
        return invoke == null ? Lazy_androidKt.getDefaultLazyLayoutKey(index) : invoke;
    }

    public final void Item(final LazyItemScope scope, final int i, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Composer startRestartGroup = composer.startRestartGroup(1922528915);
        IntervalList.Interval interval = this.intervals.get(i);
        ((LazyListIntervalContent) interval.getValue()).getItem().invoke(scope, Integer.valueOf(i - interval.getStartIndex()), startRestartGroup, Integer.valueOf(i2 & 14));
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.foundation.lazy.LazyListItemsSnapshot$Item$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i3) {
                LazyListItemsSnapshot.this.Item(scope, i, composer2, i2 | 1);
            }
        });
    }

    public final Map getKeyToIndexMap() {
        return this.keyToIndexMap;
    }

    public final Object getContentType(int index) {
        IntervalList.Interval interval = this.intervals.get(index);
        return ((LazyListIntervalContent) interval.getValue()).getType().invoke(Integer.valueOf(index - interval.getStartIndex()));
    }
}
