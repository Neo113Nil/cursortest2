package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class E7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f10245a = d3.j.W("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Sc sc = C0817na.f12417I.f12442s;
        List list = this.f10245a;
        ArrayList arrayList = new ArrayList(d3.k.Y(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0890q5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0890q5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C0890q5[] c0890q5Arr = (C0890q5[]) array;
        Rc[] rcArr = (Rc[]) Arrays.copyOf(c0890q5Arr, c0890q5Arr.length);
        synchronized (sc) {
            d3.o.a0(sc.f10942a, rcArr);
        }
        C0817na.f12417I.f12442s.a(new Ue(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
