package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.Marker;

/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7955a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7956b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7957c = null;

    /* renamed from: d, reason: collision with root package name */
    private Animation.AnimationListener f7958d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f7959e = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f7960f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float[] f7961g;

    /* renamed from: com.baidu.mapsdkplatform.comapi.e.a$a, reason: collision with other inner class name */
    class C0073a implements Animator.AnimatorListener {
        C0073a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (a.this.f7958d != null) {
                a.this.f7958d.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (a.this.f7958d != null) {
                a.this.f7958d.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (a.this.f7958d != null) {
                a.this.f7958d.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (a.this.f7958d != null) {
                a.this.f7958d.onAnimationStart();
            }
        }
    }

    public a(float... fArr) {
        this.f7961g = fArr;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
        if (i8 > 0 || i8 == -1) {
            this.f7960f = i8;
        }
    }

    public int c() {
        return this.f7959e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7956b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7955a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
        this.f7959e = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7957c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7958d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator a8 = a(marker);
        this.f7955a = a8;
        a(a8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7955a;
        if (animator != null) {
            animator.cancel();
            this.f7955a = null;
        }
    }

    @TargetApi(11)
    protected void a(Animator animator) {
        if (animator == null) {
            return;
        }
        animator.addListener(new C0073a());
    }

    @TargetApi(11)
    ObjectAnimator a(Marker marker) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(marker, "alpha", this.f7961g);
        if (ofFloat != null) {
            ofFloat.setRepeatCount(this.f7960f);
            ofFloat.setRepeatMode(c());
            ofFloat.setDuration(this.f7956b);
            Interpolator interpolator = this.f7957c;
            if (interpolator != null) {
                ofFloat.setInterpolator(interpolator);
            }
        }
        return ofFloat;
    }
}
