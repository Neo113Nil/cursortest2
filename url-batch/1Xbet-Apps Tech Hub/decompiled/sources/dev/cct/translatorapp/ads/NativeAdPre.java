package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
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
import com.google.android.material.card.MaterialCardView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdPre.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J&\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Ldev/cct/translatorapp/ads/NativeAdPre;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adLoaded", "", "handler", "Landroid/os/Handler;", "mContext", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "loadNativeAdNewRequest", "", "activity", "Landroid/app/Activity;", "frameLayout", "Landroid/widget/FrameLayout;", "stringId", "", "loadingLayout", "Lcom/google/android/material/card/MaterialCardView;", "loadNativeAdPreLoad", "populateUnifiedNativeAdView", "adView", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "scheduleAdRefresh", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeAdPre {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static NativeAdPre mInstance;
    private boolean adLoaded;
    private final Handler handler;
    private Context mContext;
    private NativeAd nativeAd;

    public /* synthetic */ NativeAdPre(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private NativeAdPre(Context context) {
        this.handler = new Handler(Looper.getMainLooper());
        this.mContext = context.getApplicationContext();
    }

    public final void loadNativeAdPreLoad(Activity activity, FrameLayout frameLayout, String stringId, MaterialCardView loadingLayout) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(stringId, "stringId");
        Intrinsics.checkNotNullParameter(loadingLayout, "loadingLayout");
        if (!this.adLoaded) {
            loadNativeAdNewRequest(activity, frameLayout, stringId, loadingLayout);
            scheduleAdRefresh();
            return;
        }
        frameLayout.removeAllViews();
        View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.ad_la, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) inflate;
        NativeAd nativeAd = this.nativeAd;
        Intrinsics.checkNotNull(nativeAd);
        populateUnifiedNativeAdView(nativeAd, nativeAdView);
        frameLayout.addView(nativeAdView);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        frameLayout.startAnimation(translateAnimation);
    }

    private final void loadNativeAdNewRequest(final Activity activity, final FrameLayout frameLayout, String stringId, MaterialCardView loadingLayout) {
        frameLayout.setVisibility(8);
        if (!new Preferences(activity).getCheckBillingStatus()) {
            loadingLayout.setVisibility(0);
            Context context = this.mContext;
            Intrinsics.checkNotNull(context);
            AdLoader.Builder forNativeAd = new AdLoader.Builder(context, stringId).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.ads.NativeAdPre$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    NativeAdPre.loadNativeAdNewRequest$lambda$0(activity, this, frameLayout, nativeAd);
                }
            });
            Intrinsics.checkNotNullExpressionValue(forNativeAd, "Builder(mContext!!, stri…ed: \")\n\n                }");
            VideoOptions build = new VideoOptions.Builder().setStartMuted(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
            NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
            Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …\n                .build()");
            forNativeAd.withNativeAdOptions(build2);
            AdLoader build3 = forNativeAd.withAdListener(new AdListener() { // from class: dev.cct.translatorapp.ads.NativeAdPre$loadNativeAdNewRequest$adLoader$1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                    super.onAdFailedToLoad(loadAdError);
                    Log.e("TAG", "Native onAdFailedToLoad " + loadAdError.getMessage());
                    NativeAdPre.this.adLoaded = false;
                    NativeAdPre.this.scheduleAdRefresh();
                }
            }).build();
            Intrinsics.checkNotNullExpressionValue(build3, "private fun loadNativeAd…View.GONE\n        }\n    }");
            build3.loadAd(new AdRequest.Builder().build());
            return;
        }
        loadingLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAdNewRequest$lambda$0(Activity activity, NativeAdPre this$0, FrameLayout frameLayout, NativeAd ad) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(frameLayout, "$frameLayout");
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (activity.isDestroyed()) {
            ad.destroy();
            return;
        }
        this$0.nativeAd = ad;
        this$0.adLoaded = true;
        View inflate = LayoutInflater.from(this$0.mContext).inflate(R.layout.ad_la, (ViewGroup) null);
        Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) inflate;
        this$0.populateUnifiedNativeAdView(ad, nativeAdView);
        frameLayout.removeAllViews();
        frameLayout.addView(nativeAdView);
        frameLayout.setVisibility(0);
        Log.e(com.google.ads.AdRequest.LOGTAG, "onAdLoaded: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleAdRefresh() {
        this.handler.postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ads.NativeAdPre$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                NativeAdPre.scheduleAdRefresh$lambda$1(NativeAdPre.this);
            }
        }, 120000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAdRefresh$lambda$1(NativeAdPre this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adLoaded = false;
        Log.e(com.google.ads.AdRequest.LOGTAG, "Scheduled ad refresh");
    }

    private final void populateUnifiedNativeAdView(NativeAd nativeAd, NativeAdView adView) {
        if (adView != null) {
            View findViewById = adView.findViewById(R.id.ad_media);
            Intrinsics.checkNotNullExpressionValue(findViewById, "adView.findViewById(R.id.ad_media)");
            adView.setMediaView((MediaView) findViewById);
            adView.setHeadlineView(adView.findViewById(R.id.ad_headline));
            adView.setCallToActionView(adView.findViewById(R.id.ad_call_to_action));
            adView.setIconView(adView.findViewById(R.id.ad_app_icon));
            adView.setBodyView(adView.findViewById(R.id.ad_body));
            adView.setStarRatingView(adView.findViewById(R.id.ad_stars));
            View bodyView = adView.getBodyView();
            if (bodyView != null) {
                bodyView.setSelected(true);
            }
            if (nativeAd.getBody() == null) {
                View bodyView2 = adView.getBodyView();
                if (bodyView2 != null) {
                    bodyView2.setVisibility(0);
                }
            } else {
                View bodyView3 = adView.getBodyView();
                if (bodyView3 != null) {
                    bodyView3.setVisibility(0);
                }
                View bodyView4 = adView.getBodyView();
                Intrinsics.checkNotNull(bodyView4, "null cannot be cast to non-null type android.widget.TextView");
                ((TextView) bodyView4).setText(nativeAd.getBody());
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
                    iconView.setVisibility(0);
                } else {
                    ImageView imageView = (ImageView) adView.getIconView();
                    Intrinsics.checkNotNull(imageView);
                    NativeAd.Image icon = nativeAd.getIcon();
                    Intrinsics.checkNotNull(icon);
                    imageView.setImageDrawable(icon.getDrawable());
                    View iconView2 = adView.getIconView();
                    Intrinsics.checkNotNull(iconView2);
                    iconView2.setVisibility(0);
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

    /* compiled from: NativeAdPre.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/ads/NativeAdPre$Companion;", "", "()V", "mInstance", "Ldev/cct/translatorapp/ads/NativeAdPre;", "getInstance", "context", "Landroid/content/Context;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NativeAdPre getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (NativeAdPre.mInstance == null) {
                NativeAdPre.mInstance = new NativeAdPre(context, null);
            }
            return NativeAdPre.mInstance;
        }
    }
}
