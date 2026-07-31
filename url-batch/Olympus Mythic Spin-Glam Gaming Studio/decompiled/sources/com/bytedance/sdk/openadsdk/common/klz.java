package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.am;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes12.dex */
public class klz extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    private Runnable btk;
    private long fb;
    protected boolean fs;
    private Runnable hhw;
    private boolean nps;
    private int zg;
    protected rc zmn;
    private int zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public klz(@NonNull Context context) {
        super(context);
        this.fb = 10L;
        this.fs = true;
        this.nps = false;
        this.zg = 1;
        zn();
    }

    private void zn() {
        setBackgroundColor(Color.parseColor("#2E2E2E"));
        setVisibility(8);
    }

    public void setOnlyLoading(boolean z) {
        this.nps = z;
    }

    public void zmn(nqi nqiVar) {
        com.bytedance.sdk.openadsdk.core.model.phc uqh;
        if (nqiVar != null && (uqh = nqiVar.uqh()) != null) {
            this.fb = uqh.zmn();
        }
        rc rcVar = new rc(getContext());
        this.zmn = rcVar;
        View zmn = rcVar.zmn();
        if (zmn.getParent() instanceof ViewGroup) {
            ((ViewGroup) zmn.getParent()).removeView(zmn);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        zmn.setLayoutParams(layoutParams);
        if (nqiVar != null) {
            boolean lwz = nqiVar.lwz();
            com.bytedance.sdk.openadsdk.core.widget.olo fs = this.zmn.fs();
            if (fs != null) {
                if (this.nps || lwz) {
                    fs.setVisibility(8);
                } else {
                    com.bytedance.sdk.openadsdk.core.model.kgc uaq = (nqiVar.uaq() == null || TextUtils.isEmpty(nqiVar.uaq().zmn())) ? null : nqiVar.uaq();
                    if (uaq != null && !TextUtils.isEmpty(uaq.zmn())) {
                        try {
                            com.bytedance.sdk.openadsdk.iv.fb.zmn(uaq).zn(1).zmn(new com.bytedance.sdk.openadsdk.iv.fs(nqiVar, uaq.zmn(), new am(fs)));
                        } catch (Throwable unused) {
                        }
                    }
                    fs.setVisibility(8);
                }
            }
            com.bytedance.sdk.openadsdk.core.hhw.zg zn = this.zmn.zn();
            if (zn != null) {
                if (this.nps || lwz) {
                    zn.setText("Loading");
                } else if (!TextUtils.isEmpty(nqiVar.db())) {
                    zn.setText(nqiVar.db());
                } else {
                    zn.setVisibility(8);
                }
            }
        }
        addView(zmn);
        zn(getResources().getConfiguration().orientation);
    }

    public rc getLoadingStyle() {
        return this.zmn;
    }

    public void zmn() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.klz.1
            @Override // java.lang.Runnable
            public void run() {
                klz klzVar = klz.this;
                if (klzVar.zmn != null) {
                    klzVar.setVisibility(0);
                }
            }
        });
        if (this.btk == null) {
            this.btk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.klz.2
                @Override // java.lang.Runnable
                public void run() {
                    klz.this.fs();
                }
            };
        }
        postDelayed(this.btk, this.fb * 1000);
    }

    public void zmn(int i) {
        if (i == 100 || Math.abs(i - this.zn) >= 7) {
            this.zn = i;
            if (com.bykv.vk.openvk.zmn.zmn.fs.fs.zmn.zmn()) {
                fs(this.zn);
                return;
            }
            if (this.hhw == null) {
                this.hhw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.klz.3
                    @Override // java.lang.Runnable
                    public void run() {
                        klz klzVar = klz.this;
                        klzVar.fs(klzVar.zn);
                    }
                };
            }
            post(this.hhw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fs(int i) {
        rc rcVar = this.zmn;
        if (rcVar != null) {
            rcVar.zmn(i);
        }
        if (i == 100 && this.fs) {
            fs();
        }
    }

    public void fs() {
        this.zn = 0;
        rc rcVar = this.zmn;
        if (rcVar != null) {
            removeView(rcVar.zmn);
            this.zmn.fb();
        }
        setVisibility(8);
        this.zmn = null;
        Runnable runnable = this.btk;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.hhw;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.hhw = null;
        this.btk = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.btk;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.btk = null;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        zn(configuration.orientation);
    }

    private void zn(int i) {
        if (this.zg != i) {
            this.zg = i;
        }
    }
}
