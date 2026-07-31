package com.rnstartiosdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.margelo.nitro.NitroModules;
import com.margelo.nitro.core.Promise;
import com.margelo.nitro.rnstartiosdk.AdPreferenceGender;
import com.margelo.nitro.rnstartiosdk.AdResultType;
import com.margelo.nitro.rnstartiosdk.AdType;
import com.margelo.nitro.rnstartiosdk.CampaignAction;
import com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec;
import com.margelo.nitro.rnstartiosdk.InitializeSdkParams;
import com.margelo.nitro.rnstartiosdk.NativeAdDetails;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import com.rnstartiosdk.RNStartIoSdk;
import com.startapp.sdk.ads.nativead.NativeAdPreferences;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.SDKAdPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: RNStartIoSdk.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001d\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n\u0018\u00010\u001fH\u0016J5\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u001a2\u0006\u0010$\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001cH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/rnstartiosdk/RNStartIoSdk;", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoSdkSpec;", "<init>", "()V", "interstitialAdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/startapp/sdk/adsbase/StartAppAd;", "mainHandler", "Landroid/os/Handler;", "runWhenSdkReady", "", "onReady", "Lkotlin/Function0;", "onTimeout", "initializeSdk", OutcomeEventsTable.COLUMN_NAME_PARAMS, "Lcom/margelo/nitro/rnstartiosdk/InitializeSdkParams;", "setUserConsent", "currentTimeMillis", "", "userConsent", "", "setIABUSPrivacyString", "iabusPrivacyString", "", "loadAd", "Lcom/margelo/nitro/core/Promise;", "adType", "Lcom/margelo/nitro/rnstartiosdk/AdType;", "showAd", "adResultCallback", "Lkotlin/Function1;", "Lcom/margelo/nitro/rnstartiosdk/AdResultType;", "loadNativeAds", "", "Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "numberOfAds", "primaryImageSize", "secondaryImageSize", "(DLjava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/core/Promise;", "convertAdTypeEnumSafe", "Lcom/startapp/sdk/adsbase/StartAppAd$AdMode;", "source", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNStartIoSdk extends HybridRNStartIoSdkSpec {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG;
    private static final MutableStateFlow<Boolean> initializedFlow;
    private final MutableStateFlow<StartAppAd> interstitialAdFlow = StateFlowKt.MutableStateFlow(null);
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    /* compiled from: RNStartIoSdk.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.FULLPAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdType.AUTOMATIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RNStartIoSdk.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/rnstartiosdk/RNStartIoSdk$Companion;", "", "<init>", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "initializedFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getInitializedFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLOG_TAG() {
            return RNStartIoSdk.LOG_TAG;
        }

        public final MutableStateFlow<Boolean> getInitializedFlow() {
            return RNStartIoSdk.initializedFlow;
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("RNStartIoSdk", "getSimpleName(...)");
        LOG_TAG = "RNStartIoSdk";
        initializedFlow = StateFlowKt.MutableStateFlow(false);
    }

    private final void runWhenSdkReady(Function0<Unit> onReady, Function0<Unit> onTimeout) {
        runWhenSdkReady$tryRun(onReady, new Ref.IntRef(), 50, onTimeout, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runWhenSdkReady$tryRun(final Function0<Unit> function0, final Ref.IntRef intRef, final int i, final Function0<Unit> function02, final RNStartIoSdk rNStartIoSdk) {
        if (Intrinsics.areEqual((Object) initializedFlow.getValue(), (Object) true)) {
            function0.invoke();
            return;
        }
        intRef.element++;
        if (intRef.element >= i) {
            function02.invoke();
        } else {
            rNStartIoSdk.mainHandler.postDelayed(new Runnable() { // from class: com.rnstartiosdk.RNStartIoSdk$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    RNStartIoSdk.runWhenSdkReady$tryRun(Function0.this, intRef, i, function02, rNStartIoSdk);
                }
            }, 400L);
        }
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public void initializeSdk(InitializeSdkParams params) {
        ReactApplicationContext applicationContext;
        Context applicationContext2;
        SDKAdPreferences.Gender gender;
        Intrinsics.checkNotNullParameter(params, "params");
        StartAppSDK.setTestAdsEnabled(Intrinsics.areEqual((Object) params.getTestAd(), (Object) true));
        if (Intrinsics.areEqual((Object) initializedFlow.getValue(), (Object) true) || params.getAndroidAppId() == null || (applicationContext = NitroModules.INSTANCE.getApplicationContext()) == null || (applicationContext2 = applicationContext.getApplicationContext()) == null) {
            return;
        }
        SDKAdPreferences sDKAdPreferences = new SDKAdPreferences();
        if (params.getAdPreferences() != null) {
            if (params.getAdPreferences().getAge() != null) {
                sDKAdPreferences.setAge(params.getAdPreferences().getAge().toString());
            }
            if (params.getAdPreferences().getGender() != null) {
                if (params.getAdPreferences().getGender() == AdPreferenceGender.MALE) {
                    gender = SDKAdPreferences.Gender.MALE;
                } else {
                    gender = SDKAdPreferences.Gender.FEMALE;
                }
                sDKAdPreferences.setGender(gender);
            }
        }
        StartAppSDK.initParams(applicationContext2, params.getAndroidAppId()).setReturnAdsEnabled(Intrinsics.areEqual((Object) params.getReturnAd(), (Object) true)).setSdkAdPrefs(sDKAdPreferences).setCallback(new Runnable() { // from class: com.rnstartiosdk.RNStartIoSdk$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RNStartIoSdk.initializeSdk$lambda$2$lambda$1();
            }
        }).init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeSdk$lambda$2$lambda$1() {
        initializedFlow.setValue(true);
        Log.d(LOG_TAG, "Start.io SDK Initialized");
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public void setUserConsent(double currentTimeMillis, boolean userConsent) {
        Context applicationContext;
        ReactApplicationContext applicationContext2 = NitroModules.INSTANCE.getApplicationContext();
        if (applicationContext2 != null && (applicationContext = applicationContext2.getApplicationContext()) != null) {
            StartAppSDK.setUserConsent(applicationContext, "pas", (long) currentTimeMillis, userConsent);
        }
        Log.d(LOG_TAG, "Start.io SDK user consent set to " + userConsent);
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public void setIABUSPrivacyString(String iabusPrivacyString) {
        Context applicationContext;
        Intrinsics.checkNotNullParameter(iabusPrivacyString, "iabusPrivacyString");
        ReactApplicationContext applicationContext2 = NitroModules.INSTANCE.getApplicationContext();
        if (applicationContext2 != null && (applicationContext = applicationContext2.getApplicationContext()) != null) {
            SharedPreferences extras = StartAppSDK.getExtras(applicationContext);
            Intrinsics.checkNotNullExpressionValue(extras, "getExtras(...)");
            SharedPreferences.Editor edit = extras.edit();
            edit.putString("IABUSPrivacy_String", iabusPrivacyString);
            edit.apply();
        }
        Log.d(LOG_TAG, "Start.io SDK IABUSPrivacy String set to " + iabusPrivacyString);
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public Promise<Unit> loadAd(final AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        final Promise<Unit> promise = new Promise<>();
        ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
        final Context applicationContext2 = applicationContext != null ? applicationContext.getApplicationContext() : null;
        if (applicationContext2 == null) {
            promise.reject(new Throwable("Ad load failed, unable to get application context"));
            return promise;
        }
        runWhenSdkReady(new Function0() { // from class: com.rnstartiosdk.RNStartIoSdk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit loadAd$lambda$7;
                loadAd$lambda$7 = RNStartIoSdk.loadAd$lambda$7(RNStartIoSdk.this, adType, applicationContext2, promise);
                return loadAd$lambda$7;
            }
        }, new Function0() { // from class: com.rnstartiosdk.RNStartIoSdk$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit loadAd$lambda$8;
                loadAd$lambda$8 = RNStartIoSdk.loadAd$lambda$8(Promise.this);
                return loadAd$lambda$8;
            }
        });
        return promise;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAd$lambda$7(final RNStartIoSdk rNStartIoSdk, AdType adType, Context context, final Promise promise) {
        StartAppAd.AdMode convertAdTypeEnumSafe = rNStartIoSdk.convertAdTypeEnumSafe(adType);
        Log.d(LOG_TAG, "loadAd: mode=" + convertAdTypeEnumSafe + " sdkReady=" + initializedFlow.getValue());
        final StartAppAd startAppAd = new StartAppAd(context);
        startAppAd.loadAd(convertAdTypeEnumSafe, new AdEventListener() { // from class: com.rnstartiosdk.RNStartIoSdk$loadAd$1$1$1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onReceiveAd(Ad ad) {
                RNStartIoSdk.Companion companion;
                MutableStateFlow mutableStateFlow;
                Intrinsics.checkNotNullParameter(ad, "ad");
                companion = RNStartIoSdk.Companion;
                Log.v(companion.getLOG_TAG(), "loadAd: onReceiveAd");
                mutableStateFlow = RNStartIoSdk.this.interstitialAdFlow;
                mutableStateFlow.setValue(startAppAd);
                promise.resolve(Unit.INSTANCE);
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onFailedToReceiveAd(Ad ad) {
                RNStartIoSdk.Companion companion;
                MutableStateFlow mutableStateFlow;
                String str;
                companion = RNStartIoSdk.Companion;
                Log.w(companion.getLOG_TAG(), "loadAd: onFailedToReceiveAd: " + (ad != null ? ad.getErrorMessage() : null));
                mutableStateFlow = RNStartIoSdk.this.interstitialAdFlow;
                mutableStateFlow.setValue(null);
                Promise<Unit> promise2 = promise;
                if (ad == null || (str = ad.getErrorMessage()) == null) {
                    str = "Ad load failed";
                }
                promise2.reject(new Throwable(str));
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAd$lambda$8(Promise promise) {
        Log.w(LOG_TAG, "loadAd: SDK init timed out");
        promise.reject(new Throwable("Start.io SDK not initialized"));
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public void showAd(final Function1<? super AdResultType, Unit> adResultCallback) {
        StartAppAd value = this.interstitialAdFlow.getValue();
        if (value != null) {
            this.interstitialAdFlow.setValue(null);
            value.setVideoListener(new VideoListener() { // from class: com.rnstartiosdk.RNStartIoSdk$$ExternalSyntheticLambda3
                @Override // com.startapp.sdk.adsbase.adlisteners.VideoListener
                public final void onVideoCompleted() {
                    RNStartIoSdk.showAd$lambda$10$lambda$9(Function1.this);
                }
            });
            value.showAd(new AdDisplayListener() { // from class: com.rnstartiosdk.RNStartIoSdk$showAd$1$2
                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public void adHidden(Ad ad) {
                    RNStartIoSdk.Companion companion;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    companion = RNStartIoSdk.Companion;
                    Log.v(companion.getLOG_TAG(), "showInterstitial: adHidden");
                    Function1<AdResultType, Unit> function1 = adResultCallback;
                    if (function1 != null) {
                        function1.invoke(AdResultType.ADHIDDEN);
                    }
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public void adDisplayed(Ad ad) {
                    RNStartIoSdk.Companion companion;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    companion = RNStartIoSdk.Companion;
                    Log.v(companion.getLOG_TAG(), "showInterstitial: adDisplayed");
                    Function1<AdResultType, Unit> function1 = adResultCallback;
                    if (function1 != null) {
                        function1.invoke(AdResultType.ADDISPLAYED);
                    }
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public void adClicked(Ad ad) {
                    RNStartIoSdk.Companion companion;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    companion = RNStartIoSdk.Companion;
                    Log.v(companion.getLOG_TAG(), "showInterstitial: adClicked");
                    Function1<AdResultType, Unit> function1 = adResultCallback;
                    if (function1 != null) {
                        function1.invoke(AdResultType.ADCLICKED);
                    }
                }

                @Override // com.startapp.sdk.adsbase.adlisteners.AdDisplayListener
                public void adNotDisplayed(Ad ad) {
                    RNStartIoSdk.Companion companion;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    companion = RNStartIoSdk.Companion;
                    Log.v(companion.getLOG_TAG(), "showInterstitial: adNotDisplayed");
                    Function1<AdResultType, Unit> function1 = adResultCallback;
                    if (function1 != null) {
                        function1.invoke(AdResultType.ADNOTDISPLAYED);
                    }
                }
            });
        } else if (adResultCallback != null) {
            adResultCallback.invoke(AdResultType.ADNOTDISPLAYED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAd$lambda$10$lambda$9(Function1 function1) {
        Log.v(LOG_TAG, "showInterstitial: User gained a reward");
        if (function1 != null) {
            function1.invoke(AdResultType.ADREWARDED);
        }
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoSdkSpec
    public Promise<NativeAdDetails[]> loadNativeAds(double numberOfAds, Double primaryImageSize, Double secondaryImageSize) {
        final Promise<NativeAdDetails[]> promise = new Promise<>();
        ReactApplicationContext applicationContext = NitroModules.INSTANCE.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext);
        final StartAppNativeAd startAppNativeAd = new StartAppNativeAd(applicationContext);
        NativeAdPreferences nativeAdPreferences = new NativeAdPreferences();
        nativeAdPreferences.setAdsNumber((int) numberOfAds);
        if (primaryImageSize != null) {
            nativeAdPreferences.setPrimaryImageSize((int) primaryImageSize.doubleValue());
        }
        if (secondaryImageSize != null) {
            nativeAdPreferences.setSecondaryImageSize((int) secondaryImageSize.doubleValue());
        }
        startAppNativeAd.setPreferences(nativeAdPreferences);
        startAppNativeAd.loadAd(new AdEventListener() { // from class: com.rnstartiosdk.RNStartIoSdk$loadNativeAds$1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onReceiveAd(Ad ad) {
                RNStartIoSdk.Companion companion;
                CampaignAction campaignAction;
                Intrinsics.checkNotNullParameter(ad, "ad");
                companion = RNStartIoSdk.Companion;
                Log.v(companion.getLOG_TAG(), "loadNative: onReceiveAds");
                ArrayList<com.startapp.sdk.ads.nativead.NativeAdDetails> nativeAds = StartAppNativeAd.this.getNativeAds();
                if (nativeAds != null && !nativeAds.isEmpty()) {
                    NativeAdDetails[] nativeAdDetailsArr = new NativeAdDetails[0];
                    Iterator<com.startapp.sdk.ads.nativead.NativeAdDetails> it = nativeAds.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
                        com.startapp.sdk.ads.nativead.NativeAdDetails next = it.next();
                        String title = next.getTitle();
                        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                        String description = next.getDescription();
                        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                        double rating = next.getRating();
                        String imageUrl = next.getImageUrl();
                        String secondaryImageUrl = next.getSecondaryImageUrl();
                        String installs = next.getInstalls();
                        Intrinsics.checkNotNullExpressionValue(installs, "getInstalls(...)");
                        String category = next.getCategory();
                        Intrinsics.checkNotNullExpressionValue(category, "getCategory(...)");
                        String packageName = next.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        Iterator<com.startapp.sdk.ads.nativead.NativeAdDetails> it2 = it;
                        if (Intrinsics.areEqual(next.getCampaignAction().name(), "LAUNCH_APP")) {
                            campaignAction = CampaignAction.LAUNCH_APP;
                        } else {
                            campaignAction = CampaignAction.OPEN_MARKET;
                        }
                        CampaignAction campaignAction2 = campaignAction;
                        String callToAction = next.getCallToAction();
                        Intrinsics.checkNotNullExpressionValue(callToAction, "getCallToAction(...)");
                        nativeAdDetailsArr = (NativeAdDetails[]) ArraysKt.plus(nativeAdDetailsArr, new NativeAdDetails(title, description, rating, imageUrl, secondaryImageUrl, installs, category, packageName, campaignAction2, callToAction));
                        it = it2;
                    }
                    NativeAdState.INSTANCE.updateState(nativeAds);
                    promise.resolve(nativeAdDetailsArr);
                    return;
                }
                promise.reject(new Throwable("No ads available"));
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onFailedToReceiveAd(Ad ad) {
                RNStartIoSdk.Companion companion;
                companion = RNStartIoSdk.Companion;
                Log.v(companion.getLOG_TAG(), "loadNative: onFailedToReceiveAds: " + (ad != null ? ad.getErrorMessage() : null));
                promise.reject(new Throwable("Failed to load native ads"));
            }
        });
        return promise;
    }

    private final StartAppAd.AdMode convertAdTypeEnumSafe(AdType source) {
        int i = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
        if (i == 1) {
            return StartAppAd.AdMode.REWARDED_VIDEO;
        }
        if (i == 2) {
            return StartAppAd.AdMode.VIDEO;
        }
        if (i == 3) {
            return StartAppAd.AdMode.FULLPAGE;
        }
        if (i == 4) {
            return StartAppAd.AdMode.AUTOMATIC;
        }
        return StartAppAd.AdMode.AUTOMATIC;
    }
}
