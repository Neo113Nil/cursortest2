package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1046w6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0881pm[] fromModel(Map<String, ? extends List<String>> map) {
        C0881pm[] c0881pmArr = new C0881pm[map.size()];
        int i4 = 0;
        for (Object obj : map.entrySet()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                d3.j.X();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0881pm c0881pm = new C0881pm();
            c0881pm.f12593a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0881pm.f12594b = (String[]) array;
            c0881pmArr[i4] = c0881pm;
            i4 = i5;
        }
        return c0881pmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C0881pm[] c0881pmArr) {
        int z = d3.u.z(c0881pmArr.length);
        if (z < 16) {
            z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z);
        for (C0881pm c0881pm : c0881pmArr) {
            linkedHashMap.put(c0881pm.f12593a, d3.g.Y(c0881pm.f12594b));
        }
        return linkedHashMap;
    }
}
