package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmMultiPoint;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class MultiPoint extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    List<MultiPointItem> f6071g;

    /* renamed from: h, reason: collision with root package name */
    BitmapDescriptor f6072h;

    /* renamed from: i, reason: collision with root package name */
    int f6073i;

    /* renamed from: j, reason: collision with root package name */
    int f6074j;

    /* renamed from: k, reason: collision with root package name */
    float f6075k;

    /* renamed from: l, reason: collision with root package name */
    float f6076l;

    /* renamed from: m, reason: collision with root package name */
    boolean f6077m = true;

    /* renamed from: n, reason: collision with root package name */
    private BmMultiPoint f6078n;

    public MultiPoint() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.multiPoint;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        List<MultiPointItem> list = this.f6071g;
        if (list != null && list.size() > 0) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6071g.get(0).getPoint());
            bundle.putDouble("location_x", ll2mc.getLongitudeE6());
            bundle.putDouble("location_y", ll2mc.getLatitudeE6());
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < this.f6071g.size(); i8++) {
                MultiPointItem multiPointItem = this.f6071g.get(i8);
                if (multiPointItem != null) {
                    arrayList.add(multiPointItem.getPoint());
                }
            }
            Overlay.c(arrayList, bundle);
        }
        BitmapDescriptor bitmapDescriptor = this.f6072h;
        if (bitmapDescriptor != null) {
            bundle.putBundle("image_info", bitmapDescriptor.a());
        }
        bundle.putInt("isClickable", this.f6077m ? 1 : 0);
        bundle.putFloat("anchor_x", this.f6075k);
        bundle.putFloat("anchor_y", this.f6076l);
        bundle.putFloat("pointsize_x", this.f6073i);
        bundle.putFloat("pointsize_y", this.f6074j);
        return bundle;
    }

    public void anchor(float f8, float f9) {
        if (f8 < 0.0f || f8 > 1.0f || f9 < 0.0f || f9 > 1.0f) {
            return;
        }
        this.f6075k = f8;
        this.f6076l = f9;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmMultiPoint bmMultiPoint = this.f6078n;
        if (bmMultiPoint == null || this.f6122f == null) {
            return;
        }
        bmMultiPoint.b(this.f6075k);
        this.f6078n.c(this.f6076l);
        this.f6122f.b();
    }

    public float getAnchorX() {
        return this.f6075k;
    }

    public float getAnchorY() {
        return this.f6076l;
    }

    public BitmapDescriptor getIcon() {
        return this.f6072h;
    }

    public MultiPointItem getMultiPointItem(int i8) {
        List<MultiPointItem> list = this.f6071g;
        if (list == null || i8 >= list.size()) {
            return null;
        }
        return this.f6071g.get(i8);
    }

    public List<MultiPointItem> getMultiPointItems() {
        return this.f6071g;
    }

    public int getPointSizeHeight() {
        return this.f6074j;
    }

    public int getPointSizeWidth() {
        return this.f6073i;
    }

    public boolean isClickable() {
        return this.f6077m;
    }

    public void setClickable(boolean z7) {
        this.f6077m = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmMultiPoint bmMultiPoint = this.f6078n;
        if (bmMultiPoint == null || this.f6122f == null) {
            return;
        }
        bmMultiPoint.a(z7);
        this.f6122f.b();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            throw new IllegalArgumentException("BDMapSDKException: marker's icon can not be null");
        }
        this.f6072h = bitmapDescriptor;
        if (this.f6073i == 0) {
            this.f6073i = bitmapDescriptor.getBitmap().getWidth();
        }
        if (this.f6074j == 0) {
            this.f6074j = bitmapDescriptor.getBitmap().getHeight();
        }
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f6078n == null || this.f6122f == null) {
                return;
            }
            this.f6078n.a(new BmBitmapResource(this.f6072h.getBitmap()));
            this.f6122f.b();
        }
    }

    public void setMultiPointItems(List<MultiPointItem> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: multiPointItems list can not be null");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: multiPointItems list can not contains null");
        }
        this.f6071g = list;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmMultiPoint bmMultiPoint = this.f6078n;
        if (bmMultiPoint == null || this.f6122f == null) {
            return;
        }
        bmMultiPoint.c();
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f6071g.get(0).getPoint());
        this.f6078n.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        BmGeoElement bmGeoElement = new BmGeoElement();
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < this.f6071g.size(); i8++) {
            MultiPointItem multiPointItem = this.f6071g.get(i8);
            if (multiPointItem != null) {
                GeoPoint ll2mc2 = CoordUtil.ll2mc(multiPointItem.getPoint());
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
            }
        }
        bmGeoElement.a(arrayList);
        this.f6078n.a(bmGeoElement);
        this.f6122f.b();
    }

    public void setPointSize(int i8, int i9) {
        if (this.f6073i <= 0 || this.f6074j <= 0) {
            throw new IllegalArgumentException("BDMapSDKException: MultiPoint setPointSize can not be 0 Or can't less than 0");
        }
        this.f6073i = i8;
        this.f6074j = i9;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmMultiPoint bmMultiPoint = this.f6078n;
        if (bmMultiPoint == null || this.f6122f == null) {
            return;
        }
        bmMultiPoint.b(this.f6073i);
        this.f6078n.a(this.f6074j);
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem toDrawItem() {
        BmMultiPoint bmMultiPoint = new BmMultiPoint();
        this.f6078n = bmMultiPoint;
        bmMultiPoint.a(this);
        setDrawItem(this.f6078n);
        super.getDrawItem();
        this.f6078n.b(this.f6075k);
        this.f6078n.c(this.f6076l);
        this.f6078n.b(this.f6073i);
        this.f6078n.a(this.f6074j);
        this.f6078n.a(this.f6077m);
        List<MultiPointItem> list = this.f6071g;
        if (list != null && list.size() > 0) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6071g.get(0).getPoint());
            this.f6078n.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            BmGeoElement bmGeoElement = new BmGeoElement();
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < this.f6071g.size(); i8++) {
                MultiPointItem multiPointItem = this.f6071g.get(i8);
                if (multiPointItem != null) {
                    GeoPoint ll2mc2 = CoordUtil.ll2mc(multiPointItem.getPoint());
                    arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
                }
            }
            bmGeoElement.a(arrayList);
            this.f6078n.a(bmGeoElement);
        }
        if (this.f6072h != null) {
            this.f6078n.a(new BmBitmapResource(this.f6072h.getBitmap()));
        }
        return this.f6078n;
    }
}
