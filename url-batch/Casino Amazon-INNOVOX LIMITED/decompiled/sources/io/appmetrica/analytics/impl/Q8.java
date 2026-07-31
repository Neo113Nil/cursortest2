package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Q8 implements ProtobufConverter {
    public static C0574v9 a(P8 p8) {
        C0574v9 c0574v9 = new C0574v9();
        c0574v9.d = new int[p8.b.size()];
        Iterator it = p8.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c0574v9.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        c0574v9.c = p8.d;
        c0574v9.b = p8.c;
        c0574v9.f1532a = p8.f998a;
        return c0574v9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((P8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0574v9 c0574v9 = (C0574v9) obj;
        return new P8(c0574v9.f1532a, c0574v9.b, c0574v9.c, CollectionUtils.hashSetFromIntArray(c0574v9.d));
    }
}
