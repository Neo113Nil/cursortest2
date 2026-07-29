package com.mopub.nativeads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;

@Deprecated
/* loaded from: classes2.dex */
public final class AdapterHelper {
    private final Context mApplicationContext;
    private final WeakReference<Context> mContext;
    private final int mInterval;
    private final int mStart;

    @Deprecated
    public AdapterHelper(Context context, int i, int i2) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkArgument(i >= 0, "start position must be non-negative");
        Preconditions.checkArgument(i2 >= 2, "interval must be at least 2");
        this.mContext = new WeakReference<>(context);
        this.mApplicationContext = context.getApplicationContext();
        this.mStart = i;
        this.mInterval = i2;
    }

    @Deprecated
    public View getAdView(View view, ViewGroup viewGroup, NativeAd nativeAd, ViewBinder viewBinder) {
        Context context = this.mContext.get();
        if (context == null) {
            MoPubLog.w("Weak reference to Context in AdapterHelper became null. Returning empty view.");
            return new View(this.mApplicationContext);
        }
        return NativeAdViewHelper.getAdView(view, viewGroup, context, nativeAd);
    }

    @Deprecated
    public View getAdView(View view, ViewGroup viewGroup, NativeAd nativeAd) {
        return getAdView(view, viewGroup, nativeAd, null);
    }

    @Deprecated
    public int shiftedCount(int i) {
        return i + numberOfAdsThatCouldFitWithContent(i);
    }

    @Deprecated
    public int shiftedPosition(int i) {
        return i - numberOfAdsSeenUpToPosition(i);
    }

    @Deprecated
    public boolean isAdPosition(int i) {
        return i >= this.mStart && (i - this.mStart) % this.mInterval == 0;
    }

    private int numberOfAdsSeenUpToPosition(int i) {
        if (i <= this.mStart) {
            return 0;
        }
        double d2 = i - this.mStart;
        double d3 = this.mInterval;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return ((int) Math.floor(d2 / d3)) + 1;
    }

    private int numberOfAdsThatCouldFitWithContent(int i) {
        if (i <= this.mStart) {
            return 0;
        }
        int i2 = this.mInterval - 1;
        if ((i - this.mStart) % i2 == 0) {
            return (i - this.mStart) / i2;
        }
        double d2 = i - this.mStart;
        double d3 = i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return ((int) Math.floor(d2 / d3)) + 1;
    }

    @VisibleForTesting
    @Deprecated
    void clearContext() {
        this.mContext.clear();
    }
}
