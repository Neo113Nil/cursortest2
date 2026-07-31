package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListItemProviderImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0018\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "content", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "rememberItemProvider", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/LazyListItemProvider;", "Lkotlin/ranges/IntRange;", "range", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "Landroidx/compose/foundation/lazy/LazyListIntervalContent;", "list", "", "", "", "generateKeyToIndexMap", "(Lkotlin/ranges/IntRange;Landroidx/compose/foundation/lazy/layout/IntervalList;)Ljava/util/Map;", "firstVisibleItem", "calculateNearestItemsRange", "(I)Lkotlin/ranges/IntRange;", "VisibleItemsSlidingWindowSize", "I", "ExtraItemsNearTheSlidingWindow", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListItemProviderImplKt {
    private static final int ExtraItemsNearTheSlidingWindow = 100;
    private static final int VisibleItemsSlidingWindowSize = 30;

    public static final LazyListItemProvider rememberItemProvider(LazyListState state, Function1 content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-619676707);
        final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(state);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Snapshot createNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
            try {
                Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                try {
                    IntRange calculateNearestItemsRange = calculateNearestItemsRange(state.getFirstVisibleItemIndex());
                    createNonObservableSnapshot.dispose();
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(calculateNearestItemsRange, null, 2, null);
                    composer.updateRememberedValue(rememberedValue);
                } finally {
                    createNonObservableSnapshot.restoreCurrent(makeCurrent);
                }
            } catch (Throwable th) {
                createNonObservableSnapshot.dispose();
                throw th;
            }
        }
        composer.endReplaceableGroup();
        final MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(mutableState, new LazyListItemProviderImplKt$rememberItemProvider$1(state, mutableState, null), composer, 0);
        composer.startReplaceableGroup(1157296644);
        boolean changed2 = composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new LazyListItemProviderImpl(SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImplKt$rememberItemProvider$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final LazyListItemsSnapshot mo4828invoke() {
                    LazyListScopeImpl lazyListScopeImpl = new LazyListScopeImpl();
                    ((Function1) rememberUpdatedState.getValue()).invoke(lazyListScopeImpl);
                    return new LazyListItemsSnapshot(lazyListScopeImpl.getIntervals(), lazyListScopeImpl.getHeaderIndexes(), (IntRange) mutableState.getValue());
                }
            }));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        LazyListItemProviderImpl lazyListItemProviderImpl = (LazyListItemProviderImpl) rememberedValue2;
        composer.endReplaceableGroup();
        return lazyListItemProviderImpl;
    }

    public static final Map generateKeyToIndexMap(IntRange range, IntervalList list) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(list, "list");
        final int first = range.getFirst();
        if (first < 0) {
            throw new IllegalStateException("Check failed.");
        }
        final int min = Math.min(range.getLast(), list.getSize() - 1);
        if (min < first) {
            return MapsKt.emptyMap();
        }
        final HashMap hashMap = new HashMap();
        list.forEach(first, min, new Function1() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImplKt$generateKeyToIndexMap$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((IntervalList.Interval<LazyListIntervalContent>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull IntervalList.Interval<LazyListIntervalContent> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (((LazyListIntervalContent) it.getValue()).getKey() == null) {
                    return;
                }
                Function1 key = ((LazyListIntervalContent) it.getValue()).getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int max = Math.max(first, it.getStartIndex());
                int min2 = Math.min(min, (it.getStartIndex() + it.getSize()) - 1);
                if (max > min2) {
                    return;
                }
                while (true) {
                    hashMap.put(key.invoke(Integer.valueOf(max - it.getStartIndex())), Integer.valueOf(max));
                    if (max == min2) {
                        return;
                    } else {
                        max++;
                    }
                }
            }
        });
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange calculateNearestItemsRange(int i) {
        int i2 = VisibleItemsSlidingWindowSize;
        int i3 = (i / i2) * i2;
        int i4 = ExtraItemsNearTheSlidingWindow;
        return RangesKt.until(Math.max(i3 - i4, 0), i3 + i2 + i4);
    }
}
