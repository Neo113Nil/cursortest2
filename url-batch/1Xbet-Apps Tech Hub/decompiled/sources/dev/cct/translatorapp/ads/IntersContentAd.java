package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.work.WorkRequest;
import com.facebook.ads.Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntersContentAd.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Ldev/cct/translatorapp/ads/IntersContentAd;", "", "()V", "delayMillis", "", "<set-?>", "Lcom/facebook/ads/InterstitialAd;", "facebookInterstitialAd", "getFacebookInterstitialAd", "()Lcom/facebook/ads/InterstitialAd;", "handler", "Landroid/os/Handler;", "interInstance", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getInterInstance", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setInterInstance", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "startTimeMillis", "loadFacebookIntersAd", "", "mContext", "Landroid/content/Context;", "loadMainIntersAd", FacebookMediationAdapter.KEY_ID, "", "showFacebookInters", "showMainIntersAd", "activityContext", "Landroid/app/Activity;", "showTimer", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersContentAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile IntersContentAd tinstance;
    private final long delayMillis = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    private InterstitialAd facebookInterstitialAd;
    private Handler handler;
    private com.google.android.gms.ads.interstitial.InterstitialAd interInstance;
    private FirebaseRemoteConfig remoteConfig;
    private long startTimeMillis;

    public IntersContentAd() {
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseRemoteConfig, "getInstance()");
        this.remoteConfig = firebaseRemoteConfig;
    }

    public final com.google.android.gms.ads.interstitial.InterstitialAd getInterInstance() {
        return this.interInstance;
    }

    public final void setInterInstance(com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd) {
        this.interInstance = interstitialAd;
    }

    public final InterstitialAd getFacebookInterstitialAd() {
        return this.facebookInterstitialAd;
    }

    /* compiled from: IntersContentAd.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ldev/cct/translatorapp/ads/IntersContentAd$Companion;", "", "()V", "tinstance", "Ldev/cct/translatorapp/ads/IntersContentAd;", "getInstance", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntersContentAd getInstance() {
            IntersContentAd intersContentAd = IntersContentAd.tinstance;
            if (intersContentAd == null) {
                synchronized (this) {
                    intersContentAd = IntersContentAd.tinstance;
                    if (intersContentAd == null) {
                        intersContentAd = new IntersContentAd();
                        Companion companion = IntersContentAd.INSTANCE;
                        IntersContentAd.tinstance = intersContentAd;
                    }
                }
            }
            return intersContentAd;
        }
    }

    public final void loadMainIntersAd(final Context mContext, String id) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(id, "id");
        if (new Preferences(mContext).getCheckBillingStatus() || this.interInstance != null) {
            return;
        }
        com.google.android.gms.ads.interstitial.InterstitialAd.load(mContext, id, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ads.IntersContentAd$loadMainIntersAd$1$1
            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdFailedToLoad(LoadAdError ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAd", "onAdFailedToLoad: ");
                AppOpenAd.INSTANCE.setIntersAdShow(false);
                IntersContentAd.this.loadFacebookIntersAd(mContext);
                new Preferences(mContext).setAdRequestNull(true);
            }

            @Override // com.google.android.gms.ads.AdLoadCallback
            public void onAdLoaded(com.google.android.gms.ads.interstitial.InterstitialAd ad) {
                Intrinsics.checkNotNullParameter(ad, "ad");
                Log.e("intersAd", "onAdLoaded: ");
                new Preferences(mContext).setAdRequestNull(false);
                IntersContentAd.this.setInterInstance(ad);
                com.google.android.gms.ads.interstitial.InterstitialAd interInstance = IntersContentAd.this.getInterInstance();
                if (interInstance == null) {
                    return;
                }
                final IntersContentAd intersContentAd = IntersContentAd.this;
                interInstance.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ads.IntersContentAd$loadMainIntersAd$1$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        IntersContentAd.this.setInterInstance(null);
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        IntersContentAd.this.setInterInstance(null);
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

    public final void showMainIntersAd(Activity activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        if (this.interInstance != null) {
            AppOpenAd.INSTANCE.setIntersAdShow(true);
            com.google.android.gms.ads.interstitial.InterstitialAd interstitialAd = this.interInstance;
            if (interstitialAd != null) {
                interstitialAd.show(activityContext);
            }
            showTimer(activityContext);
            return;
        }
        new Preferences(activityContext).setAdRequestNull(true);
        showFacebookInters();
    }

    public final void loadFacebookIntersAd(final Context mContext) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.facebookInterstitialAd = new InterstitialAd(mContext, mContext.getString(R.string.fb_inters_id));
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() { // from class: dev.cct.translatorapp.ads.IntersContentAd$loadFacebookIntersAd$interstitialAdListener$1
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
                IntersContentAd.this.facebookInterstitialAd = (InterstitialAd) ad;
                Log.e("intersAd", "onAdLoaded: ");
            }

            @Override // com.facebook.ads.InterstitialAdListener
            public void onInterstitialDismissed(Ad p0) {
                IntersContentAd.this.loadFacebookIntersAd(mContext);
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

    private final void showTimer(final Activity activityContext) {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
            this.startTimeMillis = System.currentTimeMillis();
            Handler handler = this.handler;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(new Runnable() { // from class: dev.cct.translatorapp.ads.IntersContentAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    IntersContentAd.showTimer$lambda$3(IntersContentAd.this, activityContext);
                }
            }, this.delayMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showTimer$lambda$3(IntersContentAd this$0, Activity activityContext) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activityContext, "$activityContext");
        if (System.currentTimeMillis() - this$0.startTimeMillis >= this$0.delayMillis) {
            String string = this$0.remoteConfig.getString("interstitial_text");
            Intrinsics.checkNotNullExpressionValue(string, "if (!BuildConfig.DEBUG) …12\"\n                    }");
            INSTANCE.getInstance().loadMainIntersAd(activityContext, string);
        }
    }
}
