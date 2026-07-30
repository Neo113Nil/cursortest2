package com.crrepa.band.my.training.utils;

import androidx.annotation.NonNull;
import com.crrepa.band.my.model.GpsLocation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class g {
    public abstract GpsLocation convert(double d8, double d9);

    public abstract List<GpsLocation> convert(@NonNull List<GpsLocation> list);

    public List<GpsLocation> covertToGpsLocation(List<com.crrepa.band.my.model.gps.GpsLocation> list) {
        ArrayList arrayList = new ArrayList();
        for (com.crrepa.band.my.model.gps.GpsLocation gpsLocation : list) {
            arrayList.add(new GpsLocation(gpsLocation.getLatitude(), gpsLocation.getLongitude()));
        }
        return arrayList;
    }

    public int getDistance(List<GpsLocation> list) {
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        while (true) {
            GpsLocation gpsLocation = null;
            for (GpsLocation gpsLocation2 : list) {
                if (!gpsLocation2.isInvalid()) {
                    if (gpsLocation2.isPause()) {
                        break;
                    }
                    if (gpsLocation != null) {
                        d8 += j.calculateLineDistance(gpsLocation.getLatitude(), gpsLocation.getLongitude(), gpsLocation2.getLatitude(), gpsLocation2.getLongitude());
                    }
                    gpsLocation = gpsLocation2;
                }
            }
            return (int) d8;
        }
    }

    public int getDistanceOverLoaded(List<com.crrepa.band.my.model.gps.GpsLocation> list) {
        return getDistance(covertToGpsLocation(list));
    }

    public boolean isGoogleMap() {
        return false;
    }
}
