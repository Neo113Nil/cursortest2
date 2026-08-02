package com.squareup.protos.cash.sup.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetMerchantConfigResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetMerchantConfigResponse((AvailableCreditLimit) obj, (Boolean) obj2, (Long) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AvailableCreditLimit.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) obj;
        reverseProtoWriter.getClass();
        getMerchantConfigResponse.getClass();
        reverseProtoWriter.writeBytes(getMerchantConfigResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getMerchantConfigResponse.active_loans);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getMerchantConfigResponse.loan_limit);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, getMerchantConfigResponse.card_on_file);
        AvailableCreditLimit.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMerchantConfigResponse.available_credit_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) obj;
        getMerchantConfigResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, getMerchantConfigResponse.card_on_file) + AvailableCreditLimit.ADAPTER.encodedSizeWithTag(1, getMerchantConfigResponse.available_credit_limit) + getMerchantConfigResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(4, getMerchantConfigResponse.active_loans) + protoAdapter.encodedSizeWithTag(3, getMerchantConfigResponse.loan_limit) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) obj;
        getMerchantConfigResponse.getClass();
        AvailableCreditLimit availableCreditLimit = getMerchantConfigResponse.available_credit_limit;
        AvailableCreditLimit availableCreditLimit2 = availableCreditLimit != null ? (AvailableCreditLimit) AvailableCreditLimit.ADAPTER.redact(availableCreditLimit) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getMerchantConfigResponse.card_on_file;
        Long l = getMerchantConfigResponse.loan_limit;
        Long l2 = getMerchantConfigResponse.active_loans;
        byteString.getClass();
        return new GetMerchantConfigResponse(availableCreditLimit2, bool, l, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMerchantConfigResponse getMerchantConfigResponse = (GetMerchantConfigResponse) obj;
        getMerchantConfigResponse.getClass();
        AvailableCreditLimit.ADAPTER.encodeWithTag(protoWriter, 1, getMerchantConfigResponse.available_credit_limit);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getMerchantConfigResponse.card_on_file);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 3, getMerchantConfigResponse.loan_limit);
        protoAdapter.encodeWithTag(protoWriter, 4, getMerchantConfigResponse.active_loans);
        protoWriter.writeBytes(getMerchantConfigResponse.unknownFields());
    }
}
