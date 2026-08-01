package f;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class x extends androidx.fragment.app.j {
    public final /* synthetic */ int c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f1652d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, androidx.emoji2.text.s sVar) {
        super(b0Var);
        this.f1652d = b0Var;
        this.f1653e = sVar;
    }

    @Override // androidx.fragment.app.j
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

    @Override // androidx.fragment.app.j
    public final int f() {
        Location location;
        boolean z3;
        long j4;
        Location location2;
        switch (this.c) {
            case 0:
                return t.a((PowerManager) this.f1653e) ? 2 : 1;
            default:
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.f1653e;
                i0 i0Var = (i0) sVar.f358d;
                LocationManager locationManager = (LocationManager) sVar.c;
                if (i0Var.f1609b > System.currentTimeMillis()) {
                    z3 = i0Var.f1608a;
                } else {
                    Context context = (Context) sVar.f357b;
                    Location location3 = null;
                    if (k3.m.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (k3.m.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (h0.f1602d == null) {
                            h0.f1602d = new h0();
                        }
                        h0 h0Var = h0.f1602d;
                        h0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        h0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z3 = h0Var.c == 1;
                        long j5 = h0Var.f1604b;
                        long j6 = h0Var.f1603a;
                        h0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j7 = h0Var.f1604b;
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
                        i0Var.f1608a = z3;
                        i0Var.f1609b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // androidx.fragment.app.j
    public final void h() {
        switch (this.c) {
            case 0:
                this.f1652d.m(true, true);
                break;
            default:
                this.f1652d.m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(b0 b0Var, Context context) {
        super(b0Var);
        this.f1652d = b0Var;
        this.f1653e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
