package com.yandex.div.core.view2.items;

import O1.C0970o6;
import O1.EnumC0779dc;
import O1.Z;
import W1.m;
import android.view.View;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.core.view2.items.DivViewWithItems;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivViewWithItemsController {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final DivViewWithItems view;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ DivViewWithItemsController create$default(Companion companion, String str, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, Direction direction, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                direction = Direction.NEXT;
            }
            return companion.create(str, divViewFacade, expressionResolver, direction);
        }

        @Nullable
        public final DivViewWithItemsController create(@NotNull String id, @NotNull DivViewFacade view, @NotNull ExpressionResolver resolver, @NotNull Direction direction) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(resolver, "resolver");
            Intrinsics.checkNotNullParameter(direction, "direction");
            View findViewWithTag = view.getView().findViewWithTag(id);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (findViewWithTag == null) {
                return null;
            }
            DivViewWithItems viewForTests$div_release = DivViewWithItems.Companion.getViewForTests$div_release();
            if (viewForTests$div_release == null) {
                if (findViewWithTag instanceof DivRecyclerView) {
                    DivRecyclerView divRecyclerView = (DivRecyclerView) findViewWithTag;
                    Z.e div = divRecyclerView.getDiv();
                    Intrinsics.checkNotNull(div);
                    int i4 = DivViewWithItems.Companion.WhenMappings.$EnumSwitchMapping$0[((C0970o6.e) div.c().f7274C.evaluate(resolver)).ordinal()];
                    if (i4 == 1) {
                        viewForTests$div_release = new DivViewWithItems.Gallery(divRecyclerView, direction);
                    } else {
                        if (i4 != 2) {
                            throw new m();
                        }
                        viewForTests$div_release = new DivViewWithItems.PagingGallery(divRecyclerView, direction);
                    }
                } else {
                    viewForTests$div_release = findViewWithTag instanceof DivPagerView ? new DivViewWithItems.Pager((DivPagerView) findViewWithTag) : findViewWithTag instanceof DivTabsLayout ? new DivViewWithItems.Tabs((DivTabsLayout) findViewWithTag) : null;
                }
            }
            if (viewForTests$div_release == null) {
                return null;
            }
            return new DivViewWithItemsController(viewForTests$div_release, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewWithItemsController(DivViewWithItems divViewWithItems, DefaultConstructorMarker defaultConstructorMarker) {
        this(divViewWithItems);
    }

    private final OverflowItemStrategy createStrategy(String str) {
        return OverflowItemStrategy.Companion.create$div_release(str, this.view.getCurrentItem(), this.view.getItemCount(), this.view.getScrollRange(), this.view.getScrollOffset(), this.view.getMetrics());
    }

    public final void changeCurrentItemByStep(@Nullable String str, int i4, boolean z4) {
        int previousItem;
        OverflowItemStrategy createStrategy = createStrategy(str);
        if (i4 > 0) {
            previousItem = createStrategy.nextItem(i4);
        } else if (i4 >= 0) {
            return;
        } else {
            previousItem = createStrategy.previousItem(-i4);
        }
        setCurrentItem(previousItem, z4);
    }

    public final void scrollByOffset(@Nullable String str, int i4, boolean z4) {
        if (i4 == 0) {
            return;
        }
        DivViewWithItems.scrollTo$default(this.view, createStrategy(str).positionAfterScrollBy(i4), null, z4, 2, null);
    }

    public final void scrollTo(int i4, boolean z4) {
        this.view.scrollTo(i4, EnumC0779dc.DP, z4);
    }

    public final void scrollToEnd(boolean z4) {
        this.view.scrollToTheEnd(z4);
    }

    public final void scrollToStart(boolean z4) {
        setCurrentItem(0, z4);
    }

    public final void setCurrentItem(int i4, boolean z4) {
        if (z4) {
            this.view.setCurrentItem(i4);
        } else {
            this.view.setCurrentItemNoAnimation(i4);
        }
    }

    private DivViewWithItemsController(DivViewWithItems divViewWithItems) {
        this.view = divViewWithItems;
    }
}
