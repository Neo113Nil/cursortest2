package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class B7 implements ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f10091a = d3.j.W("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v9.internal.IronSourceV9ClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C0501b4.l().f11455a.b()) {
            Sc sc = C0501b4.l().f11467m;
            List list = this.f10091a;
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
        }
    }
}
