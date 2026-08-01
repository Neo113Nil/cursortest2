package g;

import Z.AbstractC0037g;
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
    public final /* synthetic */ int f2342c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0101A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, A1.j jVar) {
        super(layoutInflaterFactory2C0101A);
        this.d = layoutInflaterFactory2C0101A;
        this.f2343e = jVar;
    }

    @Override // Z.AbstractC0037g
    public final IntentFilter e() {
        switch (this.f2342c) {
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

    @Override // Z.AbstractC0037g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2342c) {
            case 0:
                return s.a((PowerManager) this.f2343e) ? 2 : 1;
            default:
                A1.j jVar = (A1.j) this.f2343e;
                H h = (H) jVar.d;
                if (h.f2252b > System.currentTimeMillis()) {
                    z2 = h.f2251a;
                } else {
                    Context context = (Context) jVar.f80b;
                    int f2 = z1.d.f(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) jVar.f81c;
                    if (f2 == 0) {
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
                    if (z1.d.f(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        z2 = g2.f2250c == 1;
                        long j3 = g2.f2249b;
                        long j4 = g2.f2248a;
                        g2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = g2.f2249b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        h.f2251a = z2;
                        h.f2252b = j2;
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

    @Override // Z.AbstractC0037g
    public final void h() {
        switch (this.f2342c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0101A layoutInflaterFactory2C0101A, Context context) {
        super(layoutInflaterFactory2C0101A);
        this.d = layoutInflaterFactory2C0101A;
        this.f2343e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
