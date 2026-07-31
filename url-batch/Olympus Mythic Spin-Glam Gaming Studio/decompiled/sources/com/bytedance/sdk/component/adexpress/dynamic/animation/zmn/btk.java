package com.bytedance.sdk.component.adexpress.dynamic.animation.zmn;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class btk extends fb {
    public btk(View view, com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar) {
        super(view, zmnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.fb
    List<ObjectAnimator> zmn() {
        char c;
        ArrayList arrayList = new ArrayList();
        String phc = this.fs.phc();
        switch (phc.hashCode()) {
            case 3029889:
                if (phc.equals("both")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (phc.equals("none")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 483313230:
                if (phc.equals("forwards")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1356771568:
                if (phc.equals("backwards")) {
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
            zmn(arrayList);
        } else if (c == 1) {
            fb(arrayList);
        } else if (c == 2) {
            fs(arrayList);
        } else {
            zn(arrayList);
        }
        return arrayList;
    }

    private void zmn(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.iqz())).setDuration(((int) (this.fs.iv() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.fb.zmn zmnVar = this.fs;
        zmnVar.hhw(zmnVar.cn() * 2);
        list.add(zmn(duration));
    }

    private void fs(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.iqz())).setDuration((int) (this.fs.iv() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.btk.1
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
                btk.this.zn.setTranslationY(0.0f);
            }
        });
        list.add(zmn(duration));
    }

    private void zn(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.iqz())).setDuration((int) (this.fs.iv() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.zmn.btk.2
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
                btk.this.zn.setTranslationY(0.0f);
            }
        });
        list.add(zmn(duration));
    }

    private void fb(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.zn, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), this.fs.iqz())).setDuration((int) (this.fs.iv() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(zmn(duration));
    }
}
