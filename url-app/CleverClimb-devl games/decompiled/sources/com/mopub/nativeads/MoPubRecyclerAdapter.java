package com.mopub.nativeads;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.VisibilityTracker;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class MoPubRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static final int NATIVE_AD_VIEW_TYPE_BASE = -56;
    private MoPubNativeAdLoadedListener mAdLoadedListener;
    private final RecyclerView.AdapterDataObserver mAdapterDataObserver;
    private final RecyclerView.Adapter mOriginalAdapter;
    private RecyclerView mRecyclerView;
    private ContentChangeStrategy mStrategy;
    private final MoPubStreamAdPlacer mStreamAdPlacer;
    private final WeakHashMap<View, Integer> mViewPositionMap;
    private final VisibilityTracker mVisibilityTracker;

    public enum ContentChangeStrategy {
        INSERT_AT_END,
        MOVE_ALL_ADS_WITH_CONTENT,
        KEEP_ADS_FIXED
    }

    public MoPubRecyclerAdapter(Activity activity, RecyclerView.Adapter adapter) {
        this(activity, adapter, MoPubNativeAdPositioning.serverPositioning());
    }

    public MoPubRecyclerAdapter(Activity activity, RecyclerView.Adapter adapter, MoPubNativeAdPositioning.MoPubServerPositioning moPubServerPositioning) {
        this(new MoPubStreamAdPlacer(activity, moPubServerPositioning), adapter, new VisibilityTracker(activity));
    }

    public MoPubRecyclerAdapter(Activity activity, RecyclerView.Adapter adapter, MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        this(new MoPubStreamAdPlacer(activity, moPubClientPositioning), adapter, new VisibilityTracker(activity));
    }

    @VisibleForTesting
    MoPubRecyclerAdapter(MoPubStreamAdPlacer moPubStreamAdPlacer, RecyclerView.Adapter adapter, VisibilityTracker visibilityTracker) {
        this.mStrategy = ContentChangeStrategy.INSERT_AT_END;
        this.mViewPositionMap = new WeakHashMap<>();
        this.mOriginalAdapter = adapter;
        this.mVisibilityTracker = visibilityTracker;
        this.mVisibilityTracker.setVisibilityTrackerListener(new VisibilityTracker.VisibilityTrackerListener() { // from class: com.mopub.nativeads.MoPubRecyclerAdapter.1
            @Override // com.mopub.nativeads.VisibilityTracker.VisibilityTrackerListener
            public void onVisibilityChanged(List<View> list, List<View> list2) {
                MoPubRecyclerAdapter.this.handleVisibilityChanged(list, list2);
            }
        });
        setHasStableIdsInternal(this.mOriginalAdapter.hasStableIds());
        this.mStreamAdPlacer = moPubStreamAdPlacer;
        this.mStreamAdPlacer.setAdLoadedListener(new MoPubNativeAdLoadedListener() { // from class: com.mopub.nativeads.MoPubRecyclerAdapter.2
            @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
            public void onAdLoaded(int i) {
                MoPubRecyclerAdapter.this.handleAdLoaded(i);
            }

            @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
            public void onAdRemoved(int i) {
                MoPubRecyclerAdapter.this.handleAdRemoved(i);
            }
        });
        this.mStreamAdPlacer.setItemCount(this.mOriginalAdapter.getItemCount());
        this.mAdapterDataObserver = new RecyclerView.AdapterDataObserver() { // from class: com.mopub.nativeads.MoPubRecyclerAdapter.3
            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                MoPubRecyclerAdapter.this.mStreamAdPlacer.setItemCount(MoPubRecyclerAdapter.this.mOriginalAdapter.getItemCount());
                MoPubRecyclerAdapter.this.notifyDataSetChanged();
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                int adjustedPosition = MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedPosition((i2 + i) - 1);
                int adjustedPosition2 = MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedPosition(i);
                MoPubRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition2, (adjustedPosition - adjustedPosition2) + 1);
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                int adjustedPosition = MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedPosition(i);
                int itemCount = MoPubRecyclerAdapter.this.mOriginalAdapter.getItemCount();
                MoPubRecyclerAdapter.this.mStreamAdPlacer.setItemCount(itemCount);
                boolean z = i + i2 >= itemCount;
                if (ContentChangeStrategy.KEEP_ADS_FIXED == MoPubRecyclerAdapter.this.mStrategy || (ContentChangeStrategy.INSERT_AT_END == MoPubRecyclerAdapter.this.mStrategy && z)) {
                    MoPubRecyclerAdapter.this.notifyDataSetChanged();
                    return;
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    MoPubRecyclerAdapter.this.mStreamAdPlacer.insertItem(i);
                }
                MoPubRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                int adjustedPosition = MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedPosition(i);
                int itemCount = MoPubRecyclerAdapter.this.mOriginalAdapter.getItemCount();
                MoPubRecyclerAdapter.this.mStreamAdPlacer.setItemCount(itemCount);
                boolean z = i + i2 >= itemCount;
                if (ContentChangeStrategy.KEEP_ADS_FIXED != MoPubRecyclerAdapter.this.mStrategy && (ContentChangeStrategy.INSERT_AT_END != MoPubRecyclerAdapter.this.mStrategy || !z)) {
                    int adjustedCount = MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedCount(itemCount + i2);
                    for (int i3 = 0; i3 < i2; i3++) {
                        MoPubRecyclerAdapter.this.mStreamAdPlacer.removeItem(i);
                    }
                    int adjustedCount2 = adjustedCount - MoPubRecyclerAdapter.this.mStreamAdPlacer.getAdjustedCount(itemCount);
                    MoPubRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (adjustedCount2 - i2), adjustedCount2);
                    return;
                }
                MoPubRecyclerAdapter.this.notifyDataSetChanged();
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeMoved(int i, int i2, int i3) {
                MoPubRecyclerAdapter.this.notifyDataSetChanged();
            }
        };
        this.mOriginalAdapter.registerAdapterDataObserver(this.mAdapterDataObserver);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.mRecyclerView = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.mRecyclerView = null;
    }

    public void setAdLoadedListener(MoPubNativeAdLoadedListener moPubNativeAdLoadedListener) {
        this.mAdLoadedListener = moPubNativeAdLoadedListener;
    }

    public void registerAdRenderer(MoPubAdRenderer moPubAdRenderer) {
        if (Preconditions.NoThrow.checkNotNull(moPubAdRenderer, "Cannot register a null adRenderer")) {
            this.mStreamAdPlacer.registerAdRenderer(moPubAdRenderer);
        }
    }

    public void loadAds(String str) {
        this.mStreamAdPlacer.loadAds(str);
    }

    public void loadAds(String str, RequestParameters requestParameters) {
        this.mStreamAdPlacer.loadAds(str, requestParameters);
    }

    public static int computeScrollOffset(LinearLayoutManager linearLayoutManager, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return 0;
        }
        View view = viewHolder.itemView;
        if (linearLayoutManager.canScrollVertically()) {
            if (linearLayoutManager.getStackFromEnd()) {
                return view.getBottom();
            }
            return view.getTop();
        }
        if (!linearLayoutManager.canScrollHorizontally()) {
            return 0;
        }
        if (linearLayoutManager.getStackFromEnd()) {
            return view.getRight();
        }
        return view.getLeft();
    }

    public void refreshAds(String str) {
        refreshAds(str, null);
    }

    public void refreshAds(String str, RequestParameters requestParameters) {
        if (this.mRecyclerView == null) {
            MoPubLog.w("This adapter is not attached to a RecyclerView and cannot be refreshed.");
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null) {
            MoPubLog.w("Can't refresh ads when there is no layout manager on a RecyclerView.");
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int computeScrollOffset = computeScrollOffset(linearLayoutManager, this.mRecyclerView.findViewHolderForLayoutPosition(findFirstVisibleItemPosition));
            int max = Math.max(0, findFirstVisibleItemPosition - 1);
            while (this.mStreamAdPlacer.isAd(max) && max > 0) {
                max--;
            }
            int itemCount = getItemCount();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            while (this.mStreamAdPlacer.isAd(findLastVisibleItemPosition) && findLastVisibleItemPosition < itemCount - 1) {
                findLastVisibleItemPosition++;
            }
            int originalPosition = this.mStreamAdPlacer.getOriginalPosition(max);
            this.mStreamAdPlacer.removeAdsInRange(this.mStreamAdPlacer.getOriginalPosition(findLastVisibleItemPosition), this.mOriginalAdapter.getItemCount());
            int removeAdsInRange = this.mStreamAdPlacer.removeAdsInRange(0, originalPosition);
            if (removeAdsInRange > 0) {
                linearLayoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition - removeAdsInRange, computeScrollOffset);
            }
            loadAds(str, requestParameters);
            return;
        }
        MoPubLog.w("This LayoutManager can't be refreshed.");
    }

    public void clearAds() {
        this.mStreamAdPlacer.clearAds();
    }

    public boolean isAd(int i) {
        return this.mStreamAdPlacer.isAd(i);
    }

    public int getAdjustedPosition(int i) {
        return this.mStreamAdPlacer.getAdjustedPosition(i);
    }

    public int getOriginalPosition(int i) {
        return this.mStreamAdPlacer.getOriginalPosition(i);
    }

    public void setContentChangeStrategy(ContentChangeStrategy contentChangeStrategy) {
        if (Preconditions.NoThrow.checkNotNull(contentChangeStrategy)) {
            this.mStrategy = contentChangeStrategy;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mStreamAdPlacer.getAdjustedCount(this.mOriginalAdapter.getItemCount());
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i >= NATIVE_AD_VIEW_TYPE_BASE && i <= this.mStreamAdPlacer.getAdViewTypeCount() + NATIVE_AD_VIEW_TYPE_BASE) {
            MoPubAdRenderer adRendererForViewType = this.mStreamAdPlacer.getAdRendererForViewType(i - NATIVE_AD_VIEW_TYPE_BASE);
            if (adRendererForViewType == null) {
                MoPubLog.w("No view binder was registered for ads in MoPubRecyclerAdapter.");
                return null;
            }
            return new MoPubRecyclerViewHolder(adRendererForViewType.createAdView((Activity) viewGroup.getContext(), viewGroup));
        }
        return this.mOriginalAdapter.onCreateViewHolder(viewGroup, i);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object adData = this.mStreamAdPlacer.getAdData(i);
        if (adData != null) {
            this.mStreamAdPlacer.bindAdView((NativeAd) adData, viewHolder.itemView);
            return;
        }
        this.mViewPositionMap.put(viewHolder.itemView, Integer.valueOf(i));
        this.mVisibilityTracker.addView(viewHolder.itemView, 0, null);
        this.mOriginalAdapter.onBindViewHolder(viewHolder, this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int adViewType = this.mStreamAdPlacer.getAdViewType(i);
        return adViewType != 0 ? adViewType + NATIVE_AD_VIEW_TYPE_BASE : this.mOriginalAdapter.getItemViewType(this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        setHasStableIdsInternal(z);
        this.mOriginalAdapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
        this.mOriginalAdapter.setHasStableIds(z);
        this.mOriginalAdapter.registerAdapterDataObserver(this.mAdapterDataObserver);
    }

    public void destroy() {
        this.mOriginalAdapter.unregisterAdapterDataObserver(this.mAdapterDataObserver);
        this.mStreamAdPlacer.destroy();
        this.mVisibilityTracker.destroy();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (!this.mOriginalAdapter.hasStableIds()) {
            return -1L;
        }
        if (this.mStreamAdPlacer.getAdData(i) != null) {
            return -System.identityHashCode(r0);
        }
        return this.mOriginalAdapter.getItemId(this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MoPubRecyclerViewHolder) {
            return super.onFailedToRecycleView(viewHolder);
        }
        return this.mOriginalAdapter.onFailedToRecycleView(viewHolder);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MoPubRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.mOriginalAdapter.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MoPubRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.mOriginalAdapter.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MoPubRecyclerViewHolder) {
            super.onViewRecycled(viewHolder);
        } else {
            this.mOriginalAdapter.onViewRecycled(viewHolder);
        }
    }

    @VisibleForTesting
    void handleAdLoaded(int i) {
        if (this.mAdLoadedListener != null) {
            this.mAdLoadedListener.onAdLoaded(i);
        }
        notifyItemInserted(i);
    }

    @VisibleForTesting
    void handleAdRemoved(int i) {
        if (this.mAdLoadedListener != null) {
            this.mAdLoadedListener.onAdRemoved(i);
        }
        notifyItemRemoved(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVisibilityChanged(List<View> list, List<View> list2) {
        Iterator<View> it = list.iterator();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (it.hasNext()) {
            Integer num = this.mViewPositionMap.get(it.next());
            if (num != null) {
                i = Math.min(num.intValue(), i);
                i2 = Math.max(num.intValue(), i2);
            }
        }
        this.mStreamAdPlacer.placeAdsInRange(i, i2 + 1);
    }

    private void setHasStableIdsInternal(boolean z) {
        super.setHasStableIds(z);
    }
}
