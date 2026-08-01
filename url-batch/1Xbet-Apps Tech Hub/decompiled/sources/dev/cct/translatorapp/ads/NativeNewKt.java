package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: NativeNew.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aD\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"populateUnifiedNativeAdView", "", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "adView", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "preLoadNativeAd", "Landroid/app/Activity;", "adlayout", "Landroid/widget/FrameLayout;", "adId", "", "onResult", "Lkotlin/Function1;", "onFail", "Lkotlin/Function0;", "Translator_1.0.32_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeNewKt {
    public static /* synthetic */ void preLoadNativeAd$default(Activity activity, FrameLayout frameLayout, String str, Function1 function1, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        if ((i & 8) != 0) {
            function0 = null;
        }
        preLoadNativeAd(activity, frameLayout, str, function1, function0);
    }

    public static final void preLoadNativeAd(final Activity activity, final FrameLayout adlayout, String adId, final Function1<? super NativeAd, Unit> function1, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(adlayout, "adlayout");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Activity activity2 = activity;
        if (new Preferences(activity2).getCheckBillingStatus()) {
            return;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AdLoader.Builder builder = new AdLoader.Builder(activity2, adId);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.ads.NativeNewKt$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                NativeNewKt.preLoadNativeAd$lambda$0(activity, objectRef, adlayout, nativeAd);
            }
        });
        new VideoOptions.Builder().setStartMuted(false).build();
        NativeAdOptions build = new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ed(true).build()).build()");
        builder.withNativeAdOptions(build);
        AdLoader build2 = builder.withAdListener(new AdListener() { // from class: dev.cct.translatorapp.ads.NativeNewKt$preLoadNativeAd$adLoader$1
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Function1<NativeAd, Unit> function12;
                super.onAdLoaded();
                NativeAd nativeAd = objectRef.element;
                if (nativeAd == null || (function12 = function1) == null) {
                    return;
                }
                function12.invoke(nativeAd);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(build2, "onResult: ((NativeAd) ->…     }\n        }).build()");
        build2.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void preLoadNativeAd$lambda$0(Activity this_preLoadNativeAd, Ref.ObjectRef createNativeAd, FrameLayout adlayout, NativeAd unifiedNativeAd) {
        Intrinsics.checkNotNullParameter(this_preLoadNativeAd, "$this_preLoadNativeAd");
        Intrinsics.checkNotNullParameter(createNativeAd, "$createNativeAd");
        Intrinsics.checkNotNullParameter(adlayout, "$adlayout");
        Intrinsics.checkNotNullParameter(unifiedNativeAd, "unifiedNativeAd");
        if (this_preLoadNativeAd.isDestroyed()) {
            unifiedNativeAd.destroy();
            return;
        }
        NativeAd nativeAd = (NativeAd) createNativeAd.element;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        createNativeAd.element = unifiedNativeAd;
        View inflate = this_preLoadNativeAd.getLayoutInflater().inflate(R.layout.ad_native_layout, (ViewGroup) null, false);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) inflate;
        T t = createNativeAd.element;
        Intrinsics.checkNotNull(t);
        populateUnifiedNativeAdView((NativeAd) t, nativeAdView);
        adlayout.removeAllViews();
        adlayout.addView(nativeAdView);
    }

    private static final void populateUnifiedNativeAdView(NativeAd nativeAd, NativeAdView nativeAdView) {
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(R.id.ad_app_icon));
        View headlineView = nativeAdView.getHeadlineView();
        Intrinsics.checkNotNull(headlineView, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) headlineView).setText(nativeAd.getHeadline());
        MediaView mediaView = nativeAdView.getMediaView();
        if (mediaView != null) {
            mediaView.setMediaContent(nativeAd.getMediaContent());
        }
        if (nativeAd.getBody() == null) {
            View bodyView = nativeAdView.getBodyView();
            if (bodyView != null) {
                bodyView.setVisibility(8);
            }
        } else {
            View bodyView2 = nativeAdView.getBodyView();
            if (bodyView2 != null) {
                bodyView2.setVisibility(8);
            }
            View bodyView3 = nativeAdView.getBodyView();
            Intrinsics.checkNotNull(bodyView3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) bodyView3).setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            View callToActionView = nativeAdView.getCallToActionView();
            if (callToActionView != null) {
                callToActionView.setVisibility(4);
            }
        } else {
            View callToActionView2 = nativeAdView.getCallToActionView();
            if (callToActionView2 != null) {
                callToActionView2.setVisibility(0);
            }
            View callToActionView3 = nativeAdView.getCallToActionView();
            Intrinsics.checkNotNull(callToActionView3, "null cannot be cast to non-null type android.widget.Button");
            ((Button) callToActionView3).setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            View iconView = nativeAdView.getIconView();
            if (iconView != null) {
                iconView.setVisibility(0);
            }
        } else {
            View iconView2 = nativeAdView.getIconView();
            Intrinsics.checkNotNull(iconView2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) iconView2;
            NativeAd.Image icon = nativeAd.getIcon();
            imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
            View iconView3 = nativeAdView.getIconView();
            if (iconView3 != null) {
                iconView3.setVisibility(0);
            }
        }
        nativeAdView.setNativeAd(nativeAd);
    }
}
