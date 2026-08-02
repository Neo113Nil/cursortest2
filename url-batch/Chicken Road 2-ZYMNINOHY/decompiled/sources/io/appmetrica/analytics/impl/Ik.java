package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import w3.AbstractC1504a;

/* loaded from: classes.dex */
public final class Ik implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Kk fromModel(Map<String, byte[]> map) {
        Kk kk = new Kk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Lk lk = new Lk();
            lk.f10610a = entry.getKey().getBytes(AbstractC1504a.f15936a);
            lk.f10611b = entry.getValue();
            arrayList.add(lk);
        }
        Object[] array = arrayList.toArray(new Lk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        kk.f10540a = (Lk[]) array;
        return kk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Kk kk) {
        Lk[] lkArr = kk.f10540a;
        int z = d3.u.z(lkArr.length);
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (Lk lk : lkArr) {
            linkedHashMap.put(new String(lk.f10610a, AbstractC1504a.f15936a), lk.f10611b);
        }
        return linkedHashMap;
    }
}
