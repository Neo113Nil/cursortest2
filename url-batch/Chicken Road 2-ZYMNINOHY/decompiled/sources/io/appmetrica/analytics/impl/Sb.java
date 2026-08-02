package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class Sb implements Pb, ToggleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10938a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f10939b = C0817na.k().w().b();

    /* renamed from: c, reason: collision with root package name */
    public Kn f10940c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10941d;

    public final void a(Toggle toggle) {
        Kn kn = new Kn(toggle);
        this.f10940c = kn;
        kn.f10543c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Kn kn = this.f10940c;
        if (kn != null) {
            kn.f10542b.b(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.f10939b.execute(new c0.p(this, z, 2));
    }

    public final void a(final LocationControllerObserver locationControllerObserver, final boolean z) {
        this.f10939b.execute(new Runnable() { // from class: io.appmetrica.analytics.impl.Oo
            @Override // java.lang.Runnable
            public final void run() {
                Sb.a(Sb.this, locationControllerObserver, z);
            }
        });
    }

    public static final void a(Sb sb, LocationControllerObserver locationControllerObserver, boolean z) {
        sb.f10938a.add(locationControllerObserver);
        if (z) {
            if (sb.f10941d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Sb sb, boolean z) {
        if (sb.f10941d != z) {
            sb.f10941d = z;
            InterfaceC1339l interfaceC1339l = z ? Qb.f10838a : Rb.f10882a;
            ArrayList arrayList = sb.f10938a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                interfaceC1339l.invoke((LocationControllerObserver) obj);
            }
        }
    }

    public final void a(Object obj) {
        Kn kn = this.f10940c;
        if (kn != null) {
            kn.f10542b.a(obj);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z) {
        Kn kn = this.f10940c;
        if (kn != null) {
            kn.f10541a.a(z);
        } else {
            kotlin.jvm.internal.i.i("togglesHolder");
            throw null;
        }
    }
}
