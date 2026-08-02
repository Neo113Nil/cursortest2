package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.BatchGetLocationStatusRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BatchGetLocationStatusRequest$GetLocationStatusRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BatchGetLocationStatusRequest.GetLocationStatusRequest((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BatchGetLocationStatusRequest.GetLocationStatusRequest getLocationStatusRequest = (BatchGetLocationStatusRequest.GetLocationStatusRequest) obj;
        reverseProtoWriter.getClass();
        getLocationStatusRequest.getClass();
        reverseProtoWriter.writeBytes(getLocationStatusRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getLocationStatusRequest.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getLocationStatusRequest.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BatchGetLocationStatusRequest.GetLocationStatusRequest getLocationStatusRequest = (BatchGetLocationStatusRequest.GetLocationStatusRequest) obj;
        getLocationStatusRequest.getClass();
        int size$okio = getLocationStatusRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, getLocationStatusRequest.location_token) + protoAdapter.encodedSizeWithTag(1, getLocationStatusRequest.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BatchGetLocationStatusRequest.GetLocationStatusRequest getLocationStatusRequest = (BatchGetLocationStatusRequest.GetLocationStatusRequest) obj;
        getLocationStatusRequest.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = getLocationStatusRequest.brand_token;
        String str2 = getLocationStatusRequest.location_token;
        byteString.getClass();
        return new BatchGetLocationStatusRequest.GetLocationStatusRequest(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BatchGetLocationStatusRequest.GetLocationStatusRequest getLocationStatusRequest = (BatchGetLocationStatusRequest.GetLocationStatusRequest) obj;
        getLocationStatusRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getLocationStatusRequest.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, getLocationStatusRequest.location_token);
        protoWriter.writeBytes(getLocationStatusRequest.unknownFields());
    }
}
