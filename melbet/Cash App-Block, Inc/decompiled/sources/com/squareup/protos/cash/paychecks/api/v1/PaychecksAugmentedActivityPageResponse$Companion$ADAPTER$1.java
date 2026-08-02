package com.squareup.protos.cash.paychecks.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.ActivityPageResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import squareup.cash.paychecks.CalendarMonthPaychecksAggregation;

/* loaded from: classes7.dex */
public final class PaychecksAugmentedActivityPageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaychecksAugmentedActivityPageResponse((ActivityPageResponse) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ActivityPageResponse.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(CalendarMonthPaychecksAggregation.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) obj;
        reverseProtoWriter.getClass();
        paychecksAugmentedActivityPageResponse.getClass();
        reverseProtoWriter.writeBytes(paychecksAugmentedActivityPageResponse.unknownFields());
        CalendarMonthPaychecksAggregation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, paychecksAugmentedActivityPageResponse.monthly_aggregations);
        ActivityPageResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paychecksAugmentedActivityPageResponse.response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) obj;
        paychecksAugmentedActivityPageResponse.getClass();
        return CalendarMonthPaychecksAggregation.ADAPTER.asRepeated().encodedSizeWithTag(3, paychecksAugmentedActivityPageResponse.monthly_aggregations) + ActivityPageResponse.ADAPTER.encodedSizeWithTag(2, paychecksAugmentedActivityPageResponse.response) + paychecksAugmentedActivityPageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) obj;
        paychecksAugmentedActivityPageResponse.getClass();
        ActivityPageResponse activityPageResponse = paychecksAugmentedActivityPageResponse.response;
        ActivityPageResponse activityPageResponse2 = activityPageResponse != null ? (ActivityPageResponse) ActivityPageResponse.ADAPTER.redact(activityPageResponse) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paychecksAugmentedActivityPageResponse.monthly_aggregations, CalendarMonthPaychecksAggregation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaychecksAugmentedActivityPageResponse(activityPageResponse2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaychecksAugmentedActivityPageResponse paychecksAugmentedActivityPageResponse = (PaychecksAugmentedActivityPageResponse) obj;
        paychecksAugmentedActivityPageResponse.getClass();
        ActivityPageResponse.ADAPTER.encodeWithTag(protoWriter, 2, paychecksAugmentedActivityPageResponse.response);
        CalendarMonthPaychecksAggregation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, paychecksAugmentedActivityPageResponse.monthly_aggregations);
        protoWriter.writeBytes(paychecksAugmentedActivityPageResponse.unknownFields());
    }
}
