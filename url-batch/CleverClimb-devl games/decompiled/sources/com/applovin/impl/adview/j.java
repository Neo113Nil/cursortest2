package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.g;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
class j extends Dialog implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2545a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f2546b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f2547c;

    /* renamed from: d, reason: collision with root package name */
    private final c f2548d;
    private final com.applovin.impl.sdk.ad.a e;
    private final String f;
    private RelativeLayout g;
    private g h;

    j(com.applovin.impl.sdk.ad.a aVar, String str, c cVar, Activity activity, com.applovin.impl.sdk.j jVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (jVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f2546b = jVar;
        this.f2547c = jVar.u();
        this.f2545a = activity;
        this.f2548d = cVar;
        this.e = aVar;
        this.f = str;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.f2545a, i);
    }

    private void a(g.a aVar) {
        if (this.h != null) {
            this.f2547c.c("ExpandedAdDialog", "Attempting to create duplicate close button");
            return;
        }
        this.h = g.a(this.f2546b, getContext(), aVar);
        this.h.setVisibility(8);
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.j.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j.this.c();
            }
        });
        this.h.setClickable(false);
        int a2 = a(((Integer) this.f2546b.a(com.applovin.impl.sdk.b.b.cC)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(10);
        layoutParams.addRule(((Boolean) this.f2546b.a(com.applovin.impl.sdk.b.b.cF)).booleanValue() ? 9 : 11);
        this.h.a(a2);
        int a3 = a(((Integer) this.f2546b.a(com.applovin.impl.sdk.b.b.cE)).intValue());
        int a4 = a(((Integer) this.f2546b.a(com.applovin.impl.sdk.b.b.cD)).intValue());
        layoutParams.setMargins(a4, a3, a4, 0);
        this.g.addView(this.h, layoutParams);
        this.h.bringToFront();
        int a5 = a(((Integer) this.f2546b.a(com.applovin.impl.sdk.b.b.cG)).intValue());
        View view = new View(this.f2545a);
        view.setBackgroundColor(0);
        int i = a2 + a5;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f2546b.a(com.applovin.impl.sdk.b.b.cF)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a4 - a(5), a3 - a(5), a4 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.j.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (j.this.h.isClickable()) {
                    j.this.h.performClick();
                }
            }
        });
        this.g.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f2548d.setLayoutParams(layoutParams);
        this.g = new RelativeLayout(this.f2545a);
        this.g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.g.setBackgroundColor(-1157627904);
        this.g.addView(this.f2548d);
        if (!this.e.k()) {
            a(this.e.l());
            d();
        }
        setContentView(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f2548d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                j.this.dismiss();
            }
        });
    }

    private void d() {
        this.f2545a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.j.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (j.this.h == null) {
                        j.this.c();
                    }
                    j.this.h.setVisibility(0);
                    j.this.h.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(((Long) j.this.f2546b.a(com.applovin.impl.sdk.b.b.cB)).longValue());
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.j.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            j.this.h.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    j.this.h.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    j.this.f2547c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    j.this.c();
                }
            }
        });
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.e;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.i
    public void dismiss() {
        com.applovin.impl.sdk.c.d c2 = this.f2548d.c();
        if (c2 != null) {
            c2.e();
        }
        this.f2545a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.j.3
            @Override // java.lang.Runnable
            public void run() {
                j.this.g.removeView(j.this.f2548d);
                j.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f2548d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.j.2
            @Override // java.lang.Runnable
            public void run() {
                j.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f2545a.getWindow().getAttributes().flags, this.f2545a.getWindow().getAttributes().flags);
                if (this.e.w()) {
                    window.addFlags(16777216);
                }
            } else {
                this.f2547c.d("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            this.f2547c.b("ExpandedAdDialog", "Setting window flags failed.", th);
        }
    }
}
