package com.bytedance.sdk.openadsdk.vG;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.so.so;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.ZhG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
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
import com.bytedance.sdk.openadsdk.apiImpl.Jd.icD;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NB;
import com.bytedance.sdk.openadsdk.utils.jlb;
import java.lang.reflect.Method;

/* compiled from: ADNFactory.java */
/* loaded from: classes2.dex */
public class pvs implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vG.pvs.1
            private int icD;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot build = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                if (pAGAppOpenRequest != null) {
                    this.icD = pAGAppOpenRequest.getTimeout();
                }
                final com.bytedance.sdk.openadsdk.apiImpl.vG.pvs pvsVar = new com.bytedance.sdk.openadsdk.apiImpl.vG.pvs(pAGAppOpenAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(new so("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.vG.pvs.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!mnm.Jd().vA() && jlb.zM()) {
                                pvsVar.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(pvsVar)) {
                                return;
                            }
                            if (build == null) {
                                pvsVar.onError(-4, "adslot is null");
                                return;
                            }
                            Method pvs = ZhG.pvs("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, PAGAppOpenAdLoadListener.class, Integer.TYPE);
                            if (pvs != null) {
                                pvs.invoke(null, mnm.pvs(), build, pvsVar, Integer.valueOf(AnonymousClass1.this.icD));
                            }
                        } catch (Throwable th) {
                            Ju.pvs("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, pvsVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vG.pvs.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                if ((pAGBannerRequest != null ? pAGBannerRequest.getAdSize() : null) != null) {
                    codeId.setExpressViewAcceptedSize(r0.getWidth(), r0.getHeight());
                }
                final AdSlot build = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs pvsVar = new com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(pAGBannerAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(new so("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.vG.pvs.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!mnm.Jd().vA() && jlb.zM()) {
                            pvsVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(pvsVar)) {
                            return;
                        }
                        AdSlot adSlot = build;
                        if (adSlot == null) {
                            pvsVar.onError(-4, "adslot is null");
                            return;
                        }
                        adSlot.setNativeAdType(1);
                        build.setDurationSlotType(1);
                        NB.pvs(mnm.pvs()).pvs(build, 1, pvsVar, PAGErrorCode.LOAD_FACTORY_NULL_CODE);
                    }
                }, pvsVar, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vG.pvs.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final com.bytedance.sdk.openadsdk.apiImpl.feed.NB nb = new com.bytedance.sdk.openadsdk.apiImpl.feed.NB(pAGNativeAdLoadListener);
                AdSlot.Builder withBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(withBid, pAGNativeRequest);
                final AdSlot build = withBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(new so("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.vG.pvs.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!mnm.Jd().vA() && jlb.zM()) {
                            nb.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(nb)) {
                            return;
                        }
                        if (build == null) {
                            nb.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method pvs = ZhG.pvs("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, PAGNativeAdLoadListener.class);
                            if (pvs != null) {
                                pvs.invoke(null, mnm.pvs(), build, nb);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, nb, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vG.pvs.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(codeId, pAGRewardedRequest);
                final AdSlot build = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final icD icd = new icD(pAGRewardedAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(new so("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.vG.pvs.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!mnm.Jd().vA() && jlb.zM()) {
                            icd.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!com.bytedance.sdk.openadsdk.utils.mnm.pvs(com.bytedance.sdk.openadsdk.utils.mnm.pvs, "load_reward_ad")) {
                            PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                            if (pAGRewardedAdLoadListener2 != null) {
                                pAGRewardedAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(icd)) {
                            return;
                        }
                        if (build == null) {
                            icd.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method pvs = ZhG.pvs("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, PAGRewardedAdLoadListener.class);
                            if (pvs != null) {
                                pvs.invoke(null, mnm.pvs(), build, icd);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, icd, build);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.vG.pvs.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot build = codeId.build();
                final com.bytedance.sdk.openadsdk.apiImpl.icD.pvs pvsVar = new com.bytedance.sdk.openadsdk.apiImpl.icD.pvs(pAGInterstitialAdLoadListener);
                com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(new so("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.vG.pvs.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!mnm.Jd().vA() && jlb.zM()) {
                            pvsVar.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (!com.bytedance.sdk.openadsdk.utils.mnm.pvs(com.bytedance.sdk.openadsdk.utils.mnm.pvs, "load_interstitial_ad")) {
                            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                            if (pAGInterstitialAdLoadListener2 != null) {
                                pAGInterstitialAdLoadListener2.onError(-17, "Insufficient running memory");
                                return;
                            }
                            return;
                        }
                        if (com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs(pvsVar)) {
                            return;
                        }
                        if (build == null) {
                            pvsVar.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            Method pvs = ZhG.pvs("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, PAGInterstitialAdLoadListener.class);
                            if (pvs != null) {
                                pvs.invoke(null, mnm.pvs(), build, pvsVar);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, pvsVar, build);
            }
        };
    }
}
