package com.appsflyer;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.appsflyer.v;
import com.mopub.mobileads.GooglePlayServicesInterstitial;

/* loaded from: classes.dex */
final class p {

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final p f3483a = new p();
    }

    p() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (60000 < (r2.getTime() - r7.getTime())) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Location a(Context context) {
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            Location lastKnownLocation = a(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? locationManager.getLastKnownLocation("network") : null;
            Location lastKnownLocation2 = a(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? locationManager.getLastKnownLocation("gps") : null;
            if (lastKnownLocation2 == null && lastKnownLocation == null) {
                lastKnownLocation2 = null;
            } else {
                if (lastKnownLocation2 != null || lastKnownLocation == null) {
                    if (lastKnownLocation != null || lastKnownLocation2 == null) {
                    }
                }
                lastKnownLocation2 = lastKnownLocation;
            }
            if (lastKnownLocation2 != null) {
                return lastKnownLocation2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(Context context, String[] strArr) {
        for (String str : strArr) {
            if (v.a.a(context, str)) {
                return true;
            }
        }
        return false;
    }
}
