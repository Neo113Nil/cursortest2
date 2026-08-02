package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.earnings.EarningStreamsData;

/* loaded from: classes7.dex */
public final class GetEarningStreamsSummaryResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetEarningStreamsSummaryResponse(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EarningStreamsData.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetEarningStreamsSummaryResponse getEarningStreamsSummaryResponse = (GetEarningStreamsSummaryResponse) obj;
        reverseProtoWriter.getClass();
        getEarningStreamsSummaryResponse.getClass();
        reverseProtoWriter.writeBytes(getEarningStreamsSummaryResponse.unknownFields());
        EarningStreamsData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getEarningStreamsSummaryResponse.streams_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetEarningStreamsSummaryResponse getEarningStreamsSummaryResponse = (GetEarningStreamsSummaryResponse) obj;
        getEarningStreamsSummaryResponse.getClass();
        return EarningStreamsData.ADAPTER.asRepeated().encodedSizeWithTag(1, getEarningStreamsSummaryResponse.streams_data) + getEarningStreamsSummaryResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetEarningStreamsSummaryResponse getEarningStreamsSummaryResponse = (GetEarningStreamsSummaryResponse) obj;
        getEarningStreamsSummaryResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getEarningStreamsSummaryResponse.streams_data, EarningStreamsData.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetEarningStreamsSummaryResponse(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetEarningStreamsSummaryResponse getEarningStreamsSummaryResponse = (GetEarningStreamsSummaryResponse) obj;
        getEarningStreamsSummaryResponse.getClass();
        EarningStreamsData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getEarningStreamsSummaryResponse.streams_data);
        protoWriter.writeBytes(getEarningStreamsSummaryResponse.unknownFields());
    }
}
