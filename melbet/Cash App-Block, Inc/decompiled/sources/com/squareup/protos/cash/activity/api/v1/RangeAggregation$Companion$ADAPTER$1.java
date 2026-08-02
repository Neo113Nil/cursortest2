package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.activity.api.v1.RangeAggregation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/RangeAggregation$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/RangeAggregation;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RangeAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RangeAggregation((RangeAggregation.Field) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = RangeAggregation.Field.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(RangeAggregationRange.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(ActivitySearchAggregation.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RangeAggregation rangeAggregation = (RangeAggregation) obj;
        reverseProtoWriter.getClass();
        rangeAggregation.getClass();
        reverseProtoWriter.writeBytes(rangeAggregation.unknownFields());
        ActivitySearchAggregation.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, rangeAggregation.sub_aggregations);
        RangeAggregationRange.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, rangeAggregation.ranges);
        RangeAggregation.Field.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rangeAggregation.field);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RangeAggregation rangeAggregation = (RangeAggregation) obj;
        rangeAggregation.getClass();
        return ActivitySearchAggregation.ADAPTER.asRepeated().encodedSizeWithTag(3, rangeAggregation.sub_aggregations) + RangeAggregationRange.ADAPTER.asRepeated().encodedSizeWithTag(2, rangeAggregation.ranges) + RangeAggregation.Field.ADAPTER.encodedSizeWithTag(1, rangeAggregation.field) + rangeAggregation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RangeAggregation rangeAggregation = (RangeAggregation) obj;
        rangeAggregation.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(rangeAggregation.ranges, RangeAggregationRange.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(rangeAggregation.sub_aggregations, ActivitySearchAggregation.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        RangeAggregation.Field field = rangeAggregation.field;
        byteString.getClass();
        return new RangeAggregation(field, m1169redactElements, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RangeAggregation rangeAggregation = (RangeAggregation) obj;
        rangeAggregation.getClass();
        RangeAggregation.Field.ADAPTER.encodeWithTag(protoWriter, 1, rangeAggregation.field);
        RangeAggregationRange.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, rangeAggregation.ranges);
        ActivitySearchAggregation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rangeAggregation.sub_aggregations);
        protoWriter.writeBytes(rangeAggregation.unknownFields());
    }
}
