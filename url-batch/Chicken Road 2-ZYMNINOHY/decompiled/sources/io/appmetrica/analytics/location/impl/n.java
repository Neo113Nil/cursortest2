package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f13153a;

    public n(p pVar) {
        this.f13153a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f13153a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f13159e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f13155a.f13132a);
                tVar2.f13166c.add(pVar.f13157c);
                Iterator it = pVar.f13158d.iterator();
                while (it.hasNext()) {
                    tVar2.f13166c.add((Consumer) it.next());
                }
                pVar.f13159e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f13164a = pVar.f13155a.f13132a;
            }
            if (tVar.f13167d != null) {
                boolean didTimePassMillis = tVar.f13165b.didTimePassMillis(tVar.f13168e, tVar.f13164a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z = location.distanceTo(tVar.f13167d) > tVar.f13164a.getUpdateDistanceInterval();
                boolean z4 = tVar.f13167d == null || location.getTime() - tVar.f13167d.getTime() >= 0;
                if ((!didTimePassMillis && !z) || !z4) {
                    return;
                }
            }
            tVar.f13167d = location;
            tVar.f13168e = System.currentTimeMillis();
            Iterator it2 = tVar.f13166c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
    }
}
