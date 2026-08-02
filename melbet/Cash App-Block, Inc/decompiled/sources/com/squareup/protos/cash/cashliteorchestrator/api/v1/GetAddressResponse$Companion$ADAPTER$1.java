package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetAddressResponse((Address) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Address.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetAddressResponse getAddressResponse = (GetAddressResponse) obj;
        reverseProtoWriter.getClass();
        getAddressResponse.getClass();
        reverseProtoWriter.writeBytes(getAddressResponse.unknownFields());
        Address.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getAddressResponse.address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetAddressResponse getAddressResponse = (GetAddressResponse) obj;
        getAddressResponse.getClass();
        return Address.ADAPTER.encodedSizeWithTag(1, getAddressResponse.address) + getAddressResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetAddressResponse getAddressResponse = (GetAddressResponse) obj;
        getAddressResponse.getClass();
        Address address = getAddressResponse.address;
        Address address2 = address != null ? (Address) Address.ADAPTER.redact(address) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetAddressResponse(address2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetAddressResponse getAddressResponse = (GetAddressResponse) obj;
        getAddressResponse.getClass();
        Address.ADAPTER.encodeWithTag(protoWriter, 1, getAddressResponse.address);
        protoWriter.writeBytes(getAddressResponse.unknownFields());
    }
}
