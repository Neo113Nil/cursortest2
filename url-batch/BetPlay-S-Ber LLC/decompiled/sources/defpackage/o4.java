package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class o4 extends q4 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ t4 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(t4 t4Var, Context context) {
        super(t4Var);
        this.d = t4Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.q4
    public final IntentFilter d() {
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

    @Override // defpackage.q4
    public final int e() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!j4.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                r6 r6Var = (r6) obj;
                k70 k70Var = (k70) r6Var.c;
                LocationManager locationManager = (LocationManager) r6Var.b;
                if (k70Var.b > System.currentTimeMillis()) {
                    z = k70Var.a;
                } else {
                    Context context = (Context) r6Var.d;
                    Location location3 = null;
                    if (op.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (op.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (j70.d == null) {
                            j70.d = new j70();
                        }
                        j70 j70Var = j70.d;
                        j70Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        j70Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = j70Var.c == 1;
                        long j2 = j70Var.b;
                        long j3 = j70Var.a;
                        j70Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = j70Var.b;
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
                        k70Var.a = z;
                        k70Var.b = j;
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

    @Override // defpackage.q4
    public final void g() {
        int i = this.c;
        t4 t4Var = this.d;
        switch (i) {
            case 0:
                t4Var.l(true, true);
                break;
            default:
                t4Var.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(t4 t4Var, r6 r6Var) {
        super(t4Var);
        this.d = t4Var;
        this.e = r6Var;
    }
}
