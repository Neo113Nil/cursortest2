package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0543u3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0643y3 fromModel(C0518t3 c0518t3) {
        C0643y3 c0643y3 = new C0643y3();
        c0643y3.f1576a = a(c0518t3.f1494a);
        int size = c0518t3.b.size();
        C0568v3[] c0568v3Arr = new C0568v3[size];
        for (int i = 0; i < size; i++) {
            c0568v3Arr[i] = a((C0493s3) c0518t3.b.get(i));
        }
        c0643y3.b = c0568v3Arr;
        return c0643y3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0518t3 toModel(C0643y3 c0643y3) {
        C0568v3 c0568v3 = c0643y3.f1576a;
        if (c0568v3 == null) {
            c0568v3 = new C0568v3();
        }
        C0493s3 a2 = a(c0568v3);
        C0568v3[] c0568v3Arr = c0643y3.b;
        ArrayList arrayList = new ArrayList(c0568v3Arr.length);
        for (C0568v3 c0568v32 : c0568v3Arr) {
            arrayList.add(a(c0568v32));
        }
        return new C0518t3(a2, arrayList);
    }

    public static C0568v3 a(C0493s3 c0493s3) {
        C0618x3 c0618x3;
        C0568v3 c0568v3 = new C0568v3();
        Map map = c0493s3.f1477a;
        int i = 0;
        if (map != null) {
            c0618x3 = new C0618x3();
            int size = map.size();
            C0593w3[] c0593w3Arr = new C0593w3[size];
            for (int i2 = 0; i2 < size; i2++) {
                c0593w3Arr[i2] = new C0593w3();
            }
            c0618x3.f1559a = c0593w3Arr;
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0593w3 c0593w3 = c0618x3.f1559a[i3];
                c0593w3.f1545a = str;
                c0593w3.b = str2;
                i3++;
            }
        } else {
            c0618x3 = null;
        }
        c0568v3.f1526a = c0618x3;
        int ordinal = c0493s3.b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                i = 1;
            }
        }
        c0568v3.b = i;
        return c0568v3;
    }

    public static C0493s3 a(C0568v3 c0568v3) {
        LinkedHashMap linkedHashMap;
        T7 t7;
        C0618x3 c0618x3 = c0568v3.f1526a;
        if (c0618x3 != null) {
            C0593w3[] c0593w3Arr = c0618x3.f1559a;
            linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(c0593w3Arr.length), 16));
            for (C0593w3 c0593w3 : c0593w3Arr) {
                Pair pair = TuplesKt.to(c0593w3.f1545a, c0593w3.b);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        int i = c0568v3.b;
        if (i == 0) {
            t7 = T7.b;
        } else if (i == 1) {
            t7 = T7.c;
        } else if (i == 2) {
            t7 = T7.d;
        } else if (i != 3) {
            t7 = T7.b;
        } else {
            t7 = T7.e;
        }
        return new C0493s3(linkedHashMap, t7);
    }
}
