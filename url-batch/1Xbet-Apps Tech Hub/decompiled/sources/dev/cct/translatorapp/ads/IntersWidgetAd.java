package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntersWidgetAd.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Ldev/cct/translatorapp/ads/IntersWidgetAd;", "", "()V", "<set-?>", "Lcom/facebook/ads/InterstitialAd;", "facebookInterstitialAd", "getFacebookInterstitialAd", "()Lcom/facebook/ads/InterstitialAd;", "interInstance", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getInterInstance", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setInterInstance", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "loadFacebookIntersAd", "", "mContext", "Landroid/content/Context;", "loadMainIntersAd", FacebookMediationAdapter.KEY_ID, "", "showFacebookInters", "showMainIntersAd", "activityContext", "Landroid/app/Activity;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersWidgetAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile IntersWidgetAd tinstance;
    private InterstitialAd facebookInterstitialAd;
    private com.google.android.gms.ads.interstitial.InterstitialAd interInstance;

    public final com.google.android.gms.ads.interstitial.InterstitialAd getInterInstance() {
        return this.interInstance;
    }

    public final void setInterInstance(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
        this.interInstance = interstitialAd;
    }

    public final InterstitialAd getFacebookInterstitialAd() {
        return this.facebookInterstitialAd;
    }

    /* compiled from: IntersWidgetAd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ldev/cct/translatorapp/ads/IntersWidgetAd$Companion;", "", "()V", "tinstance", "Ldev/cct/translatorapp/ads/IntersWidgetAd;", "getInstance", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntersWidgetAd getInstance() {
            IntersWidgetAd intersWidgetAd = IntersWidgetAd.tinstance;
            if (intersWidgetAd == null) {
                synchronized (this) {
                    intersWidgetAd = IntersWidgetAd.tinstance;
                    if (intersWidgetAd == null) {
                        intersWidgetAd = new IntersWidgetAd();
                        Companion companion = IntersWidgetAd.INSTANCE;
                        IntersWidgetAd.tinstance = intersWidgetAd;
                    }
                }
            }
            return intersWidgetAd;
        }
    }

    public final void loadMainIntersAd(final Context mContext, final String id) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(id, "id");
        Toast.makeText(mContext, "---" + this.interInstance, 0).show();
        if (new Preferences(mContext).getCheckBillingStatus() || this.interInstance != null) {
            return;
        }
        com.google.android.gms.ads.interstitial.InterstitialAd.load(mContext, id, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ads.IntersWidgetAd$loadMainIntersAd$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAd", "onAdFailedToLoad: ");
                AppOpenAd.INSTANCE.setIntersAdShow(false);
                IntersWidgetAd.this.loadFacebookIntersAd(mContext);
                Toast.makeText(mContext, "onAdFailedToLoad", 0).show();
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAd", "onAdLoaded: ");
                Toast.makeText(mContext, "onAdLoaded", 0).show();
                IntersWidgetAd.this.setInterInstance(ad);
                com.google.android.gms.ads.interstitial.InterstitialAd interInstance = IntersWidgetAd.this.getInterInstance();
                if (interInstance == null) {
                    return;
                }
                final IntersWidgetAd intersWidgetAd = IntersWidgetAd.this;
                final Context context = mContext;
                final String str = id;
                interInstance.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ads.IntersWidgetAd$loadMainIntersAd$1$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        IntersWidgetAd.this.setInterInstance(null);
                        IntersWidgetAd.this.loadMainIntersAd(context, str);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                        Toast.makeText(context, "onAdDismissedFullScreenContent", 0).show();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        IntersWidgetAd.this.setInterInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                        Toast.makeText(context, "onAdFailedToShowFullScreenContent", 0).show();
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdShowedFullScreenContent() {
                        super.onAdShowedFullScreenContent();
                        Toast.makeText(context, "onAdShowedFullScreenContent", 0).show();
                    }
                });
            }
        });
    }

    public final void showMainIntersAd(Activity activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        if (this.interInstance != null) {
            AppOpenAd.INSTANCE.setIntersAdShow(true);
            com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.interInstance;
            if (interstitialAd != null) {
                interstitialAd.show(activityContext);
            }
            Toast.makeText(activityContext, "showMainIntersAd", 0).show();
            return;
        }
        showFacebookInters();
    }

    public final void loadFacebookIntersAd(final Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.facebookInterstitialAd = new InterstitialAd(mContext, mContext.getString(R.string.fb_inters_id));
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() { // from class: dev.cct.translatorapp.ads.IntersWidgetAd$loadFacebookIntersAd$interstitialAdListener$1
            @Override // com.facebook.ads.AdListener
            public void onAdClicked(Ad p0) {
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
                IntersWidgetAd.this.facebookInterstitialAd = (InterstitialAd) ad;
                Log.e("intersAd", "onAdLoaded: ");
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad p0) {
                IntersWidgetAd.this.loadFacebookIntersAd(mContext);
            }
        };
        InterstitialAd interstitialAd = this.facebookInterstitialAd;
        Intrinsics.checkNotNull(interstitialAd);
        InterstitialAd interstitialAd2 = this.facebookInterstitialAd;
        Intrinsics.checkNotNull(interstitialAd2);
        interstitialAd.loadAd(interstitialAd2.buildLoadAdConfig().withAdListener(interstitialAdListener).build());
    }

    private final void showFacebookInters() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2 = this.facebookInterstitialAd;
        if (interstitialAd2 != null) {
            Intrinsics.checkNotNull(interstitialAd2);
            if (!interstitialAd2.isAdLoaded() || (interstitialAd = this.facebookInterstitialAd) == null) {
                return;
            }
            interstitialAd.show();
        }
    }
}
