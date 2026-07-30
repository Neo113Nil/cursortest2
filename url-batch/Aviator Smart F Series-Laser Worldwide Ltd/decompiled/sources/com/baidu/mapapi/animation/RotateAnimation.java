package com.baidu.mapapi.animation;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.OverlayUtil;
import com.baidu.mapsdkplatform.comapi.e.d;
import com.baidu.platform.comapi.bmsdk.animation.BmAccelerateDecelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAccelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.animation.BmAnticipateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAnticipateOvershootInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmBounceInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmCycleInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmDecelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmLinearInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmOvershootInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmRotateAnimation;

/* loaded from: classes2.dex */
public class RotateAnimation extends Animation {

    /* renamed from: d, reason: collision with root package name */
    private float f5343d;

    /* renamed from: e, reason: collision with root package name */
    private float f5344e;

    class a implements BmAnimation.a {
        a() {
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void a(BmAnimation bmAnimation) {
            Animation.AnimationListener animationListener;
            if (bmAnimation == null || (animationListener = bmAnimation.animationListener) == null) {
                return;
            }
            animationListener.onAnimationEnd();
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void b(BmAnimation bmAnimation) {
            Animation.AnimationListener animationListener;
            if (bmAnimation == null || (animationListener = bmAnimation.animationListener) == null) {
                return;
            }
            animationListener.onAnimationStart();
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmAnimation.a
        public void c(BmAnimation bmAnimation) {
            Animation.AnimationListener animationListener;
            if (bmAnimation == null || (animationListener = bmAnimation.animationListener) == null) {
                return;
            }
            animationListener.onAnimationRepeat();
        }
    }

    public RotateAnimation(float f8, float f9) {
        if (f8 < 0.0f || f9 < 0.0f) {
            throw new NullPointerException("BDMapSDKException: the degrees can't less than zero");
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation = new BmRotateAnimation(f8, f9);
        } else {
            this.bdAnimation = new d(f8, f9);
        }
        this.f5343d = f8;
        this.f5344e = f9;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.cancel();
        } else {
            this.bdAnimation.a();
        }
    }

    @Override // com.baidu.mapapi.animation.Animation
    public long getDuration() {
        return this.f5339c;
    }

    public float getFromDegrees() {
        return this.f5343d;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public int getRepeatCount() {
        return this.f5338b;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public Animation.RepeatMode getRepeatMode() {
        return this.f5337a;
    }

    public float getToDegrees() {
        return this.f5344e;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.bdAnimation.a(animationListener);
        } else {
            this.bmAnimation.setAnimationListener(animationListener);
            this.bmAnimation.setAnimationListener(new a());
        }
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.setDuration(j8);
        } else {
            this.bdAnimation.a(j8);
        }
        this.f5339c = j8;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.bdAnimation.a(interpolator);
            return;
        }
        if (interpolator instanceof LinearInterpolator) {
            this.bmAnimation.setInterpolator(new BmLinearInterpolator());
            return;
        }
        if (interpolator instanceof CycleInterpolator) {
            this.bmAnimation.setInterpolator(new BmCycleInterpolator());
            return;
        }
        if (interpolator instanceof BounceInterpolator) {
            this.bmAnimation.setInterpolator(new BmBounceInterpolator());
            return;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            this.bmAnimation.setInterpolator(new BmDecelerateInterpolator());
            return;
        }
        if (interpolator instanceof OvershootInterpolator) {
            this.bmAnimation.setInterpolator(new BmOvershootInterpolator());
            return;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            this.bmAnimation.setInterpolator(new BmAccelerateInterpolator());
            return;
        }
        if (interpolator instanceof AccelerateDecelerateInterpolator) {
            this.bmAnimation.setInterpolator(new BmAccelerateDecelerateInterpolator());
        } else if (interpolator instanceof AnticipateInterpolator) {
            this.bmAnimation.setInterpolator(new BmAnticipateInterpolator());
        } else if (interpolator instanceof AnticipateOvershootInterpolator) {
            this.bmAnimation.setInterpolator(new BmAnticipateOvershootInterpolator());
        }
    }

    public void setRepeatCount(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.setRepeatCount(i8);
        } else {
            this.bdAnimation.b(i8);
        }
        this.f5338b = i8;
    }

    public void setRepeatDelay(long j8) {
        BmAnimation bmAnimation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.bmAnimation) == null) {
            return;
        }
        bmAnimation.setRepeatDelay(j8);
    }

    public void setRepeatMode(Animation.RepeatMode repeatMode) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.setRepeatMode(repeatMode.ordinal());
        } else if (repeatMode == Animation.RepeatMode.RESTART) {
            this.bdAnimation.c(1);
        } else if (repeatMode == Animation.RepeatMode.REVERSE) {
            this.bdAnimation.c(2);
        }
        this.f5337a = repeatMode;
    }

    public void setStartDelay(long j8) {
        BmAnimation bmAnimation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.bmAnimation) == null) {
            return;
        }
        bmAnimation.setStartDelay(j8);
    }
}
