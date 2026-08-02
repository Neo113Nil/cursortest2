package com.squareup.protos.cash.tax;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OpenTaxResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OpenTaxResponse((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OpenTaxResponse openTaxResponse = (OpenTaxResponse) obj;
        reverseProtoWriter.getClass();
        openTaxResponse.getClass();
        reverseProtoWriter.writeBytes(openTaxResponse.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, openTaxResponse.flow_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OpenTaxResponse openTaxResponse = (OpenTaxResponse) obj;
        openTaxResponse.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, openTaxResponse.flow_url) + openTaxResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OpenTaxResponse openTaxResponse = (OpenTaxResponse) obj;
        openTaxResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = openTaxResponse.flow_url;
        byteString.getClass();
        return new OpenTaxResponse(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OpenTaxResponse openTaxResponse = (OpenTaxResponse) obj;
        openTaxResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openTaxResponse.flow_url);
        protoWriter.writeBytes(openTaxResponse.unknownFields());
    }
}
