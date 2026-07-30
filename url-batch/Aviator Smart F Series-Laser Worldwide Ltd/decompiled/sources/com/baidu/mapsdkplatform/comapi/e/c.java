package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.AlphaAnimation;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.animation.RotateAnimation;
import com.baidu.mapapi.animation.ScaleAnimation;
import com.baidu.mapapi.animation.SingleScaleAnimation;
import com.baidu.mapapi.animation.Transformation;
import com.baidu.mapapi.map.Marker;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7963a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7964b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7965c = null;

    /* renamed from: d, reason: collision with root package name */
    private Animation.AnimationListener f7966d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f7967e = 0;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Animation> f7968f = new ArrayList<>();

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (c.this.f7966d != null) {
                c.this.f7966d.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (c.this.f7966d != null) {
                c.this.f7966d.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (c.this.f7966d != null) {
                c.this.f7966d.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (c.this.f7966d != null) {
                c.this.f7966d.onAnimationStart();
            }
        }
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
        this.f7967e = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7964b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7963a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @TargetApi(11)
    private ObjectAnimator b(Marker marker, Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return ((com.baidu.mapsdkplatform.comapi.e.a) animation.bdAnimation).a(marker);
        }
        if (animation instanceof RotateAnimation) {
            return ((d) animation.bdAnimation).a(marker);
        }
        if (animation instanceof Transformation) {
            return ((g) animation.bdAnimation).a(marker);
        }
        if (animation instanceof ScaleAnimation) {
            return ((e) animation.bdAnimation).a(marker);
        }
        if (animation instanceof SingleScaleAnimation) {
            return ((f) animation.bdAnimation).a(marker);
        }
        return null;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7965c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7966d = animationListener;
    }

    public void a(Animation animation) {
        if (this.f7968f.contains(animation)) {
            return;
        }
        this.f7968f.add(animation);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator b8;
        this.f7963a = new AnimatorSet();
        ArrayList<Animation> arrayList = this.f7968f;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.clear();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            Animation animation2 = arrayList.get(i8);
            if (animation2 != null && (b8 = b(marker, animation2)) != null) {
                arrayList2.add(b8);
            }
        }
        long j8 = this.f7964b;
        if (j8 != 0) {
            this.f7963a.setDuration(j8);
        }
        Interpolator interpolator = this.f7965c;
        if (interpolator != null) {
            this.f7963a.setInterpolator(interpolator);
        }
        if (arrayList2.size() != 0) {
            int i9 = this.f7967e;
            if (i9 == 0) {
                ((AnimatorSet) this.f7963a).playTogether(arrayList2);
            } else if (i9 == 1) {
                ((AnimatorSet) this.f7963a).playSequentially(arrayList2);
            }
        }
        a(this.f7963a);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7963a;
        if (animator != null) {
            animator.cancel();
            this.f7963a = null;
        }
    }

    @TargetApi(11)
    protected void a(Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new a());
    }
}
