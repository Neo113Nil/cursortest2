package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Nf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f973a;
    public final IBinaryDataHelper b;
    public final ProtobufStateSerializer c;
    public final ProtobufConverter d;

    public Nf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f973a = str;
        this.b = iBinaryDataHelper;
        this.c = protobufStateSerializer;
        this.d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.b.remove(this.f973a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.b.get(this.f973a);
            if (bArr != null && bArr.length != 0) {
                return this.d.toModel((MessageNano) this.c.toState(bArr));
            }
            return this.d.toModel((MessageNano) this.c.defaultValue());
        } catch (Throwable unused) {
            return this.d.toModel((MessageNano) this.c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.b.insert(this.f973a, this.c.toByteArray((MessageNano) this.d.fromModel(obj)));
    }
}
