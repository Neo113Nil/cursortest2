package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9416a;

    public a(b bVar, ClientContext clientContext) {
        ArrayList arrayList = new ArrayList();
        this.f9416a = arrayList;
        arrayList.add(new d(bVar, clientContext));
        arrayList.add(new f(bVar, clientContext));
        arrayList.add(new g(bVar, clientContext));
        arrayList.add(new h(bVar, clientContext));
        arrayList.add(new i(bVar, clientContext));
        arrayList.add(new c(bVar, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ArrayList arrayList = this.f9416a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (((ModuleAdRevenueProcessor) obj).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
