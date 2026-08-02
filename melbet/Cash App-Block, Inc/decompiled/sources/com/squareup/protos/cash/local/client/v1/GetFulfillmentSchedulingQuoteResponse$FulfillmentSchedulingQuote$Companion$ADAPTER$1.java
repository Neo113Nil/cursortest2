package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote((LocalFulfillment.EstimatedCompletionTime) obj, (LocalFulfillment.EstimatedCompletionDuration) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalFulfillment.EstimatedCompletionTime.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalFulfillment.EstimatedCompletionDuration.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(SchedulingDay.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote = (GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote) obj;
        reverseProtoWriter.getClass();
        fulfillmentSchedulingQuote.getClass();
        reverseProtoWriter.writeBytes(fulfillmentSchedulingQuote.unknownFields());
        SchedulingDay.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, fulfillmentSchedulingQuote.scheduling_days);
        LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 2, fulfillmentSchedulingQuote.estimated_completion_duration);
        LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodeWithTag(reverseProtoWriter, 1, fulfillmentSchedulingQuote.estimated_completion_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote = (GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote) obj;
        fulfillmentSchedulingQuote.getClass();
        return SchedulingDay.ADAPTER.asRepeated().encodedSizeWithTag(3, fulfillmentSchedulingQuote.scheduling_days) + LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodedSizeWithTag(2, fulfillmentSchedulingQuote.estimated_completion_duration) + LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodedSizeWithTag(1, fulfillmentSchedulingQuote.estimated_completion_time) + fulfillmentSchedulingQuote.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote = (GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote) obj;
        fulfillmentSchedulingQuote.getClass();
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime = fulfillmentSchedulingQuote.estimated_completion_time;
        LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime2 = estimatedCompletionTime != null ? (LocalFulfillment.EstimatedCompletionTime) LocalFulfillment.EstimatedCompletionTime.ADAPTER.redact(estimatedCompletionTime) : null;
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration = fulfillmentSchedulingQuote.estimated_completion_duration;
        LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration2 = estimatedCompletionDuration != null ? (LocalFulfillment.EstimatedCompletionDuration) LocalFulfillment.EstimatedCompletionDuration.ADAPTER.redact(estimatedCompletionDuration) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(fulfillmentSchedulingQuote.scheduling_days, SchedulingDay.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote(estimatedCompletionTime2, estimatedCompletionDuration2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote fulfillmentSchedulingQuote = (GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote) obj;
        fulfillmentSchedulingQuote.getClass();
        LocalFulfillment.EstimatedCompletionTime.ADAPTER.encodeWithTag(protoWriter, 1, fulfillmentSchedulingQuote.estimated_completion_time);
        LocalFulfillment.EstimatedCompletionDuration.ADAPTER.encodeWithTag(protoWriter, 2, fulfillmentSchedulingQuote.estimated_completion_duration);
        SchedulingDay.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, fulfillmentSchedulingQuote.scheduling_days);
        protoWriter.writeBytes(fulfillmentSchedulingQuote.unknownFields());
    }
}
