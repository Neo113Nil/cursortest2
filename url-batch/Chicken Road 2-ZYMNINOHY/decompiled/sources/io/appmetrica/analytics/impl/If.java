package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class If implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0920ra f10436a;

    public If() {
        this(new C0920ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(List<String> list) {
        Mn a3 = this.f10436a.a((List<Object>) list);
        List list2 = (List) a3.f10676a;
        C0841o8[] c0841o8Arr = new C0841o8[0];
        if (list2 != null) {
            c0841o8Arr = new C0841o8[list2.size()];
            for (int i4 = 0; i4 < list2.size(); i4++) {
                C0841o8 c0841o8 = new C0841o8();
                c0841o8Arr[i4] = c0841o8;
                c0841o8.f12505a = StringUtils.getUTF8Bytes((String) list2.get(i4));
            }
        }
        a3.f10677b.getBytesTruncated();
        return new Di(c0841o8Arr, a3.f10677b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public If(C0920ra c0920ra) {
        this.f10436a = c0920ra;
    }

    public final List<String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
