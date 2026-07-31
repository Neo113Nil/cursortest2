package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0596w6 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Fg f1547a;

    public C0596w6() {
        this(new Fg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(C0571v6 c0571v6) {
        Y5 fromModel = this.f1547a.fromModel(c0571v6.f1529a);
        fromModel.g = 1;
        X5 x5 = new X5();
        fromModel.h = x5;
        x5.f1113a = StringUtils.correctIllFormedString(c0571v6.b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0596w6(Fg fg) {
        this.f1547a = fg;
    }

    public final C0571v6 a(Y5 y5) {
        throw new UnsupportedOperationException();
    }
}
