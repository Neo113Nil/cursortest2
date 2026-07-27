package io.appmetrica.analytics.impl;

import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class J7 implements ClientComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f7001a = AbstractC0466k.A0("io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C0736j4.l().f8482a.b()) {
            Zc zc = C0736j4.l().f8494m;
            List list = this.f7001a;
            ArrayList arrayList = new ArrayList(AbstractC0467l.D0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1100x5((String) it.next()));
            }
            Object[] array = arrayList.toArray(new C1100x5[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            C1100x5[] c1100x5Arr = (C1100x5[]) array;
            Yc[] ycArr = (Yc[]) Arrays.copyOf(c1100x5Arr, c1100x5Arr.length);
            synchronized (zc) {
                AbstractC0465j.E0(zc.f7780a, ycArr);
            }
        }
    }
}
