package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1021v7 f11279a;

    /* renamed from: b, reason: collision with root package name */
    public final C0946sa f11280b;

    public Y() {
        this(new C1021v7(), new C0946sa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Z z) {
        C0531c8 c0531c8 = new C0531c8();
        c0531c8.f11595b = this.f11279a.fromModel(z.f11330a);
        Mn a3 = this.f11280b.a(z.f11331b);
        c0531c8.f11594a = StringUtils.getUTF8Bytes((String) a3.f10676a);
        return new Di(c0531c8, new C0474a3(C0474a3.b(a3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(C1021v7 c1021v7, C0946sa c0946sa) {
        this.f11279a = c1021v7;
        this.f11280b = c0946sa;
    }

    public final Z a(Di di) {
        throw new UnsupportedOperationException();
    }
}
