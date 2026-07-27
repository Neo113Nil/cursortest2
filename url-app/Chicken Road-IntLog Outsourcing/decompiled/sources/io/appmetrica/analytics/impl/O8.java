package io.appmetrica.analytics.impl;

import g4.AbstractC0466k;
import g4.AbstractC0476u;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class O8 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Map<String, byte[]> map) {
        Q8 q8 = new Q8();
        P8[] p8Arr = new P8[map.size()];
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            P8 p8 = new P8();
            p8.f7271a = (String) entry.getKey();
            p8.f7272b = (byte[]) entry.getValue();
            p8Arr[i2] = p8;
            i2 = i3;
        }
        q8.f7323a = p8Arr;
        return MessageNano.toByteArray(q8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(byte[] bArr) {
        P8[] p8Arr = ((Q8) MessageNano.mergeFrom(new Q8(), bArr)).f7323a;
        int W5 = AbstractC0476u.W(p8Arr.length);
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (P8 p8 : p8Arr) {
            linkedHashMap.put(p8.f7271a, p8.f7272b);
        }
        return linkedHashMap;
    }
}
