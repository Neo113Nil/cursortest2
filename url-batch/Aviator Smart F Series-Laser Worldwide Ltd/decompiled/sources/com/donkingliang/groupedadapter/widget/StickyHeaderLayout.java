package com.donkingliang.groupedadapter.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.donkingliang.groupedadapter.adapter.GroupedRecyclerViewAdapter;
import com.donkingliang.groupedadapter.holder.BaseViewHolder;

/* loaded from: classes3.dex */
public class StickyHeaderLayout extends FrameLayout {
    private final int VIEW_TAG_HOLDER;
    private final int VIEW_TAG_TYPE;
    private boolean isRegisterDataObserver;
    private boolean isSticky;
    private Context mContext;
    private int mCurrentStickyGroup;
    private d mListener;
    private RecyclerView mRecyclerView;
    private FrameLayout mStickyLayout;
    private final SparseArray<BaseViewHolder> mStickyViews;

    class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            if (StickyHeaderLayout.this.isSticky) {
                StickyHeaderLayout.this.updateStickyView(false);
            }
        }
    }

    class b extends RecyclerView.AdapterDataObserver {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            StickyHeaderLayout.this.updateStickyViewDelayed();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9) {
            StickyHeaderLayout.this.updateStickyViewDelayed();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            StickyHeaderLayout.this.updateStickyViewDelayed();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            StickyHeaderLayout.this.updateStickyViewDelayed();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StickyHeaderLayout.this.updateStickyView(true);
        }
    }

    public interface d {
    }

    public StickyHeaderLayout(@NonNull Context context) {
        super(context);
        this.mStickyViews = new SparseArray<>();
        this.VIEW_TAG_TYPE = -101;
        this.VIEW_TAG_HOLDER = -102;
        this.mCurrentStickyGroup = -1;
        this.isSticky = true;
        this.isRegisterDataObserver = false;
        this.mContext = context;
    }

    private void addOnScrollListener() {
        this.mRecyclerView.addOnScrollListener(new a());
    }

    private void addStickyLayout() {
        this.mStickyLayout = new FrameLayout(this.mContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.mStickyLayout.setLayoutParams(layoutParams);
        super.addView(this.mStickyLayout, 1, layoutParams);
    }

    private float calculateOffset(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter, int i8, int i9) {
        int i10;
        int positionForGroupHeader = groupedRecyclerViewAdapter.getPositionForGroupHeader(i9);
        if (positionForGroupHeader != -1 && this.mRecyclerView.getChildCount() > (i10 = positionForGroupHeader - i8)) {
            float y7 = this.mRecyclerView.getChildAt(i10).getY() - this.mStickyLayout.getHeight();
            if (y7 < 0.0f) {
                return y7;
            }
        }
        return 0.0f;
    }

    private int getFirstVisibleItem() {
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (layoutManager instanceof GridLayoutManager) {
                return ((GridLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                return getMin(iArr);
            }
        }
        return -1;
    }

    private int getMin(int[] iArr) {
        int i8 = iArr[0];
        for (int i9 = 1; i9 < iArr.length; i9++) {
            int i10 = iArr[i9];
            if (i10 < i8) {
                i8 = i10;
            }
        }
        return i8;
    }

    private BaseViewHolder getStickyViewByType(int i8) {
        return this.mStickyViews.get(i8);
    }

    private void recycle() {
        this.mCurrentStickyGroup = -1;
        if (this.mStickyLayout.getChildCount() > 0) {
            View childAt = this.mStickyLayout.getChildAt(0);
            this.mStickyViews.put(((Integer) childAt.getTag(-101)).intValue(), (BaseViewHolder) childAt.getTag(-102));
            this.mStickyLayout.removeAllViews();
        }
    }

    private BaseViewHolder recycleStickyView(int i8) {
        if (this.mStickyLayout.getChildCount() <= 0) {
            return null;
        }
        View childAt = this.mStickyLayout.getChildAt(0);
        if (((Integer) childAt.getTag(-101)).intValue() == i8) {
            return (BaseViewHolder) childAt.getTag(-102);
        }
        recycle();
        return null;
    }

    private void registerAdapterDataObserver(GroupedRecyclerViewAdapter groupedRecyclerViewAdapter) {
        if (this.isRegisterDataObserver) {
            return;
        }
        this.isRegisterDataObserver = true;
        groupedRecyclerViewAdapter.registerAdapterDataObserver(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStickyViewDelayed() {
        postDelayed(new c(), 64L);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0 || !(view instanceof RecyclerView)) {
            throw new IllegalArgumentException("StickyHeaderLayout can host only one direct child --> RecyclerView");
        }
        super.addView(view, i8, layoutParams);
        this.mRecyclerView = (RecyclerView) view;
        addOnScrollListener();
        addStickyLayout();
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.computeVerticalScrollExtent();
        }
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    protected int computeVerticalScrollOffset() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.computeVerticalScrollOffset();
        }
        return super.computeVerticalScrollOffset();
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.computeVerticalScrollRange();
        }
        return super.computeVerticalScrollRange();
    }

    public boolean isSticky() {
        return this.isSticky;
    }

    @Override // android.view.View
    public void scrollBy(int i8, int i9) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollBy(i8, i9);
        } else {
            super.scrollBy(i8, i9);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            recyclerView.scrollTo(i8, i9);
        } else {
            super.scrollTo(i8, i9);
        }
    }

    public void setOnStickyChangedListener(d dVar) {
    }

    public void setSticky(boolean z7) {
        if (this.isSticky != z7) {
            this.isSticky = z7;
            FrameLayout frameLayout = this.mStickyLayout;
            if (frameLayout != null) {
                if (z7) {
                    frameLayout.setVisibility(0);
                    updateStickyView(false);
                } else {
                    recycle();
                    this.mStickyLayout.setVisibility(8);
                }
            }
        }
    }

    public void updateStickyView() {
        updateStickyView(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStickyView(boolean z7) {
        RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
        if (adapter instanceof GroupedRecyclerViewAdapter) {
            GroupedRecyclerViewAdapter groupedRecyclerViewAdapter = (GroupedRecyclerViewAdapter) adapter;
            registerAdapterDataObserver(groupedRecyclerViewAdapter);
            int firstVisibleItem = getFirstVisibleItem();
            int groupPositionForPosition = groupedRecyclerViewAdapter.getGroupPositionForPosition(firstVisibleItem);
            if (z7 || this.mCurrentStickyGroup != groupPositionForPosition) {
                this.mCurrentStickyGroup = groupPositionForPosition;
                int positionForGroupHeader = groupedRecyclerViewAdapter.getPositionForGroupHeader(groupPositionForPosition);
                if (positionForGroupHeader != -1) {
                    int itemViewType = groupedRecyclerViewAdapter.getItemViewType(positionForGroupHeader);
                    BaseViewHolder recycleStickyView = recycleStickyView(itemViewType);
                    boolean z8 = recycleStickyView != null;
                    if (recycleStickyView == null) {
                        recycleStickyView = getStickyViewByType(itemViewType);
                    }
                    if (recycleStickyView == null) {
                        recycleStickyView = (BaseViewHolder) groupedRecyclerViewAdapter.onCreateViewHolder(this.mStickyLayout, itemViewType);
                        recycleStickyView.itemView.setTag(-101, Integer.valueOf(itemViewType));
                        recycleStickyView.itemView.setTag(-102, recycleStickyView);
                    }
                    groupedRecyclerViewAdapter.onBindViewHolder(recycleStickyView, positionForGroupHeader);
                    if (!z8) {
                        this.mStickyLayout.addView(recycleStickyView.itemView);
                    }
                } else {
                    recycle();
                }
            }
            if (this.mRecyclerView.computeVerticalScrollOffset() == 0) {
                recycle();
            }
            if (this.mStickyLayout.getChildCount() > 0 && this.mStickyLayout.getHeight() == 0) {
                this.mStickyLayout.requestLayout();
            }
            this.mStickyLayout.setTranslationY(calculateOffset(groupedRecyclerViewAdapter, firstVisibleItem, groupPositionForPosition + 1));
        }
    }

    public StickyHeaderLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStickyViews = new SparseArray<>();
        this.VIEW_TAG_TYPE = -101;
        this.VIEW_TAG_HOLDER = -102;
        this.mCurrentStickyGroup = -1;
        this.isSticky = true;
        this.isRegisterDataObserver = false;
        this.mContext = context;
    }

    public StickyHeaderLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i8) {
        super(context, attributeSet, i8);
        this.mStickyViews = new SparseArray<>();
        this.VIEW_TAG_TYPE = -101;
        this.VIEW_TAG_HOLDER = -102;
        this.mCurrentStickyGroup = -1;
        this.isSticky = true;
        this.isRegisterDataObserver = false;
        this.mContext = context;
    }
}
