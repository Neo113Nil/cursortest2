package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Mf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f10654a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f10655b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f10656c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f10657d;

    public Mf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f10654a = str;
        this.f10655b = iBinaryDataHelper;
        this.f10656c = protobufStateSerializer;
        this.f10657d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f10655b.remove(this.f10654a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f10655b.get(this.f10654a);
            if (bArr != null && bArr.length != 0) {
                return this.f10657d.toModel((MessageNano) this.f10656c.toState(bArr));
            }
            return this.f10657d.toModel((MessageNano) this.f10656c.defaultValue());
        } catch (Throwable unused) {
            return this.f10657d.toModel((MessageNano) this.f10656c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f10655b.insert(this.f10654a, this.f10656c.toByteArray((MessageNano) this.f10657d.fromModel(obj)));
    }
}
