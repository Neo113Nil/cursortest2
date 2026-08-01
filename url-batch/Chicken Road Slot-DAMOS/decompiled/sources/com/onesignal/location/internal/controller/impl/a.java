package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements g {
    @Override // com.onesignal.location.internal.controller.impl.g
    public void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        googleApiClient.getClass();
        locationListener.getClass();
        if (googleApiClient.d()) {
            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClient, locationListener);
        } else {
            com.onesignal.debug.internal.logging.b.warn$default("GoogleApiClient is not connected. Unable to cancel location updates.", null, 2, null);
        }
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public Location getLastLocation(GoogleApiClient googleApiClient) {
        googleApiClient.getClass();
        if (googleApiClient.d()) {
            return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        }
        return null;
    }

    @Override // com.onesignal.location.internal.controller.impl.g
    public void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        googleApiClient.getClass();
        locationRequest.getClass();
        locationListener.getClass();
        try {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            if (googleApiClient.d()) {
                LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("FusedLocationApi.requestLocationUpdates failed!", th);
        }
    }
}
