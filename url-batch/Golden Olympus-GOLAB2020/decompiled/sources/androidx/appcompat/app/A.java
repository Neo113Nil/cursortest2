package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;

/* loaded from: classes.dex */
class A {

    /* renamed from: d, reason: collision with root package name */
    private static A f9924d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9925a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f9926b;

    /* renamed from: c, reason: collision with root package name */
    private final a f9927c = new a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f9928a;

        /* renamed from: b, reason: collision with root package name */
        long f9929b;

        a() {
        }
    }

    A(Context context, LocationManager locationManager) {
        this.f9925a = context;
        this.f9926b = locationManager;
    }

    static A a(Context context) {
        if (f9924d == null) {
            Context applicationContext = context.getApplicationContext();
            f9924d = new A(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f9924d;
    }

    private Location b() {
        Location c4 = androidx.core.content.d.b(this.f9925a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c5 = androidx.core.content.d.b(this.f9925a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c5 == null || c4 == null) ? c5 != null ? c5 : c4 : c5.getTime() > c4.getTime() ? c5 : c4;
    }

    private Location c(String str) {
        try {
            if (this.f9926b.isProviderEnabled(str)) {
                return this.f9926b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e4) {
            Log.d("TwilightManager", "Failed to get last known location", e4);
            return null;
        }
    }

    private boolean e() {
        return this.f9927c.f9929b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j4;
        a aVar = this.f9927c;
        long currentTimeMillis = System.currentTimeMillis();
        z b4 = z.b();
        b4.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b4.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z4 = b4.f10228c == 1;
        long j5 = b4.f10227b;
        long j6 = b4.f10226a;
        b4.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j7 = b4.f10227b;
        if (j5 == -1 || j6 == -1) {
            j4 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis > j6) {
                j5 = j7;
            } else if (currentTimeMillis > j5) {
                j5 = j6;
            }
            j4 = j5 + 60000;
        }
        aVar.f9928a = z4;
        aVar.f9929b = j4;
    }

    boolean d() {
        a aVar = this.f9927c;
        if (e()) {
            return aVar.f9928a;
        }
        Location b4 = b();
        if (b4 != null) {
            f(b4);
            return aVar.f9928a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i4 = Calendar.getInstance().get(11);
        return i4 < 6 || i4 >= 22;
    }
}
