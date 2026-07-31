package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class Zf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f38620a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f38621b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f38622c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f38623d;

    public Zf(@NonNull String str, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f38620a = str;
        this.f38621b = iBinaryDataHelper;
        this.f38622c = protobufStateSerializer;
        this.f38623d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f38621b.remove(this.f38620a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    @NonNull
    public final Object read() {
        try {
            byte[] bArr = this.f38621b.get(this.f38620a);
            if (bArr != null && bArr.length != 0) {
                return this.f38623d.toModel((MessageNano) this.f38622c.toState(bArr));
            }
            return this.f38623d.toModel((MessageNano) this.f38622c.defaultValue());
        } catch (Throwable unused) {
            return this.f38623d.toModel((MessageNano) this.f38622c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(@NonNull Object obj) {
        this.f38621b.insert(this.f38620a, this.f38622c.toByteArray((MessageNano) this.f38623d.fromModel(obj)));
    }
}
