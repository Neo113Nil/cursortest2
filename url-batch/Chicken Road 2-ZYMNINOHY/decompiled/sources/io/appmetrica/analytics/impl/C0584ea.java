package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584ea {

    /* renamed from: d, reason: collision with root package name */
    public static final C0584ea f11782d = new C0584ea();

    /* renamed from: a, reason: collision with root package name */
    public final C0949sd f11783a = new C0949sd();

    /* renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f11784b = AbstractC0517bk.a();

    /* renamed from: c, reason: collision with root package name */
    public boolean f11785c = false;

    public final void a(Context context) {
        C0510bd c0510bd;
        C0817na.a(context);
        this.f11784b.onCreate(context);
        this.f11783a.getClass();
        List<String> a3 = C0817na.f12417I.f12442s.a();
        ArrayList arrayList = new ArrayList(d3.k.Y(a3));
        for (String str : a3) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0510bd = new C0510bd(str, false);
            } else {
                C0817na.f12417I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0510bd = new C0510bd(str, true);
            }
            arrayList.add(c0510bd);
        }
        new C0827nk(C0817na.f12417I.D().f10066d).a(context);
        C1064wo c1064wo = C0817na.f12417I.D().f10065c;
        synchronized (c1064wo) {
            c1064wo.f12987a.a();
        }
        C0817na.f12417I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f11785c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f11785c) {
                    a(context);
                    this.f11785c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C0536cd a() {
        C0749kk c0749kk = C0817na.f12417I.f12429d;
        if (c0749kk.f12245b == null) {
            synchronized (c0749kk) {
                try {
                    if (c0749kk.f12245b == null) {
                        c0749kk.f12244a.getClass();
                        HandlerThreadC0534cb a3 = C1127z9.a("IAA-SC");
                        c0749kk.f12245b = new C1127z9(a3, a3.getLooper(), new Handler(a3.getLooper()));
                    }
                } finally {
                }
            }
        }
        return new C0536cd(c0749kk.f12245b, C0817na.f12417I.y(), "service_modules", new SystemTimeProvider());
    }
}
