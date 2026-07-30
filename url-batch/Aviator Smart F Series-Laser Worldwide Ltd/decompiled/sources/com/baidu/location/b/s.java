package com.baidu.location.b;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public List<d> f4875a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private LocationManager f4876b = null;

    /* renamed from: c, reason: collision with root package name */
    private c f4877c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4878d = false;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static s f4879a = new s();
    }

    private class c implements LocationListener {
        private c() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }
            try {
                Iterator<d> it = s.this.f4875a.iterator();
                while (it.hasNext()) {
                    it.next().a(location);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i8, Bundle bundle) {
        }
    }

    public interface d {
        void a(Location location);
    }

    public static s a() {
        return b.f4879a;
    }

    public void b() {
        LocationManager locationManager;
        c cVar = this.f4877c;
        if (cVar == null || (locationManager = this.f4876b) == null) {
            return;
        }
        locationManager.removeUpdates(cVar);
        this.f4877c = null;
    }

    public void a(Context context, Looper looper) {
        try {
            if (this.f4876b == null) {
                this.f4876b = (LocationManager) context.getSystemService("location");
            }
            if (this.f4877c == null) {
                this.f4877c = new c();
            }
            LocationManager locationManager = this.f4876b;
            if (locationManager == null || !locationManager.isProviderEnabled("network")) {
                return;
            }
            this.f4876b.requestLocationUpdates("network", 1000L, 0.0f, this.f4877c, looper);
        } catch (Exception unused) {
        }
    }

    public void a(d dVar) {
        if (dVar == null) {
            return;
        }
        this.f4875a.remove(dVar);
        if (this.f4875a.size() == 0 && this.f4878d) {
            b();
            this.f4878d = false;
        }
    }

    public void a(d dVar, Context context, Looper looper) {
        if (dVar == null) {
            return;
        }
        if (!this.f4875a.contains(dVar)) {
            this.f4875a.add(dVar);
        }
        if (this.f4875a.size() != 1 || this.f4878d) {
            return;
        }
        a(context, looper);
        this.f4878d = true;
    }
}
