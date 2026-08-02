package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import d1.c;

/* loaded from: classes.dex */
class GplOnSuccessListener implements c {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f5591a;

    public GplOnSuccessListener(LocationListener locationListener) {
        this.f5591a = locationListener;
    }

    @Override // d1.c
    public void onSuccess(Location location) {
        this.f5591a.onLocationChanged(location);
    }
}
