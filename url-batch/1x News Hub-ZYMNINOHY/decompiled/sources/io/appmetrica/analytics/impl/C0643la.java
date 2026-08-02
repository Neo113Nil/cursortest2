package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643la {

    /* renamed from: d, reason: collision with root package name */
    public static final C0643la f7816d = new C0643la();

    /* renamed from: a, reason: collision with root package name */
    public final C1007zd f7817a = new C1007zd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f7818b = AbstractC0524gk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f7819c = false;

    public final void a(Context context) {
        C0569id c0569id;
        C0876ua.a(context);
        this.f7818b.onCreate(context);
        this.f7817a.getClass();
        List<String> a3 = C0876ua.f8420H.f8444s.a();
        ArrayList arrayList = new ArrayList(c2.g.N(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0569id = new C0569id(str, false);
            } else {
                C0876ua.f8420H.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0569id = new C0569id(str, true);
            }
            arrayList.add(c0569id);
        }
        new C0808rk(C0876ua.f8420H.D().f5871d).a(context);
        C0876ua.f8420H.q().a();
        new C0594jd(C0876ua.f8420H.f8431d.a(), C0876ua.f8420H.z(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.f7819c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f7819c) {
                    a(context);
                    this.f7819c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
