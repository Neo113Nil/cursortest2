package com.baidu.platform.comapi.h.f;

import android.content.Context;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.map.MessageCenter;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.github.mikephil.charting.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.comapi.walknavi.a {

    /* renamed from: a, reason: collision with root package name */
    private static GeoPoint f9056a = new GeoPoint(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);

    /* renamed from: b, reason: collision with root package name */
    public static int f9057b = 0;

    /* renamed from: g, reason: collision with root package name */
    private List<com.baidu.platform.comapi.h.f.a> f9062g;

    /* renamed from: j, reason: collision with root package name */
    private com.baidu.platform.comapi.h.f.c f9065j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f9066k;

    /* renamed from: l, reason: collision with root package name */
    private Context f9067l;

    /* renamed from: m, reason: collision with root package name */
    private long f9068m;

    /* renamed from: c, reason: collision with root package name */
    private WLocData f9058c = null;

    /* renamed from: d, reason: collision with root package name */
    private WLocData f9059d = new WLocData();

    /* renamed from: e, reason: collision with root package name */
    private LocationManager f9060e = null;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<com.baidu.platform.comapi.h.f.b> f9061f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f9063h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9064i = false;

    /* renamed from: n, reason: collision with root package name */
    private long f9069n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f9070o = 2;

    /* renamed from: p, reason: collision with root package name */
    private int f9071p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f9072q = 0;

    /* renamed from: r, reason: collision with root package name */
    private long f9073r = 0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9074s = false;

    /* renamed from: t, reason: collision with root package name */
    private GpsStatus.Listener f9075t = new a();

    /* renamed from: u, reason: collision with root package name */
    private int f9076u = 0;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9077v = false;

    /* renamed from: w, reason: collision with root package name */
    private Location f9078w = null;

    /* renamed from: x, reason: collision with root package name */
    private LocationListener f9079x = new b();

    /* renamed from: y, reason: collision with root package name */
    private LocationListener f9080y = new c();

    class a implements GpsStatus.Listener {
        a() {
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i8) {
            d.this.f9070o = i8;
            if (d.this.f9070o == 4) {
                d.this.f9069n = SystemClock.elapsedRealtime();
            }
        }
    }

    class b implements LocationListener {
        b() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null || com.baidu.platform.comapi.h.c.b().f() || d.this.f9064i) {
                return;
            }
            if (d.this.f9078w != null) {
                d dVar = d.this;
                if (dVar.a(location, dVar.f9078w)) {
                    d.this.f9078w = location;
                }
                d dVar2 = d.this;
                dVar2.a(dVar2.f9078w);
            } else {
                d.this.a(location);
            }
            d dVar3 = d.this;
            dVar3.a(dVar3.f9059d, "gps");
            d.this.f9063h = true;
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            if (d.this.f9062g == null) {
                return;
            }
            for (int i8 = 0; i8 < d.this.f9062g.size(); i8++) {
                com.baidu.platform.comapi.h.f.a aVar = (com.baidu.platform.comapi.h.f.a) d.this.f9062g.get(i8);
                if (aVar != null) {
                    aVar.b(5);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            if (d.this.f9062g == null) {
                return;
            }
            for (int i8 = 0; i8 < d.this.f9062g.size(); i8++) {
                com.baidu.platform.comapi.h.f.a aVar = (com.baidu.platform.comapi.h.f.a) d.this.f9062g.get(i8);
                if (aVar != null) {
                    aVar.b(4);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i8, Bundle bundle) {
        }
    }

    class c implements LocationListener {
        c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location != null) {
                if (d.this.f9078w != null) {
                    d dVar = d.this;
                    if (dVar.a(location, dVar.f9078w)) {
                        d.this.f9078w = location;
                    }
                    d dVar2 = d.this;
                    dVar2.a(dVar2.f9078w);
                } else {
                    d.this.a(location);
                }
                d dVar3 = d.this;
                dVar3.a(dVar3.f9059d, "net");
                d.this.f9063h = true;
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            if (d.this.f9062g == null) {
                return;
            }
            for (int i8 = 0; i8 < d.this.f9062g.size(); i8++) {
                com.baidu.platform.comapi.h.f.a aVar = (com.baidu.platform.comapi.h.f.a) d.this.f9062g.get(i8);
                if (aVar != null) {
                    aVar.b(5);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            if (d.this.f9062g == null) {
                return;
            }
            for (int i8 = 0; i8 < d.this.f9062g.size(); i8++) {
                com.baidu.platform.comapi.h.f.a aVar = (com.baidu.platform.comapi.h.f.a) d.this.f9062g.get(i8);
                if (aVar != null) {
                    aVar.b(4);
                }
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i8, Bundle bundle) {
        }
    }

    /* renamed from: com.baidu.platform.comapi.h.f.d$d, reason: collision with other inner class name */
    private class HandlerC0106d extends Handler {
        private HandlerC0106d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 4103) {
                if (d.this.f9062g != null) {
                    for (com.baidu.platform.comapi.h.f.a aVar : d.this.f9062g) {
                        if (aVar != null) {
                            aVar.e(message);
                        }
                    }
                }
                if (message.arg1 == 0) {
                    d.this.f9063h = false;
                }
            }
        }

        /* synthetic */ HandlerC0106d(d dVar, a aVar) {
            this();
        }
    }

    private void f() {
        this.f9073r = 0L;
        this.f9072q = 0;
        this.f9071p = 0;
        this.f9069n = 0L;
        this.f9070o = 2;
    }

    public boolean e() {
        return this.f9074s;
    }

    public synchronized void g() {
        try {
            LocationManager locationManager = this.f9060e;
            if (locationManager != null) {
                locationManager.removeUpdates(this.f9079x);
            }
        } catch (Exception unused) {
        }
        try {
            LocationManager locationManager2 = this.f9060e;
            if (locationManager2 != null) {
                locationManager2.removeGpsStatusListener(this.f9075t);
            }
        } catch (Exception e8) {
            com.baidu.platform.comapi.h.g.a.b(e8.getMessage());
        }
        this.f9063h = false;
        this.f9079x = null;
        this.f9075t = null;
        this.f9060e = null;
    }

    public synchronized void h() {
        try {
            MessageCenter.unregistMessage(4103, this.f9066k);
            g();
            ArrayList<com.baidu.platform.comapi.h.f.b> arrayList = this.f9061f;
            if (arrayList != null) {
                arrayList.clear();
            }
            List<com.baidu.platform.comapi.h.f.a> list = this.f9062g;
            if (list != null) {
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
        h();
        if (this.f9066k != null) {
            this.f9066k = null;
        }
        this.f9067l = null;
    }

    public GeoPoint c() {
        return new GeoPoint(f9056a.getLatitudeE6(), f9056a.getLongitudeE6());
    }

    public boolean d() {
        LocationManager locationManager = this.f9060e;
        if (locationManager == null) {
            return false;
        }
        try {
            return locationManager.isProviderEnabled("gps");
        } catch (Exception e8) {
            com.baidu.platform.comapi.h.g.a.b(e8.getMessage());
            return false;
        }
    }

    public void b(com.baidu.platform.comapi.h.f.a aVar) {
        List<com.baidu.platform.comapi.h.f.a> list = this.f9062g;
        if (list == null || aVar == null) {
            return;
        }
        list.remove(aVar);
    }

    public synchronized void c(Context context) {
        b(context);
    }

    public void b(com.baidu.platform.comapi.h.f.b bVar) {
        this.f9061f.remove(bVar);
    }

    public WLocData b() {
        GeoPoint ll2mc;
        WLocData wLocData;
        synchronized (this.f9059d) {
            try {
                WLocData wLocData2 = this.f9059d;
                new GeoPoint(wLocData2.latitude, wLocData2.longitude);
                WLocData wLocData3 = this.f9059d;
                int i8 = wLocData3.coordType;
                if (i8 == 2) {
                    WLocData wLocData4 = this.f9059d;
                    ll2mc = CoordUtil.ll2mc(new LatLng(wLocData4.latitude, wLocData4.longitude));
                } else if (i8 == 3) {
                    ll2mc = CoordUtil.ll2mc(CoordUtil.Coordinate_encryptEx((float) wLocData3.longitude, (float) wLocData3.latitude, "gcj02"));
                } else {
                    ll2mc = i8 == 0 ? CoordUtil.ll2mc(CoordUtil.Coordinate_encryptEx((float) wLocData3.longitude, (float) wLocData3.latitude, "wgs84")) : null;
                }
                WLocData m124clone = this.f9059d.m124clone();
                this.f9058c = m124clone;
                if (ll2mc != null) {
                    m124clone.longitude = ll2mc.getLongitudeE6();
                    this.f9058c.latitude = ll2mc.getLatitudeE6();
                    this.f9058c.coordType = this.f9059d.coordType;
                }
                wLocData = this.f9058c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wLocData;
    }

    public synchronized void a(Context context) {
        try {
            this.f9067l = context;
            if (this.f9060e == null) {
                this.f9060e = (LocationManager) context.getSystemService("location");
            }
            HandlerC0106d handlerC0106d = new HandlerC0106d(this, null);
            this.f9066k = handlerC0106d;
            MessageCenter.registMessage(4103, handlerC0106d);
            this.f9068m = System.currentTimeMillis();
            this.f9074s = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(com.baidu.platform.comapi.h.f.b bVar) {
        this.f9061f.add(bVar);
    }

    public void a(com.baidu.platform.comapi.h.f.a aVar) {
        if (this.f9062g == null) {
            this.f9062g = new LinkedList();
        }
        this.f9062g.add(aVar);
    }

    public LatLng a(WLocData wLocData) {
        if (wLocData == null) {
            return null;
        }
        int i8 = wLocData.coordType;
        if (i8 == 2) {
            return new LatLng(wLocData.latitude, wLocData.longitude);
        }
        if (i8 == 3) {
            return CoordUtil.Coordinate_encryptEx((float) wLocData.longitude, (float) wLocData.latitude, "gcj02");
        }
        if (i8 == 0) {
            return CoordUtil.Coordinate_encryptEx((float) wLocData.longitude, (float) wLocData.latitude, "wgs84");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Location location) {
        WLocData wLocData;
        if (location == null || (wLocData = this.f9059d) == null) {
            return;
        }
        wLocData.latitude = location.getLatitude();
        this.f9059d.longitude = location.getLongitude();
        this.f9059d.speed = location.getSpeed();
        this.f9059d.accuracy = Math.min(2000.0f, location.getAccuracy());
        this.f9059d.direction = location.getBearing();
        this.f9059d.altitude = location.getAltitude();
        this.f9059d.coordType = 0;
    }

    private void b(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f9063h = false;
            LocationManager locationManager = this.f9060e;
            if (locationManager == null) {
                this.f9060e = (LocationManager) context.getSystemService("location");
            } else {
                locationManager.removeUpdates(this.f9079x);
            }
            this.f9060e.requestLocationUpdates("gps", 0L, 0.0f, this.f9079x);
            this.f9060e.addGpsStatusListener(this.f9075t);
            f();
        } catch (Exception unused) {
        }
    }

    public void b(WLocData wLocData) {
        com.baidu.platform.comapi.h.f.c cVar;
        this.f9064i = true;
        com.baidu.platform.comapi.h.c.b().f();
        if (wLocData.accuracy < 80.0f) {
            try {
                WLocData m124clone = wLocData.m124clone();
                this.f9059d = m124clone;
                a(m124clone, "sdk");
                if (!wLocData.isIndoorMode) {
                    f9057b = 0;
                    return;
                }
                int i8 = f9057b + 1;
                f9057b = i8;
                if (i8 <= 3 || (cVar = this.f9065j) == null) {
                    return;
                }
                cVar.a();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WLocData wLocData, String str) {
        GeoPoint geoPoint;
        ArrayList arrayList;
        if (wLocData == null) {
            return;
        }
        try {
            this.f9058c = wLocData.m124clone();
            int i8 = wLocData.coordType;
            if (i8 == 0) {
                geoPoint = com.baidu.platform.comapi.h.t.b.a(wLocData.longitude, wLocData.latitude);
            } else if (i8 == 3) {
                geoPoint = new GeoPoint((int) (wLocData.latitude * 100000.0d), (int) (wLocData.longitude * 100000.0d));
            } else {
                geoPoint = i8 == 2 ? new GeoPoint(wLocData.latitude, wLocData.longitude) : null;
            }
            if (geoPoint != null) {
                f9056a.setLongitudeE6(geoPoint.getLongitudeE6());
                f9056a.setLatitudeE6(geoPoint.getLatitudeE6());
            }
            synchronized (this.f9061f) {
                arrayList = new ArrayList(this.f9061f);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.baidu.platform.comapi.h.f.b bVar = (com.baidu.platform.comapi.h.f.b) it.next();
                if (bVar != null) {
                    bVar.a(this.f9058c);
                }
            }
        } catch (Exception unused) {
        }
    }

    protected boolean a(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z7 = time > 120000;
        boolean z8 = time < -120000;
        boolean z9 = time > 0;
        if (z7) {
            return true;
        }
        if (z8) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z10 = accuracy > 0;
        boolean z11 = accuracy < 0;
        boolean z12 = accuracy > 200;
        boolean a8 = a(location.getProvider(), location2.getProvider());
        if (z11) {
            return true;
        }
        if (!z9 || z10) {
            return z9 && !z12 && a8;
        }
        return true;
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }
}
