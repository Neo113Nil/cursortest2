package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class C6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Jg f6620a;

    public C6() {
        this(new Jg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0609e6 fromModel(B6 b6) {
        C0609e6 fromModel = this.f6620a.fromModel(b6.f6588a);
        fromModel.f8118g = 1;
        C0584d6 c0584d6 = new C0584d6();
        fromModel.f8119h = c0584d6;
        c0584d6.f8031a = StringUtils.correctIllFormedString(b6.f6589b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C6(Jg jg) {
        this.f6620a = jg;
    }

    public final B6 a(C0609e6 c0609e6) {
        throw new UnsupportedOperationException();
    }
}
