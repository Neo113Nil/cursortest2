package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.Jd.yiw;
import com.bytedance.sdk.component.adexpress.vG.pvs;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.uc;

/* loaded from: classes.dex */
public class DynamicBrushMaskView extends FrameLayout {
    private Context Jd;
    private volatile boolean Mxy;
    private ObjectAnimator NB;
    private volatile boolean Wyp;
    private BrushMaskView icD;
    private RelativeLayout pvs;
    private ImageView sUS;
    private FrameLayout so;
    private TextView vG;
    private ImageView yiw;

    public DynamicBrushMaskView(Context context) {
        super(context);
        this.Wyp = false;
        this.Jd = context;
        addView(pvs.NB(context));
        vG();
    }

    public void setBrushText(String str) {
        if (this.vG == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.vG.setText(str);
    }

    private void vG() {
        this.icD = (BrushMaskView) findViewById(2097610740);
        this.pvs = (RelativeLayout) findViewById(2097610737);
        this.sUS = (ImageView) findViewById(2097610739);
        this.so = (FrameLayout) findViewById(2097610741);
        this.yiw = (ImageView) findViewById(2097610736);
        this.so.setClipChildren(false);
        this.vG = (TextView) findViewById(2097610738);
        if (this.icD != null) {
            this.icD.setWatermark(uc.Jd(this.Jd, "tt_splash_brush_bg"));
            this.icD.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DynamicBrushMaskView.this.NB == null || !DynamicBrushMaskView.this.NB.isStarted()) {
                            DynamicBrushMaskView.this.Jd();
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Jd() {
        if (this.icD != null) {
            this.Mxy = false;
            int pvs = yiw.pvs(this.Jd);
            int i = (pvs * 336) / 375;
            int i2 = (i * 80) / 336;
            this.so.setLayoutParams(new RelativeLayout.LayoutParams(i, i2));
            float f = i;
            final float f2 = f - (f / 3.0f);
            this.icD.setEraserSize((this.icD.getHeight() * 3) / 5.0f);
            float pvs2 = yiw.pvs(getContext(), 15.0f);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f2, i2 / 2);
            int i3 = i2 / 4;
            layoutParams.topMargin = i3;
            float f3 = f / 6.0f;
            layoutParams.leftMargin = (int) f3;
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
            this.sUS.setLayoutParams(layoutParams);
            int i4 = (pvs * 58) / 375;
            this.yiw.setLayoutParams(new RelativeLayout.LayoutParams(500, 500));
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i4, (i4 * 76) / 58);
            layoutParams2.topMargin = (int) (i3 + pvs2);
            layoutParams2.leftMargin = (int) (f3 - (pvs2 * 1.5f));
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.pvs.setLayoutParams(layoutParams2);
            this.icD.pvs(this.icD.getWidth() / 6.0f, this.icD.getHeight() / 2.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.pvs, "translationX", 0.0f, f2);
            this.NB = ofFloat;
            ofFloat.setDuration(1000L);
            this.NB.setRepeatMode(1);
            this.NB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (DynamicBrushMaskView.this.sUS != null) {
                        layoutParams.width = (int) (f2 * animatedFraction);
                        DynamicBrushMaskView.this.sUS.setLayoutParams(layoutParams);
                    }
                }
            });
            this.NB.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (DynamicBrushMaskView.this.icD != null) {
                        if (DynamicBrushMaskView.this.sUS != null) {
                            layoutParams.width = 0;
                            DynamicBrushMaskView.this.sUS.setLayoutParams(layoutParams);
                        }
                        if (DynamicBrushMaskView.this.Mxy) {
                            return;
                        }
                        DynamicBrushMaskView.this.Wyp = true;
                        DynamicBrushMaskView.this.icD.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.widget.DynamicBrushMaskView.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                DynamicBrushMaskView.this.Wyp = false;
                                if (DynamicBrushMaskView.this.Mxy) {
                                    return;
                                }
                                DynamicBrushMaskView.this.NB.start();
                            }
                        }, 100L);
                    }
                }
            });
            ObjectAnimator objectAnimator = this.NB;
            if (objectAnimator == null || objectAnimator.isStarted() || this.NB.isRunning() || this.Wyp) {
                return;
            }
            this.NB.start();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            try {
                ObjectAnimator objectAnimator = this.NB;
                if (objectAnimator == null || !(objectAnimator.isStarted() || this.NB.isRunning() || this.Wyp)) {
                    BrushMaskView brushMaskView = this.icD;
                    if (brushMaskView != null) {
                        brushMaskView.pvs();
                    }
                    RelativeLayout relativeLayout = this.pvs;
                    if (relativeLayout != null) {
                        relativeLayout.setVisibility(0);
                    }
                    Jd();
                }
            } catch (Exception e) {
                Ju.pvs("DynamicBrushMaskView", e.getMessage());
            }
        }
    }

    public void pvs() {
        if (this.Mxy) {
            return;
        }
        this.Mxy = true;
        ObjectAnimator objectAnimator = this.NB;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            RelativeLayout relativeLayout = this.pvs;
            if (relativeLayout != null) {
                relativeLayout.clearAnimation();
                this.pvs.setVisibility(4);
            }
            this.icD.pvs();
        }
        BrushMaskView brushMaskView = this.icD;
        if (brushMaskView != null) {
            brushMaskView.setEraserSize(brushMaskView.getHeight());
            this.icD.pvs(0.0f, r0.getHeight() / 2.0f);
            this.icD.icD();
        }
    }

    public void icD() {
        clearAnimation();
    }
}
