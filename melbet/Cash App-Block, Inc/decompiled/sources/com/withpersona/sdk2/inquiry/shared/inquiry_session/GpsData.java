package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import android.location.Location;

/* loaded from: classes9.dex */
public final class GpsData {
    public final Location location;
    public final GpsPrecisionAuthorization precision;

    public GpsData(Location location, GpsPrecisionAuthorization gpsPrecisionAuthorization) {
        this.location = location;
        this.precision = gpsPrecisionAuthorization;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GpsData)) {
            return false;
        }
        GpsData gpsData = (GpsData) obj;
        return this.location.equals(gpsData.location) && this.precision == gpsData.precision;
    }

    public final int hashCode() {
        return this.precision.hashCode() + (this.location.hashCode() * 31);
    }

    public final String toString() {
        return "GpsData(location=" + this.location + ", precision=" + this.precision + ")";
    }
}
