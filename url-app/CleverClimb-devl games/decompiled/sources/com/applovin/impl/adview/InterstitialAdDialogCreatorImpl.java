package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.adview.InterstitialAdDialogCreator;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class InterstitialAdDialogCreatorImpl implements InterstitialAdDialogCreator {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f2465a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<l> f2466b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private static WeakReference<Context> f2467c = new WeakReference<>(null);

    @Override // com.applovin.adview.InterstitialAdDialogCreator
    public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk appLovinSdk, Context context) {
        l lVar;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        synchronized (f2465a) {
            lVar = f2466b.get();
            if (lVar != null && lVar.isShowing() && f2467c.get() == context) {
                appLovinSdk.getLogger().c("InterstitialAdDialogCreator", "An interstitial dialog is already showing, returning it");
            }
            lVar = new l(appLovinSdk, context);
            f2466b = new WeakReference<>(lVar);
            f2467c = new WeakReference<>(context);
        }
        return lVar;
    }
}
