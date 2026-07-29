package com.mopub.common;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.SystemClock;
import com.mopub.common.MoPub;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public class LocationService {
    private static volatile LocationService sInstance;

    @VisibleForTesting
    Location mLastKnownLocation;

    @VisibleForTesting
    long mLocationLastUpdatedMillis;

    public enum LocationAwareness {
        NORMAL,
        TRUNCATED,
        DISABLED;

        @Deprecated
        public MoPub.LocationAwareness getNewLocationAwareness() {
            if (this == TRUNCATED) {
                return MoPub.LocationAwareness.TRUNCATED;
            }
            if (this == DISABLED) {
                return MoPub.LocationAwareness.DISABLED;
            }
            return MoPub.LocationAwareness.NORMAL;
        }

        @Deprecated
        public static LocationAwareness fromMoPubLocationAwareness(MoPub.LocationAwareness locationAwareness) {
            if (locationAwareness == MoPub.LocationAwareness.DISABLED) {
                return DISABLED;
            }
            if (locationAwareness == MoPub.LocationAwareness.TRUNCATED) {
                return TRUNCATED;
            }
            return NORMAL;
        }
    }

    private LocationService() {
    }

    @VisibleForTesting
    static LocationService getInstance() {
        LocationService locationService = sInstance;
        if (locationService == null) {
            synchronized (LocationService.class) {
                locationService = sInstance;
                if (locationService == null) {
                    locationService = new LocationService();
                    sInstance = locationService;
                }
            }
        }
        return locationService;
    }

    public enum ValidLocationProvider {
        NETWORK("network"),
        GPS("gps");

        final String name;

        ValidLocationProvider(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasRequiredPermissions(Context context) {
            switch (this) {
                case NETWORK:
                    return DeviceUtils.isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION") || DeviceUtils.isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION");
                case GPS:
                    return DeviceUtils.isPermissionGranted(context, "android.permission.ACCESS_FINE_LOCATION");
                default:
                    return false;
            }
        }
    }

    public static Location getLastKnownLocation(Context context, int i, MoPub.LocationAwareness locationAwareness) {
        if (!MoPub.canCollectPersonalInformation()) {
            return null;
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(locationAwareness);
        if (locationAwareness == MoPub.LocationAwareness.DISABLED) {
            return null;
        }
        LocationService locationService = getInstance();
        if (isLocationFreshEnough()) {
            return locationService.mLastKnownLocation;
        }
        Location mostRecentValidLocation = getMostRecentValidLocation(getLocationFromProvider(context, ValidLocationProvider.GPS), getLocationFromProvider(context, ValidLocationProvider.NETWORK));
        if (locationAwareness == MoPub.LocationAwareness.TRUNCATED) {
            truncateLocationLatLon(mostRecentValidLocation, i);
        }
        locationService.mLastKnownLocation = mostRecentValidLocation;
        locationService.mLocationLastUpdatedMillis = SystemClock.elapsedRealtime();
        return mostRecentValidLocation;
    }

    @VisibleForTesting
    static Location getLocationFromProvider(Context context, ValidLocationProvider validLocationProvider) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(validLocationProvider);
        if (!MoPub.canCollectPersonalInformation() || !validLocationProvider.hasRequiredPermissions(context)) {
            return null;
        }
        try {
            return ((LocationManager) context.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY)).getLastKnownLocation(validLocationProvider.toString());
        } catch (IllegalArgumentException unused) {
            MoPubLog.d("Failed to retrieve location: device has no " + validLocationProvider.toString() + " location provider.");
            return null;
        } catch (NullPointerException unused2) {
            MoPubLog.d("Failed to retrieve location: device has no " + validLocationProvider.toString() + " location provider.");
            return null;
        } catch (SecurityException unused3) {
            MoPubLog.d("Failed to retrieve location from " + validLocationProvider.toString() + " provider: access appears to be disabled.");
            return null;
        }
    }

    @VisibleForTesting
    static Location getMostRecentValidLocation(Location location, Location location2) {
        return location == null ? location2 : (location2 != null && location.getTime() <= location2.getTime()) ? location2 : location;
    }

    @VisibleForTesting
    static void truncateLocationLatLon(Location location, int i) {
        if (location == null || i < 0) {
            return;
        }
        location.setLatitude(BigDecimal.valueOf(location.getLatitude()).setScale(i, 5).doubleValue());
        location.setLongitude(BigDecimal.valueOf(location.getLongitude()).setScale(i, 5).doubleValue());
    }

    private static boolean isLocationFreshEnough() {
        LocationService locationService = getInstance();
        return locationService.mLastKnownLocation != null && SystemClock.elapsedRealtime() - locationService.mLocationLastUpdatedMillis <= MoPub.getMinimumLocationRefreshTimeMillis();
    }

    @VisibleForTesting
    @Deprecated
    public static void clearLastKnownLocation() {
        getInstance().mLastKnownLocation = null;
    }
}
