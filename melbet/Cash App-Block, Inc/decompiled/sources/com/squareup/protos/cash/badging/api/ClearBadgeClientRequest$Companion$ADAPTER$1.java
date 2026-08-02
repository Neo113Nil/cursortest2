package com.squareup.protos.cash.badging.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClearBadgeClientRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClearBadgeClientRequest((String) obj, (ItemType) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = ItemType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClearBadgeClientRequest clearBadgeClientRequest = (ClearBadgeClientRequest) obj;
        reverseProtoWriter.getClass();
        clearBadgeClientRequest.getClass();
        reverseProtoWriter.writeBytes(clearBadgeClientRequest.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, clearBadgeClientRequest.external_version);
        ItemType.ADAPTER.encodeWithTag(reverseProtoWriter, 2, clearBadgeClientRequest.item_type);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, clearBadgeClientRequest.external_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClearBadgeClientRequest clearBadgeClientRequest = (ClearBadgeClientRequest) obj;
        clearBadgeClientRequest.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, clearBadgeClientRequest.external_version) + ItemType.ADAPTER.encodedSizeWithTag(2, clearBadgeClientRequest.item_type) + ProtoAdapter.STRING.encodedSizeWithTag(1, clearBadgeClientRequest.external_token) + clearBadgeClientRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClearBadgeClientRequest clearBadgeClientRequest = (ClearBadgeClientRequest) obj;
        clearBadgeClientRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clearBadgeClientRequest.external_token;
        ItemType itemType = clearBadgeClientRequest.item_type;
        Long l = clearBadgeClientRequest.external_version;
        byteString.getClass();
        return new ClearBadgeClientRequest(str, itemType, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClearBadgeClientRequest clearBadgeClientRequest = (ClearBadgeClientRequest) obj;
        clearBadgeClientRequest.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, clearBadgeClientRequest.external_token);
        ItemType.ADAPTER.encodeWithTag(protoWriter, 2, clearBadgeClientRequest.item_type);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clearBadgeClientRequest.external_version);
        protoWriter.writeBytes(clearBadgeClientRequest.unknownFields());
    }
}
