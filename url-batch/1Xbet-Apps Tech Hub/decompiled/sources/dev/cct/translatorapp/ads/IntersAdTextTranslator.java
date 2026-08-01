package dev.cct.translatorapp.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
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

/* compiled from: IntersAdTextTranslator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Ldev/cct/translatorapp/ads/IntersAdTextTranslator;", "", "()V", "<set-?>", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "intersInstance", "getIntersInstance", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "loadTransIntersAd", "", "mContext", "Landroid/content/Context;", FacebookMediationAdapter.KEY_ID, "", "showTransIntersAd", "activityContext", "Landroid/app/Activity;", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersAdTextTranslator {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile IntersAdTextTranslator instance;
    private InterstitialAd intersInstance;

    public final InterstitialAd getIntersInstance() {
        return this.intersInstance;
    }

    /* compiled from: IntersAdTextTranslator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ldev/cct/translatorapp/ads/IntersAdTextTranslator$Companion;", "", "()V", "instance", "Ldev/cct/translatorapp/ads/IntersAdTextTranslator;", "getInstance", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntersAdTextTranslator getInstance() {
            IntersAdTextTranslator intersAdTextTranslator = IntersAdTextTranslator.instance;
            if (intersAdTextTranslator == null) {
                synchronized (this) {
                    intersAdTextTranslator = IntersAdTextTranslator.instance;
                    if (intersAdTextTranslator == null) {
                        intersAdTextTranslator = new IntersAdTextTranslator();
                        Companion companion = IntersAdTextTranslator.INSTANCE;
                        IntersAdTextTranslator.instance = intersAdTextTranslator;
                    }
                }
            }
            return intersAdTextTranslator;
        }
    }

    public final void loadTransIntersAd(Context mContext, String id) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(id, "id");
        if (new Preferences(mContext).getCheckBillingStatus()) {
            return;
        }
        InterstitialAd.load(mContext, id, new AdRequest.Builder().build(), new InterstitialAdLoadCallback() { // from class: dev.cct.translatorapp.ads.IntersAdTextTranslator$loadTransIntersAd$1$1
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
                IntersAdTextTranslator.this.intersInstance = ad;
                InterstitialAd intersInstance = IntersAdTextTranslator.this.getIntersInstance();
                if (intersInstance == null) {
                    return;
                }
                final IntersAdTextTranslator intersAdTextTranslator = IntersAdTextTranslator.this;
                intersInstance.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: dev.cct.translatorapp.ads.IntersAdTextTranslator$loadTransIntersAd$1$1$onAdLoaded$1
                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdDismissedFullScreenContent() {
                        IntersAdTextTranslator.this.intersInstance = null;
                        AppOpenAd.INSTANCE.setIntersAdShow(false);
                    }

                    @Override // com.google.android.gms.ads.FullScreenContentCallback
                    public void onAdFailedToShowFullScreenContent(AdError p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        IntersAdTextTranslator.this.intersInstance = null;
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

    public final void showTransIntersAd(Activity activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        if (this.intersInstance != null) {
            AppOpenAd.INSTANCE.setIntersAdShow(true);
            InterstitialAd interstitialAd = this.intersInstance;
            if (interstitialAd != null) {
                interstitialAd.show(activityContext);
            }
        }
    }
}
