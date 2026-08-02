package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020v6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Eg f12870a;

    public C1020v6() {
        this(new Eg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X5 fromModel(C0994u6 c0994u6) {
        X5 fromModel = this.f12870a.fromModel(c0994u6.f12806a);
        fromModel.f11250g = 1;
        W5 w5 = new W5();
        fromModel.f11251h = w5;
        w5.f11163a = StringUtils.correctIllFormedString(c0994u6.f12807b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1020v6(Eg eg) {
        this.f12870a = eg;
    }

    public final C0994u6 a(X5 x5) {
        throw new UnsupportedOperationException();
    }
}
