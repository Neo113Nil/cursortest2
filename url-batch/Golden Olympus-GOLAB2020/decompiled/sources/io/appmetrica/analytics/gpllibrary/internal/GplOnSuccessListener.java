package io.appmetrica.analytics.gpllibrary.internal;

import android.location.Location;
import android.location.LocationListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes3.dex */
class GplOnSuccessListener implements OnSuccessListener<Location> {

    /* renamed from: a, reason: collision with root package name */
    private final LocationListener f37119a;

    GplOnSuccessListener(LocationListener locationListener) {
        this.f37119a = locationListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Location location) {
        this.f37119a.onLocationChanged(location);
    }
}
