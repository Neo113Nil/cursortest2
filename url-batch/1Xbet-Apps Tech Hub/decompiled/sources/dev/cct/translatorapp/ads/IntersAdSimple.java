package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAdListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntersAdSimple.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Ldev/cct/translatorapp/ads/IntersAdSimple;", "", "()V", "adInstance", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getAdInstance", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setAdInstance", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "<set-?>", "Lcom/facebook/ads/InterstitialAd;", "facebookInterstitialAd", "getFacebookInterstitialAd", "()Lcom/facebook/ads/InterstitialAd;", "loadFacebookIntersAd", "", "mContext", "Landroid/content/Context;", FacebookMediationAdapter.KEY_ID, "", "loadSplashIntersAd", "showFacebookInters", "showSplashIntersAd", "activityContext", "Landroid/app/Activity;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersAdSimple {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile IntersAdSimple instance;
    private InterstitialAd adInstance;
    private com.facebook.ads.InterstitialAd facebookInterstitialAd;

    public final InterstitialAd getAdInstance() {
        return this.adInstance;
    }

    public final void setAdInstance(InterstitialAd interstitialAd) {
        this.adInstance = interstitialAd;
    }

    public final com.facebook.ads.InterstitialAd getFacebookInterstitialAd() {
        return this.facebookInterstitialAd;
    }

    /* compiled from: IntersAdSimple.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ldev/cct/translatorapp/ads/IntersAdSimple$Companion;", "", "()V", "instance", "Ldev/cct/translatorapp/ads/IntersAdSimple;", "getInstance", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntersAdSimple getInstance() {
            IntersAdSimple intersAdSimple = IntersAdSimple.instance;
            if (intersAdSimple == null) {
                synchronized (this) {
                    intersAdSimple = IntersAdSimple.instance;
                    if (intersAdSimple == null) {
                        intersAdSimple = new IntersAdSimple();
                        Companion companion = IntersAdSimple.INSTANCE;
                        IntersAdSimple.instance = intersAdSimple;
                    }
                }
            }
            return intersAdSimple;
        }
    }

    public final void loadSplashIntersAd(Context mContext, String id) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(id, "id");
        if (new Preferences(mContext).getCheckBillingStatus()) {
            return;
        }
        InterstitialAd.load(mContext, id, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ads.IntersAdSimple$loadSplashIntersAd$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAdSplash", "onAdFailedToLoad: ");
                AppOpenAd.INSTANCE.setIntersAdShow(false);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(InterstitialAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAdSplash", "onAdLoaded: ");
                IntersAdSimple.this.setAdInstance(ad);
                InterstitialAd adInstance = IntersAdSimple.this.getAdInstance();
                if (adInstance == null) {
                    return;
                }
                final IntersAdSimple intersAdSimple = IntersAdSimple.this;
                adInstance.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ads.IntersAdSimple$loadSplashIntersAd$1$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        IntersAdSimple.this.setAdInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        IntersAdSimple.this.setAdInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                    }
                });
            }
        });
    }

    public final void showSplashIntersAd(Activity activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        if (this.adInstance != null) {
            AppOpenAd.INSTANCE.setIntersAdShow(true);
            InterstitialAd interstitialAd = this.adInstance;
            if (interstitialAd != null) {
                interstitialAd.show(activityContext);
                return;
            }
            return;
        }
        showFacebookInters();
    }

    public final void loadFacebookIntersAd(Context mContext, String id) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(id, "id");
        this.facebookInterstitialAd = new com.facebook.ads.InterstitialAd(mContext, id);
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() { // from class: dev.cct.translatorapp.ads.IntersAdSimple$loadFacebookIntersAd$interstitialAdListener$1
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad p0) {
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad p0) {
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDisplayed(Ad p0) {
            }

            @Override // com.facebook.ads.AdListener
            public void onLoggingImpression(Ad p0) {
            }

            @Override // com.facebook.ads.AdListener
            public void onError(Ad p0, com.facebook.ads.AdError p1) {
                String errorMessage;
                if (p1 == null || (errorMessage = p1.getErrorMessage()) == null) {
                    return;
                }
                Log.e("intersAd", "onError: " + errorMessage);
            }

            @Override // com.facebook.ads.AdListener
            public void onAdLoaded(Ad ad) {
                IntersAdSimple.this.facebookInterstitialAd = (com.facebook.ads.InterstitialAd) ad;
                Log.e("intersAd", "onAdLoaded: ");
            }
        };
        com.facebook.ads.InterstitialAd interstitialAd = this.facebookInterstitialAd;
        Intrinsics.checkNotNull(interstitialAd);
        com.facebook.ads.InterstitialAd interstitialAd2 = this.facebookInterstitialAd;
        Intrinsics.checkNotNull(interstitialAd2);
        interstitialAd.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
    }

    private final void showFacebookInters() {
        com.facebook.ads.InterstitialAd interstitialAd;
        com.facebook.ads.InterstitialAd interstitialAd2 = this.facebookInterstitialAd;
        if (interstitialAd2 != null) {
            Intrinsics.checkNotNull(interstitialAd2);
            if (!interstitialAd2.isAdLoaded() || (interstitialAd = this.facebookInterstitialAd) == null) {
                return;
            }
            interstitialAd.show();
        }
    }
}
