package com.squareup.protos.cash.activity.api.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchResponse(m, arrayList, (SearchOffset) obj, (ActivityCursor) obj2, (Boolean) obj3, arrayList2, arrayList3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(ActivityRow.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(SearchOffset.ADAPTER, protoReader, obj);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    arrayList2.add(Chip.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    arrayList3.add(ActivitySearchFilterGroup.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    arrayList.add(ActivitySearchAggregationResult.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(ActivityCursor.ADAPTER, protoReader, obj2);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchResponse activitySearchResponse = (ActivitySearchResponse) obj;
        reverseProtoWriter.getClass();
        activitySearchResponse.getClass();
        reverseProtoWriter.writeBytes(activitySearchResponse.unknownFields());
        ActivitySearchFilterGroup.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, activitySearchResponse.applied_filter_groups);
        Chip.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, activitySearchResponse.chips);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, activitySearchResponse.has_more);
        ActivityCursor.ADAPTER.encodeWithTag(reverseProtoWriter, 7, activitySearchResponse.cursor);
        SearchOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 2, activitySearchResponse.search_offset);
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, activitySearchResponse.aggregation_results);
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, activitySearchResponse.activity_rows);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySearchResponse activitySearchResponse = (ActivitySearchResponse) obj;
        activitySearchResponse.getClass();
        return ActivitySearchFilterGroup.ADAPTER.asRepeated().encodedSizeWithTag(5, activitySearchResponse.applied_filter_groups) + Chip.ADAPTER.asRepeated().encodedSizeWithTag(4, activitySearchResponse.chips) + ProtoAdapter.BOOL.encodedSizeWithTag(3, activitySearchResponse.has_more) + ActivityCursor.ADAPTER.encodedSizeWithTag(7, activitySearchResponse.cursor) + SearchOffset.ADAPTER.encodedSizeWithTag(2, activitySearchResponse.search_offset) + ActivitySearchAggregationResult.ADAPTER.asRepeated().encodedSizeWithTag(6, activitySearchResponse.aggregation_results) + ActivityRow.ADAPTER.asRepeated().encodedSizeWithTag(1, activitySearchResponse.activity_rows) + activitySearchResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchResponse activitySearchResponse = (ActivitySearchResponse) obj;
        activitySearchResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activitySearchResponse.activity_rows, ActivityRow.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(activitySearchResponse.aggregation_results, ActivitySearchAggregationResult.ADAPTER);
        SearchOffset searchOffset = activitySearchResponse.search_offset;
        SearchOffset searchOffset2 = searchOffset != null ? (SearchOffset) SearchOffset.ADAPTER.redact(searchOffset) : null;
        ActivityCursor activityCursor = activitySearchResponse.cursor;
        ActivityCursor activityCursor2 = activityCursor != null ? (ActivityCursor) ActivityCursor.ADAPTER.redact(activityCursor) : null;
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(activitySearchResponse.chips, Chip.ADAPTER);
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(activitySearchResponse.applied_filter_groups, ActivitySearchFilterGroup.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = activitySearchResponse.has_more;
        byteString.getClass();
        return new ActivitySearchResponse(m1169redactElements, m1169redactElements2, searchOffset2, activityCursor2, bool, m1169redactElements3, m1169redactElements4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchResponse activitySearchResponse = (ActivitySearchResponse) obj;
        activitySearchResponse.getClass();
        ActivityRow.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, activitySearchResponse.activity_rows);
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, activitySearchResponse.aggregation_results);
        SearchOffset.ADAPTER.encodeWithTag(protoWriter, 2, activitySearchResponse.search_offset);
        ActivityCursor.ADAPTER.encodeWithTag(protoWriter, 7, activitySearchResponse.cursor);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, activitySearchResponse.has_more);
        Chip.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, activitySearchResponse.chips);
        ActivitySearchFilterGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, activitySearchResponse.applied_filter_groups);
        protoWriter.writeBytes(activitySearchResponse.unknownFields());
    }
}
