package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965t3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1069x3 fromModel(C0939s3 c0939s3) {
        C1069x3 c1069x3 = new C1069x3();
        c1069x3.f12997a = a(c0939s3.f12715a);
        int size = c0939s3.f12716b.size();
        C0991u3[] c0991u3Arr = new C0991u3[size];
        for (int i4 = 0; i4 < size; i4++) {
            c0991u3Arr[i4] = a((C0913r3) c0939s3.f12716b.get(i4));
        }
        c1069x3.f12998b = c0991u3Arr;
        return c1069x3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0939s3 toModel(C1069x3 c1069x3) {
        C0991u3 c0991u3 = c1069x3.f12997a;
        if (c0991u3 == null) {
            c0991u3 = new C0991u3();
        }
        C0913r3 a3 = a(c0991u3);
        C0991u3[] c0991u3Arr = c1069x3.f12998b;
        ArrayList arrayList = new ArrayList(c0991u3Arr.length);
        for (C0991u3 c0991u32 : c0991u3Arr) {
            arrayList.add(a(c0991u32));
        }
        return new C0939s3(a3, arrayList);
    }

    public static C0991u3 a(C0913r3 c0913r3) {
        C1043w3 c1043w3;
        C0991u3 c0991u3 = new C0991u3();
        Map map = c0913r3.f12644a;
        int i4 = 0;
        if (map != null) {
            c1043w3 = new C1043w3();
            int size = map.size();
            C1017v3[] c1017v3Arr = new C1017v3[size];
            for (int i5 = 0; i5 < size; i5++) {
                c1017v3Arr[i5] = new C1017v3();
            }
            c1043w3.f12917a = c1017v3Arr;
            int i6 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C1017v3 c1017v3 = c1043w3.f12917a[i6];
                c1017v3.f12867a = str;
                c1017v3.f12868b = str2;
                i6++;
            }
        } else {
            c1043w3 = null;
        }
        c0991u3.f12798a = c1043w3;
        int ordinal = c0913r3.f12645b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i4 = 2;
                if (ordinal != 2) {
                    i4 = 3;
                    if (ordinal != 3) {
                        throw new G1.a();
                    }
                }
            } else {
                i4 = 1;
            }
        }
        c0991u3.f12799b = i4;
        return c0991u3;
    }

    public static C0913r3 a(C0991u3 c0991u3) {
        LinkedHashMap linkedHashMap;
        S7 s7;
        C1043w3 c1043w3 = c0991u3.f12798a;
        if (c1043w3 != null) {
            C1017v3[] c1017v3Arr = c1043w3.f12917a;
            int z = d3.u.z(c1017v3Arr.length);
            if (z < 16) {
                z = 16;
            }
            linkedHashMap = new LinkedHashMap(z);
            for (C1017v3 c1017v3 : c1017v3Arr) {
                linkedHashMap.put(c1017v3.f12867a, c1017v3.f12868b);
            }
        } else {
            linkedHashMap = null;
        }
        int i4 = c0991u3.f12799b;
        if (i4 == 0) {
            s7 = S7.f10932b;
        } else if (i4 == 1) {
            s7 = S7.f10933c;
        } else if (i4 == 2) {
            s7 = S7.f10934d;
        } else if (i4 != 3) {
            s7 = S7.f10932b;
        } else {
            s7 = S7.f10935e;
        }
        return new C0913r3(linkedHashMap, s7);
    }
}
