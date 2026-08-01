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
import com.bytedance.adsdk.ugeno.core.pvs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenAnimation.java */
/* loaded from: classes.dex */
public class so {
    private View Jd;
    private int NB;
    private pvs icD;
    Paint pvs;
    private int sUS;
    private AnimatorSet vG = new AnimatorSet();
    private String yiw;

    public so(View view, pvs pvsVar) {
        this.Jd = view;
        this.icD = pvsVar;
        Paint paint = new Paint();
        this.pvs = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0189, code lost:
    
        if (r2.equals("accelerate") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pvs() {
        ArrayList arrayList = new ArrayList();
        List<pvs.C0034pvs> vG = this.icD.vG();
        if (vG == null || vG.size() <= 0) {
            return;
        }
        for (pvs.C0034pvs c0034pvs : vG) {
            if (c0034pvs != null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                objectAnimator.setDuration(c0034pvs.pvs());
                if (TextUtils.equals(c0034pvs.NB(), "translateX")) {
                    objectAnimator.setPropertyName("translationX");
                } else if (TextUtils.equals(c0034pvs.NB(), "translateY")) {
                    objectAnimator.setPropertyName("translationY");
                } else {
                    objectAnimator.setPropertyName(c0034pvs.NB());
                }
                objectAnimator.setStartDelay(c0034pvs.Jd());
                objectAnimator.setTarget(this.Jd);
                char c = 0;
                if (TextUtils.equals(c0034pvs.NB(), "backgroundColor")) {
                    objectAnimator.setIntValues((int) c0034pvs.sUS(), (int) c0034pvs.yiw());
                    Log.d("UGenAnimation", "playAnimation: from = " + c0034pvs.sUS() + "; to=" + c0034pvs.yiw());
                } else {
                    objectAnimator.setFloatValues(c0034pvs.sUS(), c0034pvs.yiw());
                }
                int icD = (int) this.icD.icD();
                if (icD != 0) {
                    objectAnimator.setRepeatCount(icD);
                } else {
                    objectAnimator.setRepeatCount((int) c0034pvs.icD());
                }
                if (TextUtils.equals(c0034pvs.NB(), "backgroundColor")) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
                String sUS = this.icD.sUS();
                if (TextUtils.isEmpty(sUS)) {
                    sUS = c0034pvs.vG();
                }
                if (TextUtils.equals(sUS, "reverse")) {
                    objectAnimator.setRepeatMode(2);
                } else {
                    objectAnimator.setRepeatMode(1);
                }
                if (c0034pvs.so() != null && c0034pvs.so().length > 0) {
                    objectAnimator.setFloatValues(c0034pvs.so());
                }
                if (TextUtils.equals(c0034pvs.NB(), "rotationX")) {
                    this.Jd.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.so.1
                        @Override // java.lang.Runnable
                        public void run() {
                            so.this.Jd.setPivotX(so.this.Jd.getWidth() / 2.0f);
                            so.this.Jd.setPivotY(so.this.Jd.getHeight());
                        }
                    });
                }
                if (TextUtils.equals(c0034pvs.NB(), "ripple")) {
                    this.yiw = c0034pvs.Wyp();
                }
                String Mxy = c0034pvs.Mxy();
                Mxy.hashCode();
                switch (Mxy.hashCode()) {
                    case -1354466595:
                        break;
                    case -1263948740:
                        if (Mxy.equals("decelerate")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1102672091:
                        if (Mxy.equals("linear")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 475910905:
                        if (Mxy.equals("accelerateDecelerate")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1312628413:
                        if (Mxy.equals("standard")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        objectAnimator.setInterpolator(new AccelerateInterpolator());
                        break;
                    case 1:
                        objectAnimator.setInterpolator(new DecelerateInterpolator());
                        break;
                    case 2:
                    case 4:
                        objectAnimator.setInterpolator(new LinearInterpolator());
                        break;
                    case 3:
                        objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                        break;
                }
                arrayList.add(objectAnimator);
            }
        }
        if (this.icD.Jd() != 0) {
            this.vG.setDuration(this.icD.Jd());
        }
        this.vG.setStartDelay(this.icD.NB());
        if (TextUtils.equals(this.icD.pvs(), "sequentially")) {
            this.vG.playSequentially(arrayList);
        } else {
            this.vG.playTogether(arrayList);
        }
        this.vG.start();
    }

    public void icD() {
        AnimatorSet animatorSet = this.vG;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void pvs(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.yiw)) {
                return;
            }
            this.pvs.setColor(com.bytedance.adsdk.ugeno.icD.pvs.pvs(this.yiw));
            this.pvs.setAlpha(90);
            ViewGroup viewGroup = (ViewGroup) this.Jd.getParent();
            ViewGroup viewGroup2 = viewGroup;
            viewGroup.setClipChildren(true);
            canvas.drawCircle(this.NB, this.sUS, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.pvs);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void pvs(int i, int i2) {
        this.NB = i / 2;
        this.sUS = i2 / 2;
    }
}
