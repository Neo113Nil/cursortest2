package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class P3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T3 fromModel(@NotNull O3 o32) {
        T3 t32 = new T3();
        t32.f38292a = a(o32.f38046a);
        int size = o32.f38047b.size();
        Q3[] q3Arr = new Q3[size];
        for (int i4 = 0; i4 < size; i4++) {
            q3Arr[i4] = a((N3) o32.f38047b.get(i4));
        }
        t32.f38293b = q3Arr;
        return t32;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O3 toModel(@NotNull T3 t32) {
        Q3 q32 = t32.f38292a;
        if (q32 == null) {
            q32 = new Q3();
        }
        N3 a4 = a(q32);
        Q3[] q3Arr = t32.f38293b;
        ArrayList arrayList = new ArrayList(q3Arr.length);
        for (Q3 q33 : q3Arr) {
            arrayList.add(a(q33));
        }
        return new O3(a4, arrayList);
    }

    public static Q3 a(N3 n32) {
        S3 s32;
        Q3 q32 = new Q3();
        Map map = n32.f37991a;
        int i4 = 0;
        if (map != null) {
            s32 = new S3();
            int size = map.size();
            R3[] r3Arr = new R3[size];
            for (int i5 = 0; i5 < size; i5++) {
                r3Arr[i5] = new R3();
            }
            s32.f38226a = r3Arr;
            int i6 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                R3 r32 = s32.f38226a[i6];
                r32.f38182a = str;
                r32.f38183b = str2;
                i6++;
            }
        } else {
            s32 = null;
        }
        q32.f38153a = s32;
        int ordinal = n32.f37992b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i4 = 2;
                if (ordinal != 2) {
                    i4 = 3;
                    if (ordinal != 3) {
                        throw new W1.m();
                    }
                }
            } else {
                i4 = 1;
            }
        }
        q32.f38154b = i4;
        return q32;
    }

    public static N3 a(Q3 q32) {
        LinkedHashMap linkedHashMap;
        EnumC2775l8 enumC2775l8;
        S3 s32 = q32.f38153a;
        if (s32 != null) {
            R3[] r3Arr = s32.f38226a;
            linkedHashMap = new LinkedHashMap(kotlin.ranges.g.d(MapsKt.mapCapacity(r3Arr.length), 16));
            for (R3 r32 : r3Arr) {
                Pair pair = TuplesKt.to(r32.f38182a, r32.f38183b);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i4 = q32.f38154b;
        if (i4 == 0) {
            enumC2775l8 = EnumC2775l8.f39392b;
        } else if (i4 == 1) {
            enumC2775l8 = EnumC2775l8.f39393c;
        } else if (i4 == 2) {
            enumC2775l8 = EnumC2775l8.f39394d;
        } else if (i4 != 3) {
            enumC2775l8 = EnumC2775l8.f39392b;
        } else {
            enumC2775l8 = EnumC2775l8.f39395e;
        }
        return new N3(linkedHashMap, enumC2775l8);
    }
}
