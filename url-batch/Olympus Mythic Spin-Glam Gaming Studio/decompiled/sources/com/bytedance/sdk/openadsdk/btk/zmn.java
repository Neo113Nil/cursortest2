package com.bytedance.sdk.openadsdk.btk;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.iqz;
import com.bytedance.sdk.component.zg.fs.zn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.nps;
import com.bytedance.sdk.openadsdk.component.reward.bvs;
import com.bytedance.sdk.openadsdk.component.reward.hhw;
import com.bytedance.sdk.openadsdk.component.reward.olo;
import com.bytedance.sdk.openadsdk.core.iv.zg;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.bytedance.sdk.openadsdk.zmn.btk.fs;
import com.bytedance.sdk.openadsdk.zmn.fs.btk;

/* loaded from: classes12.dex */
public class zmn implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.btk.zmn.1
            private int fs;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                this.fs = pAGAppOpenRequest.getTimeout();
                final com.bytedance.sdk.openadsdk.zmn.fb.zmn zmnVar = new com.bytedance.sdk.openadsdk.zmn.fb.zmn(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(new zn("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.btk.zmn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!kgc.fb().cn() && oub.zak()) {
                                zmnVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(zmnVar)) {
                                return;
                            }
                            AdSlot adSlot = build;
                            if (adSlot == null) {
                                zmnVar.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                nps.zmn(kgc.zmn()).zmn(build, zmnVar, AnonymousClass1.this.fs);
                            }
                        } catch (Throwable th) {
                            iqz.zmn("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, zmnVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.btk.zmn.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest.getAdSize();
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.zmn.zmn.zmn zmnVar = new com.bytedance.sdk.openadsdk.zmn.zmn.zmn(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(new zn("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.btk.zmn.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kgc.fb().cn() && oub.zak()) {
                            zmnVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(zmnVar)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int fb = jy.fb(kgc.zmn());
                            int nps = jy.nps(kgc.zmn());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > fb || adSize.getWidth() <= 0 || height > nps || height < 0) {
                                zmnVar.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            zmnVar.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            zg.zmn(kgc.zmn()).zmn(build, 1, zmnVar);
                        }
                    }
                }, zmnVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.btk.zmn.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final btk btkVar = new btk(pAGNativeAdLoadListener);
                AdSlot.Builder withBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(new zn("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.btk.zmn.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kgc.fb().cn() && oub.zak()) {
                            btkVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(btkVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            btkVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            com.bytedance.sdk.openadsdk.component.fs.zmn.zmn().zmn(kgc.zmn(), build, btkVar);
                        } catch (Throwable unused) {
                        }
                    }
                }, btkVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.btk.zmn.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final fs fsVar = new fs(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(new zn("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.btk.zmn.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kgc.fb().cn() && oub.zak()) {
                            fsVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(fsVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            fsVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
                                com.bytedance.sdk.openadsdk.component.reward.kgc.zmn(kgc.zmn()).zmn(build, (AdSlot) new bvs(fsVar));
                            } else {
                                olo.zmn(kgc.zmn()).zmn(build, new bvs(fsVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, fsVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.btk.zmn.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.zmn.zn.zmn zmnVar = new com.bytedance.sdk.openadsdk.zmn.zn.zmn(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.zmn.zmn.zmn(new zn("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.btk.zmn.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!kgc.fb().cn() && oub.zak()) {
                            zmnVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.zmn.zmn.zmn(zmnVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            zmnVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (com.bytedance.sdk.openadsdk.utils.fs.zn()) {
                                com.bytedance.sdk.openadsdk.component.reward.nps.zmn(kgc.zmn()).zmn(build, (AdSlot) new com.bytedance.sdk.openadsdk.component.zn.fs(zmnVar));
                            } else {
                                hhw.zmn(kgc.zmn()).zmn(build, new com.bytedance.sdk.openadsdk.component.zn.fs(zmnVar));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, zmnVar, build);
            }
        };
    }
}
