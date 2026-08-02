package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAfterpayOrderDocumentUrlResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAfterpayOrderDocumentUrlResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAfterpayOrderDocumentUrlResponse getAfterpayOrderDocumentUrlResponse = (GetAfterpayOrderDocumentUrlResponse) obj;
        reverseProtoWriter.getClass();
        getAfterpayOrderDocumentUrlResponse.getClass();
        reverseProtoWriter.writeBytes(getAfterpayOrderDocumentUrlResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getAfterpayOrderDocumentUrlResponse.document_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAfterpayOrderDocumentUrlResponse getAfterpayOrderDocumentUrlResponse = (GetAfterpayOrderDocumentUrlResponse) obj;
        getAfterpayOrderDocumentUrlResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, getAfterpayOrderDocumentUrlResponse.document_url) + getAfterpayOrderDocumentUrlResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetAfterpayOrderDocumentUrlResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAfterpayOrderDocumentUrlResponse(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAfterpayOrderDocumentUrlResponse getAfterpayOrderDocumentUrlResponse = (GetAfterpayOrderDocumentUrlResponse) obj;
        getAfterpayOrderDocumentUrlResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAfterpayOrderDocumentUrlResponse.document_url);
        protoWriter.writeBytes(getAfterpayOrderDocumentUrlResponse.unknownFields());
    }
}
