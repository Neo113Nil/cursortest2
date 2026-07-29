package com.moat.analytics.mobile.iro;

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
final class k implements LocationListener {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static k f1173;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f1174;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Location f1175;

    /* renamed from: ˊ, reason: contains not printable characters */
    private ScheduledFuture<?> f1176;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ScheduledFuture<?> f1177;

    /* renamed from: ˎ, reason: contains not printable characters */
    private LocationManager f1178;

    /* renamed from: ॱ, reason: contains not printable characters */
    private ScheduledExecutorService f1179;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private boolean f1180;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static k m1275() {
        if (f1173 == null) {
            f1173 = new k();
        }
        return f1173;
    }

    private k() {
        try {
            this.f1180 = ((j) MoatAnalytics.getInstance()).f1170;
            if (this.f1180) {
                b.m1182(3, "LocationManager", this, "Moat location services disabled");
                return;
            }
            this.f1179 = Executors.newScheduledThreadPool(1);
            this.f1178 = (LocationManager) a.m1173().getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            if (this.f1178.getAllProviders().size() == 0) {
                b.m1182(3, "LocationManager", this, "Device has no location providers");
            } else {
                m1277();
            }
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    final Location m1284() {
        if (this.f1180 || this.f1178 == null) {
            return null;
        }
        return this.f1175;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    final void m1283() {
        m1277();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m1282() {
        m1272(false);
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        try {
            b.m1182(3, "LocationManager", this, "Received an updated location = " + location.toString());
            float currentTimeMillis = (float) ((System.currentTimeMillis() - location.getTime()) / 1000);
            if (!location.hasAccuracy() || location.getAccuracy() > 100.0f || currentTimeMillis >= 600.0f) {
                return;
            }
            this.f1175 = m1269(this.f1175, location);
            b.m1182(3, "LocationManager", this, "fetchCompleted");
            m1272(true);
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public void m1277() {
        try {
            if (!this.f1180 && this.f1178 != null) {
                if (this.f1174) {
                    b.m1182(3, "LocationManager", this, "already updating location");
                }
                b.m1182(3, "LocationManager", this, "starting location fetch");
                this.f1175 = m1269(this.f1175, m1266());
                if (this.f1175 != null) {
                    b.m1182(3, "LocationManager", this, "Have a valid location, won't fetch = " + this.f1175.toString());
                    m1278();
                    return;
                }
                m1281();
            }
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m1272(boolean z) {
        try {
            b.m1182(3, "LocationManager", this, "stopping location fetch");
            m1268();
            m1271();
            if (z) {
                m1278();
            } else {
                m1267();
            }
        } catch (Exception e) {
            o.m1290(e);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Location m1266() {
        Location lastKnownLocation;
        try {
            boolean m1274 = m1274();
            boolean m1280 = m1280();
            if (m1274 && m1280) {
                lastKnownLocation = m1269(this.f1178.getLastKnownLocation("gps"), this.f1178.getLastKnownLocation("network"));
            } else if (m1274) {
                lastKnownLocation = this.f1178.getLastKnownLocation("gps");
            } else {
                if (!m1280) {
                    return null;
                }
                lastKnownLocation = this.f1178.getLastKnownLocation("network");
            }
            return lastKnownLocation;
        } catch (SecurityException e) {
            o.m1290(e);
            return null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    private void m1281() {
        try {
            if (this.f1174) {
                return;
            }
            b.m1182(3, "LocationManager", this, "Attempting to start update");
            if (m1274()) {
                b.m1182(3, "LocationManager", this, "start updating gps location");
                this.f1178.requestLocationUpdates("gps", 0L, 0.0f, this, Looper.getMainLooper());
                this.f1174 = true;
            }
            if (m1280()) {
                b.m1182(3, "LocationManager", this, "start updating network location");
                this.f1178.requestLocationUpdates("network", 0L, 0.0f, this, Looper.getMainLooper());
                this.f1174 = true;
            }
            if (this.f1174) {
                m1271();
                this.f1177 = this.f1179.schedule(new Runnable() { // from class: com.moat.analytics.mobile.iro.k.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.m1182(3, "LocationManager", this, "fetchTimedOut");
                            k.this.m1272(true);
                        } catch (Exception e) {
                            o.m1290(e);
                        }
                    }
                }, 60L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            o.m1290(e);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m1268() {
        try {
            b.m1182(3, "LocationManager", this, "Stopping to update location");
            boolean z = true;
            if (!(ContextCompat.checkSelfPermission(a.m1173().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0)) {
                if (!(ContextCompat.checkSelfPermission(a.m1173().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                    z = false;
                }
            }
            if (!z || this.f1178 == null) {
                return;
            }
            this.f1178.removeUpdates(this);
            this.f1174 = false;
        } catch (SecurityException e) {
            o.m1290(e);
        }
    }

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private void m1271() {
        if (this.f1177 == null || this.f1177.isCancelled()) {
            return;
        }
        this.f1177.cancel(true);
        this.f1177 = null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1267() {
        if (this.f1176 == null || this.f1176.isCancelled()) {
            return;
        }
        this.f1176.cancel(true);
        this.f1176 = null;
    }

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private void m1278() {
        b.m1182(3, "LocationManager", this, "Resetting fetch timer");
        m1267();
        float f = 600.0f;
        if (this.f1175 != null) {
            f = Math.max(600.0f - ((System.currentTimeMillis() - this.f1175.getTime()) / 1000), 0.0f);
        }
        this.f1176 = this.f1179.schedule(new Runnable() { // from class: com.moat.analytics.mobile.iro.k.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.m1182(3, "LocationManager", this, "fetchTimerCompleted");
                    k.this.m1277();
                } catch (Exception e) {
                    o.m1290(e);
                }
            }
        }, (long) f, TimeUnit.SECONDS);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static Location m1269(Location location, Location location2) {
        boolean m1273 = m1273(location);
        boolean m12732 = m1273(location2);
        if (m1273) {
            return (m12732 && location.getAccuracy() >= location.getAccuracy()) ? location2 : location;
        }
        if (m12732) {
            return location2;
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean m1273(Location location) {
        if (location == null) {
            return false;
        }
        return !(location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) && location.getAccuracy() >= 0.0f && ((float) ((System.currentTimeMillis() - location.getTime()) / 1000)) < 600.0f;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static boolean m1276(Location location, Location location2) {
        if (location == location2) {
            return true;
        }
        return (location == null || location2 == null || location.getTime() != location2.getTime()) ? false : true;
    }

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private boolean m1274() {
        return (ContextCompat.checkSelfPermission(a.m1173().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) && this.f1178.getProvider("gps") != null && this.f1178.isProviderEnabled("gps");
    }

    /* renamed from: ॱˋ, reason: contains not printable characters */
    private boolean m1280() {
        boolean z;
        if (!(ContextCompat.checkSelfPermission(a.m1173().getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") == 0)) {
            if (!(ContextCompat.checkSelfPermission(a.m1173().getApplicationContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0)) {
                z = false;
                return (z || this.f1178.getProvider("network") == null || !this.f1178.isProviderEnabled("network")) ? false : true;
            }
        }
        z = true;
        if (z) {
        }
    }
}
