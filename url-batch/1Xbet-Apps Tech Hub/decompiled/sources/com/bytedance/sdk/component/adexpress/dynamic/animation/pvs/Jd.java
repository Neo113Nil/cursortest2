package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: BaseAnimation.java */
/* loaded from: classes.dex */
public abstract class Jd implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB {
    com.bytedance.sdk.component.adexpress.dynamic.vG.pvs icD;
    public View vG;
    private Set<ScheduledFuture<?>> Jd = new HashSet();
    public List<ObjectAnimator> pvs = pvs();

    abstract List<ObjectAnimator> pvs();

    public Jd(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        this.vG = view;
        this.icD = pvsVar;
    }

    public void vG() {
        List<ObjectAnimator> list = this.pvs;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.icD.vA() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        pvs pvsVar = Jd.this.new pvs(objectAnimator);
                        ScheduledFuture<?> pvs2 = com.bytedance.sdk.component.adexpress.Jd.vG.pvs(pvsVar, (long) (Jd.this.icD.vA() * 1000.0d), TimeUnit.MILLISECONDS);
                        pvsVar.pvs(pvs2);
                        Jd.this.Jd.add(pvs2);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.NB
    public void icD() {
        List<ObjectAnimator> list = this.pvs;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.Jd.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator pvs(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.icD.IP() * 1000.0d));
        if (this.icD.bNS() > 0) {
            objectAnimator.setRepeatCount(this.icD.bNS() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.icD.mnm())) {
            if ("alternate".equals(this.icD.mnm()) || "alternate-reverse".equals(this.icD.mnm())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.icD.Ju())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.icD.mnm())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.icD.mnm())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    Jd.this.vG.setVisibility(0);
                    if (Jd.this.vG.getParent() instanceof DynamicBaseWidgetImp) {
                        ((View) Jd.this.vG.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* compiled from: BaseAnimation.java */
    public class pvs implements Runnable {
        ScheduledFuture<?> icD;
        ObjectAnimator pvs;

        pvs(ObjectAnimator objectAnimator) {
            this.pvs = objectAnimator;
        }

        public void pvs(ScheduledFuture<?> scheduledFuture) {
            this.icD = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG() != null) {
                com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().vG().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd.pvs.1
                    @Override // java.lang.Runnable
                    public void run() {
                        pvs.this.pvs.resume();
                    }
                });
                if (this.icD != null) {
                    Jd.this.Jd.remove(this.icD);
                }
            }
        }
    }
}
