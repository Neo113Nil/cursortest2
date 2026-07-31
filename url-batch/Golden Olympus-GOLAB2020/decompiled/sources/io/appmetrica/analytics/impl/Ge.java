package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Ge implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Qa f37576a;

    public Ge() {
        this(new Qa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Map<String, String> map) {
        Jn a4 = this.f37576a.a(map);
        F8 f8 = new F8();
        f8.f37516b = ((I4) a4.f37852b).f37703b;
        Map map2 = (Map) a4.f37851a;
        if (map2 != null) {
            f8.f37515a = new E8[map2.size()];
            int i4 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                f8.f37515a[i4] = new E8();
                f8.f37515a[i4].f37418a = StringUtils.getUTF8Bytes((String) entry.getKey());
                f8.f37515a[i4].f37419b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i4++;
            }
        }
        InterfaceC3081x3 interfaceC3081x3 = a4.f37852b;
        int i5 = ((I4) interfaceC3081x3).f40000a;
        return new Qi(f8, interfaceC3081x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ge(@NonNull Qa qa) {
        this.f37576a = qa;
    }

    @NonNull
    public final Map<String, String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
