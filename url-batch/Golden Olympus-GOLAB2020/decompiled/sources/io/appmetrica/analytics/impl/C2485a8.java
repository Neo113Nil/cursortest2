package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.a8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2485a8 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f38666a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        C2832nd c2832nd = Ia.f37730F.f37754s;
        List list = this.f38666a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new M5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new M5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        M5[] m5Arr = (M5[]) array;
        InterfaceC2806md[] interfaceC2806mdArr = (InterfaceC2806md[]) Arrays.copyOf(m5Arr, m5Arr.length);
        synchronized (c2832nd) {
            CollectionsKt.addAll(c2832nd.f39498a, interfaceC2806mdArr);
        }
        Ia.f37730F.f37754s.a(new Cif(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
