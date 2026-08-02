package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610fa implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0795me f11833a;

    public C0610fa() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0932rm fromModel(C0759l4 c0759l4) {
        C0932rm c0932rm = new C0932rm();
        c0932rm.f12686b = c0759l4.f12260b;
        c0932rm.f12685a = c0759l4.f12259a;
        c0932rm.f12687c = c0759l4.f12261c;
        c0932rm.f12688d = c0759l4.f12262d;
        c0932rm.f12689e = c0759l4.f12263e;
        c0932rm.f12690f = this.f11833a.a(c0759l4.f12264f);
        return c0932rm;
    }

    public C0610fa(Sl sl) {
        this.f11833a = sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0759l4 toModel(C0932rm c0932rm) {
        C0707j4 c0707j4 = new C0707j4();
        c0707j4.f12097d = c0932rm.f12688d;
        c0707j4.f12096c = c0932rm.f12687c;
        c0707j4.f12095b = c0932rm.f12686b;
        c0707j4.f12094a = c0932rm.f12685a;
        c0707j4.f12098e = c0932rm.f12689e;
        c0707j4.f12099f = this.f11833a.a(c0932rm.f12690f);
        return new C0759l4(c0707j4);
    }
}
