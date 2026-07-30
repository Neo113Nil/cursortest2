package com.baidu.platform.comapi.map;

import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.Point;

/* loaded from: classes2.dex */
public interface Projection {
    GeoPoint fromPixels(int i8, int i9);

    float metersToEquatorPixels(float f8);

    Point toPixels(GeoPoint geoPoint, int i8, Point point);

    Point toPixels(GeoPoint geoPoint, Point point);

    Point world2Screen(float f8, float f9, float f10);
}
