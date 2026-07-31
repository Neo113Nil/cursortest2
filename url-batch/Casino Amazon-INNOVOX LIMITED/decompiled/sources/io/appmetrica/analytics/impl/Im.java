package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Im implements ProtobufConverter {
    public final C0612wm a(Hm hm) {
        C0612wm c0612wm = new C0612wm();
        c0612wm.f1553a = hm.f879a;
        return c0612wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0612wm c0612wm = new C0612wm();
        c0612wm.f1553a = ((Hm) obj).f879a;
        return c0612wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Hm(((C0612wm) obj).f1553a);
    }

    public final Hm a(C0612wm c0612wm) {
        return new Hm(c0612wm.f1553a);
    }
}
