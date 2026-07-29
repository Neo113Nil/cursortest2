package com.applovin.adview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.impl.adview.InterstitialAdDialogCreatorImpl;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinInterstitialAd extends View {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinInterstitialAdDialog f2375a;

    public AppLovinInterstitialAd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinInterstitialAd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2375a = null;
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(context);
        if (appLovinSdk != null && !appLovinSdk.hasCriticalErrors()) {
            this.f2375a = new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(appLovinSdk, context);
        }
        setVisibility(8);
    }

    public static AppLovinInterstitialAdDialog create(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context != null) {
            return new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(appLovinSdk, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Deprecated
    public static boolean isAdReadyToDisplay(Context context) {
        return AppLovinSdk.getInstance(context).getAdService().hasPreloadedAd(AppLovinAdSize.INTERSTITIAL);
    }

    public static void show(Context context) {
        show(context, null);
    }

    @Deprecated
    public static void show(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(context);
        if (appLovinSdk == null || appLovinSdk.hasCriticalErrors()) {
            return;
        }
        show(appLovinSdk, context, str);
    }

    @Deprecated
    public static void show(final AppLovinSdk appLovinSdk, final Context context, final String str) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.adview.AppLovinInterstitialAd.1
            @Override // java.lang.Runnable
            public void run() {
                new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(AppLovinSdk.this, context).show(str);
            }
        });
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2375a != null) {
            this.f2375a.show();
        }
    }
}
