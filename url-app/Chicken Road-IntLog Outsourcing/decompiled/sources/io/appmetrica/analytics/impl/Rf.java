package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Rf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f7374a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f7375b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f7376c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f7377d;

    public Rf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f7374a = str;
        this.f7375b = iBinaryDataHelper;
        this.f7376c = protobufStateSerializer;
        this.f7377d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f7375b.remove(this.f7374a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f7375b.get(this.f7374a);
            if (bArr != null && bArr.length != 0) {
                return this.f7377d.toModel((MessageNano) this.f7376c.toState(bArr));
            }
            return this.f7377d.toModel((MessageNano) this.f7376c.defaultValue());
        } catch (Throwable unused) {
            return this.f7377d.toModel((MessageNano) this.f7376c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f7375b.insert(this.f7374a, this.f7376c.toByteArray((MessageNano) this.f7377d.fromModel(obj)));
    }
}
