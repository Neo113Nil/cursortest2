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
import j1.AbstractC1053b;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class wa extends u7 implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    public long f4677C;

    /* renamed from: D, reason: collision with root package name */
    public sd f4678D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4680F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4681G;

    /* renamed from: t, reason: collision with root package name */
    public WebView f4685t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout f4686u;
    public ImageButton v;

    /* renamed from: x, reason: collision with root package name */
    public xf f4688x;

    /* renamed from: w, reason: collision with root package name */
    public long f4687w = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4689y = true;
    public boolean z = false;

    /* renamed from: A, reason: collision with root package name */
    public int f4675A = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4676B = false;

    /* renamed from: E, reason: collision with root package name */
    public x0 f4679E = new va(this);

    /* renamed from: H, reason: collision with root package name */
    public final la f4682H = new la(this);

    /* renamed from: I, reason: collision with root package name */
    public final ma f4683I = new ma(this);

    /* renamed from: J, reason: collision with root package name */
    public final na f4684J = new na(this);

    @Override // com.startapp.sdk.internal.u7
    public void a(Bundle bundle) {
        wb.a(this.f4518a).a(this.f4520c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            this.z = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.f4675A = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public final void b(Bundle bundle) {
        bundle.putBoolean("videoCompletedBroadcastSent", this.z);
        bundle.putInt("replayNum", this.f4675A);
    }

    @Override // com.startapp.sdk.internal.u7
    public boolean c() {
        if (this.f4679E.c()) {
            return true;
        }
        if (this.f4534s != null && SystemClock.uptimeMillis() - this.f4677C < this.f4534s.longValue()) {
            return true;
        }
        i();
        fh.f3800a.getClass();
        xf xfVar = this.f4688x;
        if (xfVar == null) {
            return false;
        }
        xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.u7
    public final void d() {
        this.f4679E.e();
    }

    @Override // com.startapp.sdk.internal.u7
    public final void e() {
        super.e();
        sd sdVar = this.f4678D;
        if (sdVar != null) {
            AbstractC1053b abstractC1053b = sdVar.f4427a;
            if (abstractC1053b != null) {
                abstractC1053b.c();
            }
            this.f4678D = null;
        }
        WebView webView = this.f4685t;
        long N2 = MetaData.E().N();
        WeakHashMap weakHashMap = si.f4438a;
        new Handler(Looper.getMainLooper()).postDelayed(new oi(webView), N2);
    }

    @Override // com.startapp.sdk.internal.u7
    public void f() {
        this.f4680F = false;
        this.f4681G = true;
        this.f4679E.f();
        xf xfVar = this.f4688x;
        if (xfVar != null) {
            xfVar.a();
        }
        WebView webView = this.f4685t;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void g() {
        String str;
        String str2;
        this.f4680F = true;
        this.f4681G = false;
        Ad ad = this.f4527k;
        if (ad instanceof ka ? ((ka) ad).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            fh.f3800a.getClass();
            WebView webView = this.f4685t;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f4518a);
                this.f4686u = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.f4686u.setContentDescription("StartApp Ad");
                this.f4686u.setId(h0.f3917h);
                this.f4518a.setContentView(this.f4686u);
                try {
                    this.f4685t = ((rk) com.startapp.sdk.components.a.a(this.f4518a).f3463b.a()).c();
                    this.f4687w = SystemClock.uptimeMillis();
                    this.f4685t.setBackgroundColor(-16777216);
                    this.f4518a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.f4685t.setVerticalScrollBarEnabled(false);
                    this.f4685t.setHorizontalScrollBarEnabled(false);
                    this.f4685t.getSettings().setJavaScriptEnabled(true);
                    p0.a(this.f4685t);
                    this.f4685t.setOnLongClickListener(new oa());
                    this.f4685t.setLongClickable(false);
                    this.f4685t.addJavascriptInterface(l(), "startappwall");
                    a(this.f4685t);
                    this.f4685t.setWebViewClient(new ua(this));
                    this.f4685t.setWebChromeClient(new pa());
                    Ad ad2 = this.f4527k;
                    if (ad2 instanceof m8) {
                        str = ((m8) ad2).f4130b;
                        if (str != null && (str2 = this.f4530n) != null && !str2.isEmpty()) {
                            str = str.replaceAll("startapp_adtag_placeholder", this.f4530n);
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "<html><body></body></html>";
                    }
                    si.a(this.f4685t, str);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.f4676B = "true".equals(si.a(str, "@jsTag@", "@jsTag@"));
                    this.f4686u.addView(this.f4685t, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.f4686u);
                } catch (Throwable th) {
                    d9.a(th);
                    b();
                }
            } else {
                webView.onResume();
                xf xfVar = this.f4688x;
                if (xfVar != null) {
                    xfVar.c();
                }
            }
        }
        this.f4679E.g();
    }

    public void i() {
        String str;
        String[] strArr = this.f4521d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        g0.a(this.f4518a, str, new CloseTrackingParams(this.f4530n, k()));
    }

    public final void j() {
        if (this.v != null) {
            return;
        }
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f4518a);
            ImageButton imageButton = new ImageButton(this.f4518a);
            this.v = imageButton;
            imageButton.setBackgroundColor(0);
            this.v.setOnClickListener(this);
            int a3 = ii.a(this.f4518a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(13);
            relativeLayout.addView(this.v, layoutParams);
            this.f4679E.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f4686u.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.f4687w) / 1000;
    }

    public cb l() {
        OverlayActivity overlayActivity = this.f4518a;
        la laVar = this.f4682H;
        ma maVar = this.f4683I;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4530n, k());
        boolean[] zArr = this.f;
        boolean z = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        cb cbVar = new cb(overlayActivity, laVar, closeTrackingParams);
        cbVar.f3647b = z;
        cbVar.f3649d = laVar;
        cbVar.f3650e = maVar;
        return cbVar;
    }

    public long m() {
        Long l3 = this.o;
        return l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.f4530n);
        x0 x0Var = this.f4679E;
        x0Var.getClass();
        trackingParams.a(x0Var instanceof uc);
        return trackingParams;
    }

    public boolean o() {
        return this.f4679E.b();
    }

    public void onClick(View view) {
        this.f4679E.d();
    }

    public void p() {
        xf xfVar = this.f4688x;
        if (xfVar != null) {
            xfVar.c();
        }
    }

    public void q() {
        a(this.v);
        this.f4677C = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.z && this.f4675A == 0) {
            this.z = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            wb.a(this.f4518a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.v != null) {
                this.v.setImageDrawable(k2.a(this.f4518a.getResources()));
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
    public final void b(String str, int i3, boolean z) {
        String str2;
        Boolean bool;
        boolean p3 = MetaData.E().p();
        OverlayActivity overlayActivity = this.f4518a;
        String[] strArr = this.f4525i;
        boolean z2 = true;
        String[] strArr2 = i3 < strArr.length ? new String[]{strArr[i3]} : null;
        String[] strArr3 = this.f4526j;
        if (i3 < strArr3.length) {
            str2 = strArr3[i3];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4530n, k());
        long y3 = AdsCommonMetaData.k().y();
        long x3 = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f;
        if (zArr != null && i3 >= 0 && i3 < zArr.length) {
            z2 = zArr[i3];
        }
        Boolean[] boolArr = this.f4531p;
        g0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, y3, x3, z2, (boolArr == null || i3 < 0 || i3 >= boolArr.length) ? bool : boolArr[i3], z, p3 ? new sa(this) : bool);
    }

    public void a(WebView webView) {
        this.f4689y = false;
        webView.setOnTouchListener(new qa(this));
        webView.setBackgroundColor(0);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.E().j0()) {
            try {
                sd sdVar = new sd(this.f4685t);
                this.f4678D = sdVar;
                AbstractC1053b abstractC1053b = sdVar.f4427a;
                if (abstractC1053b != null) {
                    abstractC1053b.e();
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.f4519b;
                    if (aVar != null && (adInformationView = aVar.f3257b) != null) {
                        sd sdVar2 = this.f4678D;
                        j1.e eVar = j1.e.f9528c;
                        AbstractC1053b abstractC1053b2 = sdVar2.f4427a;
                        if (abstractC1053b2 != null) {
                            abstractC1053b2.a(adInformationView, eVar);
                        }
                    }
                    if (imageButton != null) {
                        sd sdVar3 = this.f4678D;
                        j1.e eVar2 = j1.e.f9527b;
                        AbstractC1053b abstractC1053b3 = sdVar3.f4427a;
                        if (abstractC1053b3 != null) {
                            abstractC1053b3.a(imageButton, eVar2);
                        }
                    }
                    sd sdVar4 = this.f4678D;
                    WebView webView = this.f4685t;
                    AbstractC1053b abstractC1053b4 = sdVar4.f4427a;
                    if (abstractC1053b4 != null) {
                        abstractC1053b4.d(webView);
                    }
                    sd sdVar5 = this.f4678D;
                    if (sdVar5.f4428b != null && sdVar5.f4431e.compareAndSet(false, true)) {
                        sdVar5.f4428b.b();
                    }
                    this.f4678D.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.startapp.sdk.internal.u7
    public void b() {
        super.b();
        fh.f3800a.getClass();
        xf xfVar = this.f4688x;
        if (xfVar != null) {
            xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f4518a.runOnUiThread(new ta(this));
    }

    public void a(String str) {
        if ("closeAd".equals(str)) {
            la laVar = this.f4682H;
            laVar.f4086a.i();
            laVar.f4086a.b();
        }
    }

    public boolean a(String str, boolean z) {
        this.f4679E.a();
        xf xfVar = this.f4688x;
        if (xfVar != null) {
            xfVar.a(null, null);
        }
        Context a3 = w0.a(this.f4518a);
        if (a3 == null) {
            a3 = this.f4518a;
        }
        boolean a4 = g0.a(a3);
        if (this.f4679E.a(str)) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (this.f4522e[parseInt] && !a4) {
                    b(str, parseInt, z);
                } else {
                    a(str, parseInt, z);
                }
            } catch (Throwable th) {
                d9.a(th);
                return false;
            }
        } else if (this.f4522e[0] && !a4) {
            b(str, 0, z);
        } else {
            a(str, 0, z);
        }
        return true;
    }

    public final void a(String str, int i3, boolean z) {
        boolean z2;
        String str2;
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        wb.a(this.f4518a).a(intent);
        Context a3 = w0.a(this.f4518a);
        if (a3 == null) {
            a3 = this.f4518a;
        }
        boolean a4 = g0.a(a3);
        OverlayActivity overlayActivity = this.f4518a;
        String[] strArr = this.f4525i;
        boolean z3 = true;
        String[] strArr2 = i3 < strArr.length ? new String[]{strArr[i3]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f4530n, k());
        boolean[] zArr = this.f;
        if (!((zArr == null || i3 < 0 || i3 >= zArr.length) ? true : zArr[i3]) || a4) {
            z3 = false;
            z2 = z;
            str2 = str;
        } else {
            str2 = str;
            z2 = z;
        }
        g0.a(overlayActivity, str2, strArr2, closeTrackingParams, z3, z2);
        if (MetaData.E().p()) {
            b();
        }
    }
}
