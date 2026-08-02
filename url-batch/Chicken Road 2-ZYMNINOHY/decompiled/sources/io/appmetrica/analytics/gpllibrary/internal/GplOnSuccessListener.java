package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import t2.b;

/* loaded from: classes.dex */
class GplOnSuccessListener implements b {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f9851a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f9851a = locationListener;
    }

    @Override // t2.b
    public void onSuccess(Location location) {
        this.f9851a.onLocationChanged(location);
    }
}
