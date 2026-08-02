package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Zb implements Wb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6936a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6937b = C0876ua.k().x().c();

    /* renamed from: c, reason: collision with root package name */
    public Mn f6938c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6939d;

    public final void a(Toggle toggle) {
        Mn mn = new Mn(toggle);
        this.f6938c = mn;
        mn.f6351c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Mn mn = this.f6938c;
        if (mn != null) {
            mn.f6350b.b(obj);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.f6937b.execute(new com.startapp.sdk.adsbase.n(this, z, 1));
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.f6937b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Qo
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(Zb.this, locationControllerObserver, z);
            }
        });
    }

    public static final void a(Zb zb, LocationControllerObserver locationControllerObserver, boolean z) {
        zb.f6936a.add(locationControllerObserver);
        if (z) {
            if (zb.f6939d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Zb zb, boolean z) {
        if (zb.f6939d != z) {
            zb.f6939d = z;
            l2.l lVar = z ? Xb.f6863a : Yb.f6901a;
            Iterator it = zb.f6936a.iterator();
            while (it.hasNext()) {
                lVar.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Mn mn = this.f6938c;
        if (mn != null) {
            mn.f6350b.a(obj);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z) {
        Mn mn = this.f6938c;
        if (mn != null) {
            mn.f6349a.a(z);
        } else {
            kotlin.jvm.internal.j.g("togglesHolder");
            throw null;
        }
    }
}
