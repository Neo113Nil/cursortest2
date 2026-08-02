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

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/activity/api/v1/ActivitySearchRequest$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/activity/api/v1/ActivitySearchRequest;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivitySearchRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActivitySearchRequest((String) obj, m, (SearchSort) obj2, (SearchOffset) obj3, (Integer) obj4, (ActivityToken) obj5, (String) obj6, arrayList, (Boolean) obj7, arrayList2, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList.add(SearchFilter.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(SearchOffset.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(ActivityToken.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj2 = TransactorKt.decodeMessageOrMerge(SearchSort.ADAPTER, protoReader, obj2);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 8:
                    m.add(ActivitySearchFilterGroup.ADAPTER.decode(protoReader));
                    break;
                case 9:
                    arrayList2.add(Chip.ADAPTER.decode(protoReader));
                    break;
                case 10:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 11:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActivitySearchRequest activitySearchRequest = (ActivitySearchRequest) obj;
        reverseProtoWriter.getClass();
        activitySearchRequest.getClass();
        reverseProtoWriter.writeBytes(activitySearchRequest.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, activitySearchRequest.sum_amount);
        Chip.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, activitySearchRequest.ignore_chips);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, activitySearchRequest.allow_overlap);
        SearchFilter.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, activitySearchRequest.filters);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, activitySearchRequest.query_token);
        ActivityToken.ADAPTER.encodeWithTag(reverseProtoWriter, 5, activitySearchRequest.activity_token);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, activitySearchRequest.page_size);
        SearchOffset.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activitySearchRequest.search_offset);
        SearchSort.ADAPTER.encodeWithTag(reverseProtoWriter, 6, activitySearchRequest.sort);
        ActivitySearchFilterGroup.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, activitySearchRequest.filter_groups);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, activitySearchRequest.free_text_search);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActivitySearchRequest activitySearchRequest = (ActivitySearchRequest) obj;
        activitySearchRequest.getClass();
        int size$okio = activitySearchRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = SearchFilter.ADAPTER.asRepeated().encodedSizeWithTag(2, activitySearchRequest.filters) + protoAdapter.encodedSizeWithTag(11, activitySearchRequest.query_token) + ActivityToken.ADAPTER.encodedSizeWithTag(5, activitySearchRequest.activity_token) + ProtoAdapter.INT32.encodedSizeWithTag(4, activitySearchRequest.page_size) + SearchOffset.ADAPTER.encodedSizeWithTag(3, activitySearchRequest.search_offset) + SearchSort.ADAPTER.encodedSizeWithTag(6, activitySearchRequest.sort) + ActivitySearchFilterGroup.ADAPTER.asRepeated().encodedSizeWithTag(8, activitySearchRequest.filter_groups) + protoAdapter.encodedSizeWithTag(1, activitySearchRequest.free_text_search) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(10, activitySearchRequest.sum_amount) + Chip.ADAPTER.asRepeated().encodedSizeWithTag(9, activitySearchRequest.ignore_chips) + protoAdapter2.encodedSizeWithTag(7, activitySearchRequest.allow_overlap) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActivitySearchRequest activitySearchRequest = (ActivitySearchRequest) obj;
        activitySearchRequest.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(activitySearchRequest.filter_groups, ActivitySearchFilterGroup.ADAPTER);
        SearchSort searchSort = activitySearchRequest.sort;
        SearchSort searchSort2 = searchSort != null ? (SearchSort) SearchSort.ADAPTER.redact(searchSort) : null;
        SearchOffset searchOffset = activitySearchRequest.search_offset;
        SearchOffset searchOffset2 = searchOffset != null ? (SearchOffset) SearchOffset.ADAPTER.redact(searchOffset) : null;
        ActivityToken activityToken = activitySearchRequest.activity_token;
        ActivityToken activityToken2 = activityToken != null ? (ActivityToken) ActivityToken.ADAPTER.redact(activityToken) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(activitySearchRequest.filters, SearchFilter.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(activitySearchRequest.ignore_chips, Chip.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = activitySearchRequest.page_size;
        String str = activitySearchRequest.query_token;
        Boolean bool = activitySearchRequest.allow_overlap;
        Boolean bool2 = activitySearchRequest.sum_amount;
        byteString.getClass();
        return new ActivitySearchRequest(null, m1169redactElements, searchSort2, searchOffset2, num, activityToken2, str, m1169redactElements2, bool, m1169redactElements3, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActivitySearchRequest activitySearchRequest = (ActivitySearchRequest) obj;
        activitySearchRequest.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activitySearchRequest.free_text_search);
        ActivitySearchFilterGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, activitySearchRequest.filter_groups);
        SearchSort.ADAPTER.encodeWithTag(protoWriter, 6, activitySearchRequest.sort);
        SearchOffset.ADAPTER.encodeWithTag(protoWriter, 3, activitySearchRequest.search_offset);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, activitySearchRequest.page_size);
        ActivityToken.ADAPTER.encodeWithTag(protoWriter, 5, activitySearchRequest.activity_token);
        protoAdapter.encodeWithTag(protoWriter, 11, activitySearchRequest.query_token);
        SearchFilter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, activitySearchRequest.filters);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 7, activitySearchRequest.allow_overlap);
        Chip.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, activitySearchRequest.ignore_chips);
        protoAdapter2.encodeWithTag(protoWriter, 10, activitySearchRequest.sum_amount);
        protoWriter.writeBytes(activitySearchRequest.unknownFields());
    }
}
