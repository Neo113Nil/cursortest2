package com.squareup.protos.cash.moneta.api.v1_0;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.moneta.api.v1_0.SelectInstrumentRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SelectInstrumentRequest$ApplePayPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SelectInstrumentRequest.ApplePayPayload((String) obj, (SelectInstrumentRequest.ApplePayPayload.Header) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(SelectInstrumentRequest.ApplePayPayload.Header.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SelectInstrumentRequest.ApplePayPayload applePayPayload = (SelectInstrumentRequest.ApplePayPayload) obj;
        reverseProtoWriter.getClass();
        applePayPayload.getClass();
        reverseProtoWriter.writeBytes(applePayPayload.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, applePayPayload.version);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, applePayPayload.signature);
        SelectInstrumentRequest.ApplePayPayload.Header.ADAPTER.encodeWithTag(reverseProtoWriter, 2, applePayPayload.header);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, applePayPayload.data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SelectInstrumentRequest.ApplePayPayload applePayPayload = (SelectInstrumentRequest.ApplePayPayload) obj;
        applePayPayload.getClass();
        int size$okio = applePayPayload.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, applePayPayload.version) + protoAdapter.encodedSizeWithTag(3, applePayPayload.signature) + SelectInstrumentRequest.ApplePayPayload.Header.ADAPTER.encodedSizeWithTag(2, applePayPayload.header) + protoAdapter.encodedSizeWithTag(1, applePayPayload.data) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SelectInstrumentRequest.ApplePayPayload applePayPayload = (SelectInstrumentRequest.ApplePayPayload) obj;
        applePayPayload.getClass();
        SelectInstrumentRequest.ApplePayPayload.Header header = applePayPayload.header;
        SelectInstrumentRequest.ApplePayPayload.Header header2 = header != null ? (SelectInstrumentRequest.ApplePayPayload.Header) SelectInstrumentRequest.ApplePayPayload.Header.ADAPTER.redact(header) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = applePayPayload.data;
        String str2 = applePayPayload.signature;
        String str3 = applePayPayload.version;
        byteString.getClass();
        return new SelectInstrumentRequest.ApplePayPayload(str, header2, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SelectInstrumentRequest.ApplePayPayload applePayPayload = (SelectInstrumentRequest.ApplePayPayload) obj;
        applePayPayload.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, applePayPayload.data);
        SelectInstrumentRequest.ApplePayPayload.Header.ADAPTER.encodeWithTag(protoWriter, 2, applePayPayload.header);
        protoAdapter.encodeWithTag(protoWriter, 3, applePayPayload.signature);
        protoAdapter.encodeWithTag(protoWriter, 4, applePayPayload.version);
        protoWriter.writeBytes(applePayPayload.unknownFields());
    }
}
