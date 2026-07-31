package com.yandex.mobile.ads.impl;

import j2.AbstractC3185a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b31 {
    public static double a(@NotNull List imageValues) {
        Object next;
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(imageValues, 10));
        Iterator it = imageValues.iterator();
        while (true) {
            double d4 = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            if (((ej0) it.next()).a() != 0) {
                d4 = r2.g() / r2.a();
            }
            arrayList.add(Double.valueOf(d4));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            arrayList2.add(Integer.valueOf(AbstractC3185a.b(((Number) obj).doubleValue() * 1000)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList2.size();
        while (true) {
            int i6 = 1;
            if (i4 >= size2) {
                break;
            }
            Object obj2 = arrayList2.get(i4);
            i4++;
            int intValue = ((Number) obj2).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(intValue));
            if (num != null) {
                i6 = 1 + num.intValue();
            }
            linkedHashMap.put(valueOf, Integer.valueOf(i6));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue3 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue2 < intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue4 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && intValue4 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it3 = linkedHashMap2.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList3.add(Double.valueOf(((Number) ((Map.Entry) it3.next()).getKey()).intValue() / 1000));
        }
        List sorted = CollectionsKt.sorted(arrayList3);
        int size3 = sorted.size();
        int i7 = size3 / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i8 = size3 % 2;
        if (i8 + ((((i8 ^ 2) & ((-i8) | i8)) >> 31) & 2) == 1) {
            return ((Number) sorted.get(i7)).doubleValue();
        }
        return (((Number) sorted.get(i7 - 1)).doubleValue() + ((Number) sorted.get(i7)).doubleValue()) / 2;
    }
}
