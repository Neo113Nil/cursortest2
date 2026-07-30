package com.crrepa.band.my.training.map.google;

import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.training.utils.g;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends g {
    @Override // com.crrepa.band.my.training.utils.g
    public List<GpsLocation> convert(List<GpsLocation> list) {
        return list;
    }

    @Override // com.crrepa.band.my.training.utils.g
    public boolean isGoogleMap() {
        return true;
    }

    @Override // com.crrepa.band.my.training.utils.g
    public GpsLocation convert(double d8, double d9) {
        return new GpsLocation(d8, d9);
    }
}
