package com.moat.analytics.mobile.you;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.ContextCompat;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class o implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    private static o f7519a;

    /* renamed from: b, reason: collision with root package name */
    private ScheduledExecutorService f7520b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledFuture<?> f7521c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f7522d;
    private LocationManager e;
    private boolean f;
    private Location g;
    private boolean h;

    private o() {
        String str;
        String str2;
        try {
            this.f = ((k) MoatAnalytics.getInstance()).f7501c;
            if (this.f) {
                str = "LocationManager";
                str2 = "Moat location services disabled";
            } else {
                this.f7520b = Executors.newScheduledThreadPool(1);
                this.e = (LocationManager) a.a().getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
                if (this.e.getAllProviders().size() != 0) {
                    e();
                } else {
                    str = "LocationManager";
                    str2 = "Device has no location providers";
                }
            }
            p.a(3, str, this, str2);
        } catch (Exception e) {
            m.a(e);
        }
    }

    static o a() {
        if (f7519a == null) {
            f7519a = new o();
        }
        return f7519a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        try {
            p.a(3, "LocationManager", this, "stopping location fetch");
            h();
            i();
            if (z) {
                k();
            } else {
                j();
            }
        } catch (Exception e) {
            m.a(e);
        }
    }

    private static boolean a(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) && location.getAccuracy() >= 0.0f && b(location) < 600.0f;
    }

    static boolean a(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    private static boolean a(String str) {
        return ContextCompat.checkSelfPermission(a.a().getApplicationContext(), str) == 0;
    }

    private static float b(Location location) {
        return (System.currentTimeMillis() - location.getTime()) / 1000;
    }

    private static Location b(Location location, Location location2) {
        boolean a2 = a(location);
        boolean a3 = a(location2);
        if (a2) {
            return (a3 && location.getAccuracy() >= location.getAccuracy()) ? location2 : location;
        }
        if (a3) {
            return location2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (!this.f && this.e != null) {
                if (this.h) {
                    p.a(3, "LocationManager", this, "already updating location");
                }
                p.a(3, "LocationManager", this, "starting location fetch");
                this.g = b(this.g, f());
                if (this.g == null) {
                    g();
                    return;
                }
                p.a(3, "LocationManager", this, "Have a valid location, won't fetch = " + this.g.toString());
                k();
            }
        } catch (Exception e) {
            m.a(e);
        }
    }

    private Location f() {
        LocationManager locationManager;
        String str;
        Location lastKnownLocation;
        try {
            boolean l = l();
            boolean m = m();
            if (l && m) {
                lastKnownLocation = b(this.e.getLastKnownLocation("gps"), this.e.getLastKnownLocation("network"));
            } else {
                if (l) {
                    locationManager = this.e;
                    str = "gps";
                } else {
                    if (!m) {
                        return null;
                    }
                    locationManager = this.e;
                    str = "network";
                }
                lastKnownLocation = locationManager.getLastKnownLocation(str);
            }
            return lastKnownLocation;
        } catch (SecurityException e) {
            m.a(e);
            return null;
        }
    }

    private void g() {
        try {
            if (this.h) {
                return;
            }
            p.a(3, "LocationManager", this, "Attempting to start update");
            if (l()) {
                p.a(3, "LocationManager", this, "start updating gps location");
                this.e.requestLocationUpdates("gps", 0L, 0.0f, this, Looper.getMainLooper());
                this.h = true;
            }
            if (m()) {
                p.a(3, "LocationManager", this, "start updating network location");
                this.e.requestLocationUpdates("network", 0L, 0.0f, this, Looper.getMainLooper());
                this.h = true;
            }
            if (this.h) {
                i();
                this.f7522d = this.f7520b.schedule(new Runnable() { // from class: com.moat.analytics.mobile.you.o.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            p.a(3, "LocationManager", this, "fetchTimedOut");
                            o.this.a(true);
                        } catch (Exception e) {
                            m.a(e);
                        }
                    }
                }, 60L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            m.a(e);
        }
    }

    private void h() {
        try {
            p.a(3, "LocationManager", this, "Stopping to update location");
            if (!n() || this.e == null) {
                return;
            }
            this.e.removeUpdates(this);
            this.h = false;
        } catch (SecurityException e) {
            m.a(e);
        }
    }

    private void i() {
        if (this.f7522d == null || this.f7522d.isCancelled()) {
            return;
        }
        this.f7522d.cancel(true);
        this.f7522d = null;
    }

    private void j() {
        if (this.f7521c == null || this.f7521c.isCancelled()) {
            return;
        }
        this.f7521c.cancel(true);
        this.f7521c = null;
    }

    private void k() {
        p.a(3, "LocationManager", this, "Resetting fetch timer");
        j();
        this.f7521c = this.f7520b.schedule(new Runnable() { // from class: com.moat.analytics.mobile.you.o.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    p.a(3, "LocationManager", this, "fetchTimerCompleted");
                    o.this.e();
                } catch (Exception e) {
                    m.a(e);
                }
            }
        }, (long) (this.g != null ? Math.max(600.0f - b(this.g), 0.0f) : 600.0f), TimeUnit.SECONDS);
    }

    private boolean l() {
        return a("android.permission.ACCESS_FINE_LOCATION") && this.e.getProvider("gps") != null && this.e.isProviderEnabled("gps");
    }

    private boolean m() {
        return n() && this.e.getProvider("network") != null && this.e.isProviderEnabled("network");
    }

    private static boolean n() {
        return a("android.permission.ACCESS_FINE_LOCATION") || a("android.permission.ACCESS_COARSE_LOCATION");
    }

    Location b() {
        if (this.f || this.e == null) {
            return null;
        }
        return this.g;
    }

    void c() {
        e();
    }

    void d() {
        a(false);
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        try {
            p.a(3, "LocationManager", this, "Received an updated location = " + location.toString());
            float b2 = b(location);
            if (!location.hasAccuracy() || location.getAccuracy() > 100.0f || b2 >= 600.0f) {
                return;
            }
            this.g = b(this.g, location);
            p.a(3, "LocationManager", this, "fetchCompleted");
            a(true);
        } catch (Exception e) {
            m.a(e);
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
