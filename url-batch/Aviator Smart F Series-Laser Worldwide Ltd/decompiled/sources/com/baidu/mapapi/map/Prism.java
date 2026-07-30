package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmPrism;
import com.baidu.platform.comapi.bmsdk.style.BmBitmapResource;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Prism extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    float f6225g;

    /* renamed from: h, reason: collision with root package name */
    String f6226h;

    /* renamed from: i, reason: collision with root package name */
    int f6227i;

    /* renamed from: j, reason: collision with root package name */
    List<LatLng> f6228j;

    /* renamed from: k, reason: collision with root package name */
    BmGeoElement f6229k;

    /* renamed from: l, reason: collision with root package name */
    int f6230l = -16777216;

    /* renamed from: m, reason: collision with root package name */
    int f6231m = -16711936;

    /* renamed from: n, reason: collision with root package name */
    BitmapDescriptor f6232n;

    /* renamed from: o, reason: collision with root package name */
    BmPrism f6233o;

    public enum AnimateType {
        AnimateSlow,
        AnimateNormal,
        AnimateFast
    }

    public Prism() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.prism;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        Overlay.f(this.f6230l, bundle);
        Overlay.e(this.f6231m, bundle);
        BitmapDescriptor bitmapDescriptor = this.f6232n;
        if (bitmapDescriptor != null) {
            bundle.putBundle("image_info", bitmapDescriptor.a());
        }
        List<LatLng> list = this.f6228j;
        if (list != null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(list.get(0));
            bundle.putDouble("location_x", ll2mc.getLongitudeE6());
            bundle.putDouble("location_y", ll2mc.getLatitudeE6());
            Overlay.c(this.f6228j, bundle);
            bundle.putDouble("m_height", this.f6225g);
        }
        return bundle;
    }

    public BitmapDescriptor getCustomSideImage() {
        return this.f6232n;
    }

    public float getHeight() {
        return this.f6225g;
    }

    public List<LatLng> getPoints() {
        return this.f6228j;
    }

    public int getSideFaceColor() {
        return this.f6231m;
    }

    public int getTopFaceColor() {
        return this.f6230l;
    }

    public void setCustomSideImage(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        this.f6232n = bitmapDescriptor;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6233o == null || this.f6122f == null) {
            return;
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f6231m);
        bmSurfaceStyle.a(new BmBitmapResource(this.f6232n.getBitmap()));
        this.f6233o.c(bmSurfaceStyle);
        this.f6122f.b();
    }

    public void setHeight(float f8) {
        this.f6225g = f8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.c(this.f6225g);
        this.f6122f.b();
    }

    public void setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() <= 3) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than four");
        }
        if (list.contains(null)) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not contains null");
        }
        int i8 = 0;
        while (i8 < list.size()) {
            int i9 = i8 + 1;
            for (int i10 = i9; i10 < list.size(); i10++) {
                if (list.get(i8) == list.get(i10)) {
                    throw new IllegalArgumentException("BDMapSDKException: points list can not has same points");
                }
            }
            i8 = i9;
        }
        this.f6228j = list;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPrism bmPrism = this.f6233o;
        if (bmPrism == null || this.f6122f == null) {
            return;
        }
        bmPrism.c();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f6228j.size(); i11++) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f6228j.get(i11));
            arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
        }
        this.f6229k.a(arrayList);
        this.f6233o.a(this.f6229k);
        this.f6122f.b();
    }

    public void setSideFaceColor(int i8) {
        this.f6231m = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6233o == null || this.f6122f == null) {
            return;
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f6231m);
        this.f6233o.c(bmSurfaceStyle);
        this.f6122f.b();
    }

    public void setTopFaceColor(int i8) {
        this.f6230l = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f6233o == null || this.f6122f == null) {
            return;
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f6230l);
        this.f6233o.d(bmSurfaceStyle);
        this.f6122f.b();
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        if (this.f6233o == null) {
            BmPrism bmPrism = new BmPrism();
            this.f6233o = bmPrism;
            bmPrism.a(this);
            setDrawItem(this.f6233o);
        }
        super.toDrawItem();
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        BmSurfaceStyle bmSurfaceStyle2 = new BmSurfaceStyle();
        bmSurfaceStyle.a(this.f6230l);
        bmSurfaceStyle2.a(this.f6231m);
        if (this.f6232n != null) {
            bmSurfaceStyle2.a(new BmBitmapResource(this.f6232n.getBitmap()));
        }
        this.f6229k = new BmGeoElement();
        String str = this.f6226h;
        if (str != null && str.length() > 0) {
            this.f6229k.a(this.f6226h);
            this.f6229k.a(this.f6227i);
        } else if (this.f6228j != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < this.f6228j.size(); i8++) {
                GeoPoint ll2mc = CoordUtil.ll2mc(this.f6228j.get(i8));
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
            }
            this.f6229k.a(arrayList);
            this.f6233o.a(this.f6229k);
        }
        float f8 = this.f6225g;
        if (f8 > 0.0f) {
            this.f6233o.c(f8);
        }
        this.f6233o.d(bmSurfaceStyle);
        this.f6233o.c(bmSurfaceStyle2);
        return this.f6233o;
    }
}
