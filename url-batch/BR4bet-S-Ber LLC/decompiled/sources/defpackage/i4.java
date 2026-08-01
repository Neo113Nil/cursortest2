package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i4 extends k4 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ n4 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(n4 n4Var, Context context) {
        super(n4Var);
        this.d = n4Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.k4
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

    @Override // defpackage.k4
    public final int f() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!d4.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                k6 k6Var = (k6) obj;
                ka0 ka0Var = (ka0) k6Var.h;
                LocationManager locationManager = (LocationManager) k6Var.g;
                if (ka0Var.b > System.currentTimeMillis()) {
                    z = ka0Var.a;
                } else {
                    Context context = (Context) k6Var.i;
                    Location location3 = null;
                    if (la0.l(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (la0.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (ja0.d == null) {
                            ja0.d = new ja0();
                        }
                        ja0 ja0Var = ja0.d;
                        ja0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        ja0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = ja0Var.c == 1;
                        long j2 = ja0Var.b;
                        long j3 = ja0Var.a;
                        ja0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = ja0Var.b;
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
                        ka0Var.a = z;
                        ka0Var.b = j;
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

    @Override // defpackage.k4
    public final void h() {
        int i = this.c;
        n4 n4Var = this.d;
        switch (i) {
            case 0:
                n4Var.l(true, true);
                break;
            default:
                n4Var.l(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(n4 n4Var, k6 k6Var) {
        super(n4Var);
        this.d = n4Var;
        this.e = k6Var;
    }
}
