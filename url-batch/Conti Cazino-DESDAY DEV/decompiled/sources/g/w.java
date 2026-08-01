package g;

import K.C0012l;
import X.AbstractC0038g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class w extends AbstractC0038g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2346c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0109A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A, C0012l c0012l) {
        super(layoutInflaterFactory2C0109A);
        this.d = layoutInflaterFactory2C0109A;
        this.f2347e = c0012l;
    }

    @Override // X.AbstractC0038g
    public final IntentFilter e() {
        switch (this.f2346c) {
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

    @Override // X.AbstractC0038g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2346c) {
            case 0:
                return s.a((PowerManager) this.f2347e) ? 2 : 1;
            default:
                C0012l c0012l = (C0012l) this.f2347e;
                C0116H c0116h = (C0116H) c0012l.d;
                if (c0116h.f2256b > System.currentTimeMillis()) {
                    z2 = c0116h.f2255a;
                } else {
                    Context context = (Context) c0012l.f431b;
                    int j3 = q1.l.j(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0012l.f432c;
                    if (j3 == 0) {
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
                    if (q1.l.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0115G.d == null) {
                            C0115G.d = new C0115G();
                        }
                        C0115G c0115g = C0115G.d;
                        c0115g.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0115g.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0115g.f2254c == 1;
                        long j4 = c0115g.f2253b;
                        long j5 = c0115g.f2252a;
                        c0115g.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j6 = c0115g.f2253b;
                        if (j4 == -1 || j5 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j5) {
                                j6 = currentTimeMillis > j4 ? j5 : j4;
                            }
                            j2 = j6 + 60000;
                        }
                        c0116h.f2255a = z2;
                        c0116h.f2256b = j2;
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

    @Override // X.AbstractC0038g
    public final void h() {
        switch (this.f2346c) {
            case 0:
                this.d.m(true, true);
                break;
            default:
                this.d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A, Context context) {
        super(layoutInflaterFactory2C0109A);
        this.d = layoutInflaterFactory2C0109A;
        this.f2347e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
