package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC3213c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean accessibilityEnabled;

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private E9.c crossAxisAlignment;
    private int currentItem;

    @NotNull
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;

    @NotNull
    private final AbstractC3213c itemsToShow;
    private int orientation;

    @NotNull
    private final SparseArray<Float> pageTranslations;

    @NotNull
    private final DivPagerView pagerView;

    @NotNull
    private final DivStatePath path;
    private int removedItems;

    @NotNull
    private final DivViewCreator viewCreator;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerAdapter(@NotNull List<DivItemBuilderResult> items, @NotNull BindingContext bindingContext, @NotNull DivBinder divBinder, @NotNull SparseArray<Float> pageTranslations, @NotNull DivViewCreator viewCreator, @NotNull DivStatePath path, boolean z4, @NotNull DivPagerView pagerView) {
        super(items);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(divBinder, "divBinder");
        Intrinsics.checkNotNullParameter(pageTranslations, "pageTranslations");
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pagerView, "pagerView");
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = pageTranslations;
        this.viewCreator = viewCreator;
        this.path = path;
        this.accessibilityEnabled = z4;
        this.pagerView = pagerView;
        this.itemsToShow = new AbstractC3213c() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractC3211a
            public int getSize() {
                return DivPagerAdapter.this.getVisibleItems().size() + (DivPagerAdapter.this.getInfiniteScrollEnabled() ? 4 : 0);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // kotlin.collections.AbstractC3211a, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            @NotNull
            public DivItemBuilderResult get(int i4) {
                if (!DivPagerAdapter.this.getInfiniteScrollEnabled()) {
                    return DivPagerAdapter.this.getVisibleItems().get(i4);
                }
                int size = (DivPagerAdapter.this.getVisibleItems().size() + i4) - 2;
                int size2 = DivPagerAdapter.this.getVisibleItems().size();
                int i5 = size % size2;
                return DivPagerAdapter.this.getVisibleItems().get(i5 + (size2 & (((i5 ^ size2) & ((-i5) | i5)) >> 31)));
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // kotlin.collections.AbstractC3213c, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = E9.c.START;
        this.currentItem = -1;
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    private final void notifyVirtualItemsChanged(int i4) {
        if (i4 >= 0 && i4 < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + i4, 2 - i4);
            return;
        }
        int size = getVisibleItems().size() - 2;
        if (i4 >= getVisibleItems().size() || size > i4) {
            return;
        }
        notifyItemRangeChanged((i4 - getVisibleItems().size()) + 2, 2);
    }

    @NotNull
    public final E9.c getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentRealItem() {
        return this.pagerView.getCurrentItem$div_release() - getOffsetToRealItem();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    @NotNull
    public final AbstractC3213c getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final int getPosition(int i4) {
        return i4 + getOffsetToRealItem();
    }

    public final int getRealPosition(int i4) {
        return i4 - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemInserted(int i4) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(i4);
            int i5 = this.currentItem;
            if (i5 >= i4) {
                this.currentItem = i5 + 1;
                return;
            }
            return;
        }
        int i6 = i4 + 2;
        notifyItemInserted(i6);
        notifyVirtualItemsChanged(i4);
        int i7 = this.currentItem;
        if (i7 >= i6) {
            this.currentItem = i7 + 1;
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    protected void notifyRawItemRemoved(int i4) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(i4);
            int i5 = this.currentItem;
            if (i5 > i4) {
                this.currentItem = i5 - 1;
                return;
            }
            return;
        }
        int i6 = i4 + 2;
        notifyItemRemoved(i6);
        notifyVirtualItemsChanged(i4);
        int i7 = this.currentItem;
        if (i7 > i6) {
            this.currentItem = i7 - 1;
        }
    }

    public final void setCrossAxisAlignment(@NotNull E9.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.crossAxisAlignment = cVar;
    }

    public final void setInfiniteScrollEnabled(boolean z4) {
        if (this.infiniteScrollEnabled == z4) {
            return;
        }
        this.infiniteScrollEnabled = z4;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z4 ? 2 : -2));
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(@NotNull List<DivItemBuilderResult> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem$div_release = this.pagerView.getCurrentItem$div_release();
        this.currentItem = currentItem$div_release;
        super.setItems(newItems);
        DivPagerView divPagerView = this.pagerView;
        if (this.removedItems != size) {
            currentItem$div_release = this.currentItem;
        }
        divPagerView.setCurrentItem$div_release(currentItem$div_release);
    }

    public final void setOrientation(int i4) {
        this.orientation = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull DivPagerViewHolder holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) this.itemsToShow.get(i4);
        holder.bind(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), divItemBuilderResult.getDiv(), i4, getItems().indexOf(divItemBuilderResult));
        Float f4 = this.pageTranslations.get(i4);
        if (f4 != null) {
            float floatValue = f4.floatValue();
            if (isHorizontal()) {
                holder.itemView.setTranslationX(floatValue);
            } else {
                holder.itemView.setTranslationY(floatValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public DivPagerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext$div_release(), new DivPagerAdapter$onCreateViewHolder$view$1(this)), this.divBinder, this.viewCreator, this.path, this.accessibilityEnabled, new DivPagerAdapter$onCreateViewHolder$1(this), new DivPagerAdapter$onCreateViewHolder$2(this));
    }
}
