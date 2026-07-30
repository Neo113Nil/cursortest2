package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

/* loaded from: classes4.dex */
public class KmlPoint extends Point {
    private final Double mAltitude;

    public KmlPoint(LatLng latLng) {
        this(latLng, null);
    }

    public Double getAltitude() {
        return this.mAltitude;
    }

    public KmlPoint(LatLng latLng, Double d8) {
        super(latLng);
        this.mAltitude = d8;
    }
}
