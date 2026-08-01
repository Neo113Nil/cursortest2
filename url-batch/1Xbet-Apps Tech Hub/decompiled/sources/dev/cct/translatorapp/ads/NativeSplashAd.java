package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.ads.AdRequest;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
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
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: NativeSplashAd.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J.\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J8\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016J.\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016J(\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002J\u001a\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Ldev/cct/translatorapp/ads/NativeSplashAd;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "fbNativeAd", "Lcom/facebook/ads/NativeAd;", "nativeAd", "Lcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;", "inflateAd", "", "nativeLayout", "", "nativeAdLayout", "Lcom/facebook/ads/NativeAdLayout;", "loadFbNativeAd", "nativeId", "", "shimmerFrameLayout", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "loadLargeNativeAds", "activity", "Landroid/app/Activity;", FacebookMediationAdapter.KEY_ID, "frameLayout", "Landroid/widget/FrameLayout;", "loadingText", "loadPangleNative", "nativeAdId", "populateNativeAdView", "populateUnifiedNativeAdView", "Lcom/google/android/gms/ads/nativead/NativeAd;", "adView", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeSplashAd {
    private Context context;
    private NativeAd fbNativeAd;
    private PAGNativeAd nativeAd;

    public NativeSplashAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void loadLargeNativeAds(final int nativeAdLayout, final Activity activity, final Context context, String id, final FrameLayout frameLayout, final ShimmerFrameLayout loadingText) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(loadingText, "loadingText");
        if (!new Preferences(activity).getCheckBillingStatus()) {
            frameLayout.setVisibility(8);
            loadingText.setVisibility(0);
            Intrinsics.checkNotNull(context);
            AdLoader.Builder forNativeAd = new AdLoader.Builder(context, id).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.ads.NativeSplashAd$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
                    NativeSplashAd.loadLargeNativeAds$lambda$0(activity, context, nativeAdLayout, this, frameLayout, nativeAd);
                }
            });
            Intrinsics.checkNotNullExpressionValue(forNativeAd, "Builder(context!!, id)\n …mation)\n                }");
            VideoOptions build = new VideoOptions.Builder().setStartMuted(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
            Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …\n                .build()");
            forNativeAd.withNativeAdOptions(build2);
            AdLoader build3 = forNativeAd.withAdListener(new AdListener() { // from class: dev.cct.translatorapp.ads.NativeSplashAd$loadLargeNativeAds$adLoader$1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                    super.onAdFailedToLoad(loadAdError);
                    Log.e(AdRequest.LOGTAG, "Native onAdFailedToLoad " + loadAdError.getMessage());
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    super.onAdLoaded();
                    frameLayout.setVisibility(0);
                    loadingText.setVisibility(8);
                    Log.e(AdRequest.LOGTAG, "onAdLoaded: ");
                }
            }).build();
            Intrinsics.checkNotNullExpressionValue(build3, "frameLayout: FrameLayout… }\n            }).build()");
            build3.loadAd(new AdRequest.Builder().build());
            return;
        }
        loadingText.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadLargeNativeAds$lambda$0(Activity activity, Context context, int i, NativeSplashAd this$0, FrameLayout frameLayout, com.google.android.gms.ads.nativead.NativeAd ad) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(frameLayout, "$frameLayout");
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (activity.isDestroyed()) {
            ad.destroy();
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) inflate;
        this$0.populateUnifiedNativeAdView(ad, nativeAdView);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        frameLayout.startAnimation(translateAnimation);
    }

    private final void populateUnifiedNativeAdView(com.google.android.gms.ads.nativead.NativeAd nativeAd, NativeAdView adView) {
        if (adView != null) {
            View findViewById = adView.findViewById(R.id.ad_media);
            Intrinsics.checkNotNullExpressionValue(findViewById, "adView.findViewById(R.id.ad_media)");
            adView.setMediaView((MediaView) findViewById);
            adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
            adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
            adView.setIconView(adView.findViewById(R.id.ad_app_icon));
            adView.setBodyView(adView.findViewById(R.id.ad_body));
            adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
            if (nativeAd.getBody() == null) {
                View bodyView = adView.getBodyView();
                if (bodyView != null) {
                    bodyView.setVisibility(0);
                }
            } else {
                View bodyView2 = adView.getBodyView();
                if (bodyView2 != null) {
                    bodyView2.setVisibility(0);
                }
                View bodyView3 = adView.getBodyView();
                Intrinsics.checkNotNull(bodyView3, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) bodyView3).setText(nativeAd.getBody());
            }
            if (adView.getHeadlineView() != null) {
                TextView textView = (TextView) adView.getHeadlineView();
                Intrinsics.checkNotNull(textView);
                textView.setText(nativeAd.getHeadline());
            }
            if (adView.getCallToActionView() != null) {
                if (nativeAd.getCallToAction() == null) {
                    View callToActionView = adView.getCallToActionView();
                    Intrinsics.checkNotNull(callToActionView);
                    callToActionView.setVisibility(4);
                } else {
                    View callToActionView2 = adView.getCallToActionView();
                    Intrinsics.checkNotNull(callToActionView2);
                    callToActionView2.setVisibility(0);
                    TextView textView2 = (TextView) adView.getCallToActionView();
                    Intrinsics.checkNotNull(textView2);
                    textView2.setText(nativeAd.getCallToAction());
                }
            }
            if (adView.getIconView() != null) {
                if (nativeAd.getIcon() == null) {
                    View iconView = adView.getIconView();
                    Intrinsics.checkNotNull(iconView);
                    iconView.setVisibility(8);
                } else {
                    ImageView imageView = (ImageView) adView.getIconView();
                    Intrinsics.checkNotNull(imageView);
                    NativeAd.Image icon = nativeAd.getIcon();
                    Intrinsics.checkNotNull(icon);
                    imageView.setImageDrawable(icon.getDrawable());
                    View iconView2 = adView.getIconView();
                    Intrinsics.checkNotNull(iconView2);
                    iconView2.setVisibility(8);
                }
            }
            if (adView.getStarRatingView() != null) {
                if (nativeAd.getStarRating() == null) {
                    View starRatingView = adView.getStarRatingView();
                    Intrinsics.checkNotNull(starRatingView);
                    starRatingView.setVisibility(0);
                } else {
                    RatingBar ratingBar = (RatingBar) adView.getStarRatingView();
                    Intrinsics.checkNotNull(ratingBar);
                    Double starRating = nativeAd.getStarRating();
                    Intrinsics.checkNotNull(starRating);
                    ratingBar.setRating((float) starRating.doubleValue());
                    View starRatingView2 = adView.getStarRatingView();
                    Intrinsics.checkNotNull(starRatingView2);
                    starRatingView2.setVisibility(0);
                }
            }
            adView.setNativeAd(nativeAd);
        }
    }

    public final void loadFbNativeAd(final int nativeLayout, final Context context, String nativeId, final NativeAdLayout nativeAdLayout, final ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeId, "nativeId");
        Intrinsics.checkNotNullParameter(nativeAdLayout, "nativeAdLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        if (!ConstantParam.INSTANCE.m204isPurchased()) {
            this.fbNativeAd = new com.facebook.ads.NativeAd(context, nativeId);
            NativeAdListener nativeAdListener = new NativeAdListener() { // from class: dev.cct.translatorapp.ads.NativeSplashAd$loadFbNativeAd$nativeAdListener$1
                @Override // com.facebook.ads.NativeAdListener
                public void onMediaDownloaded(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.e(ConstantParam.FBTAG, "Native ad finished downloading all assets.");
                }

                @Override // com.facebook.ads.AdListener
                public void onError(Ad ad, AdError adError) {
                    Intrinsics.checkNotNullParameter(adError, "adError");
                    Log.e(ConstantParam.FBTAG, "Native ad failed to load: " + adError.getErrorMessage());
                }

                @Override // com.facebook.ads.AdListener
                public void onAdLoaded(Ad ad) {
                    com.facebook.ads.NativeAd nativeAd;
                    com.facebook.ads.NativeAd nativeAd2;
                    com.facebook.ads.NativeAd nativeAd3;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    nativeAd = NativeSplashAd.this.fbNativeAd;
                    if (nativeAd != null) {
                        nativeAd2 = NativeSplashAd.this.fbNativeAd;
                        Intrinsics.checkNotNull(nativeAd2);
                        if (Intrinsics.areEqual(nativeAd2, ad)) {
                            shimmerFrameLayout.stopShimmer();
                            shimmerFrameLayout.setVisibility(8);
                            nativeAdLayout.setVisibility(0);
                            NativeSplashAd nativeSplashAd = NativeSplashAd.this;
                            int i = nativeLayout;
                            Context context2 = context;
                            nativeAd3 = nativeSplashAd.fbNativeAd;
                            Intrinsics.checkNotNull(nativeAd3);
                            nativeSplashAd.inflateAd(i, context2, nativeAd3, nativeAdLayout);
                        }
                    }
                }

                @Override // com.facebook.ads.AdListener
                public void onAdClicked(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.d(ConstantParam.FBTAG, "Native ad clicked!");
                }

                @Override // com.facebook.ads.AdListener
                public void onLoggingImpression(Ad ad) {
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    Log.d(ConstantParam.FBTAG, "Native ad impression logged!");
                }
            };
            com.facebook.ads.NativeAd nativeAd = this.fbNativeAd;
            if (nativeAd != null) {
                nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(nativeAdListener).build());
                return;
            }
            return;
        }
        nativeAdLayout.setVisibility(8);
        shimmerFrameLayout.setVisibility(8);
        shimmerFrameLayout.stopShimmer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void inflateAd(int nativeLayout, Context context, com.facebook.ads.NativeAd nativeAd, NativeAdLayout nativeAdLayout) {
        nativeAd.unregisterView();
        View inflate = LayoutInflater.from(context).inflate(nativeLayout, (ViewGroup) nativeAdLayout, false);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) inflate;
        LinearLayout linearLayout2 = linearLayout;
        nativeAdLayout.addView(linearLayout2);
        View findViewById = linearLayout.findViewById(R.id.ad_choices_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "adView.findViewById(R.id.ad_choices_container)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById;
        AdOptionsView adOptionsView = new AdOptionsView(context, nativeAd, nativeAdLayout);
        linearLayout3.removeAllViews();
        linearLayout3.addView(adOptionsView, 0);
        View findViewById2 = linearLayout.findViewById(R.id.native_ad_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "adView.findViewById(R.id.native_ad_icon)");
        com.facebook.ads.MediaView mediaView = (com.facebook.ads.MediaView) findViewById2;
        View findViewById3 = linearLayout.findViewById(R.id.native_ad_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "adView.findViewById(R.id.native_ad_title)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = linearLayout.findViewById(R.id.native_ad_media);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "adView.findViewById(R.id.native_ad_media)");
        com.facebook.ads.MediaView mediaView2 = (com.facebook.ads.MediaView) findViewById4;
        View findViewById5 = linearLayout.findViewById(R.id.native_ad_social_context);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "adView.findViewById(R.id.native_ad_social_context)");
        View findViewById6 = linearLayout.findViewById(R.id.native_ad_body);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "adView.findViewById(R.id.native_ad_body)");
        View findViewById7 = linearLayout.findViewById(R.id.native_ad_sponsored_label);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "adView.findViewById(R.id…ative_ad_sponsored_label)");
        TextView textView2 = (TextView) findViewById7;
        View findViewById8 = linearLayout.findViewById(R.id.native_ad_call_to_action);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "adView.findViewById(R.id.native_ad_call_to_action)");
        Button button = (Button) findViewById8;
        textView.setText(nativeAd.getAdvertiserName());
        ((TextView) findViewById6).setText(nativeAd.getAdBodyText());
        ((TextView) findViewById5).setText(nativeAd.getAdSocialContext());
        button.setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
        button.setText(nativeAd.getAdCallToAction());
        textView2.setText(nativeAd.getSponsoredTranslation());
        List<View> arrayList = new ArrayList<>();
        arrayList.add(textView);
        arrayList.add(button);
        nativeAd.registerViewForInteraction(linearLayout2, mediaView2, mediaView, arrayList);
    }

    public final void loadPangleNative(final int nativeLayout, final Context context, String nativeAdId, final FrameLayout nativeAdLayout, final ShimmerFrameLayout shimmerFrameLayout) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdId, "nativeAdId");
        Intrinsics.checkNotNullParameter(nativeAdLayout, "nativeAdLayout");
        Intrinsics.checkNotNullParameter(shimmerFrameLayout, "shimmerFrameLayout");
        PAGNativeAd.loadAd(nativeAdId, new PAGNativeRequest(), new PAGNativeAdLoadListener() { // from class: dev.cct.translatorapp.ads.NativeSplashAd$loadPangleNative$1
            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
            public void onError(int code, String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                Log.e("PangleNative", "onError: " + code + " -- message - " + message);
                FrameLayout frameLayout = nativeAdLayout;
                if (frameLayout != null) {
                    ExtensionFunctionKt.hide(frameLayout);
                }
                ExtensionFunctionKt.hide(shimmerFrameLayout);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            public void onAdLoaded(PAGNativeAd pagNativeAd) {
                PAGNativeAd pAGNativeAd;
                Intrinsics.checkNotNullParameter(pagNativeAd, "pagNativeAd");
                this.nativeAd = pagNativeAd;
                pAGNativeAd = this.nativeAd;
                Log.e("PangleNative", "onAdLoaded: " + (pAGNativeAd != null ? pAGNativeAd.hashCode() : 0));
                Log.e("PangleNative", "onAdLoaded: $");
                this.populateNativeAdView(nativeLayout, context, pagNativeAd, nativeAdLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void populateNativeAdView(int nativeLayout, Context context, PAGNativeAd nativeAd, FrameLayout nativeAdLayout) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new NativeSplashAd$populateNativeAdView$1(nativeAd, context, nativeLayout, nativeAdLayout, null), 3, null);
    }
}
