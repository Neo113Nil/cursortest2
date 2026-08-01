package g;

import K.C0011l;
import X.AbstractC0037g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class w extends AbstractC0037g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2457c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0112A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, C0011l c0011l) {
        super(layoutInflaterFactory2C0112A);
        this.d = layoutInflaterFactory2C0112A;
        this.f2458e = c0011l;
    }

    @Override // X.AbstractC0037g
    public final IntentFilter e() {
        switch (this.f2457c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // X.AbstractC0037g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2457c) {
            case 0:
                return s.a((PowerManager) this.f2458e) ? 2 : 1;
            default:
                C0011l c0011l = (C0011l) this.f2458e;
                C0119H c0119h = (C0119H) c0011l.d;
                if (c0119h.f2369b > System.currentTimeMillis()) {
                    z2 = c0119h.f2368a;
                } else {
                    Context context = (Context) c0011l.f404b;
                    int k2 = u1.l.k(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0011l.f405c;
                    if (k2 == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (u1.l.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0118G.d == null) {
                            C0118G.d = new C0118G();
                        }
                        C0118G c0118g = C0118G.d;
                        c0118g.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0118g.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0118g.f2367c == 1;
                        long j3 = c0118g.f2366b;
                        long j4 = c0118g.f2365a;
                        c0118g.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0118g.f2366b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0119h.f2368a = z2;
                        c0119h.f2369b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // X.AbstractC0037g
    public final void h() {
        switch (this.f2457c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0112A layoutInflaterFactory2C0112A, Context context) {
        super(layoutInflaterFactory2C0112A);
        this.d = layoutInflaterFactory2C0112A;
        this.f2458e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
