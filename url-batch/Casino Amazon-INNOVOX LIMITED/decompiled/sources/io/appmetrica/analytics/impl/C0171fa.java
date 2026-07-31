package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0171fa {
    public static final C0171fa d = new C0171fa();

    /* renamed from: a, reason: collision with root package name */
    public final C0528td f1255a = new C0528td();
    public final ServiceComponentsInitializer b = AbstractC0104ck.a();
    public boolean c = false;

    public final void a(Context context) {
        C0097cd c0097cd;
        C0401oa.a(context);
        this.b.onCreate(context);
        this.f1255a.getClass();
        List<String> a2 = C0401oa.I.s.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        for (String str : a2) {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor == null) {
                c0097cd = new C0097cd(str, false);
            } else {
                C0401oa.I.p().a((ModuleServiceEntryPoint<Object>) loadAndInstantiateClassWithDefaultConstructor);
                c0097cd = new C0097cd(str, true);
            }
            arrayList.add(c0097cd);
        }
        new C0411ok(C0401oa.I.D().d).a(context);
        xo xoVar = C0401oa.I.D().c;
        synchronized (xoVar) {
            xoVar.f1572a.a();
        }
        C0401oa.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (!this.c) {
                a(context);
                this.c = true;
            }
        }
    }

    public static C0123dd a() {
        C0336lk c0336lk = C0401oa.I.d;
        if (c0336lk.b == null) {
            synchronized (c0336lk) {
                if (c0336lk.b == null) {
                    c0336lk.f1362a.getClass();
                    HandlerThreadC0121db a2 = A9.a("IAA-SC");
                    c0336lk.b = new A9(a2, a2.getLooper(), new Handler(a2.getLooper()));
                }
            }
        }
        return new C0123dd(c0336lk.b, C0401oa.I.y(), "service_modules", new SystemTimeProvider());
    }
}
