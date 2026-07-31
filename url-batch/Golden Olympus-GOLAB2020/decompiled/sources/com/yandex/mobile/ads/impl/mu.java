package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mu implements yf2 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hu f29233a;

    mu(hu huVar) {
        this.f29233a = huVar;
    }

    @Override // com.yandex.mobile.ads.impl.yf2
    @NotNull
    public final Map<String, List<String>> a() {
        ku d4 = this.f29233a.d();
        List<a62> c4 = d4 != null ? d4.c() : null;
        if (c4 == null) {
            c4 = CollectionsKt.emptyList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : c4) {
            String a4 = ((a62) obj).a();
            Object obj2 = linkedHashMap.get(a4);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a4, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((a62) it.next()).c());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }
}
