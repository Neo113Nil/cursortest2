package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class Nf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0979ya f6372a;

    public Nf() {
        this(new C0979ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(List<String> list) {
        On a3 = this.f6372a.a((List<Object>) list);
        List list2 = (List) a3.f6419a;
        C0874u8[] c0874u8Arr = new C0874u8[0];
        if (list2 != null) {
            c0874u8Arr = new C0874u8[list2.size()];
            for (int i3 = 0; i3 < list2.size(); i3++) {
                C0874u8 c0874u8 = new C0874u8();
                c0874u8Arr[i3] = c0874u8;
                c0874u8.f8417a = StringUtils.getUTF8Bytes((String) list2.get(i3));
            }
        }
        a3.f6420b.getBytesTruncated();
        return new Ii(c0874u8Arr, a3.f6420b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Nf(C0979ya c0979ya) {
        this.f6372a = c0979ya;
    }

    public final List<String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
