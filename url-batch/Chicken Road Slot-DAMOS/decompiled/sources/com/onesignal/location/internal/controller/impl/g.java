package com.onesignal.location.internal.controller.impl;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface g {
    void cancelLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener);

    Location getLastLocation(GoogleApiClient googleApiClient);

    void requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);
}
