package com.squareup.protos.cash.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RequestMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RequestMetadata((ByteString) obj, (InternalRegion) obj2, (Integer) obj3, (String) obj4, (Boolean) obj5, (ByteString) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = InternalRegion.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.UINT32.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BYTES.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        reverseProtoWriter.getClass();
        requestMetadata.getClass();
        reverseProtoWriter.writeBytes(requestMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, requestMetadata.serialized_configuration);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, requestMetadata.is_retry);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, requestMetadata.origin_ip);
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 3, requestMetadata.deadline);
        InternalRegion.ADAPTER.encodeWithTag(reverseProtoWriter, 2, requestMetadata.region);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, requestMetadata.signed_client_session);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        requestMetadata.getClass();
        int size$okio = requestMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(6, requestMetadata.serialized_configuration) + ProtoAdapter.BOOL.encodedSizeWithTag(5, requestMetadata.is_retry) + ProtoAdapter.STRING.encodedSizeWithTag(4, requestMetadata.origin_ip) + ProtoAdapter.UINT32.encodedSizeWithTag(3, requestMetadata.deadline) + InternalRegion.ADAPTER.encodedSizeWithTag(2, requestMetadata.region) + protoAdapter.encodedSizeWithTag(1, requestMetadata.signed_client_session) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        requestMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = requestMetadata.signed_client_session;
        InternalRegion internalRegion = requestMetadata.region;
        Integer num = requestMetadata.deadline;
        String str = requestMetadata.origin_ip;
        Boolean bool = requestMetadata.is_retry;
        ByteString byteString3 = requestMetadata.serialized_configuration;
        byteString.getClass();
        return new RequestMetadata(byteString2, internalRegion, num, str, bool, byteString3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RequestMetadata requestMetadata = (RequestMetadata) obj;
        requestMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, requestMetadata.signed_client_session);
        InternalRegion.ADAPTER.encodeWithTag(protoWriter, 2, requestMetadata.region);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 3, requestMetadata.deadline);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, requestMetadata.origin_ip);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, requestMetadata.is_retry);
        protoAdapter.encodeWithTag(protoWriter, 6, requestMetadata.serialized_configuration);
        protoWriter.writeBytes(requestMetadata.unknownFields());
    }
}
