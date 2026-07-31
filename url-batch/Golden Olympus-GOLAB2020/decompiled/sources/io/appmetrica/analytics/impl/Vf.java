package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class Vf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ma f38424a;

    public Vf() {
        this(new Ma(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull List<String> list) {
        Jn a4 = this.f38424a.a((List<Object>) list);
        List list2 = (List) a4.f37851a;
        I8[] i8Arr = new I8[0];
        if (list2 != null) {
            i8Arr = new I8[list2.size()];
            for (int i4 = 0; i4 < list2.size(); i4++) {
                I8 i8 = new I8();
                i8Arr[i4] = i8;
                i8.f37727a = StringUtils.getUTF8Bytes((String) list2.get(i4));
            }
        }
        a4.f37852b.getBytesTruncated();
        return new Qi(i8Arr, a4.f37852b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Vf(@NonNull Ma ma) {
        this.f38424a = ma;
    }

    @NonNull
    public final List<String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
