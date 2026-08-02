package com.squareup.protos.cash.cashcustomerprofile.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateDisclosureAcceptanceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateDisclosureAcceptanceResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateDisclosureAcceptanceResponse updateDisclosureAcceptanceResponse = (UpdateDisclosureAcceptanceResponse) obj;
        reverseProtoWriter.getClass();
        updateDisclosureAcceptanceResponse.getClass();
        reverseProtoWriter.writeBytes(updateDisclosureAcceptanceResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateDisclosureAcceptanceResponse updateDisclosureAcceptanceResponse = (UpdateDisclosureAcceptanceResponse) obj;
        updateDisclosureAcceptanceResponse.getClass();
        return updateDisclosureAcceptanceResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UpdateDisclosureAcceptanceResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateDisclosureAcceptanceResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateDisclosureAcceptanceResponse updateDisclosureAcceptanceResponse = (UpdateDisclosureAcceptanceResponse) obj;
        updateDisclosureAcceptanceResponse.getClass();
        protoWriter.writeBytes(updateDisclosureAcceptanceResponse.unknownFields());
    }
}
