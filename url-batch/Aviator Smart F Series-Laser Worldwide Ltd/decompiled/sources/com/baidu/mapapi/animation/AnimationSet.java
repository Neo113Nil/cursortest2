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
import com.baidu.mapsdkplatform.comapi.e.c;
import com.baidu.platform.comapi.bmsdk.animation.BmAccelerateDecelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAccelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimationSet;
import com.baidu.platform.comapi.bmsdk.animation.BmAnticipateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmAnticipateOvershootInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmBounceInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmCycleInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmDecelerateInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmLinearInterpolator;
import com.baidu.platform.comapi.bmsdk.animation.BmOvershootInterpolator;

/* loaded from: classes2.dex */
public class AnimationSet extends Animation {

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

    public AnimationSet() {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation = new BmAnimationSet();
        } else {
            this.bdAnimation = new c();
        }
    }

    public void addAnimation(Animation animation) {
        if (animation != null) {
            if (OverlayUtil.isOverlayUpgrade()) {
                ((BmAnimationSet) this.bmAnimation).a(animation.bmAnimation, 0);
            } else {
                ((c) this.bdAnimation).a(animation);
            }
        }
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
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.bdAnimation.a(animationListener);
        } else {
            this.bmAnimation.setAnimationListener(animationListener);
            this.bmAnimation.setAnimationListener(new a());
        }
    }

    public void setAnimatorSetMode(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.bdAnimation.a(i8);
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

    public void addAnimation(Animation animation, AnimationOrder animationOrder) {
        if (animation != null) {
            if (OverlayUtil.isOverlayUpgrade()) {
                ((BmAnimationSet) this.bmAnimation).a(animation.bmAnimation, animationOrder.ordinal());
            } else {
                ((c) this.bdAnimation).a(animation);
            }
        }
    }
}
