package io.appmetrica.analytics.impl;

import android.os.Bundle;
import c3.C0292d;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: c, reason: collision with root package name */
    public H5 f11285c;

    /* renamed from: a, reason: collision with root package name */
    public final X3 f11283a = new X3();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f11284b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f11286d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        Qj qj = AbstractC0852oj.f12527a;
        Map A4 = d3.u.A(new C0292d(str, d3.u.A(new C0292d(str2, O3.d.D(th)))));
        qj.getClass();
        qj.a(new Pj("client_module_errors", A4));
    }

    public final ModuleAdRevenueProcessor b() {
        K5 k5;
        H5 h5 = this.f11285c;
        if (h5 == null || (k5 = ((K3) h5).f10509b) == null) {
            return null;
        }
        return k5.f10518a;
    }

    public final void c() {
        Iterator it = this.f11284b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f11286d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f11284b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(d3.k.Y(arrayList2));
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            arrayList3.add(((AdRevenueCollector) obj2).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(d3.i.n0(new LinkedHashSet(arrayList3)));
    }

    public final List<String> a() {
        return this.f11286d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f11284b.add(moduleClientEntryPoint);
    }

    public final void a(H5 h5) {
        this.f11285c = h5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f11284b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(h5);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.f11284b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f11284b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    X3 x32 = this.f11283a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    x32.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    W3 w32 = bundle2 != null ? new W3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (w32 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(w32);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
