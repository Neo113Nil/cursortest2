package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class M7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f6325a = c2.f.L("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Zc zc = C0876ua.f8420H.f8444s;
        List list = this.f6325a;
        ArrayList arrayList = new ArrayList(c2.g.N(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0949x5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0949x5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C0949x5[] c0949x5Arr = (C0949x5[]) array;
        Yc[] ycArr = (Yc[]) Arrays.copyOf(c0949x5Arr, c0949x5Arr.length);
        synchronized (zc) {
            c2.k.P(zc.f6940a, ycArr);
        }
        C0876ua.f8420H.f8444s.a(new Ze(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
