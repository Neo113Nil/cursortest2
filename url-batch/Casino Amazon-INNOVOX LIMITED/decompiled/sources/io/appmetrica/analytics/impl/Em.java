package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Em implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0587vm fromModel(Dm dm) {
        C0587vm c0587vm = new C0587vm();
        c0587vm.f1540a = dm.f816a;
        return c0587vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C0587vm) obj).f1540a);
    }

    public final Dm a(C0587vm c0587vm) {
        return new Dm(c0587vm.f1540a);
    }
}
