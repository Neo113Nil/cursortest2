package androidx.core.location;

import android.location.LocationManager;

/* loaded from: classes.dex */
public final class LocationManagerCompat {
    public static boolean isLocationEnabled(LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    private LocationManagerCompat() {
    }
}
