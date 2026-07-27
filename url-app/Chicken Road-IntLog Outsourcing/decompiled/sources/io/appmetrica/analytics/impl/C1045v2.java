package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0961rm fromModel(C1019u2 c1019u2) {
        C0910pm c0910pm;
        C0961rm c0961rm = new C0961rm();
        c0961rm.f9193a = new C0936qm[c1019u2.f9332a.size()];
        for (int i2 = 0; i2 < c1019u2.f9332a.size(); i2++) {
            C0936qm c0936qm = new C0936qm();
            Pair pair = (Pair) c1019u2.f9332a.get(i2);
            c0936qm.f9117a = (String) pair.first;
            if (pair.second != null) {
                c0936qm.f9118b = new C0910pm();
                C0993t2 c0993t2 = (C0993t2) pair.second;
                if (c0993t2 == null) {
                    c0910pm = null;
                } else {
                    C0910pm c0910pm2 = new C0910pm();
                    c0910pm2.f9033a = c0993t2.f9274a;
                    c0910pm = c0910pm2;
                }
                c0936qm.f9118b = c0910pm;
            }
            c0961rm.f9193a[i2] = c0936qm;
        }
        return c0961rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1019u2 toModel(C0961rm c0961rm) {
        ArrayList arrayList = new ArrayList();
        for (C0936qm c0936qm : c0961rm.f9193a) {
            String str = c0936qm.f9117a;
            C0910pm c0910pm = c0936qm.f9118b;
            arrayList.add(new Pair(str, c0910pm == null ? null : new C0993t2(c0910pm.f9033a)));
        }
        return new C1019u2(arrayList);
    }
}
