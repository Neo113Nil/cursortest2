package com.moat.analytics.mobile.cha;

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
final class n implements LocationListener {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static n f960;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Location f961;

    /* renamed from: ˊ, reason: contains not printable characters */
    private ScheduledExecutorService f962;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private boolean f963;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ScheduledFuture<?> f964;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ScheduledFuture<?> f965;

    /* renamed from: ॱ, reason: contains not printable characters */
    private LocationManager f966;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private boolean f967;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static n m1096() {
        if (f960 == null) {
            f960 = new n();
        }
        return f960;
    }

    private n() {
        try {
            this.f963 = ((f) MoatAnalytics.getInstance()).f887;
            if (this.f963) {
                a.m994(3, "LocationManager", this, "Moat location services disabled");
                return;
            }
            this.f962 = Executors.newScheduledThreadPool(1);
            this.f966 = (LocationManager) c.m1015().getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            if (this.f966.getAllProviders().size() == 0) {
                a.m994(3, "LocationManager", this, "Device has no location providers");
            } else {
                m1094();
            }
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final Location m1105() {
        if (this.f963 || this.f966 == null) {
            return null;
        }
        return this.f961;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1106() {
        m1094();
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final void m1107() {
        m1101(false);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        try {
            a.m994(3, "LocationManager", this, "Received an updated location = " + location.toString());
            float currentTimeMillis = (float) ((System.currentTimeMillis() - location.getTime()) / 1000);
            if (!location.hasAccuracy() || location.getAccuracy() > 100.0f || currentTimeMillis >= 600.0f) {
                return;
            }
            this.f961 = m1099(this.f961, location);
            a.m994(3, "LocationManager", this, "fetchCompleted");
            m1101(true);
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m1094() {
        try {
            if (!this.f963 && this.f966 != null) {
                if (this.f967) {
                    a.m994(3, "LocationManager", this, "already updating location");
                }
                a.m994(3, "LocationManager", this, "starting location fetch");
                this.f961 = m1099(this.f961, m1091());
                if (this.f961 != null) {
                    a.m994(3, "LocationManager", this, "Have a valid location, won't fetch = " + this.f961.toString());
                    m1097();
                    return;
                }
                m1089();
            }
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ॱ, reason: contains not printable characters */
    public void m1101(boolean z) {
        try {
            a.m994(3, "LocationManager", this, "stopping location fetch");
            m1090();
            m1093();
            if (z) {
                m1097();
            } else {
                m1104();
            }
        } catch (Exception e) {
            o.m1110(e);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Location m1091() {
        Location lastKnownLocation;
        try {
            boolean m1098 = m1098();
            boolean m1103 = m1103();
            if (m1098 && m1103) {
                lastKnownLocation = m1099(this.f966.getLastKnownLocation("gps"), this.f966.getLastKnownLocation("network"));
            } else if (m1098) {
                lastKnownLocation = this.f966.getLastKnownLocation("gps");
            } else {
                if (!m1103) {
                    return null;
                }
                lastKnownLocation = this.f966.getLastKnownLocation("network");
            }
            return lastKnownLocation;
        } catch (SecurityException e) {
            o.m1110(e);
            return null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1089() {
        try {
            if (this.f967) {
                return;
            }
            a.m994(3, "LocationManager", this, "Attempting to start update");
            if (m1098()) {
                a.m994(3, "LocationManager", this, "start updating gps location");
                this.f966.requestLocationUpdates("gps", 0L, 0.0f, this, Looper.getMainLooper());
                this.f967 = true;
            }
            if (m1103()) {
                a.m994(3, "LocationManager", this, "start updating network location");
                this.f966.requestLocationUpdates("network", 0L, 0.0f, this, Looper.getMainLooper());
                this.f967 = true;
            }
            if (this.f967) {
                m1093();
                this.f965 = this.f962.schedule(new Runnable() { // from class: com.moat.analytics.mobile.cha.n.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            a.m994(3, "LocationManager", this, "fetchTimedOut");
                            n.this.m1101(true);
                        } catch (Exception e) {
                            o.m1110(e);
                        }
                    }
                }, 60L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            o.m1110(e);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1090() {
        try {
            a.m994(3, "LocationManager", this, "Stopping to update location");
            boolean z = true;
            if (!(ContextCompat.checkSelfPermission(c.m1015().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0)) {
                if (!(ContextCompat.checkSelfPermission(c.m1015().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                    z = false;
                }
            }
            if (!z || this.f966 == null) {
                return;
            }
            this.f966.removeUpdates(this);
            this.f967 = false;
        } catch (SecurityException e) {
            o.m1110(e);
        }
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private void m1093() {
        if (this.f965 == null || this.f965.isCancelled()) {
            return;
        }
        this.f965.cancel(true);
        this.f965 = null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    private void m1104() {
        if (this.f964 == null || this.f964.isCancelled()) {
            return;
        }
        this.f964.cancel(true);
        this.f964 = null;
    }

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private void m1097() {
        a.m994(3, "LocationManager", this, "Resetting fetch timer");
        m1104();
        float f = 600.0f;
        if (this.f961 != null) {
            f = Math.max(600.0f - ((System.currentTimeMillis() - this.f961.getTime()) / 1000), 0.0f);
        }
        this.f964 = this.f962.schedule(new Runnable() { // from class: com.moat.analytics.mobile.cha.n.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.m994(3, "LocationManager", this, "fetchTimerCompleted");
                    n.this.m1094();
                } catch (Exception e) {
                    o.m1110(e);
                }
            }
        }, (long) f, TimeUnit.SECONDS);
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static Location m1099(Location location, Location location2) {
        boolean m1102 = m1102(location);
        boolean m11022 = m1102(location2);
        if (m1102) {
            return (m11022 && location.getAccuracy() >= location.getAccuracy()) ? location2 : location;
        }
        if (m11022) {
            return location2;
        }
        return null;
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static boolean m1102(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) && location.getAccuracy() >= 0.0f && ((float) ((System.currentTimeMillis() - location.getTime()) / 1000)) < 600.0f;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static boolean m1095(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    private boolean m1098() {
        return (ContextCompat.checkSelfPermission(c.m1015().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) && this.f966.getProvider("gps") != null && this.f966.isProviderEnabled("gps");
    }

    /* renamed from: ॱˊ, reason: contains not printable characters */
    private boolean m1103() {
        boolean z;
        if (!(ContextCompat.checkSelfPermission(c.m1015().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0)) {
            if (!(ContextCompat.checkSelfPermission(c.m1015().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                z = false;
                return (z || this.f966.getProvider("network") == null || !this.f966.isProviderEnabled("network")) ? false : true;
            }
        }
        z = true;
        if (z) {
        }
    }
}
