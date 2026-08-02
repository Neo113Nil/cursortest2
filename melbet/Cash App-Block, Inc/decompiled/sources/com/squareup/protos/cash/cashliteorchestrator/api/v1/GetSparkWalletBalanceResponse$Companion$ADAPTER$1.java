package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetSparkWalletBalanceResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSparkWalletBalanceResponse((Long) obj, (Long) obj2, (Long) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSparkWalletBalanceResponse getSparkWalletBalanceResponse = (GetSparkWalletBalanceResponse) obj;
        reverseProtoWriter.getClass();
        getSparkWalletBalanceResponse.getClass();
        reverseProtoWriter.writeBytes(getSparkWalletBalanceResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getSparkWalletBalanceResponse.unclaimed_mature_deposit_balance_sats);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getSparkWalletBalanceResponse.unclaimed_immature_deposit_balance_sats);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getSparkWalletBalanceResponse.spendable_balance_sats);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSparkWalletBalanceResponse getSparkWalletBalanceResponse = (GetSparkWalletBalanceResponse) obj;
        getSparkWalletBalanceResponse.getClass();
        int size$okio = getSparkWalletBalanceResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(3, getSparkWalletBalanceResponse.unclaimed_mature_deposit_balance_sats) + protoAdapter.encodedSizeWithTag(2, getSparkWalletBalanceResponse.unclaimed_immature_deposit_balance_sats) + protoAdapter.encodedSizeWithTag(1, getSparkWalletBalanceResponse.spendable_balance_sats) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSparkWalletBalanceResponse getSparkWalletBalanceResponse = (GetSparkWalletBalanceResponse) obj;
        getSparkWalletBalanceResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = getSparkWalletBalanceResponse.spendable_balance_sats;
        Long l2 = getSparkWalletBalanceResponse.unclaimed_immature_deposit_balance_sats;
        Long l3 = getSparkWalletBalanceResponse.unclaimed_mature_deposit_balance_sats;
        byteString.getClass();
        return new GetSparkWalletBalanceResponse(l, l2, l3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSparkWalletBalanceResponse getSparkWalletBalanceResponse = (GetSparkWalletBalanceResponse) obj;
        getSparkWalletBalanceResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, getSparkWalletBalanceResponse.spendable_balance_sats);
        protoAdapter.encodeWithTag(protoWriter, 2, getSparkWalletBalanceResponse.unclaimed_immature_deposit_balance_sats);
        protoAdapter.encodeWithTag(protoWriter, 3, getSparkWalletBalanceResponse.unclaimed_mature_deposit_balance_sats);
        protoWriter.writeBytes(getSparkWalletBalanceResponse.unknownFields());
    }
}
