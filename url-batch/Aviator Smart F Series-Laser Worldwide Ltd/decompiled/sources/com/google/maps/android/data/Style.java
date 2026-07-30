package com.google.maps.android.data;

import android.util.Log;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* loaded from: classes4.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected MarkerOptions mMarkerOptions = new MarkerOptions();
    protected PolygonOptions mPolygonOptions;
    protected PolylineOptions mPolylineOptions;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.clickable(true);
    }

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setLineStringWidth(float f8) {
        this.mPolylineOptions.width(f8);
    }

    public void setMarkerHotSpot(float f8, float f9, String str, String str2) {
        if (!str.equals("fraction")) {
            Log.w(LOG_TAG, "Hotspot xUnits other than \"fraction\" are not supported.");
            f8 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            Log.w(LOG_TAG, "Hotspot yUnits other than \"fraction\" are not supported.");
            f9 = 1.0f;
        }
        this.mMarkerOptions.anchor(f8, f9);
    }

    public void setMarkerRotation(float f8) {
        this.mMarkerOptions.rotation(f8);
    }

    public void setPolygonFillColor(int i8) {
        this.mPolygonOptions.fillColor(i8);
    }

    public void setPolygonStrokeWidth(float f8) {
        this.mPolygonOptions.strokeWidth(f8);
    }
}
