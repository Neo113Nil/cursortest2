package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes15.dex */
public class NativeAdsManager {
    private final NativeAdsManagerApi mNativeAdsManagerApi;

    @Nullable
    private NativeAd.NativeOptions mNativeOptions;

    @Keep
    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(Context context, String str, int i, @Nullable NativeAd.NativeOptions nativeOptions) {
        this(context, str, i);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdsManagerApi.setNativeOption(nativeOptions);
    }

    public NativeAdsManager(Context context, String str, int i) {
        Preconditions.checkNotNull(context, "Context can not be null");
        Preconditions.checkIsTrue(i > -1, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i);
    }

    public void setListener(Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }

    public void setExtraHints(String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void loadAds() {
        this.mNativeAdsManagerApi.loadAds();
    }

    public void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.mNativeAdsManagerApi.loadAds(mediaCacheFlag);
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    @Nullable
    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    @Nullable
    public NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        return this.mNativeAdsManagerApi.nextNativeAd(nativeAdListener);
    }

    public boolean isLoaded() {
        return this.mNativeAdsManagerApi.isLoaded();
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }
}
