package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes3.dex */
public final class T8 extends U8 implements ProtobufStateSerializer {
    public T8(@NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull AESEncrypter aESEncrypter) {
        super(protobufStateSerializer, aESEncrypter);
    }
}
