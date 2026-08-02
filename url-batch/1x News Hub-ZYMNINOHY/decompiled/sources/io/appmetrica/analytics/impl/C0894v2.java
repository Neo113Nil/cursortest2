package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0810rm fromModel(C0868u2 c0868u2) {
        C0759pm c0759pm;
        C0810rm c0810rm = new C0810rm();
        c0810rm.f8258a = new C0785qm[c0868u2.f8388a.size()];
        for (int i3 = 0; i3 < c0868u2.f8388a.size(); i3++) {
            C0785qm c0785qm = new C0785qm();
            Pair pair = (Pair) c0868u2.f8388a.get(i3);
            c0785qm.f8183a = (String) pair.first;
            if (pair.second != null) {
                c0785qm.f8184b = new C0759pm();
                C0842t2 c0842t2 = (C0842t2) pair.second;
                if (c0842t2 == null) {
                    c0759pm = null;
                } else {
                    C0759pm c0759pm2 = new C0759pm();
                    c0759pm2.f8105a = c0842t2.f8333a;
                    c0759pm = c0759pm2;
                }
                c0785qm.f8184b = c0759pm;
            }
            c0810rm.f8258a[i3] = c0785qm;
        }
        return c0810rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0868u2 toModel(C0810rm c0810rm) {
        ArrayList arrayList = new ArrayList();
        for (C0785qm c0785qm : c0810rm.f8258a) {
            String str = c0785qm.f8183a;
            C0759pm c0759pm = c0785qm.f8184b;
            arrayList.add(new Pair(str, c0759pm == null ? null : new C0842t2(c0759pm.f8105a)));
        }
        return new C0868u2(arrayList);
    }
}
