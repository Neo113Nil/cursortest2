package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.util.Iterator;
import java.util.List;

/* compiled from: LocationService.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f6996a = "d";

    /* compiled from: LocationService.java */
    public interface a {
        void a(Location location);
    }

    public static Location a(Context context) {
        Location location = null;
        if (!com.ironsource.environment.a.b(context, "android.permission.ACCESS_FINE_LOCATION") && !com.ironsource.environment.a.b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            Log.d(f6996a, "Location Permission Not Granted (ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION)");
            return null;
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            List<String> allProviders = locationManager != null ? locationManager.getAllProviders() : null;
            if (allProviders != null) {
                Iterator<String> it = allProviders.iterator();
                while (it.hasNext()) {
                    try {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
                        if (lastKnownLocation != null && lastKnownLocation.getTime() > Long.MIN_VALUE) {
                            location = lastKnownLocation;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return location;
    }

    @SuppressLint({"MissingPermission"})
    public static void a(Context context, final a aVar) {
        if (!com.ironsource.environment.a.b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            Log.d(f6996a, "Location Permission Not Granted (ACCESS_FINE_LOCATION)");
            if (aVar != null) {
                aVar.a(null);
                return;
            }
        }
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            if (aVar != null && !locationManager.isProviderEnabled("gps")) {
                Log.d(f6996a, "GPS Provider is turned off");
                aVar.a(null);
            } else {
                locationManager.requestSingleUpdate(new Criteria(), new LocationListener() { // from class: com.ironsource.environment.d.1
                    @Override // android.location.LocationListener
                    public void onLocationChanged(Location location) {
                        Log.d("LocationService", "onLocationChanged " + location.getProvider());
                        if (a.this != null) {
                            a.this.a(location);
                        }
                    }

                    @Override // android.location.LocationListener
                    public void onStatusChanged(String str, int i, Bundle bundle) {
                        Log.d("LocationService", "onStatusChanged " + str);
                    }

                    @Override // android.location.LocationListener
                    public void onProviderEnabled(String str) {
                        Log.d("LocationService", "onProviderEnabled " + str);
                    }

                    @Override // android.location.LocationListener
                    public void onProviderDisabled(String str) {
                        Log.d("LocationService", "onProviderDisabled " + str);
                    }
                }, Looper.myLooper());
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    public static boolean b(Context context) {
        boolean z;
        boolean z2;
        try {
            if (!com.ironsource.environment.a.b(context, "android.permission.ACCESS_FINE_LOCATION") && !com.ironsource.environment.a.b(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                Log.d(f6996a, "Location Permission Not Granted (ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION)");
                return false;
            }
            LocationManager locationManager = (LocationManager) context.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            try {
                z = locationManager.isProviderEnabled("gps");
            } catch (Exception unused) {
                z = false;
            }
            try {
                z2 = locationManager.isProviderEnabled("network");
            } catch (Exception unused2) {
                z2 = false;
            }
            return z || z2;
        } catch (Exception unused3) {
            return false;
        }
    }
}
