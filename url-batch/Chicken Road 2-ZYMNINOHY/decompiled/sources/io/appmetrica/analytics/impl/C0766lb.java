package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766lb implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Mc f12288a;

    public C0766lb() {
        this(new Mc(new Rn()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Qn qn) {
        return MessageNano.toByteArray((MessageNano) this.f12288a.f10644a.fromModel(qn));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0766lb(Mc mc) {
        this.f12288a = mc;
    }

    public final Qn a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
