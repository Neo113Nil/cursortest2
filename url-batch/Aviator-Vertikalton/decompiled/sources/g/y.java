package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.AbstractC0050g;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class y extends AbstractC0050g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2602c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0141C f2603d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C, T.r rVar) {
        super(layoutInflaterFactory2C0141C);
        this.f2603d = layoutInflaterFactory2C0141C;
        this.f2604e = rVar;
    }

    @Override // androidx.fragment.app.AbstractC0050g
    public final IntentFilter e() {
        switch (this.f2602c) {
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

    @Override // androidx.fragment.app.AbstractC0050g
    public final int f() {
        Location location;
        boolean z2;
        long j2;
        Location location2;
        switch (this.f2602c) {
            case 0:
                return u.a((PowerManager) this.f2604e) ? 2 : 1;
            default:
                T.r rVar = (T.r) this.f2604e;
                L l2 = (L) rVar.f812d;
                if (l2.f2509b > System.currentTimeMillis()) {
                    z2 = l2.f2508a;
                } else {
                    Context context = (Context) rVar.f810b;
                    int g2 = q1.l.g("android.permission.ACCESS_COARSE_LOCATION", context);
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) rVar.f811c;
                    if (g2 == 0) {
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
                    if (q1.l.g("android.permission.ACCESS_FINE_LOCATION", context) == 0) {
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
                        if (K.f2504d == null) {
                            K.f2504d = new K();
                        }
                        K k2 = K.f2504d;
                        k2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        k2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = k2.f2507c == 1;
                        long j3 = k2.f2506b;
                        long j4 = k2.f2505a;
                        k2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = k2.f2506b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        l2.f2508a = z2;
                        l2.f2509b = j2;
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

    @Override // androidx.fragment.app.AbstractC0050g
    public final void h() {
        switch (this.f2602c) {
            case 0:
                this.f2603d.o(true, true);
                break;
            default:
                this.f2603d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C0141C layoutInflaterFactory2C0141C, Context context) {
        super(layoutInflaterFactory2C0141C);
        this.f2603d = layoutInflaterFactory2C0141C;
        this.f2604e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
