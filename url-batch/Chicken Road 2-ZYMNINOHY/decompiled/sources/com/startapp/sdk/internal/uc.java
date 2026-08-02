package com.startapp.sdk.internal;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class uc extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final wa f7697a;

    /* renamed from: b, reason: collision with root package name */
    public MraidState f7698b = MraidState.LOADING;

    /* renamed from: c, reason: collision with root package name */
    public tc f7699c;

    /* renamed from: d, reason: collision with root package name */
    public wc f7700d;

    /* renamed from: e, reason: collision with root package name */
    public xc f7701e;

    /* renamed from: f, reason: collision with root package name */
    public bd f7702f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f7703g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f7704h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7705i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7706j;

    /* renamed from: k, reason: collision with root package name */
    public Handler f7707k;

    public uc(wa waVar) {
        this.f7697a = waVar;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a() {
        MraidState mraidState = MraidState.HIDDEN;
        this.f7698b = mraidState;
        si.a(this.f7697a.f7830t, true, "mraid.fireStateChangeEvent", mraidState.toString());
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b(WebView webView, String str) {
        if (this.f7702f == null) {
            this.f7702f = new bd(h(), null);
        }
        return this.f7702f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean c() {
        return !(this.f7697a.k() >= ((long) this.f7697a.f7672q));
    }

    @Override // com.startapp.sdk.internal.x0
    public final void d() {
        if (this.f7697a.k() >= this.f7697a.f7672q) {
            h().close();
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void e() {
        i();
    }

    @Override // com.startapp.sdk.internal.x0
    public final void f() {
        this.f7706j = false;
        if (this.f7698b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void g() {
        if (this.f7707k == null && this.f7697a.o()) {
            this.f7707k = new Handler(Looper.getMainLooper());
        }
        this.f7706j = true;
        if (this.f7698b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    public final tc h() {
        if (this.f7699c == null) {
            this.f7699c = new tc(this, new rc(this));
        }
        return this.f7699c;
    }

    public final void i() {
        wa waVar = this.f7697a;
        OverlayActivity overlayActivity = waVar.f7658a;
        WebView webView = waVar.f7830t;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            overlayActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i4 = displayMetrics.widthPixels;
            int i5 = displayMetrics.heightPixels;
            float f4 = i5;
            si.a(webView, true, "mraid.setScreenSize", Integer.valueOf(ii.b(overlayActivity, i4)), Integer.valueOf(Math.round(f4 / overlayActivity.getResources().getDisplayMetrics().density)));
            si.a(webView, true, "mraid.setMaxSize", Integer.valueOf(ii.b(overlayActivity, i4)), Integer.valueOf(Math.round(f4 / overlayActivity.getResources().getDisplayMetrics().density)));
            qc.a(overlayActivity, 0, 0, i4, i5, webView);
            qc.b(overlayActivity, 0, 0, i4, i5, webView);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f7697a.o()) {
            wa waVar = this.f7697a;
            if (waVar.f7673r) {
                return;
            }
            OverlayActivity overlayActivity = waVar.f7658a;
            int a3 = ii.a(overlayActivity, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(overlayActivity);
            this.f7704h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(-16777216);
            gradientDrawable.setStroke(2, -1);
            int a4 = ii.a(this.f7697a.f7658a, 32);
            gradientDrawable.setSize(a4, a4);
            imageView.setImageDrawable(gradientDrawable);
            this.f7704h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.f7704h, layoutParams);
            TextView textView = new TextView(overlayActivity);
            this.f7703g = textView;
            textView.setTextColor(-1);
            this.f7703g.setGravity(17);
            relativeLayout.addView(this.f7703g, layoutParams);
        }
    }

    @Override // com.startapp.sdk.internal.x0
    public final boolean b() {
        return this.f7697a.f7672q > 0;
    }

    @Override // com.startapp.sdk.internal.x0
    public final void a(WebView webView, String str) {
        webView.getContext();
        WeakHashMap weakHashMap = si.f7575a;
        Log.println(2, "StartAppSDK", "Mraid received callback onPageFinished()");
        if (this.f7702f == null) {
            this.f7702f = new bd(h(), null);
        }
        this.f7702f.onPageFinished(webView, str);
        if (this.f7698b == MraidState.LOADING) {
            si.a(webView, true, "mraid.setPlacementType", "interstitial");
            OverlayActivity overlayActivity = this.f7697a.f7658a;
            if (this.f7700d == null) {
                this.f7700d = new wc(overlayActivity);
            }
            vc.a(overlayActivity, webView, this.f7700d);
            i();
            this.f7697a.j();
            si.a(webView, true, "gClientInterface.onPageFinished", Boolean.TRUE);
            if (!this.f7705i) {
                this.f7697a.t();
            }
            MraidState mraidState = MraidState.DEFAULT;
            this.f7698b = mraidState;
            si.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            si.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.f7706j) {
                h().fireViewableChangeEvent();
            }
            Handler handler = this.f7707k;
            if (handler != null) {
                handler.post(new sc(this));
            }
            this.f7697a.q();
        }
    }
}
