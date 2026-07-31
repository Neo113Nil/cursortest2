package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.yandex.div.core.timer.TimerController;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyListItemPlacementAnimator.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J[\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J;\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J<\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00052\f\u00101\u001a\b\u0012\u0004\u0012\u00020!022\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020-J\u0018\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\fH\u0002J\"\u00109\u001a\u00020\t*\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010:\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\tH\u0002J\u001c\u0010;\u001a\u00020\u0014*\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b<\u0010=R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\t*\u00020\u00148BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "isVertical", "", "(Lkotlinx/coroutines/CoroutineScope;Z)V", "keyToIndexMap", "", "", "keyToItemInfoMap", "", "Landroidx/compose/foundation/lazy/ItemInfo;", "positionedKeys", "", "viewportEndItemIndex", "viewportEndItemNotVisiblePartSize", "viewportStartItemIndex", "viewportStartItemNotVisiblePartSize", "mainAxis", "Landroidx/compose/ui/unit/IntOffset;", "getMainAxis--gyyYBs", "(J)I", "calculateExpectedOffset", "index", "sizeWithSpacings", "averageItemsSize", "scrolledBy", "reverseLayout", "mainAxisLayoutSize", "fallback", "visibleItems", "", "Landroidx/compose/foundation/lazy/LazyListPositionedItem;", "calculateExpectedOffset-diAxcj4", "(IIIJZIILjava/util/List;)I", "getAnimatedOffset", "key", "placeableIndex", "minOffset", "maxOffset", "rawOffset", "getAnimatedOffset-YT5a7pE", "(Ljava/lang/Object;IIIJ)J", "onMeasured", "", "consumedScroll", "layoutWidth", "layoutHeight", "positionedItems", "", "itemProvider", "Landroidx/compose/foundation/lazy/LazyMeasuredItemProvider;", TimerController.RESET_COMMAND, "startAnimationsIfNeeded", "item", "itemInfo", "getItemSize", "itemIndex", "toOffset", "toOffset-Bjo55l4", "(I)J", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LazyListItemPlacementAnimator {
    private final boolean isVertical;
    private Map keyToIndexMap;
    private final Map keyToItemInfoMap;
    private final Set positionedKeys;
    private final CoroutineScope scope;
    private int viewportEndItemIndex;
    private int viewportEndItemNotVisiblePartSize;
    private int viewportStartItemIndex;
    private int viewportStartItemNotVisiblePartSize;

    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, boolean reverseLayout, List positionedItems, LazyMeasuredItemProvider itemProvider) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        ItemInfo itemInfo;
        LazyListPositionedItem lazyListPositionedItem;
        int m410calculateExpectedOffsetdiAxcj4;
        LazyMeasuredItemProvider itemProvider2 = itemProvider;
        Intrinsics.checkNotNullParameter(positionedItems, "positionedItems");
        Intrinsics.checkNotNullParameter(itemProvider2, "itemProvider");
        int size = positionedItems.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            if (((LazyListPositionedItem) positionedItems.get(i4)).getHasAnimations()) {
                int i5 = this.isVertical ? layoutHeight : layoutWidth;
                long m412toOffsetBjo55l4 = m412toOffsetBjo55l4(reverseLayout ? -consumedScroll : consumedScroll);
                LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) CollectionsKt.first(positionedItems);
                LazyListPositionedItem lazyListPositionedItem3 = (LazyListPositionedItem) CollectionsKt.last(positionedItems);
                int size2 = positionedItems.size();
                int i6 = i3;
                int i7 = i6;
                while (i6 < size2) {
                    LazyListPositionedItem lazyListPositionedItem4 = (LazyListPositionedItem) positionedItems.get(i6);
                    ItemInfo itemInfo2 = (ItemInfo) this.keyToItemInfoMap.get(lazyListPositionedItem4.getKey());
                    if (itemInfo2 != null) {
                        itemInfo2.setIndex(lazyListPositionedItem4.getIndex());
                    }
                    i7 += lazyListPositionedItem4.getSizeWithSpacings();
                    i6++;
                }
                int size3 = i7 / positionedItems.size();
                this.positionedKeys.clear();
                int size4 = positionedItems.size();
                int i8 = i3;
                while (i8 < size4) {
                    LazyListPositionedItem lazyListPositionedItem5 = (LazyListPositionedItem) positionedItems.get(i8);
                    this.positionedKeys.add(lazyListPositionedItem5.getKey());
                    ItemInfo itemInfo3 = (ItemInfo) this.keyToItemInfoMap.get(lazyListPositionedItem5.getKey());
                    if (itemInfo3 != null) {
                        i = i8;
                        i2 = size4;
                        if (lazyListPositionedItem5.getHasAnimations()) {
                            long notAnimatableDelta = itemInfo3.getNotAnimatableDelta();
                            itemInfo3.m403setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(notAnimatableDelta) + IntOffset.m2553getXimpl(m412toOffsetBjo55l4), IntOffset.m2554getYimpl(notAnimatableDelta) + IntOffset.m2554getYimpl(m412toOffsetBjo55l4)));
                            startAnimationsIfNeeded(lazyListPositionedItem5, itemInfo3);
                        } else {
                            this.keyToItemInfoMap.remove(lazyListPositionedItem5.getKey());
                        }
                    } else if (lazyListPositionedItem5.getHasAnimations()) {
                        ItemInfo itemInfo4 = new ItemInfo(lazyListPositionedItem5.getIndex());
                        Integer num = (Integer) this.keyToIndexMap.get(lazyListPositionedItem5.getKey());
                        long m418getOffsetBjo55l4 = lazyListPositionedItem5.m418getOffsetBjo55l4(i3);
                        int mainAxisSize = lazyListPositionedItem5.getMainAxisSize(i3);
                        if (num == null) {
                            m410calculateExpectedOffsetdiAxcj4 = m411getMainAxisgyyYBs(m418getOffsetBjo55l4);
                            j = m418getOffsetBjo55l4;
                            itemInfo = itemInfo4;
                            lazyListPositionedItem = lazyListPositionedItem5;
                            i = i8;
                            i2 = size4;
                        } else {
                            j = m418getOffsetBjo55l4;
                            itemInfo = itemInfo4;
                            lazyListPositionedItem = lazyListPositionedItem5;
                            i = i8;
                            i2 = size4;
                            m410calculateExpectedOffsetdiAxcj4 = m410calculateExpectedOffsetdiAxcj4(num.intValue(), lazyListPositionedItem5.getSizeWithSpacings(), size3, m412toOffsetBjo55l4, reverseLayout, i5, !reverseLayout ? m411getMainAxisgyyYBs(m418getOffsetBjo55l4) : (m411getMainAxisgyyYBs(m418getOffsetBjo55l4) - lazyListPositionedItem5.getSizeWithSpacings()) + mainAxisSize, positionedItems) + (reverseLayout ? lazyListPositionedItem.getSize() - mainAxisSize : i3);
                        }
                        long m2550copyiSbpLlY$default = this.isVertical ? IntOffset.m2550copyiSbpLlY$default(j, 0, m410calculateExpectedOffsetdiAxcj4, 1, null) : IntOffset.m2550copyiSbpLlY$default(j, m410calculateExpectedOffsetdiAxcj4, 0, 2, null);
                        int placeablesCount = lazyListPositionedItem.getPlaceablesCount();
                        for (int i9 = i3; i9 < placeablesCount; i9++) {
                            LazyListPositionedItem lazyListPositionedItem6 = lazyListPositionedItem;
                            long m418getOffsetBjo55l42 = lazyListPositionedItem6.m418getOffsetBjo55l4(i9);
                            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(m418getOffsetBjo55l42) - IntOffset.m2553getXimpl(j), IntOffset.m2554getYimpl(m418getOffsetBjo55l42) - IntOffset.m2554getYimpl(j));
                            itemInfo.getPlaceables().add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(m2550copyiSbpLlY$default) + IntOffset.m2553getXimpl(IntOffset), IntOffset.m2554getYimpl(m2550copyiSbpLlY$default) + IntOffset.m2554getYimpl(IntOffset)), lazyListPositionedItem6.getMainAxisSize(i9), null));
                            Unit unit = Unit.INSTANCE;
                        }
                        LazyListPositionedItem lazyListPositionedItem7 = lazyListPositionedItem;
                        ItemInfo itemInfo5 = itemInfo;
                        this.keyToItemInfoMap.put(lazyListPositionedItem7.getKey(), itemInfo5);
                        startAnimationsIfNeeded(lazyListPositionedItem7, itemInfo5);
                    } else {
                        i = i8;
                        i2 = size4;
                    }
                    i8 = i + 1;
                    size4 = i2;
                    i3 = 0;
                }
                if (reverseLayout) {
                    this.viewportStartItemIndex = lazyListPositionedItem3.getIndex();
                    this.viewportStartItemNotVisiblePartSize = (i5 - lazyListPositionedItem3.getOffset()) - lazyListPositionedItem3.getSize();
                    this.viewportEndItemIndex = lazyListPositionedItem2.getIndex();
                    this.viewportEndItemNotVisiblePartSize = (-lazyListPositionedItem2.getOffset()) + (lazyListPositionedItem2.getSizeWithSpacings() - lazyListPositionedItem2.getSize());
                } else {
                    this.viewportStartItemIndex = lazyListPositionedItem2.getIndex();
                    this.viewportStartItemNotVisiblePartSize = lazyListPositionedItem2.getOffset();
                    this.viewportEndItemIndex = lazyListPositionedItem3.getIndex();
                    this.viewportEndItemNotVisiblePartSize = (lazyListPositionedItem3.getOffset() + lazyListPositionedItem3.getSizeWithSpacings()) - i5;
                }
                Iterator it = this.keyToItemInfoMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (this.positionedKeys.contains(entry.getKey())) {
                        itemProvider2 = itemProvider;
                    } else {
                        ItemInfo itemInfo6 = (ItemInfo) entry.getValue();
                        long notAnimatableDelta2 = itemInfo6.getNotAnimatableDelta();
                        itemInfo6.m403setNotAnimatableDeltagyyYBs(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(notAnimatableDelta2) + IntOffset.m2553getXimpl(m412toOffsetBjo55l4), IntOffset.m2554getYimpl(notAnimatableDelta2) + IntOffset.m2554getYimpl(m412toOffsetBjo55l4)));
                        Integer num2 = (Integer) itemProvider.getKeyToIndexMap().get(entry.getKey());
                        List placeables = itemInfo6.getPlaceables();
                        int size5 = placeables.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size5) {
                                z = false;
                                break;
                            }
                            PlaceableInfo placeableInfo = (PlaceableInfo) placeables.get(i10);
                            long targetOffset = placeableInfo.getTargetOffset();
                            long notAnimatableDelta3 = itemInfo6.getNotAnimatableDelta();
                            long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(targetOffset) + IntOffset.m2553getXimpl(notAnimatableDelta3), IntOffset.m2554getYimpl(targetOffset) + IntOffset.m2554getYimpl(notAnimatableDelta3));
                            if (m411getMainAxisgyyYBs(IntOffset2) + placeableInfo.getSize() > 0 && m411getMainAxisgyyYBs(IntOffset2) < i5) {
                                z = true;
                                break;
                            }
                            i10++;
                        }
                        List placeables2 = itemInfo6.getPlaceables();
                        int size6 = placeables2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size6) {
                                z2 = false;
                                break;
                            } else {
                                if (((PlaceableInfo) placeables2.get(i11)).getInProgress()) {
                                    z2 = true;
                                    break;
                                }
                                i11++;
                            }
                        }
                        if (!(z || z2) || num2 == null || itemInfo6.getPlaceables().isEmpty()) {
                            it.remove();
                        } else {
                            LazyMeasuredItem m427getAndMeasureZjPyQlc = itemProvider2.m427getAndMeasureZjPyQlc(DataIndex.m396constructorimpl(num2.intValue()));
                            int m410calculateExpectedOffsetdiAxcj42 = m410calculateExpectedOffsetdiAxcj4(num2.intValue(), m427getAndMeasureZjPyQlc.getSizeWithSpacings(), size3, m412toOffsetBjo55l4, reverseLayout, i5, i5, positionedItems);
                            if (reverseLayout) {
                                m410calculateExpectedOffsetdiAxcj42 = (i5 - m410calculateExpectedOffsetdiAxcj42) - m427getAndMeasureZjPyQlc.getSize();
                            }
                            LazyListPositionedItem position = m427getAndMeasureZjPyQlc.position(m410calculateExpectedOffsetdiAxcj42, layoutWidth, layoutHeight);
                            positionedItems.add(position);
                            startAnimationsIfNeeded(position, itemInfo6);
                        }
                        itemProvider2 = itemProvider;
                    }
                }
                this.keyToIndexMap = itemProvider.getKeyToIndexMap();
                return;
            }
            i4++;
            itemProvider2 = itemProvider;
            i3 = 0;
        }
        reset();
    }

    public LazyListItemPlacementAnimator(CoroutineScope scope, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.isVertical = z;
        this.keyToItemInfoMap = new LinkedHashMap();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.viewportStartItemIndex = -1;
        this.viewportEndItemIndex = -1;
        this.positionedKeys = new LinkedHashSet();
    }

    /* renamed from: getAnimatedOffset-YT5a7pE, reason: not valid java name */
    public final long m413getAnimatedOffsetYT5a7pE(Object key, int placeableIndex, int minOffset, int maxOffset, long rawOffset) {
        Intrinsics.checkNotNullParameter(key, "key");
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.get(key);
        if (itemInfo == null) {
            return rawOffset;
        }
        PlaceableInfo placeableInfo = (PlaceableInfo) itemInfo.getPlaceables().get(placeableIndex);
        long packedValue = ((IntOffset) placeableInfo.getAnimatedOffset().getValue()).getPackedValue();
        long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
        long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(packedValue) + IntOffset.m2553getXimpl(notAnimatableDelta), IntOffset.m2554getYimpl(packedValue) + IntOffset.m2554getYimpl(notAnimatableDelta));
        long targetOffset = placeableInfo.getTargetOffset();
        long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
        long IntOffset2 = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(targetOffset) + IntOffset.m2553getXimpl(notAnimatableDelta2), IntOffset.m2554getYimpl(targetOffset) + IntOffset.m2554getYimpl(notAnimatableDelta2));
        if (placeableInfo.getInProgress() && ((m411getMainAxisgyyYBs(IntOffset2) < minOffset && m411getMainAxisgyyYBs(IntOffset) < minOffset) || (m411getMainAxisgyyYBs(IntOffset2) > maxOffset && m411getMainAxisgyyYBs(IntOffset) > maxOffset))) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyListItemPlacementAnimator$getAnimatedOffset$1(placeableInfo, null), 3, null);
        }
        return IntOffset;
    }

    public final void reset() {
        this.keyToItemInfoMap.clear();
        this.keyToIndexMap = MapsKt.emptyMap();
        this.viewportStartItemIndex = -1;
        this.viewportStartItemNotVisiblePartSize = 0;
        this.viewportEndItemIndex = -1;
        this.viewportEndItemNotVisiblePartSize = 0;
    }

    /* renamed from: calculateExpectedOffset-diAxcj4, reason: not valid java name */
    private final int m410calculateExpectedOffsetdiAxcj4(int index, int sizeWithSpacings, int averageItemsSize, long scrolledBy, boolean reverseLayout, int mainAxisLayoutSize, int fallback, List visibleItems) {
        IntRange until;
        IntRange until2;
        int i = 0;
        int i2 = this.viewportEndItemIndex;
        boolean z = reverseLayout ? i2 > index : i2 < index;
        int i3 = this.viewportStartItemIndex;
        boolean z2 = reverseLayout ? i3 < index : i3 > index;
        if (z) {
            if (!reverseLayout) {
                until2 = RangesKt.until(this.viewportEndItemIndex + 1, index);
            } else {
                until2 = RangesKt.until(index + 1, this.viewportEndItemIndex);
            }
            int first = until2.getFirst();
            int last = until2.getLast();
            if (first <= last) {
                while (true) {
                    i += getItemSize(visibleItems, first, averageItemsSize);
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            return mainAxisLayoutSize + this.viewportEndItemNotVisiblePartSize + i + m411getMainAxisgyyYBs(scrolledBy);
        }
        if (!z2) {
            return fallback;
        }
        if (!reverseLayout) {
            until = RangesKt.until(index + 1, this.viewportStartItemIndex);
        } else {
            until = RangesKt.until(this.viewportStartItemIndex + 1, index);
        }
        int first2 = until.getFirst();
        int last2 = until.getLast();
        if (first2 <= last2) {
            while (true) {
                sizeWithSpacings += getItemSize(visibleItems, first2, averageItemsSize);
                if (first2 == last2) {
                    break;
                }
                first2++;
            }
        }
        return (this.viewportStartItemNotVisiblePartSize - sizeWithSpacings) + m411getMainAxisgyyYBs(scrolledBy);
    }

    private final int getItemSize(List list, int i, int i2) {
        if (!list.isEmpty() && i >= ((LazyListPositionedItem) CollectionsKt.first(list)).getIndex() && i <= ((LazyListPositionedItem) CollectionsKt.last(list)).getIndex()) {
            if (i - ((LazyListPositionedItem) CollectionsKt.first(list)).getIndex() < ((LazyListPositionedItem) CollectionsKt.last(list)).getIndex() - i) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    LazyListPositionedItem lazyListPositionedItem = (LazyListPositionedItem) list.get(i3);
                    if (lazyListPositionedItem.getIndex() == i) {
                        return lazyListPositionedItem.getSizeWithSpacings();
                    }
                    if (lazyListPositionedItem.getIndex() > i) {
                        break;
                    }
                }
            } else {
                for (int lastIndex = CollectionsKt.getLastIndex(list); -1 < lastIndex; lastIndex--) {
                    LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem) list.get(lastIndex);
                    if (lazyListPositionedItem2.getIndex() == i) {
                        return lazyListPositionedItem2.getSizeWithSpacings();
                    }
                    if (lazyListPositionedItem2.getIndex() < i) {
                        break;
                    }
                }
            }
        }
        return i2;
    }

    private final void startAnimationsIfNeeded(LazyListPositionedItem item, ItemInfo itemInfo) {
        while (itemInfo.getPlaceables().size() > item.getPlaceablesCount()) {
            CollectionsKt.removeLast(itemInfo.getPlaceables());
        }
        while (true) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (itemInfo.getPlaceables().size() >= item.getPlaceablesCount()) {
                break;
            }
            int size = itemInfo.getPlaceables().size();
            long m418getOffsetBjo55l4 = item.m418getOffsetBjo55l4(size);
            List placeables = itemInfo.getPlaceables();
            long notAnimatableDelta = itemInfo.getNotAnimatableDelta();
            placeables.add(new PlaceableInfo(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(m418getOffsetBjo55l4) - IntOffset.m2553getXimpl(notAnimatableDelta), IntOffset.m2554getYimpl(m418getOffsetBjo55l4) - IntOffset.m2554getYimpl(notAnimatableDelta)), item.getMainAxisSize(size), defaultConstructorMarker));
        }
        List placeables2 = itemInfo.getPlaceables();
        int size2 = placeables2.size();
        for (int i = 0; i < size2; i++) {
            PlaceableInfo placeableInfo = (PlaceableInfo) placeables2.get(i);
            long targetOffset = placeableInfo.getTargetOffset();
            long notAnimatableDelta2 = itemInfo.getNotAnimatableDelta();
            long IntOffset = IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(targetOffset) + IntOffset.m2553getXimpl(notAnimatableDelta2), IntOffset.m2554getYimpl(targetOffset) + IntOffset.m2554getYimpl(notAnimatableDelta2));
            long m418getOffsetBjo55l42 = item.m418getOffsetBjo55l4(i);
            placeableInfo.setSize(item.getMainAxisSize(i));
            FiniteAnimationSpec animationSpec = item.getAnimationSpec(i);
            if (!IntOffset.m2552equalsimpl0(IntOffset, m418getOffsetBjo55l42)) {
                long notAnimatableDelta3 = itemInfo.getNotAnimatableDelta();
                placeableInfo.m430setTargetOffsetgyyYBs(IntOffsetKt.IntOffset(IntOffset.m2553getXimpl(m418getOffsetBjo55l42) - IntOffset.m2553getXimpl(notAnimatableDelta3), IntOffset.m2554getYimpl(m418getOffsetBjo55l42) - IntOffset.m2554getYimpl(notAnimatableDelta3)));
                if (animationSpec != null) {
                    placeableInfo.setInProgress(true);
                    BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new LazyListItemPlacementAnimator$startAnimationsIfNeeded$1$1(placeableInfo, animationSpec, null), 3, null);
                }
            }
        }
    }

    /* renamed from: toOffset-Bjo55l4, reason: not valid java name */
    private final long m412toOffsetBjo55l4(int i) {
        boolean z = this.isVertical;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        return IntOffsetKt.IntOffset(i2, i);
    }

    /* renamed from: getMainAxis--gyyYBs, reason: not valid java name */
    private final int m411getMainAxisgyyYBs(long j) {
        return this.isVertical ? IntOffset.m2554getYimpl(j) : IntOffset.m2553getXimpl(j);
    }
}
