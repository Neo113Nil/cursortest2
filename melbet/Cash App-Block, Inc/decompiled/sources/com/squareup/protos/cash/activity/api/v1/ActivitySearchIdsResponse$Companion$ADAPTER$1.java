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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchIdsResponse$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchIdsResponse;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchIdsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchIdsResponse(m, arrayList, (SearchOffset) obj, (ActivityCursor) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ActivityItemGlobalId.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(ActivitySearchAggregationResult.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(SearchOffset.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ActivityCursor.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchIdsResponse activitySearchIdsResponse = (ActivitySearchIdsResponse) obj;
        reverseProtoWriter.getClass();
        activitySearchIdsResponse.getClass();
        reverseProtoWriter.writeBytes(activitySearchIdsResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, activitySearchIdsResponse.has_more);
        ActivityCursor.ADAPTER.encodeWithTag(reverseProtoWriter, 5, activitySearchIdsResponse.cursor);
        SearchOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activitySearchIdsResponse.search_offset);
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, activitySearchIdsResponse.aggregation_results);
        ActivityItemGlobalId.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, activitySearchIdsResponse.activity_item_global_ids);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySearchIdsResponse activitySearchIdsResponse = (ActivitySearchIdsResponse) obj;
        activitySearchIdsResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, activitySearchIdsResponse.has_more) + ActivityCursor.ADAPTER.encodedSizeWithTag(5, activitySearchIdsResponse.cursor) + SearchOffset.ADAPTER.encodedSizeWithTag(3, activitySearchIdsResponse.search_offset) + ActivitySearchAggregationResult.ADAPTER.asRepeated().encodedSizeWithTag(2, activitySearchIdsResponse.aggregation_results) + ActivityItemGlobalId.ADAPTER.asRepeated().encodedSizeWithTag(1, activitySearchIdsResponse.activity_item_global_ids) + activitySearchIdsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchIdsResponse activitySearchIdsResponse = (ActivitySearchIdsResponse) obj;
        activitySearchIdsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activitySearchIdsResponse.activity_item_global_ids, ActivityItemGlobalId.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(activitySearchIdsResponse.aggregation_results, ActivitySearchAggregationResult.ADAPTER);
        SearchOffset searchOffset = activitySearchIdsResponse.search_offset;
        SearchOffset searchOffset2 = searchOffset != null ? (SearchOffset) SearchOffset.ADAPTER.redact(searchOffset) : null;
        ActivityCursor activityCursor = activitySearchIdsResponse.cursor;
        ActivityCursor activityCursor2 = activityCursor != null ? (ActivityCursor) ActivityCursor.ADAPTER.redact(activityCursor) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = activitySearchIdsResponse.has_more;
        byteString.getClass();
        return new ActivitySearchIdsResponse(m1169redactElements, m1169redactElements2, searchOffset2, activityCursor2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchIdsResponse activitySearchIdsResponse = (ActivitySearchIdsResponse) obj;
        activitySearchIdsResponse.getClass();
        ActivityItemGlobalId.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, activitySearchIdsResponse.activity_item_global_ids);
        ActivitySearchAggregationResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, activitySearchIdsResponse.aggregation_results);
        SearchOffset.ADAPTER.encodeWithTag(protoWriter, 3, activitySearchIdsResponse.search_offset);
        ActivityCursor.ADAPTER.encodeWithTag(protoWriter, 5, activitySearchIdsResponse.cursor);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, activitySearchIdsResponse.has_more);
        protoWriter.writeBytes(activitySearchIdsResponse.unknownFields());
    }
}
