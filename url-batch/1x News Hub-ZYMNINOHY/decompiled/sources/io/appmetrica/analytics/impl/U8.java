package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class U8 implements ProtobufConverter {
    public static B9 a(T8 t8) {
        B9 b9 = new B9();
        b9.f5815d = new int[t8.f6692b.size()];
        Iterator it = t8.f6692b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            b9.f5815d[i3] = ((Integer) it.next()).intValue();
            i3++;
        }
        b9.f5814c = t8.f6694d;
        b9.f5813b = t8.f6693c;
        b9.f5812a = t8.f6691a;
        return b9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((T8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        B9 b9 = (B9) obj;
        return new T8(b9.f5812a, b9.f5813b, b9.f5814c, CollectionUtils.hashSetFromIntArray(b9.f5815d));
    }
}
