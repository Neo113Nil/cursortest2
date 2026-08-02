package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.earnings.EarningsChartData;

/* loaded from: classes7.dex */
public final class GetEarningsChartResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEarningsChartResponse((EarningsChartData) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EarningsChartData.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEarningsChartResponse getEarningsChartResponse = (GetEarningsChartResponse) obj;
        reverseProtoWriter.getClass();
        getEarningsChartResponse.getClass();
        reverseProtoWriter.writeBytes(getEarningsChartResponse.unknownFields());
        EarningsChartData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getEarningsChartResponse.chart);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEarningsChartResponse getEarningsChartResponse = (GetEarningsChartResponse) obj;
        getEarningsChartResponse.getClass();
        return EarningsChartData.ADAPTER.encodedSizeWithTag(1, getEarningsChartResponse.chart) + getEarningsChartResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEarningsChartResponse getEarningsChartResponse = (GetEarningsChartResponse) obj;
        getEarningsChartResponse.getClass();
        EarningsChartData earningsChartData = getEarningsChartResponse.chart;
        EarningsChartData earningsChartData2 = earningsChartData != null ? (EarningsChartData) EarningsChartData.ADAPTER.redact(earningsChartData) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetEarningsChartResponse(earningsChartData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEarningsChartResponse getEarningsChartResponse = (GetEarningsChartResponse) obj;
        getEarningsChartResponse.getClass();
        EarningsChartData.ADAPTER.encodeWithTag(protoWriter, 1, getEarningsChartResponse.chart);
        protoWriter.writeBytes(getEarningsChartResponse.unknownFields());
    }
}
