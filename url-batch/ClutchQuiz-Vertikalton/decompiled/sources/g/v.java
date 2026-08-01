package g;

import K.C0012m;
import X.AbstractC0038g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class v extends AbstractC0038g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2472c = 1;
    public final /* synthetic */ z d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, C0012m c0012m) {
        super(zVar);
        this.d = zVar;
        this.f2473e = c0012m;
    }

    @Override // X.AbstractC0038g
    public final IntentFilter e() {
        switch (this.f2472c) {
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
        switch (this.f2472c) {
            case 0:
                return r.a((PowerManager) this.f2473e) ? 2 : 1;
            default:
                C0012m c0012m = (C0012m) this.f2473e;
                C0126G c0126g = (C0126G) c0012m.d;
                if (c0126g.f2385b > System.currentTimeMillis()) {
                    z2 = c0126g.f2384a;
                } else {
                    Context context = (Context) c0012m.f422b;
                    int l2 = A.c.l(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0012m.f423c;
                    if (l2 == 0) {
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
                    if (A.c.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0125F.d == null) {
                            C0125F.d = new C0125F();
                        }
                        C0125F c0125f = C0125F.d;
                        c0125f.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0125f.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0125f.f2383c == 1;
                        long j3 = c0125f.f2382b;
                        long j4 = c0125f.f2381a;
                        c0125f.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0125f.f2382b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0126g.f2384a = z2;
                        c0126g.f2385b = j2;
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
        switch (this.f2472c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Context context) {
        super(zVar);
        this.d = zVar;
        this.f2473e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
