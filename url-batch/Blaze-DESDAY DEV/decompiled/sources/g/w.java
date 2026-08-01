package g;

import K.C0014l;
import Y.AbstractC0041g;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class w extends AbstractC0041g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2280c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0092A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, C0014l c0014l) {
        super(layoutInflaterFactory2C0092A);
        this.d = layoutInflaterFactory2C0092A;
        this.f2281e = c0014l;
    }

    @Override // Y.AbstractC0041g
    public final IntentFilter e() {
        switch (this.f2280c) {
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

    @Override // Y.AbstractC0041g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2280c) {
            case 0:
                return s.a((PowerManager) this.f2281e) ? 2 : 1;
            default:
                C0014l c0014l = (C0014l) this.f2281e;
                C0099H c0099h = (C0099H) c0014l.f493c;
                if (c0099h.f2190b > System.currentTimeMillis()) {
                    z2 = c0099h.f2189a;
                } else {
                    Context context = (Context) c0014l.f491a;
                    int e2 = z1.l.e(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0014l.f492b;
                    if (e2 == 0) {
                        try {
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
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
                    if (z1.l.e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0098G.d == null) {
                            C0098G.d = new C0098G();
                        }
                        C0098G c0098g = C0098G.d;
                        c0098g.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0098g.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0098g.f2188c == 1;
                        long j3 = c0098g.f2187b;
                        long j4 = c0098g.f2186a;
                        c0098g.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0098g.f2187b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0099h.f2189a = z2;
                        c0099h.f2190b = j2;
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

    @Override // Y.AbstractC0041g
    public final void h() {
        switch (this.f2280c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0092A layoutInflaterFactory2C0092A, Context context) {
        super(layoutInflaterFactory2C0092A);
        this.d = layoutInflaterFactory2C0092A;
        this.f2281e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
