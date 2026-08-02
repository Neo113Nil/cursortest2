package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class P8 implements ProtobufConverter {
    public static C0997u9 a(O8 o8) {
        C0997u9 c0997u9 = new C0997u9();
        c0997u9.f12826d = new int[o8.f10746b.size()];
        Iterator it = o8.f10746b.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            c0997u9.f12826d[i4] = ((Integer) it.next()).intValue();
            i4++;
        }
        c0997u9.f12825c = o8.f10748d;
        c0997u9.f12824b = o8.f10747c;
        c0997u9.f12823a = o8.f10745a;
        return c0997u9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((O8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0997u9 c0997u9 = (C0997u9) obj;
        return new O8(c0997u9.f12823a, c0997u9.f12824b, c0997u9.f12825c, CollectionUtils.hashSetFromIntArray(c0997u9.f12826d));
    }
}
