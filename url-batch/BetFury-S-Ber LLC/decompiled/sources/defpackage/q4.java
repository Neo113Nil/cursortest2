package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class q4 extends s4 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ v4 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(v4 v4Var, Context context) {
        super(v4Var);
        this.d = v4Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.s4
    public final IntentFilter e() {
        switch (this.c) {
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

    @Override // defpackage.s4
    public final int f() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!l4.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                s6 s6Var = (s6) obj;
                fk0 fk0Var = (fk0) s6Var.c;
                LocationManager locationManager = (LocationManager) s6Var.b;
                if (fk0Var.b > System.currentTimeMillis()) {
                    z = fk0Var.a;
                } else {
                    Context context = (Context) s6Var.d;
                    Location location3 = null;
                    if (n9.c(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (n9.c(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (ek0.d == null) {
                            ek0.d = new ek0();
                        }
                        ek0 ek0Var = ek0.d;
                        ek0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        ek0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = ek0Var.c == 1;
                        long j2 = ek0Var.b;
                        long j3 = ek0Var.a;
                        ek0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = ek0Var.b;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        fk0Var.a = z;
                        fk0Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // defpackage.s4
    public final void h() {
        int i = this.c;
        v4 v4Var = this.d;
        switch (i) {
            case 0:
                v4Var.m(true, true);
                break;
            default:
                v4Var.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(v4 v4Var, s6 s6Var) {
        super(v4Var);
        this.d = v4Var;
        this.e = s6Var;
    }
}
