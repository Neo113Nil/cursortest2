package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U1 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C1016v2 f11032a;

    public U1() {
        this(new C1016v2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X1 fromModel(T1 t12) {
        X1 x12 = new X1();
        x12.f11219a = new W1[t12.f10970a.size()];
        int i4 = 0;
        int i5 = 0;
        for (PermissionState permissionState : t12.f10970a) {
            W1[] w1Arr = x12.f11219a;
            W1 w12 = new W1();
            w12.f11157a = permissionState.name;
            w12.f11158b = permissionState.granted;
            w1Arr[i5] = w12;
            i5++;
        }
        C1068x2 c1068x2 = t12.f10971b;
        if (c1068x2 != null) {
            x12.f11220b = this.f11032a.fromModel(c1068x2);
        }
        x12.f11221c = new String[t12.f10972c.size()];
        Iterator it = t12.f10972c.iterator();
        while (it.hasNext()) {
            x12.f11221c[i4] = (String) it.next();
            i4++;
        }
        return x12;
    }

    public U1(C1016v2 c1016v2) {
        this.f11032a = c1016v2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T1 toModel(X1 x12) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            W1[] w1Arr = x12.f11219a;
            if (i5 >= w1Arr.length) {
                break;
            }
            W1 w12 = w1Arr[i5];
            arrayList.add(new PermissionState(w12.f11157a, w12.f11158b));
            i5++;
        }
        V1 v12 = x12.f11220b;
        C1068x2 model = v12 != null ? this.f11032a.toModel(v12) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = x12.f11221c;
            if (i4 < strArr.length) {
                arrayList2.add(strArr[i4]);
                i4++;
            } else {
                return new T1(arrayList, model, arrayList2);
            }
        }
    }
}
