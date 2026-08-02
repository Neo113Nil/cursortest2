package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429d2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final D2 f7168a;

    public C0429d2() {
        this(new D2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0506g2 fromModel(C0403c2 c0403c2) {
        C0506g2 c0506g2 = new C0506g2();
        c0506g2.f7349a = new C0480f2[c0403c2.f7114a.size()];
        int i3 = 0;
        int i4 = 0;
        for (PermissionState permissionState : c0403c2.f7114a) {
            C0480f2[] c0480f2Arr = c0506g2.f7349a;
            C0480f2 c0480f2 = new C0480f2();
            c0480f2.f7299a = permissionState.name;
            c0480f2.f7300b = permissionState.granted;
            c0480f2Arr[i4] = c0480f2;
            i4++;
        }
        F2 f22 = c0403c2.f7115b;
        if (f22 != null) {
            c0506g2.f7350b = this.f7168a.fromModel(f22);
        }
        c0506g2.f7351c = new String[c0403c2.f7116c.size()];
        Iterator it = c0403c2.f7116c.iterator();
        while (it.hasNext()) {
            c0506g2.f7351c[i3] = (String) it.next();
            i3++;
        }
        return c0506g2;
    }

    public C0429d2(D2 d22) {
        this.f7168a = d22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0403c2 toModel(C0506g2 c0506g2) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            C0480f2[] c0480f2Arr = c0506g2.f7349a;
            if (i4 >= c0480f2Arr.length) {
                break;
            }
            C0480f2 c0480f2 = c0480f2Arr[i4];
            arrayList.add(new PermissionState(c0480f2.f7299a, c0480f2.f7300b));
            i4++;
        }
        C0454e2 c0454e2 = c0506g2.f7350b;
        F2 model = c0454e2 != null ? this.f7168a.toModel(c0454e2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c0506g2.f7351c;
            if (i3 < strArr.length) {
                arrayList2.add(strArr[i3]);
                i3++;
            } else {
                return new C0403c2(arrayList, model, arrayList2);
            }
        }
    }
}
