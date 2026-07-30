package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.Marker;

/* loaded from: classes2.dex */
public class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7978a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7979b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7980c = null;

    /* renamed from: d, reason: collision with root package name */
    private Animation.AnimationListener f7981d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f7982e = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f7983f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float[] f7984g;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (e.this.f7981d != null) {
                e.this.f7981d.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (e.this.f7981d != null) {
                e.this.f7981d.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (e.this.f7981d != null) {
                e.this.f7981d.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (e.this.f7981d != null) {
                e.this.f7981d.onAnimationStart();
            }
        }
    }

    public e(float... fArr) {
        this.f7984g = fArr;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
        if (i8 > 0 || i8 == -1) {
            this.f7983f = i8;
        }
    }

    public int c() {
        return this.f7982e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7979b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7978a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
        this.f7982e = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7980c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7981d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator a8 = a(marker);
        this.f7978a = a8;
        a(a8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7978a;
        if (animator != null) {
            animator.cancel();
            this.f7978a = null;
        }
    }

    @TargetApi(11)
    ObjectAnimator a(Marker marker) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(marker, "scale", this.f7984g);
        if (ofFloat != null) {
            ofFloat.setRepeatCount(this.f7983f);
            ofFloat.setRepeatMode(c());
            ofFloat.setDuration(this.f7979b);
            Interpolator interpolator = this.f7980c;
            if (interpolator != null) {
                ofFloat.setInterpolator(interpolator);
            }
        }
        return ofFloat;
    }

    @TargetApi(11)
    protected void a(Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new a());
    }
}
