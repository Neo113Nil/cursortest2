package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class w extends androidx.fragment.app.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1573c = 0;
    public final /* synthetic */ a0 d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, androidx.emoji2.text.t tVar) {
        super(a0Var);
        this.d = a0Var;
        this.f1574e = tVar;
    }

    @Override // androidx.fragment.app.j
    public final IntentFilter e() {
        switch (this.f1573c) {
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

    @Override // androidx.fragment.app.j
    public final int f() {
        Location location;
        boolean z4;
        long j2;
        Location location2;
        switch (this.f1573c) {
            case 0:
                return s.a((PowerManager) this.f1574e) ? 2 : 1;
            default:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f1574e;
                h0 h0Var = (h0) tVar.f474c;
                LocationManager locationManager = (LocationManager) tVar.f473b;
                if (h0Var.f1526b > System.currentTimeMillis()) {
                    z4 = h0Var.f1525a;
                } else {
                    Context context = (Context) tVar.f472a;
                    Location location3 = null;
                    if (b4.d.m(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
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
                    if (b4.d.m(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (g0.d == null) {
                            g0.d = new g0();
                        }
                        g0 g0Var = g0.d;
                        g0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        g0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z4 = g0Var.f1523c == 1;
                        long j4 = g0Var.f1522b;
                        long j5 = g0Var.f1521a;
                        g0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j6 = g0Var.f1522b;
                        if (j4 == -1 || j5 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j5) {
                                j4 = j6;
                            } else if (currentTimeMillis > j4) {
                                j4 = j5;
                            }
                            j2 = j4 + 60000;
                        }
                        h0Var.f1525a = z4;
                        h0Var.f1526b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z4 = true;
                        }
                    }
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.j
    public final void h() {
        switch (this.f1573c) {
            case 0:
                this.d.k(true, true);
                break;
            default:
                this.d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, Context context) {
        super(a0Var);
        this.d = a0Var;
        this.f1574e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
