package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0027d implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0028e f730a;

    public C0027d(C0028e c0028e) {
        this.f730a = c0028e;
    }

    public final byte[] a(IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f730a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f730a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(byte[] bArr) {
        return this.f730a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
