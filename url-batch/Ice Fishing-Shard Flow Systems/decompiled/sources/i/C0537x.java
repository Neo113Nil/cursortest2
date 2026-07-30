package i;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* renamed from: i.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537x extends AbstractC0538y {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5490c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0500B f5491d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537x(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B, D0.j jVar) {
        super(layoutInflaterFactory2C0500B);
        this.f5491d = layoutInflaterFactory2C0500B;
        this.f5492e = jVar;
    }

    @Override // i.AbstractC0538y
    public final IntentFilter d() {
        switch (this.f5490c) {
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

    @Override // i.AbstractC0538y
    public final int e() {
        Location location;
        boolean z7;
        long j;
        Location location2;
        switch (this.f5490c) {
            case 0:
                return ((PowerManager) this.f5492e).isPowerSaveMode() ? 2 : 1;
            default:
                D0.j jVar = (D0.j) this.f5492e;
                C0509K c0509k = (C0509K) jVar.f332l;
                LocationManager locationManager = (LocationManager) jVar.f331i;
                if (c0509k.f5378b > System.currentTimeMillis()) {
                    z7 = c0509k.f5377a;
                } else {
                    Context context = (Context) jVar.f330e;
                    Location location3 = null;
                    if (P0.f.l(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
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
                    if (P0.f.l(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (L6.a.f1702e == null) {
                            L6.a.f1702e = new L6.a();
                        }
                        L6.a aVar = L6.a.f1702e;
                        aVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        aVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z7 = aVar.f1706d == 1;
                        long j7 = aVar.f1705c;
                        long j8 = aVar.f1704b;
                        aVar.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j9 = aVar.f1705c;
                        if (j7 == -1 || j8 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j8) {
                                j7 = j9;
                            } else if (currentTimeMillis > j7) {
                                j7 = j8;
                            }
                            j = j7 + 60000;
                        }
                        c0509k.f5377a = z7;
                        c0509k.f5378b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z7 = true;
                        }
                    }
                }
                return z7 ? 2 : 1;
        }
    }

    @Override // i.AbstractC0538y
    public final void g() {
        switch (this.f5490c) {
            case 0:
                this.f5491d.o(true, true);
                break;
            default:
                this.f5491d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0537x(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B, Context context) {
        super(layoutInflaterFactory2C0500B);
        this.f5491d = layoutInflaterFactory2C0500B;
        this.f5492e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
