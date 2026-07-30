package com.baidu.mapsdkplatform.comapi.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.Marker;

/* loaded from: classes2.dex */
public class f extends b {

    /* renamed from: a, reason: collision with root package name */
    private Animator f7986a = null;

    /* renamed from: b, reason: collision with root package name */
    private long f7987b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f7988c = null;

    /* renamed from: d, reason: collision with root package name */
    private Animation.AnimationListener f7989d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f7990e = 1;

    /* renamed from: f, reason: collision with root package name */
    private int f7991f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float[] f7992g;

    /* renamed from: h, reason: collision with root package name */
    private int f7993h;

    class a implements Animator.AnimatorListener {
        a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (f.this.f7989d != null) {
                f.this.f7989d.onAnimationCancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (f.this.f7989d != null) {
                f.this.f7989d.onAnimationEnd();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            if (f.this.f7989d != null) {
                f.this.f7989d.onAnimationRepeat();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (f.this.f7989d != null) {
                f.this.f7989d.onAnimationStart();
            }
        }
    }

    public f(int i8, float... fArr) {
        this.f7992g = fArr;
        this.f7993h = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(int i8) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void b(int i8) {
        if (i8 > 0 || i8 == -1) {
            this.f7991f = i8;
        }
    }

    public int c() {
        return this.f7990e;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(long j8) {
        if (j8 < 0) {
            j8 = 0;
        }
        this.f7987b = j8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void b() {
        Animator animator = this.f7986a;
        if (animator == null) {
            return;
        }
        animator.start();
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void c(int i8) {
        this.f7990e = i8;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(TypeEvaluator typeEvaluator) {
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Interpolator interpolator) {
        this.f7988c = interpolator;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    public void a(Animation.AnimationListener animationListener) {
        this.f7989d = animationListener;
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a(Marker marker, Animation animation) {
        ObjectAnimator a8 = a(marker);
        this.f7986a = a8;
        a(a8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.e.b
    @TargetApi(11)
    public void a() {
        Animator animator = this.f7986a;
        if (animator != null) {
            animator.cancel();
            this.f7986a = null;
        }
    }

    @TargetApi(11)
    ObjectAnimator a(Marker marker) {
        ObjectAnimator ofFloat;
        int i8 = this.f7993h;
        if (i8 == 1) {
            ofFloat = ObjectAnimator.ofFloat(marker, "scaleX", this.f7992g);
        } else {
            ofFloat = i8 == 2 ? ObjectAnimator.ofFloat(marker, "scaleY", this.f7992g) : null;
        }
        if (ofFloat != null) {
            ofFloat.setRepeatCount(this.f7991f);
            ofFloat.setRepeatMode(c());
            ofFloat.setDuration(this.f7987b);
            Interpolator interpolator = this.f7988c;
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
