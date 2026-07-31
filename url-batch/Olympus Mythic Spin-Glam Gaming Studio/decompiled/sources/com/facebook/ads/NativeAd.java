package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.ads.internal.api.NativeAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;

@Keep
@UiThread
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes12.dex */
public class NativeAd extends NativeAdBase {
    private NativeAdApi mNativeAdApi;

    @Nullable
    private NativeOptions mNativeOptions;

    @Keep
    public enum AdCreativeType {
        IMAGE,
        VIDEO,
        CAROUSEL,
        UNKNOWN
    }

    public NativeAd(Context context, String str) {
        super(context, str);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context, NativeAdBaseApi nativeAdBaseApi) {
        super(nativeAdBaseApi);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context, NativeAdBase nativeAdBase) {
        super(context, nativeAdBase);
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context, NativeAdBase nativeAdBase, @Nullable NativeOptions nativeOptions) {
        super(context, nativeAdBase);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(nativeAdBase, this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context, String str, @Nullable NativeOptions nativeOptions) {
        super(context, str);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    public NativeAd(Context context, NativeAdBaseApi nativeAdBaseApi, @Nullable NativeOptions nativeOptions) {
        super(nativeAdBaseApi);
        this.mNativeOptions = nativeOptions;
        this.mNativeAdApi = DynamicLoaderFactory.makeLoader(context).createNativeAdApi(this, this.mNativeAdBaseApi);
    }

    @Nullable
    public NativeOptions getNativeOptions() {
        return this.mNativeOptions;
    }

    public NativeAdApi getNativeAdApi() {
        return this.mNativeAdApi;
    }

    @Deprecated
    VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return this.mNativeAdApi.getVideoAutoplayBehavior();
    }

    public AdCreativeType getAdCreativeType() {
        return this.mNativeAdApi.getAdCreativeType();
    }

    public void registerViewForInteraction(View view, MediaView mediaView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable MediaView mediaView2, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, mediaView2, list);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView);
    }

    public void registerViewForInteraction(View view, MediaView mediaView, @Nullable ImageView imageView, @Nullable List<View> list) {
        Preconditions.checkIsOnMainThread();
        this.mNativeAdApi.registerViewForInteraction(view, mediaView, imageView, list);
    }

    @Keep
    public static class NativeOptions {

        @Nullable
        private Boolean mDisableFullScreen = null;

        @Nullable
        private Boolean mHideMediaControls = null;

        @Nullable
        private Boolean mUnMuteVolume = null;

        @Benchmark
        public NativeOptions() {
        }

        public NativeOptions setDisableFullScreen(Boolean bool) {
            this.mDisableFullScreen = bool;
            return this;
        }

        public NativeOptions setHideMediaControls(Boolean bool) {
            this.mHideMediaControls = bool;
            return this;
        }

        public NativeOptions setUnMuteVolume(Boolean bool) {
            this.mUnMuteVolume = bool;
            return this;
        }

        @Nullable
        public Boolean getDisableFullScreen() {
            return this.mDisableFullScreen;
        }

        @Nullable
        public Boolean getHideMediaControls() {
            return this.mHideMediaControls;
        }

        @Nullable
        public Boolean getUnMuteVolume() {
            return this.mUnMuteVolume;
        }
    }
}
