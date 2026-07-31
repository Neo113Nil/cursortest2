package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class R6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2919qm[] fromModel(@NotNull Map<String, ? extends List<String>> map) {
        C2919qm[] c2919qmArr = new C2919qm[map.size()];
        int i4 = 0;
        for (Object obj : map.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) obj;
            C2919qm c2919qm = new C2919qm();
            c2919qm.f39666a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c2919qm.f39667b = (String[]) array;
            c2919qmArr[i4] = c2919qm;
            i4 = i5;
        }
        return c2919qmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(@NotNull C2919qm[] c2919qmArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(c2919qmArr.length), 16));
        for (C2919qm c2919qm : c2919qmArr) {
            Pair pair = TuplesKt.to(c2919qm.f39666a, AbstractC3219i.G0(c2919qm.f39667b));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
