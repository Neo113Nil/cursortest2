package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y extends androidx.fragment.app.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1694c = 0;
    public final /* synthetic */ c0 d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1695e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, androidx.emoji2.text.t tVar) {
        super(c0Var);
        this.d = c0Var;
        this.f1695e = tVar;
    }

    @Override // androidx.fragment.app.j
    public final IntentFilter e() {
        switch (this.f1694c) {
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
        boolean z3;
        long j4;
        Location location2;
        switch (this.f1694c) {
            case 0:
                return t.a((PowerManager) this.f1695e) ? 2 : 1;
            default:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f1695e;
                j0 j0Var = (j0) tVar.d;
                LocationManager locationManager = (LocationManager) tVar.f356c;
                if (j0Var.f1653b > System.currentTimeMillis()) {
                    z3 = j0Var.f1652a;
                } else {
                    Context context = (Context) tVar.f355b;
                    Location location3 = null;
                    if (a.y.i(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (a.y.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (i0.d == null) {
                            i0.d = new i0();
                        }
                        i0 i0Var = i0.d;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z3 = i0Var.f1649c == 1;
                        long j5 = i0Var.f1648b;
                        long j6 = i0Var.f1647a;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j7 = i0Var.f1648b;
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
                        j0Var.f1652a = z3;
                        j0Var.f1653b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.j
    public final void h() {
        switch (this.f1694c) {
            case 0:
                this.d.l(true, true);
                break;
            default:
                this.d.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Context context) {
        super(c0Var);
        this.d = c0Var;
        this.f1695e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
