package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0393o2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0413om fromModel(C0368n2 c0368n2) {
        C0363mm c0363mm;
        C0413om c0413om = new C0413om();
        c0413om.f1421a = new C0388nm[c0368n2.f1386a.size()];
        for (int i = 0; i < c0368n2.f1386a.size(); i++) {
            C0388nm c0388nm = new C0388nm();
            Pair pair = (Pair) c0368n2.f1386a.get(i);
            c0388nm.f1402a = (String) pair.first;
            if (pair.second != null) {
                c0388nm.b = new C0363mm();
                C0343m2 c0343m2 = (C0343m2) pair.second;
                if (c0343m2 == null) {
                    c0363mm = null;
                } else {
                    C0363mm c0363mm2 = new C0363mm();
                    c0363mm2.f1381a = c0343m2.f1367a;
                    c0363mm = c0363mm2;
                }
                c0388nm.b = c0363mm;
            }
            c0413om.f1421a[i] = c0388nm;
        }
        return c0413om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0368n2 toModel(C0413om c0413om) {
        ArrayList arrayList = new ArrayList();
        for (C0388nm c0388nm : c0413om.f1421a) {
            String str = c0388nm.f1402a;
            C0363mm c0363mm = c0388nm.b;
            arrayList.add(new Pair(str, c0363mm == null ? null : new C0343m2(c0363mm.f1381a)));
        }
        return new C0368n2(arrayList);
    }
}
