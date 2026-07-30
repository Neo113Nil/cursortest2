package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGround;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public final class GroundOverlay extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    int f5805g;

    /* renamed from: h, reason: collision with root package name */
    BitmapDescriptor f5806h;

    /* renamed from: i, reason: collision with root package name */
    LatLng f5807i;

    /* renamed from: j, reason: collision with root package name */
    double f5808j;

    /* renamed from: k, reason: collision with root package name */
    double f5809k;

    /* renamed from: l, reason: collision with root package name */
    float f5810l;

    /* renamed from: m, reason: collision with root package name */
    float f5811m;

    /* renamed from: n, reason: collision with root package name */
    LatLngBounds f5812n;

    /* renamed from: o, reason: collision with root package name */
    float f5813o;

    /* renamed from: p, reason: collision with root package name */
    private BmGround f5814p;

    /* renamed from: q, reason: collision with root package name */
    boolean f5815q = false;

    GroundOverlay() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.ground;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        bundle.putBundle("image_info", this.f5806h.a());
        if (this.f5805g == 1) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f5812n.southwest);
            double longitudeE6 = ll2mc.getLongitudeE6();
            double latitudeE6 = ll2mc.getLatitudeE6();
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f5812n.northeast);
            double longitudeE62 = ll2mc2.getLongitudeE6();
            double latitudeE62 = ll2mc2.getLatitudeE6();
            double d8 = longitudeE62 - longitudeE6;
            this.f5808j = d8;
            double d9 = latitudeE62 - latitudeE6;
            this.f5809k = d9;
            this.f5807i = CoordUtil.mc2ll(new GeoPoint(latitudeE6 + (d9 / 2.0d), longitudeE6 + (d8 / 2.0d)));
            this.f5810l = 0.5f;
            this.f5811m = 0.5f;
        }
        double d10 = this.f5808j;
        if (d10 <= i.DOUBLE_EPSILON || this.f5809k <= i.DOUBLE_EPSILON) {
            throw new IllegalStateException("BDMapSDKException: when you add ground overlay, the width and height must greater than 0");
        }
        bundle.putDouble("x_distance", d10);
        if (this.f5809k == 2.147483647E9d) {
            this.f5809k = (int) ((this.f5808j * this.f5806h.f5702a.getHeight()) / this.f5806h.f5702a.getWidth());
        }
        bundle.putDouble("y_distance", this.f5809k);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(this.f5807i);
        bundle.putDouble("location_x", ll2mc3.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc3.getLatitudeE6());
        bundle.putFloat("anchor_x", this.f5810l);
        bundle.putFloat("anchor_y", this.f5811m);
        bundle.putFloat("transparency", this.f5813o);
        bundle.putInt("isClickable", this.f5815q ? 1 : 0);
        return bundle;
    }

    public float getAnchorX() {
        return this.f5810l;
    }

    public float getAnchorY() {
        return this.f5811m;
    }

    public LatLngBounds getBounds() {
        return this.f5812n;
    }

    public double getHeight() {
        return this.f5809k;
    }

    public BitmapDescriptor getImage() {
        return this.f5806h;
    }

    public LatLng getPosition() {
        return this.f5807i;
    }

    public float getTransparency() {
        return this.f5813o;
    }

    public double getWidth() {
        return this.f5808j;
    }

    public boolean isClickable() {
        return this.f5815q;
    }

    public void setAnchor(float f8, float f9) {
        if (f8 < 0.0f || f8 > 1.0f || f9 < 0.0f || f9 > 1.0f) {
            return;
        }
        this.f5810l = f8;
        this.f5811m = f9;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmGround bmGround = this.f5814p;
        if (bmGround == null || this.f6122f == null) {
            return;
        }
        bmGround.b(this.f5810l);
        this.f5814p.c(this.f5811m);
        this.f6122f.b();
    }

    public void setClickable(boolean z7) {
        this.f5815q = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmGround bmGround = this.f5814p;
        if (bmGround == null || this.f6122f == null) {
            return;
        }
        bmGround.a(this.f5815q);
        this.f6122f.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDimensions(int i8) {
        Bitmap bitmap;
        int height;
        if (i8 <= 0) {
            this.f5808j = i.DOUBLE_EPSILON;
            this.f5809k = i.DOUBLE_EPSILON;
        } else {
            double d8 = i8;
            this.f5808j = d8;
            this.f5809k = 2.147483647E9d;
            BitmapDescriptor bitmapDescriptor = this.f5806h;
            if (bitmapDescriptor != null && (bitmap = bitmapDescriptor.f5702a) != null) {
                height = (int) ((d8 * bitmap.getHeight()) / this.f5806h.f5702a.getWidth());
                if (OverlayUtil.isOverlayUpgrade()) {
                    this.listener.d(this);
                    return;
                }
                BmGround bmGround = this.f5814p;
                if (bmGround == null || this.f6122f == null) {
                    return;
                }
                bmGround.a(height);
                this.f5814p.b(this.f5808j);
                this.f6122f.b();
                return;
            }
        }
        height = 0;
        if (OverlayUtil.isOverlayUpgrade()) {
        }
    }

    public void setImage(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: image can not be null");
        }
        this.f5806h = bitmapDescriptor;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5814p == null || this.f6122f == null) {
            return;
        }
        this.f5814p.a(this.f5806h.f5702a != null ? (int) ((this.f5808j * r5.getHeight()) / this.f5806h.f5702a.getWidth()) : 0);
        this.f5814p.a(new BmBitmapResource(this.f5806h.getBitmap()));
        this.f6122f.b();
    }

    public void setPosition(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: position can not be null");
        }
        this.f5805g = 2;
        this.f5807i = latLng;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f5814p == null || this.f6122f == null) {
                return;
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f5807i);
            this.f5814p.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            this.f6122f.b();
        }
    }

    public void setPositionFromBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            throw new IllegalArgumentException("BDMapSDKException: bounds can not be null");
        }
        this.f5805g = 1;
        this.f5812n = latLngBounds;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5814p == null || this.f6122f == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5812n.southwest);
        double longitudeE6 = ll2mc.getLongitudeE6();
        double latitudeE6 = ll2mc.getLatitudeE6();
        GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f5812n.northeast);
        double longitudeE62 = ll2mc2.getLongitudeE6();
        double latitudeE62 = ll2mc2.getLatitudeE6();
        double d8 = longitudeE62 - longitudeE6;
        this.f5808j = d8;
        double d9 = latitudeE62 - latitudeE6;
        this.f5809k = d9;
        GeoPoint geoPoint = new GeoPoint(latitudeE6 + (d9 / 2.0d), longitudeE6 + (d8 / 2.0d));
        this.f5807i = CoordUtil.mc2ll(geoPoint);
        this.f5810l = 0.5f;
        this.f5811m = 0.5f;
        this.f5814p.a(new com.baidu.platform.comapi.bmsdk.b(geoPoint.getLongitudeE6(), geoPoint.getLatitudeE6()));
        this.f5814p.b(this.f5808j);
        this.f5814p.a(this.f5809k);
        this.f5814p.b(this.f5810l);
        this.f5814p.c(this.f5811m);
    }

    public void setTransparency(float f8) {
        if (f8 > 1.0f || f8 < 0.0f) {
            return;
        }
        this.f5813o = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmGround bmGround = this.f5814p;
        if (bmGround == null || this.f6122f == null) {
            return;
        }
        bmGround.a(this.f5813o);
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        Bitmap bitmap;
        BmGround bmGround = new BmGround();
        this.f5814p = bmGround;
        bmGround.a(this);
        setDrawItem(this.f5814p);
        super.toDrawItem();
        if (this.f5806h == null) {
            return this.f5814p;
        }
        if (this.f5805g == 1) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f5812n.southwest);
            double longitudeE6 = ll2mc.getLongitudeE6();
            double latitudeE6 = ll2mc.getLatitudeE6();
            GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f5812n.northeast);
            double longitudeE62 = ll2mc2.getLongitudeE6();
            double latitudeE62 = ll2mc2.getLatitudeE6();
            double d8 = longitudeE62 - longitudeE6;
            this.f5808j = d8;
            double d9 = latitudeE62 - latitudeE6;
            this.f5809k = d9;
            this.f5807i = CoordUtil.mc2ll(new GeoPoint(latitudeE6 + (d9 / 2.0d), longitudeE6 + (d8 / 2.0d)));
            this.f5810l = 0.5f;
            this.f5811m = 0.5f;
        }
        if (this.f5809k == 2.147483647E9d && (bitmap = this.f5806h.f5702a) != null) {
            this.f5809k = (int) ((this.f5808j * bitmap.getHeight()) / this.f5806h.f5702a.getWidth());
        }
        LatLng latLng = this.f5807i;
        if (latLng != null) {
            GeoPoint ll2mc3 = CoordUtil.ll2mc(latLng);
            this.f5814p.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc3.getLongitudeE6(), ll2mc3.getLatitudeE6()));
        }
        this.f5814p.b(this.f5808j);
        this.f5814p.a(this.f5809k);
        this.f5814p.b(this.f5810l);
        this.f5814p.c(this.f5811m);
        this.f5814p.a(this.f5815q);
        this.f5814p.a(this.f5813o);
        this.f5814p.a(new BmBitmapResource(this.f5806h.getBitmap()));
        return this.f5814p;
    }

    public void setDimensions(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            this.f5808j = i.DOUBLE_EPSILON;
            this.f5809k = i.DOUBLE_EPSILON;
        } else {
            this.f5808j = i8;
            this.f5809k = i9;
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmGround bmGround = this.f5814p;
        if (bmGround == null || this.f6122f == null) {
            return;
        }
        bmGround.a(this.f5809k);
        this.f5814p.b(this.f5808j);
        this.f6122f.b();
    }
}
