package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Jk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Lk fromModel(@NotNull Map<String, byte[]> map) {
        Lk lk = new Lk();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Mk mk = new Mk();
            mk.f37981a = entry.getKey().getBytes(Charsets.UTF_8);
            mk.f37982b = entry.getValue();
            arrayList.add(mk);
        }
        Object[] array = arrayList.toArray(new Mk[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        lk.f37932a = (Mk[]) array;
        return lk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, byte[]> toModel(@NotNull Lk lk) {
        Mk[] mkArr = lk.f37932a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(mkArr.length), 16));
        for (Mk mk : mkArr) {
            Pair pair = TuplesKt.to(new String(mk.f37981a, Charsets.UTF_8), mk.f37982b);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
