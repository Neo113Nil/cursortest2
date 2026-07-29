package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.PermissionChecker;
import android.util.Log;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class m {

    /* renamed from: a, reason: collision with root package name */
    private static m f1668a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1669b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationManager f1670c;

    /* renamed from: d, reason: collision with root package name */
    private final a f1671d = new a();

    static m a(Context context) {
        if (f1668a == null) {
            Context applicationContext = context.getApplicationContext();
            f1668a = new m(applicationContext, (LocationManager) applicationContext.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY));
        }
        return f1668a;
    }

    m(Context context, LocationManager locationManager) {
        this.f1669b = context;
        this.f1670c = locationManager;
    }

    boolean a() {
        a aVar = this.f1671d;
        if (c()) {
            return aVar.f1672a;
        }
        Location b2 = b();
        if (b2 != null) {
            a(b2);
            return aVar.f1672a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location a2 = PermissionChecker.checkSelfPermission(this.f1669b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        Location a3 = PermissionChecker.checkSelfPermission(this.f1669b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? a("gps") : null;
        return (a3 == null || a2 == null) ? a3 != null ? a3 : a2 : a3.getTime() > a2.getTime() ? a3 : a2;
    }

    private Location a(String str) {
        try {
            if (this.f1670c.isProviderEnabled(str)) {
                return this.f1670c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    private boolean c() {
        return this.f1671d.f > System.currentTimeMillis();
    }

    private void a(Location location) {
        long j;
        a aVar = this.f1671d;
        long currentTimeMillis = System.currentTimeMillis();
        l a2 = l.a();
        a2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a2.f1665a;
        a2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a2.f1667c == 1;
        long j3 = a2.f1666b;
        long j4 = a2.f1665a;
        boolean z2 = z;
        a2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = a2.f1666b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.f1672a = z2;
        aVar.f1673b = j2;
        aVar.f1674c = j3;
        aVar.f1675d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    /* compiled from: TwilightManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f1672a;

        /* renamed from: b, reason: collision with root package name */
        long f1673b;

        /* renamed from: c, reason: collision with root package name */
        long f1674c;

        /* renamed from: d, reason: collision with root package name */
        long f1675d;
        long e;
        long f;

        a() {
        }
    }
}
