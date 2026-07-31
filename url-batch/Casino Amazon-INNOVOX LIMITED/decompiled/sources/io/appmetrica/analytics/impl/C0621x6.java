package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0621x6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0463qm[] fromModel(Map<String, ? extends List<String>> map) {
        C0463qm[] c0463qmArr = new C0463qm[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C0463qm c0463qm = new C0463qm();
            c0463qm.f1459a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0463qm.b = (String[]) array;
            c0463qmArr[i] = c0463qm;
            i = i2;
        }
        return c0463qmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C0463qm[] c0463qmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(c0463qmArr.length), 16));
        for (C0463qm c0463qm : c0463qmArr) {
            Pair pair = TuplesKt.to(c0463qm.f1459a, ArraysKt.toList(c0463qm.b));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
