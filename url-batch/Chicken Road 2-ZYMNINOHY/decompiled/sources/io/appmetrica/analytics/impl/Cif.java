package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif extends BaseProtobufStateSerializer {
    public final C0822nf a() {
        return new C0822nf();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final MessageNano defaultValue() {
        return new C0822nf();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0822nf toState(byte[] bArr) throws IOException {
        return (C0822nf) MessageNano.mergeFrom(new C0822nf(), bArr);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C0822nf();
    }
}
