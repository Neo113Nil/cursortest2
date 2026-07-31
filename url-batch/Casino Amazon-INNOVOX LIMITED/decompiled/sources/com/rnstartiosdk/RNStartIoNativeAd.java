package com.rnstartiosdk;

import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.margelo.nitro.rnstartiosdk.CampaignAction;
import com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdSpec;
import com.margelo.nitro.rnstartiosdk.NativeAdDetails;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RNStartIoNativeAd.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/rnstartiosdk/RNStartIoNativeAd;", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoNativeAdSpec;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "onLoadAd", "Lkotlin/Function1;", "Lcom/margelo/nitro/rnstartiosdk/NativeAdDetails;", "", "getOnLoadAd", "()Lkotlin/jvm/functions/Function1;", "setOnLoadAd", "(Lkotlin/jvm/functions/Function1;)V", "onLoadError", "", "getOnLoadError", "setOnLoadError", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNStartIoNativeAd extends HybridRNStartIoNativeAdSpec {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG;
    private final ThemedReactContext context;
    private Function1<? super NativeAdDetails, Unit> onLoadAd;
    private Function1<? super String, Unit> onLoadError;
    private final View view;

    /* compiled from: RNStartIoNativeAd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/rnstartiosdk/RNStartIoNativeAd$Companion;", "", "<init>", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLOG_TAG() {
            return RNStartIoNativeAd.LOG_TAG;
        }
    }

    public RNStartIoNativeAd(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.view = new View(context);
        this.onLoadAd = new Function1() { // from class: com.rnstartiosdk.RNStartIoNativeAd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onLoadAd$lambda$0;
                onLoadAd$lambda$0 = RNStartIoNativeAd.onLoadAd$lambda$0((NativeAdDetails) obj);
                return onLoadAd$lambda$0;
            }
        };
        this.onLoadError = new Function1() { // from class: com.rnstartiosdk.RNStartIoNativeAd$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onLoadError$lambda$1;
                onLoadError$lambda$1 = RNStartIoNativeAd.onLoadError$lambda$1((String) obj);
                return onLoadError$lambda$1;
            }
        };
        final StartAppNativeAd startAppNativeAd = new StartAppNativeAd(context);
        startAppNativeAd.loadAd(new AdEventListener() { // from class: com.rnstartiosdk.RNStartIoNativeAd.1
            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onReceiveAd(Ad ad) {
                CampaignAction campaignAction;
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.v(RNStartIoNativeAd.Companion.getLOG_TAG(), "loadNative: onReceiveAd");
                ArrayList<com.startapp.sdk.ads.nativead.NativeAdDetails> nativeAds = StartAppNativeAd.this.getNativeAds();
                if (nativeAds != null && !nativeAds.isEmpty()) {
                    com.startapp.sdk.ads.nativead.NativeAdDetails nativeAdDetails = nativeAds.get(0);
                    if (nativeAdDetails != null) {
                        nativeAdDetails.registerViewForInteraction(this.getView());
                        Function1<NativeAdDetails, Unit> onLoadAd = this.getOnLoadAd();
                        String title = nativeAdDetails.getTitle();
                        Intrinsics.checkNotNullExpressionValue(title, "getTitle(...)");
                        String description = nativeAdDetails.getDescription();
                        Intrinsics.checkNotNullExpressionValue(description, "getDescription(...)");
                        double rating = nativeAdDetails.getRating();
                        String imageUrl = nativeAdDetails.getImageUrl();
                        String secondaryImageUrl = nativeAdDetails.getSecondaryImageUrl();
                        String installs = nativeAdDetails.getInstalls();
                        Intrinsics.checkNotNullExpressionValue(installs, "getInstalls(...)");
                        String category = nativeAdDetails.getCategory();
                        Intrinsics.checkNotNullExpressionValue(category, "getCategory(...)");
                        String packageName = nativeAdDetails.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        if (Intrinsics.areEqual(nativeAdDetails.getCampaignAction().name(), "LAUNCH_APP")) {
                            campaignAction = CampaignAction.LAUNCH_APP;
                        } else {
                            campaignAction = CampaignAction.OPEN_MARKET;
                        }
                        String callToAction = nativeAdDetails.getCallToAction();
                        Intrinsics.checkNotNullExpressionValue(callToAction, "getCallToAction(...)");
                        onLoadAd.invoke(new NativeAdDetails(title, description, rating, imageUrl, secondaryImageUrl, installs, category, packageName, campaignAction, callToAction));
                        return;
                    }
                    Function1<String, Unit> onLoadError = this.getOnLoadError();
                    if (onLoadError != null) {
                        onLoadError.invoke("No ads available");
                        return;
                    }
                    return;
                }
                Function1<String, Unit> onLoadError2 = this.getOnLoadError();
                if (onLoadError2 != null) {
                    onLoadError2.invoke("No ads available");
                }
            }

            @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
            public void onFailedToReceiveAd(Ad ad) {
                String str;
                Log.v(RNStartIoNativeAd.Companion.getLOG_TAG(), "loadNative: onFailedToReceiveAd: " + (ad != null ? ad.getErrorMessage() : null));
                Function1<String, Unit> onLoadError = this.getOnLoadError();
                if (onLoadError != null) {
                    if (ad == null || (str = ad.getErrorMessage()) == null) {
                        str = "Failed to load error";
                    }
                    onLoadError.invoke(str);
                }
            }
        });
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    static {
        Intrinsics.checkNotNullExpressionValue("RNStartIoNativeAd", "getSimpleName(...)");
        LOG_TAG = "RNStartIoNativeAd";
    }

    @Override // com.margelo.nitro.views.HybridView
    public View getView() {
        return this.view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoadAd$lambda$0(NativeAdDetails it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdSpec
    public Function1<NativeAdDetails, Unit> getOnLoadAd() {
        return this.onLoadAd;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdSpec
    public void setOnLoadAd(Function1<? super NativeAdDetails, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onLoadAd = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoadError$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdSpec
    public Function1<String, Unit> getOnLoadError() {
        return this.onLoadError;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoNativeAdSpec
    public void setOnLoadError(Function1<? super String, Unit> function1) {
        this.onLoadError = function1;
    }
}
