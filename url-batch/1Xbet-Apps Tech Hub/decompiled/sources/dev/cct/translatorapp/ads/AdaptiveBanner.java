package dev.cct.translatorapp.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdaptiveBanner.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Ldev/cct/translatorapp/ads/AdaptiveBanner;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adView", "Lcom/google/android/gms/ads/AdView;", "adaptiveBannerId", "", "getContext", "()Landroid/content/Context;", "setContext", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "loadBanner", "", "adLayout", "Landroid/widget/FrameLayout;", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdaptiveBanner {
    private AdView adView;
    private String adaptiveBannerId;
    private Context context;
    private FirebaseRemoteConfig remoteConfig;

    public AdaptiveBanner(Context context) {
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

    public final void loadBanner(FrameLayout adLayout) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        this.adView = new AdView(this.context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        AdView adView = this.adView;
        AdView adView2 = null;
        if (adView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adView");
            adView = null;
        }
        adView.setLayoutParams(layoutParams);
        AdView adView3 = this.adView;
        if (adView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adView");
            adView3 = null;
        }
        adLayout.addView(adView3);
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        String string = firebaseRemoteConfig != null ? firebaseRemoteConfig.getString("adoptive_texttranslate") : null;
        this.adaptiveBannerId = string;
        if (string != null) {
            AdView adView4 = this.adView;
            if (adView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adView");
                adView4 = null;
            }
            String str = this.adaptiveBannerId;
            Intrinsics.checkNotNull(str);
            adView4.setAdUnitId(str);
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
        AdView adView5 = this.adView;
        if (adView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adView");
            adView5 = null;
        }
        adView5.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
        AdRequest build = new AdRequest.Builder().build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
        AdView adView6 = this.adView;
        if (adView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adView");
        } else {
            adView2 = adView6;
        }
        adView2.loadAd(build);
    }
}
