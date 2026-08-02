package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class wa extends u7 implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    public long f7822C;

    /* renamed from: D, reason: collision with root package name */
    public sd f7823D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7825F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7826G;

    /* renamed from: t, reason: collision with root package name */
    public WebView f7830t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout f7831u;
    public ImageButton v;

    /* renamed from: x, reason: collision with root package name */
    public xf f7833x;

    /* renamed from: w, reason: collision with root package name */
    public long f7832w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7834y = true;
    public boolean z = false;

    /* renamed from: A, reason: collision with root package name */
    public int f7820A = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7821B = false;

    /* renamed from: E, reason: collision with root package name */
    public x0 f7824E = new va(this);

    /* renamed from: H, reason: collision with root package name */
    public final la f7827H = new la(this);

    /* renamed from: I, reason: collision with root package name */
    public final ma f7828I = new ma(this);

    /* renamed from: J, reason: collision with root package name */
    public final na f7829J = new na(this);

    @Override // com.startapp.sdk.internal.u7
    public void a(Bundle bundle) {
        wb.a(this.f7658a).a(this.f7660c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            this.z = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.f7820A = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        bundle.putBoolean("videoCompletedBroadcastSent", this.z);
        bundle.putInt("replayNum", this.f7820A);
    }

    @Override // com.startapp.sdk.internal.u7
    public boolean c() {
        if (this.f7824E.c()) {
            return true;
        }
        if (this.f7674s != null && SystemClock.uptimeMillis() - this.f7822C < this.f7674s.longValue()) {
            return true;
        }
        i();
        fh.f6918a.getClass();
        xf xfVar = this.f7833x;
        if (xfVar == null) {
            return false;
        }
        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void d() {
        this.f7824E.e();
    }

    @Override // com.startapp.sdk.internal.u7
    public final void e() {
        super.e();
        sd sdVar = this.f7823D;
        if (sdVar != null) {
            F2.b bVar = sdVar.f7564a;
            if (bVar != null) {
                bVar.c();
            }
            this.f7823D = null;
        }
        WebView webView = this.f7830t;
        long N4 = MetaData.E().N();
        WeakHashMap weakHashMap = si.f7575a;
        new Handler(Looper.getMainLooper()).postDelayed(new oi(webView), N4);
    }

    @Override // com.startapp.sdk.internal.u7
    public void f() {
        this.f7825F = false;
        this.f7826G = true;
        this.f7824E.f();
        xf xfVar = this.f7833x;
        if (xfVar != null) {
            xfVar.a();
        }
        WebView webView = this.f7830t;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void g() {
        String str;
        String str2;
        this.f7825F = true;
        this.f7826G = false;
        Ad ad = this.f7668k;
        if (ad instanceof ka ? ((ka) ad).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            fh.f6918a.getClass();
            WebView webView = this.f7830t;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f7658a);
                this.f7831u = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.f7831u.setContentDescription("StartApp Ad");
                this.f7831u.setId(h0.f7042h);
                this.f7658a.setContentView(this.f7831u);
                try {
                    this.f7830t = ((rk) com.startapp.sdk.components.a.a(this.f7658a).f6561b.a()).c();
                    this.f7832w = SystemClock.uptimeMillis();
                    this.f7830t.setBackgroundColor(-16777216);
                    this.f7658a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.f7830t.setVerticalScrollBarEnabled(false);
                    this.f7830t.setHorizontalScrollBarEnabled(false);
                    this.f7830t.getSettings().setJavaScriptEnabled(true);
                    p0.a(this.f7830t);
                    this.f7830t.setOnLongClickListener(new oa());
                    this.f7830t.setLongClickable(false);
                    this.f7830t.addJavascriptInterface(l(), "startappwall");
                    a(this.f7830t);
                    this.f7830t.setWebViewClient(new ua(this));
                    this.f7830t.setWebChromeClient(new pa());
                    Ad ad2 = this.f7668k;
                    if (ad2 instanceof m8) {
                        str = ((m8) ad2).f7258b;
                        if (str != null && (str2 = this.n) != null && !str2.isEmpty()) {
                            str = str.replaceAll("startapp_adtag_placeholder", this.n);
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "<html><body></body></html>";
                    }
                    si.a(this.f7830t, str);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.f7821B = "true".equals(si.a(str, "@jsTag@", "@jsTag@"));
                    this.f7831u.addView(this.f7830t, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.f7831u);
                } catch (Throwable th) {
                    d9.a(th);
                    b();
                }
            } else {
                webView.onResume();
                xf xfVar = this.f7833x;
                if (xfVar != null) {
                    xfVar.c();
                }
            }
        }
        this.f7824E.g();
    }

    public void i() {
        String str;
        String[] strArr = this.f7661d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        g0.a(this.f7658a, str, new CloseTrackingParams(this.n, k()));
    }

    public final void j() {
        if (this.v != null) {
            return;
        }
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f7658a);
            ImageButton imageButton = new ImageButton(this.f7658a);
            this.v = imageButton;
            imageButton.setBackgroundColor(0);
            this.v.setOnClickListener(this);
            int a3 = ii.a(this.f7658a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(13);
            relativeLayout.addView(this.v, layoutParams);
            this.f7824E.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f7831u.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f7832w) / 1000;
    }

    public cb l() {
        OverlayActivity overlayActivity = this.f7658a;
        la laVar = this.f7827H;
        ma maVar = this.f7828I;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        boolean[] zArr = this.f7663f;
        boolean z = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        cb cbVar = new cb(overlayActivity, laVar, closeTrackingParams);
        cbVar.f6757b = z;
        cbVar.f6759d = laVar;
        cbVar.f6760e = maVar;
        return cbVar;
    }

    public long m() {
        Long l4 = this.o;
        return l4 != null ? TimeUnit.SECONDS.toMillis(l4.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.n);
        x0 x0Var = this.f7824E;
        x0Var.getClass();
        trackingParams.a(x0Var instanceof uc);
        return trackingParams;
    }

    public boolean o() {
        return this.f7824E.b();
    }

    public void onClick(View view) {
        this.f7824E.d();
    }

    public void p() {
        xf xfVar = this.f7833x;
        if (xfVar != null) {
            xfVar.c();
        }
    }

    public void q() {
        a(this.v);
        this.f7822C = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.z && this.f7820A == 0) {
            this.z = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            wb.a(this.f7658a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.v != null) {
                this.v.setImageDrawable(k2.a(this.f7658a.getResources()));
                this.v.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.v.setVisibility(0);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void b(String str, int i4, boolean z) {
        String str2;
        Boolean bool;
        boolean p2 = MetaData.E().p();
        OverlayActivity overlayActivity = this.f7658a;
        String[] strArr = this.f7666i;
        boolean z4 = true;
        String[] strArr2 = i4 < strArr.length ? new String[]{strArr[i4]} : null;
        String[] strArr3 = this.f7667j;
        if (i4 < strArr3.length) {
            str2 = strArr3[i4];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        long y4 = AdsCommonMetaData.k().y();
        long x4 = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f7663f;
        if (zArr != null && i4 >= 0 && i4 < zArr.length) {
            z4 = zArr[i4];
        }
        Boolean[] boolArr = this.f7671p;
        g0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, y4, x4, z4, (boolArr == null || i4 < 0 || i4 >= boolArr.length) ? bool : boolArr[i4], z, p2 ? new sa(this) : bool);
    }

    public void a(WebView webView) {
        this.f7834y = false;
        webView.setOnTouchListener(new qa(this));
        webView.setBackgroundColor(0);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.E().j0()) {
            try {
                sd sdVar = new sd(this.f7830t);
                this.f7823D = sdVar;
                F2.b bVar = sdVar.f7564a;
                if (bVar != null) {
                    bVar.e();
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.f7659b;
                    if (aVar != null && (adInformationView = aVar.f6345b) != null) {
                        sd sdVar2 = this.f7823D;
                        F2.e eVar = F2.e.f769c;
                        F2.b bVar2 = sdVar2.f7564a;
                        if (bVar2 != null) {
                            bVar2.a(adInformationView, eVar);
                        }
                    }
                    if (imageButton != null) {
                        sd sdVar3 = this.f7823D;
                        F2.e eVar2 = F2.e.f768b;
                        F2.b bVar3 = sdVar3.f7564a;
                        if (bVar3 != null) {
                            bVar3.a(imageButton, eVar2);
                        }
                    }
                    sd sdVar4 = this.f7823D;
                    WebView webView = this.f7830t;
                    F2.b bVar4 = sdVar4.f7564a;
                    if (bVar4 != null) {
                        bVar4.d(webView);
                    }
                    sd sdVar5 = this.f7823D;
                    if (sdVar5.f7565b != null && sdVar5.f7568e.compareAndSet(false, true)) {
                        sdVar5.f7565b.b();
                    }
                    this.f7823D.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void b() {
        super.b();
        fh.f6918a.getClass();
        xf xfVar = this.f7833x;
        if (xfVar != null) {
            xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f7658a.runOnUiThread(new ta(this));
    }

    public void a(String str) {
        if ("closeAd".equals(str)) {
            la laVar = this.f7827H;
            laVar.f7214a.i();
            laVar.f7214a.b();
        }
    }

    public boolean a(String str, boolean z) {
        this.f7824E.a();
        xf xfVar = this.f7833x;
        if (xfVar != null) {
            xfVar.a(null, null);
        }
        Context a3 = w0.a(this.f7658a);
        if (a3 == null) {
            a3 = this.f7658a;
        }
        boolean a4 = g0.a(a3);
        if (this.f7824E.a(str)) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (this.f7662e[parseInt] && !a4) {
                    b(str, parseInt, z);
                } else {
                    a(str, parseInt, z);
                }
            } catch (Throwable th) {
                d9.a(th);
                return false;
            }
        } else if (this.f7662e[0] && !a4) {
            b(str, 0, z);
        } else {
            a(str, 0, z);
        }
        return true;
    }

    public final void a(String str, int i4, boolean z) {
        boolean z4;
        String str2;
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        wb.a(this.f7658a).a(intent);
        Context a3 = w0.a(this.f7658a);
        if (a3 == null) {
            a3 = this.f7658a;
        }
        boolean a4 = g0.a(a3);
        OverlayActivity overlayActivity = this.f7658a;
        String[] strArr = this.f7666i;
        boolean z5 = true;
        String[] strArr2 = i4 < strArr.length ? new String[]{strArr[i4]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        boolean[] zArr = this.f7663f;
        if (!((zArr == null || i4 < 0 || i4 >= zArr.length) ? true : zArr[i4]) || a4) {
            z5 = false;
            z4 = z;
            str2 = str;
        } else {
            str2 = str;
            z4 = z;
        }
        g0.a(overlayActivity, str2, strArr2, closeTrackingParams, z5, z4);
        if (MetaData.E().p()) {
            b();
        }
    }
}
