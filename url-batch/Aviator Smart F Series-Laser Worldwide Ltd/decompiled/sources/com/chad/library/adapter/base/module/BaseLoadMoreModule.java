package com.chad.library.adapter.base.module;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.LoadMoreListenerImp;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.chad.library.adapter.base.loadmore.BaseLoadMoreView;
import com.chad.library.adapter.base.loadmore.LoadMoreStatus;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public class BaseLoadMoreModule implements LoadMoreListenerImp {
    private final BaseQuickAdapter<?, ?> baseQuickAdapter;
    private boolean enableLoadMoreEndClick;
    private boolean isAutoLoadMore;
    private boolean isEnableLoadMore;
    private boolean isEnableLoadMoreIfNotFullPage;
    private boolean isLoadEndMoreGone;
    private LoadMoreStatus loadMoreStatus;
    private BaseLoadMoreView loadMoreView;
    private OnLoadMoreListener mLoadMoreListener;
    private boolean mNextLoadEnable;
    private int preLoadNumber;

    public BaseLoadMoreModule(BaseQuickAdapter<?, ?> baseQuickAdapter) {
        s.checkNotNullParameter(baseQuickAdapter, "baseQuickAdapter");
        this.baseQuickAdapter = baseQuickAdapter;
        this.mNextLoadEnable = true;
        this.loadMoreStatus = LoadMoreStatus.Complete;
        this.loadMoreView = LoadMoreModuleConfig.getDefLoadMoreView();
        this.isAutoLoadMore = true;
        this.isEnableLoadMoreIfNotFullPage = true;
        this.preLoadNumber = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkDisableLoadMoreIfNotFullPage$lambda-4, reason: not valid java name */
    public static final void m141checkDisableLoadMoreIfNotFullPage$lambda4(BaseLoadMoreModule this$0, RecyclerView.LayoutManager manager) {
        s.checkNotNullParameter(this$0, "this$0");
        s.checkNotNullParameter(manager, "$manager");
        if (this$0.isFullScreen((LinearLayoutManager) manager)) {
            this$0.mNextLoadEnable = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkDisableLoadMoreIfNotFullPage$lambda-5, reason: not valid java name */
    public static final void m142checkDisableLoadMoreIfNotFullPage$lambda5(RecyclerView.LayoutManager manager, BaseLoadMoreModule this$0) {
        s.checkNotNullParameter(manager, "$manager");
        s.checkNotNullParameter(this$0, "this$0");
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) manager;
        int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
        staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(iArr);
        if (this$0.getTheBiggestNumber(iArr) + 1 != this$0.baseQuickAdapter.getItemCount()) {
            this$0.mNextLoadEnable = true;
        }
    }

    private final int getTheBiggestNumber(int[] iArr) {
        int i8 = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i9 : iArr) {
                if (i9 > i8) {
                    i8 = i9;
                }
            }
        }
        return i8;
    }

    private final void invokeLoadMoreListener() {
        this.loadMoreStatus = LoadMoreStatus.Loading;
        RecyclerView recyclerViewOrNull = this.baseQuickAdapter.getRecyclerViewOrNull();
        if (recyclerViewOrNull != null) {
            recyclerViewOrNull.post(new Runnable() { // from class: com.chad.library.adapter.base.module.f
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLoadMoreModule.m143invokeLoadMoreListener$lambda3$lambda2(BaseLoadMoreModule.this);
                }
            });
            return;
        }
        OnLoadMoreListener onLoadMoreListener = this.mLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeLoadMoreListener$lambda-3$lambda-2, reason: not valid java name */
    public static final void m143invokeLoadMoreListener$lambda3$lambda2(BaseLoadMoreModule this$0) {
        s.checkNotNullParameter(this$0, "this$0");
        OnLoadMoreListener onLoadMoreListener = this$0.mLoadMoreListener;
        if (onLoadMoreListener != null) {
            onLoadMoreListener.onLoadMore();
        }
    }

    private final boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        return (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == this.baseQuickAdapter.getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    public static /* synthetic */ void loadMoreEnd$default(BaseLoadMoreModule baseLoadMoreModule, boolean z7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreEnd");
        }
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        baseLoadMoreModule.loadMoreEnd(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupViewHolder$lambda-1, reason: not valid java name */
    public static final void m144setupViewHolder$lambda1(BaseLoadMoreModule this$0, View view) {
        s.checkNotNullParameter(this$0, "this$0");
        LoadMoreStatus loadMoreStatus = this$0.loadMoreStatus;
        if (loadMoreStatus == LoadMoreStatus.Fail) {
            this$0.loadMoreToLoading();
            return;
        }
        if (loadMoreStatus == LoadMoreStatus.Complete) {
            this$0.loadMoreToLoading();
        } else if (this$0.enableLoadMoreEndClick && loadMoreStatus == LoadMoreStatus.End) {
            this$0.loadMoreToLoading();
        }
    }

    public final void autoLoadMore$com_github_CymChad_brvah(int i8) {
        LoadMoreStatus loadMoreStatus;
        if (this.isAutoLoadMore && hasLoadMoreView() && i8 >= this.baseQuickAdapter.getItemCount() - this.preLoadNumber && (loadMoreStatus = this.loadMoreStatus) == LoadMoreStatus.Complete && loadMoreStatus != LoadMoreStatus.Loading && this.mNextLoadEnable) {
            invokeLoadMoreListener();
        }
    }

    public final void checkDisableLoadMoreIfNotFullPage() {
        final RecyclerView.LayoutManager layoutManager;
        if (this.isEnableLoadMoreIfNotFullPage) {
            return;
        }
        this.mNextLoadEnable = false;
        RecyclerView recyclerViewOrNull = this.baseQuickAdapter.getRecyclerViewOrNull();
        if (recyclerViewOrNull == null || (layoutManager = recyclerViewOrNull.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerViewOrNull.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.d
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLoadMoreModule.m141checkDisableLoadMoreIfNotFullPage$lambda4(BaseLoadMoreModule.this, layoutManager);
                }
            }, 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerViewOrNull.postDelayed(new Runnable() { // from class: com.chad.library.adapter.base.module.e
                @Override // java.lang.Runnable
                public final void run() {
                    BaseLoadMoreModule.m142checkDisableLoadMoreIfNotFullPage$lambda5(RecyclerView.LayoutManager.this, this);
                }
            }, 50L);
        }
    }

    public final boolean getEnableLoadMoreEndClick() {
        return this.enableLoadMoreEndClick;
    }

    public final LoadMoreStatus getLoadMoreStatus() {
        return this.loadMoreStatus;
    }

    public final BaseLoadMoreView getLoadMoreView() {
        return this.loadMoreView;
    }

    public final int getLoadMoreViewPosition() {
        if (this.baseQuickAdapter.hasEmptyView()) {
            return -1;
        }
        BaseQuickAdapter<?, ?> baseQuickAdapter = this.baseQuickAdapter;
        return baseQuickAdapter.getHeaderLayoutCount() + baseQuickAdapter.getData().size() + baseQuickAdapter.getFooterLayoutCount();
    }

    public final int getPreLoadNumber() {
        return this.preLoadNumber;
    }

    public final boolean hasLoadMoreView() {
        if (this.mLoadMoreListener == null || !this.isEnableLoadMore) {
            return false;
        }
        if (this.loadMoreStatus == LoadMoreStatus.End && this.isLoadEndMoreGone) {
            return false;
        }
        return !this.baseQuickAdapter.getData().isEmpty();
    }

    public final boolean isAutoLoadMore() {
        return this.isAutoLoadMore;
    }

    public final boolean isEnableLoadMore() {
        return this.isEnableLoadMore;
    }

    public final boolean isEnableLoadMoreIfNotFullPage() {
        return this.isEnableLoadMoreIfNotFullPage;
    }

    public final boolean isLoadEndMoreGone() {
        return this.isLoadEndMoreGone;
    }

    public final boolean isLoading() {
        return this.loadMoreStatus == LoadMoreStatus.Loading;
    }

    public final void loadMoreComplete() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            checkDisableLoadMoreIfNotFullPage();
        }
    }

    public final void loadMoreEnd() {
        loadMoreEnd$default(this, false, 1, null);
    }

    public final void loadMoreFail() {
        if (hasLoadMoreView()) {
            this.loadMoreStatus = LoadMoreStatus.Fail;
            this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        }
    }

    public final void loadMoreToLoading() {
        LoadMoreStatus loadMoreStatus = this.loadMoreStatus;
        LoadMoreStatus loadMoreStatus2 = LoadMoreStatus.Loading;
        if (loadMoreStatus == loadMoreStatus2) {
            return;
        }
        this.loadMoreStatus = loadMoreStatus2;
        this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
        invokeLoadMoreListener();
    }

    public final void reset$com_github_CymChad_brvah() {
        if (this.mLoadMoreListener != null) {
            setEnableLoadMore(true);
            this.loadMoreStatus = LoadMoreStatus.Complete;
        }
    }

    public final void setAutoLoadMore(boolean z7) {
        this.isAutoLoadMore = z7;
    }

    public final void setEnableLoadMore(boolean z7) {
        boolean hasLoadMoreView = hasLoadMoreView();
        this.isEnableLoadMore = z7;
        boolean hasLoadMoreView2 = hasLoadMoreView();
        if (hasLoadMoreView) {
            if (hasLoadMoreView2) {
                return;
            }
            this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
        } else if (hasLoadMoreView2) {
            this.loadMoreStatus = LoadMoreStatus.Complete;
            this.baseQuickAdapter.notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public final void setEnableLoadMoreEndClick(boolean z7) {
        this.enableLoadMoreEndClick = z7;
    }

    public final void setEnableLoadMoreIfNotFullPage(boolean z7) {
        this.isEnableLoadMoreIfNotFullPage = z7;
    }

    public final void setLoadMoreView(BaseLoadMoreView baseLoadMoreView) {
        s.checkNotNullParameter(baseLoadMoreView, "<set-?>");
        this.loadMoreView = baseLoadMoreView;
    }

    @Override // com.chad.library.adapter.base.listener.LoadMoreListenerImp
    public void setOnLoadMoreListener(OnLoadMoreListener onLoadMoreListener) {
        this.mLoadMoreListener = onLoadMoreListener;
        setEnableLoadMore(true);
    }

    public final void setPreLoadNumber(int i8) {
        if (i8 > 1) {
            this.preLoadNumber = i8;
        }
    }

    public final void setupViewHolder$com_github_CymChad_brvah(BaseViewHolder viewHolder) {
        s.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.module.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseLoadMoreModule.m144setupViewHolder$lambda1(BaseLoadMoreModule.this, view);
            }
        });
    }

    public final void loadMoreEnd(boolean z7) {
        if (hasLoadMoreView()) {
            this.isLoadEndMoreGone = z7;
            this.loadMoreStatus = LoadMoreStatus.End;
            if (z7) {
                this.baseQuickAdapter.notifyItemRemoved(getLoadMoreViewPosition());
            } else {
                this.baseQuickAdapter.notifyItemChanged(getLoadMoreViewPosition());
            }
        }
    }
}
