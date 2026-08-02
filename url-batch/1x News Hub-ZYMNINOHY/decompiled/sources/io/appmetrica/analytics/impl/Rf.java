package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Rf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f6555a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f6556b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f6557c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f6558d;

    public Rf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f6555a = str;
        this.f6556b = iBinaryDataHelper;
        this.f6557c = protobufStateSerializer;
        this.f6558d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f6556b.remove(this.f6555a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f6556b.get(this.f6555a);
            if (bArr != null && bArr.length != 0) {
                return this.f6558d.toModel((MessageNano) this.f6557c.toState(bArr));
            }
            return this.f6558d.toModel((MessageNano) this.f6557c.defaultValue());
        } catch (Throwable unused) {
            return this.f6558d.toModel((MessageNano) this.f6557c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f6556b.insert(this.f6555a, this.f6557c.toByteArray((MessageNano) this.f6558d.fromModel(obj)));
    }
}
