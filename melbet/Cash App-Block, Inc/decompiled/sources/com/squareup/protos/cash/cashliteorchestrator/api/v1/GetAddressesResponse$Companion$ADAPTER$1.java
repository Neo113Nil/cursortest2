package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAddressesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAddressesResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Address.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) obj;
        reverseProtoWriter.getClass();
        getAddressesResponse.getClass();
        reverseProtoWriter.writeBytes(getAddressesResponse.unknownFields());
        Address.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getAddressesResponse.addresses);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) obj;
        getAddressesResponse.getClass();
        return Address.ADAPTER.asRepeated().encodedSizeWithTag(1, getAddressesResponse.addresses) + getAddressesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) obj;
        getAddressesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getAddressesResponse.addresses, Address.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAddressesResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAddressesResponse getAddressesResponse = (GetAddressesResponse) obj;
        getAddressesResponse.getClass();
        Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getAddressesResponse.addresses);
        protoWriter.writeBytes(getAddressesResponse.unknownFields());
    }
}
