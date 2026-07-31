package com.bytedance.adsdk.ugeno.zmn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.adsdk.ugeno.zmn.zmn.zmn;
import com.bytedance.adsdk.ugeno.zmn.zn;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class zmn extends AnimatorListenerAdapter {
    private int btk;
    private fs bvs;
    private Context fb;
    private zn fs;
    private int hhw = 1;
    private com.bytedance.adsdk.ugeno.zmn.zmn.zmn nps;
    private String zg;
    private com.bytedance.adsdk.ugeno.fs.zn zmn;
    private ValueAnimator zn;

    public zmn(Context context, com.bytedance.adsdk.ugeno.fs.zn znVar, zn znVar2) {
        this.zmn = znVar;
        this.fs = znVar2;
        this.fb = context;
    }

    public void zmn() {
        ValueAnimator valueAnimator = this.zn;
        if (valueAnimator == null || this.hhw == 0 || this.btk == Integer.MIN_VALUE) {
            return;
        }
        valueAnimator.start();
    }

    public void zmn(fs fsVar) {
        this.bvs = fsVar;
    }

    public void fs() {
        ValueAnimator valueAnimator = this.zn;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    public void zn() {
        ValueAnimator valueAnimator = this.zn;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public ValueAnimator fb() {
        String key;
        com.bytedance.adsdk.ugeno.zmn.fs.zmn znVar;
        zn znVar2 = this.fs;
        if (znVar2 == null || this.zmn == null) {
            return null;
        }
        Map<String, TreeMap<Float, String>> fs = znVar2.fs();
        ArrayList arrayList = new ArrayList();
        if (fs != null && !fs.isEmpty()) {
            for (Map.Entry<String, TreeMap<Float, String>> entry : fs.entrySet()) {
                if (entry != null) {
                    key = entry.getKey();
                    String zn = btk.zmn(key).zn();
                    zn.hashCode();
                    switch (zn) {
                        case "int":
                            znVar = new com.bytedance.adsdk.ugeno.zmn.fs.zn(this.fb, this.zmn, key, entry.getValue());
                            break;
                        case "float":
                            znVar = new com.bytedance.adsdk.ugeno.zmn.fs.fs(this.fb, this.zmn, key, entry.getValue());
                            break;
                        case "point":
                            znVar = new com.bytedance.adsdk.ugeno.zmn.fs.fb(this.fb, this.zmn, key, entry.getValue());
                            break;
                        default:
                            znVar = null;
                            break;
                    }
                    if (znVar != null) {
                        arrayList.addAll(znVar.btk());
                    }
                }
            }
        }
        JSONObject zmn = this.fs.zmn();
        if (zmn != null) {
            com.bytedance.adsdk.ugeno.zmn.zmn.zmn zmn2 = zmn.C0117zmn.zmn(this.zmn, zmn);
            this.nps = zmn2;
            if (zmn2 != null) {
                arrayList.addAll(zmn2.zn());
            }
        }
        final View rc = this.zmn.rc();
        if (rc == null) {
            return null;
        }
        final zn.zmn nps = this.fs.nps();
        if (nps != null) {
            rc.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zmn.zmn.1
                @Override // java.lang.Runnable
                public void run() {
                    int width = rc.getWidth();
                    int height = rc.getHeight();
                    rc.setPivotX(fb.zmn(nps.zmn, width));
                    rc.setPivotY(fb.zmn(nps.fs, height));
                }
            });
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(rc, (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[0]));
        this.btk = fb.zmn(this.fs.fb());
        ofPropertyValuesHolder.setDuration(this.fs.zn());
        int i = this.btk;
        if (i != Integer.MIN_VALUE) {
            ofPropertyValuesHolder.setRepeatCount(i);
        }
        this.hhw = this.fs.iv();
        this.zg = this.fs.bvs();
        ofPropertyValuesHolder.setStartDelay(this.fs.hhw());
        ofPropertyValuesHolder.setRepeatMode(fb.zmn(this.fs.btk()));
        ofPropertyValuesHolder.setInterpolator(fb.fs(this.fs.zg()));
        ofPropertyValuesHolder.addListener(this);
        this.zn = ofPropertyValuesHolder;
        return ofPropertyValuesHolder;
    }

    public void zmn(Canvas canvas) {
        com.bytedance.adsdk.ugeno.zmn.zmn.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.zmn(canvas);
        }
    }

    public void fs(Canvas canvas) {
        com.bytedance.adsdk.ugeno.zmn.zmn.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.fs(canvas);
        }
    }

    public void zmn(int i, int i2) {
        com.bytedance.adsdk.ugeno.zmn.zmn.zmn zmnVar = this.nps;
        if (zmnVar != null) {
            zmnVar.zmn(i, i2);
        }
    }

    public String btk() {
        return this.zg;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        fs fsVar = this.bvs;
        if (fsVar != null) {
            fsVar.zmn();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        fs fsVar = this.bvs;
        if (fsVar != null) {
            fsVar.fs();
        }
    }
}
