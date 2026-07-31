package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.c9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2540c9 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull Map<String, byte[]> map) {
        C2593e9 c2593e9 = new C2593e9();
        C2567d9[] c2567d9Arr = new C2567d9[map.size()];
        int i4 = 0;
        for (Object obj : map.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C2567d9 c2567d9 = new C2567d9();
            c2567d9.f38847a = (String) entry.getKey();
            c2567d9.f38848b = (byte[]) entry.getValue();
            c2567d9Arr[i4] = c2567d9;
            i4 = i5;
        }
        c2593e9.f38918a = c2567d9Arr;
        return MessageNano.toByteArray(c2593e9);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull byte[] bArr) {
        C2567d9[] c2567d9Arr = ((C2593e9) MessageNano.mergeFrom(new C2593e9(), bArr)).f38918a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(c2567d9Arr.length), 16));
        for (C2567d9 c2567d9 : c2567d9Arr) {
            Pair pair = TuplesKt.to(c2567d9.f38847a, c2567d9.f38848b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
