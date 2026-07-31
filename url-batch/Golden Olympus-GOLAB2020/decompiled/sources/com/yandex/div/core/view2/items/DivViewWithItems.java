package com.yandex.div.core.view2.items;

import O1.C0970o6;
import O1.EnumC0779dc;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.viewpager.widget.a;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class DivViewWithItems {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static DivViewWithItems viewForTests;
    private final int scrollOffset;
    private final int scrollRange;

    @Metadata
    public static final class Companion {

        @Metadata
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[C0970o6.e.values().length];
                try {
                    iArr[C0970o6.e.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C0970o6.e.PAGING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final DivViewWithItems getViewForTests$div_release() {
            return DivViewWithItems.viewForTests;
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Gallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Gallery(@NotNull DivRecyclerView view, @NotNull Direction direction) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.view = view;
            this.direction = direction;
            this.metrics = view.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i4, @NotNull EnumC0779dc sizeUnit, boolean z4) {
            Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
            DivRecyclerView divRecyclerView = this.view;
            DisplayMetrics metrics = getMetrics();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            DivViewWithItemsKt.scrollTo(divRecyclerView, i4, sizeUnit, metrics, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z4) {
            DivRecyclerView divRecyclerView = this.view;
            DisplayMetrics metrics = getMetrics();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            DivViewWithItemsKt.scrollToTheEnd(divRecyclerView, metrics, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                final Context context = this.view.getContext();
                l lVar = new l(context) { // from class: com.yandex.div.core.view2.items.DivViewWithItems$Gallery$currentItem$1$smoothScroller$1
                    private final float MILLISECONDS_PER_INCH = 50.0f;

                    @Override // androidx.recyclerview.widget.l
                    protected float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                        return this.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
                    }

                    @Override // androidx.recyclerview.widget.l
                    protected int getHorizontalSnapPreference() {
                        return -1;
                    }

                    @Override // androidx.recyclerview.widget.l
                    protected int getVerticalSnapPreference() {
                        return -1;
                    }
                };
                lVar.setTargetPosition(i4);
                RecyclerView.p layoutManager = this.view.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(lVar);
                    return;
                }
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.scrollToPosition(i4);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata
    public static final class Pager extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivPagerView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pager(@NotNull DivPagerView view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.metrics = view.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            RecyclerView.h adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z4) {
            this.view.getViewPager().l(getItemCount() - 1, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.getViewPager().l(i4, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.getViewPager().l(i4, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata
    public static final class PagingGallery extends DivViewWithItems {

        @NotNull
        private final Direction direction;
        private final DisplayMetrics metrics;

        @NotNull
        private final DivRecyclerView view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PagingGallery(@NotNull DivRecyclerView view, @NotNull Direction direction) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.view = view;
            this.direction = direction;
            this.metrics = view.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            int currentItem;
            currentItem = DivViewWithItemsKt.currentItem(this.view, this.direction);
            return currentItem;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            int itemCount;
            itemCount = DivViewWithItemsKt.getItemCount(this.view);
            return itemCount;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollOffset() {
            int scrollOffset;
            scrollOffset = DivViewWithItemsKt.scrollOffset(this.view);
            return scrollOffset;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getScrollRange() {
            int scrollRange;
            scrollRange = DivViewWithItemsKt.scrollRange(this.view);
            return scrollRange;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollTo(int i4, @NotNull EnumC0779dc sizeUnit, boolean z4) {
            Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
            DivRecyclerView divRecyclerView = this.view;
            DisplayMetrics metrics = getMetrics();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            DivViewWithItemsKt.scrollTo(divRecyclerView, i4, sizeUnit, metrics, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z4) {
            DivRecyclerView divRecyclerView = this.view;
            DisplayMetrics metrics = getMetrics();
            Intrinsics.checkNotNullExpressionValue(metrics, "metrics");
            DivViewWithItemsKt.scrollToTheEnd(divRecyclerView, metrics, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.smoothScrollToPosition(i4);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.scrollToPosition(i4);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    @Metadata
    public static final class Tabs extends DivViewWithItems {
        private final DisplayMetrics metrics;

        @NotNull
        private final DivTabsLayout view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Tabs(@NotNull DivTabsLayout view) {
            super(null);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
            this.metrics = view.getResources().getDisplayMetrics();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getCurrentItem() {
            return this.view.getViewPager().getCurrentItem();
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public int getItemCount() {
            a adapter = this.view.getViewPager().getAdapter();
            if (adapter != null) {
                return adapter.getCount();
            }
            return 0;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public DisplayMetrics getMetrics() {
            return this.metrics;
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void scrollToTheEnd(boolean z4) {
            this.view.getViewPager().setCurrentItem(getItemCount() - 1, z4);
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItem(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.getViewPager().setCurrentItem(i4, true);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }

        @Override // com.yandex.div.core.view2.items.DivViewWithItems
        public void setCurrentItemNoAnimation(int i4) {
            int itemCount = getItemCount();
            if (i4 >= 0 && i4 < itemCount) {
                this.view.getViewPager().setCurrentItem(i4, false);
                return;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(i4 + " is not in range [0, " + itemCount + ')');
            }
        }
    }

    public /* synthetic */ DivViewWithItems(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void scrollTo$default(DivViewWithItems divViewWithItems, int i4, EnumC0779dc enumC0779dc, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollTo");
        }
        if ((i5 & 2) != 0) {
            enumC0779dc = EnumC0779dc.PX;
        }
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        divViewWithItems.scrollTo(i4, enumC0779dc, z4);
    }

    public abstract int getCurrentItem();

    public abstract int getItemCount();

    @NotNull
    public abstract DisplayMetrics getMetrics();

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public int getScrollRange() {
        return this.scrollRange;
    }

    public void scrollTo(int i4, @NotNull EnumC0779dc sizeUnit, boolean z4) {
        Intrinsics.checkNotNullParameter(sizeUnit, "sizeUnit");
    }

    public abstract void scrollToTheEnd(boolean z4);

    public abstract void setCurrentItem(int i4);

    public abstract void setCurrentItemNoAnimation(int i4);

    private DivViewWithItems() {
    }
}
