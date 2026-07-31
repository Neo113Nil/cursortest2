package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2479a2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final H2 f38657a;

    public C2479a2() {
        this(new H2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2560d2 fromModel(@NonNull Z1 z12) {
        C2560d2 c2560d2 = new C2560d2();
        c2560d2.f38813a = new C2533c2[z12.f38592a.size()];
        int i4 = 0;
        int i5 = 0;
        for (PermissionState permissionState : z12.f38592a) {
            C2533c2[] c2533c2Arr = c2560d2.f38813a;
            C2533c2 c2533c2 = new C2533c2();
            c2533c2.f38761a = permissionState.name;
            c2533c2.f38762b = permissionState.granted;
            c2533c2Arr[i5] = c2533c2;
            i5++;
        }
        J2 j22 = z12.f38593b;
        if (j22 != null) {
            c2560d2.f38814b = this.f38657a.fromModel(j22);
        }
        c2560d2.f38815c = new String[z12.f38594c.size()];
        Iterator it = z12.f38594c.iterator();
        while (it.hasNext()) {
            c2560d2.f38815c[i4] = (String) it.next();
            i4++;
        }
        return c2560d2;
    }

    public C2479a2(H2 h22) {
        this.f38657a = h22;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z1 toModel(@NonNull C2560d2 c2560d2) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            C2533c2[] c2533c2Arr = c2560d2.f38813a;
            if (i5 >= c2533c2Arr.length) {
                break;
            }
            C2533c2 c2533c2 = c2533c2Arr[i5];
            arrayList.add(new PermissionState(c2533c2.f38761a, c2533c2.f38762b));
            i5++;
        }
        C2506b2 c2506b2 = c2560d2.f38814b;
        J2 model = c2506b2 != null ? this.f38657a.toModel(c2506b2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c2560d2.f38815c;
            if (i4 < strArr.length) {
                arrayList2.add(strArr[i4]);
                i4++;
            } else {
                return new Z1(arrayList, model, arrayList2);
            }
        }
    }
}
