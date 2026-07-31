package com.yandex.div.internal.widget.indicator;

import W1.m;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemPlacement;
import com.yandex.div.internal.widget.indicator.IndicatorParams$ItemSize;
import com.yandex.div.internal.widget.indicator.animations.IndicatorAnimator;
import com.yandex.div.internal.widget.indicator.forms.SingleIndicatorDrawer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.E;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import l2.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class IndicatorsStripDrawer {

    @NotNull
    private final IndicatorAnimator animator;
    private float baseYOffset;
    private float itemWidthMultiplier;
    private int itemsCount;
    private int maxVisibleCount;

    @NotNull
    private final IndicatorsRibbon ribbon;
    private float selectedItemFraction;
    private int selectedItemPosition;

    @NotNull
    private final SingleIndicatorDrawer singleIndicatorDrawer;
    private float spaceBetweenCenters;

    @NotNull
    private final IndicatorParams$Style styleParams;

    @NotNull
    private final View view;
    private int viewportHeight;
    private int viewportWidth;

    @Metadata
    private final class IndicatorsRibbon {

        @NotNull
        private final List<Indicator> allItems = new ArrayList();

        @NotNull
        private final List<Indicator> visibleItems = new ArrayList();

        public IndicatorsRibbon() {
        }

        private final float calcOffsetShiftFor(int i4, float f4) {
            float centerOffset;
            if (this.allItems.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return (IndicatorsStripDrawer.this.viewportWidth / 2.0f) - (((Indicator) CollectionsKt.last((List) this.allItems)).getRight() / 2);
            }
            float f5 = IndicatorsStripDrawer.this.viewportWidth / 2.0f;
            if (ViewsKt.isLayoutRtl(IndicatorsStripDrawer.this.view)) {
                if (i4 != -1) {
                    r2 = this.allItems.get((r1.size() - 1) - i4).getCenterOffset();
                }
                centerOffset = (f5 - r2) + (IndicatorsStripDrawer.this.spaceBetweenCenters * f4);
            } else {
                centerOffset = (f5 - (i4 != -1 ? this.allItems.get(i4).getCenterOffset() : 0.0f)) - (IndicatorsStripDrawer.this.spaceBetweenCenters * f4);
            }
            return IndicatorsStripDrawer.this.maxVisibleCount % 2 == 0 ? centerOffset + (IndicatorsStripDrawer.this.spaceBetweenCenters / 2) : centerOffset;
        }

        private final float calcScaleFraction(float f4) {
            float f5 = IndicatorsStripDrawer.this.spaceBetweenCenters + 0.0f;
            if (f4 > f5) {
                f4 = g.f(IndicatorsStripDrawer.this.viewportWidth - f4, f5);
            }
            if (f4 > f5) {
                return 1.0f;
            }
            return g.j(f4 / (f5 - 0.0f), 0.0f, 1.0f);
        }

        private final void downscaleAndDisperse(List<Indicator> list) {
            int i4;
            Indicator indicator;
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            int i5 = 0;
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Indicator indicator2 = (Indicator) obj;
                float calcScaleFraction = calcScaleFraction(indicator2.getCenterOffset());
                list.set(i6, (indicator2.getPosition() == 0 || indicator2.getPosition() == indicatorsStripDrawer.itemsCount + (-1) || indicator2.getActive()) ? Indicator.copy$default(indicator2, 0, false, 0.0f, null, calcScaleFraction, 15, null) : scaleItem(indicator2, calcScaleFraction));
                i6 = i7;
            }
            Iterator<Indicator> it = list.iterator();
            int i8 = 0;
            while (true) {
                i4 = -1;
                if (!it.hasNext()) {
                    i8 = -1;
                    break;
                } else if (it.next().getScaleFactor() == 1.0f) {
                    break;
                } else {
                    i8++;
                }
            }
            Integer valueOf = Integer.valueOf(i8);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                ListIterator<Indicator> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().getScaleFactor() == 1.0f) {
                            i4 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        break;
                    }
                }
                Integer valueOf2 = Integer.valueOf(i4);
                Integer num = valueOf2.intValue() >= 0 ? valueOf2 : null;
                if (num != null) {
                    int i9 = intValue - 1;
                    int intValue2 = num.intValue() + 1;
                    IndicatorsStripDrawer indicatorsStripDrawer2 = IndicatorsStripDrawer.this;
                    for (Object obj2 : list) {
                        int i10 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Indicator indicator3 = (Indicator) obj2;
                        if (i5 < i9) {
                            Indicator indicator4 = (Indicator) CollectionsKt.getOrNull(list, i9);
                            if (indicator4 != null) {
                                list.set(i5, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() - (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator4.getScaleFactor())), null, 0.0f, 27, null));
                            } else {
                                i5 = i10;
                            }
                        }
                        if (i5 > intValue2 && (indicator = (Indicator) CollectionsKt.getOrNull(list, intValue2)) != null) {
                            list.set(i5, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + (indicatorsStripDrawer2.spaceBetweenCenters * (1.0f - indicator.getScaleFactor())), null, 0.0f, 27, null));
                        }
                        i5 = i10;
                    }
                }
            }
        }

        private final List<Indicator> relayoutVisibleItems(int i4, float f4) {
            float calcOffsetShiftFor = calcOffsetShiftFor(i4, f4);
            List<Indicator> list = this.allItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Indicator indicator : list) {
                arrayList.add(Indicator.copy$default(indicator, 0, false, indicator.getCenterOffset() + calcOffsetShiftFor, null, 0.0f, 27, null));
            }
            List<Indicator> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            if (mutableList.size() <= IndicatorsStripDrawer.this.maxVisibleCount) {
                return mutableList;
            }
            b b4 = g.b(0.0f, IndicatorsStripDrawer.this.viewportWidth);
            int i5 = 0;
            if (b4.a(Float.valueOf(((Indicator) CollectionsKt.first((List) mutableList)).getLeft()))) {
                float f5 = -((Indicator) CollectionsKt.first((List) mutableList)).getLeft();
                for (Object obj : mutableList) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Indicator indicator2 = (Indicator) obj;
                    mutableList.set(i5, Indicator.copy$default(indicator2, 0, false, indicator2.getCenterOffset() + f5, null, 0.0f, 27, null));
                    i5 = i6;
                }
            } else if (b4.a(Float.valueOf(((Indicator) CollectionsKt.last((List) mutableList)).getRight()))) {
                float right = IndicatorsStripDrawer.this.viewportWidth - ((Indicator) CollectionsKt.last((List) mutableList)).getRight();
                for (Object obj2 : mutableList) {
                    int i7 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Indicator indicator3 = (Indicator) obj2;
                    mutableList.set(i5, Indicator.copy$default(indicator3, 0, false, indicator3.getCenterOffset() + right, null, 0.0f, 27, null));
                    i5 = i7;
                }
            }
            CollectionsKt.removeAll((List) mutableList, (Function1) new IndicatorsStripDrawer$IndicatorsRibbon$relayoutVisibleItems$3(b4));
            downscaleAndDisperse(mutableList);
            return mutableList;
        }

        private final Indicator scaleItem(Indicator indicator, float f4) {
            IndicatorParams$ItemSize itemSize = indicator.getItemSize();
            float width = itemSize.getWidth() * f4;
            if (width <= IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize().getWidth()) {
                return Indicator.copy$default(indicator, 0, false, 0.0f, IndicatorsStripDrawer.this.styleParams.getMinimumShape().getItemSize(), f4, 7, null);
            }
            if (width >= itemSize.getWidth()) {
                return indicator;
            }
            if (itemSize instanceof IndicatorParams$ItemSize.RoundedRect) {
                IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSize;
                return Indicator.copy$default(indicator, 0, false, 0.0f, IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, width, roundedRect.getItemHeight() * (width / roundedRect.getItemWidth()), 0.0f, 4, null), f4, 7, null);
            }
            if (itemSize instanceof IndicatorParams$ItemSize.Circle) {
                return Indicator.copy$default(indicator, 0, false, 0.0f, ((IndicatorParams$ItemSize.Circle) itemSize).copy((itemSize.getWidth() * f4) / 2.0f), f4, 7, null);
            }
            throw new m();
        }

        @NotNull
        public final List<Indicator> getVisibleItems() {
            return this.visibleItems;
        }

        public final void relayout(int i4, float f4) {
            this.allItems.clear();
            this.visibleItems.clear();
            if (IndicatorsStripDrawer.this.itemsCount <= 0) {
                return;
            }
            d indices = ViewsKt.getIndices(IndicatorsStripDrawer.this.view, 0, IndicatorsStripDrawer.this.itemsCount);
            int b4 = indices.b();
            IndicatorsStripDrawer indicatorsStripDrawer = IndicatorsStripDrawer.this;
            Iterator it = indices.iterator();
            while (it.hasNext()) {
                int a4 = ((E) it).a();
                IndicatorParams$ItemSize itemSizeAt = indicatorsStripDrawer.getItemSizeAt(a4);
                this.allItems.add(new Indicator(a4, a4 == i4, a4 == b4 ? itemSizeAt.getWidth() / 2.0f : ((Indicator) CollectionsKt.last((List) this.allItems)).getCenterOffset() + indicatorsStripDrawer.spaceBetweenCenters, itemSizeAt, 0.0f, 16, null));
            }
            this.visibleItems.addAll(relayoutVisibleItems(i4, f4));
        }
    }

    public IndicatorsStripDrawer(@NotNull IndicatorParams$Style styleParams, @NotNull SingleIndicatorDrawer singleIndicatorDrawer, @NotNull IndicatorAnimator animator, @NotNull View view) {
        Intrinsics.checkNotNullParameter(styleParams, "styleParams");
        Intrinsics.checkNotNullParameter(singleIndicatorDrawer, "singleIndicatorDrawer");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(view, "view");
        this.styleParams = styleParams;
        this.singleIndicatorDrawer = singleIndicatorDrawer;
        this.animator = animator;
        this.view = view;
        this.ribbon = new IndicatorsRibbon();
        this.baseYOffset = styleParams.getInactiveShape().getItemSize().getWidth();
        this.itemWidthMultiplier = 1.0f;
    }

    private final void adjustItemsPlacement() {
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            this.spaceBetweenCenters = ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters();
            this.itemWidthMultiplier = 1.0f;
        } else if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch) {
            IndicatorParams$ItemPlacement.Stretch stretch = (IndicatorParams$ItemPlacement.Stretch) itemsPlacement;
            float itemSpacing = (this.viewportWidth + stretch.getItemSpacing()) / this.maxVisibleCount;
            this.spaceBetweenCenters = itemSpacing;
            this.itemWidthMultiplier = (itemSpacing - stretch.getItemSpacing()) / this.styleParams.getActiveShape().getItemSize().getWidth();
        }
        this.animator.updateSpaceBetweenCenters(this.spaceBetweenCenters);
    }

    private final void adjustVisibleItems(int i4, float f4) {
        this.ribbon.relayout(i4, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorParams$ItemSize getItemSizeAt(int i4) {
        IndicatorParams$ItemSize itemSizeAt = this.animator.getItemSizeAt(i4);
        if (this.itemWidthMultiplier == 1.0f) {
            return itemSizeAt;
        }
        if (!(itemSizeAt instanceof IndicatorParams$ItemSize.RoundedRect)) {
            return itemSizeAt;
        }
        IndicatorParams$ItemSize.RoundedRect roundedRect = (IndicatorParams$ItemSize.RoundedRect) itemSizeAt;
        IndicatorParams$ItemSize.RoundedRect copy$default = IndicatorParams$ItemSize.RoundedRect.copy$default(roundedRect, roundedRect.getItemWidth() * this.itemWidthMultiplier, 0.0f, 0.0f, 6, null);
        this.animator.overrideItemWidth(copy$default.getItemWidth());
        return copy$default;
    }

    public final void calculateMaximumVisibleItems(int i4, int i5) {
        if (i4 == 0 || i5 == 0) {
            return;
        }
        this.viewportWidth = i4;
        this.viewportHeight = i5;
        calculateMaximumVisibleItems();
        adjustItemsPlacement();
        this.baseYOffset = i5 / 2.0f;
        adjustVisibleItems(this.selectedItemPosition, this.selectedItemFraction);
    }

    public final void onDraw(@NotNull Canvas canvas) {
        Object obj;
        RectF selectedItemRect;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        for (Indicator indicator : this.ribbon.getVisibleItems()) {
            this.singleIndicatorDrawer.draw(canvas, indicator.getCenterOffset(), this.baseYOffset, indicator.getItemSize(), this.animator.getColorAt(indicator.getPosition()), this.animator.getBorderWidthAt(indicator.getPosition()), this.animator.getBorderColorAt(indicator.getPosition()));
        }
        Iterator<T> it = this.ribbon.getVisibleItems().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Indicator) obj).getActive()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Indicator indicator2 = (Indicator) obj;
        if (indicator2 == null || (selectedItemRect = this.animator.getSelectedItemRect(indicator2.getCenterOffset(), this.baseYOffset, this.viewportWidth, ViewsKt.isLayoutRtl(this.view))) == null) {
            return;
        }
        this.singleIndicatorDrawer.drawSelected(canvas, selectedItemRect);
    }

    public final void onPageScrolled(int i4, float f4) {
        this.selectedItemPosition = i4;
        this.selectedItemFraction = f4;
        this.animator.onPageScrolled(i4, f4);
        adjustVisibleItems(i4, f4);
    }

    public final void onPageSelected(int i4) {
        this.selectedItemPosition = i4;
        this.selectedItemFraction = 0.0f;
        this.animator.onPageSelected(i4);
        adjustVisibleItems(i4, 0.0f);
    }

    public final void setItemsCount(int i4) {
        this.itemsCount = i4;
        this.animator.setItemsCount(i4);
        calculateMaximumVisibleItems();
        this.baseYOffset = this.viewportHeight / 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata
    static final class Indicator {
        private final boolean active;
        private final float centerOffset;

        @NotNull
        private final IndicatorParams$ItemSize itemSize;
        private final int position;
        private final float scaleFactor;

        public Indicator(int i4, boolean z4, float f4, @NotNull IndicatorParams$ItemSize itemSize, float f5) {
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            this.position = i4;
            this.active = z4;
            this.centerOffset = f4;
            this.itemSize = itemSize;
            this.scaleFactor = f5;
        }

        public static /* synthetic */ Indicator copy$default(Indicator indicator, int i4, boolean z4, float f4, IndicatorParams$ItemSize indicatorParams$ItemSize, float f5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i4 = indicator.position;
            }
            if ((i5 & 2) != 0) {
                z4 = indicator.active;
            }
            if ((i5 & 4) != 0) {
                f4 = indicator.centerOffset;
            }
            if ((i5 & 8) != 0) {
                indicatorParams$ItemSize = indicator.itemSize;
            }
            if ((i5 & 16) != 0) {
                f5 = indicator.scaleFactor;
            }
            float f6 = f5;
            float f7 = f4;
            return indicator.copy(i4, z4, f7, indicatorParams$ItemSize, f6);
        }

        @NotNull
        public final Indicator copy(int i4, boolean z4, float f4, @NotNull IndicatorParams$ItemSize itemSize, float f5) {
            Intrinsics.checkNotNullParameter(itemSize, "itemSize");
            return new Indicator(i4, z4, f4, itemSize, f5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Indicator)) {
                return false;
            }
            Indicator indicator = (Indicator) obj;
            return this.position == indicator.position && this.active == indicator.active && Float.compare(this.centerOffset, indicator.centerOffset) == 0 && Intrinsics.areEqual(this.itemSize, indicator.itemSize) && Float.compare(this.scaleFactor, indicator.scaleFactor) == 0;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final float getCenterOffset() {
            return this.centerOffset;
        }

        @NotNull
        public final IndicatorParams$ItemSize getItemSize() {
            return this.itemSize;
        }

        public final float getLeft() {
            return this.centerOffset - (this.itemSize.getWidth() / 2.0f);
        }

        public final int getPosition() {
            return this.position;
        }

        public final float getRight() {
            return this.centerOffset + (this.itemSize.getWidth() / 2.0f);
        }

        public final float getScaleFactor() {
            return this.scaleFactor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.position) * 31;
            boolean z4 = this.active;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return ((((((hashCode + i4) * 31) + Float.hashCode(this.centerOffset)) * 31) + this.itemSize.hashCode()) * 31) + Float.hashCode(this.scaleFactor);
        }

        @NotNull
        public String toString() {
            return "Indicator(position=" + this.position + ", active=" + this.active + ", centerOffset=" + this.centerOffset + ", itemSize=" + this.itemSize + ", scaleFactor=" + this.scaleFactor + ')';
        }

        public /* synthetic */ Indicator(int i4, boolean z4, float f4, IndicatorParams$ItemSize indicatorParams$ItemSize, float f5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i4, z4, f4, indicatorParams$ItemSize, (i5 & 16) != 0 ? 1.0f : f5);
        }
    }

    private final void calculateMaximumVisibleItems() {
        int maxVisibleItems;
        IndicatorParams$ItemPlacement itemsPlacement = this.styleParams.getItemsPlacement();
        if (itemsPlacement instanceof IndicatorParams$ItemPlacement.Default) {
            maxVisibleItems = (int) (this.viewportWidth / ((IndicatorParams$ItemPlacement.Default) itemsPlacement).getSpaceBetweenCenters());
        } else {
            if (!(itemsPlacement instanceof IndicatorParams$ItemPlacement.Stretch)) {
                throw new m();
            }
            maxVisibleItems = ((IndicatorParams$ItemPlacement.Stretch) itemsPlacement).getMaxVisibleItems();
        }
        this.maxVisibleCount = g.g(maxVisibleItems, this.itemsCount);
    }
}
