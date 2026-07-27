package io.appmetrica.analytics.gpllibrary.internal;

import I1.e;
import android.location.Location;
import android.location.LocationListener;

/* loaded from: classes.dex */
class GplOnSuccessListener implements e {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f6358a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f6358a = locationListener;
    }

    @Override // I1.e
    public void onSuccess(Location location) {
        this.f6358a.onLocationChanged(location);
    }
}
