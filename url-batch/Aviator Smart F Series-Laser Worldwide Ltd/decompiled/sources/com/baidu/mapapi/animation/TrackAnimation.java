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
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.OverlayUtil;
import com.baidu.mapapi.map.TrackAnimationUpdateListener;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
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
import com.baidu.platform.comapi.bmsdk.animation.BmTrackAnimation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class TrackAnimation extends Animation {

    class a implements BmTrackAnimation.a {
        a() {
        }

        @Override // com.baidu.platform.comapi.bmsdk.animation.BmTrackAnimation.a
        public void a(com.baidu.platform.comapi.bmsdk.b bVar, float f8, float f9) {
            if (((BmTrackAnimation) TrackAnimation.this.bmAnimation).trackAnimationUpdateListener != null) {
                ((BmTrackAnimation) TrackAnimation.this.bmAnimation).trackAnimationUpdateListener.onTrackUpdate(CoordUtil.mc2ll(new GeoPoint(bVar.f8939b, bVar.f8938a)), f8, f9);
            }
        }
    }

    class b implements BmAnimation.a {
        b() {
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

    public TrackAnimation(List<LatLng> list) {
        if (list == null || list.isEmpty()) {
            throw new NullPointerException("BDMapSDKException: the trackPath is null");
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            throw new NullPointerException("BDMapSDKException: TrackAnimation must be used in Overlay2.0");
        }
        this.bmAnimation = new BmTrackAnimation();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(list.get(i8));
            arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        BmGeoElement bmGeoElement = new BmGeoElement();
        bmGeoElement.a(arrayList);
        ((BmTrackAnimation) this.bmAnimation).setTrackPath(bmGeoElement);
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void cancel() {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.cancel();
        }
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        BmAnimation bmAnimation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.bmAnimation) == null) {
            return;
        }
        bmAnimation.setAnimationListener(animationListener);
        this.bmAnimation.setAnimationListener(new b());
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setDuration(long j8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.bmAnimation.setDuration(j8);
        }
    }

    @Override // com.baidu.mapapi.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        if (OverlayUtil.isOverlayUpgrade()) {
            com.baidu.platform.comapi.bmsdk.animation.a bmLinearInterpolator = interpolator instanceof LinearInterpolator ? new BmLinearInterpolator() : interpolator instanceof CycleInterpolator ? new BmCycleInterpolator() : interpolator instanceof BounceInterpolator ? new BmBounceInterpolator() : interpolator instanceof DecelerateInterpolator ? new BmDecelerateInterpolator() : interpolator instanceof OvershootInterpolator ? new BmOvershootInterpolator() : interpolator instanceof AccelerateInterpolator ? new BmAccelerateInterpolator() : interpolator instanceof AccelerateDecelerateInterpolator ? new BmAccelerateDecelerateInterpolator() : interpolator instanceof AnticipateInterpolator ? new BmAnticipateInterpolator() : interpolator instanceof AnticipateOvershootInterpolator ? new BmAnticipateOvershootInterpolator() : null;
            if (bmLinearInterpolator != null) {
                this.bmAnimation.setInterpolator(bmLinearInterpolator);
            }
        }
    }

    public void setRepeatDelay(long j8) {
        BmAnimation bmAnimation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.bmAnimation) == null) {
            return;
        }
        bmAnimation.setRepeatDelay(j8);
    }

    public void setStartDelay(long j8) {
        BmAnimation bmAnimation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.bmAnimation) == null) {
            return;
        }
        bmAnimation.setStartDelay(j8);
    }

    public void setTrackLine(Overlay overlay) {
        if (overlay != null && OverlayUtil.isOverlayUpgrade()) {
            ((BmTrackAnimation) this.bmAnimation).setTrackLine(overlay.getDrawItem());
        }
    }

    public void setTrackPath(List<LatLng> list) {
        if (!OverlayUtil.isOverlayUpgrade() || list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(list.get(i8));
            arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        BmGeoElement bmGeoElement = new BmGeoElement();
        bmGeoElement.a(arrayList);
        ((BmTrackAnimation) this.bmAnimation).setTrackPath(bmGeoElement);
    }

    public void setTrackPos(LatLng latLng, LatLng latLng2) {
        if (OverlayUtil.isOverlayUpgrade()) {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
            ((BmTrackAnimation) this.bmAnimation).setTrackPos(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()), new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
        }
    }

    public void setTrackPosRadio(float f8, float f9) {
        if (OverlayUtil.isOverlayUpgrade()) {
            ((BmTrackAnimation) this.bmAnimation).setTrackPosRadio(f8, f9);
        }
    }

    public void setTrackUpdateListener(TrackAnimationUpdateListener trackAnimationUpdateListener) {
        if (OverlayUtil.isOverlayUpgrade()) {
            ((BmTrackAnimation) this.bmAnimation).setTrackAnimationUpdateListener(trackAnimationUpdateListener);
            ((BmTrackAnimation) this.bmAnimation).setTrackUpdateListener(new a());
        }
    }

    public void setTrackPosRadio(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            ((BmTrackAnimation) this.bmAnimation).setTrackPosRadio(f8);
        }
    }

    public void setTrackPos(LatLng latLng) {
        if (OverlayUtil.isOverlayUpgrade()) {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            ((BmTrackAnimation) this.bmAnimation).setTrackPos(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
    }
}
