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
    public final /* synthetic */ int f2240c = 1;
    public final /* synthetic */ LayoutInflaterFactory2C0090A d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A, C0014l c0014l) {
        super(layoutInflaterFactory2C0090A);
        this.d = layoutInflaterFactory2C0090A;
        this.f2241e = c0014l;
    }

    @Override // Y.AbstractC0041g
    public final IntentFilter e() {
        switch (this.f2240c) {
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
        switch (this.f2240c) {
            case 0:
                return s.a((PowerManager) this.f2241e) ? 2 : 1;
            default:
                C0014l c0014l = (C0014l) this.f2241e;
                C0097H c0097h = (C0097H) c0014l.f476c;
                if (c0097h.f2150b > System.currentTimeMillis()) {
                    z2 = c0097h.f2149a;
                } else {
                    Context context = (Context) c0014l.f474a;
                    int i = w1.l.i(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) c0014l.f475b;
                    if (i == 0) {
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
                    if (w1.l.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0096G.d == null) {
                            C0096G.d = new C0096G();
                        }
                        C0096G c0096g = C0096G.d;
                        c0096g.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0096g.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0096g.f2148c == 1;
                        long j3 = c0096g.f2147b;
                        long j4 = c0096g.f2146a;
                        c0096g.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = c0096g.f2147b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0097h.f2149a = z2;
                        c0097h.f2150b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // Y.AbstractC0041g
    public final void h() {
        switch (this.f2240c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(LayoutInflaterFactory2C0090A layoutInflaterFactory2C0090A, Context context) {
        super(layoutInflaterFactory2C0090A);
        this.d = layoutInflaterFactory2C0090A;
        this.f2241e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
