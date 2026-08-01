package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.ads.AdRequest;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import dev.cct.translatorapp.databinding.NativeHomeLayoutBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdHome.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0017"}, d2 = {"Ldev/cct/translatorapp/ads/NativeAdHome;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "loadNativeAds", "", "activity", "Landroid/app/Activity;", FacebookMediationAdapter.KEY_ID, "", "frameLayout", "Landroid/widget/FrameLayout;", "shimmer", "Landroid/widget/TextView;", "populateNativeAdView", "nativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "unifiedAdBinding", "Ldev/cct/translatorapp/databinding/NativeHomeLayoutBinding;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeAdHome {
    private Context context;

    public NativeAdHome(Context context) {
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

    public final void loadNativeAds(final Activity activity, final Context context, String id, final FrameLayout frameLayout, final TextView shimmer) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(frameLayout, "frameLayout");
        Intrinsics.checkNotNullParameter(shimmer, "shimmer");
        frameLayout.setVisibility(8);
        shimmer.setVisibility(0);
        Intrinsics.checkNotNull(context);
        AdLoader.Builder forNativeAd = new AdLoader.Builder(context, id).forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.ads.NativeAdHome$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                NativeAdHome.loadNativeAds$lambda$0(activity, context, this, frameLayout, nativeAd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(forNativeAd, "Builder(context!!,id)\n  …nAnimation)\n            }");
        VideoOptions build = new VideoOptions.Builder().setStartMuted(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…rue)\n            .build()");
        NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n            .s…ons)\n            .build()");
        forNativeAd.withNativeAdOptions(build2);
        AdLoader build3 = forNativeAd.withAdListener(new AdListener() { // from class: dev.cct.translatorapp.ads.NativeAdHome$loadNativeAds$adLoader$1
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
                shimmer.setVisibility(8);
                Log.e(AdRequest.LOGTAG, "onAdLoaded: ");
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(build3, "frameLayout: FrameLayout…     }\n        }).build()");
        build3.loadAd(new AdRequest.Builder().build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadNativeAds$lambda$0(Activity activity, Context context, NativeAdHome this$0, FrameLayout frameLayout, NativeAd ad) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(frameLayout, "$frameLayout");
        Intrinsics.checkNotNullParameter(ad, "ad");
        if (activity.isDestroyed()) {
            ad.destroy();
            return;
        }
        NativeHomeLayoutBinding inflate = NativeHomeLayoutBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(context))");
        this$0.populateNativeAdView(ad, inflate);
        frameLayout.removeAllViews();
        frameLayout.addView(inflate.getRoot());
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        frameLayout.startAnimation(translateAnimation);
    }

    private final void populateNativeAdView(NativeAd nativeAd, NativeHomeLayoutBinding unifiedAdBinding) {
        NativeAdView root = unifiedAdBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "unifiedAdBinding.root");
        root.setMediaView(unifiedAdBinding.adMedia);
        root.setHeadlineView(unifiedAdBinding.adHeadline);
        root.setBodyView(unifiedAdBinding.adBody);
        root.setCallToActionView(unifiedAdBinding.adCallToAction);
        root.setIconView(unifiedAdBinding.adAppIcon);
        root.setPriceView(unifiedAdBinding.adPrice);
        root.setStarRatingView(unifiedAdBinding.adStars);
        root.setStoreView(unifiedAdBinding.adStore);
        root.setAdvertiserView(unifiedAdBinding.adAdvertiser);
        unifiedAdBinding.adHeadline.setText(nativeAd.getHeadline());
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent != null) {
            unifiedAdBinding.adMedia.setMediaContent(mediaContent);
        }
        if (nativeAd.getBody() == null) {
            unifiedAdBinding.adBody.setVisibility(4);
        } else {
            unifiedAdBinding.adBody.setVisibility(0);
            unifiedAdBinding.adBody.setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            unifiedAdBinding.adCallToAction.setVisibility(0);
        } else {
            unifiedAdBinding.adCallToAction.setVisibility(0);
            unifiedAdBinding.adCallToAction.setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            unifiedAdBinding.adAppIcon.setVisibility(8);
        } else {
            ImageView imageView = unifiedAdBinding.adAppIcon;
            NativeAd.Image icon = nativeAd.getIcon();
            imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
            unifiedAdBinding.adAppIcon.setVisibility(8);
        }
        if (nativeAd.getPrice() == null) {
            unifiedAdBinding.adPrice.setVisibility(8);
        } else {
            unifiedAdBinding.adPrice.setVisibility(8);
            unifiedAdBinding.adPrice.setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            unifiedAdBinding.adStore.setVisibility(8);
        } else {
            unifiedAdBinding.adStore.setVisibility(8);
            unifiedAdBinding.adStore.setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            unifiedAdBinding.adStars.setVisibility(0);
        } else {
            RatingBar ratingBar = unifiedAdBinding.adStars;
            Double starRating = nativeAd.getStarRating();
            Intrinsics.checkNotNull(starRating);
            ratingBar.setRating((float) starRating.doubleValue());
            unifiedAdBinding.adStars.setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            unifiedAdBinding.adAdvertiser.setVisibility(0);
        } else {
            unifiedAdBinding.adAdvertiser.setText(nativeAd.getAdvertiser());
            unifiedAdBinding.adAdvertiser.setVisibility(0);
        }
        root.setNativeAd(nativeAd);
        MediaContent mediaContent2 = nativeAd.getMediaContent();
        VideoController videoController = mediaContent2 != null ? mediaContent2.getVideoController() : null;
        if (videoController == null || !mediaContent2.hasVideoContent()) {
            return;
        }
        videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: dev.cct.translatorapp.ads.NativeAdHome$populateNativeAdView$2
            @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
            public void onVideoEnd() {
                super.onVideoEnd();
            }
        });
    }
}
