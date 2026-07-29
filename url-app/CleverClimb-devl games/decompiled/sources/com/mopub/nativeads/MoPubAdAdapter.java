package com.mopub.nativeads;

import android.app.Activity;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.nativeads.MoPubNativeAdPositioning;
import com.mopub.nativeads.VisibilityTracker;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MoPubAdAdapter extends BaseAdapter {
    private MoPubNativeAdLoadedListener mAdLoadedListener;
    private final Adapter mOriginalAdapter;
    private final MoPubStreamAdPlacer mStreamAdPlacer;
    private final WeakHashMap<View, Integer> mViewPositionMap;
    private final VisibilityTracker mVisibilityTracker;

    public MoPubAdAdapter(Activity activity, Adapter adapter) {
        this(activity, adapter, MoPubNativeAdPositioning.serverPositioning());
    }

    public MoPubAdAdapter(Activity activity, Adapter adapter, MoPubNativeAdPositioning.MoPubServerPositioning moPubServerPositioning) {
        this(new MoPubStreamAdPlacer(activity, moPubServerPositioning), adapter, new VisibilityTracker(activity));
    }

    public MoPubAdAdapter(Activity activity, Adapter adapter, MoPubNativeAdPositioning.MoPubClientPositioning moPubClientPositioning) {
        this(new MoPubStreamAdPlacer(activity, moPubClientPositioning), adapter, new VisibilityTracker(activity));
    }

    @VisibleForTesting
    MoPubAdAdapter(MoPubStreamAdPlacer moPubStreamAdPlacer, Adapter adapter, VisibilityTracker visibilityTracker) {
        this.mOriginalAdapter = adapter;
        this.mStreamAdPlacer = moPubStreamAdPlacer;
        this.mViewPositionMap = new WeakHashMap<>();
        this.mVisibilityTracker = visibilityTracker;
        this.mVisibilityTracker.setVisibilityTrackerListener(new VisibilityTracker.VisibilityTrackerListener() { // from class: com.mopub.nativeads.MoPubAdAdapter.1
            @Override // com.mopub.nativeads.VisibilityTracker.VisibilityTrackerListener
            public void onVisibilityChanged(List<View> list, List<View> list2) {
                MoPubAdAdapter.this.handleVisibilityChange(list);
            }
        });
        this.mOriginalAdapter.registerDataSetObserver(new DataSetObserver() { // from class: com.mopub.nativeads.MoPubAdAdapter.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                MoPubAdAdapter.this.mStreamAdPlacer.setItemCount(MoPubAdAdapter.this.mOriginalAdapter.getCount());
                MoPubAdAdapter.this.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                MoPubAdAdapter.this.notifyDataSetInvalidated();
            }
        });
        this.mStreamAdPlacer.setAdLoadedListener(new MoPubNativeAdLoadedListener() { // from class: com.mopub.nativeads.MoPubAdAdapter.3
            @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
            public void onAdLoaded(int i) {
                MoPubAdAdapter.this.handleAdLoaded(i);
            }

            @Override // com.mopub.nativeads.MoPubNativeAdLoadedListener
            public void onAdRemoved(int i) {
                MoPubAdAdapter.this.handleAdRemoved(i);
            }
        });
        this.mStreamAdPlacer.setItemCount(this.mOriginalAdapter.getCount());
    }

    @VisibleForTesting
    void handleAdLoaded(int i) {
        if (this.mAdLoadedListener != null) {
            this.mAdLoadedListener.onAdLoaded(i);
        }
        notifyDataSetChanged();
    }

    @VisibleForTesting
    void handleAdRemoved(int i) {
        if (this.mAdLoadedListener != null) {
            this.mAdLoadedListener.onAdRemoved(i);
        }
        notifyDataSetChanged();
    }

    public final void registerAdRenderer(MoPubAdRenderer moPubAdRenderer) {
        if (Preconditions.NoThrow.checkNotNull(moPubAdRenderer, "Tried to set a null ad renderer on the placer.")) {
            this.mStreamAdPlacer.registerAdRenderer(moPubAdRenderer);
        }
    }

    public final void setAdLoadedListener(MoPubNativeAdLoadedListener moPubNativeAdLoadedListener) {
        this.mAdLoadedListener = moPubNativeAdLoadedListener;
    }

    public void loadAds(String str) {
        this.mStreamAdPlacer.loadAds(str);
    }

    public void loadAds(String str, RequestParameters requestParameters) {
        this.mStreamAdPlacer.loadAds(str, requestParameters);
    }

    public boolean isAd(int i) {
        return this.mStreamAdPlacer.isAd(i);
    }

    public void clearAds() {
        this.mStreamAdPlacer.clearAds();
    }

    public void destroy() {
        this.mStreamAdPlacer.destroy();
        this.mVisibilityTracker.destroy();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return (this.mOriginalAdapter instanceof ListAdapter) && ((ListAdapter) this.mOriginalAdapter).areAllItemsEnabled();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return isAd(i) || ((this.mOriginalAdapter instanceof ListAdapter) && ((ListAdapter) this.mOriginalAdapter).isEnabled(this.mStreamAdPlacer.getOriginalPosition(i)));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.mStreamAdPlacer.getAdjustedCount(this.mOriginalAdapter.getCount());
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Object adData = this.mStreamAdPlacer.getAdData(i);
        return adData != null ? adData : this.mOriginalAdapter.getItem(this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        if (this.mStreamAdPlacer.getAdData(i) != null) {
            return -System.identityHashCode(r0);
        }
        return this.mOriginalAdapter.getItemId(this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return this.mOriginalAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View adView = this.mStreamAdPlacer.getAdView(i, view, viewGroup);
        if (adView == null) {
            adView = this.mOriginalAdapter.getView(this.mStreamAdPlacer.getOriginalPosition(i), view, viewGroup);
        }
        this.mViewPositionMap.put(adView, Integer.valueOf(i));
        this.mVisibilityTracker.addView(adView, 0, null);
        return adView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.mStreamAdPlacer.getAdViewType(i) != 0) {
            return (r0 + this.mOriginalAdapter.getViewTypeCount()) - 1;
        }
        return this.mOriginalAdapter.getItemViewType(this.mStreamAdPlacer.getOriginalPosition(i));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.mOriginalAdapter.getViewTypeCount() + this.mStreamAdPlacer.getAdViewTypeCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        return this.mOriginalAdapter.isEmpty() && this.mStreamAdPlacer.getAdjustedCount(0) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleVisibilityChange(List<View> list) {
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

    public int getOriginalPosition(int i) {
        return this.mStreamAdPlacer.getOriginalPosition(i);
    }

    public int getAdjustedPosition(int i) {
        return this.mStreamAdPlacer.getAdjustedPosition(i);
    }

    public void insertItem(int i) {
        this.mStreamAdPlacer.insertItem(i);
    }

    public void removeItem(int i) {
        this.mStreamAdPlacer.removeItem(i);
    }

    public void setOnClickListener(ListView listView, final AdapterView.OnItemClickListener onItemClickListener) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.setOnClickListener with a null ListView")) {
            if (onItemClickListener == null) {
                listView.setOnItemClickListener(null);
            } else {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.mopub.nativeads.MoPubAdAdapter.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        if (MoPubAdAdapter.this.mStreamAdPlacer.isAd(i)) {
                            return;
                        }
                        onItemClickListener.onItemClick(adapterView, view, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(i), j);
                    }
                });
            }
        }
    }

    public void setOnItemLongClickListener(ListView listView, final AdapterView.OnItemLongClickListener onItemLongClickListener) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.setOnItemLongClickListener with a null ListView")) {
            if (onItemLongClickListener == null) {
                listView.setOnItemLongClickListener(null);
            } else {
                listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.mopub.nativeads.MoPubAdAdapter.5
                    @Override // android.widget.AdapterView.OnItemLongClickListener
                    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                        return MoPubAdAdapter.this.isAd(i) || onItemLongClickListener.onItemLongClick(adapterView, view, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(i), j);
                    }
                });
            }
        }
    }

    public void setOnItemSelectedListener(ListView listView, final AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.setOnItemSelectedListener with a null ListView")) {
            if (onItemSelectedListener == null) {
                listView.setOnItemSelectedListener(null);
            } else {
                listView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.mopub.nativeads.MoPubAdAdapter.6
                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                        if (MoPubAdAdapter.this.isAd(i)) {
                            return;
                        }
                        onItemSelectedListener.onItemSelected(adapterView, view, MoPubAdAdapter.this.mStreamAdPlacer.getOriginalPosition(i), j);
                    }

                    @Override // android.widget.AdapterView.OnItemSelectedListener
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        onItemSelectedListener.onNothingSelected(adapterView);
                    }
                });
            }
        }
    }

    public void setSelection(ListView listView, int i) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.setSelection with a null ListView")) {
            listView.setSelection(this.mStreamAdPlacer.getAdjustedPosition(i));
        }
    }

    public void smoothScrollToPosition(ListView listView, int i) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.smoothScrollToPosition with a null ListView")) {
            listView.smoothScrollToPosition(this.mStreamAdPlacer.getAdjustedPosition(i));
        }
    }

    public void refreshAds(ListView listView, String str) {
        refreshAds(listView, str, null);
    }

    public void refreshAds(ListView listView, String str, RequestParameters requestParameters) {
        if (Preconditions.NoThrow.checkNotNull(listView, "You called MoPubAdAdapter.refreshAds with a null ListView")) {
            View childAt = listView.getChildAt(0);
            int top = childAt == null ? 0 : childAt.getTop();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int max = Math.max(firstVisiblePosition - 1, 0);
            while (this.mStreamAdPlacer.isAd(max) && max > 0) {
                max--;
            }
            int lastVisiblePosition = listView.getLastVisiblePosition();
            while (this.mStreamAdPlacer.isAd(lastVisiblePosition) && lastVisiblePosition < getCount() - 1) {
                lastVisiblePosition++;
            }
            int originalPosition = this.mStreamAdPlacer.getOriginalPosition(max);
            this.mStreamAdPlacer.removeAdsInRange(this.mStreamAdPlacer.getOriginalCount(lastVisiblePosition + 1), this.mStreamAdPlacer.getOriginalCount(getCount()));
            int removeAdsInRange = this.mStreamAdPlacer.removeAdsInRange(0, originalPosition);
            if (removeAdsInRange > 0) {
                listView.setSelectionFromTop(firstVisiblePosition - removeAdsInRange, top);
            }
            loadAds(str, requestParameters);
        }
    }
}
