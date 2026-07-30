package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mf extends b90 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ qf d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(qf qfVar, Context context) {
        super(qfVar);
        this.d = qfVar;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b90
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

    @Override // defpackage.b90
    public final int g() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.c;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (!hf.a((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                mh mhVar = (mh) obj;
                j03 j03Var = (j03) mhVar.o;
                LocationManager locationManager = (LocationManager) mhVar.n;
                if (j03Var.b > System.currentTimeMillis()) {
                    z = j03Var.a;
                } else {
                    Context context = (Context) mhVar.p;
                    Location location3 = null;
                    if (iv1.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (iv1.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (i03.d == null) {
                            i03.d = new i03();
                        }
                        i03 i03Var = i03.d;
                        i03Var.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        i03Var.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = i03Var.c == 1;
                        long j2 = i03Var.b;
                        long j3 = i03Var.a;
                        i03Var.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = i03Var.b;
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
                        j03Var.a = z;
                        j03Var.b = j;
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

    @Override // defpackage.b90
    public final void l() {
        int i = this.c;
        qf qfVar = this.d;
        switch (i) {
            case 0:
                qfVar.q(true, true);
                break;
            default:
                qfVar.q(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(qf qfVar, mh mhVar) {
        super(qfVar);
        this.d = qfVar;
        this.e = mhVar;
    }
}
