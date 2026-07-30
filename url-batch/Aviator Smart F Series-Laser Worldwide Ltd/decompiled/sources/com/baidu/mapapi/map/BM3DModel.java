package com.baidu.mapapi.map;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.BM3DModelOptions;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.Bm3DModel;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;

/* loaded from: classes2.dex */
public final class BM3DModel extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    String f5528g;

    /* renamed from: h, reason: collision with root package name */
    String f5529h;

    /* renamed from: i, reason: collision with root package name */
    LatLng f5530i;

    /* renamed from: l, reason: collision with root package name */
    float f5533l;

    /* renamed from: m, reason: collision with root package name */
    float f5534m;

    /* renamed from: n, reason: collision with root package name */
    float f5535n;

    /* renamed from: o, reason: collision with root package name */
    float f5536o;

    /* renamed from: p, reason: collision with root package name */
    float f5537p;

    /* renamed from: q, reason: collision with root package name */
    float f5538q;

    /* renamed from: s, reason: collision with root package name */
    boolean f5540s;

    /* renamed from: t, reason: collision with root package name */
    int f5541t;

    /* renamed from: u, reason: collision with root package name */
    int f5542u;

    /* renamed from: v, reason: collision with root package name */
    float f5543v;

    /* renamed from: w, reason: collision with root package name */
    private Bm3DModel f5544w;

    /* renamed from: x, reason: collision with root package name */
    Animation f5545x;

    /* renamed from: y, reason: collision with root package name */
    boolean f5546y;

    /* renamed from: j, reason: collision with root package name */
    float f5531j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    boolean f5532k = false;

    /* renamed from: r, reason: collision with root package name */
    BM3DModelOptions.BM3DModelType f5539r = BM3DModelOptions.BM3DModelType.BM3DModelTypeObj;

    public BM3DModel() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.BM3DModel;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        if (TextUtils.isEmpty(this.f5528g)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelPath can not be null");
        }
        bundle.putString("modelPath", this.f5528g);
        if (TextUtils.isEmpty(this.f5529h)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel mModelName can not be null");
        }
        bundle.putString("modelName", this.f5529h);
        LatLng latLng = this.f5530i;
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel mPosition can not be null");
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("modelType", this.f5539r.ordinal());
        bundle.putFloat("scale", this.f5531j);
        bundle.putInt("zoomFixed", this.f5532k ? 1 : 0);
        bundle.putFloat("rotateX", this.f5533l);
        bundle.putFloat("rotateY", this.f5534m);
        bundle.putFloat("rotateZ", this.f5535n);
        bundle.putFloat("offsetX", this.f5536o);
        bundle.putFloat("offsetY", this.f5537p);
        bundle.putFloat("offsetZ", this.f5538q);
        bundle.putInt("animationIndex", this.f5542u);
        bundle.putBoolean("animationIsEnable", this.f5540s);
        bundle.putInt("animationRepeatCount", this.f5541t);
        bundle.putFloat("animationSpeed", this.f5543v);
        bundle.putBoolean("alwaysShowFront", this.f5546y);
        return bundle;
    }

    public void cancelAnimation() {
        if (this.f5545x == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.f5545x.bmAnimation.cancel();
        this.f6122f.b();
    }

    public int getAnimationIndex() {
        return this.f5542u;
    }

    public int getAnimationRepeatCount() {
        return this.f5541t;
    }

    public float getAnimationSpeed() {
        return this.f5543v;
    }

    public BM3DModelOptions.BM3DModelType getBM3DModelType() {
        return this.f5539r;
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem getDrawItem() {
        return this.f5544w;
    }

    public String getModelName() {
        return this.f5529h;
    }

    public String getModelPath() {
        return this.f5528g;
    }

    public float getOffsetX() {
        return this.f5536o;
    }

    public float getOffsetY() {
        return this.f5537p;
    }

    public float getOffsetZ() {
        return this.f5538q;
    }

    public LatLng getPosition() {
        return this.f5530i;
    }

    public float getRotateX() {
        return this.f5533l;
    }

    public float getRotateY() {
        return this.f5534m;
    }

    public float getRotateZ() {
        return this.f5535n;
    }

    public float getScale() {
        return this.f5531j;
    }

    public boolean isSkeletonAnimationEnable() {
        return this.f5540s;
    }

    public boolean isZoomFixed() {
        return this.f5532k;
    }

    public void pauseAnimation() {
        if (this.f5545x == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.f5545x.bmAnimation.pause();
        this.f6122f.b();
    }

    public void resumeAnimation() {
        if (this.f5545x == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.f5545x.bmAnimation.resume();
        this.f6122f.b();
    }

    public void setAnimation(Animation animation) {
        BmAnimation bmAnimation;
        if (animation == null) {
            return;
        }
        this.f5545x = animation;
        if (!OverlayUtil.isOverlayUpgrade() || (bmAnimation = this.f5545x.bmAnimation) == null) {
            return;
        }
        this.f5544w.a(bmAnimation);
        this.f6122f.b();
    }

    public void setAnimationIndex(int i8) {
        this.f5542u = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.e(i8);
        this.f6122f.b();
    }

    public void setAnimationRepeatCount(int i8) {
        this.f5541t = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.f(i8);
        this.f6122f.b();
    }

    public void setAnimationSpeed(float f8) {
        this.f5543v = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.b(f8);
        this.f6122f.b();
    }

    public void setBM3DModelType(BM3DModelOptions.BM3DModelType bM3DModelType) {
        this.f5539r = bM3DModelType;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.a(this.f5528g, this.f5529h, this.f5539r.getType());
        this.f6122f.b();
    }

    public void setModelName(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelName can not be null");
        }
        this.f5529h = str;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.a(this.f5528g, this.f5529h, this.f5539r.getType());
        this.f6122f.b();
    }

    public void setModelPath(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel modelPath can not be null");
        }
        this.f5528g = str;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.a(this.f5528g, this.f5529h, this.f5539r.getType());
        this.f6122f.b();
    }

    public void setOffset(float f8, float f9, float f10) {
        this.f5536o = f8;
        this.f5537p = f9;
        this.f5538q = f10;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.a(this.f5536o, this.f5537p, this.f5538q);
        this.f6122f.b();
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: BM3DModel position can not be null");
        }
        this.f5530i = latLng;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f5544w == null || this.f6122f == null) {
                return;
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f5530i);
            this.f5544w.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            this.f6122f.b();
        }
    }

    public void setRotate(float f8, float f9, float f10) {
        this.f5533l = f8;
        this.f5534m = f9;
        this.f5535n = f10;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.a(this.f5533l, this.f5534m, this.f5535n);
        this.f6122f.b();
    }

    public void setScale(float f8) {
        this.f5531j = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.c(this.f5531j);
        this.f6122f.b();
    }

    public void setSkeletonAnimationEnable(boolean z7) {
        this.f5540s = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.d(this.f5540s);
        this.f6122f.b();
    }

    public void setZoomFixed(boolean z7) {
        this.f5532k = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        Bm3DModel bm3DModel = this.f5544w;
        if (bm3DModel == null || this.f6122f == null) {
            return;
        }
        bm3DModel.e(!this.f5532k);
        this.f6122f.b();
    }

    public void startAnimation() {
        if (this.f5545x == null || !OverlayUtil.isOverlayUpgrade()) {
            return;
        }
        this.f5545x.bmAnimation.start();
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        Bm3DModel bm3DModel = new Bm3DModel();
        this.f5544w = bm3DModel;
        bm3DModel.a(this);
        setDrawItem(this.f5544w);
        super.toDrawItem();
        this.f5544w.a(this.f5528g, this.f5529h, this.f5539r.getType());
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5530i);
        this.f5544w.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        this.f5544w.e(!this.f5532k);
        this.f5544w.c(this.f5531j);
        this.f5544w.a(this.f5533l, this.f5534m, this.f5535n);
        this.f5544w.a(this.f5536o, this.f5537p, this.f5538q);
        this.f5544w.d(this.f5540s);
        this.f5544w.b(this.f5543v);
        this.f5544w.f(this.f5541t);
        this.f5544w.e(this.f5542u);
        this.f5544w.c(this.f5546y);
        return this.f5544w;
    }
}
