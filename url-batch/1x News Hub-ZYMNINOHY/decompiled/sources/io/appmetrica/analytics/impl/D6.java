package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0862tm[] fromModel(Map<String, ? extends List<String>> map) {
        C0862tm[] c0862tmArr = new C0862tm[map.size()];
        int i3 = 0;
        for (Object obj : map.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                c2.f.M();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0862tm c0862tm = new C0862tm();
            c0862tm.f8382a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c0862tm.f8383b = (String[]) array;
            c0862tmArr[i3] = c0862tm;
            i3 = i4;
        }
        return c0862tmArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C0862tm[] c0862tmArr) {
        int Z2 = c2.q.Z(c0862tmArr.length);
        if (Z2 < 16) {
            Z2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z2);
        for (C0862tm c0862tm : c0862tmArr) {
            linkedHashMap.put(c0862tm.f8382a, c2.c.X(c0862tm.f8383b));
        }
        return linkedHashMap;
    }
}
