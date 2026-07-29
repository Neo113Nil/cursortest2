package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.g;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdUpdateListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.ads.AudienceNetworkActivity;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class AdViewControllerImpl implements AdViewController {
    private volatile AppLovinAdDisplayListener A;
    private volatile AppLovinAdViewEventListener B;
    private volatile AppLovinAdClickListener C;
    private volatile boolean D;

    /* renamed from: a, reason: collision with root package name */
    private Context f2438a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f2439b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.j f2440c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f2441d;
    private com.applovin.impl.sdk.p e;
    private AppLovinAdSize f;
    private String g;
    private String h;
    private com.applovin.impl.sdk.c.d i;
    private com.applovin.impl.adview.d j;
    private d k;
    private com.applovin.impl.adview.c l;
    private AppLovinAd m;
    private Runnable n;
    private Runnable o;
    private volatile AppLovinAd p = null;
    private volatile AppLovinAd q = null;
    private f r = null;
    private j s = null;
    private j t = null;
    private final AtomicReference<AppLovinAd> u = new AtomicReference<>();
    private volatile boolean v = false;
    private volatile boolean w = true;
    private volatile boolean x = false;
    private volatile boolean y = false;
    private volatile AppLovinAdLoadListener z;

    private class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdViewControllerImpl.this.l != null) {
                AdViewControllerImpl.this.l.setVisibility(8);
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdViewControllerImpl.this.l != null) {
                try {
                    AdViewControllerImpl.this.l.loadDataWithBaseURL("/", "<html></html>", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
                } catch (Exception unused) {
                }
            }
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdViewControllerImpl.this.p != null) {
                if (AdViewControllerImpl.this.l == null) {
                    AdViewControllerImpl.this.f2440c.u().e("AppLovinAdView", "Unable to render advertisement for ad #" + AdViewControllerImpl.this.p.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    return;
                }
                AdViewControllerImpl.this.e.a("AppLovinAdView", "Rendering advertisement ad for #" + AdViewControllerImpl.this.p.getAdIdNumber() + " over placement: \"" + AdViewControllerImpl.this.h + "\"...");
                AdViewControllerImpl.b(AdViewControllerImpl.this.l, AdViewControllerImpl.this.p.getSize());
                AdViewControllerImpl.this.l.a(AdViewControllerImpl.this.p, AdViewControllerImpl.this.h);
                if (AdViewControllerImpl.this.p.getSize() != AppLovinAdSize.INTERSTITIAL && !AdViewControllerImpl.this.x && !(AdViewControllerImpl.this.p instanceof com.applovin.impl.sdk.ad.i)) {
                    AdViewControllerImpl.this.i = new com.applovin.impl.sdk.c.d(AdViewControllerImpl.this.p, AdViewControllerImpl.this.f2440c);
                    AdViewControllerImpl.this.i.a();
                    AdViewControllerImpl.this.l.a(AdViewControllerImpl.this.i);
                    if (AdViewControllerImpl.this.p instanceof com.applovin.impl.sdk.ad.g) {
                        ((com.applovin.impl.sdk.ad.g) AdViewControllerImpl.this.p).setHasShown(true);
                    }
                }
                if (AdViewControllerImpl.this.l.c() == null || !(AdViewControllerImpl.this.p instanceof com.applovin.impl.sdk.ad.g)) {
                    return;
                }
                AdViewControllerImpl.this.l.c().a(((com.applovin.impl.sdk.ad.g) AdViewControllerImpl.this.p).s() ? 0L : 1L);
            }
        }
    }

    static class d implements AppLovinAdLoadListener, AppLovinAdUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAdService f2454a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f2455b;

        /* renamed from: c, reason: collision with root package name */
        private final AdViewControllerImpl f2456c;

        d(AdViewControllerImpl adViewControllerImpl, com.applovin.impl.sdk.j jVar) {
            if (adViewControllerImpl == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (jVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f2455b = jVar.u();
            this.f2454a = jVar.n();
            this.f2456c = adViewControllerImpl;
        }

        private AdViewControllerImpl a() {
            return this.f2456c;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            AdViewControllerImpl a2 = a();
            if (a2 != null) {
                a2.a(appLovinAd);
            } else {
                this.f2455b.e("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdUpdateListener
        public void adUpdated(AppLovinAd appLovinAd) {
            AdViewControllerImpl a2 = a();
            if (a2 != null) {
                a2.a(appLovinAd);
            } else {
                this.f2454a.removeAdUpdateListener(this, appLovinAd.getSize());
                this.f2455b.e("AppLovinAdView", "Ad view has been garbage collected by the time an ad was updated");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            AdViewControllerImpl a2 = a();
            if (a2 != null) {
                a2.a(i);
            }
        }

        public String toString() {
            return "[AdViewController listener: " + hashCode() + "]";
        }
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.j jVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f2440c = jVar;
        this.f2441d = jVar.n();
        this.e = jVar.u();
        this.f = appLovinAdSize;
        this.g = str;
        this.f2438a = context;
        this.f2439b = appLovinAdView;
        this.m = new com.applovin.impl.sdk.ad.i();
        this.j = new com.applovin.impl.adview.d(this, jVar);
        this.o = new a();
        this.n = new c();
        this.k = new d(this, jVar);
        a(appLovinAdSize);
    }

    private void a(com.applovin.impl.sdk.ad.g gVar, AppLovinAdView appLovinAdView, Uri uri) {
        if (this.r != null) {
            this.e.a("AppLovinAdView", "Skipping click overlay rendering because it already exists");
            return;
        }
        if (appLovinAdView == null) {
            this.e.d("AppLovinAdView", "Skipping click overlay rendering because AppLovinAdView has been destroyed");
            return;
        }
        this.e.a("AppLovinAdView", "Creating and rendering click overlay");
        this.r = new f(appLovinAdView.getContext(), this.f2440c);
        this.r.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        appLovinAdView.addView(this.r);
        appLovinAdView.bringChildToFront(this.r);
        this.f2441d.trackAndLaunchForegroundClick(gVar, this.h, appLovinAdView, this, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAdSize appLovinAdSize) {
        b bVar;
        try {
            this.l = new com.applovin.impl.adview.c(this.j, this.f2440c, this.f2438a);
            this.l.setBackgroundColor(0);
            this.l.setWillNotCacheDrawing(false);
            this.f2439b.setBackgroundColor(0);
            this.f2439b.addView(this.l);
            b(this.l, appLovinAdSize);
            if (!this.f2440c.g()) {
                if (!this.v) {
                    a(this.o);
                }
                if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.fm)).booleanValue()) {
                    bVar = new b();
                    a(bVar);
                }
                this.v = true;
                return;
            }
            if (!this.v && ((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.el)).booleanValue()) {
                a(this.o);
            }
            if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.em)).booleanValue()) {
                bVar = new b();
                a(bVar);
            }
            this.v = true;
            return;
        } catch (Throwable th) {
            this.e.e("AppLovinAdView", "Failed to create AdView: " + th.getMessage());
        }
        this.e.e("AppLovinAdView", "Failed to create AdView: " + th.getMessage());
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    private void b() {
        if (this.e != null) {
            this.e.a("AppLovinAdView", "Destroying...");
        }
        if (this.f2441d != null) {
            this.f2441d.removeAdUpdateListener(this.k, getSize());
        }
        if (this.l != null) {
            try {
                ViewParent parent = this.l.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.l);
                }
                this.l.removeAllViews();
                if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.eZ)).booleanValue()) {
                    try {
                        this.l.loadUrl("about:blank");
                        this.l.onPause();
                        this.l.destroyDrawingCache();
                    } catch (Throwable th) {
                        this.e.b("AppLovinAdView", "Encountered error while cleaning up WebView", th);
                    }
                }
                this.l.destroy();
                this.l = null;
            } catch (Throwable th2) {
                this.e.a("AppLovinAdView", "Unable to destroy ad view", th2);
            }
        }
        this.x = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int applyDimension2 = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.1
            @Override // java.lang.Runnable
            public void run() {
                if (AdViewControllerImpl.this.s != null) {
                    AdViewControllerImpl.this.e.a("AppLovinAdView", "Detaching expanded ad: " + AdViewControllerImpl.this.s.a());
                    AdViewControllerImpl.this.t = AdViewControllerImpl.this.s;
                    AdViewControllerImpl.this.s = null;
                    AdViewControllerImpl.this.a(AdViewControllerImpl.this.f);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.6
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a a2;
                if (AdViewControllerImpl.this.t == null && AdViewControllerImpl.this.s == null) {
                    return;
                }
                if (AdViewControllerImpl.this.t != null) {
                    a2 = AdViewControllerImpl.this.t.a();
                    AdViewControllerImpl.this.t.dismiss();
                    AdViewControllerImpl.this.t = null;
                } else {
                    a2 = AdViewControllerImpl.this.s.a();
                    AdViewControllerImpl.this.s.dismiss();
                    AdViewControllerImpl.this.s = null;
                }
                com.applovin.impl.sdk.e.g.b(AdViewControllerImpl.this.B, a2, (AppLovinAdView) AdViewControllerImpl.this.f2439b, AdViewControllerImpl.this.f2440c);
            }
        });
    }

    private void e() {
        if (this.i != null) {
            this.i.c();
            this.i = null;
        }
    }

    void a() {
        if (this.s != null || this.t != null) {
            if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.cA)).booleanValue()) {
                contractAd();
                return;
            }
            return;
        }
        this.e.a("AppLovinAdView", "Ad: " + this.p + " with placement = \"" + this.h + "\" closed.");
        a(this.o);
        com.applovin.impl.sdk.e.g.b(this.A, this.p, this.f2440c);
        this.p = null;
        this.h = null;
    }

    void a(final int i) {
        if (!this.x) {
            this.f2441d.addAdUpdateListener(this.k, this.f);
            a(this.o);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AdViewControllerImpl.this.z != null) {
                        AdViewControllerImpl.this.z.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    AdViewControllerImpl.this.e.c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    void a(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            this.e.d("AppLovinAdView", "No provided when to the view controller");
            a(-1);
            return;
        }
        this.y = true;
        if (this.x) {
            this.u.set(appLovinAd);
            this.e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
        } else {
            this.f2441d.addAdUpdateListener(this.k, this.f);
            renderAd(appLovinAd);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (AdViewControllerImpl.this.z != null) {
                        AdViewControllerImpl.this.z.adReceived(appLovinAd);
                    }
                } catch (Throwable th) {
                    AdViewControllerImpl.this.e.e("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                }
            }
        });
    }

    void a(AppLovinAd appLovinAd, String str, AppLovinAdView appLovinAdView, Uri uri) {
        com.applovin.impl.sdk.p pVar;
        String str2;
        String str3;
        com.applovin.impl.sdk.e.g.a(this.C, appLovinAd, this.f2440c);
        if (appLovinAdView == null) {
            pVar = this.e;
            str2 = "AppLovinAdView";
            str3 = "Unable to process ad click - AppLovinAdView destroyed prematurely";
        } else {
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.g) {
                com.applovin.impl.sdk.ad.g gVar = (com.applovin.impl.sdk.ad.g) appLovinAd;
                if (!((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.cb)).booleanValue() || uri == null) {
                    this.f2441d.trackAndLaunchClick(gVar, str, appLovinAdView, this, uri);
                    return;
                } else {
                    a(gVar, appLovinAdView, uri);
                    return;
                }
            }
            pVar = this.e;
            str2 = "AppLovinAdView";
            str3 = "Unable to process ad click - EmptyAd is not supported.";
        }
        pVar.d(str2, str3);
    }

    @Override // com.applovin.adview.AdViewController
    public void contractAd() {
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                AdViewControllerImpl.this.d();
                if (AdViewControllerImpl.this.f2439b == null || AdViewControllerImpl.this.l == null || AdViewControllerImpl.this.l.getParent() != null) {
                    return;
                }
                AdViewControllerImpl.this.f2439b.addView(AdViewControllerImpl.this.l);
                AdViewControllerImpl.b(AdViewControllerImpl.this.l, AdViewControllerImpl.this.p.getSize());
            }
        });
    }

    @Override // com.applovin.adview.AdViewController
    public void destroy() {
        if (this.l != null && this.s != null) {
            contractAd();
        }
        b();
    }

    public void dismissInterstitialIfRequired() {
        if ((this.f2438a instanceof AppLovinInterstitialActivity) && (this.p instanceof com.applovin.impl.sdk.ad.g)) {
            boolean z = ((com.applovin.impl.sdk.ad.g) this.p).F() == g.a.DISMISS;
            AppLovinInterstitialActivity appLovinInterstitialActivity = (AppLovinInterstitialActivity) this.f2438a;
            if (z && appLovinInterstitialActivity.getPoststitialWasDisplayed()) {
                appLovinInterstitialActivity.dismiss();
            }
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void expandAd() {
        a(new Runnable() { // from class: com.applovin.impl.adview.AdViewControllerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (AdViewControllerImpl.this.s == null && (AdViewControllerImpl.this.p instanceof com.applovin.impl.sdk.ad.a) && AdViewControllerImpl.this.l != null) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) AdViewControllerImpl.this.p;
                    Activity a2 = AdViewControllerImpl.this.f2438a instanceof Activity ? (Activity) AdViewControllerImpl.this.f2438a : com.applovin.impl.sdk.e.l.a(AdViewControllerImpl.this.l, AdViewControllerImpl.this.f2440c);
                    if (a2 == null) {
                        AdViewControllerImpl.this.e.e("AppLovinAdView", "Unable to expand ad. No Activity found.");
                        Uri g = aVar.g();
                        if (g != null && ((Boolean) AdViewControllerImpl.this.f2440c.a(com.applovin.impl.sdk.b.b.cH)).booleanValue()) {
                            AdViewControllerImpl.this.f2441d.trackAndLaunchClick(aVar, AdViewControllerImpl.this.h, AdViewControllerImpl.this.getParentView(), AdViewControllerImpl.this, g);
                            if (AdViewControllerImpl.this.i != null) {
                                AdViewControllerImpl.this.i.b();
                            }
                        }
                        AdViewControllerImpl.this.l.a("javascript:al_onFailedExpand();");
                        return;
                    }
                    if (AdViewControllerImpl.this.f2439b != null) {
                        AdViewControllerImpl.this.f2439b.removeView(AdViewControllerImpl.this.l);
                    }
                    AdViewControllerImpl.this.s = new j(aVar, AdViewControllerImpl.this.h, AdViewControllerImpl.this.l, a2, AdViewControllerImpl.this.f2440c);
                    AdViewControllerImpl.this.s.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.AdViewControllerImpl.2.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            AdViewControllerImpl.this.contractAd();
                        }
                    });
                    AdViewControllerImpl.this.s.show();
                    com.applovin.impl.sdk.e.g.a(AdViewControllerImpl.this.B, AdViewControllerImpl.this.p, (AppLovinAdView) AdViewControllerImpl.this.f2439b, AdViewControllerImpl.this.f2440c);
                    if (AdViewControllerImpl.this.i != null) {
                        AdViewControllerImpl.this.i.d();
                    }
                }
            }
        });
    }

    public AppLovinAdViewEventListener getAdViewEventListener() {
        return this.B;
    }

    public com.applovin.impl.adview.c getAdWebView() {
        return this.l;
    }

    public AppLovinAd getCurrentAd() {
        return this.p;
    }

    public AppLovinAdView getParentView() {
        return (AppLovinAdView) this.f2439b;
    }

    public com.applovin.impl.sdk.j getSdk() {
        return this.f2440c;
    }

    @Override // com.applovin.adview.AdViewController
    public AppLovinAdSize getSize() {
        return this.f;
    }

    @Override // com.applovin.adview.AdViewController
    public String getZoneId() {
        return this.g;
    }

    @Override // com.applovin.adview.AdViewController
    public void initializeAdView(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            Log.e("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.e.b.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk == null || appLovinSdk.hasCriticalErrors()) {
            return;
        }
        a(appLovinAdView, com.applovin.impl.sdk.e.l.a(appLovinSdk), appLovinAdSize2, str, context);
        if (com.applovin.impl.sdk.e.b.b(attributeSet)) {
            loadNextAd();
        }
    }

    @Override // com.applovin.adview.AdViewController
    public boolean isAdReadyToDisplay() {
        return !TextUtils.isEmpty(this.g) ? this.f2441d.hasPreloadedAdForZoneId(this.g) : this.f2441d.hasPreloadedAd(this.f);
    }

    @Override // com.applovin.adview.AdViewController
    public boolean isAutoDestroy() {
        return this.w;
    }

    public boolean isForegroundClickInvalidated() {
        return this.D;
    }

    @Override // com.applovin.adview.AdViewController
    public void loadNextAd() {
        if (this.f2440c == null || this.k == null || this.f2438a == null || !this.v) {
            Log.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f2441d.loadNextAd(this.g, this.f, this.k);
        }
    }

    public void onAdHtmlLoaded(WebView webView) {
        if (this.p instanceof com.applovin.impl.sdk.ad.g) {
            webView.setVisibility(0);
            try {
                if (this.p == this.q || this.A == null) {
                    return;
                }
                this.q = this.p;
                com.applovin.impl.sdk.e.g.a(this.A, this.p, this.f2440c);
            } catch (Throwable th) {
                this.e.c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void onDetachedFromWindow() {
        if (this.v) {
            if (this.p != this.m) {
                com.applovin.impl.sdk.e.g.b(this.A, this.p, this.f2440c);
            }
            if (this.l == null || this.s == null) {
                this.e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            } else {
                this.e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.cz)).booleanValue()) {
                    contractAd();
                } else {
                    c();
                }
            }
            if (this.w) {
                b();
            }
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void onVisibilityChanged(int i) {
        if (this.v && this.w) {
            if (i == 8 || i == 4) {
                pause();
            } else if (i == 0) {
                resume();
            }
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void pause() {
        if (this.v) {
            if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.fi)).booleanValue()) {
                this.f2441d.removeAdUpdateListener(this.k, getSize());
            }
            AppLovinAd appLovinAd = this.p;
            renderAd(this.m, this.h);
            if (appLovinAd != null) {
                this.u.set(appLovinAd);
            }
            this.x = true;
        }
    }

    public void removeClickTrackingOverlay() {
        if (this.r == null) {
            this.e.a("AppLovinAdView", "Asked to remove an overlay when none existed. Skipping...");
            return;
        }
        ViewParent parent = this.r.getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(this.r);
        this.r = null;
    }

    @Override // com.applovin.adview.AdViewController
    public void renderAd(AppLovinAd appLovinAd) {
        renderAd(appLovinAd, null);
    }

    @Override // com.applovin.adview.AdViewController
    public void renderAd(AppLovinAd appLovinAd, String str) {
        com.applovin.impl.sdk.p pVar;
        String str2;
        String str3;
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (!this.v) {
            Log.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        AppLovinAd b2 = com.applovin.impl.sdk.e.l.b(appLovinAd, this.f2440c);
        if (b2 == null || b2 == this.p) {
            if (b2 == null) {
                pVar = this.e;
                str2 = "AppLovinAdView";
                str3 = "Unable to render ad. Ad is null. Internal inconsistency error.";
            } else {
                pVar = this.e;
                str2 = "AppLovinAdView";
                str3 = "Ad #" + b2.getAdIdNumber() + " is already showing, ignoring";
            }
            pVar.c(str2, str3);
            return;
        }
        this.e.a("AppLovinAdView", "Rendering ad #" + b2.getAdIdNumber() + " (" + b2.getSize() + ") over placement: " + str);
        if (!(this.p instanceof com.applovin.impl.sdk.ad.i)) {
            com.applovin.impl.sdk.e.g.b(this.A, this.p, this.f2440c);
            if (!(b2 instanceof com.applovin.impl.sdk.ad.i) && b2.getSize() != AppLovinAdSize.INTERSTITIAL) {
                e();
            }
        }
        this.u.set(null);
        this.q = null;
        this.p = b2;
        this.h = str;
        if ((appLovinAd instanceof com.applovin.impl.sdk.ad.g) && !this.x && (this.f == AppLovinAdSize.BANNER || this.f == AppLovinAdSize.MREC || this.f == AppLovinAdSize.LEADER)) {
            this.f2440c.n().trackImpression((com.applovin.impl.sdk.ad.g) appLovinAd, str);
        }
        if (b2.getSize() != this.f) {
            this.e.d("AppLovinAdView", "Unable to render ad: ad size " + b2.getSize() + " does not match AdViewController size " + this.f + ".");
            return;
        }
        boolean z = b2 instanceof com.applovin.impl.sdk.ad.i;
        if (!z && this.s != null) {
            if (((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.cy)).booleanValue()) {
                d();
                this.e.a("AppLovinAdView", "Fade out the old ad scheduled");
            } else {
                c();
            }
        }
        if (!z || (this.s == null && this.t == null)) {
            a(this.n);
        } else {
            this.e.a("AppLovinAdView", "Ignoring empty ad render with expanded ad");
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void resume() {
        if (this.v) {
            if (this.y && ((Boolean) this.f2440c.a(com.applovin.impl.sdk.b.b.fi)).booleanValue()) {
                this.f2441d.addAdUpdateListener(this.k, this.f);
            }
            AppLovinAd andSet = this.u.getAndSet(null);
            if (andSet != null) {
                renderAd(andSet, this.h);
            }
            this.x = false;
        }
    }

    @Override // com.applovin.adview.AdViewController
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.C = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AdViewController
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.A = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AdViewController
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.z = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AdViewController
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
    }

    @Override // com.applovin.adview.AdViewController
    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.B = appLovinAdViewEventListener;
    }

    @Override // com.applovin.adview.AdViewController
    public void setAutoDestroy(boolean z) {
        this.w = z;
    }

    public void setIsForegroundClickInvalidated(boolean z) {
        this.D = z;
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.c.d dVar) {
        if (this.l != null) {
            this.l.a(dVar);
        }
    }
}
