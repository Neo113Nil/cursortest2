package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final p f40455a;

    public n(p pVar) {
        this.f40455a = pVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f40455a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f40461e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f40457a.f40434a);
                tVar2.f40468c.add(pVar.f40459c);
                Iterator it = pVar.f40460d.iterator();
                while (it.hasNext()) {
                    tVar2.f40468c.add((Consumer) it.next());
                }
                pVar.f40461e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f40466a = pVar.f40457a.f40434a;
            }
            if (tVar.f40469d != null) {
                boolean didTimePassMillis = tVar.f40467b.didTimePassMillis(tVar.f40470e, tVar.f40466a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z4 = location.distanceTo(tVar.f40469d) > tVar.f40466a.getUpdateDistanceInterval();
                boolean z5 = tVar.f40469d == null || location.getTime() - tVar.f40469d.getTime() >= 0;
                if ((!didTimePassMillis && !z4) || !z5) {
                    return;
                }
            }
            tVar.f40469d = location;
            tVar.f40470e = System.currentTimeMillis();
            Iterator it2 = tVar.f40468c.iterator();
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
