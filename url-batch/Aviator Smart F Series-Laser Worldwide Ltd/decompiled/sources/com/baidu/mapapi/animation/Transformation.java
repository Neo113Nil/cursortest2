package com.baidu.mapapi.animation;

import android.graphics.Point;
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
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.e.g;
import com.baidu.platform.comapi.basestruct.GeoPoint;
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
import com.baidu.platform.comapi.bmsdk.animation.BmTranslateAnimation;
import com.baidu.platform.comapi.bmsdk.b;

/* loaded from: classes2.dex */
public class Transformation extends Animation {

    /* renamed from: d, reason: collision with root package name */
    private LatLng[] f5354d;

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

    public Transformation(LatLng... latLngArr) {
        if (latLngArr == null || latLngArr.length == 0) {
            throw new NullPointerException("BDMapSDKException: the latlngs is null");
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLngArr[0]);
            GeoPoint ll2mc2 = CoordUtil.ll2mc(latLngArr[latLngArr.length - 1]);
            this.bmAnimation = new BmTranslateAnimation(new b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()), new b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
        } else {
            this.bdAnimation = new g(latLngArr);
        }
        this.f5354d = latLngArr;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.bdAnimation.a();
            return;
        }
        BmAnimation bmAnimation = this.bmAnimation;
        if (bmAnimation == null) {
            return;
        }
        bmAnimation.cancel();
    }

    @Override // com.baidu.mapapi.animation.Animation
    public long getDuration() {
        return this.f5339c;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public int getRepeatCount() {
        return this.f5338b;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public Animation.RepeatMode getRepeatMode() {
        return this.f5337a;
    }

    public LatLng[] getValues() {
        return this.f5354d;
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.bdAnimation.a(animationListener);
            return;
        }
        BmAnimation bmAnimation = this.bmAnimation;
        if (bmAnimation == null) {
            return;
        }
        bmAnimation.setAnimationListener(animationListener);
        this.bmAnimation.setAnimationListener(new a());
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            BmAnimation bmAnimation = this.bmAnimation;
            if (bmAnimation == null) {
                return;
            } else {
                bmAnimation.setDuration(j8);
            }
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
        if (this.bmAnimation == null) {
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
            BmAnimation bmAnimation = this.bmAnimation;
            if (bmAnimation == null) {
                return;
            } else {
                bmAnimation.setRepeatCount(i8);
            }
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
            BmAnimation bmAnimation = this.bmAnimation;
            if (bmAnimation == null) {
                return;
            } else {
                bmAnimation.setRepeatMode(repeatMode.ordinal());
            }
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

    public Transformation(Point... pointArr) {
        if (pointArr != null && pointArr.length != 0) {
            if (OverlayUtil.isOverlayUpgrade()) {
                Point point = pointArr[0];
                this.bmAnimation = new BmTranslateAnimation(new b(point.x, point.y), new b(pointArr[pointArr.length - 1].x, pointArr[pointArr.length - 1].y));
                return;
            } else {
                this.bdAnimation = new g(pointArr);
                return;
            }
        }
        throw new NullPointerException("BDMapSDKException: the points is null");
    }
}
