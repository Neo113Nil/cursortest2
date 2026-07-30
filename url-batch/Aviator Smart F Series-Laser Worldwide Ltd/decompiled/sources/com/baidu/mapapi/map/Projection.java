package com.baidu.mapapi.map;

import android.graphics.Point;
import android.graphics.PointF;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public final class Projection {

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.b f6243a;

    Projection(com.baidu.mapsdkplatform.comapi.map.b bVar) {
        this.f6243a = bVar;
    }

    public LatLng fromScreenLocation(Point point) {
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        if (point == null || (bVar = this.f6243a) == null) {
            return null;
        }
        return CoordUtil.mc2ll(bVar.a(point.x, point.y));
    }

    public Point geoPoint3toScreenLocation(LatLng latLng, int i8) {
        if (latLng == null || this.f6243a == null || i8 < 0) {
            return null;
        }
        return this.f6243a.a(CoordUtil.ll2mc(latLng), i8);
    }

    public float metersToEquatorPixels(float f8) {
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        return (float) (f8 / this.f6243a.E());
    }

    public PointF toOpenGLLocation(LatLng latLng, MapStatus mapStatus) {
        if (latLng == null || mapStatus == null) {
            return null;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        s sVar = mapStatus.f5948c;
        return new PointF((float) (ll2mc.getLongitudeE6() - sVar.f8151d), (float) (ll2mc.getLatitudeE6() - sVar.f8152e));
    }

    public PointF toOpenGLNormalization(LatLng latLng, MapStatus mapStatus) {
        if (latLng == null || mapStatus == null) {
            return null;
        }
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        s.a aVar = mapStatus.f5948c.f8158k;
        return new PointF((float) ((((ll2mc.getLongitudeE6() - aVar.f8167a) * 2.0d) / Math.abs(aVar.f8168b - aVar.f8167a)) - 1.0d), (float) ((((ll2mc.getLatitudeE6() - aVar.f8170d) * 2.0d) / Math.abs(aVar.f8169c - aVar.f8170d)) - 1.0d));
    }

    public Point toScreenLocation(LatLng latLng) {
        if (latLng == null || this.f6243a == null) {
            return null;
        }
        return this.f6243a.a(CoordUtil.ll2mc(latLng));
    }
}
