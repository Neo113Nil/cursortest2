package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.impl.sdk.d.q;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.nativeAds.AppLovinNativeAdService;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class NativeAdServiceImpl implements AppLovinNativeAdService {

    /* renamed from: a, reason: collision with root package name */
    private final j f2871a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2872b;

    NativeAdServiceImpl(j jVar) {
        this.f2871a = jVar;
        this.f2872b = jVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinNativeAd appLovinNativeAd, final AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        if (appLovinNativeAd.isVideoPrecached()) {
            appLovinNativeAdPrecacheListener.onNativeAdVideoPreceached(appLovinNativeAd);
        } else {
            this.f2871a.C().a(new com.applovin.impl.sdk.d.g((List<NativeAdImpl>) Arrays.asList((NativeAdImpl) appLovinNativeAd), this.f2871a, new AppLovinNativeAdPrecacheListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.3
                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdImagePrecachingFailed(AppLovinNativeAd appLovinNativeAd2, int i) {
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdImagesPrecached(AppLovinNativeAd appLovinNativeAd2) {
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdVideoPrecachingFailed(AppLovinNativeAd appLovinNativeAd2, int i) {
                    NativeAdServiceImpl.this.a(appLovinNativeAdPrecacheListener, appLovinNativeAd2, i, true);
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdVideoPreceached(AppLovinNativeAd appLovinNativeAd2) {
                    NativeAdServiceImpl.this.a(appLovinNativeAdPrecacheListener, appLovinNativeAd2, true);
                }
            }), q.a.CACHING_OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, int i) {
        if (appLovinNativeAdLoadListener != null) {
            try {
                appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
            } catch (Exception e) {
                this.f2872b.c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, List<AppLovinNativeAd> list) {
        if (appLovinNativeAdLoadListener != null) {
            try {
                appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
            } catch (Exception e) {
                this.f2872b.c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener, AppLovinNativeAd appLovinNativeAd, int i, boolean z) {
        if (appLovinNativeAdPrecacheListener != null) {
            try {
                if (z) {
                    appLovinNativeAdPrecacheListener.onNativeAdVideoPrecachingFailed(appLovinNativeAd, i);
                } else {
                    appLovinNativeAdPrecacheListener.onNativeAdImagePrecachingFailed(appLovinNativeAd, i);
                }
            } catch (Exception e) {
                this.f2872b.c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener, AppLovinNativeAd appLovinNativeAd, boolean z) {
        if (appLovinNativeAdPrecacheListener != null) {
            try {
                if (z) {
                    appLovinNativeAdPrecacheListener.onNativeAdVideoPreceached(appLovinNativeAd);
                } else {
                    appLovinNativeAdPrecacheListener.onNativeAdImagesPrecached(appLovinNativeAd);
                }
            } catch (Exception e) {
                this.f2872b.c("NativeAdService", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    private void a(String str, int i, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        this.f2871a.C().a(new com.applovin.impl.sdk.d.n(str, i, this.f2871a, new AppLovinNativeAdLoadListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.1
            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsFailedToLoad(int i2) {
                NativeAdServiceImpl.this.a(appLovinNativeAdLoadListener, i2);
            }

            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
                NativeAdServiceImpl.this.a(list, appLovinNativeAdLoadListener);
            }
        }), q.a.MAIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<AppLovinNativeAd> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        int intValue = ((Integer) this.f2871a.a(com.applovin.impl.sdk.b.b.dz)).intValue();
        if (intValue <= 0) {
            if (appLovinNativeAdLoadListener != null) {
                appLovinNativeAdLoadListener.onNativeAdsLoaded(list);
                return;
            }
            return;
        }
        List<AppLovinNativeAd> list2 = list;
        int size = list2.size();
        if (size == 0) {
            if (appLovinNativeAdLoadListener != null) {
                appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(AppLovinErrorCodes.UNABLE_TO_PREPARE_NATIVE_AD);
            }
        } else {
            int min = Math.min(intValue, size);
            final List<AppLovinNativeAd> subList = list2.subList(0, min);
            final List<AppLovinNativeAd> subList2 = list2.subList(min, size);
            b(subList, new AppLovinNativeAdLoadListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.4
                @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
                public void onNativeAdsFailedToLoad(int i) {
                    if (appLovinNativeAdLoadListener != null) {
                        appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                    }
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
                public void onNativeAdsLoaded(List<AppLovinNativeAd> list3) {
                    NativeAdServiceImpl.this.c(subList, new AppLovinNativeAdLoadListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.4.1
                        @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
                        public void onNativeAdsFailedToLoad(int i) {
                            if (appLovinNativeAdLoadListener != null) {
                                appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                            }
                        }

                        @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
                        public void onNativeAdsLoaded(List<AppLovinNativeAd> list4) {
                            if (appLovinNativeAdLoadListener != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.addAll(subList);
                                arrayList.addAll(subList2);
                                appLovinNativeAdLoadListener.onNativeAdsLoaded(arrayList);
                            }
                        }
                    });
                }
            });
        }
    }

    private void b(List<NativeAdImpl> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        this.f2871a.C().a(new com.applovin.impl.sdk.d.e(list, this.f2871a, new AppLovinNativeAdLoadListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.5
            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsFailedToLoad(int i) {
                if (appLovinNativeAdLoadListener != null) {
                    appLovinNativeAdLoadListener.onNativeAdsFailedToLoad(i);
                }
            }

            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsLoaded(List<AppLovinNativeAd> list2) {
                if (appLovinNativeAdLoadListener != null) {
                    appLovinNativeAdLoadListener.onNativeAdsLoaded(list2);
                }
            }
        }), q.a.CACHING_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<NativeAdImpl> list, final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        this.f2871a.C().a(new com.applovin.impl.sdk.d.g(list, this.f2871a, new AppLovinNativeAdLoadListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.6
            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsFailedToLoad(int i) {
                NativeAdServiceImpl.this.a(appLovinNativeAdLoadListener, i);
            }

            @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
            public void onNativeAdsLoaded(List<AppLovinNativeAd> list2) {
                NativeAdServiceImpl.this.a(appLovinNativeAdLoadListener, list2);
            }
        }), q.a.CACHING_OTHER);
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdService
    public boolean hasPreloadedAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f2872b.e("NativeAdService", "Unable to check if ad is preloaded - invalid zone id.");
            return false;
        }
        return this.f2871a.M().g(com.applovin.impl.sdk.ad.d.a(str, this.f2871a));
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdService
    public void loadNativeAds(int i, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        loadNativeAds(i, null, appLovinNativeAdLoadListener);
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdService
    public void loadNativeAds(int i, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        if (i <= 0) {
            this.f2872b.e("NativeAdService", "Requested invalid number of native ads: " + i);
            return;
        }
        this.f2871a.a();
        if (i != 1) {
            a(str, i, appLovinNativeAdLoadListener);
            return;
        }
        com.applovin.impl.sdk.ad.d b2 = com.applovin.impl.sdk.ad.d.b(str, this.f2871a);
        AppLovinNativeAd appLovinNativeAd = (AppLovinNativeAd) this.f2871a.M().e(b2);
        if (appLovinNativeAd != null) {
            a(appLovinNativeAdLoadListener, Arrays.asList(appLovinNativeAd));
        } else {
            a(str, 1, appLovinNativeAdLoadListener);
        }
        if (((Boolean) this.f2871a.a(com.applovin.impl.sdk.b.b.aM)).booleanValue()) {
            this.f2871a.M().i(b2);
        }
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdService
    public void precacheResources(AppLovinNativeAd appLovinNativeAd, final AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        this.f2871a.a();
        if (!appLovinNativeAd.isImagePrecached()) {
            this.f2871a.C().a(new com.applovin.impl.sdk.d.e((List<NativeAdImpl>) Arrays.asList((NativeAdImpl) appLovinNativeAd), this.f2871a, new AppLovinNativeAdPrecacheListener() { // from class: com.applovin.impl.sdk.NativeAdServiceImpl.2
                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdImagePrecachingFailed(AppLovinNativeAd appLovinNativeAd2, int i) {
                    NativeAdServiceImpl.this.a(appLovinNativeAdPrecacheListener, appLovinNativeAd2, i, false);
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdImagesPrecached(AppLovinNativeAd appLovinNativeAd2) {
                    NativeAdServiceImpl.this.a(appLovinNativeAdPrecacheListener, appLovinNativeAd2, false);
                    NativeAdServiceImpl.this.a(appLovinNativeAd2, appLovinNativeAdPrecacheListener);
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdVideoPrecachingFailed(AppLovinNativeAd appLovinNativeAd2, int i) {
                }

                @Override // com.applovin.nativeAds.AppLovinNativeAdPrecacheListener
                public void onNativeAdVideoPreceached(AppLovinNativeAd appLovinNativeAd2) {
                }
            }), q.a.CACHING_OTHER);
        } else {
            appLovinNativeAdPrecacheListener.onNativeAdImagesPrecached(appLovinNativeAd);
            a(appLovinNativeAd, appLovinNativeAdPrecacheListener);
        }
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdService
    public void preloadAdForZoneId(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f2872b.e("NativeAdService", "Unable to preload zone for invalid zone id.");
            return;
        }
        this.f2871a.a();
        com.applovin.impl.sdk.ad.d a2 = com.applovin.impl.sdk.ad.d.a(str, this.f2871a);
        this.f2871a.L().h(a2);
        this.f2871a.L().i(a2);
    }

    public void preloadAds(com.applovin.impl.sdk.ad.d dVar) {
        this.f2871a.L().h(dVar);
        int g = dVar.g();
        if (g == 0 && this.f2871a.L().b(dVar)) {
            g = 1;
        }
        this.f2871a.L().b(dVar, g);
    }
}
