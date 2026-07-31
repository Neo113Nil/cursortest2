package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.ugeno.core.zmn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class iv {
    private int btk;
    private View fb;
    private zmn fs;
    private int hhw;
    private String nps;
    Paint zmn;
    private AnimatorSet zn = new AnimatorSet();

    public iv(View view, zmn zmnVar) {
        this.fb = view;
        this.fs = zmnVar;
        Paint paint = new Paint();
        this.zmn = paint;
        paint.setAntiAlias(true);
    }

    public void zmn() {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        List<zmn.C0108zmn> zn = this.fs.zn();
        if (zn == null || zn.size() <= 0) {
            return;
        }
        for (zmn.C0108zmn c0108zmn : zn) {
            if (c0108zmn != null) {
                objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0108zmn.zmn());
                if (TextUtils.equals(c0108zmn.btk(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0108zmn.btk(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0108zmn.btk());
                }
                objectAnimator.setStartDelay(c0108zmn.fb());
                objectAnimator.setTarget(this.fb);
                if (TextUtils.equals(c0108zmn.btk(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0108zmn.hhw(), (int) c0108zmn.nps());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0108zmn.hhw() + "; to=" + c0108zmn.nps());
                } else {
                    objectAnimator.setFloatValues(c0108zmn.hhw(), c0108zmn.nps());
                }
                int fs = (int) this.fs.fs();
                if (fs != 0) {
                    objectAnimator.setRepeatCount(fs);
                } else {
                    objectAnimator.setRepeatCount((int) c0108zmn.fs());
                }
                if (TextUtils.equals(c0108zmn.btk(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String hhw = this.fs.hhw();
                if (TextUtils.isEmpty(hhw)) {
                    hhw = c0108zmn.zn();
                }
                if (TextUtils.equals(hhw, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0108zmn.zg() != null && c0108zmn.zg().length > 0) {
                    objectAnimator.setFloatValues(c0108zmn.zg());
                }
                if (TextUtils.equals(c0108zmn.btk(), "rotationX")) {
                    this.fb.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.iv.1
                        @Override // java.lang.Runnable
                        public void run() {
                            iv.this.fb.setPivotX(iv.this.fb.getWidth() / 2.0f);
                            iv.this.fb.setPivotY(iv.this.fb.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0108zmn.btk(), "ripple")) {
                    this.nps = c0108zmn.iv();
                }
                String bvs = c0108zmn.bvs();
                bvs.hashCode();
                switch (bvs) {
                    case "accelerate":
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case "decelerate":
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case "linear":
                    case "standard":
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case "accelerateDecelerate":
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.fs.fb() != 0) {
            this.zn.setDuration(this.fs.fb());
        }
        this.zn.setStartDelay(this.fs.btk());
        if (TextUtils.equals(this.fs.zmn(), "sequentially")) {
            this.zn.playSequentially(arrayList);
        } else {
            this.zn.playTogether(arrayList);
        }
        this.zn.start();
    }

    public void fs() {
        AnimatorSet animatorSet = this.zn;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void zmn(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.nps)) {
                return;
            }
            this.zmn.setColor(com.bytedance.adsdk.ugeno.nps.zmn.zmn(this.nps));
            this.zmn.setAlpha(90);
            ((ViewGroup) this.fb.getParent()).setClipChildren(true);
            canvas.drawCircle(this.btk, this.hhw, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.zmn);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void zmn(int i, int i2) {
        this.btk = i / 2;
        this.hhw = i2 / 2;
    }
}
