package com.startapp.flutter.sdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.flutter.sdk.StartAppViewFactory;
import com.startapp.sdk.ads.banner.Banner;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.Cover;
import com.startapp.sdk.ads.banner.Mrec;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class StartAppSdkPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String LOG_TAG = "StartAppSdkPlugin";
    private static final int METHOD_ASYNC = 2;
    private static final int METHOD_NOT_IMPLEMENTED = 0;
    private static final int METHOD_SUCCESS = 1;
    private final StartAppKeeper<BannerStandard> bannerAdKeeper;
    private MethodChannel channel;
    private Context context;
    private final StartAppKeeper<StartAppAd> fullScreenAdKeeper;
    private final StartAppKeeper<NativeAdDetails> nativeAdKeeper;
    private final StartAppSequence sequence;
    private Handler uiHandler;

    public StartAppSdkPlugin() {
        StartAppSequence startAppSequence = new StartAppSequence();
        this.sequence = startAppSequence;
        this.bannerAdKeeper = new StartAppKeeper<>(startAppSequence);
        this.fullScreenAdKeeper = new StartAppKeeper<>(startAppSequence);
        this.nativeAdKeeper = new StartAppKeeper<>(startAppSequence);
    }

    private void fillAdPreferences(AdPreferences adPreferences, Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("adTag");
            if (obj instanceof String) {
                adPreferences.setAdTag((String) obj);
            }
            Object obj2 = map.get("keywords");
            if (obj2 instanceof String) {
                adPreferences.setKeywords((String) obj2);
            }
            Object obj3 = map.get("gender");
            if (obj3 instanceof String) {
                adPreferences.setGender(SDKAdPreferences.Gender.parseString((String) obj3));
            }
            Object obj4 = map.get("age");
            if (obj4 instanceof Number) {
                adPreferences.setAge(Integer.valueOf(((Number) obj4).intValue()));
            } else if (obj4 instanceof String) {
                adPreferences.setAge((String) obj4);
            }
            Object obj5 = map.get("videoMuted");
            if (obj5 instanceof Boolean) {
                if (((Boolean) obj5).booleanValue()) {
                    adPreferences.muteVideo();
                }
            } else if ((obj5 instanceof String) && Boolean.parseBoolean((String) obj5)) {
                adPreferences.muteVideo();
            }
            Object obj6 = map.get("hardwareAccelerated");
            if (obj6 instanceof Boolean) {
                adPreferences.setHardwareAccelerated(((Boolean) obj6).booleanValue());
            } else if (obj6 instanceof String) {
                adPreferences.setHardwareAccelerated(Boolean.parseBoolean((String) obj6));
            }
            Object obj7 = map.get("categories");
            if (obj7 instanceof Iterable) {
                for (Object obj8 : (Iterable) obj7) {
                    if (obj8 instanceof String) {
                        adPreferences.addCategory((String) obj8);
                    }
                }
            }
            Object obj9 = map.get("categoriesExclude");
            if (obj9 instanceof Iterable) {
                for (Object obj10 : (Iterable) obj9) {
                    if (obj10 instanceof String) {
                        adPreferences.addCategoryExclude((String) obj10);
                    }
                }
            }
            Object obj11 = map.get("adType");
            if (obj11 instanceof String) {
                try {
                    adPreferences.setType(Ad.AdType.valueOf(((String) obj11).toUpperCase(Locale.ENGLISH)));
                } catch (RuntimeException unused) {
                }
            }
            Object obj12 = map.get("minCPM");
            if (obj12 instanceof Number) {
                try {
                    adPreferences.setMinCpm(Double.valueOf(((Number) obj12).doubleValue()));
                } catch (RuntimeException unused2) {
                }
            }
        }
    }

    private StartAppAd.AdMode getAdMode(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("mode");
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                return StartAppAd.AdMode.VIDEO;
            }
        }
        return StartAppAd.AdMode.AUTOMATIC;
    }

    private int handleMethodCall(Context context, String str, Object obj, MethodChannel.Result result, Object[] objArr) {
        str.getClass();
        switch (str) {
            case "loadInterstitialAd":
                loadFullScreenAd(context, null, (Map) obj, new StartAppMethodResultWrapper(result));
                return 2;
            case "loadRewardedVideoAd":
                loadFullScreenAd(context, StartAppAd.AdMode.REWARDED_VIDEO, (Map) obj, new StartAppMethodResultWrapper(result));
                return 2;
            case "setTestAdsEnabled":
                Boolean bool = Boolean.TRUE;
                StartAppSDK.setTestAdsEnabled(bool.equals(obj));
                objArr[0] = bool;
                return 1;
            case "showInterstitialAd":
                showFullScreenAd(context, false, (Map) obj, result);
                return 2;
            case "loadNativeAd":
                loadNativeAd(context, (Map) obj, new StartAppMethodResultWrapper(result));
                return 2;
            case "disableSplash":
                StartAppAd.disableSplash();
                objArr[0] = Boolean.TRUE;
                return 1;
            case "loadBannerAd":
                loadBannerAd(context, (Map) obj, new StartAppMethodResultWrapper(result));
                return 2;
            case "showRewardedVideoAd":
                showFullScreenAd(context, true, (Map) obj, result);
                return 2;
            case "getSdkVersion":
                objArr[0] = StartAppSDK.getVersion();
                return 1;
            default:
                return 0;
        }
    }

    private void loadBannerAd(Context context, Map<String, Object> map, final StartAppMethodResultWrapper startAppMethodResultWrapper) {
        final float f4 = context.getResources().getDisplayMetrics().density;
        AdPreferences adPreferences = new AdPreferences();
        fillAdPreferences(adPreferences, map);
        final Handler uiHandler = getUiHandler();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger();
        BannerListener bannerListener = new BannerListener() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.3
            @Override // com.startapp.sdk.ads.banner.BannerListener
            public void onClick(View view) {
                StartAppSdkPlugin.this.notifyAdEvent(atomicInteger.get(), "adClicked");
            }

            @Override // com.startapp.sdk.ads.banner.BannerListener
            public void onFailedToReceiveAd(View view) {
                final BannerStandard bannerStandard = (BannerStandard) atomicReference.get();
                uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.3.2
                    @Override // java.lang.Runnable
                    public void run() {
                        StartAppMethodResultWrapper startAppMethodResultWrapper2 = startAppMethodResultWrapper;
                        BannerStandard bannerStandard2 = bannerStandard;
                        startAppMethodResultWrapper2.error("failed_to_receive_ad", bannerStandard2 != null ? bannerStandard2.getErrorMessage() : null);
                    }
                });
            }

            @Override // com.startapp.sdk.ads.banner.BannerListener
            public void onImpression(View view) {
                StartAppSdkPlugin.this.notifyAdEvent(atomicInteger.get(), "adImpression");
            }

            @Override // com.startapp.sdk.ads.banner.BannerListener
            public void onReceiveAd(View view) {
                BannerStandard bannerStandard = (BannerStandard) atomicReference.get();
                if (bannerStandard == null) {
                    startAppMethodResultWrapper.error("internal_plugin_error", "banner_is_null");
                    return;
                }
                if (((Point) atomicReference2.get()) == null) {
                    startAppMethodResultWrapper.error("internal_plugin_error", "banner_size_is_null");
                    return;
                }
                int add = StartAppSdkPlugin.this.bannerAdKeeper.add(bannerStandard);
                atomicInteger.set(add);
                final HashMap hashMap = new HashMap();
                hashMap.put("id", Integer.valueOf(add));
                hashMap.put("width", Float.valueOf(StartAppSdkPlugin.magicFlutterDp(r1.x, f4)));
                hashMap.put("height", Float.valueOf(StartAppSdkPlugin.magicFlutterDp(r1.y, f4)));
                uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        startAppMethodResultWrapper.success(hashMap);
                    }
                });
            }
        };
        if (map != null) {
            Object obj = map.get("type");
            if (StartAppFlutterBanner.TYPE_MREC.equals(obj)) {
                atomicReference.set(new Mrec(context, adPreferences, bannerListener));
                atomicReference2.set(new Point(300, 250));
            } else if (StartAppFlutterBanner.TYPE_COVER.equals(obj)) {
                atomicReference.set(new Cover(context, adPreferences, bannerListener));
                atomicReference2.set(new Point(1200, 628));
            }
        }
        if (atomicReference.get() == null) {
            atomicReference.set(new Banner(context, adPreferences, bannerListener));
            atomicReference2.set(new Point(320, 50));
        }
        BannerStandard bannerStandard = (BannerStandard) atomicReference.get();
        if (bannerStandard == null) {
            startAppMethodResultWrapper.error("internal_plugin_error", "banner_not_created");
            return;
        }
        Point point = (Point) atomicReference2.get();
        if (point == null) {
            startAppMethodResultWrapper.error("internal_plugin_error", "size_not_created");
            return;
        }
        if (map != null) {
            Object obj2 = map.get("desiredWidth");
            if (obj2 instanceof Number) {
                Number number = (Number) obj2;
                if (point.x < number.intValue()) {
                    point.x = number.intValue();
                }
            }
            Object obj3 = map.get("desiredHeight");
            if (obj3 instanceof Number) {
                Number number2 = (Number) obj3;
                if (point.y < number2.intValue()) {
                    point.y = number2.intValue();
                }
            }
        }
        bannerStandard.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bannerStandard.loadAd(point.x, point.y);
        uiHandler.postDelayed(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.4
            @Override // java.lang.Runnable
            public void run() {
                startAppMethodResultWrapper.error("timeout", null);
            }
        }, 3000L);
    }

    private void loadFullScreenAd(Context context, StartAppAd.AdMode adMode, Map<String, Object> map, final StartAppMethodResultWrapper startAppMethodResultWrapper) {
        AdPreferences adPreferences = new AdPreferences();
        fillAdPreferences(adPreferences, map);
        if (adMode == null) {
            adMode = getAdMode(map);
        }
        final Handler uiHandler = getUiHandler();
        final StartAppAd startAppAd = new StartAppAd(context);
        startAppAd.loadAd(adMode, adPreferences, new AdEventListener() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.5
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onFailedToReceiveAd(final Ad ad) {
                uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.5.2
                    @Override // java.lang.Runnable
                    public void run() {
                        StartAppMethodResultWrapper startAppMethodResultWrapper2 = startAppMethodResultWrapper;
                        Ad ad2 = ad;
                        startAppMethodResultWrapper2.error("failed_to_receive_ad", ad2 != null ? ad2.getErrorMessage() : null);
                    }
                });
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onReceiveAd(Ad ad) {
                int add = StartAppSdkPlugin.this.fullScreenAdKeeper.add(startAppAd);
                final HashMap hashMap = new HashMap();
                hashMap.put("id", Integer.valueOf(add));
                uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        startAppMethodResultWrapper.success(hashMap);
                    }
                });
            }
        });
        uiHandler.postDelayed(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.6
            @Override // java.lang.Runnable
            public void run() {
                startAppMethodResultWrapper.error("timeout", null);
            }
        }, 3000L);
    }

    private void loadNativeAd(Context context, Map<String, Object> map, final StartAppMethodResultWrapper startAppMethodResultWrapper) {
        boolean z = false;
        NativeAdPreferences autoBitmapDownload = new NativeAdPreferences().setAdsNumber(1).setAutoBitmapDownload(false);
        fillAdPreferences(autoBitmapDownload, map);
        final Handler uiHandler = getUiHandler();
        final StartAppNativeAd startAppNativeAd = new StartAppNativeAd(context);
        try {
            z = ((Boolean) StartAppNativeAd.class.getDeclaredMethod("loadAd", NativeAdPreferences.class, AdEventListener.class).invoke(startAppNativeAd, autoBitmapDownload, new AdEventListener() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.9
                @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
                public void onFailedToReceiveAd(final Ad ad) {
                    uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.9.3
                        @Override // java.lang.Runnable
                        public void run() {
                            StartAppMethodResultWrapper startAppMethodResultWrapper2 = startAppMethodResultWrapper;
                            Ad ad2 = ad;
                            startAppMethodResultWrapper2.error("failed_to_receive_ad", ad2 != null ? ad2.getErrorMessage() : null);
                        }
                    });
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
                public void onReceiveAd(Ad ad) {
                    ArrayList<NativeAdDetails> nativeAds = startAppNativeAd.getNativeAds();
                    if (nativeAds == null || nativeAds.size() < 1 || nativeAds.get(0) == null) {
                        uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                startAppMethodResultWrapper.error("no_fill", null);
                            }
                        });
                        return;
                    }
                    NativeAdDetails nativeAdDetails = nativeAds.get(0);
                    int add = StartAppSdkPlugin.this.nativeAdKeeper.add(nativeAdDetails);
                    final HashMap hashMap = new HashMap();
                    hashMap.put("id", Integer.valueOf(add));
                    StartAppSdkPlugin.putIfNotNull(hashMap, "title", nativeAdDetails.getTitle());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "description", nativeAdDetails.getDescription());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "rating", Float.valueOf(nativeAdDetails.getRating()));
                    StartAppSdkPlugin.putIfNotNull(hashMap, "installs", nativeAdDetails.getInstalls());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "category", nativeAdDetails.getCategory());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "campaign", nativeAdDetails.getCampaignAction() != null ? nativeAdDetails.getCampaignAction().name() : null);
                    StartAppSdkPlugin.putIfNotNull(hashMap, "callToAction", nativeAdDetails.getCallToAction());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "imageUrl", nativeAdDetails.getImageUrl());
                    StartAppSdkPlugin.putIfNotNull(hashMap, "secondaryImageUrl", nativeAdDetails.getSecondaryImageUrl());
                    uiHandler.post(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.9.2
                        @Override // java.lang.Runnable
                        public void run() {
                            startAppMethodResultWrapper.success(hashMap);
                        }
                    });
                }
            })).booleanValue();
        } catch (ReflectiveOperationException e4) {
            startAppMethodResultWrapper.error("internal_sdk_error", e4.toString());
        }
        if (z) {
            uiHandler.postDelayed(new Runnable() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.10
                @Override // java.lang.Runnable
                public void run() {
                    startAppMethodResultWrapper.error("timeout", null);
                }
            }, 3000L);
        } else {
            startAppMethodResultWrapper.error("loading_error", startAppNativeAd.getErrorMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float magicFlutterDp(float f4, float f5) {
        return (float) (Math.ceil((Math.ceil(f4 * f5) * 10.0d) / f5) / 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAdEvent(int i4, String str) {
        if (this.channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i4));
            hashMap.put("event", str);
            this.channel.invokeMethod("onAdEvent", hashMap);
        }
    }

    public static <K, V> void putIfNotNull(Map<K, V> map, K k4, V v) {
        if (v != null) {
            map.put(k4, v);
        }
    }

    private void showFullScreenAd(Context context, boolean z, Map<String, Object> map, MethodChannel.Result result) {
        if (map == null) {
            result.error("no_id", null, null);
            return;
        }
        Object obj = map.get("id");
        if (!(obj instanceof Integer)) {
            result.error("invalid_id", null, null);
            return;
        }
        final int intValue = ((Integer) obj).intValue();
        StartAppAd startAppAd = this.fullScreenAdKeeper.get(intValue);
        if (startAppAd == null) {
            result.error("ad_not_found", null, null);
            return;
        }
        if (z) {
            startAppAd.setVideoListener(new VideoListener() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.7
                @Override // com.startapp.sdk.adsbase.adlisteners.VideoListener
                public void onVideoCompleted() {
                    StartAppSdkPlugin.this.notifyAdEvent(intValue, "videoCompleted");
                }
            });
        }
        result.success(Boolean.valueOf(startAppAd.showAd(new AdDisplayListener() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.8
            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public void adClicked(Ad ad) {
                StartAppSdkPlugin.this.notifyAdEvent(intValue, "adClicked");
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public void adDisplayed(Ad ad) {
                StartAppSdkPlugin.this.notifyAdEvent(intValue, "adDisplayed");
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public void adHidden(Ad ad) {
                StartAppSdkPlugin.this.notifyAdEvent(intValue, "adHidden");
                StartAppSdkPlugin.this.fullScreenAdKeeper.remove(intValue);
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
            public void adNotDisplayed(Ad ad) {
                StartAppSdkPlugin.this.notifyAdEvent(intValue, "adNotDisplayed");
                StartAppSdkPlugin.this.fullScreenAdKeeper.remove(intValue);
            }
        })));
    }

    public Handler getUiHandler() {
        Handler handler = this.uiHandler;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.uiHandler = handler2;
        return handler2;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("com.startapp.flutter.Banner", new StartAppViewFactory(new StartAppViewFactory.FactoryMethod<StartAppView>() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.1
            @Override // com.startapp.flutter.sdk.StartAppViewFactory.FactoryMethod
            public StartAppView newInstance() {
                return new StartAppFlutterBanner(StartAppSdkPlugin.this.bannerAdKeeper);
            }
        }));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("com.startapp.flutter.Native", new StartAppViewFactory(new StartAppViewFactory.FactoryMethod<StartAppView>() { // from class: com.startapp.flutter.sdk.StartAppSdkPlugin.2
            @Override // com.startapp.flutter.sdk.StartAppViewFactory.FactoryMethod
            public StartAppView newInstance() {
                return new StartAppFlutterNative(StartAppSdkPlugin.this.nativeAdKeeper);
            }
        }));
        if (this.channel == null) {
            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.startapp.flutter");
            this.channel = methodChannel;
            methodChannel.setMethodCallHandler(this);
        }
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.context = applicationContext;
        StartAppSDK.addWrapper(applicationContext, PluginErrorDetails.Platform.FLUTTER, BuildConfig.VERSION_NAME);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Context context;
        try {
            context = this.context;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (context == null) {
                result.error(null, null, null);
                return;
            }
            Object[] objArr = {null};
            int handleMethodCall = handleMethodCall(context, methodCall.method, methodCall.arguments, result, objArr);
            if (handleMethodCall == 0) {
                result.notImplemented();
            } else if (handleMethodCall == 1) {
                result.success(objArr[0]);
            }
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            result.error(th3.getClass().getName(), th3.getMessage(), null);
        }
    }
}
