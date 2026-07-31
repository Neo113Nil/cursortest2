package io.appmetrica.analytics.impl;

import W1.AbstractC1233c;
import android.os.Bundle;
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
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.u4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3004u4 {

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2564d6 f39892c;

    /* renamed from: a, reason: collision with root package name */
    public final C2978t4 f39890a = new C2978t4();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f39891b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f39893d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th) {
        C2551ck c2551ck = Bj.f37257a;
        Map mapOf = MapsKt.mapOf(TuplesKt.to(str, MapsKt.mapOf(TuplesKt.to(str2, AbstractC1233c.b(th)))));
        c2551ck.getClass();
        c2551ck.a(new C2524bk("client_module_errors", mapOf));
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        C2644g6 c2644g6;
        InterfaceC2564d6 interfaceC2564d6 = this.f39892c;
        if (interfaceC2564d6 == null || (c2644g6 = ((C2642g4) interfaceC2564d6).f39033b) == null) {
            return null;
        }
        return c2644g6.f39041a;
    }

    public final void c() {
        Iterator it = this.f39891b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f39893d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f39891b;
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
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int size2 = arrayList2.size();
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            arrayList3.add(((AdRevenueCollector) obj2).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    @NotNull
    public final List<String> a() {
        return this.f39893d;
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f39891b.add(moduleClientEntryPoint);
    }

    public final void a(@NotNull InterfaceC2564d6 interfaceC2564d6) {
        this.f39892c = interfaceC2564d6;
        HashSet hashSet = new HashSet();
        Iterator it = this.f39891b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(interfaceC2564d6);
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f39891b.removeAll(hashSet);
    }

    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f39891b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C2978t4 c2978t4 = this.f39890a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c2978t4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C2952s4 c2952s4 = bundle2 != null ? new C2952s4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c2952s4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c2952s4);
                    }
                }
            } catch (Throwable th) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
