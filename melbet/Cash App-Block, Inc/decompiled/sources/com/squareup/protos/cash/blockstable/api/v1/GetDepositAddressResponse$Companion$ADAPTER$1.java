package com.squareup.protos.cash.blockstable.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetDepositAddressResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetDepositAddressResponse((String) obj, (String) obj2, (String) obj3, (ResponseContext) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) obj;
        reverseProtoWriter.getClass();
        getDepositAddressResponse.getClass();
        reverseProtoWriter.writeBytes(getDepositAddressResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getDepositAddressResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getDepositAddressResponse.qr_code_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getDepositAddressResponse.truncated_deposit_address);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getDepositAddressResponse.deposit_address);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) obj;
        getDepositAddressResponse.getClass();
        int size$okio = getDepositAddressResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, getDepositAddressResponse.response_context) + protoAdapter.encodedSizeWithTag(3, getDepositAddressResponse.qr_code_url) + protoAdapter.encodedSizeWithTag(2, getDepositAddressResponse.truncated_deposit_address) + protoAdapter.encodedSizeWithTag(1, getDepositAddressResponse.deposit_address) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) obj;
        getDepositAddressResponse.getClass();
        ResponseContext responseContext = getDepositAddressResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getDepositAddressResponse.deposit_address;
        String str2 = getDepositAddressResponse.truncated_deposit_address;
        String str3 = getDepositAddressResponse.qr_code_url;
        byteString.getClass();
        return new GetDepositAddressResponse(str, str2, str3, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetDepositAddressResponse getDepositAddressResponse = (GetDepositAddressResponse) obj;
        getDepositAddressResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, getDepositAddressResponse.deposit_address);
        protoAdapter.encodeWithTag(protoWriter, 2, getDepositAddressResponse.truncated_deposit_address);
        protoAdapter.encodeWithTag(protoWriter, 3, getDepositAddressResponse.qr_code_url);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, getDepositAddressResponse.response_context);
        protoWriter.writeBytes(getDepositAddressResponse.unknownFields());
    }
}
