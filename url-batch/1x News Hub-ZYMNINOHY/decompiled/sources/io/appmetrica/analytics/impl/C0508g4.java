package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
import android.os.Bundle;
import b2.C0190d;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508g4 {

    /* renamed from: c, reason: collision with root package name */
    public O5 f7354c;

    /* renamed from: a, reason: collision with root package name */
    public final C0482f4 f7352a = new C0482f4();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f7353b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f7355d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        Vj vj = AbstractC0859tj.f8379a;
        Map a02 = c2.q.a0(new C0190d(str, c2.q.a0(new C0190d(str2, AbstractC0129a.D(th)))));
        vj.getClass();
        vj.a(new Uj("client_module_errors", a02));
    }

    public final ModuleAdRevenueProcessor b() {
        R5 r5;
        O5 o5 = this.f7354c;
        if (o5 == null || (r5 = ((S3) o5).f6589b) == null) {
            return null;
        }
        return r5.f6539a;
    }

    public final void c() {
        Iterator it = this.f7353b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f7355d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f7353b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(c2.g.N(arrayList2));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    public final List<String> a() {
        return this.f7355d;
    }

    public final void a(ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f7353b.add(moduleClientEntryPoint);
    }

    public final void a(O5 o5) {
        this.f7354c = o5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f7353b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(o5);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f7353b.removeAll(hashSet);
    }

    public final void a(Bundle bundle, SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f7353b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C0482f4 c0482f4 = this.f7352a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c0482f4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C0456e4 c0456e4 = bundle2 != null ? new C0456e4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c0456e4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c0456e4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
