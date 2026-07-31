package com.rnstartiosdk;

import android.util.Log;
import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.margelo.nitro.rnstartiosdk.BannerFormat;
import com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec;
import com.rnstartiosdk.RNStartIoBanner;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: RNStartIoBanner.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010<\u001a\u00020%H\u0002J\b\u0010=\u001a\u00020%H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0017H\u0002J\b\u0010A\u001a\u00020%H\u0002J\b\u0010B\u001a\u00020%H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0010X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001d@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020%\u0018\u00010$X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00103\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\"\u00106\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R \u00109\u001a\b\u0012\u0004\u0012\u00020%0+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/¨\u0006D"}, d2 = {"Lcom/rnstartiosdk/RNStartIoBanner;", "Lcom/margelo/nitro/rnstartiosdk/HybridRNStartIoBannerSpec;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "getContext", "()Lcom/facebook/react/uimanager/ThemedReactContext;", "isAdLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "bannerRequest", "Lcom/startapp/sdk/ads/banner/BannerRequest;", "customView", "Lcom/rnstartiosdk/CustomView;", "view", "getView", "()Lcom/rnstartiosdk/CustomView;", "setView", "(Lcom/rnstartiosdk/CustomView;)V", "value", "Lcom/margelo/nitro/rnstartiosdk/BannerFormat;", "format", "getFormat", "()Lcom/margelo/nitro/rnstartiosdk/BannerFormat;", "setFormat", "(Lcom/margelo/nitro/rnstartiosdk/BannerFormat;)V", "", "adTag", "getAdTag", "()Ljava/lang/String;", "setAdTag", "(Ljava/lang/String;)V", "onLoadError", "Lkotlin/Function1;", "", "getOnLoadError", "()Lkotlin/jvm/functions/Function1;", "setOnLoadError", "(Lkotlin/jvm/functions/Function1;)V", "onReceiveAd", "Lkotlin/Function0;", "getOnReceiveAd", "()Lkotlin/jvm/functions/Function0;", "setOnReceiveAd", "(Lkotlin/jvm/functions/Function0;)V", "onFailedToReceiveAd", "getOnFailedToReceiveAd", "setOnFailedToReceiveAd", "onImpression", "getOnImpression", "setOnImpression", ViewProps.ON_CLICK, "getOnClick", "setOnClick", "onDisappear", "getOnDisappear", "setOnDisappear", "updateFormat", "updateAdTag", "convertBannerFormatEnumSafe", "Lcom/startapp/sdk/ads/banner/BannerFormat;", "source", "onViewAppear", "onViewDisappear", "Companion", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RNStartIoBanner extends HybridRNStartIoBannerSpec {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG;
    private String adTag;
    private final BannerRequest bannerRequest;
    private final ThemedReactContext context;
    private CustomView customView;
    private BannerFormat format;
    private final MutableStateFlow<Boolean> isAdLoading;
    private Function0<Unit> onClick;
    private Function0<Unit> onDisappear;
    private Function0<Unit> onFailedToReceiveAd;
    private Function0<Unit> onImpression;
    private Function1<? super String, Unit> onLoadError;
    private Function0<Unit> onReceiveAd;
    private final CoroutineScope uiScope;
    private CustomView view;

    /* compiled from: RNStartIoBanner.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ EnumEntries<com.startapp.sdk.ads.banner.BannerFormat> entries$0 = EnumEntriesKt.enumEntries(com.startapp.sdk.ads.banner.BannerFormat.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RNStartIoBanner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/rnstartiosdk/RNStartIoBanner$Companion;", "", "<init>", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "react-native-start-io-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getLOG_TAG() {
            return RNStartIoBanner.LOG_TAG;
        }
    }

    public RNStartIoBanner(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.isAdLoading = StateFlowKt.MutableStateFlow(false);
        this.uiScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.bannerRequest = new BannerRequest(context);
        CustomView customView = new CustomView(context, new Function1() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customView$lambda$0;
                customView$lambda$0 = RNStartIoBanner.customView$lambda$0(RNStartIoBanner.this, ((Boolean) obj).booleanValue());
                return customView$lambda$0;
            }
        });
        this.customView = customView;
        this.view = customView;
        this.format = BannerFormat.BANNER;
        this.onLoadError = new Function1() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onLoadError$lambda$1;
                onLoadError$lambda$1 = RNStartIoBanner.onLoadError$lambda$1((String) obj);
                return onLoadError$lambda$1;
            }
        };
        this.onReceiveAd = new Function0() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.onFailedToReceiveAd = new Function0() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.onImpression = new Function0() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.onClick = new Function0() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
        this.onDisappear = new Function0() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        };
    }

    public final ThemedReactContext getContext() {
        return this.context;
    }

    static {
        Intrinsics.checkNotNullExpressionValue("RNStartIoBanner", "getSimpleName(...)");
        LOG_TAG = "RNStartIoBanner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit customView$lambda$0(RNStartIoBanner rNStartIoBanner, boolean z) {
        if (z) {
            rNStartIoBanner.onViewAppear();
        } else {
            rNStartIoBanner.onViewDisappear();
        }
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.views.HybridView
    public CustomView getView() {
        return this.view;
    }

    public void setView(CustomView customView) {
        Intrinsics.checkNotNullParameter(customView, "<set-?>");
        this.view = customView;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public BannerFormat getFormat() {
        return this.format;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setFormat(BannerFormat value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.format = value;
        BuildersKt__Builders_commonKt.launch$default(this.uiScope, null, null, new RNStartIoBanner$format$1(this, null), 3, null);
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public String getAdTag() {
        return this.adTag;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setAdTag(String str) {
        this.adTag = str;
        BuildersKt__Builders_commonKt.launch$default(this.uiScope, null, null, new RNStartIoBanner$adTag$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLoadError$lambda$1(String str) {
        return Unit.INSTANCE;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function1<String, Unit> getOnLoadError() {
        return this.onLoadError;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnLoadError(Function1<? super String, Unit> function1) {
        this.onLoadError = function1;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function0<Unit> getOnReceiveAd() {
        return this.onReceiveAd;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnReceiveAd(Function0<Unit> function0) {
        this.onReceiveAd = function0;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function0<Unit> getOnFailedToReceiveAd() {
        return this.onFailedToReceiveAd;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnFailedToReceiveAd(Function0<Unit> function0) {
        this.onFailedToReceiveAd = function0;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function0<Unit> getOnImpression() {
        return this.onImpression;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnImpression(Function0<Unit> function0) {
        this.onImpression = function0;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnClick(Function0<Unit> function0) {
        this.onClick = function0;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public Function0<Unit> getOnDisappear() {
        return this.onDisappear;
    }

    @Override // com.margelo.nitro.rnstartiosdk.HybridRNStartIoBannerSpec
    public void setOnDisappear(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onDisappear = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFormat() {
        this.bannerRequest.setAdFormat(convertBannerFormatEnumSafe(getFormat()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdTag() {
        AdPreferences adPreferences = new AdPreferences();
        if (getAdTag() != null) {
            adPreferences.setAdTag(getAdTag());
        }
        this.bannerRequest.setAdPreferences(adPreferences);
        onViewAppear();
    }

    private final com.startapp.sdk.ads.banner.BannerFormat convertBannerFormatEnumSafe(BannerFormat source) {
        Object obj;
        Iterator<E> it = EntriesMappings.entries$0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((com.startapp.sdk.ads.banner.BannerFormat) obj).name(), source.name())) {
                break;
            }
        }
        com.startapp.sdk.ads.banner.BannerFormat bannerFormat = (com.startapp.sdk.ads.banner.BannerFormat) obj;
        return bannerFormat == null ? com.startapp.sdk.ads.banner.BannerFormat.BANNER : bannerFormat;
    }

    private final void onViewAppear() {
        try {
            this.bannerRequest.load(new BannerRequest.Callback() { // from class: com.rnstartiosdk.RNStartIoBanner$$ExternalSyntheticLambda0
                @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
                public final void onFinished(BannerCreator bannerCreator, String str) {
                    RNStartIoBanner.onViewAppear$lambda$8(RNStartIoBanner.this, bannerCreator, str);
                }
            });
        } catch (Throwable th) {
            Log.e(LOG_TAG, "Failed to request banner ad!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewAppear$lambda$8(final RNStartIoBanner rNStartIoBanner, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            View create = bannerCreator.create(rNStartIoBanner.context, new BannerListener() { // from class: com.rnstartiosdk.RNStartIoBanner$onViewAppear$1$adView$1
                @Override // com.startapp.sdk.ads.banner.BannerListener
                public void onReceiveAd(View banner) {
                    RNStartIoBanner.Companion companion;
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    companion = RNStartIoBanner.Companion;
                    Log.v(companion.getLOG_TAG(), "loadAdView: onReceiveAd");
                    Function0<Unit> onReceiveAd = RNStartIoBanner.this.getOnReceiveAd();
                    if (onReceiveAd != null) {
                        onReceiveAd.invoke();
                    }
                }

                @Override // com.startapp.sdk.ads.banner.BannerListener
                public void onFailedToReceiveAd(View banner) {
                    RNStartIoBanner.Companion companion;
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    companion = RNStartIoBanner.Companion;
                    Log.v(companion.getLOG_TAG(), "loadAdView: onFailedToReceiveAd");
                    Function0<Unit> onFailedToReceiveAd = RNStartIoBanner.this.getOnFailedToReceiveAd();
                    if (onFailedToReceiveAd != null) {
                        onFailedToReceiveAd.invoke();
                    }
                }

                @Override // com.startapp.sdk.ads.banner.BannerListener
                public void onImpression(View banner) {
                    RNStartIoBanner.Companion companion;
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    companion = RNStartIoBanner.Companion;
                    Log.v(companion.getLOG_TAG(), "loadAdView: onImpression");
                    Function0<Unit> onImpression = RNStartIoBanner.this.getOnImpression();
                    if (onImpression != null) {
                        onImpression.invoke();
                    }
                }

                @Override // com.startapp.sdk.ads.banner.BannerListener
                public void onClick(View banner) {
                    RNStartIoBanner.Companion companion;
                    Intrinsics.checkNotNullParameter(banner, "banner");
                    companion = RNStartIoBanner.Companion;
                    Log.v(companion.getLOG_TAG(), "loadAdView: onClick");
                    Function0<Unit> onClick = RNStartIoBanner.this.getOnClick();
                    if (onClick != null) {
                        onClick.invoke();
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            BuildersKt__Builders_commonKt.launch$default(rNStartIoBanner.uiScope, null, null, new RNStartIoBanner$onViewAppear$1$1(rNStartIoBanner, create, null), 3, null);
        } else {
            Log.e(LOG_TAG, "loadAdView: error: " + str);
            rNStartIoBanner.onViewDisappear();
            Function1<String, Unit> onLoadError = rNStartIoBanner.getOnLoadError();
            if (onLoadError != null) {
                onLoadError.invoke(str);
            }
            rNStartIoBanner.isAdLoading.setValue(false);
        }
    }

    private final void onViewDisappear() {
        BuildersKt__Builders_commonKt.launch$default(this.uiScope, null, null, new RNStartIoBanner$onViewDisappear$1(this, null), 3, null);
    }
}
