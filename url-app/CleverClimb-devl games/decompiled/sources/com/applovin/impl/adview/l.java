package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.ad.g;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
class l implements AppLovinInterstitialAdDialog {
    private static volatile boolean p;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.j f2603a;
    private final String e;
    private final com.applovin.impl.sdk.c f;
    private final WeakReference<Context> g;
    private volatile AppLovinAdLoadListener h;
    private volatile AppLovinAdDisplayListener i;
    private volatile AppLovinAdVideoPlaybackListener j;
    private volatile AppLovinAdClickListener k;
    private volatile com.applovin.impl.sdk.ad.g l;
    private volatile g.b m;
    private volatile i n;
    private volatile String o;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, l> f2602d = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f2600b = false;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f2601c = false;

    l(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f2603a = com.applovin.impl.sdk.e.l.a(appLovinSdk);
        this.e = UUID.randomUUID().toString();
        this.f = new com.applovin.impl.sdk.c();
        this.g = new WeakReference<>(context);
        f2600b = true;
        f2601c = false;
    }

    public static l a(String str) {
        return f2602d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.4
            @Override // java.lang.Runnable
            public void run() {
                if (l.this.h != null) {
                    l.this.h.failedToReceiveAd(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinInterstitialActivity.class);
        intent.putExtra(k.KEY_WRAPPER_ID, this.e);
        AppLovinInterstitialActivity.lastKnownWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            try {
                context.startActivity(intent);
                ((Activity) context).overridePendingTransition(0, 0);
            } catch (Throwable th) {
                this.f2603a.u().b("InterstitialAdDialogWrapper", "Unable to remove pending transition animations", th);
            }
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        a(true);
    }

    private void a(com.applovin.impl.sdk.ad.g gVar, String str, final Context context) {
        f2602d.put(this.e, this);
        this.l = gVar;
        this.o = str;
        this.m = this.l != null ? this.l.m() : g.b.DEFAULT;
        if (!com.applovin.impl.sdk.e.l.a(gVar, context, this.f2603a)) {
            this.f2603a.D().a(com.applovin.impl.sdk.c.g.o);
            if (this.l instanceof com.applovin.impl.a.a) {
                com.applovin.impl.a.k c2 = ((com.applovin.impl.a.a) this.l).c();
                if (c2 == null) {
                    this.f2603a.u().d("InterstitialAdDialogWrapper", "Cached video removed from local filesystem for VAST ad and source uri not found. Failing ad show.");
                    a(gVar);
                    return;
                }
                this.f2603a.u().d("InterstitialAdDialogWrapper", "Cached video removed from local filesystem for VAST ad. Setting videoUri to source: " + c2.a());
                c2.a(c2.a());
            } else if (this.l instanceof com.applovin.impl.sdk.ad.a) {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) this.l;
                if (!aVar.ag() || !aVar.d()) {
                    this.f2603a.u().d("InterstitialAdDialogWrapper", "Cached video removed from local filesystem for ad server ad: " + aVar.getAdIdNumber() + " and could not restore video stream url. Failing ad show.");
                    a(gVar);
                    return;
                }
                this.f2603a.u().d("InterstitialAdDialogWrapper", "Cached video removed from local filesystem for ad server ad. Restored video uri to video stream url: " + aVar.e());
            }
        }
        if (!com.applovin.impl.sdk.e.d.a((Class<?>) AppLovinInterstitialActivity.class, context)) {
            this.f2603a.u().e("AppLovinInterstitialAdDialog", "Unable to show ad. Please make sure you have AppLovinInterstitialActivity declared in your Android Manifest: <activity android:name=\"com.applovin.adview.AppLovinInterstitialActivity\" android:configChanges=\"orientation|screenSize\"/>");
            a(gVar);
            return;
        }
        long max = Math.max(0L, ((Long) this.f2603a.a(com.applovin.impl.sdk.b.b.dc)).longValue());
        this.f2603a.u().a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                l.this.a(context);
            }
        }, max);
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.i != null) {
            this.i.adHidden(appLovinAd);
        }
        p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                if (l.this.h != null) {
                    l.this.h.adReceived(appLovinAd);
                }
            }
        });
    }

    private Context i() {
        if (this.g != null) {
            return this.g.get();
        }
        return null;
    }

    public com.applovin.impl.sdk.j a() {
        return this.f2603a;
    }

    public void a(i iVar) {
        this.n = iVar;
    }

    protected void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2603a.n().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    public void a(boolean z) {
        p = z;
    }

    public AppLovinAd b() {
        return this.l;
    }

    public AppLovinAdVideoPlaybackListener c() {
        return this.j;
    }

    public AppLovinAdDisplayListener d() {
        return this.i;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void dismiss() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.5
            @Override // java.lang.Runnable
            public void run() {
                if (((Boolean) l.this.f2603a.a(com.applovin.impl.sdk.b.b.fe)).booleanValue() && l.this.n == null) {
                    return;
                }
                l.this.n.dismiss();
            }
        });
    }

    public AppLovinAdClickListener e() {
        return this.k;
    }

    public g.b f() {
        return this.m;
    }

    public String g() {
        return this.o;
    }

    public void h() {
        f2600b = false;
        f2601c = true;
        f2602d.remove(this.e);
        if (this.l == null || !this.l.P()) {
            return;
        }
        this.n = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public boolean isAdReadyToDisplay() {
        return this.f2603a.n().hasPreloadedAd(AppLovinAdSize.INTERSTITIAL);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public boolean isShowing() {
        return p;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.k = appLovinAdClickListener;
        this.f.a(appLovinAdClickListener);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.i = appLovinAdDisplayListener;
        this.f.a(appLovinAdDisplayListener);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.h = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.j = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        show(null);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show(final String str) {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.l.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                l.this.b(appLovinAd);
                l.this.showAndRender(appLovinAd, str);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                l.this.a(i);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        showAndRender(appLovinAd, null);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, String str) {
        com.applovin.impl.sdk.p u;
        String str2;
        String str3;
        if (isShowing() && !((Boolean) this.f2603a.a(com.applovin.impl.sdk.b.b.fd)).booleanValue()) {
            this.f2603a.u().e("AppLovinInterstitialAdDialog", "Attempted to show an interstitial while one is already displayed; ignoring.");
            return;
        }
        if (!com.applovin.impl.sdk.e.l.a(appLovinAd, this.f2603a)) {
            a(appLovinAd);
            return;
        }
        Context i = i();
        if (i != null) {
            AppLovinAd b2 = com.applovin.impl.sdk.e.l.b(appLovinAd, this.f2603a);
            if (b2 != null) {
                if (b2 instanceof com.applovin.impl.sdk.ad.g) {
                    a((com.applovin.impl.sdk.ad.g) b2, str, i);
                    return;
                }
                this.f2603a.u().d("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + b2 + "'");
                a(b2);
                return;
            }
            u = this.f2603a.u();
            str2 = "InterstitialAdDialogWrapper";
            str3 = "Failed to show ad: " + appLovinAd;
        } else {
            u = this.f2603a.u();
            str2 = "InterstitialAdDialogWrapper";
            str3 = "Failed to show interstitial: stale activity reference provided";
        }
        u.d(str2, str3);
        a(appLovinAd);
    }
}
