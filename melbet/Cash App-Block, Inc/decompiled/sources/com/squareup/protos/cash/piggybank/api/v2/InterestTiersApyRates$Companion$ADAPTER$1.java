package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InterestTiersApyRates$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InterestTiersApyRates((Double) obj, (Double) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InterestTiersApyRates interestTiersApyRates = (InterestTiersApyRates) obj;
        reverseProtoWriter.getClass();
        interestTiersApyRates.getClass();
        reverseProtoWriter.writeBytes(interestTiersApyRates.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, interestTiersApyRates.enhanced_interest_apy_rate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, interestTiersApyRates.standard_interest_apy_rate);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InterestTiersApyRates interestTiersApyRates = (InterestTiersApyRates) obj;
        interestTiersApyRates.getClass();
        int size$okio = interestTiersApyRates.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        return protoAdapter.encodedSizeWithTag(2, interestTiersApyRates.enhanced_interest_apy_rate) + protoAdapter.encodedSizeWithTag(1, interestTiersApyRates.standard_interest_apy_rate) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InterestTiersApyRates interestTiersApyRates = (InterestTiersApyRates) obj;
        interestTiersApyRates.getClass();
        ByteString byteString = ByteString.EMPTY;
        Double d = interestTiersApyRates.standard_interest_apy_rate;
        Double d2 = interestTiersApyRates.enhanced_interest_apy_rate;
        byteString.getClass();
        return new InterestTiersApyRates(d, d2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InterestTiersApyRates interestTiersApyRates = (InterestTiersApyRates) obj;
        interestTiersApyRates.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, interestTiersApyRates.standard_interest_apy_rate);
        protoAdapter.encodeWithTag(protoWriter, 2, interestTiersApyRates.enhanced_interest_apy_rate);
        protoWriter.writeBytes(interestTiersApyRates.unknownFields());
    }
}
