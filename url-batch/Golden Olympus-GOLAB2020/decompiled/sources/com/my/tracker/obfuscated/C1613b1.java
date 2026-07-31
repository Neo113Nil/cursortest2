package com.my.tracker.obfuscated;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.my.tracker.obfuscated.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1613b1 {

    /* renamed from: a, reason: collision with root package name */
    protected Location f21140a;

    /* renamed from: c, reason: collision with root package name */
    LocationManager f21142c;

    /* renamed from: d, reason: collision with root package name */
    int f21143d = -1;

    /* renamed from: b, reason: collision with root package name */
    protected final LocationListener f21141b = new a();

    /* renamed from: com.my.tracker.obfuscated.b1$a */
    class a implements LocationListener {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            AbstractC1708y2.a("LocationDataProvider: location has been updated");
            C1613b1 c1613b1 = C1613b1.this;
            c1613b1.f21140a = location;
            LocationManager locationManager = c1613b1.f21142c;
            if (locationManager != null) {
                locationManager.removeUpdates(this);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            AbstractC1708y2.a("LocationDataProvider: onProviderDisabled, provider – " + str);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            AbstractC1708y2.a("LocationDataProvider: onProviderEnabled, provider –" + str);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i4, Bundle bundle) {
            AbstractC1708y2.a("LocationDataProvider: onStatusChanged, provider – " + str + ", status – " + i4 + ", extras – " + bundle);
        }
    }

    C1613b1() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C1608a1 a(int i4, Context context) {
        float f4;
        long j4;
        String str;
        int i5;
        int i6 = 1;
        if (i4 == 0) {
            return C1608a1.f21131g;
        }
        this.f21143d = -1;
        if (!AbstractC1664n1.a("android.permission.ACCESS_FINE_LOCATION", context) || !AbstractC1664n1.a("android.permission.ACCESS_COARSE_LOCATION", context)) {
            return C1608a1.f21131g;
        }
        if (AbstractC1664n1.a()) {
            return C1608a1.f21131g;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(FirebaseAnalytics.Param.LOCATION);
        this.f21142c = locationManager;
        if (locationManager == null) {
            return C1608a1.f21131g;
        }
        if (i4 == 2) {
            a();
        }
        Location location = this.f21140a;
        if (location != null) {
            f4 = location.getAccuracy();
            j4 = location.getTime();
            str = location.getProvider();
        } else {
            location = null;
            f4 = Float.MAX_VALUE;
            j4 = 0;
            str = null;
        }
        for (String str2 : this.f21142c.getAllProviders()) {
            try {
                Location lastKnownLocation = this.f21142c.getLastKnownLocation(str2);
                if (lastKnownLocation != null) {
                    float accuracy = lastKnownLocation.getAccuracy();
                    long time = lastKnownLocation.getTime();
                    if (location == null || (time > j4 && accuracy < f4)) {
                        str = str2;
                        location = lastKnownLocation;
                        f4 = accuracy;
                        j4 = time;
                    }
                }
            } catch (SecurityException unused) {
                AbstractC1708y2.a("LocationDataProvider: Permission android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION check was positive, but still got security exception on the location provider");
            }
        }
        if (location == null) {
            return C1608a1.f21131g;
        }
        str.getClass();
        switch (str) {
            case "passive":
                i6 = 4;
                i5 = i6;
                break;
            case "gps":
                i5 = 2;
                break;
            case "network":
                i6 = 3;
                i5 = i6;
                break;
            default:
                i5 = i6;
                break;
        }
        return new C1608a1(i5, location.getLatitude(), location.getLongitude(), location.getSpeed(), location.getAccuracy(), location.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f21142c.requestLocationUpdates(str, 2000L, 0.0f, this.f21141b);
    }

    void a() {
        if (this.f21142c != null) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            final String bestProvider = this.f21142c.getBestProvider(criteria, true);
            AbstractC1708y2.a("LocationDataProvider: best provider is " + bestProvider);
            if (bestProvider != null) {
                AbstractC1658m.f(new Runnable() { // from class: com.my.tracker.obfuscated.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1613b1.this.a(bestProvider);
                    }
                });
            }
        }
    }
}
