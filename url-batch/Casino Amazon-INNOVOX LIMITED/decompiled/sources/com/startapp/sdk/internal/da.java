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
import androidx.core.view.ViewCompat;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class da extends g7 implements View.OnClickListener {
    public int A;
    public boolean B;
    public long C;
    public ed D;
    public u0 E;
    public boolean F;
    public boolean G;
    public final s9 H;
    public final t9 I;
    public final u9 J;
    public WebView t;
    public RelativeLayout u;
    public ImageButton v;
    public long w;
    public ff x;
    public boolean y;
    public boolean z;

    public da(Ad ad) {
        super(ad);
        this.w = 0L;
        this.y = true;
        this.z = false;
        this.A = 0;
        this.B = false;
        this.E = new ca(this);
        this.H = new s9(this);
        this.I = new t9(this);
        this.J = new u9(this);
    }

    @Override // com.startapp.sdk.internal.g7
    public void a(Bundle bundle) {
        db.a(this.f248a).a(this.c, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            this.z = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.A = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.sdk.internal.g7
    public final void b(Bundle bundle) {
        bundle.putBoolean("videoCompletedBroadcastSent", this.z);
        bundle.putInt("replayNum", this.A);
    }

    @Override // com.startapp.sdk.internal.g7
    public boolean c() {
        if (this.E.b()) {
            return true;
        }
        if (this.s != null && SystemClock.uptimeMillis() - this.C < this.s.longValue()) {
            return true;
        }
        i();
        ff ffVar = this.x;
        if (ffVar == null) {
            return false;
        }
        ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
        return false;
    }

    @Override // com.startapp.sdk.internal.g7
    public final void d() {
        this.E.d();
    }

    @Override // com.startapp.sdk.internal.g7
    public final void e() {
        super.e();
        ed edVar = this.D;
        if (edVar != null) {
            AdSession adSession = edVar.f228a;
            if (adSession != null) {
                adSession.finish();
            }
            this.D = null;
        }
        WebView webView = this.t;
        long I = MetaData.A().I();
        WeakHashMap weakHashMap = zh.f528a;
        new Handler(Looper.getMainLooper()).postDelayed(new vh(webView), I);
    }

    @Override // com.startapp.sdk.internal.g7
    public void f() {
        this.F = false;
        this.G = true;
        this.E.f();
        ff ffVar = this.x;
        if (ffVar != null) {
            ffVar.a();
        }
        WebView webView = this.t;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // com.startapp.sdk.internal.g7
    public void g() {
        String str;
        String str2;
        this.F = true;
        this.G = false;
        Ad ad = this.k;
        if (ad instanceof r9 ? ((r9) ad).hasAdCacheTtlPassed() : false) {
            b();
        } else {
            WebView webView = this.t;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f248a);
                this.u = relativeLayout;
                relativeLayout.setFitsSystemWindows(true);
                this.u.setContentDescription("StartApp Ad");
                this.u.setId(f0.h);
                this.f248a.setContentView(this.u);
                try {
                    this.t = ((uj) com.startapp.sdk.components.a.a(this.f248a).f160a.a()).c();
                    this.w = SystemClock.uptimeMillis();
                    this.t.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                    this.f248a.getWindow().getDecorView().findViewById(R.id.content).setBackgroundColor(7829367);
                    this.t.setVerticalScrollBarEnabled(false);
                    this.t.setHorizontalScrollBarEnabled(false);
                    this.t.getSettings().setJavaScriptEnabled(true);
                    m0.a(this.t);
                    this.t.setOnLongClickListener(new v9());
                    this.t.setLongClickable(false);
                    this.t.addJavascriptInterface(l(), "startappwall");
                    a(this.t);
                    this.t.setWebViewClient(new ba(this));
                    this.t.setWebChromeClient(new w9());
                    Ad ad2 = this.k;
                    if (ad2 instanceof x7) {
                        str = ((x7) ad2).b;
                        if (str != null && (str2 = this.n) != null && !str2.isEmpty()) {
                            str = str.replaceAll("startapp_adtag_placeholder", this.n);
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "<html><body></body></html>";
                    }
                    zh.a(this.t, str);
                    Log.println(2, "StartAppSDK", "Interstitial start rendering the ad content");
                    this.B = "true".equals(zh.a(str, "@jsTag@", "@jsTag@"));
                    this.u.addView(this.t, new RelativeLayout.LayoutParams(-1, -1));
                    a(this.u);
                } catch (Throwable th) {
                    n8.a(th);
                    b();
                }
            } else {
                webView.onResume();
                ff ffVar = this.x;
                if (ffVar != null) {
                    ffVar.c();
                }
            }
        }
        this.E.g();
    }

    public void i() {
        String str;
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        e0.a(this.f248a, str, new CloseTrackingParams(this.n, k()));
    }

    public final void j() {
        if (this.v != null) {
            return;
        }
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f248a);
            ImageButton imageButton = new ImageButton(this.f248a);
            this.v = imageButton;
            imageButton.setBackgroundColor(0);
            this.v.setOnClickListener(this);
            int a2 = ph.a(this.f248a, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(13);
            relativeLayout.addView(this.v, layoutParams);
            this.E.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.u.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            n8.a(th);
        }
        this.E.e();
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.w) / 1000;
    }

    public ja l() {
        OverlayActivity overlayActivity = this.f248a;
        s9 s9Var = this.H;
        t9 t9Var = this.I;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        boolean[] zArr = this.f;
        boolean z = (zArr == null || zArr.length <= 0) ? true : zArr[0];
        ja jaVar = new ja(overlayActivity, s9Var, closeTrackingParams);
        jaVar.b = z;
        jaVar.d = s9Var;
        jaVar.e = t9Var;
        return jaVar;
    }

    public long m() {
        Long l = this.o;
        return l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.A().w());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.n);
        u0 u0Var = this.E;
        u0Var.getClass();
        trackingParams.a(u0Var instanceof cc);
        return trackingParams;
    }

    public boolean o() {
        return this.E.a();
    }

    public void onClick(View view) {
        this.E.c();
    }

    public void p() {
        ff ffVar = this.x;
        if (ffVar != null) {
            ffVar.c();
        }
    }

    public void q() {
        a(this.v);
        this.C = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        if (o() && !this.z && this.A == 0) {
            this.z = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            intent.putExtra("dParam", a());
            db.a(this.f248a).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.v != null) {
                this.v.setImageDrawable(e2.a(this.f248a.getResources()));
                this.v.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.v.setVisibility(0);
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.g7
    public final void b() {
        this.f248a.runOnUiThread(new e7(this));
        ff ffVar = this.x;
        if (ffVar != null) {
            ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f248a.runOnUiThread(new aa(this));
    }

    public void a(WebView webView) {
        this.y = false;
        webView.setOnTouchListener(new x9(this));
        webView.setBackgroundColor(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r15v2 */
    public final void b(String str, int i, boolean z) {
        String str2;
        Boolean bool;
        boolean o = MetaData.A().o();
        OverlayActivity overlayActivity = this.f248a;
        String[] strArr = this.i;
        boolean z2 = true;
        String[] strArr2 = i < strArr.length ? new String[]{strArr[i]} : null;
        String[] strArr3 = this.j;
        if (i < strArr3.length) {
            str2 = strArr3[i];
            bool = null;
        } else {
            str2 = null;
            bool = null;
        }
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        long y = AdsCommonMetaData.k().y();
        long x = AdsCommonMetaData.k().x();
        boolean[] zArr = this.f;
        if (zArr != null && i >= 0 && i < zArr.length) {
            z2 = zArr[i];
        }
        Boolean[] boolArr = this.p;
        e0.a(overlayActivity, str, strArr2, str2, closeTrackingParams, y, x, z2, (boolArr == null || i < 0 || i >= boolArr.length) ? bool : boolArr[i], z, o ? new z9(this) : bool);
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.A().d0()) {
            try {
                ed edVar = new ed(this.t);
                this.D = edVar;
                AdSession adSession = edVar.f228a;
                if (adSession != null) {
                    if (adSession != null) {
                        adSession.start();
                    }
                    com.startapp.sdk.adsbase.adinformation.a aVar = this.b;
                    if (aVar != null && (adInformationView = aVar.b) != null) {
                        ed edVar2 = this.D;
                        FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                        AdSession adSession2 = edVar2.f228a;
                        if (adSession2 != null) {
                            adSession2.addFriendlyObstruction(adInformationView, friendlyObstructionPurpose, null);
                        }
                    }
                    if (imageButton != null) {
                        ed edVar3 = this.D;
                        FriendlyObstructionPurpose friendlyObstructionPurpose2 = FriendlyObstructionPurpose.CLOSE_AD;
                        AdSession adSession3 = edVar3.f228a;
                        if (adSession3 != null) {
                            adSession3.addFriendlyObstruction(imageButton, friendlyObstructionPurpose2, null);
                        }
                    }
                    ed edVar4 = this.D;
                    WebView webView = this.t;
                    AdSession adSession4 = edVar4.f228a;
                    if (adSession4 != null) {
                        adSession4.registerAdView(webView);
                    }
                    ed edVar5 = this.D;
                    if (edVar5.b != null && edVar5.e.compareAndSet(false, true)) {
                        edVar5.b.loaded();
                    }
                    this.D.a();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void a(String str) {
        if ("closeAd".equals(str)) {
            this.H.run();
        }
    }

    public boolean a(String str, boolean z) {
        ff ffVar = this.x;
        if (ffVar != null) {
            ffVar.a(null, null);
        }
        Context a2 = t0.a(this.f248a);
        if (a2 == null) {
            a2 = this.f248a;
        }
        boolean a3 = e0.a(a2);
        if (this.E.a(str)) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (this.e[parseInt] && !a3) {
                    b(str, parseInt, z);
                } else {
                    a(str, parseInt, z);
                }
            } catch (Throwable th) {
                n8.a(th);
                return false;
            }
        } else if (this.e[0] && !a3) {
            b(str, 0, z);
        } else {
            a(str, 0, z);
        }
        return true;
    }

    public final void a(String str, int i, boolean z) {
        boolean z2;
        String str2;
        Intent intent = new Intent("com.startapp.android.OnClickCallback");
        intent.putExtra("dParam", a());
        db.a(this.f248a).a(intent);
        Context a2 = t0.a(this.f248a);
        if (a2 == null) {
            a2 = this.f248a;
        }
        boolean a3 = e0.a(a2);
        OverlayActivity overlayActivity = this.f248a;
        String[] strArr = this.i;
        boolean z3 = true;
        String[] strArr2 = i < strArr.length ? new String[]{strArr[i]} : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.n, k());
        boolean[] zArr = this.f;
        if (!((zArr == null || i < 0 || i >= zArr.length) ? true : zArr[i]) || a3) {
            z3 = false;
            z2 = z;
            str2 = str;
        } else {
            str2 = str;
            z2 = z;
        }
        e0.a(overlayActivity, str2, strArr2, closeTrackingParams, z3, z2);
        if (MetaData.A().o()) {
            b();
        }
    }
}
