package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.Marker;

/* loaded from: classes2.dex */
public class d extends b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7970a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7971b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7972c = null;

    /* renamed from: d, reason: collision with root package name */
    private Animation.AnimationListener f7973d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f7974e = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f7975f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float[] f7976g;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (d.this.f7973d != null) {
                d.this.f7973d.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (d.this.f7973d != null) {
                d.this.f7973d.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (d.this.f7973d != null) {
                d.this.f7973d.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (d.this.f7973d != null) {
                d.this.f7973d.onAnimationStart();
            }
        }
    }

    public d(float... fArr) {
        this.f7976g = fArr;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
        if (i8 > 0 || i8 == -1) {
            this.f7975f = i8;
        }
    }

    public int c() {
        return this.f7974e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7971b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7970a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
        this.f7974e = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7972c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7973d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator a8 = a(marker);
        this.f7970a = a8;
        a(a8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7970a;
        if (animator != null) {
            animator.cancel();
            this.f7970a = null;
        }
    }

    @TargetApi(11)
    ObjectAnimator a(Marker marker) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(marker, "rotate", this.f7976g);
        if (ofFloat != null) {
            ofFloat.setRepeatCount(this.f7975f);
            ofFloat.setRepeatMode(c());
            ofFloat.setDuration(this.f7971b);
            Interpolator interpolator = this.f7972c;
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
