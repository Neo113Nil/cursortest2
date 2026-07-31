package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes13.dex */
public class b2 extends v1 {
    public b2(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(bVar, activity, kVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.adview.g gVar) {
        super.a(gVar);
    }

    @Override // com.applovin.impl.v1
    public /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ImageView imageView, com.applovin.impl.adview.g gVar, final com.applovin.impl.adview.l lVar, a aVar, ProgressBar progressBar, i0 i0Var, View view, View view2, AppLovinAdView appLovinAdView, com.applovin.impl.adview.k kVar, ImageView imageView2, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        if (this.c.i0() == b.e.TOP) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 48);
        } else if (this.c.i0() == b.e.BOTTOM) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        } else if (this.c.i0() == b.e.LEFT) {
            layoutParams = new FrameLayout.LayoutParams(-2, -1, 3);
        } else {
            if (this.c.i0() == b.e.RIGHT) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1, 5);
            } else {
                layoutParams = this.e;
            }
            appLovinAdView.setLayoutParams(this.e);
            this.d.addView(appLovinAdView);
            view2.setLayoutParams(this.e);
            this.d.addView(view2);
            view.setLayoutParams(layoutParams);
            this.d.addView(view);
            if (lVar != null) {
                d8 b0 = this.c.b0();
                LinearLayout linearLayout = new LinearLayout(this.b);
                linearLayout.setOrientation(1);
                linearLayout.setWeightSum(100.0f);
                linearLayout.setGravity(b0.e());
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                LinearLayout linearLayout2 = new LinearLayout(this.b);
                linearLayout2.setOrientation(0);
                linearLayout2.setWeightSum(100.0f);
                linearLayout2.setGravity(b0.e());
                ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, 0, b0.f());
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1, b0.i());
                int dpToPx = AppLovinSdkUtils.dpToPx(this.b, b0.g());
                layoutParams4.setMargins(dpToPx, dpToPx, dpToPx, dpToPx);
                linearLayout2.addView(lVar, layoutParams4);
                linearLayout.addView(linearLayout2, layoutParams3);
                this.d.addView(linearLayout, layoutParams2);
                if (b0.a() > 0.0f) {
                    lVar.setVisibility(4);
                    long c = n7.c(b0.a());
                    final long b = b0.b();
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            e8.a(com.applovin.impl.adview.l.this, b, (Runnable) null);
                        }
                    }, c);
                }
                if (b0.c() > 0.0f) {
                    long c2 = n7.c(b0.c());
                    final long d = b0.d();
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.b2$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            e8.b(com.applovin.impl.adview.l.this, d, null);
                        }
                    }, c2);
                }
            }
            if (gVar != null) {
                if (this.c.A0()) {
                    i = 48;
                    i2 = 3;
                } else {
                    i = 48;
                    i2 = 5;
                }
                a(this.c.n(), i | i2, gVar);
            }
            if (imageView != null) {
                int dpToPx2 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(x4.e2)).intValue());
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(dpToPx2, dpToPx2, ((Integer) this.a.a(x4.g2)).intValue());
                int dpToPx3 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(x4.f2)).intValue());
                layoutParams5.setMargins(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
                this.d.addView(imageView, layoutParams5);
            }
            if (aVar != null) {
                this.d.addView(aVar, this.e);
            }
            if (i0Var != null) {
                int dpToPx4 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(x4.R1)).intValue());
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(dpToPx4, dpToPx4, ((Integer) this.a.a(x4.Q1)).intValue());
                int dpToPx5 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(x4.P1)).intValue());
                layoutParams6.setMargins(dpToPx5, dpToPx5, dpToPx5, dpToPx5);
                this.d.addView(i0Var, layoutParams6);
            }
            if (progressBar != null) {
                FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, 20, 80);
                layoutParams7.setMargins(0, 0, 0, ((Integer) this.a.a(x4.j2)).intValue());
                this.d.addView(progressBar, layoutParams7);
            }
            if (imageView2 != null) {
                o7 o7Var = (o7) this.c;
                if (o7Var.r1()) {
                    int dpToPx6 = AppLovinSdkUtils.dpToPx(this.b, o7Var.l1().g());
                    int dpToPx7 = AppLovinSdkUtils.dpToPx(this.b, o7Var.l1().d());
                    int dpToPx8 = AppLovinSdkUtils.dpToPx(this.b, ((Integer) this.a.a(x4.X4)).intValue());
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(dpToPx6, dpToPx7, 83);
                    layoutParams8.setMargins(dpToPx8, dpToPx8, dpToPx8, dpToPx8);
                    this.d.addView(imageView2, layoutParams8);
                }
            }
            if (kVar != null) {
                this.d.addView(kVar, this.e);
            }
            if (viewGroup == null) {
                viewGroup.addView(this.d);
                return;
            } else {
                this.b.setContentView(this.d);
                return;
            }
        }
        appLovinAdView.setLayoutParams(this.e);
        this.d.addView(appLovinAdView);
        view2.setLayoutParams(this.e);
        this.d.addView(view2);
        view.setLayoutParams(layoutParams);
        this.d.addView(view);
        if (lVar != null) {
        }
        if (gVar != null) {
        }
        if (imageView != null) {
        }
        if (aVar != null) {
        }
        if (i0Var != null) {
        }
        if (progressBar != null) {
        }
        if (imageView2 != null) {
        }
        if (kVar != null) {
        }
        if (viewGroup == null) {
        }
    }

    public void a(com.applovin.impl.adview.g gVar, com.applovin.impl.adview.k kVar, View view, ProgressBar progressBar) {
        if (view != null) {
            view.setVisibility(0);
        }
        s.a(this.d, view);
        if (gVar != null) {
            a(this.c.n(), (this.c.u0() ? 3 : 5) | 48, gVar);
        }
        if (progressBar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 20, ((Boolean) this.a.a(x4.q2)).booleanValue() ? 80 : 48);
            layoutParams.setMargins(0, 0, 0, ((Integer) this.a.a(x4.r2)).intValue());
            this.d.addView(progressBar, layoutParams);
        }
        if (kVar != null) {
            this.d.addView(kVar, this.e);
        }
    }
}
