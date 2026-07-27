package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976sb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Tc f9245a;

    public C0976sb() {
        this(new Tc(new Tn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Sn sn) {
        return MessageNano.toByteArray((MessageNano) this.f9245a.f7530a.fromModel(sn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0976sb(Tc tc) {
        this.f9245a = tc;
    }

    public final Sn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
