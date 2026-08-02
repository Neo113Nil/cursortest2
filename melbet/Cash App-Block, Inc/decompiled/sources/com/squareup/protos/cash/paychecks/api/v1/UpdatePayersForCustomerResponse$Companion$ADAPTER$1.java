package com.squareup.protos.cash.paychecks.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdatePayersForCustomerResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdatePayersForCustomerResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdatePayersForCustomerResponse updatePayersForCustomerResponse = (UpdatePayersForCustomerResponse) obj;
        reverseProtoWriter.getClass();
        updatePayersForCustomerResponse.getClass();
        reverseProtoWriter.writeBytes(updatePayersForCustomerResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdatePayersForCustomerResponse updatePayersForCustomerResponse = (UpdatePayersForCustomerResponse) obj;
        updatePayersForCustomerResponse.getClass();
        return updatePayersForCustomerResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UpdatePayersForCustomerResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdatePayersForCustomerResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdatePayersForCustomerResponse updatePayersForCustomerResponse = (UpdatePayersForCustomerResponse) obj;
        updatePayersForCustomerResponse.getClass();
        protoWriter.writeBytes(updatePayersForCustomerResponse.unknownFields());
    }
}
