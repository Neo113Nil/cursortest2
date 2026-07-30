package com.yanzhenjie.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yanzhenjie.recyclerview.touch.DefaultItemTouchHelper;
import com.yanzhenjie.recyclerview.widget.DefaultLoadMoreView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class SwipeRecyclerView extends RecyclerView {
    private static final int INVALID_POSITION = -1;
    public static final int LEFT_DIRECTION = 1;
    public static final int RIGHT_DIRECTION = -1;
    private boolean allowSwipeDelete;
    private boolean isAutoLoadMore;
    private boolean isLoadError;
    private boolean isLoadMore;
    private RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private com.yanzhenjie.recyclerview.a mAdapterWrapper;
    private boolean mDataEmpty;
    private List<Integer> mDisableSwipeItemMenuList;
    private int mDownX;
    private int mDownY;
    private List<View> mFooterViewList;
    private boolean mHasMore;
    private List<View> mHeaderViewList;
    private DefaultItemTouchHelper mItemTouchHelper;
    private f mLoadMoreListener;
    private g mLoadMoreView;
    protected SwipeMenuLayout mOldSwipedLayout;
    protected int mOldTouchedPosition;
    private com.yanzhenjie.recyclerview.e mOnItemClickListener;
    private com.yanzhenjie.recyclerview.f mOnItemLongClickListener;
    private com.yanzhenjie.recyclerview.g mOnItemMenuClickListener;
    protected int mScaleTouchSlop;
    private int mScrollState;
    private boolean mSwipeItemMenuEnable;
    private k mSwipeMenuCreator;

    class a extends GridLayoutManager.SpanSizeLookup {
        final /* synthetic */ GridLayoutManager val$gridLayoutManager;
        final /* synthetic */ GridLayoutManager.SpanSizeLookup val$spanSizeLookupHolder;

        a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.val$gridLayoutManager = gridLayoutManager;
            this.val$spanSizeLookupHolder = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i8) {
            if (SwipeRecyclerView.this.mAdapterWrapper.isHeader(i8) || SwipeRecyclerView.this.mAdapterWrapper.isFooter(i8)) {
                return this.val$gridLayoutManager.getSpanCount();
            }
            GridLayoutManager.SpanSizeLookup spanSizeLookup = this.val$spanSizeLookupHolder;
            if (spanSizeLookup != null) {
                return spanSizeLookup.getSpanSize(i8 - SwipeRecyclerView.this.getHeaderCount());
            }
            return 1;
        }
    }

    private static class c implements com.yanzhenjie.recyclerview.e {
        private com.yanzhenjie.recyclerview.e mListener;
        private SwipeRecyclerView mRecyclerView;

        public c(SwipeRecyclerView swipeRecyclerView, com.yanzhenjie.recyclerview.e eVar) {
            this.mRecyclerView = swipeRecyclerView;
            this.mListener = eVar;
        }

        @Override // com.yanzhenjie.recyclerview.e
        public void onItemClick(View view, int i8) {
            int headerCount = i8 - this.mRecyclerView.getHeaderCount();
            if (headerCount >= 0) {
                this.mListener.onItemClick(view, headerCount);
            }
        }
    }

    private static class d implements com.yanzhenjie.recyclerview.f {
        private com.yanzhenjie.recyclerview.f mListener;
        private SwipeRecyclerView mRecyclerView;

        public d(SwipeRecyclerView swipeRecyclerView, com.yanzhenjie.recyclerview.f fVar) {
            this.mRecyclerView = swipeRecyclerView;
            this.mListener = fVar;
        }

        @Override // com.yanzhenjie.recyclerview.f
        public void onItemLongClick(View view, int i8) {
            int headerCount = i8 - this.mRecyclerView.getHeaderCount();
            if (headerCount >= 0) {
                this.mListener.onItemLongClick(view, headerCount);
            }
        }
    }

    private static class e implements com.yanzhenjie.recyclerview.g {
        private com.yanzhenjie.recyclerview.g mListener;
        private SwipeRecyclerView mRecyclerView;

        public e(SwipeRecyclerView swipeRecyclerView, com.yanzhenjie.recyclerview.g gVar) {
            this.mRecyclerView = swipeRecyclerView;
            this.mListener = gVar;
        }

        @Override // com.yanzhenjie.recyclerview.g
        public void onItemClick(j jVar, int i8) {
            int headerCount = i8 - this.mRecyclerView.getHeaderCount();
            if (headerCount >= 0) {
                this.mListener.onItemClick(jVar, headerCount);
            }
        }
    }

    public interface f {
    }

    public interface g {
        void onLoadError(int i8, String str);

        void onLoadFinish(boolean z7, boolean z8);

        void onLoading();

        void onWaitToLoadMore(f fVar);
    }

    public SwipeRecyclerView(Context context) {
        this(context, null);
    }

    private void checkAdapterExist(String str) {
        if (this.mAdapterWrapper != null) {
            throw new IllegalStateException(str);
        }
    }

    private void dispatchLoadMore() {
        if (this.isLoadError) {
            return;
        }
        if (!this.isAutoLoadMore) {
            g gVar = this.mLoadMoreView;
            if (gVar != null) {
                gVar.onWaitToLoadMore(null);
                return;
            }
            return;
        }
        if (this.isLoadMore || this.mDataEmpty || !this.mHasMore) {
            return;
        }
        this.isLoadMore = true;
        g gVar2 = this.mLoadMoreView;
        if (gVar2 != null) {
            gVar2.onLoading();
        }
    }

    private View getSwipeMenuView(View view) {
        if (view instanceof SwipeMenuLayout) {
            return view;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        while (!arrayList.isEmpty()) {
            View view2 = (View) arrayList.remove(0);
            if (view2 instanceof ViewGroup) {
                if (view2 instanceof SwipeMenuLayout) {
                    return view2;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    arrayList.add(viewGroup.getChildAt(i8));
                }
            }
        }
        return view;
    }

    private boolean handleUnDown(int i8, int i9, boolean z7) {
        int i10 = this.mDownX - i8;
        int i11 = this.mDownY - i9;
        if (Math.abs(i10) > this.mScaleTouchSlop && Math.abs(i10) > Math.abs(i11)) {
            return false;
        }
        if (Math.abs(i11) >= this.mScaleTouchSlop || Math.abs(i10) >= this.mScaleTouchSlop) {
            return z7;
        }
        return false;
    }

    private void initializeItemTouchHelper() {
        if (this.mItemTouchHelper == null) {
            DefaultItemTouchHelper defaultItemTouchHelper = new DefaultItemTouchHelper();
            this.mItemTouchHelper = defaultItemTouchHelper;
            defaultItemTouchHelper.attachToRecyclerView(this);
        }
    }

    public void addFooterView(View view) {
        this.mFooterViewList.add(view);
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar != null) {
            aVar.addFooterViewAndNotify(view);
        }
    }

    public void addHeaderView(View view) {
        this.mHeaderViewList.add(view);
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar != null) {
            aVar.addHeaderViewAndNotify(view);
        }
    }

    public int getFooterCount() {
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar == null) {
            return 0;
        }
        return aVar.getFooterCount();
    }

    public int getHeaderCount() {
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar == null) {
            return 0;
        }
        return aVar.getHeaderCount();
    }

    public int getItemViewType(int i8) {
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar == null) {
            return 0;
        }
        return aVar.getItemViewType(i8);
    }

    public RecyclerView.Adapter getOriginAdapter() {
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar == null) {
            return null;
        }
        return aVar.getOriginAdapter();
    }

    public boolean isItemViewSwipeEnabled() {
        initializeItemTouchHelper();
        return this.mItemTouchHelper.isItemViewSwipeEnabled();
    }

    public boolean isLongPressDragEnabled() {
        initializeItemTouchHelper();
        return this.mItemTouchHelper.isLongPressDragEnabled();
    }

    public boolean isSwipeItemMenuEnabled() {
        return this.mSwipeItemMenuEnable;
    }

    public void loadMoreError(int i8, String str) {
        this.isLoadMore = false;
        this.isLoadError = true;
        g gVar = this.mLoadMoreView;
        if (gVar != null) {
            gVar.onLoadError(i8, str);
        }
    }

    public final void loadMoreFinish(boolean z7, boolean z8) {
        this.isLoadMore = false;
        this.isLoadError = false;
        this.mDataEmpty = z7;
        this.mHasMore = z8;
        g gVar = this.mLoadMoreView;
        if (gVar != null) {
            gVar.onLoadFinish(z7, z8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SwipeMenuLayout swipeMenuLayout;
        boolean z7;
        boolean z8;
        SwipeMenuLayout swipeMenuLayout2;
        ViewParent parent;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.allowSwipeDelete || this.mSwipeMenuCreator == null) {
            return onInterceptTouchEvent;
        }
        boolean z9 = true;
        if (motionEvent.getPointerCount() > 1) {
            return true;
        }
        int action = motionEvent.getAction();
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        int childAdapterPosition = getChildAdapterPosition(findChildViewUnder(x7, y7));
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(childAdapterPosition);
        if (findViewHolderForAdapterPosition != null) {
            View swipeMenuView = getSwipeMenuView(findViewHolderForAdapterPosition.itemView);
            if (swipeMenuView instanceof SwipeMenuLayout) {
                swipeMenuLayout = (SwipeMenuLayout) swipeMenuView;
                z7 = (this.mSwipeItemMenuEnable || this.mDisableSwipeItemMenuList.contains(Integer.valueOf(childAdapterPosition))) ? false : true;
                if (swipeMenuLayout != null) {
                    swipeMenuLayout.setSwipeEnable(z7);
                }
                if (z7) {
                    return onInterceptTouchEvent;
                }
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            onInterceptTouchEvent = handleUnDown(x7, y7, onInterceptTouchEvent);
                            if (this.mOldSwipedLayout == null || (parent = getParent()) == null) {
                                return onInterceptTouchEvent;
                            }
                            int i8 = this.mDownX - x7;
                            boolean z10 = i8 > 0 && (this.mOldSwipedLayout.hasRightMenu() || this.mOldSwipedLayout.isLeftCompleteOpen());
                            boolean z11 = i8 < 0 && (this.mOldSwipedLayout.hasLeftMenu() || this.mOldSwipedLayout.isRightCompleteOpen());
                            if (!z10 && !z11) {
                                z9 = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z9);
                        } else if (action != 3) {
                            return onInterceptTouchEvent;
                        }
                    }
                    return handleUnDown(x7, y7, onInterceptTouchEvent);
                }
                this.mDownX = x7;
                this.mDownY = y7;
                if (childAdapterPosition == this.mOldTouchedPosition || (swipeMenuLayout2 = this.mOldSwipedLayout) == null || !swipeMenuLayout2.isMenuOpen()) {
                    z8 = false;
                } else {
                    this.mOldSwipedLayout.smoothCloseMenu();
                    z8 = true;
                }
                if (z8) {
                    this.mOldSwipedLayout = null;
                    this.mOldTouchedPosition = -1;
                    return z8;
                }
                if (swipeMenuLayout == null) {
                    return z8;
                }
                this.mOldSwipedLayout = swipeMenuLayout;
                this.mOldTouchedPosition = childAdapterPosition;
                return z8;
            }
        }
        swipeMenuLayout = null;
        if (this.mSwipeItemMenuEnable) {
        }
        if (swipeMenuLayout != null) {
        }
        if (z7) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i8) {
        this.mScrollState = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i8, int i9) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int itemCount = layoutManager.getItemCount();
            if (itemCount > 0 && itemCount == linearLayoutManager.findLastVisibleItemPosition() + 1) {
                int i10 = this.mScrollState;
                if (i10 == 1 || i10 == 2) {
                    dispatchLoadMore();
                    return;
                }
                return;
            }
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int itemCount2 = layoutManager.getItemCount();
            if (itemCount2 <= 0) {
                return;
            }
            int[] findLastCompletelyVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(null);
            if (itemCount2 == findLastCompletelyVisibleItemPositions[findLastCompletelyVisibleItemPositions.length - 1] + 1) {
                int i11 = this.mScrollState;
                if (i11 == 1 || i11 == 2) {
                    dispatchLoadMore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        SwipeMenuLayout swipeMenuLayout;
        if (motionEvent.getAction() == 2 && (swipeMenuLayout = this.mOldSwipedLayout) != null && swipeMenuLayout.isMenuOpen()) {
            this.mOldSwipedLayout.smoothCloseMenu();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeFooterView(View view) {
        this.mFooterViewList.remove(view);
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar != null) {
            aVar.removeFooterViewAndNotify(view);
        }
    }

    public void removeHeaderView(View view) {
        this.mHeaderViewList.remove(view);
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar != null) {
            aVar.removeHeaderViewAndNotify(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        com.yanzhenjie.recyclerview.a aVar = this.mAdapterWrapper;
        if (aVar != null) {
            aVar.getOriginAdapter().unregisterAdapterDataObserver(this.mAdapterDataObserver);
        }
        if (adapter == null) {
            this.mAdapterWrapper = null;
        } else {
            adapter.registerAdapterDataObserver(this.mAdapterDataObserver);
            com.yanzhenjie.recyclerview.a aVar2 = new com.yanzhenjie.recyclerview.a(getContext(), adapter);
            this.mAdapterWrapper = aVar2;
            aVar2.setOnItemClickListener(this.mOnItemClickListener);
            this.mAdapterWrapper.setOnItemLongClickListener(this.mOnItemLongClickListener);
            this.mAdapterWrapper.setSwipeMenuCreator(this.mSwipeMenuCreator);
            this.mAdapterWrapper.setOnItemMenuClickListener(this.mOnItemMenuClickListener);
            if (this.mHeaderViewList.size() > 0) {
                Iterator<View> it = this.mHeaderViewList.iterator();
                while (it.hasNext()) {
                    this.mAdapterWrapper.addHeaderView(it.next());
                }
            }
            if (this.mFooterViewList.size() > 0) {
                Iterator<View> it2 = this.mFooterViewList.iterator();
                while (it2.hasNext()) {
                    this.mAdapterWrapper.addFooterView(it2.next());
                }
            }
        }
        super.setAdapter(this.mAdapterWrapper);
    }

    public void setAutoLoadMore(boolean z7) {
        this.isAutoLoadMore = z7;
    }

    public void setItemViewSwipeEnabled(boolean z7) {
        initializeItemTouchHelper();
        this.allowSwipeDelete = z7;
        this.mItemTouchHelper.setItemViewSwipeEnabled(z7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new a(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
        super.setLayoutManager(layoutManager);
    }

    public void setLoadMoreListener(f fVar) {
    }

    public void setLoadMoreView(g gVar) {
        this.mLoadMoreView = gVar;
    }

    public void setLongPressDragEnabled(boolean z7) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.setLongPressDragEnabled(z7);
    }

    public void setOnItemClickListener(com.yanzhenjie.recyclerview.e eVar) {
        if (eVar == null) {
            return;
        }
        checkAdapterExist("Cannot set item click listener, setAdapter has already been called.");
        this.mOnItemClickListener = new c(this, eVar);
    }

    public void setOnItemLongClickListener(com.yanzhenjie.recyclerview.f fVar) {
        if (fVar == null) {
            return;
        }
        checkAdapterExist("Cannot set item long click listener, setAdapter has already been called.");
        this.mOnItemLongClickListener = new d(this, fVar);
    }

    public void setOnItemMenuClickListener(com.yanzhenjie.recyclerview.g gVar) {
        if (gVar == null) {
            return;
        }
        checkAdapterExist("Cannot set menu item click listener, setAdapter has already been called.");
        this.mOnItemMenuClickListener = new e(this, gVar);
    }

    public void setOnItemMoveListener(t5.a aVar) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.setOnItemMoveListener(aVar);
    }

    public void setOnItemMovementListener(t5.b bVar) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.setOnItemMovementListener(bVar);
    }

    public void setOnItemStateChangedListener(t5.c cVar) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.setOnItemStateChangedListener(cVar);
    }

    public void setSwipeItemMenuEnabled(boolean z7) {
        this.mSwipeItemMenuEnable = z7;
    }

    public void setSwipeMenuCreator(k kVar) {
        if (kVar == null) {
            return;
        }
        checkAdapterExist("Cannot set menu creator, setAdapter has already been called.");
        this.mSwipeMenuCreator = kVar;
    }

    public void smoothCloseMenu() {
        SwipeMenuLayout swipeMenuLayout = this.mOldSwipedLayout;
        if (swipeMenuLayout == null || !swipeMenuLayout.isMenuOpen()) {
            return;
        }
        this.mOldSwipedLayout.smoothCloseMenu();
    }

    public void smoothOpenLeftMenu(int i8) {
        smoothOpenMenu(i8, 1, 200);
    }

    public void smoothOpenMenu(int i8, int i9, int i10) {
        SwipeMenuLayout swipeMenuLayout = this.mOldSwipedLayout;
        if (swipeMenuLayout != null && swipeMenuLayout.isMenuOpen()) {
            this.mOldSwipedLayout.smoothCloseMenu();
        }
        int headerCount = i8 + getHeaderCount();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(headerCount);
        if (findViewHolderForAdapterPosition != null) {
            View swipeMenuView = getSwipeMenuView(findViewHolderForAdapterPosition.itemView);
            if (swipeMenuView instanceof SwipeMenuLayout) {
                SwipeMenuLayout swipeMenuLayout2 = (SwipeMenuLayout) swipeMenuView;
                this.mOldSwipedLayout = swipeMenuLayout2;
                if (i9 == -1) {
                    this.mOldTouchedPosition = headerCount;
                    swipeMenuLayout2.smoothOpenRightMenu(i10);
                } else if (i9 == 1) {
                    this.mOldTouchedPosition = headerCount;
                    swipeMenuLayout2.smoothOpenLeftMenu(i10);
                }
            }
        }
    }

    public void smoothOpenRightMenu(int i8) {
        smoothOpenMenu(i8, -1, 200);
    }

    public void startDrag(RecyclerView.ViewHolder viewHolder) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.startDrag(viewHolder);
    }

    public void startSwipe(RecyclerView.ViewHolder viewHolder) {
        initializeItemTouchHelper();
        this.mItemTouchHelper.startSwipe(viewHolder);
    }

    public void useDefaultLoadMore() {
        DefaultLoadMoreView defaultLoadMoreView = new DefaultLoadMoreView(getContext());
        addFooterView(defaultLoadMoreView);
        setLoadMoreView(defaultLoadMoreView);
    }

    class b extends RecyclerView.AdapterDataObserver {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            SwipeRecyclerView.this.mAdapterWrapper.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9) {
            SwipeRecyclerView.this.mAdapterWrapper.notifyItemRangeChanged(i8 + SwipeRecyclerView.this.getHeaderCount(), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i8, int i9) {
            SwipeRecyclerView.this.mAdapterWrapper.notifyItemRangeInserted(i8 + SwipeRecyclerView.this.getHeaderCount(), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i8, int i9, int i10) {
            SwipeRecyclerView.this.mAdapterWrapper.notifyItemMoved(i8 + SwipeRecyclerView.this.getHeaderCount(), i9 + SwipeRecyclerView.this.getHeaderCount());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i8, int i9) {
            SwipeRecyclerView.this.mAdapterWrapper.notifyItemRangeRemoved(i8 + SwipeRecyclerView.this.getHeaderCount(), i9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i8, int i9, Object obj) {
            SwipeRecyclerView.this.mAdapterWrapper.notifyItemRangeChanged(i8 + SwipeRecyclerView.this.getHeaderCount(), i9, obj);
        }
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean isSwipeItemMenuEnabled(int i8) {
        return !this.mDisableSwipeItemMenuList.contains(Integer.valueOf(i8));
    }

    public void setSwipeItemMenuEnabled(int i8, boolean z7) {
        if (z7) {
            if (this.mDisableSwipeItemMenuList.contains(Integer.valueOf(i8))) {
                this.mDisableSwipeItemMenuList.remove(Integer.valueOf(i8));
            }
        } else {
            if (this.mDisableSwipeItemMenuList.contains(Integer.valueOf(i8))) {
                return;
            }
            this.mDisableSwipeItemMenuList.add(Integer.valueOf(i8));
        }
    }

    public void smoothOpenLeftMenu(int i8, int i9) {
        smoothOpenMenu(i8, 1, i9);
    }

    public void smoothOpenRightMenu(int i8, int i9) {
        smoothOpenMenu(i8, -1, i9);
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mOldTouchedPosition = -1;
        this.mSwipeItemMenuEnable = true;
        this.mDisableSwipeItemMenuList = new ArrayList();
        this.mAdapterDataObserver = new b();
        this.mHeaderViewList = new ArrayList();
        this.mFooterViewList = new ArrayList();
        this.mScrollState = -1;
        this.isLoadMore = false;
        this.isAutoLoadMore = true;
        this.isLoadError = false;
        this.mDataEmpty = true;
        this.mHasMore = false;
        this.mScaleTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
