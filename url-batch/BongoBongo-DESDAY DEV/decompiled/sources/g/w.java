package g;

import L.C0014l;
import Z.AbstractC0040g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class w extends AbstractC0040g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2361c = 1;
    public final /* synthetic */ A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2362e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a2, C0014l c0014l) {
        super(a2);
        this.d = a2;
        this.f2362e = c0014l;
    }

    @Override // Z.AbstractC0040g
    public final IntentFilter e() {
        switch (this.f2361c) {
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

    @Override // Z.AbstractC0040g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2361c) {
            case 0:
                return s.a((PowerManager) this.f2362e) ? 2 : 1;
            default:
                C0014l c0014l = (C0014l) this.f2362e;
                H h2 = (H) c0014l.f544c;
                if (h2.f2266b > System.currentTimeMillis()) {
                    z2 = h2.f2265a;
                } else {
                    Context context = (Context) c0014l.f542a;
                    int m2 = A1.d.m(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0014l.f543b;
                    if (m2 == 0) {
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
                    if (A1.d.m(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (G.d == null) {
                            G.d = new G();
                        }
                        G g2 = G.d;
                        g2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        g2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = g2.f2264c == 1;
                        long j3 = g2.f2263b;
                        long j4 = g2.f2262a;
                        g2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = g2.f2263b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        h2.f2265a = z2;
                        h2.f2266b = j2;
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

    @Override // Z.AbstractC0040g
    public final void h() {
        switch (this.f2361c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a2, Context context) {
        super(a2);
        this.d = a2;
        this.f2362e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
