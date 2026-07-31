package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.mb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0352mb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Nc f1375a;

    public C0352mb() {
        this(new Nc(new Sn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Rn rn) {
        return MessageNano.toByteArray((MessageNano) this.f1375a.f970a.fromModel(rn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0352mb(Nc nc) {
        this.f1375a = nc;
    }

    public final Rn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
