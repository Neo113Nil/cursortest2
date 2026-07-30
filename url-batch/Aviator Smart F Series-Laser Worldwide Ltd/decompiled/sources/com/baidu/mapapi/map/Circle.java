package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmCircle;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGeoElement;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.baidu.platform.comapi.bmsdk.style.BmSurfaceStyle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class Circle extends Overlay {
    float B;
    float C;
    int D;
    float E;

    /* renamed from: g, reason: collision with root package name */
    LatLng f5727g;

    /* renamed from: h, reason: collision with root package name */
    int f5728h;

    /* renamed from: i, reason: collision with root package name */
    int f5729i;

    /* renamed from: j, reason: collision with root package name */
    Stroke f5730j;

    /* renamed from: k, reason: collision with root package name */
    boolean f5731k;

    /* renamed from: l, reason: collision with root package name */
    List<HoleOptions> f5732l;

    /* renamed from: m, reason: collision with root package name */
    HoleOptions f5733m;

    /* renamed from: n, reason: collision with root package name */
    boolean f5734n;

    /* renamed from: u, reason: collision with root package name */
    int f5741u;

    /* renamed from: v, reason: collision with root package name */
    int f5742v;

    /* renamed from: y, reason: collision with root package name */
    private BmCircle f5745y;

    /* renamed from: o, reason: collision with root package name */
    boolean f5735o = false;

    /* renamed from: p, reason: collision with root package name */
    boolean f5736p = false;

    /* renamed from: q, reason: collision with root package name */
    int f5737q = -1;

    /* renamed from: r, reason: collision with root package name */
    int f5738r = 1;

    /* renamed from: s, reason: collision with root package name */
    int f5739s = PolylineDottedLineType.DOTTED_LINE_SQUARE.ordinal();

    /* renamed from: t, reason: collision with root package name */
    BmSurfaceStyle f5740t = new BmSurfaceStyle();

    /* renamed from: w, reason: collision with root package name */
    float f5743w = 0.5f;

    /* renamed from: x, reason: collision with root package name */
    float f5744x = 0.2f;

    /* renamed from: z, reason: collision with root package name */
    LineBloomType f5746z = LineBloomType.NONE;
    LineBloomDirection A = LineBloomDirection.BloomAround;

    Circle() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.circle;
    }

    private void b(Bundle bundle) {
        int i8 = this.f5739s;
        BitmapDescriptor fromAsset = BitmapDescriptorFactory.fromAsset(i8 == 1 ? "CircleDashTexture.png" : i8 == 2 ? "lineDash_Rectangle.png" : "lineDashTexture.png");
        if (fromAsset != null) {
            bundle.putBundle("image_info", fromAsset.a());
        }
    }

    private void c() {
        BmCircle bmCircle = this.f5745y;
        if (bmCircle == null || this.f6122f == null) {
            return;
        }
        bmCircle.c(this.f5734n);
        if (this.f5734n) {
            this.f5745y.d();
            ArrayList arrayList = new ArrayList();
            this.f5745y.e(this.f5744x);
            this.f5745y.f(this.f5743w);
            arrayList.add(Integer.valueOf(this.f5741u));
            arrayList.add(Integer.valueOf(this.f5742v));
            this.f5745y.a(this.f5738r, arrayList);
        }
        this.f6122f.b();
    }

    private void d() {
        if (this.f5745y == null || this.f6122f == null) {
            return;
        }
        List<HoleOptions> list = this.f5732l;
        if (list != null && list.size() != 0) {
            this.f5745y.c();
            List<List<com.baidu.platform.comapi.bmsdk.b>> holeInfo2BmGeo = Overlay.holeInfo2BmGeo(this.f5732l);
            for (int i8 = 0; i8 < holeInfo2BmGeo.size(); i8++) {
                BmGeoElement bmGeoElement = new BmGeoElement();
                bmGeoElement.a(holeInfo2BmGeo.get(i8));
                this.f5745y.a(bmGeoElement);
            }
        } else if (this.f5733m != null) {
            this.f5745y.c();
            BmGeoElement bmGeoElement2 = new BmGeoElement();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f5733m);
            bmGeoElement2.a(Overlay.holeInfo2BmGeo(arrayList).get(0));
            this.f5745y.a(bmGeoElement2);
        }
        this.f6122f.b();
    }

    private void e() {
        if (this.f5730j != null) {
            BmLineStyle bmLineStyle = new BmLineStyle();
            bmLineStyle.a(this.f5730j.strokeWidth);
            bmLineStyle.a(this.f5730j.color);
            if (this.f5731k) {
                setDottedBitmapResource(bmLineStyle, this.f5739s);
                bmLineStyle.c(5);
            } else {
                bmLineStyle.b(0);
            }
            this.f5745y.a(bmLineStyle);
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5727g);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        if (this.f5734n) {
            bundle.putInt("m_isGradientCircle", 1);
            Overlay.b(this.f5741u, bundle);
            Overlay.c(this.f5742v, bundle);
            bundle.putFloat("m_color_weight", this.f5744x);
            bundle.putFloat("m_radius_weight", this.f5743w);
        } else {
            bundle.putInt("m_isGradientCircle", 0);
        }
        if (this.f5731k) {
            bundle.putDouble("dotted_stroke_location_x", ll2mc.getLongitudeE6());
            bundle.putDouble("dotted_stroke_location_y", ll2mc.getLatitudeE6());
            bundle.putInt("has_dotted_stroke", 1);
            b(bundle);
        } else {
            bundle.putInt("has_dotted_stroke", 0);
        }
        bundle.putInt("radius", CoordUtil.getMCDistanceByOneLatLngAndRadius(this.f5727g, this.f5729i));
        Overlay.d(this.f5728h, bundle);
        if (this.f5730j == null) {
            bundle.putInt("has_stroke", 0);
        } else {
            bundle.putInt("has_stroke", 1);
            bundle.putBundle("stroke", this.f5730j.a(new Bundle()));
        }
        List<HoleOptions> list = this.f5732l;
        if (list != null && list.size() != 0) {
            e(this.f5732l, bundle);
            bundle.putInt("holes_count", this.f5732l.size());
        } else if (this.f5733m != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f5733m);
            e(arrayList, bundle);
            bundle.putInt("holes_count", 1);
        } else {
            bundle.putInt("has_holes", 0);
        }
        bundle.putInt("isClickable", this.f5735o ? 1 : 0);
        bundle.putInt("isHoleClickable", this.f5736p ? 1 : 0);
        return bundle;
    }

    public LatLng getCenter() {
        return this.f5727g;
    }

    public int getCenterColor() {
        return this.f5741u;
    }

    public float getColorWeight() {
        return this.f5744x;
    }

    public int getDottedStrokeType() {
        return this.f5739s;
    }

    public int getFillColor() {
        return this.f5728h;
    }

    public int getHoleClickedIndex() {
        return this.f5737q;
    }

    public HoleOptions getHoleOption() {
        return this.f5733m;
    }

    public List<HoleOptions> getHoleOptions() {
        return this.f5732l;
    }

    public int getRadius() {
        return this.f5729i;
    }

    public float getRadiusWeight() {
        return this.f5743w;
    }

    public int getSideColor() {
        return this.f5742v;
    }

    public Stroke getStroke() {
        return this.f5730j;
    }

    public boolean isClickable() {
        return this.f5735o;
    }

    public boolean isDottedStroke() {
        return this.f5731k;
    }

    public boolean isIsGradientCircle() {
        return this.f5734n;
    }

    public void setBloomAlpha(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.B = f8;
            this.f5745y.b(f8);
            this.f6122f.b();
        }
    }

    public void setBloomBlurTimes(int i8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.D = i8;
            this.f5745y.e(i8);
            this.f6122f.b();
        }
    }

    public void setBloomGradientASpeed(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.E = f8;
            this.f5745y.c(f8);
            this.f6122f.b();
        }
    }

    public void setBloomWidth(float f8) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.C = f8;
            this.f5745y.d(f8);
            this.f6122f.b();
        }
    }

    public void setCenter(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: circle center can not be null");
        }
        this.f5727g = latLng;
        Overlay.mcLocation = CoordUtil.ll2mc(latLng);
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmCircle bmCircle = this.f5745y;
        if (bmCircle == null || this.f6122f == null) {
            return;
        }
        bmCircle.a(new com.baidu.platform.comapi.bmsdk.b(Overlay.mcLocation.getLongitudeE6(), Overlay.mcLocation.getLatitudeE6()));
        this.f6122f.b();
    }

    public void setCenterColor(int i8) {
        this.f5741u = i8;
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
        } else {
            this.listener.d(this);
        }
    }

    public void setClickable(boolean z7) {
        this.f5735o = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmCircle bmCircle = this.f5745y;
        if (bmCircle == null || this.f6122f == null) {
            return;
        }
        bmCircle.a(z7);
        this.f6122f.b();
    }

    public void setColorWeight(float f8) {
        if (f8 <= 0.0f || f8 >= 1.0f) {
            return;
        }
        this.f5744x = f8;
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
        } else {
            this.listener.d(this);
        }
    }

    public void setDottedStroke(boolean z7) {
        this.f5731k = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f5745y == null || this.f6122f == null || this.f5740t == null) {
                return;
            }
            e();
            this.f6122f.b();
        }
    }

    public void setDottedStrokeType(CircleDottedStrokeType circleDottedStrokeType) {
        this.f5739s = circleDottedStrokeType.ordinal();
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f5745y == null || this.f6122f == null || this.f5740t == null) {
                return;
            }
            e();
            this.f6122f.b();
        }
    }

    public void setFillColor(int i8) {
        BmSurfaceStyle bmSurfaceStyle;
        this.f5728h = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5745y == null || this.f6122f == null || (bmSurfaceStyle = this.f5740t) == null) {
            return;
        }
        bmSurfaceStyle.a(this.f5728h);
        this.f5745y.a(this.f5740t);
        this.f6122f.b();
    }

    public void setHoleClickable(boolean z7) {
        this.f5736p = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmCircle bmCircle = this.f5745y;
        if (bmCircle == null || this.f6122f == null) {
            return;
        }
        bmCircle.b(z7);
        this.f6122f.b();
    }

    public void setHoleOption(HoleOptions holeOptions) {
        if (holeOptions == null) {
            return;
        }
        this.f5733m = holeOptions;
        this.f5732l = null;
        if (OverlayUtil.isOverlayUpgrade()) {
            d();
        } else {
            this.listener.d(this);
        }
    }

    public void setHoleOptions(List<HoleOptions> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f5732l = list;
        this.f5733m = null;
        if (OverlayUtil.isOverlayUpgrade()) {
            d();
        } else {
            this.listener.d(this);
        }
    }

    public void setIsGradientCircle(boolean z7) {
        this.f5734n = z7;
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
        } else {
            this.listener.d(this);
        }
    }

    public void setLineBloomDirection(LineBloomDirection lineBloomDirection) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.A = lineBloomDirection;
            this.f5745y.f(lineBloomDirection.ordinal());
            this.f6122f.b();
        }
    }

    public void setLineBloomType(LineBloomType lineBloomType) {
        if (OverlayUtil.isOverlayUpgrade()) {
            this.f5746z = lineBloomType;
            this.f5745y.g(lineBloomType.ordinal());
            this.f6122f.b();
        }
    }

    public void setRadius(int i8) {
        this.f5729i = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5745y == null || this.f6122f == null || this.f5740t == null) {
            return;
        }
        this.f5745y.a(CoordUtil.getMCDistanceByOneLatLngAndRadius(this.f5727g, this.f5729i));
        this.f6122f.b();
    }

    public void setRadiusWeight(float f8) {
        if (f8 <= 0.0f || f8 >= 1.0f) {
            return;
        }
        this.f5743w = f8;
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
        } else {
            this.listener.d(this);
        }
    }

    public void setSideColor(int i8) {
        this.f5742v = i8;
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
        } else {
            this.listener.d(this);
        }
    }

    public void setStroke(Stroke stroke) {
        this.f5730j = stroke;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
        } else {
            if (this.f5745y == null || this.f6122f == null || this.f5740t == null) {
                return;
            }
            e();
            this.f6122f.b();
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem toDrawItem() {
        BmCircle bmCircle = new BmCircle();
        this.f5745y = bmCircle;
        bmCircle.a(this);
        setDrawItem(this.f5745y);
        super.toDrawItem();
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5727g);
        Overlay.mcLocation = ll2mc;
        this.f5745y.a(new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), Overlay.mcLocation.getLatitudeE6()));
        this.f5745y.a(CoordUtil.getMCDistanceByOneLatLngAndRadius(this.f5727g, this.f5729i));
        if (this.f5730j != null) {
            BmLineStyle bmLineStyle = new BmLineStyle();
            bmLineStyle.a(this.f5730j.strokeWidth);
            bmLineStyle.a(this.f5730j.color);
            if (this.f5731k) {
                setDottedBitmapResource(bmLineStyle, this.f5739s);
                bmLineStyle.c(5);
            } else {
                bmLineStyle.b(0);
            }
            this.f5745y.a(bmLineStyle);
            this.f5745y.b(this.B);
            this.f5745y.d(this.C);
            this.f5745y.g(this.f5746z.ordinal());
            this.f5745y.c(this.E);
            this.f5745y.f(this.A.ordinal());
        }
        this.f5740t.a(this.f5728h);
        this.f5745y.a(this.f5740t);
        List<HoleOptions> list = this.f5732l;
        if (list != null && list.size() != 0) {
            List<List<com.baidu.platform.comapi.bmsdk.b>> holeInfo2BmGeo = Overlay.holeInfo2BmGeo(this.f5732l);
            for (int i8 = 0; i8 < holeInfo2BmGeo.size(); i8++) {
                BmGeoElement bmGeoElement = new BmGeoElement();
                bmGeoElement.a(holeInfo2BmGeo.get(i8));
                this.f5745y.a(bmGeoElement);
            }
        } else if (this.f5733m != null) {
            BmGeoElement bmGeoElement2 = new BmGeoElement();
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f5733m);
            bmGeoElement2.a(Overlay.holeInfo2BmGeo(arrayList).get(0));
            this.f5745y.a(bmGeoElement2);
        }
        this.f5745y.b(this.f5736p);
        this.f5745y.a(this.f5735o);
        this.f5745y.c(this.f5734n);
        if (this.f5734n) {
            ArrayList arrayList2 = new ArrayList();
            this.f5745y.e(this.f5744x);
            this.f5745y.f(this.f5743w);
            arrayList2.add(Integer.valueOf(this.f5741u));
            arrayList2.add(Integer.valueOf(this.f5742v));
            this.f5745y.a(this.f5738r, arrayList2);
        }
        return this.f5745y;
    }

    private void e(List<HoleOptions> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        boolean b8 = Overlay.b(list, bundle2);
        bundle.putInt("has_holes", b8 ? 1 : 0);
        if (b8) {
            bundle.putBundle("holes", bundle2);
        }
    }
}
