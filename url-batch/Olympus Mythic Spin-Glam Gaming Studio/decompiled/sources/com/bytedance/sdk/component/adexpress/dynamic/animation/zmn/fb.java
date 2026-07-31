package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;

/* loaded from: classes11.dex */
public abstract class fb implements fkt {
    com.bytedance.sdk.component.adexpress.dynamic.fb.zmn fs;
    public View zn;
    private Set<ScheduledFuture<?>> fb = new HashSet();
    public List<ObjectAnimator> zmn = zmn();

    abstract List<ObjectAnimator> zmn();

    public fb(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        this.zn = view;
        this.fs = zmnVar;
    }

    public void zn() {
        List<ObjectAnimator> list = this.zmn;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.fs.olo() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb.1
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
                        zmn zmnVar = fb.this.new zmn(objectAnimator);
                        ScheduledFuture<?> zmn2 = com.bytedance.sdk.component.adexpress.fb.fb.zmn(zmnVar, (long) (fb.this.fs.olo() * 1000.0d), TimeUnit.MILLISECONDS);
                        zmnVar.zmn(zmn2);
                        fb.this.fb.add(zmn2);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkt
    public void fs() {
        List<ObjectAnimator> list = this.zmn;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.fb.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    ObjectAnimator zmn(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.fs.rt() * 1000.0d));
        if (this.fs.cn() > 0) {
            objectAnimator.setRepeatCount(this.fs.cn() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.fs.cyb())) {
            if (SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE.equals(this.fs.cyb()) || "alternate-reverse".equals(this.fs.cyb())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.fs.mw())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.fs.cyb())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.fs.cyb())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    fb.this.zn.setVisibility(0);
                    if (fb.this.zn.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.hhw) {
                        ((View) fb.this.zn.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    public class zmn implements Runnable {
        ScheduledFuture<?> fs;
        ObjectAnimator zmn;

        zmn(ObjectAnimator objectAnimator) {
            this.zmn = objectAnimator;
        }

        public void zmn(ScheduledFuture<?> scheduledFuture) {
            this.fs = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn() != null) {
                com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().zn().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb.zmn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        zmn.this.zmn.resume();
                    }
                });
                if (this.fs != null) {
                    fb.this.fb.remove(this.fs);
                }
            }
        }
    }
}
