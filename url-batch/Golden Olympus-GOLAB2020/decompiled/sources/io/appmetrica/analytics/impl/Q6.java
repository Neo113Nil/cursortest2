package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Q6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Rg f38158a;

    public Q6() {
        this(new Rg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2980t6 fromModel(@NonNull P6 p6) {
        C2980t6 fromModel = this.f38158a.fromModel(p6.f38117a);
        fromModel.f39838g = 1;
        C2954s6 c2954s6 = new C2954s6();
        fromModel.f39839h = c2954s6;
        c2954s6.f39787a = StringUtils.correctIllFormedString(p6.f38118b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Q6(Rg rg) {
        this.f38158a = rg;
    }

    @NonNull
    public final P6 a(@NonNull C2980t6 c2980t6) {
        throw new UnsupportedOperationException();
    }
}
