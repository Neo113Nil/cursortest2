package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class J8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        L8 l8 = new L8();
        K8[] k8Arr = new K8[map.size()];
        int i4 = 0;
        for (Object obj : map.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                d3.j.X();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            K8 k8 = new K8();
            k8.f10522a = (String) entry.getKey();
            k8.f10523b = (byte[]) entry.getValue();
            k8Arr[i4] = k8;
            i4 = i5;
        }
        l8.f10583a = k8Arr;
        return MessageNano.toByteArray(l8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        K8[] k8Arr = ((L8) MessageNano.mergeFrom(new L8(), bArr)).f10583a;
        int z = d3.u.z(k8Arr.length);
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (K8 k8 : k8Arr) {
            linkedHashMap.put(k8.f10522a, k8.f10523b);
        }
        return linkedHashMap;
    }
}
