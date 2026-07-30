package com.baidu.mapapi.map;

import android.graphics.Point;
import android.util.Log;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public final class MapStatusUpdate {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5957a = "MapStatusUpdate";

    /* renamed from: b, reason: collision with root package name */
    private int f5958b;

    /* renamed from: c, reason: collision with root package name */
    MapStatus f5959c;

    /* renamed from: d, reason: collision with root package name */
    LatLng f5960d;

    /* renamed from: e, reason: collision with root package name */
    LatLngBounds f5961e;

    /* renamed from: f, reason: collision with root package name */
    int f5962f;

    /* renamed from: g, reason: collision with root package name */
    int f5963g;

    /* renamed from: h, reason: collision with root package name */
    float f5964h;

    /* renamed from: i, reason: collision with root package name */
    int f5965i;

    /* renamed from: j, reason: collision with root package name */
    int f5966j;

    /* renamed from: k, reason: collision with root package name */
    float f5967k;

    /* renamed from: l, reason: collision with root package name */
    Point f5968l;

    /* renamed from: m, reason: collision with root package name */
    int f5969m = 0;

    /* renamed from: n, reason: collision with root package name */
    int f5970n = 0;

    /* renamed from: o, reason: collision with root package name */
    int f5971o = 0;

    /* renamed from: p, reason: collision with root package name */
    int f5972p = 0;

    private MapStatusUpdate() {
    }

    MapStatus a(com.baidu.mapsdkplatform.comapi.map.b bVar, MapStatus mapStatus) {
        Point point;
        if (bVar == null || mapStatus == null) {
            return null;
        }
        Point point2 = mapStatus.targetScreen;
        Point point3 = bVar.X;
        if (point3 != null) {
            if (point2 != null && (point = bVar.W) != null && (point.x != point3.x || point.y != point3.y)) {
                point2 = point;
            }
            bVar.X = null;
        } else {
            bVar.W = point2;
        }
        switch (this.f5958b) {
            case 1:
                MapStatus mapStatus2 = this.f5959c;
                if (mapStatus2.targetScreen == null) {
                    MapStatus mapStatus3 = this.f5959c;
                    break;
                }
                break;
            case 3:
                LatLngBounds latLngBounds = this.f5961e;
                if (latLngBounds != null) {
                    GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.southwest);
                    GeoPoint ll2mc2 = CoordUtil.ll2mc(this.f5961e.northeast);
                    double longitudeE6 = ll2mc.getLongitudeE6();
                    double latitudeE6 = ll2mc2.getLatitudeE6();
                    double longitudeE62 = ll2mc2.getLongitudeE6();
                    int latitudeE62 = (int) ll2mc.getLatitudeE6();
                    WinRound winRound = mapStatus.f5948c.f8157j;
                    break;
                }
                break;
            case 5:
                GeoPoint a8 = bVar.a((bVar.D() / 2) + this.f5965i, (bVar.q() / 2) + this.f5966j);
                break;
            case 6:
                break;
            case 7:
                Point point4 = this.f5968l;
                break;
            case 8:
                break;
            case 9:
                LatLngBounds latLngBounds2 = this.f5961e;
                if (latLngBounds2 != null) {
                    GeoPoint ll2mc3 = CoordUtil.ll2mc(latLngBounds2.southwest);
                    GeoPoint ll2mc4 = CoordUtil.ll2mc(this.f5961e.northeast);
                    break;
                }
                break;
            case 10:
                if (this.f5961e != null) {
                    int D = (bVar.D() - this.f5969m) - this.f5971o;
                    if (D < 0) {
                        D = bVar.D();
                        Log.e(f5957a, "Bound paddingLeft or paddingRight too larger, please check");
                    }
                    int q8 = (bVar.q() - this.f5970n) - this.f5972p;
                    if (q8 < 0) {
                        q8 = bVar.q();
                        Log.e(f5957a, "Bound paddingTop or paddingBottom too larger, please check");
                    }
                    float a9 = a(this.f5961e, bVar, D, q8);
                    LatLng a10 = a(this.f5961e, bVar, a(a9));
                    if (a10 != null) {
                        bVar.X = new Point(this.f5969m + (D / 2), this.f5970n + (q8 / 2));
                        boolean a11 = a(this.f5961e, bVar);
                        boolean a12 = a(this.f5969m, this.f5970n, this.f5971o, this.f5972p, bVar);
                        if (!a11 && !a12) {
                            if (bVar.r() != null) {
                                break;
                            }
                        } else {
                            MapStatus mapStatus4 = new MapStatus(0.0f, a10, mapStatus.overlook, a9, bVar.X, null);
                            bVar.a(a(mapStatus4));
                            break;
                        }
                    } else {
                        Log.e(f5957a, "Bound center error");
                        break;
                    }
                }
                break;
            case 11:
                if (this.f5961e != null) {
                    int D2 = (bVar.D() - this.f5969m) - this.f5971o;
                    if (D2 < 0) {
                        D2 = bVar.D();
                        Log.e(f5957a, "Bound paddingLeft or paddingRight too larger, please check");
                    }
                    int q9 = (bVar.q() - this.f5970n) - this.f5972p;
                    if (q9 < 0) {
                        q9 = bVar.q();
                        Log.e(f5957a, "Bound paddingTop or paddingBottom too larger, please check");
                    }
                    GeoPoint ll2mc5 = CoordUtil.ll2mc(this.f5961e.southwest);
                    GeoPoint ll2mc6 = CoordUtil.ll2mc(this.f5961e.northeast);
                    float a13 = bVar.a((int) ll2mc5.getLongitudeE6(), (int) ll2mc6.getLatitudeE6(), (int) ll2mc6.getLongitudeE6(), (int) ll2mc5.getLatitudeE6(), D2, q9);
                    bVar.X = new Point(this.f5969m + (D2 / 2), this.f5970n + (q9 / 2));
                    break;
                }
                break;
        }
        return null;
    }

    MapStatusUpdate(int i8) {
        this.f5958b = i8;
    }

    private float a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar, int i8, int i9) {
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.southwest);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLngBounds.northeast);
        int longitudeE6 = (int) ll2mc.getLongitudeE6();
        int latitudeE6 = (int) ll2mc.getLatitudeE6();
        return bVar.a(longitudeE6, (int) ll2mc2.getLatitudeE6(), (int) ll2mc2.getLongitudeE6(), latitudeE6, i8, i9);
    }

    private boolean a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar) {
        MapStatusUpdate r8 = bVar.r();
        if (r8 == null) {
            return true;
        }
        LatLng latLng = latLngBounds.southwest;
        double d8 = latLng.latitude;
        double d9 = latLng.longitude;
        LatLng latLng2 = latLngBounds.northeast;
        double d10 = latLng2.latitude;
        double d11 = latLng2.longitude;
        LatLngBounds latLngBounds2 = r8.f5961e;
        LatLng latLng3 = latLngBounds2.southwest;
        double d12 = latLng3.latitude;
        double d13 = latLng3.longitude;
        LatLng latLng4 = latLngBounds2.northeast;
        return (d8 == d12 && d9 == d13 && d10 == latLng4.latitude && d11 == latLng4.longitude) ? false : true;
    }

    private boolean a(int i8, int i9, int i10, int i11, com.baidu.mapsdkplatform.comapi.map.b bVar) {
        MapStatusUpdate r8 = bVar.r();
        return (r8 != null && i8 == r8.f5969m && i9 == r8.f5970n && i10 == r8.f5971o && i11 == r8.f5972p) ? false : true;
    }

    private LatLng a(LatLngBounds latLngBounds, com.baidu.mapsdkplatform.comapi.map.b bVar, float f8) {
        double longitudeE6;
        double latitudeE6;
        double latitudeE62;
        if (latLngBounds == null || bVar == null) {
            return null;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLngBounds.getCenter());
        int i8 = this.f5969m;
        double d8 = i8 * f8;
        int i9 = this.f5971o;
        double d9 = i9 * f8;
        double d10 = this.f5970n * f8;
        double d11 = this.f5972p * f8;
        if (i8 > i9) {
            longitudeE6 = ll2mc.getLongitudeE6() - ((d8 - d9) / 2.0d);
        } else if (i8 < i9) {
            longitudeE6 = ll2mc.getLongitudeE6() + ((d9 - d8) / 2.0d);
        } else {
            longitudeE6 = ll2mc.getLongitudeE6();
        }
        int i10 = this.f5970n;
        int i11 = this.f5972p;
        if (i10 < i11) {
            latitudeE62 = ll2mc.getLatitudeE6() - ((d11 - d10) / 2.0d);
        } else if (i10 > i11) {
            latitudeE62 = ll2mc.getLatitudeE6();
            d10 -= d11;
        } else {
            latitudeE6 = ll2mc.getLatitudeE6();
            return CoordUtil.mc2ll(new GeoPoint(latitudeE6, longitudeE6));
        }
        latitudeE6 = latitudeE62 + (d10 / 2.0d);
        return CoordUtil.mc2ll(new GeoPoint(latitudeE6, longitudeE6));
    }

    private MapStatusUpdate a(MapStatus mapStatus) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate();
        synchronized (this) {
            mapStatusUpdate.f5959c = mapStatus;
            mapStatusUpdate.f5961e = this.f5961e;
            mapStatusUpdate.f5969m = this.f5969m;
            mapStatusUpdate.f5970n = this.f5970n;
            mapStatusUpdate.f5971o = this.f5971o;
            mapStatusUpdate.f5972p = this.f5972p;
        }
        return mapStatusUpdate;
    }

    private float a(float f8) {
        return (float) (Math.pow(2.0d, 18.0f - f8) / SysOSUtil.getDensityDpi());
    }
}
