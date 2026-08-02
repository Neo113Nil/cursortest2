package com.squareup.protos.cash.portfolios;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetHoldingsHistoricalDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetHoldingsHistoricalDataResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(HoldingBalanceHistory.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetHoldingsHistoricalDataResponse getHoldingsHistoricalDataResponse = (GetHoldingsHistoricalDataResponse) obj;
        reverseProtoWriter.getClass();
        getHoldingsHistoricalDataResponse.getClass();
        reverseProtoWriter.writeBytes(getHoldingsHistoricalDataResponse.unknownFields());
        HoldingBalanceHistory.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getHoldingsHistoricalDataResponse.holding_histories);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetHoldingsHistoricalDataResponse getHoldingsHistoricalDataResponse = (GetHoldingsHistoricalDataResponse) obj;
        getHoldingsHistoricalDataResponse.getClass();
        return HoldingBalanceHistory.ADAPTER.asRepeated().encodedSizeWithTag(1, getHoldingsHistoricalDataResponse.holding_histories) + getHoldingsHistoricalDataResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetHoldingsHistoricalDataResponse getHoldingsHistoricalDataResponse = (GetHoldingsHistoricalDataResponse) obj;
        getHoldingsHistoricalDataResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getHoldingsHistoricalDataResponse.holding_histories, HoldingBalanceHistory.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetHoldingsHistoricalDataResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetHoldingsHistoricalDataResponse getHoldingsHistoricalDataResponse = (GetHoldingsHistoricalDataResponse) obj;
        getHoldingsHistoricalDataResponse.getClass();
        HoldingBalanceHistory.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getHoldingsHistoricalDataResponse.holding_histories);
        protoWriter.writeBytes(getHoldingsHistoricalDataResponse.unknownFields());
    }
}
