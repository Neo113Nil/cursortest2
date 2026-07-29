package com.mopub.nativeads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.aiming.mdt.AdtAds;
import com.aiming.mdt.nativead.AdInfo;
import com.aiming.mdt.nativead.NativeAdListener;
import com.aiming.mdt.utils.AdLog;
import com.facebook.ads.AudienceNetworkActivity;
import com.mopub.nativeads.CustomEventNative;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdtNative extends CustomEventNative {

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static final String f1277 = "AdtNative";

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f1278;

    public class AdtStaticNativeAd extends StaticNativeAd implements NativeAdListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        private CustomEventNative.CustomEventNativeListener f1279;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private NativeClickHandler f1280;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        private ImpressionTracker f1281;

        /* renamed from: ʽ, reason: contains not printable characters */
        private com.aiming.mdt.nativead.NativeAd f1283;

        /* synthetic */ AdtStaticNativeAd(AdtNative adtNative, Activity activity, com.aiming.mdt.nativead.NativeAd nativeAd, ImpressionTracker impressionTracker, NativeClickHandler nativeClickHandler, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
            this(activity, impressionTracker, nativeClickHandler, customEventNativeListener);
        }

        private AdtStaticNativeAd(Activity activity, ImpressionTracker impressionTracker, NativeClickHandler nativeClickHandler, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
            this.f1281 = impressionTracker;
            this.f1280 = nativeClickHandler;
            this.f1279 = customEventNativeListener;
            this.f1283 = new com.aiming.mdt.nativead.NativeAd(activity, AdtNative.this.f1278, this);
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void clear(View view) {
            this.f1281.removeView(view);
            this.f1280.clearOnClickListener(view);
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void destroy() {
            this.f1281.destroy();
            this.f1283.destroy();
            this.f1283 = null;
        }

        public com.aiming.mdt.nativead.NativeAd getNativeAd() {
            return this.f1283;
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.ClickInterface
        public void handleClick(View view) {
            notifyAdClicked();
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append("---handleClick****************--");
            singleton.LogD(sb.toString());
        }

        @Override // com.aiming.mdt.nativead.NativeAdListener
        public void onAdClicked() {
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append("---nativeAD is click--");
            singleton.LogD(sb.toString());
        }

        @Override // com.aiming.mdt.core.AdListener
        public void onAdFailed(String str) {
            String format = String.format("nativeAD Fail : %s", str);
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append(format);
            singleton.LogD(sb.toString());
            if (this.f1279 != null) {
                this.f1279.onNativeAdFailed(NativeErrorCode.NATIVE_ADAPTER_CONFIGURATION_ERROR);
            }
        }

        @Override // com.aiming.mdt.nativead.NativeAdListener
        public void onAdReady(AdInfo adInfo) {
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append("---nativeAD is ready--");
            sb.append(adInfo.toString());
            singleton.LogD(sb.toString());
            setTitle(adInfo.getTitle());
            setText(adInfo.getDesc());
            setCallToAction(adInfo.getCallToActionText());
            if (this.f1279 != null) {
                this.f1279.onNativeAdLoaded(this);
            }
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.BaseNativeAd
        public void prepare(View view) {
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append("---prepare---");
            singleton.LogD(sb.toString());
            this.f1281.addView(view, this);
            this.f1280.setOnClickListener(view, this);
        }

        @Override // com.mopub.nativeads.StaticNativeAd, com.mopub.nativeads.ImpressionInterface
        public void recordImpression(View view) {
            notifyAdImpressed();
            AdLog singleton = AdLog.getSingleton();
            StringBuilder sb = new StringBuilder();
            sb.append(AdtNative.f1277);
            sb.append("---recordImpression****************--");
            singleton.LogD(sb.toString());
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        final void m1349() {
            this.f1283.loadAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    public void m1345(Activity activity, CustomEventNative.CustomEventNativeListener customEventNativeListener) {
        new AdtStaticNativeAd(this, activity, null, new ImpressionTracker(activity), new NativeClickHandler(activity), customEventNativeListener).m1349();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m1347(Context context) {
        AdLog singleton;
        String str;
        if (context == null) {
            singleton = AdLog.getSingleton();
            str = "AdtNative Context cannot be null.";
        } else {
            if (context instanceof Activity) {
                return true;
            }
            singleton = AdLog.getSingleton();
            str = "AdtNative Context is not an Activity. adt Ads requires an Activity context to load ads.";
        }
        singleton.LogD(str);
        return false;
    }

    @Override // com.mopub.nativeads.CustomEventNative
    protected void loadNativeAd(Context context, CustomEventNative.CustomEventNativeListener customEventNativeListener, Map<String, Object> map, Map<String, String> map2) {
        AdLog singleton = AdLog.getSingleton();
        StringBuilder sb = new StringBuilder();
        sb.append(f1277);
        sb.append("--loadNativeAd--");
        singleton.LogD(sb.toString());
        String str = map2.get("app_key");
        this.f1278 = map2.get("placement_id");
        if (TextUtils.isEmpty(str)) {
            str = map2.get("appKey");
        }
        if (TextUtils.isEmpty(this.f1278)) {
            this.f1278 = map2.get(AudienceNetworkActivity.PLACEMENT_ID);
        }
        AdLog singleton2 = AdLog.getSingleton();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f1277);
        sb2.append("---appKey=");
        sb2.append(str);
        singleton2.LogD(sb2.toString());
        AdLog singleton3 = AdLog.getSingleton();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f1277);
        sb3.append("---placementId=");
        sb3.append(this.f1278);
        singleton3.LogD(sb3.toString());
        if (!m1347(context)) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.NATIVE_ADAPTER_CONFIGURATION_ERROR);
            return;
        }
        Activity activity = (Activity) context;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.f1278)) {
            customEventNativeListener.onNativeAdFailed(NativeErrorCode.NATIVE_ADAPTER_CONFIGURATION_ERROR);
        } else if (AdtAds.isInit()) {
            m1345(activity, customEventNativeListener);
        } else {
            AdtAds.init(activity, str, new C0385(this, context, customEventNativeListener));
        }
    }
}
