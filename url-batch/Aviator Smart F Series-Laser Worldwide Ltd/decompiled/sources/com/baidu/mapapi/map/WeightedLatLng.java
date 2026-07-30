package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.map.e;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class WeightedLatLng extends e.a {
    public static final double DEFAULT_INTENSITY = 1.0d;

    /* renamed from: a, reason: collision with root package name */
    private Point f6467a;
    public final double intensity;
    public final LatLng mLatLng;

    public WeightedLatLng(LatLng latLng, double d8) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: latLng can not be null");
        }
        this.mLatLng = latLng;
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        this.f6467a = new Point((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6());
        if (d8 > i.DOUBLE_EPSILON) {
            this.intensity = d8;
        } else {
            this.intensity = 1.0d;
        }
    }

    public double getIntensity() {
        return this.intensity;
    }

    @Override // com.baidu.mapapi.map.e.a
    public Point getPoint() {
        return this.f6467a;
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }
}
