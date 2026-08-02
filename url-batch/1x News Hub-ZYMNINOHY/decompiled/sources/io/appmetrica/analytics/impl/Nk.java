package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Nk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Pk fromModel(Map<String, byte[]> map) {
        Pk pk = new Pk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Qk qk = new Qk();
            qk.f6527a = entry.getKey().getBytes(s2.a.f10316a);
            qk.f6528b = entry.getValue();
            arrayList.add(qk);
        }
        Object[] array = arrayList.toArray(new Qk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pk.f6475a = (Qk[]) array;
        return pk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(Pk pk) {
        Qk[] qkArr = pk.f6475a;
        int Z2 = c2.q.Z(qkArr.length);
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (Qk qk : qkArr) {
            linkedHashMap.put(new String(qk.f6527a, s2.a.f10316a), qk.f6528b);
        }
        return linkedHashMap;
    }
}
