package com.startapp.sdk.internal;

import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class cc extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public final da f200a;
    public MraidState b = MraidState.LOADING;
    public bc c;
    public ec d;
    public fc e;
    public jc f;
    public TextView g;
    public ImageView h;
    public boolean i;
    public boolean j;
    public Handler k;

    public cc(da daVar) {
        this.f200a = daVar;
    }

    @Override // com.startapp.sdk.internal.u0
    public final void a(RelativeLayout relativeLayout) {
        if (this.f200a.o()) {
            da daVar = this.f200a;
            if (daVar.r) {
                return;
            }
            OverlayActivity overlayActivity = daVar.f248a;
            int a2 = ph.a(overlayActivity, 32);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
            layoutParams.addRule(13);
            ImageView imageView = new ImageView(overlayActivity);
            this.h = imageView;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(ViewCompat.MEASURED_STATE_MASK);
            gradientDrawable.setStroke(2, -1);
            int a3 = ph.a(this.f200a.f248a, 32);
            gradientDrawable.setSize(a3, a3);
            imageView.setImageDrawable(gradientDrawable);
            this.h.setScaleType(ImageView.ScaleType.FIT_CENTER);
            relativeLayout.addView(this.h, layoutParams);
            TextView textView = new TextView(overlayActivity);
            this.g = textView;
            textView.setTextColor(-1);
            this.g.setGravity(17);
            relativeLayout.addView(this.g, layoutParams);
        }
    }

    @Override // com.startapp.sdk.internal.u0
    public final boolean b(WebView webView, String str) {
        if (this.f == null) {
            this.f = new jc(h(), null);
        }
        return this.f.shouldOverrideUrlLoading(webView, str);
    }

    @Override // com.startapp.sdk.internal.u0
    public final void c() {
        if (this.f200a.k() >= this.f200a.q) {
            h().close();
        }
    }

    @Override // com.startapp.sdk.internal.u0
    public final void d() {
        i();
    }

    @Override // com.startapp.sdk.internal.u0
    public final void e() {
        if (this.i) {
            try {
                ImageButton imageButton = this.f200a.v;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th) {
                n8.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.u0
    public final void f() {
        this.j = false;
        if (this.b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    @Override // com.startapp.sdk.internal.u0
    public final void g() {
        if (this.k == null && this.f200a.o()) {
            this.k = new Handler(Looper.getMainLooper());
        }
        this.j = true;
        if (this.b == MraidState.DEFAULT) {
            h().fireViewableChangeEvent();
        }
    }

    public final bc h() {
        if (this.c == null) {
            this.c = new bc(this, new zb(this));
        }
        return this.c;
    }

    public final void i() {
        da daVar = this.f200a;
        OverlayActivity overlayActivity = daVar.f248a;
        WebView webView = daVar.t;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            overlayActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            float f = i2;
            zh.a(webView, true, "mraid.setScreenSize", Integer.valueOf(ph.b(overlayActivity, i)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            zh.a(webView, true, "mraid.setMaxSize", Integer.valueOf(ph.b(overlayActivity, i)), Integer.valueOf(Math.round(f / overlayActivity.getResources().getDisplayMetrics().density)));
            yb.a(overlayActivity, 0, 0, i, i2, webView);
            yb.b(overlayActivity, 0, 0, i, i2, webView);
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    @Override // com.startapp.sdk.internal.u0
    public final boolean b() {
        return !(this.f200a.k() >= ((long) this.f200a.q));
    }

    @Override // com.startapp.sdk.internal.u0
    public final boolean a() {
        return this.f200a.q > 0;
    }

    @Override // com.startapp.sdk.internal.u0
    public final void a(WebView webView, String str) {
        webView.getContext();
        WeakHashMap weakHashMap = zh.f528a;
        Log.println(2, "StartAppSDK", "Mraid received callback onPageFinished()");
        if (this.f == null) {
            this.f = new jc(h(), null);
        }
        this.f.onPageFinished(webView, str);
        if (this.b == MraidState.LOADING) {
            zh.a(webView, true, "mraid.setPlacementType", "interstitial");
            OverlayActivity overlayActivity = this.f200a.f248a;
            if (this.d == null) {
                this.d = new ec(overlayActivity);
            }
            dc.a(overlayActivity, webView, this.d);
            i();
            this.f200a.j();
            zh.a(webView, true, "gClientInterface.onPageFinished", Boolean.TRUE);
            if (!this.i) {
                this.f200a.t();
            }
            MraidState mraidState = MraidState.DEFAULT;
            this.b = mraidState;
            zh.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            zh.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            if (this.j) {
                h().fireViewableChangeEvent();
            }
            Handler handler = this.k;
            if (handler != null) {
                handler.post(new ac(this));
            }
            this.f200a.q();
        }
    }
}
