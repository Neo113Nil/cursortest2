package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalAdditionalBuyerInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalAdditionalBuyerInfo$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalAdditionalBuyerInfo((LocalAdditionalBuyerInfo.Type) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = LocalAdditionalBuyerInfo.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
        reverseProtoWriter.getClass();
        localAdditionalBuyerInfo.getClass();
        reverseProtoWriter.writeBytes(localAdditionalBuyerInfo.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localAdditionalBuyerInfo.value);
        LocalAdditionalBuyerInfo.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localAdditionalBuyerInfo.f1305type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
        localAdditionalBuyerInfo.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, localAdditionalBuyerInfo.value) + LocalAdditionalBuyerInfo.Type.ADAPTER.encodedSizeWithTag(1, localAdditionalBuyerInfo.f1305type) + localAdditionalBuyerInfo.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
        localAdditionalBuyerInfo.getClass();
        ByteString byteString = ByteString.EMPTY;
        LocalAdditionalBuyerInfo.Type type2 = localAdditionalBuyerInfo.f1305type;
        byteString.getClass();
        return new LocalAdditionalBuyerInfo(type2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalAdditionalBuyerInfo localAdditionalBuyerInfo = (LocalAdditionalBuyerInfo) obj;
        localAdditionalBuyerInfo.getClass();
        LocalAdditionalBuyerInfo.Type.ADAPTER.encodeWithTag(protoWriter, 1, localAdditionalBuyerInfo.f1305type);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localAdditionalBuyerInfo.value);
        protoWriter.writeBytes(localAdditionalBuyerInfo.unknownFields());
    }
}
