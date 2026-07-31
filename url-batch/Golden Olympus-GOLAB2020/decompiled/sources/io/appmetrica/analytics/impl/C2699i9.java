package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.i9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2699i9 implements ProtobufConverter {
    public static P9 a(C2673h9 c2673h9) {
        P9 p9 = new P9();
        p9.f38124d = new int[c2673h9.f39132b.size()];
        Iterator it = c2673h9.f39132b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            p9.f38124d[i4] = ((Integer) it.next()).intValue();
            i4++;
        }
        p9.f38123c = c2673h9.f39134d;
        p9.f38122b = c2673h9.f39133c;
        p9.f38121a = c2673h9.f39131a;
        return p9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((C2673h9) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        P9 p9 = (P9) obj;
        return new C2673h9(p9.f38121a, p9.f38122b, p9.f38123c, CollectionUtils.hashSetFromIntArray(p9.f38124d));
    }
}
