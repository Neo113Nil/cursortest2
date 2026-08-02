package com.squareup.protos.cash.piggybank.api.v2;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InterestRate$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new InterestRate((Double) obj, (InterestYieldStatus) obj2, (InterestTiersApyRates) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = InterestYieldStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(InterestTiersApyRates.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InterestRate interestRate = (InterestRate) obj;
        reverseProtoWriter.getClass();
        interestRate.getClass();
        reverseProtoWriter.writeBytes(interestRate.unknownFields());
        InterestTiersApyRates.ADAPTER.encodeWithTag(reverseProtoWriter, 3, interestRate.interest_tiers_apy_rates);
        InterestYieldStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, interestRate.interest_yield_status);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 1, interestRate.apy_rate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InterestRate interestRate = (InterestRate) obj;
        interestRate.getClass();
        return InterestTiersApyRates.ADAPTER.encodedSizeWithTag(3, interestRate.interest_tiers_apy_rates) + InterestYieldStatus.ADAPTER.encodedSizeWithTag(2, interestRate.interest_yield_status) + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, interestRate.apy_rate) + interestRate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InterestRate interestRate = (InterestRate) obj;
        interestRate.getClass();
        InterestTiersApyRates interestTiersApyRates = interestRate.interest_tiers_apy_rates;
        InterestTiersApyRates interestTiersApyRates2 = interestTiersApyRates != null ? (InterestTiersApyRates) InterestTiersApyRates.ADAPTER.redact(interestTiersApyRates) : null;
        ByteString byteString = ByteString.EMPTY;
        Double d = interestRate.apy_rate;
        InterestYieldStatus interestYieldStatus = interestRate.interest_yield_status;
        byteString.getClass();
        return new InterestRate(d, interestYieldStatus, interestTiersApyRates2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InterestRate interestRate = (InterestRate) obj;
        interestRate.getClass();
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, interestRate.apy_rate);
        InterestYieldStatus.ADAPTER.encodeWithTag(protoWriter, 2, interestRate.interest_yield_status);
        InterestTiersApyRates.ADAPTER.encodeWithTag(protoWriter, 3, interestRate.interest_tiers_apy_rates);
        protoWriter.writeBytes(interestRate.unknownFields());
    }
}
