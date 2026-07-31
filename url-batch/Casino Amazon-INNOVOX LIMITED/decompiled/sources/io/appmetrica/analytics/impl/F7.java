package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class F7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f841a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Tc tc = C0401oa.I.s;
        List list = this.f841a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0470r5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0470r5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C0470r5[] c0470r5Arr = (C0470r5[]) array;
        Sc[] scArr = (Sc[]) Arrays.copyOf(c0470r5Arr, c0470r5Arr.length);
        synchronized (tc) {
            CollectionsKt.addAll(tc.f1058a, scArr);
        }
        C0401oa.I.s.a(new Ve(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
