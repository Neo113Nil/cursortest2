package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import c3.C0292d;
import c3.C0297i;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1086xk implements Pc, InterfaceC0751km, AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final String f13036a = "rp";

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13037b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f13038c = new A7();

    public static void a(String str, String str2, Throwable th) {
        Qj qj = AbstractC0852oj.f12527a;
        Map A4 = d3.u.A(new C0292d(str, d3.u.A(new C0292d(str2, O3.d.D(th)))));
        qj.getClass();
        qj.a(new Pj("service_module_errors", A4));
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<ModuleServicesDatabase> b() {
        Object obj;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13037b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                obj = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th);
                obj = C0297i.f5732a;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Map<String, Yc> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13037b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            C0292d c0292d = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    c0292d = new C0292d(moduleServiceEntryPoint.getIdentifier(), new Yc(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (c0292d != null) {
                arrayList.add(c0292d);
            }
        }
        Map<String, Yc> F4 = d3.t.F(arrayList);
        a(hashSet);
        return F4;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Map<String, Integer> d() {
        List list;
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        Map<String, Integer> blocks;
        d3.q qVar = d3.q.f8333a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13037b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (blocks = remoteConfigExtensionConfiguration.getBlocks()) != null) {
                list = d3.t.E(blocks);
                d3.o.Z(arrayList, list);
            }
            list = qVar;
            d3.o.Z(arrayList, list);
        }
        Map<String, Integer> F4 = d3.t.F(arrayList);
        a(hashSet);
        return F4;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13037b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Consumer<Location> consumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    consumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (consumer != null) {
                arrayList.add(consumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController moduleLocationSourcesServiceController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f13037b.iterator();
        do {
            moduleLocationSourcesServiceController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    moduleLocationSourcesServiceController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (moduleLocationSourcesServiceController == null);
        a(hashSet);
        return moduleLocationSourcesServiceController;
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Toggle g() {
        Toggle toggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f13037b.iterator();
        do {
            toggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    toggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (toggle == null);
        a(hashSet);
        return toggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f13038c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final List<String> h() {
        RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration;
        d3.q qVar = d3.q.f8333a;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13037b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "features", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (remoteConfigExtensionConfiguration != null && (r4 = remoteConfigExtensionConfiguration.getFeatures()) != null) {
                d3.o.Z(arrayList, r4);
            }
            List<String> list = qVar;
            d3.o.Z(arrayList, list);
        }
        a(hashSet);
        return arrayList;
    }

    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        Iterator it = this.f13037b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            Bundle bundle2 = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    bundle2 = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (bundle2 != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), bundle2);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f13037b.add(moduleServiceEntryPoint);
        if (kotlin.jvm.internal.i.a(this.f13036a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f13038c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0751km
    public final void a(C0622fm c0622fm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c0622fm.f11863d, c0622fm.f11860a, c0622fm.f11861b);
        Kg kg = new Kg(c0622fm.v, c0622fm.f11878u);
        Iterator it = this.f13037b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C1008uk(sdkIdentifiers, kg, c0622fm.f11858A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th);
            }
        }
        a(hashSet);
    }

    public final void a(ServiceContext serviceContext, C0622fm c0622fm) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f13037b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C1008uk(new SdkIdentifiers(c0622fm.f11863d, c0622fm.f11860a, c0622fm.f11861b), new Kg(c0622fm.v, c0622fm.f11878u), c0622fm.f11858A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    Uc uc = C0817na.f12417I.f12443t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (uc) {
                        uc.f11048a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                a(moduleServiceEntryPoint.getIdentifier(), "init", th);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f13037b.removeAll(hashSet);
    }
}
