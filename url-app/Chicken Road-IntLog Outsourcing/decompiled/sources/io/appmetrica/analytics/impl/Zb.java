package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Zb implements Wb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7776a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f7777b = C1027ua.k().x().c();

    /* renamed from: c, reason: collision with root package name */
    public Mn f7778c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7779d;

    public final void a(Toggle toggle) {
        Mn mn = new Mn(toggle);
        this.f7778c = mn;
        mn.f7161c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Mn mn = this.f7778c;
        if (mn != null) {
            mn.f7160b.b(obj);
        } else {
            kotlin.jvm.internal.i.l("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(final boolean z) {
        this.f7777b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Qo
            @Override // java.lang.Runnable
            public final void run() {
                Zb.a(Zb.this, z);
            }
        });
    }

    public final void a(LocationControllerObserver locationControllerObserver, boolean z) {
        this.f7777b.execute(new f2.q(this, locationControllerObserver, z));
    }

    public static final void a(Zb zb, LocationControllerObserver locationControllerObserver, boolean z) {
        zb.f7776a.add(locationControllerObserver);
        if (z) {
            if (zb.f7779d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Zb zb, boolean z) {
        if (zb.f7779d != z) {
            zb.f7779d = z;
            InterfaceC1441l interfaceC1441l = z ? Xb.f7700a : Yb.f7740a;
            Iterator it = zb.f7776a.iterator();
            while (it.hasNext()) {
                interfaceC1441l.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Mn mn = this.f7778c;
        if (mn != null) {
            mn.f7160b.a(obj);
        } else {
            kotlin.jvm.internal.i.l("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z) {
        Mn mn = this.f7778c;
        if (mn != null) {
            mn.f7159a.a(z);
        } else {
            kotlin.jvm.internal.i.l("togglesHolder");
            throw null;
        }
    }
}
