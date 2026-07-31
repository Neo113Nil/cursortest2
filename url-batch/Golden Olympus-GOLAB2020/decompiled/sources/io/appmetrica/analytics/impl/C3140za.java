package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3140za {

    /* renamed from: d, reason: collision with root package name */
    public static final C3140za f40370d = new C3140za();

    /* renamed from: a, reason: collision with root package name */
    public final Id f40371a = new Id();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f40372b = AbstractC2735jk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f40373c = false;

    public final void a(Context context) {
        Ia.a(context);
        this.f40372b.onCreate(context);
        this.f40371a.getClass();
        Iterator it = Ia.f37730F.f37754s.a().iterator();
        while (it.hasNext()) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor((String) it.next(), ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                Ia.f37730F.o().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C3020uk(Ia.j().B().b()).a(context);
        Ia.f37730F.p().a();
    }

    public final void b(Context context) {
        if (this.f40373c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f40373c) {
                    a(context);
                    this.f40373c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
