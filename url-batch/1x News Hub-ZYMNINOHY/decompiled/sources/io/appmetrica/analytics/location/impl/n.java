package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f8758a;

    public n(p pVar) {
        this.f8758a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f8758a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f8764e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f8760a.f8739a);
                tVar2.f8770c.add(pVar.f8762c);
                Iterator it = pVar.f8763d.iterator();
                while (it.hasNext()) {
                    tVar2.f8770c.add((Consumer) it.next());
                }
                pVar.f8764e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f8768a = pVar.f8760a.f8739a;
            }
            if (tVar.f8771d != null) {
                boolean didTimePassMillis = tVar.f8769b.didTimePassMillis(tVar.f8772e, tVar.f8768a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z = location.distanceTo(tVar.f8771d) > tVar.f8768a.getUpdateDistanceInterval();
                boolean z2 = tVar.f8771d == null || location.getTime() - tVar.f8771d.getTime() >= 0;
                if ((!didTimePassMillis && !z) || !z2) {
                    return;
                }
            }
            tVar.f8771d = location;
            tVar.f8772e = System.currentTimeMillis();
            Iterator it2 = tVar.f8770c.iterator();
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
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
    }
}
