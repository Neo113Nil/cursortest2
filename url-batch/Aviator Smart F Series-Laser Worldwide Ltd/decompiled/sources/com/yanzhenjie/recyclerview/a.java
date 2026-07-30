package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes4.dex */
class a extends RecyclerView.Adapter {
    private static final int BASE_ITEM_TYPE_FOOTER = 200000;
    private static final int BASE_ITEM_TYPE_HEADER = 100000;
    private RecyclerView.Adapter mAdapter;
    private LayoutInflater mInflater;
    private e mOnItemClickListener;
    private f mOnItemLongClickListener;
    private g mOnItemMenuClickListener;
    private k mSwipeMenuCreator;
    private SparseArrayCompat<View> mHeaderViews = new SparseArrayCompat<>();
    private SparseArrayCompat<View> mFootViews = new SparseArrayCompat<>();

    /* renamed from: com.yanzhenjie.recyclerview.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0351a implements View.OnClickListener {
        final /* synthetic */ RecyclerView.ViewHolder val$viewHolder;

        ViewOnClickListenerC0351a(RecyclerView.ViewHolder viewHolder) {
            this.val$viewHolder = viewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.mOnItemClickListener.onItemClick(view, this.val$viewHolder.getAdapterPosition());
        }
    }

    class b implements View.OnLongClickListener {
        final /* synthetic */ RecyclerView.ViewHolder val$viewHolder;

        b(RecyclerView.ViewHolder viewHolder) {
            this.val$viewHolder = viewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            a.this.mOnItemLongClickListener.onItemLongClick(view, this.val$viewHolder.getAdapterPosition());
            return true;
        }
    }

    class c extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ GridLayoutManager val$glm;
        final /* synthetic */ GridLayoutManager.SpanSizeLookup val$originLookup;

        c(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.val$glm = gridLayoutManager;
            this.val$originLookup = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i8) {
            if (a.this.isHeaderOrFooter(i8)) {
                return this.val$glm.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.val$originLookup;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i8);
            }
            return 1;
        }
    }

    static class d extends RecyclerView.ViewHolder {
        public d(View view) {
            super(view);
        }
    }

    a(Context context, RecyclerView.Adapter adapter) {
        this.mInflater = LayoutInflater.from(context);
        this.mAdapter = adapter;
    }

    private int getContentItemCount() {
        return this.mAdapter.getItemCount();
    }

    private Class<?> getSupperClass(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == null || superclass.equals(Object.class)) ? cls : getSupperClass(superclass);
    }

    public void addFooterView(View view) {
        this.mFootViews.put(getFooterCount() + BASE_ITEM_TYPE_FOOTER, view);
    }

    public void addFooterViewAndNotify(View view) {
        addFooterView(view);
        notifyItemInserted(((getHeaderCount() + getContentItemCount()) + getFooterCount()) - 1);
    }

    public void addHeaderView(View view) {
        this.mHeaderViews.put(getHeaderCount() + 100000, view);
    }

    public void addHeaderViewAndNotify(View view) {
        addHeaderView(view);
        notifyItemInserted(getHeaderCount() - 1);
    }

    public int getFooterCount() {
        return this.mFootViews.size();
    }

    public int getHeaderCount() {
        return this.mHeaderViews.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getHeaderCount() + getContentItemCount() + getFooterCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i8) {
        if (isHeaderOrFooter(i8)) {
            return (-i8) - 1;
        }
        return this.mAdapter.getItemId(i8 - getHeaderCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i8) {
        return isHeader(i8) ? this.mHeaderViews.keyAt(i8) : isFooter(i8) ? this.mFootViews.keyAt((i8 - getHeaderCount()) - getContentItemCount()) : this.mAdapter.getItemViewType(i8 - getHeaderCount());
    }

    public RecyclerView.Adapter getOriginAdapter() {
        return this.mAdapter;
    }

    public boolean isFooter(int i8) {
        return i8 >= getHeaderCount() + getContentItemCount();
    }

    public boolean isHeader(int i8) {
        return i8 >= 0 && i8 < getHeaderCount();
    }

    public boolean isHeaderOrFooter(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof d) {
            return true;
        }
        return isHeaderOrFooter(viewHolder.getAdapterPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mAdapter.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new c(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i8) {
        View view = this.mHeaderViews.get(i8);
        if (view != null) {
            return new d(view);
        }
        View view2 = this.mFootViews.get(i8);
        if (view2 != null) {
            return new d(view2);
        }
        RecyclerView.ViewHolder onCreateViewHolder = this.mAdapter.onCreateViewHolder(viewGroup, i8);
        if (this.mOnItemClickListener != null) {
            onCreateViewHolder.itemView.setOnClickListener(new ViewOnClickListenerC0351a(onCreateViewHolder));
        }
        if (this.mOnItemLongClickListener != null) {
            onCreateViewHolder.itemView.setOnLongClickListener(new b(onCreateViewHolder));
        }
        if (this.mSwipeMenuCreator == null) {
            return onCreateViewHolder;
        }
        View inflate = this.mInflater.inflate(R$layout.support_recycler_view_item, viewGroup, false);
        ((ViewGroup) inflate.findViewById(R$id.swipe_content)).addView(onCreateViewHolder.itemView);
        try {
            Field declaredField = getSupperClass(onCreateViewHolder.getClass()).getDeclaredField("itemView");
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            declaredField.set(onCreateViewHolder, inflate);
        } catch (Exception unused) {
        }
        return onCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        this.mAdapter.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return false;
        }
        return this.mAdapter.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (!isHeaderOrFooter(viewHolder)) {
            this.mAdapter.onViewAttachedToWindow(viewHolder);
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        this.mAdapter.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        this.mAdapter.onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
    }

    public void removeFooterViewAndNotify(View view) {
        int indexOfValue = this.mFootViews.indexOfValue(view);
        if (indexOfValue == -1) {
            return;
        }
        this.mFootViews.removeAt(indexOfValue);
        notifyItemRemoved(getHeaderCount() + getContentItemCount() + indexOfValue);
    }

    public void removeHeaderViewAndNotify(View view) {
        int indexOfValue = this.mHeaderViews.indexOfValue(view);
        if (indexOfValue == -1) {
            return;
        }
        this.mHeaderViews.removeAt(indexOfValue);
        notifyItemRemoved(indexOfValue);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z7) {
        super.setHasStableIds(z7);
    }

    void setOnItemClickListener(e eVar) {
        this.mOnItemClickListener = eVar;
    }

    void setOnItemLongClickListener(f fVar) {
        this.mOnItemLongClickListener = fVar;
    }

    void setOnItemMenuClickListener(g gVar) {
        this.mOnItemMenuClickListener = gVar;
    }

    void setSwipeMenuCreator(k kVar) {
        this.mSwipeMenuCreator = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i8, @NonNull List<Object> list) {
        if (isHeaderOrFooter(viewHolder)) {
            return;
        }
        View view = viewHolder.itemView;
        int headerCount = i8 - getHeaderCount();
        if ((view instanceof SwipeMenuLayout) && this.mSwipeMenuCreator != null) {
            SwipeMenuLayout swipeMenuLayout = (SwipeMenuLayout) view;
            i iVar = new i(swipeMenuLayout);
            i iVar2 = new i(swipeMenuLayout);
            this.mSwipeMenuCreator.onCreateMenu(iVar, iVar2, headerCount);
            SwipeMenuView swipeMenuView = (SwipeMenuView) swipeMenuLayout.getChildAt(0);
            if (iVar.hasMenuItems()) {
                swipeMenuView.setOrientation(iVar.getOrientation());
                swipeMenuView.createMenu(viewHolder, iVar, swipeMenuLayout, 1, this.mOnItemMenuClickListener);
            } else if (swipeMenuView.getChildCount() > 0) {
                swipeMenuView.removeAllViews();
            }
            SwipeMenuView swipeMenuView2 = (SwipeMenuView) swipeMenuLayout.getChildAt(2);
            if (iVar2.hasMenuItems()) {
                swipeMenuView2.setOrientation(iVar2.getOrientation());
                swipeMenuView2.createMenu(viewHolder, iVar2, swipeMenuLayout, -1, this.mOnItemMenuClickListener);
            } else if (swipeMenuView2.getChildCount() > 0) {
                swipeMenuView2.removeAllViews();
            }
        }
        this.mAdapter.onBindViewHolder(viewHolder, headerCount, list);
    }

    public boolean isHeaderOrFooter(int i8) {
        return isHeader(i8) || isFooter(i8);
    }
}
