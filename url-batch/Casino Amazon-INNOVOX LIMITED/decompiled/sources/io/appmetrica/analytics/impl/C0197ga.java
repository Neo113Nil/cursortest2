package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0197ga implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0380ne f1270a;

    public C0197ga() {
        this(new Tl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0512sm fromModel(C0345m4 c0345m4) {
        C0512sm c0512sm = new C0512sm();
        c0512sm.b = c0345m4.b;
        c0512sm.f1490a = c0345m4.f1369a;
        c0512sm.c = c0345m4.c;
        c0512sm.d = c0345m4.d;
        c0512sm.e = c0345m4.e;
        c0512sm.f = this.f1270a.a(c0345m4.f);
        return c0512sm;
    }

    public C0197ga(Tl tl) {
        this.f1270a = tl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0345m4 toModel(C0512sm c0512sm) {
        C0294k4 c0294k4 = new C0294k4();
        c0294k4.d = c0512sm.d;
        c0294k4.c = c0512sm.c;
        c0294k4.b = c0512sm.b;
        c0294k4.f1334a = c0512sm.f1490a;
        c0294k4.e = c0512sm.e;
        c0294k4.f = this.f1270a.a(c0512sm.f);
        return new C0345m4(c0294k4);
    }
}
