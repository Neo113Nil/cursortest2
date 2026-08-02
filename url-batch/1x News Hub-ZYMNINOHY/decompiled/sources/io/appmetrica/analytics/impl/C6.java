package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class C6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Jg f5838a;

    public C6() {
        this(new Jg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0458e6 fromModel(B6 b6) {
        C0458e6 fromModel = this.f5838a.fromModel(b6.f5808a);
        fromModel.f7253g = 1;
        C0433d6 c0433d6 = new C0433d6();
        fromModel.f7254h = c0433d6;
        c0433d6.f7174a = StringUtils.correctIllFormedString(b6.f5809b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C6(Jg jg) {
        this.f5838a = jg;
    }

    public final B6 a(C0458e6 c0458e6) {
        throw new UnsupportedOperationException();
    }
}
