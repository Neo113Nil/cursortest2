package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class H3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ma f37602a;

    public H3() {
        this(new Ma(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull List<String> list) {
        Jn a4 = this.f37602a.a((List<Object>) list);
        C3138z8 c3138z8 = new C3138z8();
        c3138z8.f40323a = StringUtils.getUTF8Bytes((List<String>) a4.f37851a);
        InterfaceC3081x3 interfaceC3081x3 = a4.f37852b;
        int i4 = ((I4) interfaceC3081x3).f40000a;
        return new Qi(c3138z8, interfaceC3081x3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public H3(@NonNull Ma ma) {
        this.f37602a = ma;
    }

    @NonNull
    public final List<String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
