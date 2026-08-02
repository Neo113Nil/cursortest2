package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.idsync.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0466d implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0467e f9911a;

    public C0466d(C0467e c0467e) {
        this.f9911a = c0467e;
    }

    public final byte[] a(IdSyncConfig idSyncConfig) {
        return MessageNano.toByteArray(this.f9911a.fromModel(idSyncConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f9911a.fromModel((IdSyncConfig) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(byte[] bArr) {
        return this.f9911a.toModel((m) MessageNano.mergeFrom(new m(), bArr));
    }
}
