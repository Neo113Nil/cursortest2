package com.baidu.mapapi.map;

import android.os.Bundle;
import com.arthenica.ffmpegkit.x;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmArc;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.style.BmLineStyle;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class Arc extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    int f5505g;

    /* renamed from: h, reason: collision with root package name */
    int f5506h;

    /* renamed from: i, reason: collision with root package name */
    LatLng f5507i;

    /* renamed from: j, reason: collision with root package name */
    LatLng f5508j;

    /* renamed from: k, reason: collision with root package name */
    LatLng f5509k;

    /* renamed from: l, reason: collision with root package name */
    boolean f5510l = true;

    /* renamed from: m, reason: collision with root package name */
    double f5511m;

    /* renamed from: n, reason: collision with root package name */
    double f5512n;

    /* renamed from: o, reason: collision with root package name */
    double f5513o;

    /* renamed from: p, reason: collision with root package name */
    boolean f5514p;

    /* renamed from: q, reason: collision with root package name */
    com.baidu.platform.comapi.bmsdk.b f5515q;

    /* renamed from: r, reason: collision with root package name */
    LatLng f5516r;

    /* renamed from: s, reason: collision with root package name */
    private BmArc f5517s;

    /* renamed from: t, reason: collision with root package name */
    BmLineStyle f5518t;

    Arc() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.arc;
    }

    private void a(double d8, double d9, double d10) {
        if (d8 < d9) {
            if (d8 >= d10) {
                if (d8 <= d10 || d9 < d10 || d9 <= d10) {
                    return;
                }
                this.f5512n = d8;
                this.f5513o = d10 + 6.283185307179586d;
                this.f5514p = false;
                return;
            }
            if (d9 < d10) {
                this.f5512n = d8;
                this.f5513o = d10;
                this.f5514p = false;
                return;
            } else {
                if (d9 > d10) {
                    this.f5512n = d10;
                    this.f5513o = d8 + 6.283185307179586d;
                    this.f5514p = false;
                    return;
                }
                return;
            }
        }
        if (d8 > d9) {
            if (d8 < d10) {
                if (d9 < d10) {
                    this.f5512n = d10;
                    this.f5513o = d8 + 6.283185307179586d;
                    this.f5514p = false;
                    return;
                }
                return;
            }
            if (d8 > d10) {
                if (d9 < d10) {
                    this.f5512n = d8;
                    this.f5513o = d10 + 6.283185307179586d;
                    this.f5514p = false;
                } else if (d9 > d10) {
                    this.f5512n = d10;
                    this.f5513o = d8;
                    this.f5514p = false;
                }
            }
        }
    }

    private double b(GeoPoint geoPoint, GeoPoint geoPoint2) {
        double longitudeE6 = geoPoint.getLongitudeE6();
        double latitudeE6 = geoPoint.getLatitudeE6();
        double longitudeE62 = longitudeE6 - geoPoint2.getLongitudeE6();
        double latitudeE62 = latitudeE6 - geoPoint2.getLatitudeE6();
        return Math.sqrt((longitudeE62 * longitudeE62) + (latitudeE62 * latitudeE62));
    }

    private void c() {
        LatLng latLng = this.f5507i;
        if (latLng == null && this.f5508j == null && this.f5509k == null) {
            return;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f5508j);
        GeoPoint ll2mc3 = CoordUtil.ll2mc(this.f5509k);
        GeoPoint a8 = a(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6(), ll2mc2.getLongitudeE6(), ll2mc2.getLatitudeE6(), ll2mc3.getLongitudeE6(), ll2mc3.getLatitudeE6());
        this.f5515q = new com.baidu.platform.comapi.bmsdk.b(a8.getLongitudeE6(), a8.getLatitudeE6());
        this.f5511m = b(ll2mc, a8);
        a(a(ll2mc, a8), a(ll2mc2, a8), a(ll2mc3, a8));
    }

    public BmArc getBmArc() {
        return this.f5517s;
    }

    public int getColor() {
        return this.f5505g;
    }

    public LatLng getEndPoint() {
        return this.f5509k;
    }

    public LatLng getMiddlePoint() {
        return this.f5508j;
    }

    public LatLng getStartPoint() {
        return this.f5507i;
    }

    public int getWidth() {
        return this.f5506h;
    }

    public boolean isClickable() {
        return this.f5510l;
    }

    public void setClickable(boolean z7) {
        this.f5510l = z7;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        BmArc bmArc = this.f5517s;
        if (bmArc == null || this.f6122f == null || this.f5518t == null) {
            return;
        }
        bmArc.a(z7);
        this.f6122f.b();
    }

    public void setColor(int i8) {
        BmLineStyle bmLineStyle;
        this.f5505g = i8;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5517s == null || this.f6122f == null || (bmLineStyle = this.f5518t) == null) {
            return;
        }
        bmLineStyle.a(this.f5505g);
        this.f5517s.a(this.f5518t);
        this.f6122f.b();
    }

    public void setPoints(LatLng latLng, LatLng latLng2, LatLng latLng3) {
        BmLineStyle bmLineStyle;
        if (latLng == null || latLng2 == null || latLng3 == null) {
            throw new IllegalArgumentException("BDMapSDKException:start and middle and end points can not be null");
        }
        if (latLng == latLng2 || latLng == latLng3 || latLng2 == latLng3) {
            throw new IllegalArgumentException("BDMapSDKException: start and middle and end points can not be same");
        }
        this.f5507i = latLng;
        this.f5508j = latLng2;
        this.f5509k = latLng3;
        if (!OverlayUtil.isOverlayUpgrade()) {
            this.listener.d(this);
            return;
        }
        if (this.f5517s == null || this.f6122f == null || (bmLineStyle = this.f5518t) == null) {
            return;
        }
        bmLineStyle.a(this.f5505g);
        c();
        this.f5517s.a(this.f5515q);
        this.f5517s.c(this.f5514p);
        this.f5517s.a(this.f5513o);
        this.f5517s.c(this.f5512n);
        this.f5517s.b(this.f5511m);
        this.f6122f.b();
    }

    public void setWidth(int i8) {
        BmLineStyle bmLineStyle;
        if (i8 > 0) {
            this.f5506h = i8;
            if (!OverlayUtil.isOverlayUpgrade()) {
                this.listener.d(this);
                return;
            }
            if (this.f5517s == null || this.f6122f == null || (bmLineStyle = this.f5518t) == null) {
                return;
            }
            bmLineStyle.a(i8);
            this.f5517s.a(this.f5518t);
            this.f6122f.b();
        }
    }

    @Override // com.baidu.mapapi.map.Overlay
    public BmDrawItem toDrawItem() {
        BmArc bmArc = new BmArc();
        this.f5517s = bmArc;
        bmArc.a(this);
        setDrawItem(this.f5517s);
        super.toDrawItem();
        BmLineStyle bmLineStyle = new BmLineStyle();
        this.f5518t = bmLineStyle;
        bmLineStyle.a(this.f5506h);
        this.f5518t.a(this.f5505g);
        this.f5517s.a(this.f5518t);
        if (this.f5507i == null || this.f5508j == null || this.f5509k == null) {
            GeoPoint ll2mc = CoordUtil.ll2mc(this.f5516r);
            if (ll2mc != null) {
                this.f5515q = new com.baidu.platform.comapi.bmsdk.b(ll2mc.getLongitudeE6(), ll2mc.getLatitudeE6());
            }
        } else {
            c();
        }
        this.f5517s.a(this.f5515q);
        this.f5517s.c(this.f5514p);
        this.f5517s.a(this.f5513o);
        this.f5517s.c(this.f5512n);
        this.f5517s.b(this.f5511m);
        this.f5517s.a(this.f5510l);
        return this.f5517s;
    }

    private double a(GeoPoint geoPoint, GeoPoint geoPoint2) {
        double latitudeE6 = geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6();
        double longitudeE6 = geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6();
        if (longitudeE6 == i.DOUBLE_EPSILON) {
            longitudeE6 = 1.0E-5d;
        }
        if (latitudeE6 == i.DOUBLE_EPSILON) {
            latitudeE6 = 1.0E-5d;
        }
        double atan = Math.atan(latitudeE6 / longitudeE6);
        if (longitudeE6 <= i.DOUBLE_EPSILON || latitudeE6 <= i.DOUBLE_EPSILON) {
            return atan + (((longitudeE6 >= i.DOUBLE_EPSILON || latitudeE6 <= i.DOUBLE_EPSILON) && (longitudeE6 >= i.DOUBLE_EPSILON || latitudeE6 >= i.DOUBLE_EPSILON)) ? 6.283185307179586d : 3.141592653589793d);
        }
        return atan * 1.0d;
    }

    private GeoPoint a(double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14;
        double d15 = (d8 + d10) / 2.0d;
        double d16 = (d9 + d11) / 2.0d;
        double d17 = (d10 + d12) / 2.0d;
        double d18 = (d11 + d13) / 2.0d;
        double d19 = d11 - d9;
        if (d19 == i.DOUBLE_EPSILON) {
            double d20 = d13 - d11;
            if (d20 == i.DOUBLE_EPSILON) {
                return null;
            }
            d14 = ((((d12 - d10) * (-1.0d)) / d20) * (d15 - d17)) + d18;
        } else {
            double d21 = ((d10 - d8) * (-1.0d)) / d19;
            double d22 = d13 - d11;
            if (d22 == i.DOUBLE_EPSILON) {
                d14 = d16 + (d21 * (d17 - d15));
                d15 = d17;
            } else {
                double d23 = ((d12 - d10) * (-1.0d)) / d22;
                if (d21 == d23) {
                    return null;
                }
                double d24 = (((d18 - d16) + (d21 * d15)) - (d17 * d23)) / (d21 - d23);
                d14 = d16 + (d21 * (d24 - d15));
                d15 = d24;
            }
        }
        return new GeoPoint(d14, d15);
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(this.f5507i);
        arrayList.add(this.f5508j);
        arrayList.add(this.f5509k);
        GeoPoint ll2mc = CoordUtil.ll2mc((LatLng) arrayList.get(0));
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt(x.KEY_WIDTH, this.f5506h);
        Overlay.c(arrayList, bundle);
        Overlay.d(this.f5505g, bundle);
        bundle.putInt("isClickable", this.f5510l ? 1 : 0);
        return bundle;
    }
}
