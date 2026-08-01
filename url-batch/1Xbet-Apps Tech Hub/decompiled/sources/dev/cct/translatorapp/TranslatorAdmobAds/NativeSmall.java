package dev.cct.translatorapp.TranslatorAdmobAds;

import android.app.Activity;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import dev.cct.translatorapp.TranslatorAdmobAds.enums.AdState;
import dev.cct.translatorapp.ads.ConstantParam;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* compiled from: NativeSmall.kt */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018H\u0002J<\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J2\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018JT\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018JR\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Ldev/cct/translatorapp/TranslatorAdmobAds/NativeSmall;", "", "()V", "adState", "Ldev/cct/translatorapp/TranslatorAdmobAds/enums/AdState;", "checkTimeOut", "", "countDownTimer", "dev/cct/translatorapp/TranslatorAdmobAds/NativeSmall$countDownTimer$1", "Ldev/cct/translatorapp/TranslatorAdmobAds/NativeSmall$countDownTimer$1;", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "loadNative", "", "activity", "Landroid/app/Activity;", "nativeAdLayout", "", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "frameLayout", "Landroid/widget/FrameLayout;", "shimmerFrameLayout", "actionLoaded", "Lkotlin/Function0;", "actionFailed", "populateNativeAdView", "preLoadNative", "showNative", "showPreLoadNative", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeSmall {
    private AdState adState = AdState.LOAD;
    private boolean checkTimeOut = true;
    private final NativeSmall$countDownTimer$1 countDownTimer = new CountDownTimer() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$countDownTimer$1
        {
            super(15000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
            NativeSmall.this.checkTimeOut = false;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            NativeSmall.this.checkTimeOut = true;
        }
    };
    private NativeAd nativeAd;

    /* compiled from: NativeSmall.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            try {
                iArr[AdState.LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdState.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdState.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdState.SHOWN_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdState.SHOWING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdState.IMPRESSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdState.DISMISSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdState.AD_CLICKED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void showNative(Activity activity, int nativeAdLayout, ConstraintLayout container, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        int i = WhenMappings.$EnumSwitchMapping$0[this.adState.ordinal()];
        if (i == 1) {
            loadNative$default(this, activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, null, null, 96, null);
            return;
        }
        if (i == 2) {
            populateNativeAdView(activity, nativeAdLayout, this.nativeAd, container, frameLayout, shimmerFrameLayout);
            return;
        }
        if (i == 4) {
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
            return;
        }
        if (i != 7) {
            if (i != 9) {
                return;
            }
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
        } else if (this.checkTimeOut) {
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
        } else {
            populateNativeAdView(activity, nativeAdLayout, this.nativeAd, container, frameLayout, shimmerFrameLayout);
        }
    }

    public final void showPreLoadNative(Activity activity, int nativeAdLayout, ConstraintLayout container, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, final Function0<Unit> actionLoaded, Function0<Unit> actionFailed) {
        Job launch$default;
        Job launch$default2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        Log.d("FAHAD", "precheckTimeOut: " + this.checkTimeOut);
        Log.d("FAHAD", "preAdState: " + this.adState);
        int i = WhenMappings.$EnumSwitchMapping$0[this.adState.ordinal()];
        if (i == 1) {
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
            return;
        }
        if (i == 2) {
            this.adState = AdState.SHOWING;
            populateNativeAdView(activity, nativeAdLayout, this.nativeAd, container, frameLayout, shimmerFrameLayout);
            return;
        }
        if (i == 4) {
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
            return;
        }
        if (i == 9) {
            loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
            return;
        }
        if (i == 6) {
            this.adState = AdState.SHOWING;
            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new NativeSmall$showPreLoadNative$1(this, activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, null), 3, null);
            launch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$showPreLoadNative$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Function0<Unit> function0 = actionLoaded;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        } else {
            if (i != 7) {
                return;
            }
            if (this.checkTimeOut) {
                loadNative(activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, actionFailed);
                return;
            }
            this.adState = AdState.SHOWING;
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new NativeSmall$showPreLoadNative$3(this, activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, null), 3, null);
            launch$default2.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$showPreLoadNative$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    Function0<Unit> function0 = actionLoaded;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            });
        }
    }

    static /* synthetic */ void loadNative$default(NativeSmall nativeSmall, Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, Function0 function0, Function0 function02, int i2, Object obj) {
        nativeSmall.loadNative(activity, i, constraintLayout, frameLayout, frameLayout2, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : function02);
    }

    private final void loadNative(final Activity activity, final int nativeAdLayout, final ConstraintLayout container, final FrameLayout frameLayout, final FrameLayout shimmerFrameLayout, final Function0<Unit> actionLoaded, final Function0<Unit> actionFailed) {
        VideoOptions build = new VideoOptions.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder().setVideoOptions(videoOptions).build()");
        AdLoader build3 = new AdLoader.Builder(activity, ConstantParam.INSTANCE.getOnboardingNativeAdId()).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                NativeSmall.loadNative$lambda$0(NativeSmall.this, activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, actionLoaded, nativeAd);
            }
        }).withAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$loadNative$adLoader$2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError adError) {
                Intrinsics.checkNotNullParameter(adError, "adError");
                NativeSmall.this.adState = AdState.FAILED;
                Function0<Unit> function0 = actionFailed;
                if (function0 != null) {
                    function0.invoke();
                }
                ConstraintLayout constraintLayout = container;
                if (constraintLayout != null) {
                    ExtensionFunctionKt.hide(constraintLayout);
                }
                ExtensionFunctionKt.hide(frameLayout);
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                NativeSmall.this.adState = AdState.LOADED;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                NativeSmall.this.adState = AdState.IMPRESSION;
            }

            @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
            public void onAdClicked() {
                super.onAdClicked();
                NativeSmall.this.adState = AdState.AD_CLICKED;
            }
        }).withNativeAdOptions(build2).build();
        Intrinsics.checkNotNullExpressionValue(build3, "private fun loadNative(\n….Builder().build())\n    }");
        this.adState = AdState.LOADING;
        build3.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNative$lambda$0(NativeSmall this$0, Activity activity, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout shimmerFrameLayout, Function0 function0, NativeAd ad) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(frameLayout, "$frameLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "$shimmerFrameLayout");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this$0.adState = AdState.LOADED;
        this$0.nativeAd = ad;
        this$0.adState = AdState.SHOWING;
        this$0.countDownTimer.start();
        NativeAd nativeAd = this$0.nativeAd;
        Log.d("FAHAD", "loadNative: " + (nativeAd != null ? nativeAd.hashCode() : 0));
        Log.d("FAHAD", "checkTimeOutLoad: " + this$0.checkTimeOut);
        this$0.populateNativeAdView(activity, i, ad, constraintLayout, frameLayout, shimmerFrameLayout);
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void preLoadNative$default(NativeSmall nativeSmall, Activity activity, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        nativeSmall.preLoadNative(activity, function0, function02);
    }

    public final void preLoadNative(Activity activity, final Function0<Unit> actionLoaded, final Function0<Unit> actionFailed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        VideoOptions build = new VideoOptions.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder().setVideoOptions(videoOptions).build()");
        AdLoader build3 = new AdLoader.Builder(activity, ConstantParam.INSTANCE.getOnboardingNativeAdId()).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                NativeSmall.preLoadNative$lambda$1(NativeSmall.this, actionLoaded, nativeAd);
            }
        }).withAdListener(new AdListener() { // from class: dev.cct.translatorapp.TranslatorAdmobAds.NativeSmall$preLoadNative$adLoader$2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError adError) {
                Intrinsics.checkNotNullParameter(adError, "adError");
                NativeSmall.this.adState = AdState.FAILED;
                Function0<Unit> function0 = actionFailed;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                NativeSmall.this.adState = AdState.LOADED;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                super.onAdImpression();
                NativeSmall.this.adState = AdState.IMPRESSION;
            }
        }).withNativeAdOptions(build2).build();
        Intrinsics.checkNotNullExpressionValue(build3, "fun preLoadNative(\n     ….Builder().build())\n    }");
        this.adState = AdState.LOADING;
        build3.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void preLoadNative$lambda$1(NativeSmall this$0, Function0 function0, NativeAd ad) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this$0.adState = AdState.LOADED;
        this$0.nativeAd = ad;
        this$0.countDownTimer.start();
        NativeAd nativeAd = this$0.nativeAd;
        Log.d("FAHAD", "preloadNative: " + (nativeAd != null ? nativeAd.hashCode() : 0));
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void populateNativeAdView(Activity activity, int nativeAdLayout, NativeAd nativeAd, ConstraintLayout container, FrameLayout frameLayout, FrameLayout shimmerFrameLayout) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new NativeSmall$populateNativeAdView$1(nativeAd, activity, nativeAdLayout, container, frameLayout, shimmerFrameLayout, null), 3, null);
    }
}
