package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.BmPolygon;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;
import com.baidu.platform.comapi.util.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Polygon extends Overlay {
    BmPolygon A;
    float D;
    float E;
    int F;
    float G;

    /* renamed from: g, reason: collision with root package name */
    Stroke f6129g;

    /* renamed from: i, reason: collision with root package name */
    BmGeoElement f6131i;

    /* renamed from: j, reason: collision with root package name */
    String f6132j;

    /* renamed from: k, reason: collision with root package name */
    BmSurfaceStyle f6133k;

    /* renamed from: l, reason: collision with root package name */
    BmLineStyle f6134l;

    /* renamed from: n, reason: collision with root package name */
    BmGeoElement f6136n;

    /* renamed from: p, reason: collision with root package name */
    int f6138p;

    /* renamed from: q, reason: collision with root package name */
    List<LatLng> f6139q;

    /* renamed from: r, reason: collision with root package name */
    List<HoleOptions> f6140r;

    /* renamed from: s, reason: collision with root package name */
    HoleOptions f6141s;

    /* renamed from: t, reason: collision with root package name */
    boolean f6142t;

    /* renamed from: x, reason: collision with root package name */
    boolean f6146x;

    /* renamed from: y, reason: collision with root package name */
    ThinAndSmoothAlgorithm f6147y;

    /* renamed from: z, reason: collision with root package name */
    float f6148z;

    /* renamed from: h, reason: collision with root package name */
    boolean f6130h = false;

    /* renamed from: m, reason: collision with root package name */
    int f6135m = PolylineDottedLineType.DOTTED_LINE_SQUARE.ordinal();

    /* renamed from: o, reason: collision with root package name */
    List<BmGeoElement> f6137o = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    boolean f6143u = false;

    /* renamed from: v, reason: collision with root package name */
    boolean f6144v = false;

    /* renamed from: w, reason: collision with root package name */
    int f6145w = -1;
    LineBloomType B = LineBloomType.NONE;
    LineBloomDirection C = LineBloomDirection.BloomAround;

    Polygon() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.polygon;
    }

    private void b(Bundle bundle) {
        int i8 = this.f6135m;
        BitmapDescriptor fromAsset = BitmapDescriptorFactory.fromAsset(i8 == 1 ? "CircleDashTexture.png" : i8 == 2 ? "lineDash_Rectangle.png" : "lineDashTexture.png");
        if (fromAsset != null) {
            bundle.putBundle("image_info", fromAsset.a());
        }
    }

    private void e(List<HoleOptions> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        boolean b8 = Overlay.b(list, bundle2);
        bundle.putInt("has_holes", b8 ? 1 : 0);
        if (b8) {
            bundle.putBundle("holes", bundle2);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        if (this.f6142t) {
            bundle.putInt("has_dotted_stroke", 1);
            b(bundle);
        } else {
            bundle.putInt("has_dotted_stroke", 0);
        }
        String str = this.f6132j;
        if (str == null || str.length() <= 0 || this.f6118b == null) {
            List<LatLng> list = this.f6139q;
            if (list != null) {
                GeoPoint ll2mc = CoordUtil.ll2mc(list.get(0));
                bundle.putDouble("location_x", ll2mc.getLongitudeE6());
                bundle.putDouble("location_y", ll2mc.getLatitudeE6());
                Overlay.c(this.f6139q, bundle);
                if (this.f6142t) {
                    bundle.putDouble("dotted_stroke_location_x", ll2mc.getLongitudeE6());
                    bundle.putDouble("dotted_stroke_location_y", ll2mc.getLatitudeE6());
                }
            }
        } else {
            bundle.putString("encodedPoints", this.f6132j);
            bundle.putInt("encodePointType", this.f6118b.ordinal());
        }
        Overlay.d(this.f6138p, bundle);
        if (this.f6129g == null) {
            bundle.putInt("has_stroke", 0);
        } else {
            bundle.putInt("has_stroke", 1);
            bundle.putBundle("stroke", this.f6129g.a(new Bundle()));
        }
        List<HoleOptions> list2 = this.f6140r;
        if (list2 != null && list2.size() != 0) {
            e(this.f6140r, bundle);
            bundle.putInt("holes_count", this.f6140r.size());
        } else if (this.f6141s != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f6141s);
            e(arrayList, bundle);
            bundle.putInt("holes_count", 1);
        } else {
            bundle.putInt("has_holes", 0);
        }
        bundle.putInt("isClickable", this.f6143u ? 1 : 0);
        bundle.putInt("isHoleClickable", this.f6144v ? 1 : 0);
        bundle.putInt("isThined", this.f6146x ? 1 : 0);
        return bundle;
    }

    public String getEncodedPoint() {
        return this.f6132j;
    }

    public int getFillColor() {
        return this.f6138p;
    }

    public int getHoleClickedIndex() {
        return this.f6145w;
    }

    public HoleOptions getHoleOption() {
        return this.f6141s;
    }

    public List<HoleOptions> getHoleOptions() {
        return this.f6140r;
    }

    public EncodePointType getPointType() {
        return this.f6118b;
    }

    public List<LatLng> getPoints() {
        return this.f6139q;
    }

    public Stroke getStroke() {
        return this.f6129g;
    }

    public boolean isClickable() {
        return this.f6143u;
    }

    public boolean isThined() {
        return this.f6146x;
    }

    public void setBloomAlpha(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.D = f8;
            this.A.b(f8);
            this.f6122f.b();
        }
    }

    public void setBloomBlurTimes(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.F = i8;
            this.A.e(i8);
            this.f6122f.b();
        }
    }

    public void setBloomGradientASpeed(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.G = f8;
            this.A.c(f8);
            this.f6122f.b();
        }
    }

    public void setBloomWidth(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.E = f8;
            this.A.d(f8);
            this.f6122f.b();
        }
    }

    public void setClickable(boolean z7) {
        this.f6143u = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPolygon bmPolygon = this.A;
        if (bmPolygon == null || this.f6122f == null) {
            return;
        }
        bmPolygon.a(z7);
        this.f6122f.b();
    }

    public void setEncodeInfo(String str, EncodePointType encodePointType) {
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f6132j = str;
        this.f6118b = encodePointType;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setFillColor(int i8) {
        this.f6138p = i8;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setHoleClickable(boolean z7) {
        this.f6144v = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmPolygon bmPolygon = this.A;
        if (bmPolygon == null || this.f6122f == null) {
            return;
        }
        bmPolygon.b(z7);
        this.f6122f.b();
    }

    public void setHoleOption(HoleOptions holeOptions) {
        if (holeOptions == null) {
            return;
        }
        this.f6141s = holeOptions;
        this.f6140r = null;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setHoleOptions(List<HoleOptions> list) {
        this.f6140r = list;
        this.f6141s = null;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setLineBloomDirection(LineBloomDirection lineBloomDirection) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.C = lineBloomDirection;
            this.A.g(lineBloomDirection.ordinal());
            this.f6122f.b();
        }
    }

    public void setLineBloomType(LineBloomType lineBloomType) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.B = lineBloomType;
            this.A.h(lineBloomType.ordinal());
            this.f6122f.b();
        }
    }

    public void setPoints(List<LatLng> list) {
        if (list == null) {
            throw new IllegalArgumentException("BDMapSDKException: points list can not be null");
        }
        if (list.size() <= 2) {
            throw new IllegalArgumentException("BDMapSDKException: points count can not less than three");
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
        this.f6139q = list;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setStroke(Stroke stroke) {
        this.f6129g = stroke;
        this.f6130h = true;
        if (OverlayUtil.isOverlayUpgrade()) {
            b();
        } else {
            this.listener.d(this);
        }
    }

    public void setThinAlgorithm(ThinAndSmoothAlgorithm thinAndSmoothAlgorithm) {
        this.f6147y = thinAndSmoothAlgorithm;
        if (OverlayUtil.isOverlayUpgrade()) {
            this.A.i(this.f6147y.getValue());
            this.f6122f.b();
        }
    }

    public void setThinFactor(float f8) {
        if (f8 > 0.0f) {
            this.f6148z = f8;
        }
        if (OverlayUtil.isOverlayUpgrade()) {
            this.A.e(this.f6148z);
            this.f6122f.b();
        }
    }

    public void setThined(boolean z7) {
        this.f6146x = z7;
        this.listener.d(this);
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem toDrawItem() {
        BmPolygon bmPolygon = new BmPolygon();
        this.A = bmPolygon;
        bmPolygon.a(this);
        setDrawItem(this.A);
        super.toDrawItem();
        this.f6131i = new BmGeoElement();
        BmLineStyle bmLineStyle = new BmLineStyle();
        this.f6134l = bmLineStyle;
        if (this.f6129g != null) {
            bmLineStyle.a(r1.strokeWidth);
            this.f6134l.a(this.f6129g.color);
            if (this.f6142t) {
                setDottedBitmapResource(this.f6134l, this.f6135m);
                this.f6134l.c(5);
            } else {
                this.f6134l.b(0);
            }
            this.A.h(this.B.ordinal());
            this.A.g(this.C.ordinal());
            this.A.b(this.D);
            this.A.d(this.E);
            this.A.c(this.G);
            this.A.e(this.F);
        }
        this.f6131i.a(this.f6134l);
        ArrayList arrayList = new ArrayList();
        String str = this.f6132j;
        if (str == null || str.isEmpty() || this.f6118b == null) {
            List<LatLng> list = this.f6139q;
            if (list != null) {
                Overlay.mcLocation = CoordUtil.ll2mc(list.get(0));
                Iterator<LatLng> it = this.f6139q.iterator();
                while (it.hasNext()) {
                    GeoPoint ll2mc = CoordUtil.ll2mc(it.next());
                    arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
                }
            }
        } else {
            Iterator<LatLng> it2 = g.a().a(this.f6132j, this.f6118b.ordinal()).iterator();
            while (it2.hasNext()) {
                GeoPoint ll2mc2 = CoordUtil.ll2mc(it2.next());
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
            }
        }
        this.f6131i.a(arrayList);
        this.A.a(this.f6131i);
        List<HoleOptions> list2 = this.f6140r;
        if (list2 != null && list2.size() != 0) {
            List<List<com.baidu.platform.comapi.bmsdk.b>> holeInfo2BmGeo = Overlay.holeInfo2BmGeo(this.f6140r);
            for (int i8 = 0; i8 < holeInfo2BmGeo.size(); i8++) {
                BmGeoElement bmGeoElement = new BmGeoElement();
                bmGeoElement.a(holeInfo2BmGeo.get(i8));
                this.f6137o.add(bmGeoElement);
                this.A.b(bmGeoElement);
            }
        } else if (this.f6141s != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f6141s);
            List<com.baidu.platform.comapi.bmsdk.b> list3 = Overlay.holeInfo2BmGeo(arrayList2).get(0);
            BmGeoElement bmGeoElement2 = new BmGeoElement();
            this.f6136n = bmGeoElement2;
            bmGeoElement2.a(list3);
            this.A.b(this.f6136n);
        }
        BmSurfaceStyle bmSurfaceStyle = new BmSurfaceStyle();
        this.f6133k = bmSurfaceStyle;
        bmSurfaceStyle.a(this.f6138p);
        this.A.a(this.f6133k);
        this.A.f(4096);
        this.A.a(this.f6143u);
        this.A.b(this.f6144v);
        if (this.f6146x) {
            this.A.i(this.f6147y.getValue());
            float f8 = this.f6148z;
            if (f8 > 0.0f) {
                this.A.e(f8);
            }
        }
        return this.A;
    }

    @Override // com.baidu.mapapi.map.Overlay
    BmDrawItem b() {
        BmLineStyle bmLineStyle;
        if (this.f6131i == null || this.A == null) {
            return this.A;
        }
        super.b();
        this.A.c();
        if (this.f6129g != null && (bmLineStyle = this.f6134l) != null) {
            bmLineStyle.a(r0.strokeWidth);
            this.f6134l.a(this.f6129g.color);
            if (this.f6142t) {
                setDottedBitmapResource(this.f6134l, this.f6135m);
                this.f6134l.c(5);
            } else {
                this.f6134l.b(0);
            }
            this.f6131i.a(this.f6134l);
        }
        ArrayList arrayList = new ArrayList();
        String str = this.f6132j;
        if (str == null || str.isEmpty() || this.f6118b == null) {
            List<LatLng> list = this.f6139q;
            if (list != null) {
                Overlay.mcLocation = CoordUtil.ll2mc(list.get(0));
                Iterator<LatLng> it = this.f6139q.iterator();
                while (it.hasNext()) {
                    GeoPoint ll2mc = CoordUtil.ll2mc(it.next());
                    arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6()));
                }
                this.f6131i.a(arrayList);
            }
        } else {
            Iterator<LatLng> it2 = g.a().a(this.f6132j, this.f6118b.ordinal()).iterator();
            while (it2.hasNext()) {
                GeoPoint ll2mc2 = CoordUtil.ll2mc(it2.next());
                arrayList.add(new com.baidu.platform.comapi.bmsdk.b(ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6()));
            }
            this.f6131i.a(arrayList);
        }
        this.A.a(this.f6131i);
        List<HoleOptions> list2 = this.f6140r;
        if (list2 != null && list2.size() != 0) {
            List<List<com.baidu.platform.comapi.bmsdk.b>> holeInfo2BmGeo = Overlay.holeInfo2BmGeo(this.f6140r);
            for (int i8 = 0; i8 < holeInfo2BmGeo.size(); i8++) {
                BmGeoElement bmGeoElement = new BmGeoElement();
                bmGeoElement.a(holeInfo2BmGeo.get(i8));
                this.f6137o.add(bmGeoElement);
                this.A.b(bmGeoElement);
            }
        } else if (this.f6141s != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f6141s);
            List<com.baidu.platform.comapi.bmsdk.b> list3 = Overlay.holeInfo2BmGeo(arrayList2).get(0);
            BmGeoElement bmGeoElement2 = new BmGeoElement();
            this.f6136n = bmGeoElement2;
            bmGeoElement2.a(list3);
            this.A.b(this.f6136n);
        }
        BmSurfaceStyle bmSurfaceStyle = this.f6133k;
        if (bmSurfaceStyle != null) {
            bmSurfaceStyle.a(this.f6138p);
            this.A.a(this.f6133k);
        }
        this.A.f(4096);
        this.A.a(this.f6143u);
        this.A.b(this.f6144v);
        this.f6122f.b();
        return this.A;
    }
}
