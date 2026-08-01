package dev.cct.translatorapp.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollapsibleBannerAd.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\u000fR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Ldev/cct/translatorapp/ads/CollapsibleBannerAd;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adView", "Lcom/google/android/gms/ads/AdView;", "adaptiveBannerId", "", "getContext", "()Landroid/content/Context;", "setContext", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "loadBanner", "", "adLayout", "Landroid/widget/FrameLayout;", "bannerId", "resumeAd", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollapsibleBannerAd {
    private AdView adView;
    private String adaptiveBannerId;
    private Context context;
    private FirebaseRemoteConfig remoteConfig;

    public CollapsibleBannerAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void loadBanner(FrameLayout adLayout, String bannerId) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(bannerId, "bannerId");
        if (new Preferences(this.context).getCheckBillingStatus()) {
            return;
        }
        this.adView = new AdView(this.context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        AdView adView = this.adView;
        if (adView != null) {
            adView.setLayoutParams(layoutParams);
        }
        adLayout.addView(this.adView);
        AdView adView2 = this.adView;
        if (adView2 != null) {
            adView2.setAdUnitId(bannerId);
        }
        Object systemService = this.context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        float width = adLayout.getWidth();
        if (width == 0.0f) {
            width = displayMetrics.widthPixels;
        }
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.context, (int) (width / f));
        Intrinsics.checkNotNullExpressionValue(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…rAdSize(context, adWidth)");
        Bundle bundle = new Bundle();
        bundle.putString("collapsible", "bottom");
        AdView adView3 = this.adView;
        if (adView3 != null) {
            adView3.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
        }
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        AdView adView4 = this.adView;
        if (adView4 != null) {
            adView4.loadAd(build);
        }
    }

    public final void resumeAd() {
        AdView adView = this.adView;
        if (adView == null || adView == null) {
            return;
        }
        adView.resume();
    }
}
