package com.squareup.protos.cash.moneta.api.v1_0;

import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$GooglePayPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectInstrumentRequest.GooglePayPayload((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SelectInstrumentRequest.GooglePayPayload googlePayPayload = (SelectInstrumentRequest.GooglePayPayload) obj;
        reverseProtoWriter.getClass();
        googlePayPayload.getClass();
        reverseProtoWriter.writeBytes(googlePayPayload.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, googlePayPayload.idempotence_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, googlePayPayload.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectInstrumentRequest.GooglePayPayload googlePayPayload = (SelectInstrumentRequest.GooglePayPayload) obj;
        googlePayPayload.getClass();
        int size$okio = googlePayPayload.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, googlePayPayload.idempotence_token) + protoAdapter.encodedSizeWithTag(1, googlePayPayload.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectInstrumentRequest.GooglePayPayload googlePayPayload = (SelectInstrumentRequest.GooglePayPayload) obj;
        googlePayPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = googlePayPayload.token;
        String str2 = googlePayPayload.idempotence_token;
        byteString.getClass();
        return new SelectInstrumentRequest.GooglePayPayload(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectInstrumentRequest.GooglePayPayload googlePayPayload = (SelectInstrumentRequest.GooglePayPayload) obj;
        googlePayPayload.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, googlePayPayload.token);
        protoAdapter.encodeWithTag(protoWriter, 2, googlePayPayload.idempotence_token);
        protoWriter.writeBytes(googlePayPayload.unknownFields());
    }
}
