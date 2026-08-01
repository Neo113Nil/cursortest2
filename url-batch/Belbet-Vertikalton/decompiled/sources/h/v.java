package h;

import Z.AbstractC0043g;
import a.AbstractC0058a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class v extends AbstractC0043g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2825c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f2826d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, I0.h hVar) {
        super(zVar);
        this.f2826d = zVar;
        this.e = hVar;
    }

    @Override // Z.AbstractC0043g
    public final IntentFilter e() {
        switch (this.f2825c) {
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

    @Override // Z.AbstractC0043g
    public final int f() {
        Location location;
        boolean z2;
        long j;
        Location location2;
        switch (this.f2825c) {
            case 0:
                return r.a((PowerManager) this.e) ? 2 : 1;
            default:
                I0.h hVar = (I0.h) this.e;
                H h2 = (H) hVar.f593d;
                if (h2.f2738b > System.currentTimeMillis()) {
                    z2 = h2.f2737a;
                } else {
                    Context context = (Context) hVar.f591b;
                    int k2 = AbstractC0058a.k(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) hVar.f592c;
                    if (k2 == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
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
                    if (AbstractC0058a.k(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (G.f2733d == null) {
                            G.f2733d = new G();
                        }
                        G g2 = G.f2733d;
                        g2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        g2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = g2.f2736c == 1;
                        long j2 = g2.f2735b;
                        long j3 = g2.f2734a;
                        g2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j4 = g2.f2735b;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j3) {
                                j4 = currentTimeMillis > j2 ? j3 : j2;
                            }
                            j = j4 + 60000;
                        }
                        h2.f2737a = z2;
                        h2.f2738b = j;
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

    @Override // Z.AbstractC0043g
    public final void h() {
        switch (this.f2825c) {
            case 0:
                this.f2826d.m(true, true);
                break;
            default:
                this.f2826d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Context context) {
        super(zVar);
        this.f2826d = zVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
