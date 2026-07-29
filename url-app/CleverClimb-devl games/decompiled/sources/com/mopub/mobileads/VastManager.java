package com.mopub.mobileads;

import android.content.Context;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mopub.common.CacheService;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.mobileads.VastXmlManagerAggregator;
import com.mopub.mobileads.VideoDownloader;

/* loaded from: classes2.dex */
public class VastManager implements VastXmlManagerAggregator.VastXmlManagerAggregatorListener {
    private String mDspCreativeId;
    private int mScreenAreaDp;
    private double mScreenAspectRatio;
    private final boolean mShouldPreCacheVideo;
    private VastManagerListener mVastManagerListener;
    private VastXmlManagerAggregator mVastXmlManagerAggregator;

    public interface VastManagerListener {
        void onVastVideoConfigurationPrepared(VastVideoConfig vastVideoConfig);
    }

    public VastManager(Context context, boolean z) {
        initializeScreenDimensions(context);
        this.mShouldPreCacheVideo = z;
    }

    public void prepareVastVideoConfiguration(String str, VastManagerListener vastManagerListener, String str2, Context context) {
        Preconditions.checkNotNull(vastManagerListener, "vastManagerListener cannot be null");
        Preconditions.checkNotNull(context, "context cannot be null");
        if (this.mVastXmlManagerAggregator == null) {
            this.mVastManagerListener = vastManagerListener;
            this.mVastXmlManagerAggregator = new VastXmlManagerAggregator(this, this.mScreenAspectRatio, this.mScreenAreaDp, context.getApplicationContext());
            this.mDspCreativeId = str2;
            try {
                AsyncTasks.safeExecuteOnExecutor(this.mVastXmlManagerAggregator, str);
            } catch (Exception e) {
                MoPubLog.d("Failed to aggregate vast xml", e);
                this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
            }
        }
    }

    public void cancel() {
        if (this.mVastXmlManagerAggregator != null) {
            this.mVastXmlManagerAggregator.cancel(true);
            this.mVastXmlManagerAggregator = null;
        }
    }

    @Override // com.mopub.mobileads.VastXmlManagerAggregator.VastXmlManagerAggregatorListener
    public void onAggregationComplete(final VastVideoConfig vastVideoConfig) {
        if (this.mVastManagerListener == null) {
            throw new IllegalStateException("mVastManagerListener cannot be null here. Did you call prepareVastVideoConfiguration()?");
        }
        if (vastVideoConfig == null) {
            this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
            return;
        }
        if (!TextUtils.isEmpty(this.mDspCreativeId)) {
            vastVideoConfig.setDspCreativeId(this.mDspCreativeId);
        }
        if (!this.mShouldPreCacheVideo || updateDiskMediaFileUrl(vastVideoConfig)) {
            this.mVastManagerListener.onVastVideoConfigurationPrepared(vastVideoConfig);
        } else {
            VideoDownloader.cache(vastVideoConfig.getNetworkMediaFileUrl(), new VideoDownloader.VideoDownloaderListener() { // from class: com.mopub.mobileads.VastManager.1
                @Override // com.mopub.mobileads.VideoDownloader.VideoDownloaderListener
                public void onComplete(boolean z) {
                    if (z && VastManager.this.updateDiskMediaFileUrl(vastVideoConfig)) {
                        VastManager.this.mVastManagerListener.onVastVideoConfigurationPrepared(vastVideoConfig);
                    } else {
                        MoPubLog.d("Failed to download VAST video.");
                        VastManager.this.mVastManagerListener.onVastVideoConfigurationPrepared(null);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean updateDiskMediaFileUrl(VastVideoConfig vastVideoConfig) {
        Preconditions.checkNotNull(vastVideoConfig, "vastVideoConfig cannot be null");
        String networkMediaFileUrl = vastVideoConfig.getNetworkMediaFileUrl();
        if (!CacheService.containsKeyDiskCache(networkMediaFileUrl)) {
            return false;
        }
        vastVideoConfig.setDiskMediaFileUrl(CacheService.getFilePathDiskCache(networkMediaFileUrl));
        return true;
    }

    private void initializeScreenDimensions(Context context) {
        Preconditions.checkNotNull(context, "context cannot be null");
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        float f = context.getResources().getDisplayMetrics().density;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        int max = Math.max(width, height);
        int min = Math.min(width, height);
        double d2 = max;
        double d3 = min;
        Double.isNaN(d2);
        Double.isNaN(d3);
        this.mScreenAspectRatio = d2 / d3;
        this.mScreenAreaDp = (int) ((max / f) * (min / f));
    }

    @VisibleForTesting
    @Deprecated
    int getScreenAreaDp() {
        return this.mScreenAreaDp;
    }

    @VisibleForTesting
    @Deprecated
    double getScreenAspectRatio() {
        return this.mScreenAspectRatio;
    }
}
