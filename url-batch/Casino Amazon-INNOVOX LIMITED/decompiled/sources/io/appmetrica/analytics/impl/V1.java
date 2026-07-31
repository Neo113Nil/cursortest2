package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class V1 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0592w2 f1084a;

    public V1() {
        this(new C0592w2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y1 fromModel(U1 u1) {
        Y1 y1 = new Y1();
        y1.f1125a = new X1[u1.f1068a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : u1.f1068a) {
            X1[] x1Arr = y1.f1125a;
            X1 x1 = new X1();
            x1.f1110a = permissionState.name;
            x1.b = permissionState.granted;
            x1Arr[i2] = x1;
            i2++;
        }
        C0642y2 c0642y2 = u1.b;
        if (c0642y2 != null) {
            y1.b = this.f1084a.fromModel(c0642y2);
        }
        y1.c = new String[u1.c.size()];
        Iterator it = u1.c.iterator();
        while (it.hasNext()) {
            y1.c[i] = (String) it.next();
            i++;
        }
        return y1;
    }

    public V1(C0592w2 c0592w2) {
        this.f1084a = c0592w2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final U1 toModel(Y1 y1) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            X1[] x1Arr = y1.f1125a;
            if (i2 >= x1Arr.length) {
                break;
            }
            X1 x1 = x1Arr[i2];
            arrayList.add(new PermissionState(x1.f1110a, x1.b));
            i2++;
        }
        W1 w1 = y1.b;
        C0642y2 model = w1 != null ? this.f1084a.toModel(w1) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = y1.c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new U1(arrayList, model, arrayList2);
            }
        }
    }
}
