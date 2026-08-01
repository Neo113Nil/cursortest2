package com.bytedance.sdk.component.adexpress.dynamic.animation.pvs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BounceAnimation.java */
/* loaded from: classes.dex */
public class NB extends Jd {
    public NB(View view, com.bytedance.sdk.component.adexpress.dynamic.vG.pvs pvsVar) {
        super(view, pvsVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.Jd
    List<ObjectAnimator> pvs() {
        char c;
        ArrayList arrayList = new ArrayList();
        String rCZ = this.icD.rCZ();
        switch (rCZ.hashCode()) {
            case 3029889:
                if (rCZ.equals("both")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (rCZ.equals("none")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 483313230:
                if (rCZ.equals("forwards")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1356771568:
                if (rCZ.equals("backwards")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            pvs(arrayList);
        } else if (c == 1) {
            Jd(arrayList);
        } else if (c == 2) {
            icD(arrayList);
        } else {
            vG(arrayList);
        }
        return arrayList;
    }

    private void pvs(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.uc())).setDuration(((int) (this.icD.Wyp() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        this.icD.sUS(this.icD.bNS() * 2);
        list.add(pvs(duration));
    }

    private void icD(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.uc())).setDuration((int) (this.icD.Wyp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.NB.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NB.this.vG.setTranslationY(0.0f);
            }
        });
        list.add(pvs(duration));
    }

    private void vG(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.uc())).setDuration((int) (this.icD.Wyp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.pvs.NB.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NB.this.vG.setTranslationY(0.0f);
            }
        });
        list.add(pvs(duration));
    }

    private void Jd(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.vG, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), this.icD.uc())).setDuration((int) (this.icD.Wyp() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(pvs(duration));
    }
}
