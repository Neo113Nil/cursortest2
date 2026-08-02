package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809n2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0829nm fromModel(C0783m2 c0783m2) {
        C0777lm c0777lm;
        C0829nm c0829nm = new C0829nm();
        c0829nm.f12476a = new C0803mm[c0783m2.f12318a.size()];
        for (int i4 = 0; i4 < c0783m2.f12318a.size(); i4++) {
            C0803mm c0803mm = new C0803mm();
            Pair pair = (Pair) c0783m2.f12318a.get(i4);
            c0803mm.f12379a = (String) pair.first;
            if (pair.second != null) {
                c0803mm.f12380b = new C0777lm();
                C0757l2 c0757l2 = (C0757l2) pair.second;
                if (c0757l2 == null) {
                    c0777lm = null;
                } else {
                    C0777lm c0777lm2 = new C0777lm();
                    c0777lm2.f12309a = c0757l2.f12257a;
                    c0777lm = c0777lm2;
                }
                c0803mm.f12380b = c0777lm;
            }
            c0829nm.f12476a[i4] = c0803mm;
        }
        return c0829nm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0783m2 toModel(C0829nm c0829nm) {
        ArrayList arrayList = new ArrayList();
        for (C0803mm c0803mm : c0829nm.f12476a) {
            String str = c0803mm.f12379a;
            C0777lm c0777lm = c0803mm.f12380b;
            arrayList.add(new Pair(str, c0777lm == null ? null : new C0757l2(c0777lm.f12309a)));
        }
        return new C0783m2(arrayList);
    }
}
