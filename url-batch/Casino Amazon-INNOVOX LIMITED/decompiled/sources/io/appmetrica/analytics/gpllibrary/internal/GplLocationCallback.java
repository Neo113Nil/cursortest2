package io.appmetrica.analytics.gpllibrary.internal;

import android.location.LocationListener;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes3.dex */
class GplLocationCallback extends LocationCallback {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f706a;

    GplLocationCallback(LocationListener locationListener) {
        this.f706a = locationListener;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        this.f706a.onLocationChanged(locationResult.getLastLocation());
    }
}
