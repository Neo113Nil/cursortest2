package com.squareup.protos.cash.moneta.api.v1_0;

import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$ApplePayPayload$Header$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectInstrumentRequest.ApplePayPayload.Header((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectInstrumentRequest.ApplePayPayload.Header header = (SelectInstrumentRequest.ApplePayPayload.Header) obj;
        reverseProtoWriter.getClass();
        header.getClass();
        reverseProtoWriter.writeBytes(header.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, header.transaction_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, header.public_key_hash);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, header.wrapped_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, header.ephemeral_public_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, header.application_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectInstrumentRequest.ApplePayPayload.Header header = (SelectInstrumentRequest.ApplePayPayload.Header) obj;
        header.getClass();
        int size$okio = header.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, header.transaction_id) + protoAdapter.encodedSizeWithTag(4, header.public_key_hash) + protoAdapter.encodedSizeWithTag(3, header.wrapped_key) + protoAdapter.encodedSizeWithTag(2, header.ephemeral_public_key) + protoAdapter.encodedSizeWithTag(1, header.application_data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectInstrumentRequest.ApplePayPayload.Header header = (SelectInstrumentRequest.ApplePayPayload.Header) obj;
        header.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = header.application_data;
        String str2 = header.ephemeral_public_key;
        String str3 = header.wrapped_key;
        String str4 = header.public_key_hash;
        String str5 = header.transaction_id;
        byteString.getClass();
        return new SelectInstrumentRequest.ApplePayPayload.Header(str, str2, str3, str4, str5, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectInstrumentRequest.ApplePayPayload.Header header = (SelectInstrumentRequest.ApplePayPayload.Header) obj;
        header.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, header.application_data);
        protoAdapter.encodeWithTag(protoWriter, 2, header.ephemeral_public_key);
        protoAdapter.encodeWithTag(protoWriter, 3, header.wrapped_key);
        protoAdapter.encodeWithTag(protoWriter, 4, header.public_key_hash);
        protoAdapter.encodeWithTag(protoWriter, 5, header.transaction_id);
        protoWriter.writeBytes(header.unknownFields());
    }
}
