package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class MapStatusUpdateFactory {
    MapStatusUpdateFactory() {
    }

    public static MapStatusUpdate newLatLng(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(2);
        mapStatusUpdate.f5960d = latLng;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newLatLngBounds(LatLngBounds latLngBounds) {
        if (latLngBounds == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(3);
        mapStatusUpdate.f5961e = latLngBounds;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newLatLngZoom(LatLng latLng, float f8) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(4);
        if (latLng == null) {
            return null;
        }
        mapStatusUpdate.f5960d = latLng;
        mapStatusUpdate.f5964h = f8;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newMapStatus(MapStatus mapStatus) {
        if (mapStatus == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(1);
        mapStatusUpdate.f5959c = mapStatus;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate scrollBy(int i8, int i9) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(5);
        mapStatusUpdate.f5965i = i8;
        mapStatusUpdate.f5966j = i9;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate zoomBy(float f8) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(6);
        mapStatusUpdate.f5967k = f8;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate zoomIn() {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(6);
        mapStatusUpdate.f5967k = 1.0f;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate zoomOut() {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(6);
        mapStatusUpdate.f5967k = -1.0f;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate zoomTo(float f8) {
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(8);
        mapStatusUpdate.f5964h = f8;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newLatLngBounds(LatLngBounds latLngBounds, int i8, int i9) {
        if (latLngBounds == null || i8 <= 0 || i9 <= 0) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(9);
        mapStatusUpdate.f5961e = latLngBounds;
        mapStatusUpdate.f5962f = i8;
        mapStatusUpdate.f5963g = i9;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newLatLngZoom(LatLngBounds latLngBounds, int i8, int i9, int i10, int i11) {
        if (latLngBounds == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(11);
        mapStatusUpdate.f5961e = latLngBounds;
        mapStatusUpdate.f5969m = i8;
        mapStatusUpdate.f5970n = i9;
        mapStatusUpdate.f5971o = i10;
        mapStatusUpdate.f5972p = i11;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate zoomBy(float f8, Point point) {
        if (point == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(7);
        mapStatusUpdate.f5967k = f8;
        mapStatusUpdate.f5968l = point;
        return mapStatusUpdate;
    }

    public static MapStatusUpdate newLatLngBounds(LatLngBounds latLngBounds, int i8, int i9, int i10, int i11) {
        if (latLngBounds == null) {
            return null;
        }
        MapStatusUpdate mapStatusUpdate = new MapStatusUpdate(10);
        mapStatusUpdate.f5961e = latLngBounds;
        mapStatusUpdate.f5969m = i8;
        mapStatusUpdate.f5970n = i9;
        mapStatusUpdate.f5971o = i10;
        mapStatusUpdate.f5972p = i11;
        return mapStatusUpdate;
    }
}
