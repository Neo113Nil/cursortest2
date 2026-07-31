package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Jf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0500sa f906a;

    public Jf() {
        this(new C0500sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(List<String> list) {
        Nn a2 = this.f906a.a((List<Object>) list);
        List list2 = (List) a2.f977a;
        C0424p8[] c0424p8Arr = new C0424p8[0];
        if (list2 != null) {
            c0424p8Arr = new C0424p8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C0424p8 c0424p8 = new C0424p8();
                c0424p8Arr[i] = c0424p8;
                c0424p8.f1428a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        a2.b.getBytesTruncated();
        return new Ei(c0424p8Arr, a2.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Jf(C0500sa c0500sa) {
        this.f906a = c0500sa;
    }

    public final List<String> a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
